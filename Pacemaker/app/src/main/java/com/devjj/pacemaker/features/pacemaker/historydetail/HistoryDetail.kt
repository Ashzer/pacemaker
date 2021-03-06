package com.devjj.pacemaker.features.pacemaker.historydetail

import com.devjj.pacemaker.core.extension.empty

data class HistoryDetail(val id: Int,
                         val date: String,
                         val part_img:Int,
                         val name: String,
                         val mass: Int,
                         val rep: Int,
                         val setGoal : Int,
                         val setDone:Int,
                         val interval:Int
                         ){
    companion object{
        fun empty() = HistoryDetail(-1,String.empty(),0,String.empty(),0,0,0,0,0)
    }
}