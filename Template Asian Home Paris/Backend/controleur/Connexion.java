package Backend.controleur;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.*;

import static com.google.firebase.FirebaseOptions.builder;


@Service
public class Connexion {

    @PostConstruct
    public void connexion() {
        try {
            FileInputStream serviceAccount =
                    new FileInputStream("Backend/serviceAccount.json");

            private static FirebaseOptions options = new FirebaseOptions.Builder builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://sahp-4e4bb-default-rtdb.firebaseio.com")
                    .build();
            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}