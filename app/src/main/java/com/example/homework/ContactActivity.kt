package com.example.homework

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.materialswitch.MaterialSwitch

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val favoriteButton = findViewById<MaterialButton>(R.id.contact_favorite)
        val imageSwitch = findViewById<MaterialSwitch>(R.id.contact_photo_switch)
        val avatar = findViewById<ImageView>(R.id.contact_avatar)

        favoriteButton.setOnClickListener { v ->
            favoriteButton.isSelected = !favoriteButton.isSelected
        }

        imageSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                avatar.visibility = View.GONE
            } else {
                avatar.visibility = View.VISIBLE
            }
        }
    }

}