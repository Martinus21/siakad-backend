package com.home.siakadbackend.repository

import com.home.siakadbackend.model.Mahasiswa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MahasiswaRepository: JpaRepository<Mahasiswa, Long> {
    fun findByNim(nim: String): Mahasiswa
    fun deleteByNim(nim: String): Long
}