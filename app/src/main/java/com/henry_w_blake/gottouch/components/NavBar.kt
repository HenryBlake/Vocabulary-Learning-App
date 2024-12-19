package com.henry_w_blake.gottouch.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.henry_w_blake.gottouch.R


@Composable
fun NavBar(modifier: Modifier = Modifier){
    Box(modifier=modifier){
        //Shadow of the NavBar
        Box(modifier = modifier.size(302.dp,62.dp).clip(RoundedCornerShape(28.dp)).shadow(1.dp, shape = RoundedCornerShape(28.dp))){
        }
        //The NavBar itself
        Box(
            modifier = modifier.size(300.dp, 60.dp).clip(
                RoundedCornerShape(28.dp)
            ).background(color = Color.White).border(0.3.dp, Color.Black,shape = RoundedCornerShape(28.dp))
        ){

            Row (
                verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(R.drawable.home_24px), contentDescription ="Home")
            }

        }
    }

}
@Preview
@Composable
fun PreviewNavBar(){
    NavBar()
}