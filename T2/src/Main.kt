

//Palindromos
/*
fun main(args: Array<String>) {
    val numbers = readLine()!!.split(" ").map{ number -> number.toInt() }
//	val mullableNumbers = readLine()?.split( ) ?: lsitOf()

    var i = 0
    var j = numbers.size-1
    var result = "yes"

    while (i < j) {
        if (numbers.get(i) != numbers.get(j)) {
            result = "no"
        }
        i++
        j--
    }

    println(result)
}

*/

//Al reves 2
/*
fun main(args: Array<String>) {
    val numbers = readLine()!!.split(" ").map{ number -> number.toInt() }
    val alReves = numbers.asReversed()
    var str: String = ""

    for (i in alReves) {
        str = str + i.toString() + " "
    }

    print(str)
}
*/

//Min y max
/*
fun main(args: Array<String>) {
    val numbers = readLine()!!.split(" ").map{ number -> number.toInt() }

    var min = numbers[0]
    var max = numbers[0]

    for ( n in numbers) {
        if (n < min) min = n
        if (n > max) max = n
    }

    print("" + min.toString() + " " + max.toString())
}
*/


//Quita ese numero de ahí
/*
fun main(args: Array<String>) {
    val i = readLine()!!
    val numbers = readLine()!!.split(" ").map{ number -> number.toInt() }
    var aux = 0
    var str = ""

    for ( n in numbers) {
        if (i.toInt() != aux+1) str = str + n.toString() + " "
        aux++
    }

    print(str)
}
*/


//Finonacci
/*
fun main(args: Array<String>) {
    val i = readLine()!!
    var f0 = 0
    var f1 = 1


    for (n in 1..i.toInt()) {
        if (n == i.toInt())
            print("$f0")
        val sum = f0 + f1
        f0 = f1
        f1 = sum
    }
}
*/


//Conjetura de Collatz
//Si n es par -> n = n/2 Si n es impar -> n = 3n + 1
/*
fun main(args: Array<String>) {
    val nStr = readLine()!!
    var n = nStr.toInt()
    var contador = 0

    while (n != 1) {

        if ((n and 1) == 1) {
            n = 3*n + 1
        } else {
            n = n/2
        }

        contador++
    }

    print(contador)
}
*/

/*
//Cifrada
fun main(args: Array<String>) {
    val palabra = readLine()!!
    val alf = readLine()!!
    var index = 0

    for (l in alf) {

        if (index == palabra.length) {
            break
        }

        if (l == palabra[index]) {
            index++
        }
    }


    if (index == palabra.length) {
        print("yes")
    } else {
        print("no")
    }

}
*/


//Tribonatlin
/*
fun main(args: Array<String>) {
    val i = readLine()!!
    var f0 = 0
    var f1 = 1
    var f2 = 1


    for (n in 1..i.toInt()) {
        if (n == i.toInt())
            print("$f0")
        val sum = f0 + f1 + f2
        f0 = f1
        f1 = f2
        f2 = sum
    }
}
*/


//Primos
fun isPrime(num: Int): Boolean {
    var i = 2

    var isPrime = true

    while ( i < num ) {

        if ( num % i == 0 ) {
            isPrime = false
        }
        i++
    }

    return isPrime
}

/*
fun main(args: Array<String>) {
    val i = readLine()!!
    var cont = 0
    var index = 2
    var lastPrime = 2

    while (cont < i.toInt()) {
        if (isPrime(index)) {
           // print("$index ")
            cont++
            lastPrime = index
        }
        index++
    }
    print(lastPrime)
    //isPrime(i.toInt())
}
*/

fun main(args: Array<String>) {
    val i = readLine()!!

    if (isPrime(i.toInt())) {
        print("yes")
    } else {
        print("no")
    }
}