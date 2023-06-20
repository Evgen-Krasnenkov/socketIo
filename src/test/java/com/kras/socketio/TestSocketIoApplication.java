package com.kras.socketio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSocketIoApplication {

    public static void main(String[] args) {
        SpringApplication.from(SocketIoApplication::main).with(TestSocketIoApplication.class).run(args);
    }

}
