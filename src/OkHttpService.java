import okhttp3.*;

import java.io.IOException;

public class OkHttpService {
    OkHttpClient client = new OkHttpClient();

    public String run(String url) throws IOException {
        Request request = new Request.Builder().get()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();

        }
    }
}
