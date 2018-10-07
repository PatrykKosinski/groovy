package com.patryko.pjp.zad3


println("------a-----")
def regexA = /\-?[0-9]+\.[0-9]+|\-?[0-9]+/
def inputText = "-1213 asdfs0.222 adfsdafasd, tdsfatsdfasda 2, a t 2.0 uadfsaf 0.2 0.0.0.0"
def matches = inputText =~ regexA
matches.each {
    println it
}

