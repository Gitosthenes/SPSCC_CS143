package Lab_1.Num1_4

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
fun main(args:Array<String>) {
    println("    Rolls")
    println("---------------")
    repeat(50){
        val d1 = Lab_1.Num1_3.Die()
        val d2 = Lab_1.Num1_3.Die()

        val total: Int = d1.getCurrNum()+
                         d2.getCurrNum()

        println("you rolled a " + total)
    }
}