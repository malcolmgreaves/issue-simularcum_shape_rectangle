package issue

/*

import org.scalatest.FunSuite

class ShapeTest extends FunSuite {

  import RectangleTOps.infix._
  import ShapeTest._

  implicit class TripleEqualsForFloats(f: Float) {

    def ===(other: Float): Unit =
      if (math.abs(f - other) < 0.00001)
        ()
      else
        throw new Exception(s"[FAILED] $f === $other")

    def !==(other: Float): Unit =
      if (math.abs(f - other) >= 0.00001)
        ()
      else
        throw new Exception(s"[FAILED] $f !== $other")
  }

  private[this] def testRectangleIsSquare[S: RectangleT](
    sq:           S,
    expectedSide: Float
  ): Unit = {
    sq.height() === expectedSide
    sq.width === sq.height
    sq.area === expectedSide * expectedSide
  }

  test("square tests") {

    //    TypeclassForRectangle
    //    import ShapeT.ops.toAllShapeTOps
    //
    //    val sq = toAllShapeTOps(square)

    //    sq.height === 10.0f
    //    sq.width === sq.height
    //    sq.area === 100.0f

    import RectangleTOps.Implicits._
    testRectangleIsSquare(square, 10.0f)

  }

  ignore("rectangle tests") {
    //    rectangle.height === 60.0f
    //    rectangle.width === 50.0f
    //    rectangle.height !== rectangle.width
    //    rectangle.area === 3000.0f
  }

}

object ShapeTest {

  val square =
    Rectangle(
      x1 = 10, y1 = 10,
      x2 = 20, y2 = 20
    )

  val rectangle =
    Rectangle(
      x1 = 10, y1 = 30,
      x2 = 60, y2 = 90
    )

}

*/
