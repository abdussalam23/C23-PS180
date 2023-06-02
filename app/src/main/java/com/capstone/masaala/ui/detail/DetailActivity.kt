package com.capstone.masaala.ui.detail

import android.nfc.NfcAdapter.EXTRA_DATA
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.bumptech.glide.Glide
import com.capstone.masaala.data.dummy.DummyItem
import com.capstone.masaala.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemData = intent.getParcelableExtra<DummyItem>(EXTRA_DATA) as DummyItem
        binding.apply {
            ivSpice.let { ivSpice ->
                Glide.with(this@DetailActivity)
                    .load(itemData.picture)
                    .into(ivSpice)
            }
            tvSpice.text = itemData.name
            tvSpiceDesc.text = itemData.desc
        }
    }
}