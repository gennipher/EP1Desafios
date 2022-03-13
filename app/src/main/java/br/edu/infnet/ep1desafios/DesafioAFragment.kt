package br.edu.infnet.ep1desafios

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.io.File

class DesafioAFragment : Fragment() {

    companion object {
        fun newInstance() = DesafioAFragment()
    }

    private lateinit var viewModel: DesafioAViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.desafio_a_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val file = File(requireContext().filesDir, "o_nome_passado")
        file.isDirectory
        file.isFile
        file.createNewFile() //Cria um diretório
        file.mkdir() //Cria um diretório
        file.mkdirs() //Cria os diretórios PAI
    }

}