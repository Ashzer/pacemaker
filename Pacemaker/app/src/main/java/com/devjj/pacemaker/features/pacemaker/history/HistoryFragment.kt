package com.devjj.pacemaker.features.pacemaker.history

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.devjj.pacemaker.R
import com.devjj.pacemaker.core.platform.BaseFragment
import com.devjj.pacemaker.features.pacemaker.home.HomeViewModel

class HistoryFragment : BaseFragment() {

    private lateinit var historyViewModel: HistoryViewModel

    override fun layoutId() = R.layout.fragment_history

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //initializeView()
    }

}
