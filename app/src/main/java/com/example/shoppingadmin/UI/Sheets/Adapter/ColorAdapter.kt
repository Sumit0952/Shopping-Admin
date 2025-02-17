package com.example.shoppingadmin.UI.Sheets.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingadmin.UI.Sheets.ProductModels.ProductColor
import com.example.shoppingadmin.databinding.ColorItemBinding

class ColorAdapter(var colorList: ArrayList<ProductColor>, var context: Context) :
    RecyclerView.Adapter<ColorAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: ColorItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            val model = colorList[position]
            binding.apply {
                productColorCode.setBackgroundColor(model.colorCode!!)
                productColorName.text = model.colorName
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorAdapter.ViewHolder {
        var binding = ColorItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ColorAdapter.ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return colorList.size
    }
}