package com.patryko.pjp.zad2

def apply(List l, Closure c) {
    l.collect(c)
}

def transform1
def transform2


def l1 = [1, 2, 3, 4]
def closure1 = {it*10}
def closure2 = {it/2}


transform1 = apply(l1, closure1)
println transform1

def l2 = [10, 35, 24, 57]

transform2 = apply(l2, closure2)
println transform2