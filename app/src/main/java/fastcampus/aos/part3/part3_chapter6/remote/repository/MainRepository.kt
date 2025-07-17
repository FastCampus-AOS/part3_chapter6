package fastcampus.aos.part3.part3_chapter6.remote.repository

import androidx.paging.PagingData
import fastcampus.aos.part3.part3_chapter6.model.ListItem
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun loadList(): Flow<PagingData<ListItem>>
}