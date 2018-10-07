package com.patryko.pjp.zad3

def pmap = [ Groovy: [ 'Asia', 'Jan' ],
             Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
             Java: [ 'Asia', 'Stefan', 'Mirek' ],
             JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
]

println("------a-----")
def keys = pmap.keySet()
keys.each { key ->
    def count = pmap.get(key).size()
    println "$key: $count"
}

println("------b-----")
def project2 = pmap.findAll {
    it.value.size() > 2
}
println project2.keySet()

println("------c-----")
def programmers = []

pmap.values().each({
    programmers = (programmers + it).unique()
})

programmers.each { name ->
    def projects = pmap.findAll({ it.value.contains(name) }).collect { el -> el.key }
    println "$name: $projects"
}