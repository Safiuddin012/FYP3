package com.safiuddinsapplication.app.modules.componentone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.safiuddinsapplication.app.R
import com.safiuddinsapplication.app.databinding.RowListsubtractOneBinding
import com.safiuddinsapplication.app.modules.componentone.`data`.model.ListsubtractOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListsubtractOneAdapter(
  var list: List<ListsubtractOneRowModel>
) : RecyclerView.Adapter<ListsubtractOneAdapter.RowListsubtractOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsubtractOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsubtract_one,parent,false)
    return RowListsubtractOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListsubtractOneVH, position: Int) {
    val listsubtractOneRowModel = ListsubtractOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listsubtractOneRowModel = list[position]
    holder.binding.listsubtractOneRowModel = listsubtractOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsubtractOneRowModel>) {
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
      item: ListsubtractOneRowModel
    ) {
    }
  }

  inner class RowListsubtractOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsubtractOneBinding = RowListsubtractOneBinding.bind(itemView)
  }
}
