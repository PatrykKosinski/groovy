package com.patryko.pjp.zad2

import javax.swing.*

//println getData(Integer) { it > 0 }
//println getData() { it.size() > 3 }
//println getData()
println getData(BigDecimal)

def getData(arg1 = null, arg2 = null) {
    def values = []
    def err = false
    def dialogMessage = "Type any type of data"
    while (true) {
        def input = JOptionPane.showInputDialog(null, dialogMessage, "")
        if (arg1 instanceof Class) {
            try {
                input = input.asType(arg1)
                if (arg2 instanceof Closure && !validate(arg2, input)) {
                    err = true
                    continue
                }
                values.push input
                break
            }
            catch (ex) {
                err = true
            }
        } else if (arg1 instanceof Closure && validate(arg1, input)) {
            values.push input
            break
        } else if (arg1 == null) {
            values.push input
            break
        }


        if (err) {
            err = false
            dialogMessage = "Wrong format"
        }

    }

    values
}

def validate(c, value) {
    c(value)
}