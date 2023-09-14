import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {
    @Test
    void trueFindById() {
        ShopRepository shopRepository = new ShopRepository();

        Product product = new Product(123, "Пельмени", 500);
        shopRepository.add(product);

        //shopRepository.remove(123); - моя ошибка

        Assertions.assertThrows(NotFoundException.class, () -> {
            shopRepository.remove(777);
        });
    }

    @Test
    void falseFindById() {
        ShopRepository shopRepository = new ShopRepository();

        Product product = new Product(123, "Пельмени", 500);
        shopRepository.add(product);

        //shopRepository.remove(777); - моя ошибка

        Assertions.assertThrows(NotFoundException.class, () -> {
            shopRepository.remove(777);
        });
    }
}