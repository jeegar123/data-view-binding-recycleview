package com.app.demodataviewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.demodataviewbinding.databinding.ItemViewBinding

class UserAdapter(private var userList: List<User>) : RecyclerView.Adapter<UserAdapter.MyHolder>() {

    class MyHolder(val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemViewBinding.inflate(layoutInflater)
        return MyHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.binding.user = userList[position]
        holder.binding.executePendingBindings()
    }

}




