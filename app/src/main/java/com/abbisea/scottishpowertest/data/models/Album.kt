package com.abbisea.scottishpowertest.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Album(@PrimaryKey val id: Int, val title: String)
