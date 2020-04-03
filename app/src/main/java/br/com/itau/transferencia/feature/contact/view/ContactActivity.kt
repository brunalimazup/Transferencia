package br.com.itau.transferencia.feature.contact.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.com.itau.transferencia.R
import br.com.itau.transferencia.feature.contact.viewmodel.ContactViewModel
import kotlinx.android.synthetic.main.activity_contact.*

class ContactActivity : AppCompatActivity() {
    private lateinit var viewModel: ContactViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        viewModel = ViewModelProviders.of(this).get(ContactViewModel::class.java)

        }

    fun configureButtonClick(){
        btnRegisterContact.setOnClickListener{
            viewModel.insertContact(edtContactName.text.toString(), edtAgency.text.toString(), edtAccount.text.toString())
        }
    }
}
