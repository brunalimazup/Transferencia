package br.com.itau.transferencia.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val agency: String,
    val account: String
)