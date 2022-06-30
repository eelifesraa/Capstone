package com.info.upschoolcapstone1

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CRUDResponse (@SerializedName("success")
                    @Expose
                    var success:Int,
                    @SerializedName("message")
                    @Expose
                    var message:String) {
}