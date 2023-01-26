package co.develhope.firstapi2.services;

import org.springframework.stereotype.Service;

@Service
public class FactorialCalculator {

    public Integer calculateFactorial(Integer n) {
        Integer factorial = 1;
        for (Integer i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }


}
