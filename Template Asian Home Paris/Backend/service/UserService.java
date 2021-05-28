
package service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import objects.Client;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service

public class UserService {

     public String saveUser(Client client) throws InterruptedException, ExecutionException {

         Firestore dbFirestore = FirestoreClient.getFirestore();

         ApiFuture<WriteResult>  collectionsApiFuture = dbFirestore.collection("client").document(client.getName()).set(client);
                 return collectionsApiFuture.get().getUpdateTime().toString();
     }
}