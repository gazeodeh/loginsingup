package com.example.loginsingup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class Firebaseservise {
    private static Firebaseservise instance;
    private FirebaseAuth auth;
    private FirebaseFirestore fire;
    private FirebaseStorage storage;

    public Firebaseservise(){
        this.auth=FirebaseAuth.getInstance();
        this.fire=FirebaseFirestore.getInstance();
        this.storage=FirebaseStorage.getInstance();
    }

    public Firebaseservise getInstance(){
        if(instance==null)
            instance=new Firebaseservise();
        return instance;
    }

    public FirebaseAuth getAuth() {
        return auth;
    }

    public FirebaseFirestore getFire() {
        return fire;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }
}
