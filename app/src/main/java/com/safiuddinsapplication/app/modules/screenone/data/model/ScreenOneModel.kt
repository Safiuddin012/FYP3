package com.safiuddinsapplication.app.modules.screenone.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCricket: String? = MyApp.getInstance().resources.getString(R.string.lbl_cricket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCrickettrainin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cricket_trainin)

)
