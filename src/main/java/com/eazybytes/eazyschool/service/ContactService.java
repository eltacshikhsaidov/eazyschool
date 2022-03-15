package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ContactService {

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        log.info(contact.toString());
        return isSaved;
    }
}
