package mid;

public abstract class Ellipse extends Circle implements Comparable {

	private double MinorRadius;
		
	public Ellipse(double Radius, double minorRadius) {
		
		super(Radius);
		this.MinorRadius = minorRadius;
	}
	public double getMinorRadius( ) {
		return MinorRadius;
	}
	
	public void setMinorRadius(double minorRadius) {
		
		this.MinorRadius = minorRadius;
	}
	public double area()
	{
		return super.area()*MinorRadius/Radius;
	}
	public boolean isCircle() {
		return Radius==MinorRadius;
	}
	
	public int comparaTo(Object o) {
		
		Ellipse e=(Ellipse)o;
		try {
			if(this.area()>(e.area())) {
				return 1;
			}
			else if(this.area()<e.area()) {
				return -1;
			}
			else
			{
				return 0;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;
	}

}

