package com.app.demodataviewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.demodataviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycleView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recycleView.adapter = UserAdapter(getList())


    }

    fun getList(): List<User> {

        return listOf<User>(
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg"),
            User("Hello", "he@gmail.com", "https://www.gstatic.com/tv/thumb/persons/521400/521400_v9_ba.jpg")

            )


    }
}