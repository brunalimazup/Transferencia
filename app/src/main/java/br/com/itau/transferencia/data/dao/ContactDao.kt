package br.com.itau.transferencia.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.itau.transferencia.model.Contact

@Dao
interface ContactDao {

    @Insert
    fun insertContact(contact: Contact)

    @Query("SELECT * FROM contact")
    fun getAllContacts() : List<Contact>
}