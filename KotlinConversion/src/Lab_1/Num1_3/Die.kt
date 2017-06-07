package Lab_1.Num1_3

import java.util.*

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
class Die {
    private val rand = Random()
    private var currNum: Int = 0

    init {
        roll()
    }

    fun roll() {
        currNum = rand.nextInt(6) + 1
    }

    fun getCurrNum(): Int {
        return currNum
    }
}