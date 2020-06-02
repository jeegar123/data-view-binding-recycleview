package com.app.demodataviewbinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

data class User(var name: String, var email: String, var imageUrl: String) {


}
@BindingAdapter("android:imageUrl")
fun setImage(image: ImageView, url: String) {
    Picasso.get().load(url).into(image)
}