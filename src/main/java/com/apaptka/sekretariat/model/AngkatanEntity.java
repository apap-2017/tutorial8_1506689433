package com.apaptka.sekretariat.model;

import javax.persistence.*;

@Entity
@Table(name = "angkatan", schema = "apap_sekretariat", catalog = "")
public class AngkatanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int universitasId;
    private int fakultasId;
    private int prodiId;
    private int tahunMasuk;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "universitas_id", nullable = false)
    public int getUniversitasId() {
        return universitasId;
    }

    public void setUniversitasId(int universitasId) {
        this.universitasId = universitasId;
    }

    @Basic
    @Column(name = "fakultas_id", nullable = false)
    public int getFakultasId() {
        return fakultasId;
    }

    public void setFakultasId(int fakultasId) {
        this.fakultasId = fakultasId;
    }

    @Basic
    @Column(name = "prodi_id", nullable = false)
    public int getProdiId() {
        return prodiId;
    }

    public void setProdiId(int prodiId) {
        this.prodiId = prodiId;
    }

    @Basic
    @Column(name = "tahun_masuk", nullable = false)
    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AngkatanEntity that = (AngkatanEntity) o;

        if (id != that.id) return false;
        if (universitasId != that.universitasId) return false;
        if (fakultasId != that.fakultasId) return false;
        if (prodiId != that.prodiId) return false;
        if (tahunMasuk != that.tahunMasuk) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + universitasId;
        result = 31 * result + fakultasId;
        result = 31 * result + prodiId;
        result = 31 * result + tahunMasuk;
        return result;
    }
}
