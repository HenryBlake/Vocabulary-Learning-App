package com.henry_w_blake.gottouch.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.henry_w_blake.gottouch.components.BackgroundImg

@Composable
fun MainLayout(){
    Box(modifier = Modifier.fillMaxSize()) {
        BackgroundImg()
    }
}
@Preview(showBackground = true)
@Composable
fun MainLayoutPreview(){
    MainLayout()
}