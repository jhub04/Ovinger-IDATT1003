import java.util.HashMap;

/**
 * Represents a property register.
 *
 * @author Jonathan Hübertz
 * @version 1.0.0
 * @since 2023-11-08
 */
public class PropertyRegister {

  private final HashMap<String, Property> properties;

  /**
   * Constructor for property register
   */
  public PropertyRegister() {
    this.properties = new HashMap<>();
  }

  /**
   * Adds a property with name to the register
   *
   * @param municipalityNumber the municipality number
   * @param municipalityName   the municipality name
   * @param lotNumber          the lot number
   * @param sectionNumber      the section number
   * @param name               the name
   * @param area               the area
   * @param nameOfOwner        the name of the owner
   * @throws IllegalArgumentException if property already exists
   */
  public void registerProperty(int municipalityNumber, String municipalityName, int lotNumber,
      int sectionNumber, String name, double area, String nameOfOwner)
      throws IllegalArgumentException {
    Property property = new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber,
        name, area, nameOfOwner);
    if (properties.containsKey(property.toString())) {
      throw new IllegalArgumentException("Property already exists");
    }
    properties.put(property.toString(), property);

  }

  /**
   * Adds a property with name to the register
   *
   * @param municipalityNumber the municipality number
   * @param municipalityName   the municipality name
   * @param lotNumber          the lot number
   * @param sectionNumber      the section number
   * @param area               the area
   * @param nameOfOwner        the name of the owner
   * @throws IllegalArgumentException if property already exists
   */
  public void registerProperty(int municipalityNumber, String municipalityName, int lotNumber,
      int sectionNumber, double area, String nameOfOwner) throws IllegalArgumentException {
    Property property = new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber,
        area, nameOfOwner);
    if (properties.containsKey(property.toString())) {
      throw new IllegalArgumentException("Property already exists");
    }
    properties.put(property.toString(), property);

  }

  /**
   * Deletes a property from the register
   *
   * @param property the property key
   */
  public void deleteProperty(Property property) {
    properties.remove(property.toString());
  }

  /**
   * Finds a property from the register
   *
   * @param municipalityNumber the municipality number
   * @param lotNumber          the lot number
   * @param sectionNumber      the section number
   * @return the property (Property)
   * @throws IllegalArgumentException if property is null
   */
  public Property findProperty(int municipalityNumber, int lotNumber, int sectionNumber)
      throws IllegalArgumentException {
    for (Property property : properties.values()) {
      if (property.getMunicipalityNumber() == municipalityNumber
          && property.getLotNumber() == lotNumber
          && property.getSectionNumber() == sectionNumber) {
        return property;
      }
    }
    return null;
  }

  /**
   * Gets the number of properties in the register
   *
   * @return the number of properties (int)
   */

  public int getNumberOfProperties() {
    return properties.size();
  }

  /**
   * Gets the average area of all properties in the register
   *
   * @return the average area (double)
   */

  public double getAverageArea() {
    double totalArea = 0;
    for (Property property : properties.values()) {
      totalArea += property.getArea();
    }
    return totalArea / getNumberOfProperties();
  }

  /**
   * Gets all properties with the same lot number
   *
   * @param lotNumber the lot number
   * @return the properties (Property[])
   */

  public Property[] getPropertiesWithLotNumber(int lotNumber) {
    Property[] propertiesWithLotNumber = new Property[getNumberOfProperties()];
    int i = 0;
    for (Property property : properties.values()) {
      if (property.getLotNumber() == lotNumber) {
        propertiesWithLotNumber[i] = property;
        i++;
      }
    }
    return propertiesWithLotNumber;

  }

  /**
   * Gets all properties
   *
   * @return the properties (Property[])
   */

  public Property[] getProperties() {
    Property[] properties = new Property[getNumberOfProperties()];
    int i = 0;
    for (Property property : this.properties.values()) {
      properties[i] = property;
      i++;
    }
    return properties;

  }
}