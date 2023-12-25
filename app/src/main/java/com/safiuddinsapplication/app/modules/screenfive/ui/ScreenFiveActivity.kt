package com.safiuddinsapplication.app.modules.screenfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenFiveBinding
import com.safiuddinsapplication.app.modules.screenfive.`data`.model.ScreenFiveRowModel
import com.safiuddinsapplication.app.modules.screenfive.`data`.viewmodel.ScreenFiveVM
import com.safiuddinsapplication.app.modules.screenfour.ui.ScreenFourActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScreenFiveActivity : BaseActivity<ActivityScreenFiveBinding>(R.layout.activity_screen_five) {
  private val viewModel: ScreenFiveVM by viewModels<ScreenFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val screenFiveAdapter = ScreenFiveAdapter(viewModel.screenFiveList.value?:mutableListOf())
    binding.recyclerScreenFive.adapter = screenFiveAdapter
    screenFiveAdapter.setOnItemClickListener(
    object : ScreenFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ScreenFiveRowModel) {
        onClickRecyclerScreenFive(view, position, item)
      }
    }
    )
    viewModel.screenFiveList.observe(this) {
      screenFiveAdapter.updateData(it)
    }
    binding.screenFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignUp.setOnClickListener {
      val destIntent = ScreenFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerScreenFive(
    view: View,
    position: Int,
    item: ScreenFiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SCREEN_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScreenFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
