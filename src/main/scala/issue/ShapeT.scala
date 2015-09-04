package issue

import simulacrum.{op, typeclass}

@typeclass trait ShapeT[S] {

  type Shape = S
  type N

  def num: Numeric[N]

  def area(s: Shape): N

  def zero: Shape
}

@typeclass trait ShapeTFloat[S] {

  def area(s: S): Float
}
