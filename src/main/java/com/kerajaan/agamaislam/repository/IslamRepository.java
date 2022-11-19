package com.kerajaan.agamaislam.repository;

import com.kerajaan.agamaislam.model.IslamModel;
import org.springframework.data.jpa.repository.JpaRepository;

//extends  untuk memanggil fungsi dari class lain
public interface IslamRepository extends JpaRepository<IslamModel, Long> {
}
