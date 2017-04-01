/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home;

import za.co.migal.home.model.Address;

public interface AddressModule{

    public String sayHello();
    
    public void addAddress(Address address);
    
    public Address findAddress(long id);
    
    public void removeAddress(long id);
    
    public Address editAddress(Address address);
    
}
