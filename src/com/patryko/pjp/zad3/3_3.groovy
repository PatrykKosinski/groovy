package com.patryko.pjp.zad3

import java.text.ParseException
import java.text.SimpleDateFormat


def dates = "dsfasfdas 2017-07-29 asdfasftsad 19992-02-29 19992-02-30 zxcvxzv  1991-12-33,asdfas 0001-1-1, asdfsdf 2222-01-01"
def regex = /[0-9]{4}-[0-9]{2}-[0-9]{2}/
def finder = dates =~ regex
def incorrectDates = []
def correctDates

correctDates = finder.findAll({
    def correct = true
    try {
        def dateFormat = new SimpleDateFormat("yyyy-MM-dd")
        dateFormat.setLenient(false)
        dateFormat.parse(it)
    } catch(ParseException e) {
        incorrectDates.add(it)
        correct = false


    }

    return correct
})

println("Correct dates: "+correctDates)
println("Incorrect dates: " + incorrectDates)
