package com.patryko.pjp.zad2

def list = (1..40)

eachTuple(list) { e1, e2, e3, e4, e5 ->
    println "$e5 $e4 $e3 $e2 $e1"
}

def s = 'asia ma kota i psa'

def out = new StringBuffer()
eachTuple(s) { b,a ->
    out << b << a
}
println out


def eachTuple(list, closure) {
    def numbersOfParams = closure.maximumNumberOfParameters
    def line = []
    list.each {
        line.push it
        if (line.size() == numbersOfParams) {
            closure(line)
            line.clear()
        }

    }
}