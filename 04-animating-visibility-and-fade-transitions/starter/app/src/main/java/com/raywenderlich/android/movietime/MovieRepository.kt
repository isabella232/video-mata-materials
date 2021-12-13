/*
 * Copyright (c) 2021 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.movietime

object MovieRepository {

  val allMovies = listOf(
      MovieModel(
          id = 1,
          name = "Dune",
          posterLink = "https://image.tmdb.org/t/p/w200/d5NXSklXo0qyIYkgV94XAgMIckC.jpg",
          summary = "Paul Atreides, a brilliant and gifted young man born into a great destiny beyond his understanding, must travel to the most dangerous planet in the universe to ensure the future of his family and his people. As malevolent forces explode into conflict over the planet's exclusive supply of the most precious resource in existence-a commodity capable of unlocking humanity's greatest potential-only those who can conquer their fear will survive.",
          ratings = 8.1f,
          releaseDate = "2021-09-15"
      ),
      MovieModel(
          id = 2,
          name = "Venom: Let There Be Carnage",
          posterLink = "https://image.tmdb.org/t/p/w200//rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
          summary = "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
          ratings = 7f,
          releaseDate = "2021-09-30"
      ),
      MovieModel(
          id = 3,
          name = "Halloween Kills",
          posterLink = "https://image.tmdb.org/t/p/w200/qmJGd5IfURq8iPQ9KF3les47vFS.jpg",
          summary = "Minutes after Laurie Strode, her daughter Karen and granddaughter Allyson left masked monster Michael Myers caged and burning in Laurie's basement, Laurie is rushed to the hospital with life-threatening injuries, believing she finally killed her lifelong tormentor. But when Michael manages to free himself from Laurie's trap, his ritual bloodbath resumes. As Laurie fights her pain and prepares to defend herself against him, she inspires all of Haddonfield to rise up against their unstoppable monster. The Strode women join a group of other survivors of Michael's first rampage who decide to take matters into their own hands, forming a vigilante mob that sets out to hunt Michael down, once and for all.",
          ratings = 7.3f,
          releaseDate = "2021-10-14"
      ),
      MovieModel(
          id = 4,
          name = "Free Guy",
          posterLink = "https://image.tmdb.org/t/p/w200/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg",
          summary = "A bank teller called Guy realizes he is a background character in an open world video game called Free City that will soon go offline.",
          ratings = 7.8f,
          releaseDate = "2021-08-11"
      ),
      MovieModel(
          id = 5,
          name = "The Vault",
          posterLink = "https://image.tmdb.org/t/p/w200/iiHubBBVFg6K7t5THdsImqy1ct2.jpg",
          summary = "When an engineer learns of a mysterious, impenetrable fortress hidden under The Bank of Spain, he joins a crew of master thieves who plan to steal the legendary lost treasure locked inside while the whole country is distracted by Spain's World Cup Final. With thousands of soccer fans cheering in the streets, and security forces closing in, the crew have just minutes to pull off the score of a lifetime.",
          ratings = 7.1f,
          releaseDate = "2021-03-03"
      ),
      MovieModel(
          id = 6,
          name = "Venom",
          posterLink = "https://image.tmdb.org/t/p/w200/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg",
          summary = "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
          ratings = 6.8f,
          releaseDate = "2018-09-28"
      ),
      MovieModel(
          id = 7,
          name = "The Addams Family 2",
          posterLink = "https://image.tmdb.org/t/p/w200/ld7YB9vBRp1GM1DT3KmFWSmtBPB.jpg",
          summary = "The Addams get tangled up in more wacky adventures and find themselves involved in hilarious run-ins with all sorts of unsuspecting characters.",
          ratings = 7.5f,
          releaseDate = "2021-10-01"
      ),
      MovieModel(
          id = 7,
          name = "Zone 414",
          posterLink = "https://image.tmdb.org/t/p/w200/wIm5S6Blkb0qDMTGVu80VWSrQV1.jpg",
          summary = "In the near future on a colony of state-of-the-art robots, a private investigator is hired by the colony's creator to bring his missing daughter home.",
          ratings = 5.9f,
          releaseDate = "2021-09-03"
      )
  )

  val popularMovies = allMovies.sortedByDescending { it.ratings }

  fun getMovie(id: Long) = allMovies.find { it.id == id }!!
}