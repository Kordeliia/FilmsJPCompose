package com.cursosandroidant.filmsjcref.dataAccess

import com.nunchacreations.filmslau.Film

/****
 * Project: Films JC Ref
 * From: com.cursosandroidant.filmsjcref.entities
 * Created by Alain Nicolás Tello on 26/10/22 at 16:55
 * All rights reserved 2022.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * And Frogames formación:
 * https://cursos.frogamesformacion.com/pages/instructor-alain-nicolas
 *
 * Web: www.alainnicolastello.com
 ***/
object FakeDatabase {
    fun getAllFilms() = listOf<Film>(
        Film("Interstellar",2014 ,mutableListOf("Matthew McConaughey","Anne Hathaway", "David Gyasi"),"In 2067, ex-NASA pilot Cooper is forced to work as a farmer due to a global famine caused by blight. He ignores his daughter, Murph, when she claims a ghost is communicating to her through her bookshelf, but later finds dust particles forming an inexplicable pattern on Murph's bedroom floor. ",
            8, "https://upload.wikimedia.org/wikipedia/en/b/bc/Interstellar_film_poster.jpg", mutableListOf("Sci-Fi","Drama", "Adventures") ),
        Film("Godzilla vs Kong", 2021, mutableListOf("Alexander Skarsgård","Rebecca Hall", "Demian Bichir"),"An iguana nest is exposed to the fallout of a military nuclear test in French Polynesia. In the South Pacific Ocean, a Japanese fishing vessel is suddenly attacked by a giant creature, with only one fisherman surviving.",
            5, "https://upload.wikimedia.org/wikipedia/en/thumb/2/2e/Godzilla_%281998_Movie_Poster%29.jpg/220px-Godzilla_%281998_Movie_Poster%29.jpg",mutableListOf("Sci-Fi","Action", "Fantasy") ),
        Film("Gran Torino",2008 ,mutableListOf("Clint Eastwood","Christopher Carley", "Bee Vang"), "Cantankerous, bigoted Korean War veteran and retired Ford factory worker Walt Kowalski is widowed after 50 years of marriage.",
            8, "https://upload.wikimedia.org/wikipedia/en/thumb/c/c6/Gran_Torino_poster.jpg/220px-Gran_Torino_poster.jpg", mutableListOf("Drama")),
        Film("Pride & Prejudice", 2005,mutableListOf("Keira Knightley","Matthew Macfadyen", "Brenda Blethyn"),"During the late 18th century, Mr. and Mrs. Bennet and their daughters – Jane, Elizabeth, Mary, Kitty, and Lydia.",
            7, "https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Prideandprejudiceposter.jpg/220px-Prideandprejudiceposter.jpg", mutableListOf("Romance","Drama", "Romantic Drama")),
        Film("Split",2016,mutableListOf("James McAvoy","Anya Taylor-Joy", "Betty Buckley"), "Kevin Wendell Crumb, a man struggling with dissociative identity disorder (DID) rooted in his history of childhood abuse and abandonment, has been managing living with his 23 distinct personalities well for several years with help from his therapist, Dr. Karen Fletcher.",
            7, "https://upload.wikimedia.org/wikipedia/en/3/31/Split_%282017_film%29.jpg", mutableListOf("Thriller","Drama")),
        Film("Up", 2009, mutableListOf("Ed Asner","Christopher Plummer", "Jordan Nagai"),"As a young boy, 10-year-old Carl Fredricksen idolizes explorer Charles Muntz.",
            8, "https://upload.wikimedia.org/wikipedia/en/0/05/Up_%282009_film%29.jpg", mutableListOf("Animation","Drama", "Adventure", "Comedy")),
        Film("Braveheart", 1995,mutableListOf("Mel Gibson","Sophie Marceau", "Patrick McGoohan"),  "In 1280, King Edward \"Longshanks\" invades and conquers Scotland following the death of Alexander III of Scotland, who left no heir to the throne.",
            8, "https://upload.wikimedia.org/wikipedia/en/thumb/5/55/Braveheart_imp.jpg/220px-Braveheart_imp.jpg", mutableListOf("Adventures","Drama", "Epic")),
        Film("Pitch Perfect",2012,mutableListOf("Anna Kendrick","Brittany Snow", "Rebel Wilson"), "During the 2011 ICCA Finals at the Lincoln Center, Barden University's all-female a cappella group, the Barden Bellas, lose to their all-male rival group, the Barden Treblemakers.",
            6, "https://upload.wikimedia.org/wikipedia/en/b/b9/Pitch_Perfect_movie_poster.jpg", mutableListOf("Comedy","Musical")),
        Film("One day",2011,mutableListOf("Anne Hathaway","Jim Sturgess", "Patricia Clarkson"), "Two friends, on the same day.",
            6, "https://upload.wikimedia.org/wikipedia/en/a/ad/One_Day_Poster.jpg", mutableListOf("Romance","Drama", "Romantic Drama")),
        Film("Troya", 2004,mutableListOf("Brad Pitt","Eric Bana", "Orlando Bloom"),"In Ancient Greece, King Agamemnon of Mycenae finally unites the Greek kingdoms after decades of warfare, forming a loose alliance under his rule.",
            6, "https://upload.wikimedia.org/wikipedia/en/thumb/b/b8/Troy2004Poster.jpg/220px-Troy2004Poster.jpg", mutableListOf("Adventure", "Action", "Epic", "Romantic drama")),
        Film("Bolt", 2008,mutableListOf("John Travolta","Miley Cyrus"),"A White Swiss Shepherd puppy named Bolt is adopted by a 7-year-old girl named Penny.",
            6, "https://upload.wikimedia.org/wikipedia/en/4/44/Bolt_ver2.jpg", mutableListOf("Animation","Comedy", "Adventures", "Action"))
    )
}