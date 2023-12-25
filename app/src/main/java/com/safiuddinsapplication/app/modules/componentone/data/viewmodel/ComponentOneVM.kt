package com.safiuddinsapplication.app.modules.componentone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.safiuddinsapplication.app.modules.componentone.`data`.model.ComponentOneModel
import com.safiuddinsapplication.app.modules.componentone.`data`.model.ListsubtractOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ComponentOneVM : ViewModel(), KoinComponent {
  val componentOneModel: MutableLiveData<ComponentOneModel> = MutableLiveData(ComponentOneModel())

  var navArguments: Bundle? = null

  val listsubtractOneList: MutableLiveData<MutableList<ListsubtractOneRowModel>> =
      MutableLiveData(mutableListOf())
}
