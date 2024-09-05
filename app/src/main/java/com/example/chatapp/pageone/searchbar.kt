package com.example.chatapp.pageone

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import com.example.chatapp.R


@Composable
fun SearchBar() {
    Row {
        ElevatedCard(
            onClick = {},
            modifier = Modifier
                .padding(start = dimensionResource(R.dimen.search_bar_start_padding))
                .fillMaxWidth(0.8f)
                .height(dimensionResource(R.dimen.search_bar_size_height)),
            elevation = CardDefaults.elevatedCardElevation(dimensionResource(R.dimen.top_eleated_button_elevation)),
            colors = CardDefaults.elevatedCardColors(Color(0XFFF5F4F0)),
            shape = RoundedCornerShape(dimensionResource(R.dimen.top_eleated_button_rounded_corner))
        ) {
            Row {
                SearchIcon()
                Text(
                    "Search...",
                    color = Color.Black,
                    modifier = Modifier.padding(top = dimensionResource(R.dimen.search_bar_name_top_padding))
                )
            }
        }
        Spacer(Modifier.padding(dimensionResource(R.dimen.searchbar_and_settings_spacer)))
        ElevatedCard(
            onClick = {},
            modifier = Modifier.size(
                width = dimensionResource(R.dimen.top_bar_button_width_size),
                height = dimensionResource(R.dimen.top_bar_button_height_size)
            ),
            elevation = CardDefaults.elevatedCardElevation(dimensionResource(R.dimen.top_eleated_button_elevation)),
            colors = CardDefaults.elevatedCardColors(Color(0XFFB8ED55)),
            shape = RoundedCornerShape(dimensionResource(R.dimen.top_eleated_button_rounded_corner))
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                SettingsIcon()
            }
        }
    }
}

@Composable
fun SearchIcon() {
    Icon(
        imageVector = Icons.Filled.Search,
        contentDescription = "Search",
        tint = Color.Black,
        modifier = Modifier
            .padding(dimensionResource(R.dimen.search_icon_padding))
    )
}

@Composable
fun SettingsIcon() {
    Icon(
        imageVector = Icons.Filled.Settings,
        contentDescription = "Settings",
        tint = Color.Black,
    )
}
