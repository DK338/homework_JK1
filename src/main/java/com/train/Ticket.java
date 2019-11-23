package com.train;

public class Ticket {

    int ticketType;
    int ticketNumber;
    int price=1000;
    static int ONCETICKET=1;
    static int TWICETICKET=2;

    public Ticket(int ticketType, int ticketNumber) {
        this.ticketType = ticketType;
        this.ticketNumber = ticketNumber;
    }
    public int getSumPrice(){
        int sumPrice=0;
        if (ticketType == ONCETICKET)
            sumPrice=price*ticketNumber;
        else
            sumPrice=price*ticketNumber*2*9/10;
        return sumPrice;
    }

}
