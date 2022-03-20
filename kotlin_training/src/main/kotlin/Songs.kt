class Song(val title: String, val artist: String) {

        init {
            println("Created a $artist song")
        }
    
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }

}

fun main(args: Array<String>){

    val songOne = Song("Cloud busting", "Kate Bush")
    val songTwo = Song("This is hardcore","Pulp")
    val songThree = Song("Hold me now","The Thompson Twins")

    songOne.play()
    songOne.stop()
    songTwo.play()
    songThree.play()
    songTwo.stop()
    songThree.stop()

}