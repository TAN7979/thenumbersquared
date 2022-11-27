package ru.netology.sqr;

public class SQRService {
    public int calc(int x, int y) {
        int right = 0;
        for (int i = 10; i < 100; i++) {
            int iSquare = i * i;
            if (iSquare >= x) {
                if (iSquare <= y) {
                    right++;

                }
            }
        }
        return right;
    }
}
