package com.train

import java.util.*

const val ONCETICKET:Int=1;
const val TWICETICKET:Int=2;
fun main(){
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    val totalTicket = scanner.nextInt()
    println("How many round-trip tickets:")
    val twiceTicket = scanner.nextInt()
    val onceTicket = totalTicket - twiceTicket
    val onceTicketObj = Ticket(ONCETICKET, onceTicket)
    val twiceTicketObj = Ticket(TWICETICKET, twiceTicket)
    println( "Total tickets: $totalTicket Round-trip: $twiceTicket Total: ${onceTicketObj.sumPrice+twiceTicketObj.sumPrice}")
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