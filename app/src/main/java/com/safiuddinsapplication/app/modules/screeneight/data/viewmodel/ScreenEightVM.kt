package com.safiuddinsapplication.app.modules.screeneight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screeneight.`data`.model.ScreenEightModel
import org.koin.core.KoinComponent

class ScreenEightVM : ViewModel(), KoinComponent {
  val screenEightModel: MutableLiveData<ScreenEightModel> = MutableLiveData(ScreenEightModel())

  var navArguments: Bundle? = null
}
