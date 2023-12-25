package com.safiuddinsapplication.app.modules.screentwo.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHiMichael: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_michael)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsbegin: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_begin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPracticeSessio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_practice_sessio)

)
