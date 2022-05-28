package com.example.moreira_natalia_examen3t.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moreira_natalia_examen3t.ViewModel.DiscoAdapter
import com.example.moreira_natalia_examen3t.Model.DiscoProvider
import com.example.moreira_natalia_examen3t.R
import com.example.moreira_natalia_examen3t.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonSecond.setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }

        // Añadimos lo siguiente para llamar nuestro layout y adapter
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerId)
        recyclerView?.layoutManager = LinearLayoutManager(context)
        recyclerView?.adapter = DiscoAdapter(DiscoProvider.listaDisco)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}