package bsnt.np.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HasMapOperationsTest {
    @Test
    @DisplayName("List of Country With Capital")
    void listOfCountryWithCapitals(){
        HasMapOperations obj = new HasMapOperations();
        assertEquals(obj.listOfCountryWithCapitals().size(),25);
    }
}