package br.com.dio.businesscard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import br.com.dio.businesscard.R

class AddBusinessCardActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_business_card)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        insertListeners()
    }

    private fun insertListeners() {

    }

}
