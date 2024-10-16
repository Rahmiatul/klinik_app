package com.rahmi.klinik_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rahmi.klinik_app.R
import com.rahmi.klinik_app.model.ModelListDoctors

class AdapterListDoctors(private val doctorList: List<ModelListDoctors>) :
    RecyclerView.Adapter<AdapterListDoctors.MyViewHolder>() {

    // ViewHolder class to hold the views for each item
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgDoctors: ImageView = itemView.findViewById(R.id.imgDoctor2)
        val txtNamaDoctors: TextView = itemView.findViewById(R.id.nameDoctor)
        val txtSpecialist: TextView = itemView.findViewById(R.id.bidangDoctor)
        val txtReview: TextView = itemView.findViewById(R.id.angkaReview)
        val txtRating: TextView = itemView.findViewById(R.id.totalReview) // Fix here
    }

    // Inflate the item layout and return a new ViewHolder instance
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doctor, parent, false) // Use your layout file name here
        return MyViewHolder(nView)
    }

    // Return the total count of items
    override fun getItemCount(): Int {
        return doctorList.size
    }

    // Bind data to the views in the ViewHolder
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentDoctor = doctorList[position]

        holder.txtNamaDoctors.text = currentDoctor.namaDr
        holder.imgDoctors.setImageResource(currentDoctor.imageDr)
        holder.txtSpecialist.text = currentDoctor.bidangDr
        holder.txtReview.text = currentDoctor.totalReview
        holder.txtRating.text = currentDoctor.angkaReview.toString() // Displaying the rating value
    }
}