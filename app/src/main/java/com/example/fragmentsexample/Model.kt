package com.example.fragmentsexample

import androidx.lifecycle.ViewModel

class Model:ViewModel() {
    var counter:Int=0
    fun increment(){
        counter++
    }
}