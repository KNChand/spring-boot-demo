package org.example.semanticsearch;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Retry(name = "paymentService")
    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallback")
    public String makePayment() {

        System.out.println("Calling payment service...");

        // Simulating failure
        throw new RuntimeException("Payment service unavailable");
    }

    public String fallback(Exception ex) {
        return "Payment service is currently unavailable";
    }
}
