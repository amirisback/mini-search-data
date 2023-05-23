package com.frogobox.searchview

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
class MainHolder(private val binding: ItemDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: String) {
        binding.tvItemData.text = data
    }

}