package com.sheikh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}") // Value will be inejcted at runtime
	private int x;
	
	@Value("#{5+55+6+5}")
	private int y;

	@Value("#{T(java.lang.Math).sqrt(144)}") // Calling Static Method
	private double z;

	@Value("#{T(java.lang.Math).PI}") // calling static variable
	private double e;

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + "]";
	}

}
