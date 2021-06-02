package service;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import jdk.javadoc.internal.doclets.formats.html.LinkInfoImpl;
import objects.Client;
import objects.Plat;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;


@Service
public class PlatService {
    
    
    public List <Plat> getPlat () throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();

        Firestore db = null;
        DocumentReference docRef = db.collection("plat").document("name");
// asynchronously retrieve the document
        ApiFuture<DocumentSnapshot> future = docRef.get();

        Client client = null;
// ...
// future.get() blocks on response
        DocumentSnapshot document = future.get();
        if (document.exists()) {
            plat = document.toObject(plat.class);
            return List <Plat>;
        } else {
            System.out.println("No such document!");
        }
        return null;
    }
        public List <Plat> getSushi(Plat plat){
            FirebaseFirestore.getInstance().collection("users").whereGreaterThanOrEqualTo("username", "Sushi")
            return null;
        }
}