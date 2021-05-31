
package service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import objects.Client;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service

public class ClientService {

     public String saveClient(Client client) throws InterruptedException, ExecutionException {

         Firestore dbFirestore = FirestoreClient.getFirestore();

         ApiFuture<WriteResult>  collectionsApiFuture = dbFirestore.collection("client").document(client.getName()).set(client);
                 return collectionsApiFuture.get().getUpdateTime().toString();
     }

     public Client getClient (Client client) throws InterruptedException, ExecutionException {
         Firestore db = FirestoreClient.getFirestore();

         DocumentReference docRef = db.collection("users").document("name");
// asynchronously retrieve the document
         ApiFuture<DocumentSnapshot> future = docRef.get();
// ...
// future.get() blocks on response
         DocumentSnapshot document = future.get();
         if (document.exists()) {
             client = document.toObject(Client.class);
             return client;
         } else {
             System.out.println("No such document!");
         }return null;
     }
}