package com.patryko.pjp.zad1

def products = getListoOfProducts()

products.each { key, value ->
    println "$key: $value"
}

def getListoOfProducts() {
    def input = ""
    def booleanHelper = true
    def scanner = new Scanner(System.in)
    def mapOfProducts = [:]

    for(;booleanHelper;){
        print "To sum. Just click enter.\n To define product type Regex: \"nameOfProduct=integer.doubleInteger\": "
        input = scanner.nextLine()

        if(input == ""){
            booleanHelper = false
            break
        }else if (!input.matches("[a-zA-Z]*=[0-9]*.[0-9]{2}")) {
            booleanHelper = true
            println "Wrong definition"
        }else{
            booleanHelper = true
            def parts = input.split("=")
            def nameOfProduct = parts[0]
            def value = new BigDecimal(parts[1])

            if (mapOfProducts.containsKey(nameOfProduct)) {
                def sum = mapOfProducts.get(nameOfProduct)
                sum += value
                mapOfProducts.replace(nameOfProduct, sum)
            }
            else
                mapOfProducts.put(nameOfProduct, value)
        }
    }

    mapOfProducts
}
