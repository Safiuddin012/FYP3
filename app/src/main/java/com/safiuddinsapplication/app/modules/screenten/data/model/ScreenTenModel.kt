package com.safiuddinsapplication.app.modules.screenten.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenTenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlayback: String? = MyApp.getInstance().resources.getString(R.string.lbl_playback)

)
