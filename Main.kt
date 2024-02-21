fun main() {
    name("Hello Mary")

     var y = modulus(7, 11)
    println(y)

    var x = sum(12, 7, 9, 11)
    println(x)

    aboutMyself("Mary is talented in writing poems")
    aboutMyself("Mary loves watching lifestyle videos and listening to podcast")

}



fun name(name:String) {
    var name = "Hello Mary"
    println(name)
}

    fun modulus(num1: Int, num2: Int): Int{
        var division= num1 % num2
        return division
    }

fun sum (num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var result = num1 + num2 + num3 + num4
    return result

}

fun aboutMyself (word: String){
    println(word)

}
