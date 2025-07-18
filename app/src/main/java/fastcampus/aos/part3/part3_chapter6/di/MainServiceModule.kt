package fastcampus.aos.part3.part3_chapter6.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fastcampus.aos.part3.part3_chapter6.remote.MainService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainServiceModule {

    @Provides
    @Singleton
    fun providesMainService(retrofit: Retrofit): MainService = retrofit.create(MainService::class.java)
}