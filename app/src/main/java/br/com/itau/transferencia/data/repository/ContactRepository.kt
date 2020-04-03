package br.com.itau.transferencia.data.repository

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.room.Database
import androidx.room.Room
import br.com.itau.transferencia.model.Contact
import org.jetbrains.anko.doAsync

class ContactRepository(val application: Application) {
    private val database = Room.databaseBuilder(application, Database::class.java, "itau_database")
        .build()

    fun insertContact(contact: Contact) {
        doAsync {
            database.getContactDao().insertContact(contact)
        }

        Toast.makeText(application, "Contato criado com sucesso!", Toast.LENGTH_SHORT).show()
    }

    fun getAllContacts() {
        doAsync {
            val list = database.getContactDao().getAllContacts()

            //INTERPOLAÇÃO
            list.forEach {
                Log.i("ContactRepository", "Nome do Contato: ${it.name}")
            }
        }
    }

}
