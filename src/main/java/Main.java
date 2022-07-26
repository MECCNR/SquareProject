import ru.netology.sqr.SQRService;

// этот класс был создан для отладки сервисного класса
public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();

        int result = service.square(200, 300);
        System.out.println(result);
    }
}
