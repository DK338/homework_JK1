package com.train

import java.util.*

val ONCETICKET:Int=1;
val TWICETICKET:Int=2;
fun main(){
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    val totalticket = scanner.nextInt()
    println("How many round-trip tickets:")
    val twiceticket = scanner.nextInt()
    val onecticket = totalticket - twiceticket
    val onecticketObj = Ticket(ONCETICKET, onecticket)
    val twiceticketobj = Ticket(TWICETICKET, twiceticket)
    println( "Total tickets: $totalticket Round-trip: $twiceticket Total: ${onecticketObj.sumPrice+twiceticketobj.sumPrice}")
    scanner.close()
}

val price=1000;
class TicKet(var ticketType:Int,var ticketNumber:Int){
    fun getSumPrice(): Int {
        var sumPrice = 0
        if (ticketType== ONCETICKET)
            sumPrice = price * ticketNumber
        else
            sumPrice = price * ticketNumber * 2 * 9 / 10
        return sumPrice
    }
}