package box;

public class Cube extends Box {
 public Cube(double side) {
	 super(side, side, side);
 }
 public void setSide(double s) {
	 super.setHeight(s);
	 super.setLength(s);
	 super.setWidth(s);
 }
 
 public double getSide() {
	 return this.getHeight();
 }
 
 @Override
 public void setHeight(double s) {
	 this.setSide(s);
 }
 @Override
 public void setWidth(double s) {
	 this.setSide(s);
 }
 @Override
 public void setLength(double s) {
	 this.setSide(s);
 }
}
