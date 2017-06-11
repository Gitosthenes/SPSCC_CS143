package Lab_6.Num6_2

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
class Entry(key: Int, value: String) : Comparable<Entry> {
    var k: Int = 0
    var v: String? = null

    init {
        k = key
        v = value
    }

    override fun toString(): String {
        return "$v"
    }

    override fun compareTo(other: Entry): Int {
        return Integer.compare(this.k, other.k)
    }
}