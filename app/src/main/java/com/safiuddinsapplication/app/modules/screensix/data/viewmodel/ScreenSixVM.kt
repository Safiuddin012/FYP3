package com.safiuddinsapplication.app.modules.screensix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screensix.`data`.model.ScreenSixModel
import org.koin.core.KoinComponent

class ScreenSixVM : ViewModel(), KoinComponent {
  val screenSixModel: MutableLiveData<ScreenSixModel> = MutableLiveData(ScreenSixModel())

  var navArguments: Bundle? = null
}
