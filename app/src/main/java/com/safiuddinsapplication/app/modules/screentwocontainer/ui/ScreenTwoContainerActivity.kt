package com.safiuddinsapplication.app.modules.screentwocontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenTwoContainerBinding
import com.safiuddinsapplication.app.extensions.loadFragment
import com.safiuddinsapplication.app.modules.componentone.ui.ComponentOneFragment
import com.safiuddinsapplication.app.modules.screentwo.ui.ScreenTwoFragment
import com.safiuddinsapplication.app.modules.screentwocontainer.`data`.viewmodel.ScreenTwoContainerVM
import kotlin.String
import kotlin.Unit

class ScreenTwoContainerActivity :
    BaseActivity<ActivityScreenTwoContainerBinding>(R.layout.activity_screen_two_container) {
  private val viewModel: ScreenTwoContainerVM by viewModels<ScreenTwoContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenTwoContainerVM = viewModel
    val destFragment = ScreenTwoFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = ScreenTwoFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearRowclock.setOnClickListener {
      val destFragment = ScreenTwoFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ScreenTwoFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageLock.setOnClickListener {
      val destFragment = ComponentOneFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ComponentOneFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "SCREEN_TWO_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScreenTwoContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
