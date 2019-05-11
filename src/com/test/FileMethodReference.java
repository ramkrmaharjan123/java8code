package com.test;

import java.io.File;

public class FileMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] hiddenFiels = new File("C:\\Windows\\").listFiles(File::isHidden);
		for (File f : hiddenFiels) {
			System.out.println(f.getName());
		}
		
	}
}