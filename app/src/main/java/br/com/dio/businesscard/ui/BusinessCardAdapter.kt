package br.com.dio.businesscard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.dio.businesscard.R
import br.com.dio.businesscard.data.BusinessCard

class BusinessCardAdapter(
    private val businessCardList: List<BusinessCard>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount() = businessCardList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_business_card, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(businessCardList[position])
    }


    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(businessCard: BusinessCard) {
            //itemView.tvNameOfMonth.text = convertTimeInMillisToBrDate(bitcoinValue)
            //itemView.tvBitcoinRateValue.text = bitcoinValue.y.toString()
        }
    }

}