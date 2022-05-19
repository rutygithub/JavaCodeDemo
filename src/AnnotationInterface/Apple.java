package AnnotationInterface;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apple {
    //using annotation interface
    @FruitProvider(id = 1, name = "Japanese Fuji", address = "Shandong Province")
    private String fruitProvider;

}
