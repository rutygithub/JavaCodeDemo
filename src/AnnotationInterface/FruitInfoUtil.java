package AnnotationInterface;

import java.lang.reflect.Field;

public class FruitInfoUtil {
    public static void getFruitInfo(Class clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                String strFruitProvider = "Provider id: " + fruitProvider.id() + " Provider name:" + fruitProvider.name() + " Provider Address：" + fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }
}