import java.util.Objects;

public class PropertyKey {
  private final int municipalityNumber;
  private final int lotNumber;
  private final int sectionNumber;

  public PropertyKey(int municipalityNumber, int lotNumber, int sectionNumber) {
    this.municipalityNumber = municipalityNumber;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
  }

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof PropertyKey)) return false;
    PropertyKey that = (PropertyKey) o;
    return municipalityNumber == that.municipalityNumber &&
        lotNumber == that.lotNumber &&
        sectionNumber == that.sectionNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(municipalityNumber, lotNumber, sectionNumber);
  }

  @Override
  public String toString() {
    return this.municipalityNumber + "-" + this.lotNumber + "/" + this.sectionNumber;
  }
}
