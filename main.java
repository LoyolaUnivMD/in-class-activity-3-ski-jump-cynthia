// # Programmers:  Cynthia
// # Course:  CS212
// # Due Date: Jan30
// # Lab Assignment: In class assessment 3
// # Problem Statement:  calculating ski distances
// # Data In: type of ski jump, jumpers speed at end of ramp
// # Data Out:  number of points earned 
// # Credits: 

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	// defining the scanner 
	Scanner input = new Scanner(System.in);
	
	int height = 0;
        double points_per_meter = 0;
        int par = 0;
	
	System.out.println("What is your hill type? Answer 1 for normal, answer 2 for large: ");
    int hill_type = input.nextInt();
    
    //error checking here?
    
    System.out.println("What is speed at the end of the ramp?");
    double speed = input.nextInt();
    
    if (hill_type == 1 ){
     height = 46;
     points_per_meter = 2;
     par = 90;
    }
    
    if (hill_type == 2 ){
     height = 70;
     points_per_meter = 1.8;
     par = 120;
    }
    
    double time_in_air = Math.sqrt((2*height)/9.8);
    
    double distance = speed*time_in_air;
    
    double points_earned = 60 + (distance - par)*points_per_meter;
    
    if (points_earned >= 61){
        System.out.println("great job!");
    }
    
    if (points_earned < 10){
        System.out.println("what happened?");
    }
    
    else{
        System.out.println("sorry bro");
    }
    
    
    System.out.println("Distance: " + distance);
	System.out.println("Points: " + points_earned);
	
	
}}
