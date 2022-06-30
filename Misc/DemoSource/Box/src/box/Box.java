package box;

public class Box {
	private double height;
	private double width;
	private double length;
	
	public Box(double height, double width, double length) {
        if (this.isValidSide(height)) this.height = height;
        else {
        	this.height = 0;
        	System.out.println("Hey!! " +  height + " is not a valid number!!!!");
        }
        if (this.isValidSide(width)) this.width = width;
        else this.width = 0;
        if (this.isValidSide(length)) this.length = length;
        else this.length = 0; 
	}
	
	private boolean isValidSide(double side) {
		if (side <0) return false;
		return true;
	}
    public double getVolume() {
    	return (this.height * this.length * this.width);
    }
    
 
    public double getSurfaceArea() {
    	double area = 2 * this.height * this.width;
    	area = area + (2 * this.height* this.length);
    	area = area + (2 * this.width * this.length);
    	return area;
    }

    public String printBox() {
    	String out = null;
    	out = "Length = " + this.length + "\n" 
    			+ "Width = " + this.width + "\n"
    			+ "Height = " + this.height + "\n";
    	return out;
    	
    	
    }

	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	

}
