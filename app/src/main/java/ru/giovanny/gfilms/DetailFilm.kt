package ru.giovanny.gfilms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable

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

    intent.getStringExtra("IMAG_SECOND_ACT")?.let {
      if (it.equals( R.id.details_fragment1.toString()) )
       findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id01 )
      else if (it.equals( R.id.details_fragment2.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id02 )
      else if (it.equals( R.id.details_fragment3.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id03 )
      else if (it.equals( R.id.details_fragment4.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id04 )
      else if (it.equals( R.id.details_fragment5.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id05 )
      else if (it.equals( R.id.details_fragment6.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id06 )
      else if (it.equals( R.id.details_fragment7.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id07 )
      else if (it.equals( R.id.details_fragment8.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id08 )
      else if (it.equals( R.id.details_fragment9.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id09 )
      else if (it.equals( R.id.details_fragment10.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id10 )
      else if (it.equals( R.id.details_fragment11.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id11 )
      else if (it.equals( R.id.details_fragment12.toString()) )
        findViewById<ImageView>(R.id.imageViewFilm).setImageResource(  R.drawable.logo_film_id12 )


    }
  }

}