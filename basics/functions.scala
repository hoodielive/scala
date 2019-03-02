def adder1(x: Int, y: Int): Int = {
  return x + y
}

def adder2(x: Int, y: Int) = {
  x + y
}

val adder3 = (x: Int, y: Int) => x + y

val adder4: (Int, Int) => Int = {
  case (x, y) => x + y
}

def adderFactory(x: Int)(y: Int) : Int = x + y

val adder10 = adderFactory(10) _

adder10(5)

def printer = { 
  println("I am the printer")
}

printer
