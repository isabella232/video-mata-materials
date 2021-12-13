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

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raywenderlich.android.movietime.databinding.MovieViewholderLayoutBinding

class MovieAdapter(private val movieListener: MovieListener) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

  private val movies = mutableListOf<MovieModel>()

  @SuppressLint("NotifyDataSetChanged")
  fun setMovies(movies: List<MovieModel>) {
    this.movies.clear()
    this.movies.addAll(movies)
    notifyDataSetChanged()
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
    val binding = MovieViewholderLayoutBinding.inflate(LayoutInflater.from(parent.context), parent,
        false)
    return MovieViewHolder(binding)
  }

  override fun getItemCount() = movies.size

  override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
    val movie = movies[position]

    Glide.with(holder.posterImageView)
        .load(movie.posterLink)
        .centerCrop()
        .into(holder.posterImageView)

    holder.rootView.setOnClickListener {
      movieListener.onClick(
          movie.id,
          holder.posterImageView,
          holder.rootView
      )
    }

    val context = holder.rootView.context
    holder.posterImageView.transitionName = context.getString(
        R.string.poster_transition_name_id,
        movie.id
    )
    holder.rootView.transitionName = context.getString(R.string.card_transition_name_id, movie.id)
  }

  inner class MovieViewHolder(binding: MovieViewholderLayoutBinding)
    : RecyclerView.ViewHolder(binding.root) {

    val rootView = binding.root
    val posterImageView = binding.moviePosterImageview
  }

  interface MovieListener {

    fun onClick(movieId: Long, posterImageView: ImageView, card: View)
  }
}