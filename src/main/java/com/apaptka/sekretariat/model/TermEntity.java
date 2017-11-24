package com.apaptka.sekretariat.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "term", schema = "apap_sekretariat", catalog = "")
public class TermEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomorTerm;
    private Timestamp termStart;
    private Timestamp termEnd;
    private Timestamp irsDate;
    private int fakultasId;
    private int prodiId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nomor_term", nullable = false, length = 25)
    public String getNomorTerm() {
        return nomorTerm;
    }

    public void setNomorTerm(String nomorTerm) {
        this.nomorTerm = nomorTerm;
    }

    @Basic
    @Column(name = "term_start", nullable = false)
    public Timestamp getTermStart() {
        return termStart;
    }

    public void setTermStart(Timestamp termStart) {
        this.termStart = termStart;
    }

    @Basic
    @Column(name = "term_end", nullable = false)
    public Timestamp getTermEnd() {
        return termEnd;
    }

    public void setTermEnd(Timestamp termEnd) {
        this.termEnd = termEnd;
    }

    @Basic
    @Column(name = "irs_date", nullable = false)
    public Timestamp getIrsDate() {
        return irsDate;
    }

    public void setIrsDate(Timestamp irsDate) {
        this.irsDate = irsDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TermEntity that = (TermEntity) o;

        if (id != that.id) return false;
        if (fakultasId != that.fakultasId) return false;
        if (prodiId != that.prodiId) return false;
        if (nomorTerm != null ? !nomorTerm.equals(that.nomorTerm) : that.nomorTerm != null) return false;
        if (termStart != null ? !termStart.equals(that.termStart) : that.termStart != null) return false;
        if (termEnd != null ? !termEnd.equals(that.termEnd) : that.termEnd != null) return false;
        if (irsDate != null ? !irsDate.equals(that.irsDate) : that.irsDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nomorTerm != null ? nomorTerm.hashCode() : 0);
        result = 31 * result + (termStart != null ? termStart.hashCode() : 0);
        result = 31 * result + (termEnd != null ? termEnd.hashCode() : 0);
        result = 31 * result + (irsDate != null ? irsDate.hashCode() : 0);
        result = 31 * result + fakultasId;
        result = 31 * result + prodiId;
        return result;
    }
}
