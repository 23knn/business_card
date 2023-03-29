package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}

@Composable
fun BusinessCard(modifier : Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.plant_grow), contentDescription = "my image")
        Text(
            text = stringResource(id = R.string.my_name),
            fontSize = 30.sp,
            modifier = modifier.padding(top = 40.dp)
        )
        Text(
            text = stringResource(id = R.string.my_title),
            fontSize = 25.sp
        )
        Text(text = stringResource(id = R.string.my_email), fontSize = 20.sp, modifier = modifier.padding(top = 30.dp))
        Text(text = stringResource(id = R.string.my_number), fontSize = 20.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCard()
}