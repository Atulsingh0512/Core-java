package practice;
import java.util.*;
public class Reactangle {

	private float length;
	private float width;
	
	//creating constructor
	public Reactangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}
//creating method
	public float calArea() {
		return length+width;
	}
	
	public float calPeri() {
		return 2*(length+width);
	}

	
	//creating getter and setter method
	public float getLength() {
		return length;
	}

	
	public void setLength(float length) {
		this.length = length;
	}

	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	
	public static void main(String[] args) {
		Reactangle re = new Reactangle(4.5f, 3.2f);
		float area=re.calArea();
		float perim=re.calPeri();
		System.out.println(area);
		System.out.println(perim);	
	}
}


//Question 1:
//Create a class called "Rectangle" that has the following attributes and methods:
//
//Attributes:
//length (float): represents the length of the rectangle
//width (float): represents the width of the rectangle
//Methods:
//calculate_area(): calculates and returns the area of the rectangle.
//calculate_perimeter(): calculates and returns the perimeter of the rectangle.
