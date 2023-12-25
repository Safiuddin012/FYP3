package com.safiuddinsapplication.app.modules.screennine.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.databinding.RowScreenNineBinding
import com.safiuddinsapplication.app.modules.screennine.`data`.model.ScreenNineRowModel
import kotlin.Int
import kotlin.collections.List

class ScreenNineAdapter(
  var list: List<ScreenNineRowModel>
) : RecyclerView.Adapter<ScreenNineAdapter.RowScreenNineVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowScreenNineVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_screen_nine,parent,false)
    return RowScreenNineVH(view)
  }

  override fun onBindViewHolder(holder: RowScreenNineVH, position: Int) {
    val screenNineRowModel = ScreenNineRowModel()
    // TODO uncomment following line after integration with data source
    // val screenNineRowModel = list[position]
    holder.binding.screenNineRowModel = screenNineRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ScreenNineRowModel>) {
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
      item: ScreenNineRowModel
    ) {
    }
  }

  inner class RowScreenNineVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowScreenNineBinding = RowScreenNineBinding.bind(itemView)
    init {
      binding.btnCurrentPasswordOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ScreenNineRowModel())
      }
    }
  }
}
