package com.apaptka.sekretariat.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "jadwalkelas", schema = "apap_sekretariat", catalog = "")
public class JadwalKelasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Time waktuMulai;
    private Time waktuSelesai;
    private String hari;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "waktu_mulai", nullable = false)
    public Time getWaktuMulai() {
        return waktuMulai;
    }

    public void setWaktuMulai(Time waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    @Basic
    @Column(name = "waktu_selesai", nullable = false)
    public Time getWaktuSelesai() {
        return waktuSelesai;
    }

    public void setWaktuSelesai(Time waktuSelesai) {
        this.waktuSelesai = waktuSelesai;
    }

    @Basic
    @Column(name = "hari", nullable = false, length = 10)
    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JadwalKelasEntity that = (JadwalKelasEntity) o;

        if (id != that.id) return false;
        if (waktuMulai != null ? !waktuMulai.equals(that.waktuMulai) : that.waktuMulai != null) return false;
        if (waktuSelesai != null ? !waktuSelesai.equals(that.waktuSelesai) : that.waktuSelesai != null) return false;
        if (hari != null ? !hari.equals(that.hari) : that.hari != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (waktuMulai != null ? waktuMulai.hashCode() : 0);
        result = 31 * result + (waktuSelesai != null ? waktuSelesai.hashCode() : 0);
        result = 31 * result + (hari != null ? hari.hashCode() : 0);
        return result;
    }
}
