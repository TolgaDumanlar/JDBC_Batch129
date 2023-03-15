package pojos;

public class Ogretmen {
    private int id;
    private String isim;
    private String bolum;
    private String memleket;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        this.memleket = memleket;
    }

    public Ogretmen(int id, String isim, String bolum, String memleket) {
        this.id = id;
        this.isim = isim;
        this.bolum = bolum;
        this.memleket = memleket;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", bolum='" + bolum + '\'' +
                ", memleket='" + memleket + '\'' +
                '}';
    }
}
