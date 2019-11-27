package com.home.siakadbackend.service

import com.home.siakadbackend.base.BaseResponse
import com.home.siakadbackend.model.Mahasiswa

interface MahasiswaService {
    fun getAllMahasiswa(): BaseResponse<List<Mahasiswa>>
    fun getMahasiswaById(id: Long): BaseResponse<Mahasiswa>
    fun getMahasiswaByNim(nim: String): BaseResponse<Mahasiswa>
    fun createMahasiswa(mahasiswa: Mahasiswa): BaseResponse<Mahasiswa>
    fun updateMahasiswa(mahasiswa: Mahasiswa): BaseResponse<Mahasiswa>
    fun deleteMahasiswaById(id: Long): BaseResponse<Any>
    fun deleteMahasiswaByNim(nim: String): BaseResponse<Any>
}