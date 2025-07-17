package fastcampus.aos.part3.part3_chapter6.model

class Empty : ListItem {
    override val viewType: ViewType
        get() = ViewType.EMPTY
}