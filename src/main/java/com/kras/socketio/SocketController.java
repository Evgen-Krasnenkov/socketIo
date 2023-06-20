package com.kras.socketio;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketController extends TextWebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // Handle new WebSocket connection
        // You can customize this method to perform actions when a new WebSocket connection is established
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Handle incoming WebSocket messages
        // You can customize this method to process the received WebSocket message
        String payload = message.getPayload();
        System.out.println("Received message: " + payload);

        // Example: Sending a response message
        session.sendMessage(new TextMessage("Response to: " + payload));
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        WebSocketSession session1 = session;
        // Handle WebSocket transport error
        // You can customize this method to handle any transport-related errors
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        // Handle WebSocket connection closed
        // You can customize this method to perform actions when a WebSocket connection is closed
    }
}
