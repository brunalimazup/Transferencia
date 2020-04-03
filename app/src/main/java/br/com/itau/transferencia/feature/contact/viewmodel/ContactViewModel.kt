package br.com.itau.transferencia.feature.contact.viewmodel

import android.accounts.Account
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import br.com.itau.transferencia.data.repository.ContactRepository
import br.com.itau.transferencia.model.Contact

class ContactViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = ContactRepository(application)

    fun insertContact(name: String, agency: String, account: String) {
        val contact = Contact(name = name, agency = agency, account = account)
        repository.insertContact(contact)
    }
    fun getAllContacts() {
        repository.getAllContacts()
    }
}