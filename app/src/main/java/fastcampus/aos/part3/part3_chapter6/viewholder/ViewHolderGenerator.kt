package fastcampus.aos.part3.part3_chapter6.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import fastcampus.aos.part3.part3_chapter6.databinding.ItemEmptyBinding
import fastcampus.aos.part3.part3_chapter6.model.ViewType

object ViewHolderGenerator {

    fun get(
        parent: ViewGroup,
        viewType: Int
    ): BindingViewHolder<*> {
        return when (viewType) {
            ViewType.VIEW_PAGER.ordinal -> ViewPagerViewHolder(parent.toBinding())
            ViewType.HORIZONTAL.ordinal -> ViewPagerViewHolder(parent.toBinding())
            ViewType.FULL_AD.ordinal -> ViewPagerViewHolder(parent.toBinding())
            else -> ItemViewHolder(parent.toBinding()) // EMPTY
        }
    }

    class ItemViewHolder(binding: ItemEmptyBinding) : BindingViewHolder<ItemEmptyBinding>(binding)

    private inline fun <reified V : ViewBinding> ViewGroup.toBinding(): V {
        return V::class.java.getMethod(
            "inflate",
            LayoutInflater::class.java,
            ViewGroup::class.java,
            Boolean::class.java
        ).invoke(null, LayoutInflater.from(context), this, false) as V
    }
}