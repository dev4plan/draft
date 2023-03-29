package ru.web.webproject.pages;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class GuestPage {
    private static final String URL_YANDEX = "https://www.yandex.ru";
    private InputStream inputStream;
    private FileOutputStream fos;
    private OutputStream out;
    File file;

    public byte[] getYandex() {
        {
            try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get(URL_YANDEX)))) {

                try {
                    URL url = new URL(URL_YANDEX);
                    HttpsURLConnection httpURLConnection = (HttpsURLConnection) url.openConnection();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        inputStream = httpURLConnection.getInputStream();
                        file = new File("ya.json");
                        file.createNewFile();
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                        Path path = file.toPath();
                        fos = new FileOutputStream(file);
                        byte[] buffer = new byte[1024];
                        int readByte = -1;
                        while ((readByte = inputStream.read(buffer)) != -1) {
                            fos.write(buffer, 0, readByte);
                            out.write(buffer, 0, readByte);
                            outputStream.write(buffer, 0, readByte);
                            bufferedWriter.write(Arrays.toString(buffer), 0, readByte);
                        }
                    }
                    fos.close();
                    out.close();
                    return Files.readAllBytes(file.toPath());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public FileOutputStream getYandexToPage() {
        try {
            URL url = new URL(URL_YANDEX);
            HttpsURLConnection httpURLConnection = (HttpsURLConnection) url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputStream = httpURLConnection.getInputStream();
                byte[] buffer = new byte[1024];
                int readByte = -1;
                while ((readByte = inputStream.read(buffer)) != -1) {
                    fos.write(buffer, 0, readByte);
                }
            }
            return fos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
