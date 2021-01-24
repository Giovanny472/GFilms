package ru.giovanny.gfilms

import android.view.View

//  интерфейс фильма
interface IGFilm{
  fun id():Int
  fun name():String
  fun description():String
  fun image(): Int
}

// список фильмов
interface IGFilms{
  fun item(AIdx:Int):IGFilm
  fun count():Int
}

// реалиизаци фильма
data class GFilm(val AId:Int, val AName:String, val ADescrption:String, val AImage:Int) : IGFilm {

  override fun id(): Int {
    return  AId
  }

  override fun name():String {
    return AName
  }

  override fun description():String {
    return ADescrption
  }

  override fun image():Int {
    return AImage
  }

}

// реализация списков фильмов
class GFilms(private val AListFilms: List<IGFilm>) : IGFilms{

  override fun item(AIdx:Int):IGFilm{
    return AListFilms.get(AIdx)
  }

  override fun count():Int{
    return  AListFilms.size -1
  }

}

// фабрика для создание списков фильмов
class FactoryGFilms() {

  fun Make(): IGFilms{

    val aListFilms: List<IGFilm> = listOf( GFilm(R.id.details_fragment1, "На игле", "История четырёх друзей-наркоманов в Эдинбурге 1990-х годов. Кто-то из них пытается завязать, а кто-то озабочен только тем как достать очередную дозу." , R.drawable.logo_film_id01 ),
                                           GFilm(R.id.details_fragment2, "Однаждый в голливуде", "Голливуд, 1969. Кинозвезда прошлого десятилетия Рик Далтон переживает творческий застой, что сказывается и на состоянии его личного дублера Клиффа Бута" , R.drawable.logo_film_id02 ),
                                           GFilm(R.id.details_fragment3, "Бессладные ублюдки", "В оккупированной немцами Франции группа американских солдат-евреев наводит страх на нацистов, жестоко убивая и скальпируя солдат." , R.drawable.logo_film_id03),
                                           GFilm(R.id.details_fragment4, "Матрица", "Мир Матрицы — это иллюзия, существующая только в бесконечном сне обреченного человечества." , R.drawable.logo_film_id04 ),
                                           GFilm(R.id.details_fragment5, "Зеленая книга", "Джазмен Дон Ширли готовится к турне по штатам, где особенно сильны расистские настроения, чтобы доказать, что чернокожие — вовсе не второй сорт. " , R.drawable.logo_film_id05 ),
                                           GFilm(R.id.details_fragment6, "Хаброе сердце", "Действие фильма начинается в 1280 году в Шотландии. Это история легендарного национального героя Уильяма Уолласа, посвятившего себя борьбе с англичанами при короле Эдварде Длинноногом." , R.drawable.logo_film_id06 ),
                                           GFilm(R.id.details_fragment7, "Большой куш", "Четырехпалый Френки должен был переправить краденый алмаз из Англии в США своему боссу Эви. Но вместо этого герой попадает в эпицентр больших неприятностей. " , R.drawable.logo_film_id07 ),
                                           GFilm(R.id.details_fragment8, "Знакомьтесь, Джо Блэк", "В жизни богатого и влиятельного газетного магната Уильяма Пэрриша появляется сама Смерть, принявшая обличье обворожительного молодого человека по имени Джо Блэк. " , R.drawable.logo_film_id08 ),
                                           GFilm(R.id.details_fragment9, "Побег из Шоушенка", "Энди Дюфрейна, вице-президента крупного банка, приговорили к двум пожизненным заключениям по ложному обвинению в убийстве жены и ее любовника. Его отправляют в тюрьму Шоушенк. " , R.drawable.logo_film_id09 ),
                                           GFilm(R.id.details_fragment10, "Спасти рядового Райана", "Командование приняло решение демобилизовать Райана и отправить его на родину к безутешной матери. Но для того, чтобы найти и спасти солдата, крошечному отряду придется пройти через все круги ада" , R.drawable.logo_film_id10 ),
                                           GFilm(R.id.details_fragment11, "Полночь в Париже", "Писатель и безнадежный романтик, уверенный в том, что должен был жить в 1920-е годы, приезжает в Париж со своей возлюбленной на каникулы и попадает в прошлое." , R.drawable.logo_film_id11 ),
                                           GFilm(R.id.details_fragment12, "Артист", "Голливуд, 1927 год. Звезда немого кино Джордж Валентайн и слышать не хочет о микрофонах на съемочной площадке. А безнадежно влюбленная в Валентайна статистка Пеппи Миллер стремительно набирает популярность в новом звуковом кинематографе." , R.drawable.logo_film_id12 ))

    return GFilms(aListFilms);
  }
}
