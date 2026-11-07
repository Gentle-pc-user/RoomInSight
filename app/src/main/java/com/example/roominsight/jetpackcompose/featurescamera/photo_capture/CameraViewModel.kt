package com.example.roominsight.jetpackcompose.featurescamera.photo_capture

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CameraViewModel : ViewModel() {
    private val _state = MutableStateFlow(CameraState())
    val state: StateFlow<CameraState> = _state.asStateFlow()

    fun storePhotoInGallery(bitmap: Bitmap) {
        _state.update { it.copy(capturedImage = bitmap) }
    }
}
