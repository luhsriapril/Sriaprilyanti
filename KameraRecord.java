package utssriapril;

import java.util.Date;

/**
 *
 * @author sriaprilyanti 2201010011
 * TGL : 2024-05-16
 */
class KameraRecord {
    private String merek;
    private String model;
    private Date tanggalSewa;
    private boolean disewakan;
    
    public KameraRecord(String merek, String model, Date tanggalSewa, boolean disewakan) {
        this.merek = merek;
        this.model = model;
        this.tanggalSewa = tanggalSewa;
        this.disewakan = disewakan;
    }

    // Getter dan Setter
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(Date tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public boolean isDisewakan() {
        return disewakan;
    }

    public void setDisewakan(boolean disewakan) {
        this.disewakan = disewakan;
    }

    @Override
    public String toString() {
        return "KameraRecord{" +
                "merek='" + merek + '\'' +
                ", model='" + model + '\'' +
                ", tanggalSewa=" + tanggalSewa +
                ", disewakan=" + disewakan +
                '}';
    }
}
