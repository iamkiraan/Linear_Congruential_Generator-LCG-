package com.example.linear_congruential_generator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //defining the formula for LCG
        /*we have formula Z = (aZ0+c)%m
        where
        Z0= any initial value between 0 t0 m-1
        a = multiplicative factor
        c = Incremental factor
        m = modulus value which is given by maximum capacity of random number generator
         Random number on U(0,1) is given by Ui = Zi/m
        */



    }
}