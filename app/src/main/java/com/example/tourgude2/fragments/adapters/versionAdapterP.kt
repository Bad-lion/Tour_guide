package com.example.tourgude2.fragments.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.util.Linkify
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tourgude2.R
import com.example.tourgude2.versionP
import com.example.tourgude2.versionR

class versionAdapterP(val versionList: List<versionP>) :
    RecyclerView.Adapter<versionAdapterP.versionVH>() {
    class versionVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imageItem: ImageView = itemView.findViewById(R.id.image_item)
        var nameTxt: TextView = itemView.findViewById(R.id.name)
        var location: TextView = itemView.findViewById(R.id.location)
        var discrption: TextView = itemView.findViewById(R.id.disciption)
        var linearLayTxt: LinearLayout = itemView.findViewById(R.id.linaerlay1)
        var expandableTxt: RelativeLayout = itemView.findViewById(R.id.expandable_id)

        var arrow_up: ImageView = itemView.findViewById(R.id.arrow_up)
        var arrow_down: ImageView = itemView.findViewById(R.id.arrow_down)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): versionVH {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_view_item_park, parent, false)
        return versionVH(v)
    }

    override fun getItemCount(): Int {
        return versionList.size
    }

    override fun onBindViewHolder(holder: versionVH, position: Int) {

        val version: versionP = versionList[position]
        holder.nameTxt.text = version.name
        holder.discrption.text = version.discrption
        holder.location.text = version.location
        holder.imageItem.setImageResource(version.images1)


        var isExpandable: Boolean = versionList[position].expandable
        holder.expandableTxt.visibility = if (isExpandable) View.VISIBLE else View.GONE
        holder.arrow_down.visibility = if (!isExpandable) View.VISIBLE else View.GONE
        holder.arrow_up.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.linearLayTxt.setOnClickListener {
            val version = versionList[position]
            version.expandable = !version.expandable
            notifyItemChanged(position)
        }


        Linkify.addLinks(holder.location, Linkify.MAP_ADDRESSES)

    }

}

