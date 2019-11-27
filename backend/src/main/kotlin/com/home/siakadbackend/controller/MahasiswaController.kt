package com.home.siakadbackend.controller

import com.home.siakadbackend.model.Mahasiswa
import com.home.siakadbackend.service.MahasiswaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/mahasiswa")
class MahasiswaController {

    @Autowired
    private lateinit var mahasiswaService: MahasiswaService

    @GetMapping("")
    fun getAllMahasiswa() = mahasiswaService.getAllMahasiswa()

    @GetMapping("/id/{id}")
    fun getMahasiswaById(@PathVariable(name = "id") id: Long) = mahasiswaService.getMahasiswaById(id)

    @GetMapping("/nim/{nim}")
    fun getMahasiswaByNim(@PathVariable(name = "nim") nim: String) = mahasiswaService.getMahasiswaByNim(nim)

    @PostMapping("/store")
    fun createMahasiswa(@RequestBody mahasiswa: Mahasiswa) = mahasiswaService.createMahasiswa(mahasiswa)

    @PostMapping("/update")
    fun updateMahasiswa(@RequestBody mahasiswa: Mahasiswa) = mahasiswaService.updateMahasiswa(mahasiswa)

    @DeleteMapping("/delete/id/{id}")
    fun deleteMahasiswaById(@PathVariable(name = "id") id: Long) = mahasiswaService.deleteMahasiswaById(id)

    @DeleteMapping("/delete/nim/{nim}")
    fun deleteMahasiswaByNim(@PathVariable(name = "nim") nim: String) = mahasiswaService.deleteMahasiswaByNim(nim)
}