package com.example.test.data.model

import javax.inject.Inject

data class InfoRes @Inject constructor(
    var name: String,
    var image: String,
    var status: String,
    var species: String,
    var type: String,
    var gender: String,
    var origin: Origins,
    var location: Origins

)
