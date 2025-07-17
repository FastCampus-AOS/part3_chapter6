package fastcampus.aos.part3.part3_chapter6.model

data class FullAd(
    val title: String,
    val imageUrl: String,
    val button: String? = null
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.FULL_AD
}
