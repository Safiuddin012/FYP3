package com.safiuddinsapplication.app.modules.screenten.ui

import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenTenBinding
import com.safiuddinsapplication.app.modules.screeneight.ui.ScreenEightActivity
import com.safiuddinsapplication.app.modules.screenfour.ui.ScreenFourActivity
import com.safiuddinsapplication.app.modules.screenten.`data`.viewmodel.ScreenTenVM
import kotlin.String
import kotlin.Unit

class ScreenTenActivity : BaseActivity<ActivityScreenTenBinding>(R.layout.activity_screen_ten) {
  private val viewModel: ScreenTenVM by viewModels<ScreenTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnReviewShoots.setOnClickListener {
      val destIntent = ScreenFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePowerButtonOneTwo.setOnClickListener {
      val destIntent = ScreenEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCREEN_TEN_ACTIVITY"

  }
}
