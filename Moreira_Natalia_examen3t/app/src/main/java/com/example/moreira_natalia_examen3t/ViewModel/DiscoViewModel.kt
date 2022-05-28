package com.example.moreira_natalia_examen3t.ViewModel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moreira_natalia_examen3t.Model.DiscoModel
import com.example.moreira_natalia_examen3t.Model.DiscoProvider

class DiscoViewModel(val dataSource: DiscoProvider) : ViewModel() {

    val listaDiscos = MutableLiveData<MutableList<DiscoModel>>()

//    fun getDiscoFromId(id: Long): DiscoModel?{
//        return dataSource.getDiscoFromId(id)
//    }

}

class DiscoViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DiscoViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return DiscoViewModel(
                dataSource = DiscoProvider.getDataSource(context.resources)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}