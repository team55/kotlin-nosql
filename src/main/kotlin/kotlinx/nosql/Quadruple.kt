package kotlinx.nosql

class Quadruple<A1, A2, A3, A4>(val a1: A1, val a2: A2, val a3: A3, val a4: A4) {
    public fun component1(): A1 = a1
    public fun component2(): A2 = a2
    public fun component3(): A3 = a3
    public fun component4(): A4 = a4
}