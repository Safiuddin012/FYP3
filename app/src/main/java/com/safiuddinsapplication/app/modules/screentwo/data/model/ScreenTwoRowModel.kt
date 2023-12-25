package com.safiuddinsapplication.app.modules.screentwo.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTrainingSessio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_training_sessio)

)
