package com.idelbrando.projetobaseatividadet1_2019_eca804

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    //Cria uma função que muda de tela //val é para variável constante

    fun mudaDeTela(view : View) {

        val usuario = ""
        val senha = 0

        if (editTextUsuario.text.toString() == "admin" ){
            if(editTextSenha.text.toString() == "admin"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Usuário e/ou senha incorreta", Toast.LENGTH_SHORT)
                    .show()
                true
            }
        }else{
            Toast.makeText(applicationContext, "Usuário e/ou senha incorreta", Toast.LENGTH_SHORT)
                .show()
            true
        }
    }
}
