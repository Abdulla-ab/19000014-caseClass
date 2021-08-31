case class Point(a:Int, b:Int) {
  var x: Int = a
  var y: Int = b

  def + (that: Point) = Point(this.x + that.x, this.y + that.y)

  def move(dx:Int, dy:Int) = Point(this.x + dx, this.y + dy)

  def distance(that:Point): Double = {
    Math.sqrt((that.y - this.y) * (that.y - this.y) + (that.x - this.x) * (that.x - this.x))
  }

  def invert() = Point(y,x)
}
