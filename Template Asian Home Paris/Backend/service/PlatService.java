package service;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;


@Service
public class PlatService {

    private DocumentReference db;
    private Object Plat;

    public List<QueryDocumentSnapshot> getPlat () throws InterruptedException, ExecutionException {
        // Create a reference to the cities collection
        CollectionReference plats = db.collection("Plats");
// Create a query against the collection.
        Query query = plats.whereEqualTo("nom", "riz,sashimi");


        ApiFuture<QuerySnapshot> querySnapshot = query.get();

// retrieve  query results asynchronously using query.get()

        return querySnapshot.get().getDocuments();
        }
    }