package main.java.de.tuberlin.tkn.lit.model.activities;

import de.tuberlin.tkn.lit.model.Activity;
import de.tuberlin.tkn.lit.storage.IStorage;

public class Flag extends Activity {
    private static final String type = "Flag";

    public Flag() {
    }

    public Flag(Activity activity) {
        super(activity);
    }

    @Override
    public Activity handle(String actorName,IStorage storage,int port) {
        return this;
    }

    public String getType() {
        return type;
    }
}
