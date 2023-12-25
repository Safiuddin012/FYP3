package com.safiuddinsapplication.app.modules.screenthree.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPracticeSessio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_practice_sessio)

)
