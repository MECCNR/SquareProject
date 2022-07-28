package ru.netology.sqr;
public class SQRService {

    public int square(int begin, int end) {
        int amount = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= begin) {
                if (i * i <= end) {
                    amount = amount + 1;
                }
            }
        }
        return amount;
    }
}