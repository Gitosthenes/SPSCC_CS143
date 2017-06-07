package Lab_1.Num1_2

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
fun main(args:Array<String>){
    val e1 = Employee()
    e1.name = "Patel Koresh"
    e1.id = 432
    e1.dept = "Accounting"
    e1.pos = "CEO"

    val e2 = Employee()
    e2.name = "Smidge Crossbow"
    e2.id = 391
    e2.dept = "IT"
    e2.pos = "CIO"

    val e3 = Employee()
    e3.name = "Joy Temple"
    e3.id = 814
    e3.dept = "Manufacturing"
    e3.pos = "Shift Lead"

    e1.printEmp()
    e2.printEmp()
    e3.printEmp()
}