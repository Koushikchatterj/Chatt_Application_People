package com.example.chatapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.example.chatapp.data.details
import com.example.chatapp.pageone.Contactlist
import com.example.chatapp.pageone.SearchBar
import com.example.chatapp.pageone.TopBar
import com.example.chatapp.ui.theme.ChatappTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatappTheme {
                Scaffold(modifier = Modifier.fillMaxSize())
                {
                    Chattapp()
                }
            }
        }
    }
}

@Composable
fun Chattapp() {
    Scaffold(
        topBar = {
            TopBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            item {
                Column(modifier = Modifier
                    .padding(top = 10.dp)
                    .height(50.dp)) {
                    SearchBar()
                    Spacer(Modifier.padding(dimensionResource(R.dimen.padding_small)))
                }
            }
            items(details) {
                Contactlist(
                    contact = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}
