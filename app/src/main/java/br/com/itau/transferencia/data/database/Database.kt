package br.com.itau.transferencia.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.itau.transferencia.data.dao.ContactDao
import br.com.itau.transferencia.model.Contact

@Database(entities = [Contact::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun getContactDao() : ContactDao
}