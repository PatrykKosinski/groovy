package com.patryko.pjp.zad3

def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]

println("------a-----")
list1.each {
    print(it+" ")
}
println()
list2.each {
    print(it+" ")
}
println()

println("------b-----")
def list11 = []
list1.each {
    list11.push(it + it)
}
println(list11)
def list12 = []
list2.each {
    list12.push(it*2)
}
println(list12)