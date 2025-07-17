package fastcampus.aos.part3.part3_chapter6.remote

import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import fastcampus.aos.part3.part3_chapter6.model.Coupon
import fastcampus.aos.part3.part3_chapter6.model.Empty
import fastcampus.aos.part3.part3_chapter6.model.FullAd
import fastcampus.aos.part3.part3_chapter6.model.Horizontal
import fastcampus.aos.part3.part3_chapter6.model.Image
import fastcampus.aos.part3.part3_chapter6.model.ViewPager
import fastcampus.aos.part3.part3_chapter6.model.ListItem
import fastcampus.aos.part3.part3_chapter6.model.Sale
import fastcampus.aos.part3.part3_chapter6.model.SellItem
import fastcampus.aos.part3.part3_chapter6.model.ViewType
import java.lang.Exception
import java.lang.reflect.Type

class ListItemDeserializer: JsonDeserializer<ListItem> {

    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): ListItem? {

        val viewTypeName = json.asJsonObject.getAsJsonPrimitive("viewType").asString
        val gson = GsonBuilder()
            .registerTypeAdapter(ListItem::class.java, ListItemDeserializer())
            .create()

        return try {
            when (viewTypeName) {
                ViewType.VIEW_PAGER.name -> gson.fromJson(json, ViewPager::class.java)
                ViewType.HORIZONTAL.name -> gson.fromJson(json, Horizontal::class.java)
                ViewType.FULL_AD.name -> gson.fromJson(json, FullAd::class.java)

                ViewType.COUPON.name -> gson.fromJson(json, Coupon::class.java)
                ViewType.IMAGE.name -> gson.fromJson(json, Image::class.java)
                ViewType.SELL_ITEM.name -> gson.fromJson(json, SellItem::class.java)
                ViewType.SALE.name -> gson.fromJson(json, Sale::class.java)

                else -> gson.fromJson(json, Empty::class.java)
            }
        } catch (e: Exception) {
            gson.fromJson(json, Empty::class.java)
        }
    }
}