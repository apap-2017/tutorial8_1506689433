package com.apaptka.sekretariat.model;

import javax.persistence.*;

@Entity
@Table(name = "kelas", schema = "apap_sekretariat", catalog = "")
public class KelasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String kodeKelas;
    private String mataKuliahId;
    private String namaKelas;
    private String dosenPengajar;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kode_kelas", nullable = false, length = 25)
    public String getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    @Basic
    @Column(name = "mata_kuliah_id", nullable = false, length = 25)
    public String getMataKuliahId() {
        return mataKuliahId;
    }

    public void setMataKuliahId(String mataKuliahId) {
        this.mataKuliahId = mataKuliahId;
    }

    @Basic
    @Column(name = "nama_kelas", nullable = false, length = 25)
    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    @Basic
    @Column(name = "dosen_pengajar", nullable = false, length = 25)
    public String getDosenPengajar() {
        return dosenPengajar;
    }

    public void setDosenPengajar(String dosenPengajar) {
        this.dosenPengajar = dosenPengajar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KelasEntity that = (KelasEntity) o;

        if (id != that.id) return false;
        if (kodeKelas != null ? !kodeKelas.equals(that.kodeKelas) : that.kodeKelas != null) return false;
        if (mataKuliahId != null ? !mataKuliahId.equals(that.mataKuliahId) : that.mataKuliahId != null) return false;
        if (namaKelas != null ? !namaKelas.equals(that.namaKelas) : that.namaKelas != null) return false;
        if (dosenPengajar != null ? !dosenPengajar.equals(that.dosenPengajar) : that.dosenPengajar != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (kodeKelas != null ? kodeKelas.hashCode() : 0);
        result = 31 * result + (mataKuliahId != null ? mataKuliahId.hashCode() : 0);
        result = 31 * result + (namaKelas != null ? namaKelas.hashCode() : 0);
        result = 31 * result + (dosenPengajar != null ? dosenPengajar.hashCode() : 0);
        return result;
    }
}
