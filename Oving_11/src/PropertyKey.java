import java.util.Objects;

/**
 * Represents a property key. This class acts as the property key for the property register.
 *
 * @author Jonathan Hübertz
 * @version 1.0
 * @since 2023-11-08
 */
public class PropertyKey {

  private final int municipalityNumber;
  private final int lotNumber;
  private final int sectionNumber;

  /**
   * Constructor for property key.
   *
   * @param municipalityNumber the municipality number
   * @param lotNumber          the lot number
   * @param sectionNumber      the section number
   */

  public PropertyKey(int municipalityNumber, int lotNumber, int sectionNumber) {
    this.municipalityNumber = municipalityNumber;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
  }

  /**
   * Getter for municipality number.
   *
   * @return municipality number
   */
  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  /**
   * Getter for lot number.
   *
   * @return lot number
   */
  public int getLotNumber() {
    return lotNumber;
  }

  /**
   * Getter for section number.
   *
   * @return section number
   */
  public int getSectionNumber() {
    return sectionNumber;
  }

  /**
   * Checks if two property keys are equal.
   *
   * @param o the object to compare to
   * @return true if the property keys are equal, false if not
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PropertyKey)) {
      return false;
    }
    PropertyKey that = (PropertyKey) o;
    return municipalityNumber == that.municipalityNumber
        && lotNumber == that.lotNumber
        && sectionNumber == that.sectionNumber;
  }

  /**
   * Generates a hash code for the property key.
   *
   * @return the hash code
   */
  @Override
  public int hashCode() {
    return Objects.hash(municipalityNumber, lotNumber, sectionNumber);
  }

  /**
   * Provides a string representation of a property key.
   *
   * @return a string representation of a property key
   */
  @Override
  public String toString() {
    return this.municipalityNumber + "-" + this.lotNumber + "/" + this.sectionNumber;
  }
}
