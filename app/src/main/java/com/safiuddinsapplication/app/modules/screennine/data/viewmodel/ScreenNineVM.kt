package com.safiuddinsapplication.app.modules.screennine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screennine.`data`.model.ScreenNineModel
import com.safiuddinsapplication.app.modules.screennine.`data`.model.ScreenNineRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScreenNineVM : ViewModel(), KoinComponent {
  val screenNineModel: MutableLiveData<ScreenNineModel> = MutableLiveData(ScreenNineModel())

  var navArguments: Bundle? = null

  val screenNineList: MutableLiveData<MutableList<ScreenNineRowModel>> =
      MutableLiveData(mutableListOf())
}
