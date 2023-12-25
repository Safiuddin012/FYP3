package com.safiuddinsapplication.app.modules.screenfour.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScreenFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterYourUser: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgottenPassw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgotten_passw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrCreateaNew: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_create_a_new)

)
