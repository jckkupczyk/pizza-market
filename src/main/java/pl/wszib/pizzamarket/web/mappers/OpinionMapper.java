package pl.wszib.pizzamarket.web.mappers;
import org.springframework.stereotype.Component;
import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.web.models.OpinionModel;

@Component
public class OpinionMapper {
    public static OpinionEntity toEntity(OpinionModel opinionModel) {
        OpinionEntity opinionEntity = new OpinionEntity();
        opinionEntity.setName(opinionModel.getName());
        opinionEntity.setOpinion(opinionModel.getOpinion());
        return opinionEntity;
    }
    public static OpinionModel toModel(OpinionEntity opinionEntity) {
        OpinionModel opinionModel = new OpinionModel();
        opinionModel.setName(opinionEntity.getName());
        opinionModel.setOpinion(opinionEntity.getOpinion());
        return opinionModel;
    }
}
