package concertoapp.sttnf.model;

/**
 * Created by Haya Rasikhah on 1/7/2019.
 */

public class ModelDoa {

    private String judul;
    private String ayat;
    private String arti;
    private String tanggal;
    private int img;

    public String getNama() {
        return judul;
    }

    public String getSurah() {
        return ayat;
    }

    public String getArti() {
        return arti;
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getImg() {
        return img;
    }

    public ModelDoa(int img, String judul, String ayat, String arti, String tanggal) {
        this.img = img;

        this.judul = judul;
        this.ayat = ayat;
        this.arti = arti;
        this.tanggal = tanggal;
    }
}
