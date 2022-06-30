package com.info.upschoolcapstone1



import com.google.gson.annotations.SerializedName


data class Product (

    @SerializedName("id")
    var productId: Int,

    @SerializedName("user")
    var user: String,

    @SerializedName("title")
    var productName: String,

    @SerializedName("price")
    var price: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("category")
    var category: String,

    @SerializedName("image")
    var image: String,

    @SerializedName("rate")
    var rate: String,

    @SerializedName("count")
    var count: Int,

    @SerializedName("saleState")
    var saleState: Int

)
