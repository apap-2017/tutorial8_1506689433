package com.apaptka.sekretariat.model;

import javax.persistence.*;

@Entity
@Table(name = "kurikulumangkatan", schema = "apap_sekretariat", catalog = "")
public class KurikulumangkatanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int kurikulumId;
    private AngkatanEntity angkatanByAngkatanId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kurikulum_id", nullable = false)
    public int getKurikulumId() {
        return kurikulumId;
    }

    public void setKurikulumId(int kurikulumId) {
        this.kurikulumId = kurikulumId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KurikulumangkatanEntity that = (KurikulumangkatanEntity) o;

        if (id != that.id) return false;
        if (kurikulumId != that.kurikulumId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + kurikulumId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "angkatan_id", referencedColumnName = "id", nullable = false)
    public AngkatanEntity getAngkatanByAngkatanId() {
        return angkatanByAngkatanId;
    }

    public void setAngkatanByAngkatanId(AngkatanEntity angkatanByAngkatanId) {
        this.angkatanByAngkatanId = angkatanByAngkatanId;
    }
}
