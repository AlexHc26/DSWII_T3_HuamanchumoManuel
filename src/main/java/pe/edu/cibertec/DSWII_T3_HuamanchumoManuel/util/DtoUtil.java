package pe.edu.cibertec.DSWII_T3_HuamanchumoManuel.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_T3_HuamanchumoManuel.model.dto.DtoEntity;


@Component
public class DtoUtil {
    public DtoEntity convertirADto(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public Object convertirDtoAEntity(Object obj, DtoEntity mapper) {
        return new ModelMapper().map(mapper, obj.getClass());
    }
}
