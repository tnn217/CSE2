//////////////////////////////
//Tony Nikolov
//09/4/14
//lab02
//Cyclometer Program
//
//a. print the number of minutes for each trip
//b. print the number of counts for each tirp
//c. print the distance of each trip in miles
//d. print the distance for the two trips combined

//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//
//
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[ ] args) {
        int secsTrip1=480; // number of seconds for Trip 1
        int secsTrip2=3220; //number of seconds for Trip 2
        int countsTrip1=1561; //number of counts for Trip 1
        int countsTrip2=9037; //number of counts for Trip 2
        double wheelDiameter=27.0, //Wheel Diameter constant
        PI=3.14159, //value of pi
        feetPerMile=5280, //number of feet in a mile
        inchesPerFoot=12, //number of inches in a foot
        secondsPerMinute=60; //number of seconds in aminute
        double distanceTrip1, distanceTrip2, totalDistance; //storing of various distances
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
//run the calculations; store the values. 
//I am converting the seconds of Trip 1 into minutes and prints that with counts
//
//
        distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;
// Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
//Print out the output data.
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    } //end of main method
} //end of class