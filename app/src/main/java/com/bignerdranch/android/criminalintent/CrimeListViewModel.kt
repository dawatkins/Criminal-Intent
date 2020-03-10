package com.bignerdranch.android.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel() {

    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100){
            val crime = Crime()
            var count = i + 1
            crime.title = "Crime #$count"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }
}