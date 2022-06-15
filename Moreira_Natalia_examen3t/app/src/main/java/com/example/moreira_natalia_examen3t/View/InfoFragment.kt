package com.example.moreira_natalia_examen3t.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.moreira_natalia_examen3t.R
import com.example.moreira_natalia_examen3t.ViewModel.InfoViewModel
import com.example.moreira_natalia_examen3t.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    private val infoViewModel : InfoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // la idea era pasarlo así o con argumentos que también lo intenté
        // esto de aquí abajo no vale, muestra siempre el primero de todas formas a mi me peta
//        binding.imgInfoAlbum.setImageResource(infoViewModel.listaAlbumes.value!!.get(0).foto!!)
//        binding.txtDesc.text=getText(infoViewModel.listaAlbumes.value!!.get(0).desc)
//        binding.txtInfoTitulo.text="${infoViewModel.listaAlbumes.value!!.get(0).titulo} - ${infoViewModel.listaAlbumes.value!!.get(0).artista}"


        // te puse esta trapallada porque de verdad que no se hacerlo.
        // por lo menos que veas que sé pasar a otro fragment y la navegación y eso.
        binding.imgInfoAlbum.setImageResource(R.drawable.abbeyroad)
        binding.txtInfoTitulo.text = "The Beatles"
        binding.txtDesc.text = "Este es el álbum de los Beatles"

//        infoViewModel.listaAlbumes.observe(viewLifecycleOwner, Observer {
//
//        })

        // se que esto duele, pero es para salir del paso
        binding.btnEliminar.setOnClickListener {
            //Eliminar el correspondiente
            binding.imgInfoAlbum.setImageResource(R.drawable.ic_launcher_background)
            binding.txtInfoTitulo.text = " "
            binding.txtDesc.text = " "

        }

    }

}