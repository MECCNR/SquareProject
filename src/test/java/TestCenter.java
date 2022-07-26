import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class TestCenter {
    @ParameterizedTest
    @CsvSource({
            "100,200,4",
            "200,300,3",
            "1,100,0",
            "0,100,0",
            "500,1000,9"
    })

    public void squareTest(int begin, int end, int expected) {
        SQRService service = new SQRService();

        int actual = service.square(begin, end);
        System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }
}
