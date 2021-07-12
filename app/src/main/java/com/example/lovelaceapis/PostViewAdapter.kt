package com.example.lovelaceapis

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostViewAdapter(var data: List<Post>, var context:Context):RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val dataitem=LayoutInflater.from(parent.context).inflate(R.layout.post_list_item,parent,false)
        return PostViewHolder(dataitem)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentItem=data.get(position)
        holder.tvUserid.text=currentItem.userId
        holder.tvId.text=currentItem.id
        holder.tvtitle.text=currentItem.title
        holder.tvbody.text=currentItem.body

    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class PostViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvUserid=itemView.findViewById<TextView>(R.id.tvuserid)
    var tvId=itemView.findViewById<TextView>(R.id.tvid)
    var tvtitle=itemView.findViewById<TextView>(R.id.tvtittle)
    var tvbody=itemView.findViewById<TextView>(R.id.tvbody)

}