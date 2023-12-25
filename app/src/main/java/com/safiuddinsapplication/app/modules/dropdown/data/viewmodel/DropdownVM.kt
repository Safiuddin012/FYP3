package com.safiuddinsapplication.app.modules.dropdown.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.dropdown.`data`.model.DropdownModel
import com.safiuddinsapplication.app.modules.dropdown.`data`.model.SpinnerLanguageModel
import com.safiuddinsapplication.app.modules.dropdown.`data`.model.SpinnerLanguageOneModel
import com.safiuddinsapplication.app.modules.dropdown.`data`.model.SpinnerLanguageTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DropdownVM : ViewModel(), KoinComponent {
  val dropdownModel: MutableLiveData<DropdownModel> = MutableLiveData(DropdownModel())

  var navArguments: Bundle? = null

  val spinnerLanguageList: MutableLiveData<MutableList<SpinnerLanguageModel>> = MutableLiveData()

  val spinnerLanguageOneList: MutableLiveData<MutableList<SpinnerLanguageOneModel>> =
      MutableLiveData()

  val spinnerLanguageTwoList: MutableLiveData<MutableList<SpinnerLanguageTwoModel>> =
      MutableLiveData()
}
