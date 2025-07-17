package fastcampus.aos.part3.part3_chapter6.model

data class ViewPager(
    val items: List<ListItem>
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.VIEW_PAGER
}