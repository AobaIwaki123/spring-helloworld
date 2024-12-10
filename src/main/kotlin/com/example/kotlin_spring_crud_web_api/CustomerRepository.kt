package com.example.kotlin_spring_crud_web_api

interface CustomerRepository {
    /**
    * Customer テーブルにデータを挿入するメソッド
    *
    * @param firstName
    * @param lastName
    * */
    fun add(firstName: String, lastName: String)

    /**
     * Customer テーブルのカラムを更新するメソッド
     *
     * @param id
     * @param firstName
     * @param lastName
     */
    fun update(id: Int, firstName: String, lastName: String)

    /**
     * Customer テーブルのカラムを単一削除するメソッド
     *
     * @param id
     */
    fun delete(id: Int)
}


