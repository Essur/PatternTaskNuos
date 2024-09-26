package patterns.structural.adapter;

import com.firework.gson.Gson;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Adapter {
    private Message message;

    public void getInput(Input input) {
        Gson gson = new Gson();
        String json = gson.toJson(input);
        this.message = new Message();
        message.setMessageInJson(json);
    }
}
