package com.devjj.pacemaker.features.pacemaker.history

import android.app.Activity
import android.util.Log
import com.devjj.pacemaker.core.functional.Dlog
import com.devjj.pacemaker.core.navigation.Navigator
import com.prolificinteractive.materialcalendarview.CalendarDay
import kotlinx.android.synthetic.main.fragment_history.*
import org.threeten.bp.LocalDate

class HistoryListener(val activity : Activity, val navigator: Navigator,private val historyViewModel : HistoryViewModel){

    fun initListener(){
        activity.fHistory_calendarView.setOnDateChangedListener { calendarView, date, selected ->
            Dlog.d( "date : ${date.date} , selected : $selected")

            calendarView.setDateSelected(
                CalendarDay.from(LocalDate.of(date.year, date.month, date.day)),
                selected.not()
            )
            when(selected){
                false->{
                    Dlog.d( "date : ${date.date}")
                    navigator.showHistoryDetail(activity, date.date.toString())
                }
                true->{}
            }
        }

        activity.fHistory_calendarView.setOnMonthChangedListener { widget, date ->
            historyViewModel.loadOneMonthSumOfSetsAndMass(date.date.toString())
            historyViewModel.loadTotalTimes(date.date.toString())
            Log.d("jayDateCheck.OnChanged", date.date.toString())
        }

        activity.fHistory_iv_chart.setOnClickListener {
            navigator.showStatistics(activity)
        }
    }
}