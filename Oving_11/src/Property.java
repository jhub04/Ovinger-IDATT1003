public class Property {

  private final int municipalityNumber;
  private final String municipalityName;
  private final int lotNumber;
  private final int sectionNumber;
  private final String name;
  private final float area;
  private String nameOfOwner;

  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
      String name, float area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = name;
    this.area = area;
    this.nameOfOwner = nameOfOwner;

  }

  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber,
      float area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = "";
    this.area = area;
    this.nameOfOwner = nameOfOwner;
  }

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getName() {
    return name;
  }

  public float getArea() {
    return area;
  }

  public String getNameOfOwner() {
    return nameOfOwner;
  }

  public void setNameOfOwner(String nameOfOwner) {
    this.nameOfOwner = nameOfOwner;
  }

  public String toString() {
    return this.municipalityNumber + "-" + this.lotNumber + "/" + this.sectionNumber;
  }
}
