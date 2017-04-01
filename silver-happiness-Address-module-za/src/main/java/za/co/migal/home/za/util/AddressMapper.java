/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.za.util;

import za.co.migal.home.model.Address;
import za.co.migal.home.za.mongo.model.AddressEntity;

/**
 *
 * @author migal
 */
public class AddressMapper {

  public Address map(AddressEntity address) {
    Address outputAddress = new Address();
    outputAddress.setId(address.getId());
    outputAddress.setUnitNumber(address.getUnitNumber());
    outputAddress.setComplexName(address.getComplexName());
    outputAddress.setStreetNumber(address.getStreetNumber());
    outputAddress.setStreetName1(address.getStreetName1());
    outputAddress.setStreetName2(address.getStreetName2());
    outputAddress.setStreetName3(address.getStreetName3());
    outputAddress.setSuburb(address.getSuburb());
    outputAddress.setPostalcode(address.getPostalcode());
    outputAddress.setCity(address.getCity());
    outputAddress.setCountry(address.getCountry());
    outputAddress.setContinent(address.getContinent());
    return outputAddress;
  }

  public AddressEntity map(Address address) {
    AddressEntity outputAddress = new AddressEntity();
    outputAddress.setId(address.getId());
    outputAddress.setUnitNumber(address.getUnitNumber());
    outputAddress.setComplexName(address.getComplexName());
    outputAddress.setStreetNumber(address.getStreetNumber());
    outputAddress.setStreetName1(address.getStreetName1());
    outputAddress.setStreetName2(address.getStreetName2());
    outputAddress.setStreetName3(address.getStreetName3());
    outputAddress.setSuburb(address.getSuburb());
    outputAddress.setPostalcode(address.getPostalcode());
    outputAddress.setCity(address.getCity());
    outputAddress.setCountry(address.getCountry());
    outputAddress.setContinent(address.getContinent());
    return outputAddress;
  }

}
