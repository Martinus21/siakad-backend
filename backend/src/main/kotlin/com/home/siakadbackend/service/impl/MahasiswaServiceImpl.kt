package com.home.siakadbackend.service.impl

import com.home.siakadbackend.base.BaseResponse
import com.home.siakadbackend.model.Mahasiswa
import com.home.siakadbackend.repository.MahasiswaRepository
import com.home.siakadbackend.service.MahasiswaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class MahasiswaServiceImpl: MahasiswaService {

    @Autowired
    private lateinit var mahasiswaRepository: MahasiswaRepository

    override fun getAllMahasiswa() = BaseResponse(
            isSuccess = true,
            message = "Get all Mahasiswa",
            data = mahasiswaRepository.findAll()
    )

    override fun getMahasiswaById(id: Long) = BaseResponse(
            isSuccess = true,
            message = "Get mahasiswa by id $id",
            data = mahasiswaRepository.getOne(id)
    )

    override fun getMahasiswaByNim(nim: String) = BaseResponse(
            isSuccess = true,
            message = "Get mahasiswa by nim $nim",
            data = mahasiswaRepository.findByNim(nim)
    )

    override fun createMahasiswa(mahasiswa: Mahasiswa): BaseResponse<Mahasiswa> {
        mahasiswaRepository.save(mahasiswa)
        return BaseResponse(
                isSuccess = true,
                message = "Mahasiswa Created",
                data = mahasiswa
        )
    }

    override fun updateMahasiswa(mahasiswa: Mahasiswa): BaseResponse<Mahasiswa> {
        mahasiswaRepository.save(mahasiswa)
        return BaseResponse(
                isSuccess = true,
                message = "Mahasiswa Updated",
                data = mahasiswa
        )
    }

    override fun deleteMahasiswaById(id: Long): BaseResponse<Any> {
        mahasiswaRepository.deleteById(id)
        return BaseResponse(
                isSuccess = true,
                message = "Mahasiswa Deleted",
                data = null
        )
    }

    override fun deleteMahasiswaByNim(nim: String): BaseResponse<Any> {
        mahasiswaRepository.deleteByNim(nim)
        return BaseResponse(
                isSuccess = true,
                message = "Mahasiswa Deleted",
                data = null
        )
    }

}