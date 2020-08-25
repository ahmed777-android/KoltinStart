package com.example.koltinstart.data

import com.example.koltinstart.data.Monster
import retrofit2.Response
import retrofit2.http.GET

interface MonsterService {
    @GET("/feed/monster_data.json")
    suspend fun getMonsterData(): Response<List<Monster>>
}