package lab7.prob2.intfaces2;

public class Ellipse implements ClosedCurve {
  private double semiaxis;
  private double elateral;

  public Ellipse(double semiaxis, double elateral) {
    this.semiaxis = semiaxis;
    this.elateral = elateral;
  }

  public double getSemiaxis() {
    return semiaxis;
  }

  public double getElateral() {
    return elateral;
  }

  @Override
  public double computePerimeter() {
    return 4 * semiaxis * elateral;
  }
}
