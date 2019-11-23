package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int totalticket=scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int twiceticket=scanner.nextInt();
        int onecticket=totalticket-twiceticket;
        Ticket onecticketObj=new Ticket(Ticket.ONCETICKET,onecticket);
        Ticket twiceticketobj=new Ticket(Ticket.TWICETICKET,twiceticket);
        System.out.println("Total tickets:"+ totalticket+"\t"+" Round-trip:"+twiceticket+"\t"+ "Total:"+ (onecticketObj.getSumPrice()+twiceticketobj.getSumPrice()));
        scanner.close();
    }
}
