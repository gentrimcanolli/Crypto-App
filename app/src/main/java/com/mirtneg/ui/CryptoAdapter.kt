package com.mirtneg.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mirtneg.data.models.CryptoElements
import com.mirtneg.databinding.ListCryptoItemsBinding

class CryptoAdapter : RecyclerView.Adapter<CryptoAdapter.ViewHolder>() {

    class ViewHolder(val binding: ListCryptoItemsBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    var cryptoItem: List<CryptoElements> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ListCryptoItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        with(holder.binding) {
            symbolTv.text = cryptoItem[position].symbol
            countTv.text = cryptoItem[position].count
            priceChangeTv.text = cryptoItem[position].priceChange
            priceChangePercentTv.text = cryptoItem[position].priceChangePercent
            lastPriceTv.text = cryptoItem[position].lastPrice
            volumeTv.text = cryptoItem[position].volume
        }
    }

    override fun getItemCount(): Int = cryptoItem.size


}