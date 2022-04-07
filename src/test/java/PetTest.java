import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

public class PetTest {
    @Test
    public void getNameTest(){
//        Arrange
        Pet sjuul = new Pet("Sjuul", 6, "Golden Retriever");

//        Act
        String petName = sjuul.getName();

//        Assert
       Assertions.assertEquals("Sjuul", petName);
    }
}
