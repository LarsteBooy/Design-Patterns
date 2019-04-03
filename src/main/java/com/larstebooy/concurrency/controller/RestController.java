package com.larstebooy.concurrency.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private int counter = 0;
    private Lock lock = new ReentrantLock();

    @PostMapping("/counter/inc")
    public int addToCounter() throws InterruptedException {
        if(lock.tryLock(5, TimeUnit.SECONDS)){
            try{
                counter++;
            }finally {
                lock.unlock();
            }
        }
        return counter;
    }

    @GetMapping("/counter")
    public int showCounter(){
        return counter;
    }

    @PostMapping("/counter/reset")
    public int resetCounter(){
        counter = 0;
        return counter;
    }

}
