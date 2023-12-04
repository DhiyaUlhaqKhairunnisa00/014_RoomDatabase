package com.example.roomsiswa.repository

import android.content.Context
import com.example.roomsiswa.data.DatabaseSiswa

interface ContainerApp{
    val repositorySiswa: RepositorySiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositorySiswa: RepositorySiswa by lazy {
        OfflineRepositorySiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}