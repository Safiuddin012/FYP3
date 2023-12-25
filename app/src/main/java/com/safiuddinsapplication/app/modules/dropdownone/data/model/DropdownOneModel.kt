package com.safiuddinsapplication.app.modules.dropdownone.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DropdownOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_seconds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_seconds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_90_seconds)

)
