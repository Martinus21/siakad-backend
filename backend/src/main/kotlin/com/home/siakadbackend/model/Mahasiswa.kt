package com.home.siakadbackend.model

import javax.persistence.*

@Entity
data class Mahasiswa(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,

        @Column(name = "nama")
        var nama: String,

        @Column(name = "nim", unique = true)
        var nim: String,

        @Column(name = "jurusan")
        var jurusan: String,

        @Column(name = "fakultas")
        var fakultas: String
)