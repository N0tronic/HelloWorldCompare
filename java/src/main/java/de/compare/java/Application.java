package de.compare.java;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Application {

    public static void main(String[] args) throws IOException {
        runHttpServer();
    }

    private static void runHttpServer() throws IOException {
        var server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext(
                "/",
                handler -> {
                    try (OutputStream os = handler.getResponseBody()) {
                        var res = "Hello World!";
                        handler.sendResponseHeaders(200, res.getBytes().length);
                        os.write(res.getBytes());
                    } catch (Exception e) {
                        handler.sendResponseHeaders(400, -1);
                    }
                    handler.close();
                }
        );
        server.setExecutor(Executors.newSingleThreadExecutor());
        server.start();
    }
}