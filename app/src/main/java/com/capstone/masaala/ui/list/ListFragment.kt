package com.capstone.masaala.ui.list

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.capstone.masaala.R
import com.capstone.masaala.data.adapter.DummyAdapter
import com.capstone.masaala.data.dummy.DummyItem
import com.capstone.masaala.data.dummy.DummyItemData
import com.capstone.masaala.databinding.FragmentHomeBinding
import com.capstone.masaala.databinding.FragmentListBinding
import com.capstone.masaala.ui.image.ImageActivity

class ListFragment : Fragment() {

    private lateinit var dummyAdapter: DummyAdapter
    private var item = ArrayList<DummyItem>()
    private var _binding: FragmentListBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        item.addAll(DummyItemData.listData)

        binding.rvSpice.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            dummyAdapter = DummyAdapter(item)
            adapter = dummyAdapter
        }

    }
}