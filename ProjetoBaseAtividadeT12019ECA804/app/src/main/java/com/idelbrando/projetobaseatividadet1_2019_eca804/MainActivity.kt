package com.idelbrando.projetobaseatividadet1_2019_eca804

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando o adapter
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        //Ligando o adapter ao listView
        listView.adapter = adapter


        //Configurando o evento de onClick no botão
        btnAdd.setOnClickListener{
            if(editTextNomeProduto.text.isEmpty()){
                editTextNomeProduto.error = "Por favor, insira um nome"
            }else if(editTextQuantProd.text.isEmpty()){
                editTextQuantProd.error = "Por favor, insira a quantidade"
            } else {
                val produto = editTextNomeProduto.text.toString()
                val quantidade = editTextQuantProd.text.toString()

                val conc = "${produto} - ${quantidade}"
                adapter.add(conc)
                editTextNomeProduto.text.clear()
                editTextQuantProd.text.clear()
            }

        }

        //Configura evento de toque do listView
        listView.setOnItemClickListener { parent, view, position, id ->
            val item = adapter.getItem(position)
            Toast.makeText(applicationContext, "Você selecionou ${item}", Toast.LENGTH_SHORT)
                .show()
            true
        }

        //Configura o evento de long click
        listView.setOnItemLongClickListener { parent, view, position, id ->
            val item = adapter.getItem(position)
            adapter.remove(item)
            true
        }
    }


}
