package com.henry_w_blake.gottouch.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainLayout(){
    Column {
        Text("Hello World!")
    }
}
@Preview(showBackground = true)
@Composable
fun MainLayoutPreview(){
    MainLayout()
}