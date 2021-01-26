package ru.giovanny.gfilms

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_for_film.*
import kotlinx.android.synthetic.main.fragment_for_film.view.*
import kotlin.jvm.java as java

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmemForFilm.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentForFilm : Fragment() {
  // TODO: Rename and change types of parameters
  private var param1: String? = null
  private var param2: String? = null

  private lateinit var aView: View

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    arguments?.let {
      param1 = it.getString(ARG_PARAM1)
      param2 = it.getString(ARG_PARAM2)
    }
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {


    aView  = inflater!!.inflate(R.layout.fragment_for_film, container, false)

    savedInstanceState?.getInt("COLOR_NAME_FILM")?.let {
      aView.nameFilm.setBackgroundColor( it )
    }

    aView.btnMore.setOnClickListener { view ->
      aView.nameFilm.setBackgroundColor(  Color.YELLOW )

      activity?.let{
        val aIntentDetailFilm = Intent (it, DetailFilm::class.java)
        it.startActivity(aIntentDetailFilm)
      }
    }

    // Return the fragment view/layout
    return aView
  }

  override fun onSaveInstanceState(outState: Bundle) {
    super.onSaveInstanceState(outState)

    val aDraw : Drawable = aView.nameFilm.background
    val aColor : Int = (aDraw as ColorDrawable).color
    outState.putInt("COLOR_NAME_FILM", aColor)
  }

  companion object {
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentForFilm.
     */
    // TODO: Rename and change types and number of parameters
    @JvmStatic
    fun newInstance(param1: String, param2: String) =
      FragmentForFilm().apply {
        arguments = Bundle().apply {
          putString(ARG_PARAM1, param1)
          putString(ARG_PARAM2, param2)
        }
      }
  }
}