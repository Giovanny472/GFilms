package ru.giovanny.gfilms

interface IGFilm{
  fun id():Int
  fun name():String
  fun description():String
  fun image():String
}

interface IGFilms{
  fun item(AIdx:Int):IGFilm
  fun count():Int
}

data class GFilm(val AId: Int, val AName:String, val ADescrption:String, val AImage:String) : IGFilm {

  override fun id():Int {
    return  AId
  }

  override fun name():String {
    return AName
  }

  override fun description():String {
    return ADescrption
  }

  override fun image():String {
    return AImage
  }

}

class GFilms(private val AListFilms: List<IGFilm>) : IGFilms{

  override fun item(AIdx:Int):IGFilm{
    return AListFilms.get(AIdx)
  }

  override fun count():Int{
    return  AListFilms.size
  }

}
