package com.example.ms_configuration.Repository;

import com.example.ms_configuration.Entity.MenuLabels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuLabelRepository extends JpaRepository<MenuLabels,Long> {
    @Query("SELECT ml FROM MenuLabels ml WHERE ml.menu.id = :idmenu")
    List<MenuLabels> findMenuLabelsByIdMenu(Long idmenu);


}
