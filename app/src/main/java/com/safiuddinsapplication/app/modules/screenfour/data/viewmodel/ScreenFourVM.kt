package com.safiuddinsapplication.app.modules.screenfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screenfour.`data`.model.ScreenFourModel
import org.koin.core.KoinComponent

class ScreenFourVM : ViewModel(), KoinComponent {
  val screenFourModel: MutableLiveData<ScreenFourModel> = MutableLiveData(ScreenFourModel())

  var navArguments: Bundle? = null
}
