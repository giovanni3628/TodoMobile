package com.example.todomobile.api

import com.example.todomobile.model.Categoria
import com.example.todomobile.model.Tarefa
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

    suspend fun addTarefa(tarefa: Tarefa): Response<Tarefa>{

        return RetrofitInstance.api.addTarefa(tarefa)
    }
}