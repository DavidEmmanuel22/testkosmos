package com.example.test.data.model

import javax.inject.Inject

data class Origins @Inject constructor(
    var name: String,
    var url: String,
)
