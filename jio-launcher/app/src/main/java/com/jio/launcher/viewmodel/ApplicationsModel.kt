package com.jio.launcher.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.jio.launcher.model.AppInfo

class ApplicationsModel : ViewModel() {
    var apps: MutableLiveData<List<AppInfo>> = MutableLiveData()
}
