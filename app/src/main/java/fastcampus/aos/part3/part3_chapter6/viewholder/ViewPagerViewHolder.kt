package fastcampus.aos.part3.part3_chapter6.viewholder

import fastcampus.aos.part3.part3_chapter6.ListAdapter
import fastcampus.aos.part3.part3_chapter6.databinding.ItemViewpagerBinding
import fastcampus.aos.part3.part3_chapter6.model.ListItem
import fastcampus.aos.part3.part3_chapter6.model.ViewPager

class ViewPagerViewHolder(
    binding: ItemViewpagerBinding
) : BindingViewHolder<ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewpager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }
}