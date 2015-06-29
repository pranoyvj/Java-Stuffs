package obj_oriented_progs;
//note to do divide
class MyComplex
{
	private double real;
	private double imag;
	private double magnitude;
	private double arg;
	private double realconj;
	private double imagconj;
	private MyComplex conjugate;
	private MyComplex add;
	private MyComplex subtract;
	//private MyComplex divide ;
	private MyComplex multiply;
	
	public MyComplex(double real, double imag){
		this.real=real;
		this.imag=imag;
	}
	public void Setreal(double real)
	{
		this.real=real;
	}
	public void Setimag(double imag)
	{
		this.imag=imag;
	}	
	public double Getimag()
	{
		return imag;
	}
	public double Getreal()
	{
		return real;
	}
	public void SetValue(double real, double imag){
		this.real=real;
		this.imag=imag;
	}
	public String toString(){
		return "("+real+" + i"+imag+")";
	}
	public boolean isreal(){
		if(this.imag==0)
			return true;
		else 
			return false;
	}
	public boolean isimag(){
		if(this.real==0)
			return true;
		else 
			return false;
	}
	public boolean equals(double real, double imag){
		if(this.imag==imag && this.real==real)
			return true;
		else 
			return false;
	}
	//overloaded equals
	public boolean equals(MyComplex inst1){
		if(this.imag==inst1.imag && this.real==inst1.real)
			return true;
		else 
			return false;
	}
	public double magnitude(){
		
		magnitude=Math.sqrt(this.real*this.real + this.imag*this.imag);
		System.out.println("Magnitude of this complex number "+toString()+"+ : ");
		return magnitude;
	}
	public double argumentInRadians(){
		arg=Math.atan2(this.imag, this.real);
		return arg;
	}
	public double argumentInDegrees(){
		arg=Math.atan2(this.imag, this.real);
		double theta = Math.toDegrees(arg);

		if (theta < 0.0) {
		    theta += 360.0;
		}
		return theta;
	}
	public MyComplex conjugate(){

		 conjugate.real=real;
		 conjugate.imag=imag*-1;
		return conjugate;
	}
	public MyComplex  add(MyComplex another){
		this.real=this.real+another.real;
		this.imag=this.imag+another.imag;
		System.out.println("result of addition  : ");
		return this;
	}
	public MyComplex  subtract(MyComplex another){
		this.real=this.real-another.real;
		this.imag=this.imag-another.imag;
		System.out.println("result of subtract  : ");
		return this;
	}
	public MyComplex  multiply(MyComplex another){
		this.real=this.real*another.real-this.imag*another.imag;
		this.imag=this.real*another.imag+this.imag*another.real;
		System.out.println("result of multiply  : ");
		return this;
	}
	
}
/*

division can be done but not doing
Methods multiplyWith(MyComplex another) and divideBy(MyComplex another) that multiplies and divides this instance with the given MyComplex instance another, keep the result in this instance, and returns this instance.
(a + bi) * (c + di) = (ac - bd) + (ad + bc)i
(a + bi) / (c + di) = [(a + bi) * (c – di)] / (c2 + d2)
Hint:
return this;  // return "this" instance

*/