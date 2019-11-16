import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestingShit {

    @Test
    public void passingShit(){

        Assertions.assertEquals(StupidShit.add(100,100),200);
    }

    @Test
    public void failingShit(){
        Assertions.assertEquals(StupidShit.add(100,100), 50);
    }
}
