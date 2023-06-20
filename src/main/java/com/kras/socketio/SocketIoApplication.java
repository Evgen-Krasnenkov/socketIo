package com.kras.socketio;

import com.corundumstudio.socketio.SocketIOServer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@SpringBootApplication
@RequiredArgsConstructor
public class SocketIoApplication implements ApplicationRunner {
    private SocketIOServer socketIOServer;

    public static void main(String[] args) {
        SpringApplication.run(SocketIoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        socketIOServer.start();
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
