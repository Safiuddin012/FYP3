package com.safiuddinsapplication.app.modules.dropdownone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.dropdownone.`data`.model.DropdownOneModel
import com.safiuddinsapplication.app.modules.dropdownone.`data`.model.SpinnerButtonModel
import com.safiuddinsapplication.app.modules.dropdownone.`data`.model.SpinnerButtonOneModel
import com.safiuddinsapplication.app.modules.dropdownone.`data`.model.SpinnerButtonTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DropdownOneVM : ViewModel(), KoinComponent {
  val dropdownOneModel: MutableLiveData<DropdownOneModel> = MutableLiveData(DropdownOneModel())

  var navArguments: Bundle? = null

  val spinnerButtonList: MutableLiveData<MutableList<SpinnerButtonModel>> = MutableLiveData()

  val spinnerButtonOneList: MutableLiveData<MutableList<SpinnerButtonOneModel>> = MutableLiveData()

  val spinnerButtonTwoList: MutableLiveData<MutableList<SpinnerButtonTwoModel>> = MutableLiveData()
}
