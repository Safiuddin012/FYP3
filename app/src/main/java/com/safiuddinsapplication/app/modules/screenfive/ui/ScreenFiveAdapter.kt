package com.safiuddinsapplication.app.modules.screenfive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.databinding.RowScreenFiveBinding
import com.safiuddinsapplication.app.modules.screenfive.`data`.model.ScreenFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ScreenFiveAdapter(
  var list: List<ScreenFiveRowModel>
) : RecyclerView.Adapter<ScreenFiveAdapter.RowScreenFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowScreenFiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_screen_five,parent,false)
    return RowScreenFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowScreenFiveVH, position: Int) {
    val screenFiveRowModel = ScreenFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val screenFiveRowModel = list[position]
    holder.binding.screenFiveRowModel = screenFiveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ScreenFiveRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ScreenFiveRowModel
    ) {
    }
  }

  inner class RowScreenFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowScreenFiveBinding = RowScreenFiveBinding.bind(itemView)
    init {
      binding.btnPassword.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ScreenFiveRowModel())
      }
    }
  }
}
