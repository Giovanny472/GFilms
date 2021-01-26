package ru.giovanny.gfilms

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_for_film.*


class MainActivity : AppCompatActivity() {

  private lateinit var FFactoryGFilms : FactoryGFilms
  private lateinit var FGFilms : IGFilms

  @SuppressLint("UseCompatLoadingForDrawables")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // создание фабрики
    FFactoryGFilms = FactoryGFilms()

    // создание данных
    FGFilms = FFactoryGFilms.Make()

    for (Iter in 0.. FGFilms.count() ) {

      val fm = getSupportFragmentManager()
      val aGFilm = FGFilms.item(Iter)

      //var aFrg: FragmentForFilm ? =  supportFragmentManager.findFragmentById( R.id.details_fragment1)
      var afrg:FragmentForFilm = fm.findFragmentById( aGFilm.id() ) as FragmentForFilm
      afrg.nameFilm.text = aGFilm.name()
      afrg.imgFilm.setImageResource(  aGFilm.image() )
      afrg.descriptionFilm.text = aGFilm.description().substring(50) + "..."



    }
  }

}