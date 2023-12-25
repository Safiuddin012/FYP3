package com.safiuddinsapplication.app.modules.screenthree.ui

import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenThreeBinding
import com.safiuddinsapplication.app.modules.screeneight.ui.ScreenEightActivity
import com.safiuddinsapplication.app.modules.screenthree.`data`.model.SpinnerButtonModel
import com.safiuddinsapplication.app.modules.screenthree.`data`.model.SpinnerLanguageModel
import com.safiuddinsapplication.app.modules.screenthree.`data`.viewmodel.ScreenThreeVM
import kotlin.String
import kotlin.Unit

class ScreenThreeActivity : BaseActivity<ActivityScreenThreeBinding>(R.layout.activity_screen_three)
    {
  private val viewModel: ScreenThreeVM by viewModels<ScreenThreeVM>()

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
    binding.screenThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConnectTheBatOne.setOnClickListener {
      val destIntent = ScreenEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePowerButtonOneTwo.setOnClickListener {
      val destIntent = ScreenEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCREEN_THREE_ACTIVITY"

  }
}
