package com.example.test.ui.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.data.model.InfoRes
import com.example.test.core.RetrofitClient
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class DataViewModel @Inject constructor() : ViewModel() {
    var _listData : ArrayList<InfoRes> by mutableStateOf(arrayListOf())

    fun getDatas(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitClient.webService.getData()
            withContext(Dispatchers.Main){
                _listData = response.body()!!.results
            }
        }
    }
}