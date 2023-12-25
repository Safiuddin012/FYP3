package com.safiuddinsapplication.app.modules.screenfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenFourBinding
import com.safiuddinsapplication.app.modules.screenfive.ui.ScreenFiveActivity
import com.safiuddinsapplication.app.modules.screenfour.`data`.viewmodel.ScreenFourVM
import com.safiuddinsapplication.app.modules.screentwocontainer.ui.ScreenTwoContainerActivity
import kotlin.String
import kotlin.Unit

class ScreenFourActivity : BaseActivity<ActivityScreenFourBinding>(R.layout.activity_screen_four) {
  private val viewModel: ScreenFourVM by viewModels<ScreenFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = ScreenTwoContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtOrCreateaNew.setOnClickListener {
      val destIntent = ScreenFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCREEN_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScreenFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
