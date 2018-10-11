package com.kotlin.menu2.menu2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResultado.setText("")
    }

    fun ordenarMenu(view: View){

        var resultado = ""
        when{
            rbOrderGroup.rbPlato1.isChecked -> resultado =
                    rbOrderGroup.rbPlato1.text.toString()

            rbOrderGroup.rbPlato2.isChecked -> resultado =
                    rbOrderGroup.rbPlato2.text.toString()

            rbOrderGroup.rbPlato3.isChecked -> resultado =
                    rbOrderGroup.rbPlato3.text.toString()
            else -> resultado = "Seleccione uno"
        }

        txtResultado.setText(resultado)
    }
}
