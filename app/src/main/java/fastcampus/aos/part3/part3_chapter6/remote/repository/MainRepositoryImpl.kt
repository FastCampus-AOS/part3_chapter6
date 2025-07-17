package fastcampus.aos.part3.part3_chapter6.remote.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import fastcampus.aos.part3.part3_chapter6.remote.MainService
import fastcampus.aos.part3.part3_chapter6.model.ListItem
import fastcampus.aos.part3.part3_chapter6.remote.MainPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainService: MainService
) : MainRepository {
    override fun loadList(): Flow<PagingData<ListItem>> = Pager(
        config = PagingConfig(
            pageSize = 20,
            enablePlaceholders = false
        ),
        pagingSourceFactory = {
            MainPagingSource(mainService)
        }
    ).flow
}