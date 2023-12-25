package com.safiuddinsapplication.app.modules.dropdown.ui

import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityDropdownBinding
import com.safiuddinsapplication.app.modules.dropdown.`data`.model.SpinnerLanguageModel
import com.safiuddinsapplication.app.modules.dropdown.`data`.model.SpinnerLanguageOneModel
import com.safiuddinsapplication.app.modules.dropdown.`data`.model.SpinnerLanguageTwoModel
import com.safiuddinsapplication.app.modules.dropdown.`data`.viewmodel.DropdownVM
import kotlin.String
import kotlin.Unit

class DropdownActivity : BaseActivity<ActivityDropdownBinding>(R.layout.activity_dropdown) {
  private val viewModel: DropdownVM by viewModels<DropdownVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerLanguageList.value = mutableListOf(
    SpinnerLanguageModel("Item1"),
    SpinnerLanguageModel("Item2"),
    SpinnerLanguageModel("Item3"),
    SpinnerLanguageModel("Item4"),
    SpinnerLanguageModel("Item5")
    )
    val spinnerLanguageAdapter =
    SpinnerLanguageAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageList.value?:
    mutableListOf())
    binding.spinnerLanguage.adapter = spinnerLanguageAdapter
    viewModel.spinnerLanguageOneList.value = mutableListOf(
    SpinnerLanguageOneModel("Item1"),
    SpinnerLanguageOneModel("Item2"),
    SpinnerLanguageOneModel("Item3"),
    SpinnerLanguageOneModel("Item4"),
    SpinnerLanguageOneModel("Item5")
    )
    val spinnerLanguageOneAdapter =
    SpinnerLanguageOneAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageOneList.value?:
    mutableListOf())
    binding.spinnerLanguageOne.adapter = spinnerLanguageOneAdapter
    viewModel.spinnerLanguageTwoList.value = mutableListOf(
    SpinnerLanguageTwoModel("Item1"),
    SpinnerLanguageTwoModel("Item2"),
    SpinnerLanguageTwoModel("Item3"),
    SpinnerLanguageTwoModel("Item4"),
    SpinnerLanguageTwoModel("Item5")
    )
    val spinnerLanguageTwoAdapter =
    SpinnerLanguageTwoAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageTwoList.value?:
    mutableListOf())
    binding.spinnerLanguageTwo.adapter = spinnerLanguageTwoAdapter
    binding.dropdownVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DROPDOWN_ACTIVITY"

  }
}
