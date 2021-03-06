package com.devjj.pacemaker.features.pacemaker.playpopup

import android.os.Parcel
import android.os.Parcelable

// achivement 원래 boolean으로 가야 되긴하는데 readBoolean이 안돼서 Int로 가고 0이면 false, 1이면 true로 하는 걸로
data class PlayPopupView(val id: Int, val part: Int, val name: String, val mass: Int,
                         val rep: Int, val setGoal: Int, var setDone: Int,
                         val interval: Int, val achievement: Int) :
    Parcelable {
    companion object CREATOR : Parcelable.Creator<PlayPopupView> {
        override fun createFromParcel(parcel: Parcel): PlayPopupView {
            return PlayPopupView(parcel)
        }

        override fun newArray(size: Int): Array<PlayPopupView?> {
            return arrayOfNulls(size)
        }
    }

    override fun describeContents() = 0

    constructor(parcel: Parcel) : this(parcel.readInt(), parcel.readInt(), parcel.readString()!!, parcel.readInt(),
        parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt())


    override fun writeToParcel(dest: Parcel, flags: Int) {
        with(dest) {
            writeInt(id)
            writeInt(part)
            writeString(name)
            writeInt(mass)
            writeInt(rep)
            writeInt(setGoal)
            writeInt(setDone)
            writeInt(interval)
            writeInt(achievement)
        }
    }
}