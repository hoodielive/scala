class Operation(var x: Int, var y: Int) {
  
  def add() : Int = {
    this.x + this.y 
  }

  def sub() : Int = {
    this.x - this.y 
  }

  def mul() : Int = {
    this.x * this.y 
  }

  def div() : Double = {
    val doubleX = this.x.toDouble 
    val doubleY = this.y.toDouble
    doubleX / doubleY
  }
}

val operation = new Operation(3, 4)
println(operation.add)
println(operation.sub)
println(operation.mul)
println(operation.div)
println(operation.x)
println(operation.y)
println(operation.add)
