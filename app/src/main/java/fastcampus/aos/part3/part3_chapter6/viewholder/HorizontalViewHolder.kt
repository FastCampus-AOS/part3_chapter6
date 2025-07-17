package fastcampus.aos.part3.part3_chapter6.viewholder

import fastcampus.aos.part3.part3_chapter6.ListAdapter
import fastcampus.aos.part3.part3_chapter6.databinding.ItemHorizontalBinding
import fastcampus.aos.part3.part3_chapter6.model.Horizontal
import fastcampus.aos.part3.part3_chapter6.model.ListItem

class HorizontalViewHolder(
    private val binding: ItemHorizontalBinding
) : BindingViewHolder<ItemHorizontalBinding>(binding) {
    private val adapter = ListAdapter()

    init {
        binding.listView.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as Horizontal
        binding.titleTextView.text = item.title
        adapter.submitList(item.items)
    }
}