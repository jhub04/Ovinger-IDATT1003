/**
 * Class for properties
 *
 * @author Jonathan Hübertz
 * @version 1.0
 * @since 2023-11-08
 */
public class Property {

  private final int municipalityNumber;
  private final String municipalityName;
  private final int lotNumber;
  private final int sectionNumber;
  private final String name;
  private final double area;
  private String nameOfOwner;

  /**
   * Constructor for properties with name
   *
   * @param municipalityNumber the municipality number
   * @param municipalityName   the municipality name
   * @param lotNumber          the lot number
   * @param sectionNumber      the section number
   * @param name               the name
   * @param area               the area
   * @param nameOfOwner        the name of the owner
   */
  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
      String name, double area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = name;
    this.area = area;
    this.nameOfOwner = nameOfOwner;

  }

  /**
   * Constructor for properties without name
   *
   * @param municipalityNumber the municipality number
   * @param municipalityName   the municipality name
   * @param lotNumber          the lot number
   * @param sectionNumber      the section number
   * @param area               the area
   * @param nameOfOwner        the name of the owner
   */
  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
      double area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = "";
    this.area = area;
    this.nameOfOwner = nameOfOwner;
  }

  /**
   * Returns the municipality number
   *
   * @return municipality number
   */
  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  /**
   * Returns the municipality name
   *
   * @return municipality name
   */
  public String getMunicipalityName() {
    return municipalityName;
  }

  /**
   * Returns the lot number
   *
   * @return lot number
   */
  public int getLotNumber() {
    return lotNumber;
  }

  /**
   * Returns the section number
   *
   * @return section number
   */
  public int getSectionNumber() {
    return sectionNumber;
  }

  /**
   * Returns the name
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the area
   *
   * @return area
   */
  public double getArea() {
    return area;
  }

  /**
   * Returns the name of the owner
   *
   * @return name of the owner
   */
  public String getNameOfOwner() {
    return nameOfOwner;
  }

  /**
   * Sets the name of the owner
   *
   * @param nameOfOwner the name of the owner
   */

  public void setNameOfOwner(String nameOfOwner) {
    this.nameOfOwner = nameOfOwner;
  }

  @Override
  public String toString() {
    return this.municipalityNumber + "-" + this.lotNumber + "/" + this.sectionNumber;
  }

}


