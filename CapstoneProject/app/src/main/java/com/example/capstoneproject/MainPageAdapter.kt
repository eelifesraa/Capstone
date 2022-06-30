package com.info.upschoolcapstone1

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.capstoneproject.R
import com.example.capstoneproject.databinding.MainPageItemBinding

class MainPageAdapter
    (var products: List<Product>) : RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MainPageItemBinding.inflate(inflater, parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.binding.apply {
            productTitleTextView.text = product.productName
            productPriceTextView.text = "$" + product.price
            Glide.with(this.root).load(product.image).into(productImageView)
            productCardView.setOnClickListener {
                findNavController(it).navigate(R.id.action_mainPageFragment3_to_productCardFragment)
            }
           /* productCardView.setOnClickListener {
                /*val action = MainPageFragmentDirections.mainPageswitchtoProductCard(product)
                Navigation.findNavController(it).navigate(action)*/
            }*/
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}


class ProductViewHolder(val binding: MainPageItemBinding) :
    RecyclerView.ViewHolder(binding.root)