package com.safiuddinsapplication.app.modules.screentwocontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.screentwocontainer.`data`.model.ScreenTwoContainerModel
import org.koin.core.KoinComponent

class ScreenTwoContainerVM : ViewModel(), KoinComponent {
  val screenTwoContainerModel: MutableLiveData<ScreenTwoContainerModel> =
      MutableLiveData(ScreenTwoContainerModel())

  var navArguments: Bundle? = null
}
