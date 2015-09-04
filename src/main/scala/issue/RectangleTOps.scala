package model

import simulacrum.{op, typeclass}

import scala.math.Numeric.FloatAsIfIntegral

/**
 * A quadrilateral, defined by its bottom-left point (x1,y1)
 * and its top-right point (x2, y2).
 */
//@typeclass trait RectangleT[S] extends ShapeT[S] {
//
//  def x1(s: Shape): N
//
//  def y1(s: Shape): N
//
//  def x2(s: Shape): N
//
//  def y2(s: Shape): N
//
//  def height(s: Shape)(): N =
//    num.minus(y2(s), y1(s))
//
//  def update(s: Shape)(x1: N, y1: N, x2: N, y2: N): Shape
//
//  def width(s: Shape): N =
//    num.minus(x2(s), x1(s))
//
//  @op("area") override def area(s: Shape): N =
//    num.times(height(s), width(s))
//}
//
///**
// * Methods for constructing or otherwise manipulating Rectangle instances.
// */
//object RectangleTOps {
//
//  // for infix notation
//  val infix = RectangleT.ops
//
//  /**
//   * Evaluates to a string that contains the Rectangle's
//   * point information as x1,y2,x2,y2 .
//   */
//  def asCoordinatesStr[R: RectangleT](r: R): String = {
//    val rt = implicitly[RectangleT[R]]
//    s"${rt.x1(r)},${rt.y1(r)},${rt.x2(r)},${rt.y2(r)}"
//  }
//
//  def boundingAll[R: RectangleT](rs: Seq[R]): R = {
//    val rt = implicitly[RectangleT[R]]
//    val (minX1, minY1, maxX2, maxY2) = {
//      val z = rt.num.zero
//      rs.foldLeft((z, z, z, z)) {
//        case ((x1, y1, x2, y2), r) =>
//          (
//            // update lower-left coordinates
//            rt.num.min(rt.x1(r), x1), rt.num.min(rt.y1(r), y1),
//            // update upper-right coordinates
//            rt.num.max(rt.x2(r), x2), rt.num.max(rt.y2(r), y2)
//          )
//      }
//    }
//    rt.update(rt.zero)(minX1, minY1, maxX2, maxY2)
//  }
//
//  object Implicits {
//
//    implicit object TypeclassForRectangle extends RectangleT[Rectangle] {
//
//      override type N = Float
//      override val num: Numeric[N] = FloatAsIfIntegral
//
//      override val zero: Shape = Rectangle(0.0f, 0.0f, 0.0f, 0.0f)
//
//      override def update(s: Shape)(x1: N, y1: N, x2: N, y2: N): Shape =
//        s.copy(x1 = x1, y1 = y1, x2 = x2, y2 = y2)
//
//      override def x1(s: Shape): N =
//        s.x1
//
//      override def x2(s: Shape): N =
//        s.x2
//
//      override def y1(s: Shape): N =
//        s.y1
//
//      override def y2(s: Shape): N =
//        s.y2
//
//    }
//
//  }
//}
