/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.migal.home.model;

import lombok.Data;

/**
 *
 * @author migal
 */
@Data
public class Address {
  private long id;
  private int unitNumber;
  private String complexName;
  private int streetNumber;
  private String streetName1;
  private String streetName2;
  private String streetName3;
  private String suburb;
  private int postalcode;
  private String city;
  private String country;
  private String continent;
}
