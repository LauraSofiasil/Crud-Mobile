package br.senai.sp.jandira.clientesapp.service

import br.senai.sp.jandira.clientesapp.model.Cliente
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ClienteService {

    @POST("clientes") //diz para o retrofit que a função abaixo é um post
    fun cadastrarCliente(@Body cliente: Cliente): Call<Cliente>

    @GET("clientes")
    fun listarTodos(): Call<List<Cliente>>

    @GET("clientes/{id}")
    fun buscarPorId(@Path("id") id: Long): Call<Cliente>

}