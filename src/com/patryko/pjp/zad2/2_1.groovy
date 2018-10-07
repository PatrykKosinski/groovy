package com.patryko.pjp.zad2

(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"

def maximum(elements) {
    def max = elements.max()
    def result = []

    elements.eachWithIndex{ element, index ->
        if (element == max)
            result.push(index)
    }

    new Tuple(max, result)
}