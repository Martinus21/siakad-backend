package com.home.siakadbackend.model

import javax.persistence.*

@Entity
data class Dosen (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,

        @Column(name = "nama")
        var nama: String,

        @Column(name = "fakultas")
        var fakultas: String
)