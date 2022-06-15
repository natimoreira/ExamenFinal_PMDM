package com.example.moreira_natalia_examen3t.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.moreira_natalia_examen3t.Model.DiscoProvider.Companion.listaBlues
import com.example.moreira_natalia_examen3t.Model.DiscoProvider.Companion.listaDisco
import com.example.moreira_natalia_examen3t.Model.DiscoProvider.Companion.listaJazz
import com.example.moreira_natalia_examen3t.Model.DiscoProvider.Companion.listaRock
import com.example.moreira_natalia_examen3t.Model.SpinnerProvider.Companion.listaEstilos
import com.example.moreira_natalia_examen3t.R
import com.example.moreira_natalia_examen3t.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnIr.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        //llamamos las funciones de abajo
        cargarSpinner()
        funcionSpinner()
    }

    // función para cargar el spinner con la lista de géneros que creamos en SpinnerProvider
    fun cargarSpinner(){
        binding.spinnerId.adapter = ArrayAdapter<String>(
            requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            listaEstilos
        )
        // esto es para que pare el spinner y no se quede pillado en el segundo fragment
        binding.spinnerId.setSelection(0, false)
    }

    // función para agregar funcionalidades al spinner
    fun funcionSpinner(){
        binding.spinnerId.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                selectGenero()
                botonIr()
            }

            // esto no sabemos que hace pero se deja vacío
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    // método para hacer visible el botón de ir cuando seleccionamos el género
    private fun selectGenero() {
        when (binding.spinnerId.selectedItemPosition) {
            0 -> binding.btnIr.setVisibility(View.INVISIBLE)
            1 -> binding.btnIr.setVisibility(View.VISIBLE)
            2 -> binding.btnIr.setVisibility(View.VISIBLE)
            3 -> binding.btnIr.setVisibility(View.VISIBLE)
            else -> throw Exception("No existe")
        }
    }

    // método que muestra los discos del género que seleccionamos
    private fun botonIr(){
        binding.btnIr.setOnClickListener {
            when (binding.spinnerId.selectedItemPosition) {
                1 -> listaDisco = listaRock
                2 -> listaDisco = listaBlues
                3 -> listaDisco = listaJazz
                else -> throw Exception("El género no existe")
            }
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}