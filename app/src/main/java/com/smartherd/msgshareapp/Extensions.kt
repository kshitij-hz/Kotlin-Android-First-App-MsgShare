package com.smartherd.msgshareapp

import android.app.Activity
import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, message, duration).show()
}

//fun URL.getText(): String {
//    return openConnection().run {
//        this as HttpURLConnection
//        inputStream.bufferedReader().readText()
//    }
//}