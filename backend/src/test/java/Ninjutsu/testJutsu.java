package Ninjutsu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testJutsu {
    Jutsu jutsu = new Jutsu("sheep, dog, monkey");
    @Test
    public void checkJutsu(){
        String[] seals = {"sheep", "dog", "monkey"};
        assertEquals(seals, jutsu.getHandsign());
    }
}
