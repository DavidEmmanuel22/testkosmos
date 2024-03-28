package com.example.test.data.model

import javax.inject.Inject

data class DataResponse @Inject constructor(
    var results: ArrayList<InfoRes>
)
