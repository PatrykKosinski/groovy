package com.patryko.pjp.zad1

def scanner = new Scanner(System.in)

print "Integer to be converted:"
try{
    def integers = scanner.nextLine()

    displayConvertedNumbers(integers)

}catch(NumberFormatException e){
    println("You need to provide only integers becouse of $e")
}



def displayConvertedNumbers(String numbers) {
    def stringNumbers = numbers.collect { x -> Integer.parseInt(x) }
    stringNumbers.eachWithIndex{ number, index ->
        conversion(number, index == 0)
    }

}

def conversion(int number, boolean zero) {
    def string = ""

    if(number==0){
        string = "zero"
    }else if(number==1){
        string = "jeden"
    }else if(number==2){
        string = "dwa"
    }else if(number==3){
        string = "trzy"
    }else if(number==4){
        string = "cztery"
    }else if(number==5){
        string = "piec"
    }else if(number==6){
        string = "szesc"
    }else if(number==7){
        string = "siedem"
    }else if(number==8){
        string = "osiem"
    }else if(number==9){
        string = "dziewiec"
    }

    if (!zero)
        print(" - ")
    print(string)
}