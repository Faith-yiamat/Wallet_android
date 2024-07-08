package com.whatsapp.walletbook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.whatsapp.walletbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvAllexpences.layoutManager = LinearLayoutManager(this)
        displayAll()

    }
    fun  displayAll(){
        var salary1 = wallet_data_class("","Salary","KES40,000","1 July 2024")
        var salary2 = wallet_data_class("","Rent","KESI6000","2 July 2024")
        var salary3 = wallet_data_class("","Dividends","KES2400","4 July 2024")
        var salary4 = wallet_data_class("","Electricity","KES800","5 July 2024")
        var salary5 = wallet_data_class("","Internet","KES2500","5 July 2024")
        var salary6 = wallet_data_class("","Shopping","KES3500","5 July 2024")
        var salary7 = wallet_data_class("","Bus fare","KES500","11 July 2024")
        var salary8 = wallet_data_class("","Water bill","KES300","11 July 2024")

        var myexpenses = listOf(salary1,salary2,salary3,salary4,salary5,salary6,salary7,salary8)
        val expenceAdapter = Wallet(myexpenses)
        binding.rvAllexpences.adapter = expenceAdapter

    }

}