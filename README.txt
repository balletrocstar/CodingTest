author: Sarah Jeter
date: 4/6/17

Package One:
	The Shape interface was given as part of this task. The classes triangle, circle, and rectangle were implemented using this interface and tested with JUnit (ShapeTests.java). For each class, the constructor is tested and ensures exceptions are thrown when needed. The calculations of area and perimeter are also tested and asserted that the correct answer is returned.
	
Package Two:
	In the main method 2 collections are defined, one contains integers 1 thru 10 in a random order and the other contains 6 thru 15 in a random order. Both collections are printed and their size is printed following the collection. These are implemented with Lists for their variable size. It also allows us to easily reverse the list.
	
	These two collections are then combined into a third collection which is implemented as a TreeSet so that it is automatically sorted. The middle entry of the set is removed and the set is printed in reverse order with its size immediately following
	
	Finally, a List of key/value pairs is created. This uses the class KeyValue which implements the Map.Entry interface. Five pairs are added to the collection, a duplicate is then added and found in the collection. The pairs are printed with the size immediately following.

Package Three:
	Given the code:
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(".");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	Numbers_to_5.java is a modified version of the above code to only use one control structure.
	Numbers_to_N.java is modified to take in a command line argument that is an integer and perform the above code to the Nth number (rather than 5).

Included Files:
	README.txt: this file

	one\Shape.java: shape interface
	one\Circle.java: calculates area and perimeter of a circle
	one\Rectangle.java: calculates area and perimeter of a rectangle
	one\Triangle.java: calculates area and perimeter of a triangle
	one\ShapeTests.java: unit tests for Circle.java, Rectangle.java, and Triangle.java

	two\Collections.java: minipulates collections
	two\KeyValue.java: class used for key value pairs

	three\Numbers_to_5.java: prints out series of '.' and numbers to 5
	three\Numbers_to_N.java: prints out series of '.' and numbers to N (inputted in command line)

Compile and Run:
	Navigate to each package to compile/run
	Package One:
		Compile the unit tests:
			Linux/Mac
				javac -cp .:junit-4.XX.jar ShapeTests.java
			Windows
				javac -cp .;junit-4.XX.jar ShapeTests.java

		Run the tests:
			Linux/Mac
				java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ShapeTests
			Windows
				java -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore ShapeTests

	Package Two:
		Compile:
			javac *.java
		Run:
			java Collections

	Package Three:
		Compile:
			javac *.java
		Run:
			java Numbers_to_5
			java Numbers_to_N [integer]