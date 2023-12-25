package com.safiuddinsapplication.app.modules.screenthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screenthree.`data`.model.ScreenThreeModel
import com.safiuddinsapplication.app.modules.screenthree.`data`.model.SpinnerButtonModel
import com.safiuddinsapplication.app.modules.screenthree.`data`.model.SpinnerLanguageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScreenThreeVM : ViewModel(), KoinComponent {
  val screenThreeModel: MutableLiveData<ScreenThreeModel> = MutableLiveData(ScreenThreeModel())

  var navArguments: Bundle? = null

  val spinnerLanguageList: MutableLiveData<MutableList<SpinnerLanguageModel>> = MutableLiveData()

  val spinnerButtonList: MutableLiveData<MutableList<SpinnerButtonModel>> = MutableLiveData()
}
