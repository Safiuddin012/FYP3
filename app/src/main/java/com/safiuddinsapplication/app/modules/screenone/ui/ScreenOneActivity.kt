package com.safiuddinsapplication.app.modules.screenone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenOneBinding
import com.safiuddinsapplication.app.modules.screenfour.ui.ScreenFourActivity
import com.safiuddinsapplication.app.modules.screenone.`data`.viewmodel.ScreenOneVM
import kotlin.String
import kotlin.Unit

class ScreenOneActivity : BaseActivity<ActivityScreenOneBinding>(R.layout.activity_screen_one) {
  private val viewModel: ScreenOneVM by viewModels<ScreenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = ScreenFourActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SCREEN_ONE_ACTIVITY"

    }
  }
