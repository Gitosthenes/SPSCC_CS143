package Lab_1.`1_2`

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
class Employee {
    var name: String? = null
    var id: Int = 0
    var dept: String? = null
    var pos:String? = null

    fun printEmp() {
        println("Name:       "+name+"\n"+
                "ID Number:  "+id+"\n"+
                "Department: "+dept+"\n"+
                "Position:   "+pos+"\n")
    }
}