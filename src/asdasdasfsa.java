import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class asdasdasfsa {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of data sets.");
		double numberOfInputs = in.nextDouble();

		
		System.out.println("Enter your x-numbers.");

			List<Double> xList = new ArrayList<Double>();
			List<Double> yList = new ArrayList<Double>();
		
		double xSum = 0;
		double ySum = 0;
		
		double funsies = 0; //placeholder to call upon the numbers on the xList;
		
			for (double i = numberOfInputs; i > 0 ; i--) {   
				xList.add(in.nextDouble());
				}
		
		System.out.println("Enter your y-numbers.");
		
			for (double i = numberOfInputs; i > 0 ; i--) {   
				yList.add(in.nextDouble());
				}
		
			for (double i = numberOfInputs ; i > 0 ; i--){
				xSum += xList.get((int) funsies);
				ySum += yList.get((int) funsies);
				funsies += 1;
				if(funsies == numberOfInputs){
					funsies = 0;
				}
			}
		
		
		
		double xAverage = xSum / numberOfInputs; //X average
		double yAverage = ySum / numberOfInputs; //Y average
		
		double xStanhelp = 0; //the numerator inside the standard unit square root
		double yStanhelp = 0;
		
		
		
		//next step, calculate the standard deviant
		
			for (double i = numberOfInputs ; i > 0 ; i--){
				xStanhelp += Math.pow((xList.get((int) funsies) - xAverage), 2);
				yStanhelp += Math.pow((yList.get((int) funsies) - yAverage), 2);
				funsies += 1;
				if(funsies == numberOfInputs){
					funsies = 0;
				}
			}
		
			
		double xStanDev = Math.pow(xStanhelp / numberOfInputs, 0.5); //X standard deviant
		double yStanDev = Math.pow(yStanhelp / numberOfInputs, 0.5);
		
		//X standard units, MFs
		
			List<Double> xListSU = new ArrayList<Double>();
			List<Double> yListSU = new ArrayList<Double>();
		
		for (double i = numberOfInputs ; i > 0 ; i--){
				xListSU.add((xList.get((int) funsies) - xAverage) / xStanDev);
				yListSU.add((yList.get((int) funsies) - yAverage) / yStanDev);
				funsies += 1;
				if(funsies == numberOfInputs){
					funsies = 0;
				}
			}
		
		
		
		System.out.println("Average of X:");
		System.out.println("	" + xAverage);
		System.out.println("Average of Y:");
		System.out.println("	" + yAverage);
		
		System.out.println("Standard Deviant of X:");
		System.out.println("	" + xStanDev);
		System.out.println("Standard Deviant of Y:");
		System.out.println("	" + yStanDev);
		
		System.out.println("Standard Units of X:");
		for (double i = numberOfInputs ; i > 0 ; i--){
				System.out.println("	" + xListSU.get((int) funsies));
				funsies += 1;
				if(funsies == numberOfInputs){
					funsies = 0;
				}
			}
		
		System.out.println("Standard Units of Y:");
		for (double i = numberOfInputs ; i > 0 ; i--){
				System.out.println("	" + yListSU.get((int) funsies));
				funsies += 1;
				if(funsies == numberOfInputs){
					funsies = 0;
				}
			}
		
		List<Double> productsList = new ArrayList <Double>();
		
		System.out.println("Products:");
		
		
		for (double i = numberOfInputs ; i > 0 ; i--){
			productsList.add( xListSU.get((int) funsies) * yListSU.get((int) funsies) );
			System.out.println("	" + productsList.get((int) funsies));
			funsies += 1;
			if(funsies == numberOfInputs){
				funsies = 0;
			}
		}
		
		double sumOfProducts = 0;
		
		System.out.println("Correlation Coefficient / r :");
				
		for (double i = numberOfInputs ; i > 0 ; i--){
			sumOfProducts += productsList.get((int) funsies);
			funsies +=1;
			if(funsies == numberOfInputs){
				funsies = 0;
			}
		}
		
		System.out.println("	" + sumOfProducts + " divided by " + numberOfInputs + " =");
		System.out.println("	" + sumOfProducts / numberOfInputs);
		
		// FUCK YEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH
		
		
		
		/*
		for(int i=0 ;i< xList.size() ;i++){
            System.out.println(meString.get(i));
          }
		
for (double i = numberOfInputs; i > 0 ; i--) {   
				xList.add(in.nextDouble());
				}		


for(int i=0 ;i< meString.size() ;i++){
            System.out.println(meString.get(i));
          }
		
		
		double xStandun = Math.pow(xStanhelp / numberOfInputs, 0.5); //X standard unit
		
		System.out.println("Average of X:");
		System.out.println(xAverage);
		System.out.println("Standard Deviant of X:");
		System.out.println(xStandun);
		
		
		
		
		System.out.println(xSum);
		
		System.out.println(xList.get(0));
		System.out.println(xList.get(1));
		
		double numberOfShoes = 0;
		double sum = 0;
		double pings = 0;
		
		
		xList.add(in.nextDouble());
		xList.add(in.nextDouble());
		
		for (int i = 0; i < 10; i++) {
		   xList.add((double) i);
		}
		
		do {
		    numberOfShoes = in.nextDouble();

		    if (numberOfShoes >= 1 && numberOfShoes <= 200) { // if valid input
		        sum += numberOfShoes;
		        numberOfInputs++;
		    }

		} while (numberOfShoes >= 1 && numberOfShoes <= 200); // continue while valid

		double average = (double)sum / numberOfInputs;

		System.out.println("Average: " + average);
		*/

	}
}
