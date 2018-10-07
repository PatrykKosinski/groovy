package com.patryko.pjp.zad2

import javax.swing.JOptionPane

print getInts()

def getInts() {
    def numbers = []
    def err = false
    def dialogMessage = "Type only numbers"
    while (true) {

        def input = JOptionPane.showInputDialog(null, dialogMessage, "")
        if (input.matches("[0-9]*")&&!String.valueOf(input).equals("")){
            numbers.push(Integer.parseInt(input))
            break
        }else
            err = true

        if (err==true) {
            err = false
            dialogMessage = "Wrong format"
        }
    }

    return numbers
}


