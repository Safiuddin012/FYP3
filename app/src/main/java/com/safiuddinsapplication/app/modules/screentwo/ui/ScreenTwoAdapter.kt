package com.safiuddinsapplication.app.modules.screentwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.databinding.RowScreenTwoBinding
import com.safiuddinsapplication.app.modules.screentwo.`data`.model.ScreenTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ScreenTwoAdapter(
  var list: List<ScreenTwoRowModel>
) : RecyclerView.Adapter<ScreenTwoAdapter.RowScreenTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowScreenTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_screen_two,parent,false)
    return RowScreenTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowScreenTwoVH, position: Int) {
    val screenTwoRowModel = ScreenTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val screenTwoRowModel = list[position]
    holder.binding.screenTwoRowModel = screenTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ScreenTwoRowModel>) {
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
      item: ScreenTwoRowModel
    ) {
    }
  }

  inner class RowScreenTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowScreenTwoBinding = RowScreenTwoBinding.bind(itemView)
  }
}
