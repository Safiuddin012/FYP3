package com.safiuddinsapplication.app.modules.dropdownone.ui

import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityDropdownOneBinding
import com.safiuddinsapplication.app.modules.dropdownone.`data`.model.SpinnerButtonModel
import com.safiuddinsapplication.app.modules.dropdownone.`data`.model.SpinnerButtonOneModel
import com.safiuddinsapplication.app.modules.dropdownone.`data`.model.SpinnerButtonTwoModel
import com.safiuddinsapplication.app.modules.dropdownone.`data`.viewmodel.DropdownOneVM
import kotlin.String
import kotlin.Unit

class DropdownOneActivity : BaseActivity<ActivityDropdownOneBinding>(R.layout.activity_dropdown_one)
    {
  private val viewModel: DropdownOneVM by viewModels<DropdownOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerButtonList.value = mutableListOf(
    SpinnerButtonModel("Item1"),
    SpinnerButtonModel("Item2"),
    SpinnerButtonModel("Item3"),
    SpinnerButtonModel("Item4"),
    SpinnerButtonModel("Item5")
    )
    val spinnerButtonAdapter =
    SpinnerButtonAdapter(this,R.layout.spinner_item,viewModel.spinnerButtonList.value?:
    mutableListOf())
    binding.spinnerButton.adapter = spinnerButtonAdapter
    viewModel.spinnerButtonOneList.value = mutableListOf(
    SpinnerButtonOneModel("Item1"),
    SpinnerButtonOneModel("Item2"),
    SpinnerButtonOneModel("Item3"),
    SpinnerButtonOneModel("Item4"),
    SpinnerButtonOneModel("Item5")
    )
    val spinnerButtonOneAdapter =
    SpinnerButtonOneAdapter(this,R.layout.spinner_item,viewModel.spinnerButtonOneList.value?:
    mutableListOf())
    binding.spinnerButtonOne.adapter = spinnerButtonOneAdapter
    viewModel.spinnerButtonTwoList.value = mutableListOf(
    SpinnerButtonTwoModel("Item1"),
    SpinnerButtonTwoModel("Item2"),
    SpinnerButtonTwoModel("Item3"),
    SpinnerButtonTwoModel("Item4"),
    SpinnerButtonTwoModel("Item5")
    )
    val spinnerButtonTwoAdapter =
    SpinnerButtonTwoAdapter(this,R.layout.spinner_item,viewModel.spinnerButtonTwoList.value?:
    mutableListOf())
    binding.spinnerButtonTwo.adapter = spinnerButtonTwoAdapter
    binding.dropdownOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DROPDOWN_ONE_ACTIVITY"

  }
}
