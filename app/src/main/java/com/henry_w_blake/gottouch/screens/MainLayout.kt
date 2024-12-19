package com.henry_w_blake.gottouch.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.henry_w_blake.gottouch.components.BackgroundImg
import com.henry_w_blake.gottouch.components.NavBar

@Composable
fun MainLayout(){
    Box(modifier = Modifier.fillMaxSize()) {
        BackgroundImg()
        NavBar(modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 30.dp))
    }
}
@Preview(showBackground = true)
@Composable
fun MainLayoutPreview(){
    MainLayout()
}