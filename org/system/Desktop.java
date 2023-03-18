package org.system;

public class Desktop extends Computer {
    public void desktopSize() {
		System.out.println("Size of the Desktop - 25 inch display");

    }
    public static void main(String[] args) {
		Desktop dp=new Desktop();
		dp.computerModel();
		dp.desktopSize();
	}
	
}