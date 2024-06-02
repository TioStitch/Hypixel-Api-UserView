package de.tiostitch.hypixel.connect.userview;

import com.google.gson.Gson;
import de.tiostitch.hypixel.connect.userview.objects.ProfilesData;
import de.tiostitch.hypixel.connect.userview.objects.UserData;
import de.tiostitch.hypixel.connect.userview.utils.Colors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HypixelAPI {

    //API para obter as informações.
    private static final String API_URL = "https://api.hypixel.net/v2/skyblock/profiles?key=<SUA_API_AQUI>&uuid=<UUID_DESEJADO_AQUI>";

    public static void main(String[] args) {
        try {

            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            String content = getContent();
            if (content.isEmpty()) {
                System.out.println("[ERRO] Ocorreu um erro ao se conectar com a API.");
                return;
            }

            connection.disconnect();

            Gson gson = new Gson();
            UserData userData = gson.fromJson(content, UserData.class);

            System.out.println(Colors.YELLOW.getANSI() + "API RESPONSE:");
            System.out.println(Colors.YELLOW.getANSI() + "Success: " + Colors.GREEN.getANSI() + userData.isSuccess());
            System.out.println(" ");

            int passed_profile = 1;
            for (ProfilesData profiles : userData.getProfiles()) {
                MessageBuilder.sendProfile(profiles, passed_profile);
                passed_profile++;
            }

        } catch (IOException e) {
            return;
        }
    }

    private static String getContent() {
        try {
            final InputStream inputStream = new URL(API_URL).openStream();

            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            return getContent(bufferedReader);
        } catch(IOException ignored) {
            return "";
        }
    }

    private static String getContent(BufferedReader reader) {
        try {
            final StringBuilder content_builder = new StringBuilder();
            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                content_builder.append(inputLine);
                break;
            }

            return content_builder.toString();
        } catch (IOException ignored) {
            return "";
        }
    }
}