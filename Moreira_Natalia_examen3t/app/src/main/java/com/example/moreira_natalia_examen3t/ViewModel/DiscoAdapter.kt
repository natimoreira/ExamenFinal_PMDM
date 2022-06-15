package com.example.moreira_natalia_examen3t.ViewModel

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moreira_natalia_examen3t.Model.DiscoModel
import com.example.moreira_natalia_examen3t.Model.DiscoProvider.Companion.listaDisco
import com.example.moreira_natalia_examen3t.R
import com.example.moreira_natalia_examen3t.databinding.DiscoBinding

/* Adaptador Disco */
class DiscoAdapter (private val listaDisco: MutableList<DiscoModel>): RecyclerView.Adapter<DiscoViewHolder>(){
// Esto no se muy bien que hace, lo vi en un tutorial que coge los datos y luego los adapta con el adapter y el viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DiscoViewHolder(layoutInflater.inflate(R.layout.disco, parent, false))
    }

    override fun onBindViewHolder(holder: DiscoViewHolder, position: Int) {
        val item = listaDisco[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listaDisco.size
}
