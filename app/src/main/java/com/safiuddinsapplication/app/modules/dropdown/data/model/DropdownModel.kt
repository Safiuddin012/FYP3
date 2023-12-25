package com.safiuddinsapplication.app.modules.dropdown.`data`.model

import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DropdownModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMenuitemlabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_talha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenuitemlabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_john)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_polish_pope)

)
