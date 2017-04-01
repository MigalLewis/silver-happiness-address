/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.za.mongo.repository;

import za.co.migal.home.za.mongo.model.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author migal
 */
public interface AddressRepository extends MongoRepository<AddressEntity, String>{
  /**
   * 
   * @param id
   * @return 
   */
  public AddressEntity findById(long id);

}
