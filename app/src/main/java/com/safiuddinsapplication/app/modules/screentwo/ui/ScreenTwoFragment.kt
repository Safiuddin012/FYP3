package com.safiuddinsapplication.app.modules.screentwo.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseFragment
import com.safiuddinsapplication.app.databinding.FragmentScreenTwoBinding
import com.safiuddinsapplication.app.modules.screentwo.`data`.model.ScreenTwoRowModel
import com.safiuddinsapplication.app.modules.screentwo.`data`.viewmodel.ScreenTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScreenTwoFragment : BaseFragment<FragmentScreenTwoBinding>(R.layout.fragment_screen_two) {
  private val viewModel: ScreenTwoVM by viewModels<ScreenTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val screenTwoAdapter = ScreenTwoAdapter(viewModel.screenTwoList.value?:mutableListOf())
    binding.recyclerScreenTwo.adapter = screenTwoAdapter
    screenTwoAdapter.setOnItemClickListener(
    object : ScreenTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ScreenTwoRowModel) {
        onClickRecyclerScreenTwo(view, position, item)
      }
    }
    )
    viewModel.screenTwoList.observe(requireActivity()) {
      screenTwoAdapter.updateData(it)
    }
    binding.screenTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerScreenTwo(
    view: View,
    position: Int,
    item: ScreenTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SCREEN_TWO_FRAGMENT"


    fun getInstance(bundle: Bundle?): ScreenTwoFragment {
      val fragment = ScreenTwoFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
