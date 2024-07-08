package com.whatsapp.walletbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Wallet( var expenseList: List<wallet_data_class>):RecyclerView.Adapter<ExpenseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.wallet_money,parent,false)
        return  ExpenseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {

        val expense = expenseList[position]
        holder.tvName.text = expense.name
        holder.tvAmount.text = expense.amount
        holder.tvDate.text = expense.date
    }

    override fun getItemCount(): Int {
        return expenseList.size
    }
}
class ExpenseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}