package com.safiuddinsapplication.app.modules.screeneight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenEightBinding
import com.safiuddinsapplication.app.modules.screeneight.`data`.viewmodel.ScreenEightVM
import com.safiuddinsapplication.app.modules.screenfour.ui.ScreenFourActivity
import kotlin.String
import kotlin.Unit

class ScreenEightActivity : BaseActivity<ActivityScreenEightBinding>(R.layout.activity_screen_eight)
    {
  private val viewModel: ScreenEightVM by viewModels<ScreenEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnStart.setOnClickListener {
      val destIntent = ScreenFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCREEN_EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScreenEightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
