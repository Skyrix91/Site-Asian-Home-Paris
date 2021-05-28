package Backend.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;


@Service
public class Connexion {

    @PostConstruct
    public void connexion() {
        try {
            FileInputStream serviceAccount =
                    new FileInputStream("Backend/serviceAccount.json");


            FirebaseOptions builder = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://sahp-4e4bb-default-rtdb.firebaseio.com")
                    .build();
            FirebaseApp.initializeApp(builder);
        } catch (Exception e) {
        e.printStackTrace();



        }
    }
}