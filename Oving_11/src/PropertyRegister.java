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
   * Adds a property to the register
   *
   * @param property the property to add
   */
  public void registerProperty(Property property) {
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
   * @param property the property key
   * @throws IllegalArgumentException if property is null
   * @return the property (Property)
   */
  public Property findProperty(Property property) throws IllegalArgumentException {
    if (property == null) {
      throw new IllegalArgumentException("Property cannot be null");
    }
    return properties.get(property.toString());
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

}