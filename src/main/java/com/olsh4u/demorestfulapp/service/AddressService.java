package com.olsh4u.demorestfulapp.service;

import com.olsh4u.demorestfulapp.entity.Address;
import com.olsh4u.demorestfulapp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void createAddress(Address address) {
        addressRepository.save(address);
    }
}

