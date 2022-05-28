package com.example.moreira_natalia_examen3t.ViewModel

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moreira_natalia_examen3t.Model.DiscoModel
import com.example.moreira_natalia_examen3t.R
import com.example.moreira_natalia_examen3t.databinding.DiscoBinding


class DiscoAdapter (private val listaDiscoModel: MutableList<DiscoModel>): RecyclerView.Adapter<DiscoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DiscoViewHolder(layoutInflater.inflate(R.layout.disco, parent, false))
    }

    override fun onBindViewHolder(holder: DiscoViewHolder, position: Int) {
        val item = listaDiscoModel[position]
        holder.render(item)

        // esto es para cambiar el color del fondo de cada caja de información del disco
//        with(holder){
//            if(position % 2 == 0){
//                binding.fondo.setBackgroundColor(Color.CYAN)
//            }else{
//                binding.fondo.setBackgroundColor(Color.BLUE)
//            }
//        }

        // botón eliminar
//        holder.binding.btnEliminar.setOnClickListener {
//            listaDiscoModel.removeAt(position)
//            // notificamos la eliminación del elemento
//            notifyItemRemoved(position)
//            notifyItemRangeChanged(position, listaDiscoModel.size)
//        }
    }

    override fun getItemCount(): Int = listaDiscoModel.size
}
