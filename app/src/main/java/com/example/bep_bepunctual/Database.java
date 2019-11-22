package com.example.bep_bepunctual;

// Base Stitch Packages
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.stitch.android.core.Stitch;
import com.mongodb.stitch.android.core.StitchAppClient;

// Packages needed to interact with MongoDB and Stitch
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

// Necessary component for working with MongoDB Mobile
import com.mongodb.stitch.android.services.mongodb.local.LocalMongoDbService;

import org.bson.BsonString;
import org.bson.Document;

import java.util.ArrayList;

public class Database {

    // Create the default Stitch Client
    final StitchAppClient client = Stitch.initializeDefaultAppClient("<APP ID>");

    final String host = "mongodb://10.25.2.143:8081";
    ServerAddress serverAddress = new ServerAddress(host);
    MongoClient mongoClient;

    // Create a Client for MongoDB Mobile (initializing MongoDB Mobile)
    //final MongoClient mobileClient = client.getServiceClient(LocalMongoDbService.clientFactory);

    public Database() {
        addStudentCalendar();
    }

    private void addStudentCalendar(){
        /*// Point to the target collection and insert a document
        MongoCollection<Document> localCollection =
                mobileClient.getDatabase("BePunctual").getCollection("Schedule");

        localCollection.insertOne(document);

        // Find the first document
        Document doc = localCollection.find().first();

        //Find all documents that match the find criteria
        Document query = new Document();
        query.put("name", new BsonString("veirs"));

        FindIterable<Document> cursor = localCollection.find(query);
        ArrayList<Document> results =
                (ArrayList<Document>) cursor.into(new ArrayList<Document>());*/
    }
}
