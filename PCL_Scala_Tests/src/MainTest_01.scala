

object ScalaApp{
  
  def add(a:Int, b:Int):Int = a+b
  
  def fun(a:Int):Int = {
    println(a+1)
    println(a-2)
    val x = a*3
    println(x)
    a*3
    
  }
  
  def dontKnow() = {
    val i = 3
    val p = if(i>0) -1 else -2
    val q = if(true) "hello" else "world"
    println(p)
    println(q)
  }
  
  def errorMsg(errorCode:Int) = errorCode match{
    case 1 => "File not found"
    case 2 => "Permission denied"
    case 3 => "Invalid operation"
  }
  
  def sum(n:Int):Int = 
    if(n==0) 0 else n + sum(n-1)
  
  def sum2(n:Int, acc:Int):Int = {
    if(n==0) acc else sum2(n-1, acc + n)
  }
  
  //Main-Method
  def main(args: Array[String]) ={
    val m:Int = add(1,2)
    println(m)
    
    val n:Int = fun(10)
    println(n)
    
    dontKnow()
    
    println(errorMsg(1))
    
    val x = sum(10000)
    println(x)
    
    val y = sum2(10000, 0)
    println(y)
  }
}