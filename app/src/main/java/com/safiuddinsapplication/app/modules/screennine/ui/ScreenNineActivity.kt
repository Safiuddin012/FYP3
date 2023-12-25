package com.safiuddinsapplication.app.modules.screennine.ui

import android.view.View
import androidx.activity.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseActivity
import com.safiuddinsapplication.app.databinding.ActivityScreenNineBinding
import com.safiuddinsapplication.app.modules.screeneight.ui.ScreenEightActivity
import com.safiuddinsapplication.app.modules.screenfour.ui.ScreenFourActivity
import com.safiuddinsapplication.app.modules.screennine.`data`.model.ScreenNineRowModel
import com.safiuddinsapplication.app.modules.screennine.`data`.viewmodel.ScreenNineVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScreenNineActivity : BaseActivity<ActivityScreenNineBinding>(R.layout.activity_screen_nine) {
  private val viewModel: ScreenNineVM by viewModels<ScreenNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val screenNineAdapter = ScreenNineAdapter(viewModel.screenNineList.value?:mutableListOf())
    binding.recyclerScreenNine.adapter = screenNineAdapter
    screenNineAdapter.setOnItemClickListener(
    object : ScreenNineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ScreenNineRowModel) {
        onClickRecyclerScreenNine(view, position, item)
      }
    }
    )
    viewModel.screenNineList.observe(this) {
      screenNineAdapter.updateData(it)
    }
    binding.screenNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = ScreenFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePowerButtonOneTwo.setOnClickListener {
      val destIntent = ScreenEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerScreenNine(
    view: View,
    position: Int,
    item: ScreenNineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SCREEN_NINE_ACTIVITY"

  }
}
