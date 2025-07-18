package fastcampus.aos.part3.part3_chapter6.model

import java.io.Serializable

interface ListItem : Serializable {
    val viewType: ViewType

    fun getKey() = hashCode()
}

enum class ViewType {
    VIEW_PAGER,
    HORIZONTAL,
    FULL_AD,

    SELL_ITEM,
    IMAGE,
    SALE,
    COUPON,

    EMPTY
}