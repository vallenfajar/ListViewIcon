package com.example.listviewicon.model

import com.example.listviewicon.R

object BahasaPemrogramanData {
    private val bahasaName = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "Java Script",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby os an open-source and fully object-oriented programming languages",
        "Ruby on Rails is a a server-side web application development framework written in Rubby language",
        "Python is interpreted scripting and object-oriented programming language",
        "JavaScript is an obeject-based scripting language",
        "PHP is an interpreted language, i.e, there is no need for compilation"
    )

    private val foodPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.js,
        R.drawable.php
    )

    val listBahasaPemrograman: ArrayList<BahasaPemrograman>
        get() {
            val list = arrayListOf<BahasaPemrograman>()
            for (position in bahasaName.indices) {
                val bahasa = BahasaPemrograman()
                bahasa.name = bahasaName[position]
                bahasa.detail = detail[position]
                bahasa.poster = foodPoster[position]
                list.add(bahasa)
            }
            return list
        }
}