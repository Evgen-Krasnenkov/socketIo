package com.kras.socketio;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.listener.DataListener;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class FileUploadEventListener implements DataListener<byte[]> {

    @Override
    public void onData(SocketIOClient client, byte[] data, AckRequest ackRequest) {
        // Process the received file bytes
        // You can write your custom logic here

        // Example: Save the file to disk
        String fileName = "receivedFile.dat";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(data);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Send an acknowledgement to the client if necessary
        if (ackRequest != null) {
            ackRequest.sendAckData("File received successfully!");
        }
    }
}
