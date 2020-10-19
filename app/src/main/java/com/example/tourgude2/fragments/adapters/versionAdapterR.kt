package com.example.tourgude2.fragments.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tourgude2.R
import com.example.tourgude2.versionR


class versionAdapterR(val versionList: List<versionR>) :
    RecyclerView.Adapter<versionAdapterR.versionVH>() {
    class versionVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imageItem: ImageView = itemView.findViewById(R.id.image_item)
        var nameTxt: TextView = itemView.findViewById(R.id.name)
        var district: TextView = itemView.findViewById(R.id.district)
        var couisine: TextView = itemView.findViewById(R.id.couisine)
        var average: TextView = itemView.findViewById(R.id.average)
        var workTime: TextView = itemView.findViewById(R.id.workTime)
        var location: TextView = itemView.findViewById(R.id.location)
        var number: TextView = itemView.findViewById(R.id.number)

        var arrow_up: ImageView = itemView.findViewById(R.id.arrow_up)
        var arrow_down: ImageView = itemView.findViewById(R.id.arrow_down)

        var linearLayTxt: LinearLayout = itemView.findViewById(R.id.linaerlay1)
        var expandableTxt: RelativeLayout = itemView.findViewById(R.id.expandable_id)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): versionVH {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_view_item_rest, parent, false)
        return versionVH(v)
    }

    override fun getItemCount(): Int {
        return versionList.size
    }

    override fun onBindViewHolder(holder: versionVH, position: Int) {

        val version: versionR = versionList[position]
        holder.nameTxt.text = version.name
        holder.district.text = version.disctrict
        holder.couisine.text = version.cuisine
        holder.average.text = version.avearage
        holder.number.text = version.number
        holder.location.text = version.location
        holder.workTime.text = version.workTime
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


    }

}

