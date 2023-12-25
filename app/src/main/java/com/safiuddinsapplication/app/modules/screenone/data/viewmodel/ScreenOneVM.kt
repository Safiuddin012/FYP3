package com.safiuddinsapplication.app.modules.screenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screenone.`data`.model.ScreenOneModel
import org.koin.core.KoinComponent

class ScreenOneVM : ViewModel(), KoinComponent {
  val screenOneModel: MutableLiveData<ScreenOneModel> = MutableLiveData(ScreenOneModel())

  var navArguments: Bundle? = null
}
