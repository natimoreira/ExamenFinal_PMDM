package com.example.moreira_natalia_examen3t.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moreira_natalia_examen3t.ViewModel.DiscoAdapter
import com.example.moreira_natalia_examen3t.Model.DiscoProvider
import com.example.moreira_natalia_examen3t.R
import com.example.moreira_natalia_examen3t.ViewModel.DiscoViewModel
import com.example.moreira_natalia_examen3t.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val discoViewModel : DiscoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Añadimos lo siguiente para cargar el recycler y llamar nuestro layout y adapter
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerId)
        recyclerView?.layoutManager = LinearLayoutManager(context)
        recyclerView?.adapter = DiscoAdapter(DiscoProvider.listaDisco)
        actualizaInfo()
    }

    // método que llama a un observador para que actualice la info
    fun actualizaInfo(){
        discoViewModel.listaDiscos.observe(viewLifecycleOwner, Observer {
            val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerId)
            recyclerView?.layoutManager = LinearLayoutManager(context)
            recyclerView?.adapter = DiscoAdapter(DiscoProvider.listaDisco)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}