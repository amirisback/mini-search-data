package com.frogobox.searchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.LinearLayoutManager
import com.frogobox.searchview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val listNameOfPeople: MutableList<String> = Constant.listNameOfPeople.toMutableList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            etMain.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                    setupRV(listNameOfPeople.filter  {
                        it.contains(s.toString(), true)
                    })
                }

                override fun afterTextChanged(s: Editable?) {

                }
            })



        }
    }

    private fun setupRV(data: List<String>) {
        binding.rvMain.apply {
            adapter = MainAdapter(data)
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
    }

}