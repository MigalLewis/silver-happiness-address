package za.co.migal.home.controller;

import za.co.migal.home.AddressModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.migal.home.model.Address;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author migal
 */
@RestController
@RequestMapping(path = "/rest/address", produces = "application/json" )
public class AddressController {

  @Autowired
  private AddressModule module;

  @RequestMapping(method = RequestMethod.GET, value = "/hello")
  @ApiOperation(value = "Says hello.")
  public String hello() {
    return module.sayHello();
  }

  /**
   *
   * @param id
   * @return
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  @ApiOperation(value = "Finds an address by id")
  @ResponseBody
  public Address findAddress(@PathVariable long id) {
    return module.findAddress(id);
  }

  @RequestMapping(method = RequestMethod.POST)
  @ApiOperation(value = "Adds an address")
  @ResponseBody
  public void addAddress(@RequestBody Address address) {
    module.addAddress(address);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
  @ApiOperation(value = "Removes an address")
  public void deleteAddress(@PathVariable long id) {
    module.removeAddress(id);
  }

  @RequestMapping(method = RequestMethod.PUT)
  @ApiOperation(value = "edits an address")
  @ResponseBody
  public Address updateAddress(@RequestBody Address address) {
    return module.editAddress(address);
  }
}
