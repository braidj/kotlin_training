class Dogs(val name: String, weight_param: Int, breed_param: String)  {

    init {
        println("Doggy $name has arrived !")
    }

    var activities = arrayOf("walks")

    val breed = breed_param.toUpperCase()

    init {
        println("He's a $breed !")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val weightInKg: Double
        get() = weight / 2.2

    init {
        println("He weighs $weight lbs")
        println("He weighs $weightInKg kgs")

    }

    fun bark(){
        println(if (weight < 20) "Yip yip" else "deep woof woof")
    }
}

fun main(args: Array<String>) {

    val benji = Dogs("BenjiBoo",55,"Black lab")
    benji.bark()

    benji.weight = 19
    println("${benji.name} weight has changed !")
    benji.bark()

}