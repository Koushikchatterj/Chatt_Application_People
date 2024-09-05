package com.example.chatapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.chatapp.R

data class Contacts(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val lastmassage: Int,
    @StringRes val status: Int
)

val details = listOf(
    Contacts(R.drawable.istockphoto_1303206558_612x612, R.string.contact_name_1,R.string.lastmassage_1,R.string.status_1),
    Contacts(R.drawable.istockphoto_1311326724_612x612,R.string.contact_name_2,R.string.lastmassage_2,R.string.status_2),
    Contacts(R.drawable.istockphoto_1316878046_612x612,R.string.contact_name_3,R.string.lastmassage_3,R.string.status_3),
    Contacts(R.drawable.istockphoto_1318189938_612x612,R.string.contact_name_4,R.string.lastmassage_4,R.string.status_4),
    Contacts(R.drawable.istockphoto_1320811419_612x612,R.string.contact_name_5,R.string.lastmassage_5,R.string.status_5),
    Contacts(R.drawable.istockphoto_1338134319_612x612,R.string.contact_name_6,R.string.lastmassage_6,R.string.status_6),
    Contacts(R.drawable.istockphoto_1338134336_612x612,R.string.contact_name_7,R.string.lastmassage_7,R.string.status_7),
    Contacts(R.drawable.istockphoto_1388253782_612x612,R.string.contact_name_8,R.string.lastmassage_8,R.string.status_8),
    Contacts(R.drawable.istockphoto_1409155424_612x612,R.string.contact_name_9,R.string.lastmassage_9,R.string.status_9),
    Contacts(R.drawable.istockphoto_1795068462_612x612,R.string.contact_name_10,R.string.lastmassage_10,R.string.status_10),
)