package com.example.moreira_natalia_examen3t.ViewModel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moreira_natalia_examen3t.Model.DiscoModel
import com.example.moreira_natalia_examen3t.Model.DiscoProvider

class DiscoViewModel : ViewModel() {

    val listaDiscos = MutableLiveData<MutableList<DiscoModel>>()

}
