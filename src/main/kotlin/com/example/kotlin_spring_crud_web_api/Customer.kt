package com.example.kotlin_spring_crud_web_api

/*
* Web APIで利用するデータモデル
*
* RepositoryによるDBとのやりとり、Serviceを介したデータの受け渡し、Controllerのレスポンスに利用する。
*
* @property id カスタマーID
* @property firstName 名前
* @property lastName 名字
* */
data class Customer(
    val id: Long,
    val firstNam: String,
    val lastName: String,
)
