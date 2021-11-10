package com.example.projetoestudo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterItem(val listaItem: ArrayList<Livro>,val context: Context): RecyclerView.Adapter<AdapterItem.itemViewHolder>(){


//    como a classe ItemViewHolder é interna do adapter, coloca ela como inner class,
//    assim ninguem instancia ela de outro lugar (Lembra de sempre iniciar nome de classe
//    com letra maiscula
    class itemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val titulo = view.findViewById(R.id.txtTitulo) as TextView
        val data = view.findViewById(R.id.txt_data_publicacao) as TextView
        val autor = view.findViewById(R.id.txt_autor) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        //parent?.context... varifica se o contexto esta null
        //não precisa verificar se o contexto esta nulo, context nesse caso é non null
        val viewLayoutInfla = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_item,parent,false)
        return itemViewHolder(viewLayoutInfla)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        //não precisa do modificador ? pois as varivaies são non null
        holder.titulo?.text = listaItem[position].titulo
        holder.data?.text = listaItem[position].dataPublicacao
        holder.autor?.text = listaItem[position].autor
    }

    override fun getItemCount(): Int = listaItem.size
}