package com.safiuddinsapplication.app.modules.screensix.ui

import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenSixBinding
import com.safiuddinsapplication.app.modules.screenfour.ui.ScreenFourActivity
import com.safiuddinsapplication.app.modules.screensix.`data`.viewmodel.ScreenSixVM
import kotlin.String
import kotlin.Unit

class ScreenSixActivity : BaseActivity<ActivityScreenSixBinding>(R.layout.activity_screen_six) {
  private val viewModel: ScreenSixVM by viewModels<ScreenSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSendVerificationCode.setOnClickListener {
      val destIntent = ScreenFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCREEN_SIX_ACTIVITY"

  }
}
