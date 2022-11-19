package com.kerajaan.agamaislam.service;

import com.kerajaan.agamaislam.model.IslamModel;

import java.util.List;

public interface IslamService {
    //menambahkan data

    IslamModel addIslamModel(IslamModel islamModel);

    //megambil data
    IslamModel getIslamModelById(Long id);

    //mengubah data
    IslamModel editIslamModelById(Long id, String kerajaan_Islam, String letak, String tahun_berdiri, String raja_terkenal, String peninggalan_sejarah);

    //melihat semua data
    List<IslamModel> getAllIslamModel();

    //menghapus
    void deleteIslamById(Long id);
}
