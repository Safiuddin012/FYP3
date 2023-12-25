package com.safiuddinsapplication.app.modules.screenseven.ui

import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenSevenBinding
import com.safiuddinsapplication.app.modules.screeneight.ui.ScreenEightActivity
import com.safiuddinsapplication.app.modules.screenseven.`data`.viewmodel.ScreenSevenVM
import kotlin.String
import kotlin.Unit

class ScreenSevenActivity : BaseActivity<ActivityScreenSevenBinding>(R.layout.activity_screen_seven)
    {
  private val viewModel: ScreenSevenVM by viewModels<ScreenSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePowerButtonOneTwo.setOnClickListener {
      val destIntent = ScreenEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCREEN_SEVEN_ACTIVITY"

  }
}
