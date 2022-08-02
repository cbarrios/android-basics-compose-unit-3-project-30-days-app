package com.lalosapps.kotlintips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lalosapps.kotlintips.ui.theme.KotlinTipsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinTipsTheme {
                KotlinApp()
            }
        }
    }
}

@Composable
fun KotlinApp() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(194.dp),
        painter = painterResource(id = R.drawable.kotlin),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KotlinTipsTheme {
        KotlinApp()
    }
}