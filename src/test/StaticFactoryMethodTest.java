import java.util.HashMap;
import java.util.Map;

import coeffticejava.staticfatorymethod.StaticFactoryMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StaticFactoryMethodTest {

    @Test
    void someMapTest() {

        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("name", "some_map_test");

        Map<String, String> map = StaticFactoryMethod.someMap(stringMap);

        Assertions.assertEquals(stringMap.entrySet(), map.entrySet());
    }
}