package br.com.dio.businesscard.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.dio.businesscard.App
import br.com.dio.businesscard.data.BusinessCard
import br.com.dio.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners() {
        binding.btnConfirm.setOnClickListener {
            val businessCard = BusinessCard(
                id = 1,
                nome = binding.tilNome?.editText?.text.toString(),
                empresa = binding.tilEmpresa?.editText?.text.toString(),
                telefone = binding.tilTelefone?.editText?.text.toString(),
                email = binding.tilEmail?.editText?.text.toString(),
                fundoPersonalizado = binding.tilCor?.editText?.text.toString()
            )
            mainViewModel.insert(businessCard)
        }
    }


}
