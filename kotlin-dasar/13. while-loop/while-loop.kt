fun main() {
    var i = 0

    // while
    while(i < 10){
        println("looping ke ${i}")
        i++
    }

    // do while
    do {
        println("loopingan")
        i++
    } while(i < 10)

    while(i < 10){
        println("loopingan ke ${i}")
        i++

        if(i > 5){
            break
        }
    }

    for(value in 0..100){
        if(value % 2 == 0){
            continue
            if(value % 2 != 0){
                break
            }
        }
        println(value)
    }
}