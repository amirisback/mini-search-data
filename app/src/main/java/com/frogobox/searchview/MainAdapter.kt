package com.frogobox.searchview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.searchview.databinding.ItemDataBinding

/*
 * Created by Amir on 23/05/2023
 * My Application Source Code
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2023 FrogoBox Inc.      
 * All rights reserved
 *
 */


class MainAdapter(val data: List<String>) : RecyclerView.Adapter<MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding = ItemDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(data[position])
    }

}