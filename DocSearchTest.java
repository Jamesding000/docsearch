import static org.junit.Assert.*;
import org.junit.*;

public class DocSearchTest {

    @Test
    public void dummyTest() {
        URLHandler handler = new Handler(null);
        assertEquals("Don't know how to handle that path!", handler.handleRequest(null));
    }

}
