/*

Create an abstract class Shape with methods calc_area and calc_volume. Derive three classes Sphere(radius) , Cone(radius, height) and Cylinder(radius, height), Box(length, breadth, height) from it. Calculate area and volume of all. (Use Method overriding).

*/

abstract class Shape
{
	double r,h;

	Shape(double r,double h)
	{
		this.r = r;
		this.h = h;
	}

	abstract void calc_area();

	abstract void calc_vol();
}

class Sphere extends Shape
{
	double A1,V1;

	Sphere(double r)
	{
		super(r,0);
	}

	void calc_area()
	{
		A1 = (4*3.314*r*r);
		System.out.println("\nArea of sphere : "+A1);
	}

	void calc_vol()
	{
		V1 = (1.334*3.14*r*r*r);
		System.out.println("volume of sphere : " +V1);
	}
}

class Cone extends Shape
{
	double A2,V2;

	Cone(double r,double h)
	{
		super(r,h);
	}

	void calc_area()
	{
		A2 = (3.14*r*Math.sqrt((r*r)+(h*h)));
		System.out.println("Area of Cone : "+A2);
	}

	void calc_vol()
	{
		V2 = (0.334*3.14*r*r*h);
		System.out.println("Volume of Cone : " +V2);
	}
}	
class Cylinder extends Shape
{
	double A3,V3;

	Cylinder(double r,double h)
	{
		super(r,h);
	}

	void calc_area()
	{
		A3 = (3-(3.14*r*r))+(h*(2-(3.14*r)));
		System.out.println("Area of cylinder : "+A3);
	}

	void calc_vol()
	{
		V3 = (3.14*r*r*h);
		System.out.println("Volume of cylinder : " +V3);
	}
}

class Box extends Shape
{
	double A4,V4,l,b;

	void getb(double l1,double b1)
	{
		l=l1;
		b=b1;
	}

	Box(double h)
	{
		super(0,h);
	}

	void calc_area()
	{
		A4 = 2*((l*b)+(l*h)+(b*h));
		System.out.println("Area of box : "+A4);
	}

	void calc_vol()
	{
		V4 = (l*b*h);
		System.out.println("Volume of box : "+V4);
	}
}

class Main9
{
	public static void main(String[] args)
	{
		Sphere sp = new Sphere(5);
		sp.calc_area();
		sp.calc_vol();

		Cone cn = new Cone(5,10);
		cn.calc_area();
		cn.calc_vol();

		Cylinder cy = new Cylinder(5,10);
		cy.calc_area();
		cy.calc_vol();

		Box b1 = new Box(10);
		b1.getb(5,5);
		b1.calc_area();
		b1.calc_vol();
	}
}

/*

$ javac Main9.java

$ java Main9

Area of sphere : 331.4
Volume of sphere : 523.5950000000001
Area of Cone : 175.5313362337335
Volume of Cone : 262.19
Area of cylinder : 212.5
Volume of cylinder : 785.0
Area of box : 250.0
Volume of box : 250.0

*/
