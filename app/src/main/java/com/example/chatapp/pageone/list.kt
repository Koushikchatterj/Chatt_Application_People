package com.example.chatapp.pageone

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.chatapp.data.Contacts

@Composable
fun Contactlist(
    contact: Contacts,
    modifier: Modifier = Modifier
    ) {
    var expanded by remember {
        mutableStateOf(false)
    }
    ElevatedCard (
        onClick = {},
        elevation = CardDefaults.elevatedCardElevation(5.dp),
        colors = CardDefaults.elevatedCardColors(Color(0XFFF5F4F0)),
        modifier = modifier
            .padding(horizontal = 5.dp)
    ) {
       Column(
           modifier = Modifier
               .animateContentSize(
                   animationSpec = spring(
                       dampingRatio = Spring.DampingRatioMediumBouncy,
                       stiffness = Spring.StiffnessMedium
                   )
               )
       ) {
           Row {
               ConPic(contact.imageResourceId)
               ContactInfo(contact.name,contact.lastmassage)
               Spacer(modifier.weight(1f))
               ConexpandedButton(
                   expanded = expanded,
                   onClick = { expanded = !expanded }
               )
           }
           if (expanded) {
               ReplayButton()
           }
       }
    }
}
