package br.senai.sp.jandira.clientesapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Conexao {

    private val base_URL = "https://srv945707.hstgr.cloud/api/"

    private val conexao = Retrofit
        .Builder()
        .baseUrl(base_URL)
        .addConverterFactory(GsonConverterFactory.create()) //convertendo o json para kotlin
        .build() //conecta

    fun getClienteService(): ClienteService{
        return conexao.create(ClienteService::class.java)
    }
}