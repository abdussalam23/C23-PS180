package com.capstone.masaala.data.dummy

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DummyItem (
    var name: String = "",
    var desc: String = "",
    var picture: String = ""
): Parcelable