import java.util.ArrayList;
import java.util.Random;
//Kaylah Tan

public class Halloween {
	float[][] matrix;

	public Halloween() {
		matrix = new float[5][5];
	}

	public float[][] fillMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = new Random().nextFloat();
			}
		}
		return matrix;
	}

	public String loopThrough() {
		matrix = fillMatrix();
		float max = matrix[0][0];
		int house = 0;
		int street = 0;
		String str = "The ";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					house = i;
					street = j;
				}
			}
		}

		if (house == 0) {
			str = str + "1st House on ";
		} else if (house == 1) {
			str = str + "2nd House on ";
		} else if (house == 2) {
			str = str + "3rd House on ";
		} else if (house == 3) {
			str = str + "4th House on ";
		} else {
			str = str + "5th House on ";
		}

		if (street == 0) {
			str = str + "A Street.";
		} else if (street == 1) {
			str = str + "B Street.";
		} else if (street == 2) {
			str = str + "C Street.";
		} else if (street == 3) {
			str = str + "D Street.";
		} else {
			str = str + "E Street.";
		}

		return str;
	}

	public static void main(String[] args) {
		Halloween hall = new Halloween();
		System.out.println("Welcome to Halloween Strategizer.");
		System.out.println("Here is your top five houses to visit.");
		System.out.println(hall.loopThrough());
		System.out.println(hall.loopThrough());
		System.out.println(hall.loopThrough());
		System.out.println(hall.loopThrough());
		System.out.println(hall.loopThrough());
	}
}
