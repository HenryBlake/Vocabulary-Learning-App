package com.henry_w_blake.gottouch.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.henry_w_blake.gottouch.R

@Composable
fun BackgroundImg(modifier: Modifier=Modifier){
    //Background Box
    Box(modifier = modifier.fillMaxSize().background(color = Color.White)){
        //Upper-left circles
        Image(
            painter = painterResource(R.drawable.circles),
            contentDescription = "Upper-left circles",
            Modifier.matchParentSize().offset(x= (-180).dp, y= (-400).dp)
        )
        //Lower-right circles
        Image(
            painter = painterResource(R.drawable.circles),
            contentDescription = "Lower-right circles",
            Modifier.matchParentSize().offset(x=180.dp, y=450.dp)
        )
    }
}

@Composable
@Preview
fun BackgroundImgPreview(){
    BackgroundImg()
}