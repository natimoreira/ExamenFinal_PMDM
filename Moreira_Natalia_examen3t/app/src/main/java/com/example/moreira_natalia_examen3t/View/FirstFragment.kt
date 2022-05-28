package com.example.moreira_natalia_examen3t.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
                // hacemos visible el botón de ir (perdón por este código pero no se como se escribe aquí)
                val valorSpinner = binding.spinnerId.selectedItem
                if (valorSpinner == "Rock") {
                    binding.btnIr.setVisibility(View.VISIBLE)
                }else if(valorSpinner == "Blues"){
                    binding.btnIr.setVisibility(View.VISIBLE)
                }else if(valorSpinner == "Jazz"){
                    binding.btnIr.setVisibility(View.VISIBLE)
                }else if(valorSpinner == "Varios"){
                    binding.btnIr.setVisibility(View.VISIBLE)
                }else{
                    binding.btnIr.setVisibility(View.GONE)
                }

            }
            // esto no sabemos que hace pero se deja vacío
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}