package horacio

object LifeTree {
  val SPRING = "spring"
  val FALL = "fall"

  def sizeAfterCicles(qtdeCicles: Int): BigInt = {
    @annotation.tailrec
    def calcule(cicles: Int, size: BigInt, season: String): BigInt = season match {
      case SPRING => {
        if (cicles == 0) size
        else calcule(cicles - 1, size * 2, FALL)
      }
      case FALL => {
        if (cicles == 0) size
        else calcule(cicles - 1, size + 1, SPRING)
      }
    }
    calcule(qtdeCicles, BigInt(1), SPRING)
  }

}
