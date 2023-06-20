package com.kras.socketio;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class SocketIOConfig {

    @Bean
    public SocketIOServer socketIOServer() {
        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(9090);

        SocketIOServer server = new SocketIOServer(config);
        server.addEventListener("fileUploadEvent", byte[].class, new FileUploadEventListener());

        return server;
    }
}
