package com.dreamcode.listview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewicon.R
import com.example.listviewicon.model.BahasaPemrograman


class ListBahasaAdapter(private val listBahasa: ArrayList<BahasaPemrograman>) : RecyclerView.Adapter<ListBahasaAdapter.BahasaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BahasaViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_bahasa, parent, false)
        return BahasaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBahasa.size
    }

    override fun onBindViewHolder(holder: BahasaViewHolder, position: Int) {
        val bahasa = listBahasa[position]
        holder.tvName.text = bahasa.name
        holder.tvDetail.text = bahasa.detail
        Glide.with(holder.itemView.context)
            .load(bahasa.poster)
            .into(holder.imgPoster)
    }

    inner class BahasaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}