package ru.giovanny.gfilms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailFilm : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail_film)

    intent.getStringExtra("TITLE_SECOND_ACT")?.let {
      findViewById<TextView>(R.id.textViewNameFilm ).text = it
    }

    intent.getStringExtra("DESCRIP_SECOND_ACT")?.let {
      findViewById<TextView>(R.id.textViewDescripFilm ).text = it
    }
  }

}