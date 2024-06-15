package com.example.navigation.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.navigation.components.ActionButton
import com.example.navigation.components.MainButton
import com.example.navigation.components.Space
import com.example.navigation.components.TitleBar
import com.example.navigation.components.TitleView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(){
    Scaffold(
        topBar = {
            TopAppBar(title = { TitleBar(name = "Detail View")},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Blue
                )
            )
        }
    ) {
        ContentDetailView()
    }
}

@Composable
fun ContentDetailView(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleView(name = "Detail viewww")
        Space()
        MainButton(name = "Return home", backColor = Color.Blue, color = Color.White) {
            println("Soy un boton generico")
        }
    }
}
