package com.safiuddinsapplication.app.modules.componentone.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.base.BaseFragment
import com.safiuddinsapplication.app.databinding.FragmentComponentOneBinding
import com.safiuddinsapplication.app.modules.componentone.`data`.model.ListsubtractOneRowModel
import com.safiuddinsapplication.app.modules.componentone.`data`.viewmodel.ComponentOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ComponentOneFragment :
    BaseFragment<FragmentComponentOneBinding>(R.layout.fragment_component_one) {
  private val viewModel: ComponentOneVM by viewModels<ComponentOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listsubtractOneAdapter =
    ListsubtractOneAdapter(viewModel.listsubtractOneList.value?:mutableListOf())
    binding.recyclerListsubtractOne.adapter = listsubtractOneAdapter
    listsubtractOneAdapter.setOnItemClickListener(
    object : ListsubtractOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsubtractOneRowModel) {
        onClickRecyclerListsubtractOne(view, position, item)
      }
    }
    )
    viewModel.listsubtractOneList.observe(requireActivity()) {
      listsubtractOneAdapter.updateData(it)
    }
    binding.componentOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsubtractOne(
    view: View,
    position: Int,
    item: ListsubtractOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMPONENT_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ComponentOneFragment {
      val fragment = ComponentOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
