package com.home.siakadbackend.base

data class BaseResponse<T>(
        var isSuccess: Boolean = false,
        var message: String,
        var data: T?
)