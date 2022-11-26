package com.tjsquad.utsppb1

import android.app.DownloadManager.Request
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListUnitAdapter(private val listUnit: ArrayList<Unit>): RecyclerView.Adapter<ListUnitAdapter.ListViewHolder>() {
    inner class ListViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var tvname: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvtype: TextView = itemView.findViewById(R.id.tv_item_type)
        var tvfps: TextView = itemView.findViewById(R.id.tv_item_fps)
        var tvprice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgphoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_unit, parent,false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val unit = listUnit[position]
        Glide.with(holder.itemView.context).load(unit.photo).apply(RequestOptions().override(55,55))
            .into(holder.imgphoto)
        holder.tvname.text = unit.name
        holder.tvtype.text = unit.type
        holder.tvfps.text = unit.fps
        holder.tvprice.text = unit.price
    }
    override fun getItemCount(): Int {
        return listUnit.size
    }
}