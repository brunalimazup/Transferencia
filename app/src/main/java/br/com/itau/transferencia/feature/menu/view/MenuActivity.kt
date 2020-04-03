package br.com.itau.transferencia.feature.menu.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.com.itau.transferencia.R
import br.com.itau.transferencia.feature.contact.view.ContactActivity
import br.com.itau.transferencia.feature.menu.viewmodel.MenuViewModel
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    private lateinit var viewModel: MenuViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        viewModel = ViewModelProviders.of(this).get(MenuViewModel::class.java)

        configureButton()
    }

    private fun configureButton() {
        btnContact.setOnClickListener { startActivity(Intent(this, ContactActivity::class.java)) }
    }
}
