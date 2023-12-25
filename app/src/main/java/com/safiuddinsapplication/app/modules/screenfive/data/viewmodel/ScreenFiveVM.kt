package com.safiuddinsapplication.app.modules.screenfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screenfive.`data`.model.ScreenFiveModel
import com.safiuddinsapplication.app.modules.screenfive.`data`.model.ScreenFiveRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScreenFiveVM : ViewModel(), KoinComponent {
  val screenFiveModel: MutableLiveData<ScreenFiveModel> = MutableLiveData(ScreenFiveModel())

  var navArguments: Bundle? = null

  val screenFiveList: MutableLiveData<MutableList<ScreenFiveRowModel>> =
      MutableLiveData(mutableListOf())
}
