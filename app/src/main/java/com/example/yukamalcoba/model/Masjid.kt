package com.example.yukamalcoba.model

import com.google.gson.annotations.SerializedName

data class Masjid(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("type")
    val type: Int?,
    @SerializedName("code")
    val code: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("identity")
    val identity: String?,
    @SerializedName("surface_area")
    val surface_area: Double?,
    @SerializedName("building_area")
    val building_area: Double?,
    @SerializedName("los")
    val los: String?,
    @SerializedName("since")
    val since: Int?,
    @SerializedName("bank_id")
    val bank_id: Int?,
    @SerializedName("rek")
    val rek: Int?,
    @SerializedName("address")
    val address: String?,
    @SerializedName("latitude")
    val latitude: Double?,
    @SerializedName("longitude")
    val longitude: Double?,
    @SerializedName("province_id")
    val province_id: Int?,
    @SerializedName("estimate")
    val estimate: Int?,
    @SerializedName("estimate_date")
    val estimate_date: String?,
    @SerializedName("city_id")
    val city_id: Int?,
    @SerializedName("kec_id")
    val kec_id: Int?,
    @SerializedName("kel_id")
    val kel_id: Int?,
    @SerializedName("pic")
    val pic: String?,
    @SerializedName("description")
    val description: String?
)