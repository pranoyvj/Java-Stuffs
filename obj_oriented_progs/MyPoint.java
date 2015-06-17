package obj_oriented_progs;
//import java.math.*;
class MyPoint
{	String s;
	private int x;
	private int y;
 public MyPoint()
 {
	 this.x=0;
	 this.y=0;
 }
	
 public MyPoint(int x,int y)
 {
	 this.x=x;
	 this.y=y;
 }
 public void setX(int x)
 {
	 this.x=x;
	 //return this.x;
 }
 public void setY(int y)
 {
	 this.y=y;
	 //return this.y;
 }
public int  getX(){
	return x;
}
 public int getY()
 {
	 return y; 
 }
 public void setXY(int x, int y)
 {
	 this.x=x;
	 this.y=y;
 }
 
 public String toString()
 {
     return "x and y values: "+" ("+x+") "+" ("+y+" )";
 }
 
 public double  distance(int x, int y)
 {
	 int x1=this.x;
	 int y1=this.y;
	 double dist= Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y) );
	 return dist;
 }
 //overloaded function
 public double  distance(MyPoint another)
 {
	 int x1=this.x;
	 int y1=this.y;
	 double dist= Math.sqrt((x1-another.x)*(x1-another.x)+(y1-another.y)*(y1-another.y) );
	 return dist;
 }
 }







