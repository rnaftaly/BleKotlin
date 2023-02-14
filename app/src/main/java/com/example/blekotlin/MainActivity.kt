package com.example.blekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flowOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    startService(Intent(this,MyService::class.java))

        var text:TextView = findViewById<TextView>(R.id.text_test)



        for ( i in 0 until 100) {

            text.append(i.toString())
            text.append(" ")
        }
        var def  = CoroutineScope(Dispatchers.IO).async {

            def()
        }
        var job = CoroutineScope(Dispatchers.Main).launch {

         //   text.text= def.await().toString()
        }

        var x :Int = 2
        var y :Int = 1

        rafael(10)



//         text.text=def.getCompleted()

    }


    fun rafael(raf:Int=0){


    }

    fun def():Int{

        return 0
    }

    object test : D() {}


    open class D {

        fun rafaelTest(){

        }

    }

}