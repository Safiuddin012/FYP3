package com.safiuddinsapplication.app.modules.screensix.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)

)
