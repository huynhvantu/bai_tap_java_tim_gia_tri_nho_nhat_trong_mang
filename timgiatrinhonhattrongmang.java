package tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

public class timgiatrinhonhattrongmang {
	
	public static void main(String[] args) {
		int size;
		int [] array;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap do dai cua mang:");
		size = scanner.nextInt();
		array = new int[size];
		int i = 0;
		while(i<array.length) {
			System.out.println("Enter element" +(i+1)+" : ");
			array[i] = scanner.nextInt();
			i++;
		}
		System.out.println("Property list: ");
		for(int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		
		int min = array[0];
		int index = 1;
		for (int j = 0; j < array.length;j++) {
			if(array[j]<min) {			
			min = array[j];
			index = j + 1;
			}
		}
		System.out.println("Gia tri nho nhat trong mang " + min + " , at position " + index);		
	}
	
}