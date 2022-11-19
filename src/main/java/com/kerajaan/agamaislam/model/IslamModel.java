package com.kerajaan.agamaislam.model;

import javax.persistence.*;

@Entity
//nama table
@Table(name = "kerajaan_islam")
public class IslamModel {

    @Id
    //Generate = primary key
    //Value = auto_acrement
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //kolom table
    @Column(name = "kerajaan_islam")
    private String kerajaanIslam;

    //kolom table
    @Column(name = "letak")
    private String letak;

    //kolom table
    @Column(name = "tahun_berdiri")
    private String tahunBerdiri;

    //kolom table
    @Column(name = "raja_terkenal")
    private String rajaTerkenal;

    //kolom table
    @Column(name = "peninggalan_sejarah")
    private String peninggalanSejarh;


    public IslamModel() {

    }
    //mengisis dan mengatur data
    public IslamModel(Long id, String kerajaanIslam, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarh) {
        //mengakses
        this.id = id;
        this.kerajaanIslam = kerajaanIslam;
        this.letak = letak;
        this.tahunBerdiri = tahunBerdiri;
        this.rajaTerkenal = rajaTerkenal;
        this.peninggalanSejarh = peninggalanSejarh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //mengambil
    public String getKerajaanIslam() {
        return kerajaanIslam;
    }

    //merubah
    public void setKerajaanIslam(String kerajaanIslam) {
        this.kerajaanIslam = kerajaanIslam;
    }

    //mengambil
    public String getLetak() {
        return letak;
    }

    //merubah
    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    //merubah
    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    //mengambil
    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    //merubah
    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    //mengambil
    public String getPeninggalanSejarh() {
        return peninggalanSejarh;
    }

    //merubah
    public void setPeninggalanSejarh(String peninggalanSejarh) {
        this.peninggalanSejarh = peninggalanSejarh;
    }

// merubah nilai type data menjadi type data string
    @Override
    public String toString() {
        return "IslamController{" +
                "id=" + id +
                ", kerajaanIslam='" + kerajaanIslam + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalanSejarh='" + peninggalanSejarh + '\'' +
                '}';
    }
}
