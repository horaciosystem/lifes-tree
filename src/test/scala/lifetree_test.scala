import org.scalatest._
import horacio.LifeTree._

class LifeTreeSpecs extends FlatSpec with Matchers {

  it should "return 2 meters after 1 cicle" in {
    val size = sizeAfterCicles(1)
    size should be (2)
  }

  it should "return 3 meters after 2 cicle" in {
    val size = sizeAfterCicles(2)
    size should be (3)
  }

  it should "return 6 meters after 3 cicle" in {
    val size = sizeAfterCicles(3)
    size should be (6)
  }

  it should "return 7 meters after 4 cicle" in {
    val size = sizeAfterCicles(4)
    size should be (7)
  }

  it should "return 14 meters after 5 cicle" in {
    val size = sizeAfterCicles(5)
    size should be (14)
  }

  it should "return 15 meters after 6 cicle" in {
    val size = sizeAfterCicles(6)
    size should be (15)
  }

  it should "return 30 meters after 7 cicle" in {
    val size = sizeAfterCicles(7)
    size should be (30)
  }

}
