package com.example.chatapp.pageone

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import com.example.chatapp.R

@Composable
fun ContactInfo(
    @StringRes conName: Int,
    lastmassage: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = Modifier) {
        Text(
            text = stringResource(conName),
            fontFamily = FontFamily.Serif,
            style = MaterialTheme.typography.displayMedium,
            color = Color.Black,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )

        Text(
            text = stringResource(lastmassage),
            fontFamily = FontFamily.Serif,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_more_super_small))
        )
    }
}