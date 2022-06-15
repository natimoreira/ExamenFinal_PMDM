package com.example.moreira_natalia_examen3t.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moreira_natalia_examen3t.Model.DiscoModel

class InfoViewModel : ViewModel() {
    val listaAlbumes = MutableLiveData<MutableList<DiscoModel>>()
}