package com.example.chatapp.pageone

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.chatapp.R

@Composable
fun ReplayButton() {
    val roundedCorner = dimensionResource(R.dimen.top_eleated_button_rounded_corner)
    val replyTextPadding = dimensionResource(R.dimen.reply_text_top_padding)
    val replyTextStartPadding = dimensionResource(R.dimen.reply_text_start_padding)
    val cardShape = remember { RoundedCornerShape(roundedCorner) }

    Row(
        modifier = Modifier.padding(bottom = dimensionResource(R.dimen.replying_row_bottom_padding))
    ) {
        ElevatedCard(
            onClick = {},
            modifier = Modifier
                .padding(
                    start = dimensionResource(R.dimen.reply_text_eleveted_card_start_padding),
                    bottom = dimensionResource(R.dimen.reply_text_eleveted_card_bottom_padding),
                    top = dimensionResource(R.dimen.reply_text_eleveted_card_top_padding)
                )
                .weight(0.5f)
                .height(dimensionResource(R.dimen.reply_text_eleveted_card_size_height)),
            elevation = CardDefaults.elevatedCardElevation(dimensionResource(R.dimen.top_eleated_button_elevation)),
            colors = CardDefaults.elevatedCardColors(Color.White),
            shape = cardShape
        ) {
            Text(
                "Reply...",
                color = Color.Black,
                fontWeight = FontWeight.ExtraLight,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(
                    top = replyTextPadding,
                    start = replyTextStartPadding
                )
            )
        }
        Spacer(Modifier.padding(7.dp))
        ElevatedCard(
            onClick = {},
            modifier = Modifier
                .padding(
                    bottom = dimensionResource(R.dimen.reply_icon_eleveted_card_bottom_padding),
                    top = dimensionResource(R.dimen.reply_icon_eleveted_card_top_padding),
                    end = 15.dp
                )
                .weight(0.1f)
                .height(dimensionResource(R.dimen.reply_text_eleveted_card_size_height)),
            elevation = CardDefaults.elevatedCardElevation(dimensionResource(R.dimen.top_eleated_button_elevation)),
            colors = CardDefaults.elevatedCardColors(Color(0XFFB8ED55)),
            shape = cardShape
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                ReplyIcon()
            }
        }
    }
}

@Composable
fun ReplyIcon() {
    Icon(
        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
        contentDescription = "Reply",
        tint = Color.Black,
    )
}
