object prac {
  val x=new Rational(1,2)
	x.numer
	x.deno
}
class Rational(x:Int,y:Int)
{
	def numer=x
	def deno=y
	
	def add(that:Rational)=
	new Rational(numer * that.denom)

}