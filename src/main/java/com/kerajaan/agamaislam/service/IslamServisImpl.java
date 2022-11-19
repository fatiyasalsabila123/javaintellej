package com.kerajaan.agamaislam.service;


import com.kerajaan.agamaislam.model.IslamModel;
import com.kerajaan.agamaislam.repository.IslamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IslamServisImpl implements IslamService {
    //memanggil class IslamReposytory
    @Autowired
    IslamRepository islamRepository;

    @Override
    public IslamModel addIslamModel(IslamModel islamModel) {
        return islamRepository.save(islamModel);
    }

    @Override
    public IslamModel getIslamModelById(Long id) {
        return islamRepository.findById(id).get();
    }

    //untuk mengakses dan mengisi data ke dalam objek.
    @Override
    public IslamModel editIslamModelById(Long id, String kerajaan_Islam, String letak, String tahun_berdiri, String raja_terkenal, String peninggalan_sejarah) {
        IslamModel islamModel = islamRepository.findById(id).get();
        islamModel.setKerajaanIslam(kerajaan_Islam);
        islamModel.setLetak(letak);
        islamModel.setTahunBerdiri(tahun_berdiri);
        islamModel.setRajaTerkenal(raja_terkenal);
        islamModel.setPeninggalanSejarh(peninggalan_sejarah);
        return islamRepository.save(islamModel);
    }

    //melihat semua data
    @Override
    public List<IslamModel> getAllIslamModel() {
        return islamRepository.findAll();
    }
    //menghapus data
    @Override
    public void deleteIslamById(Long id) {
        islamRepository.deleteById(id);
    }
}
