package com.britney.lavenda.digitalentproject.model

import android.os.Parcel
import android.os.Parcelable


data class Book(
    var title: String = "",
    var writer: String = "",
    var language: String = "",
    var price: String = "",
    var synopsis: String = "",
    var photo: String = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(writer)
        parcel.writeString(language)
        parcel.writeString(price)
        parcel.writeString(synopsis)
        parcel.writeString(photo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Book> {
        override fun createFromParcel(parcel: Parcel): Book {
            return Book(parcel)
        }

        override fun newArray(size: Int): Array<Book?> {
            return arrayOfNulls(size)
        }
    }
}
