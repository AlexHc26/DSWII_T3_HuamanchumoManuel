package pe.edu.cibertec.DSWII_T3_HuamanchumoManuel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_HuamanchumoManuel.model.bd.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Integer>{
}