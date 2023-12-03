package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch3
{
	public static void main(String[] args)
	{
		Car car1 = new Car(1234, 20.5);
		car1.vShow();
		car1.mShow();
	}
}

interface iVehicle
{
	void vShow();
}

interface iMaterial
{
	void mShow();
}

class Car implements iVehicle,iMaterial
{
	private int num;
	private double gas;
	
	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void vShow()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
	
	public void mShow()
	{
		System.out.println("車子的材質是鐵");
	}
}
	/*public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}

class Car extends Vehicle
{
	private int num;
	private double gas;
	
	public Car(int n, double  g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("速度是" + speed);
	}
	/*
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為" + course);
	}
	
	public void show()
	{
		System.out.println("賽車的車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("賽車的編號是" + course);
	}
	
}

class Plane implements iVehicle
{
	private int flight;
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產了" + flight + "班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是" + flight);
	}
}*/