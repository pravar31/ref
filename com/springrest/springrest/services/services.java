package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Credentials;

@Service
public class services implements serviceint {
    List<Credentials> l;

    // Constructor to initialize the list of Credentials
    public services() {
        cred();
    }

    private void cred() {
        l = new ArrayList<>();
        l.add(new Credentials(1, "pravar", "something"));
        l.add(new Credentials(2, "ram", "nothing"));
        l.add(new Credentials(3, "rahul", "everything"));
    }

    @Override
    public List<Credentials> GetCredentials() {
        return l;
    }
}
