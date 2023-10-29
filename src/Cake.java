public class Cake {
    // Prywatne pola (cechy) ciasta
    private String smak;
    private String rodzaj;
    private Double waga;
    private Double cena;
    // Konstruktor
    public Cake(String smak, String rodzaj, Double waga, Double cena) {
        this.smak = smak;
        this.rodzaj = rodzaj;
        this.waga = waga;
        this.cena = cena;
    }
    // Metody dostępowe (gettery i settery) dla pól
    public String getSmak() {
        return smak;
    }
    public void setSmak(String smak) {
        this.smak = smak;
    }
    public String getRodzaj() {
        return rodzaj;
    }
    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
    public Double getWaga() {
        return waga;
    }
    public void setWaga(double waga) {
        this.waga = waga;
    }
    public Double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    // Metoda do wyświetlania informacji o cieście
    public void wyswietlInformacje() {
        System.out.println("Ciasto smakuje " + smak + ", jest typu " + rodzaj + ", waży " + waga + " g i kosztuje " + cena + " zł.");
    }

}
