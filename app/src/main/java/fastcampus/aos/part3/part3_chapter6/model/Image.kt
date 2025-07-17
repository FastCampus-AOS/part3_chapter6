package fastcampus.aos.part3.part3_chapter6.model

data class Image(
    val imageUrl: String
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.IMAGE
}
