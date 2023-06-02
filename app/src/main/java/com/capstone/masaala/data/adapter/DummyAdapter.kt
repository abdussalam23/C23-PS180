package com.capstone.masaala.data.adapter

import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_DATA
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.capstone.masaala.data.dummy.DummyItem
import com.capstone.masaala.databinding.ItemSpiceBinding

class DummyAdapter(private val dummyList: ArrayList<DummyItem>) : RecyclerView.Adapter<DummyAdapter.DummyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): DummyViewHolder {
        val binding = ItemSpiceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DummyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DummyViewHolder, position: Int) {
        holder.bind(dummyList[position])
    }

    override fun getItemCount(): Int = dummyList.size

    inner class DummyViewHolder(private val binding: ItemSpiceBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: DummyItem) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(item.picture)
                    .into(ivSpice)
                tvSpice.text = item.name
                tvSpiceDesc.text = item.desc
                /*itemView.setOnClickListener {
                    val mIntent = Intent(itemView.context, DetailActivity::class.java)
                    mIntent.putExtra(EXTRA_DATA, item)
                    itemView.context.startActivity(mIntent)
                }*/
            }
        }
    }

}