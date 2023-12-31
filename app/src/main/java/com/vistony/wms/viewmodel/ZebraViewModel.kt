package com.vistony.wms.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vistony.wms.model.zebraPayload
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ZebraViewModel: ViewModel() {

    private val _data = MutableStateFlow(zebraPayload())
    val data: StateFlow<zebraPayload> get() = _data

    class ZebraViewModelFactory(): ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return ZebraViewModel() as T
        }
    }

    fun setData(data: zebraPayload){
        _data.value=data
    }
}