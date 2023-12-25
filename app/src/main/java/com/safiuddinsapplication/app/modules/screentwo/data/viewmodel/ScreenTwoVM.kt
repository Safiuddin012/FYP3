package com.safiuddinsapplication.app.modules.screentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screentwo.`data`.model.ScreenTwoModel
import com.safiuddinsapplication.app.modules.screentwo.`data`.model.ScreenTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScreenTwoVM : ViewModel(), KoinComponent {
  val screenTwoModel: MutableLiveData<ScreenTwoModel> = MutableLiveData(ScreenTwoModel())

  var navArguments: Bundle? = null

  val screenTwoList: MutableLiveData<MutableList<ScreenTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
