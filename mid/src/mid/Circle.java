package mid;

public abstract class Circle extends Shape implements Comparable {
	
	double Radius;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		this.Radius = radius;
	}
	@Override
	public double area() {
		return Math.PI*Radius*Radius;
	}
	
	public void setRadius(double radius) {
		this.Radius=radius;
	
	}
	public double getRadius() {
		return Radius;
	}
	@Override
	public int comparaTo(Object o) {
		Circle c=(Circle)o;
		if (this.area()>(c.area()))
		{
			return 1;
		}
		else if(this.area()<c.area())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
		
		}
	

	
