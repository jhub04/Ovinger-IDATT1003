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

  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, float area, String nameOfOwner) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = "";
    this.area = area;
    this.nameOfOwner = nameOfOwner;
  }
}
