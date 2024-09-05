package com.example.chatapp.pageone

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dehaze
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontFamily.Companion.Serif
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.R

@SuppressLint("InvalidColorHexValue", "Range")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    BoxWithConstraints {
        val screenWidth = maxWidth
        val paddingValue = 12.3f
        val screenHeight = maxWidth
        CenterAlignedTopAppBar(
            modifier = Modifier
                .height(screenHeight * 0.28f)
            ,
        title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = paddingValue.dp)
                        .padding(top = 13.dp)
                ) {
                    ElevatedButton(
                        onClick = {},
                        colors = ButtonDefaults.elevatedButtonColors(Color(0XFFF5F4F0)),
                        elevation = ButtonDefaults.elevatedButtonElevation(dimensionResource(R.dimen.top_eleated_button_elevation)),
                        shape = RoundedCornerShape(dimensionResource(R.dimen.top_eleated_button_rounded_corner)),
                        modifier = Modifier
                            .size(
                                width = screenWidth * 0.1f,
                                height = dimensionResource(R.dimen.top_bar_button_height_size)
                            ),
                        contentPadding = PaddingValues(dimensionResource(R.dimen.top_bar_button_contentPadding_value))
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Notifications,
                            contentDescription = "Notifications",
                            tint = Color.Black,
                            modifier = Modifier.size(dimensionResource(R.dimen.top_bar_icon_size))
                        )
                    }
                    Spacer(
                        Modifier
                            .weight(0.05f)
                    )
                    Text(
                        "People",
                        fontFamily = Serif,
                        fontSize = (screenWidth * 0.1f).value.sp
                    )
                    Spacer(
                        Modifier.weight(0.05f)
                    )
                    ElevatedButton(
                        onClick = {},
                        colors = ButtonDefaults.elevatedButtonColors(Color(0XFFF5F4F0)),
                        elevation = ButtonDefaults.elevatedButtonElevation(dimensionResource(R.dimen.top_eleated_button_elevation)),
                        shape = RoundedCornerShape(dimensionResource(R.dimen.top_eleated_button_rounded_corner)),
                        modifier = Modifier
                            .size(
                                width = screenWidth * 0.1f,
                                height = dimensionResource(R.dimen.top_bar_button_height_size)
                            ),
                        contentPadding = PaddingValues(dimensionResource(R.dimen.top_bar_button_contentPadding_value))
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Dehaze,
                            contentDescription = "side meanu",
                            tint = Color.Black,
                            modifier = Modifier.size(dimensionResource(R.dimen.top_bar_icon_size))
                        )
                    }
                }
            }
        )
    }
}