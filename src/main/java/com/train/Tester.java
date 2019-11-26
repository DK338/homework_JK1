package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int totalTicket=scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int twiceTicket=scanner.nextInt();
        int onceTicket=totalTicket-twiceTicket;
        Ticket onceTicketObj=new Ticket(Ticket.ONCETICKET,onceTicket);
        Ticket twiceTicketObj=new Ticket(Ticket.TWICETICKET,twiceTicket);
        System.out.println("Total tickets:"+ totalTicket+"\t"+" Round-trip:"+twiceTicket+"\t"+ "Total:"+ (onceTicketObj.getSumPrice()+twiceTicketObj.getSumPrice()));
        scanner.close();
    }
}
