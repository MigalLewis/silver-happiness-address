package za.co.migal.home.za;

import org.springframework.beans.factory.annotation.Autowired;
import za.co.migal.home.AddressModule;
import org.springframework.stereotype.Component;
import za.co.migal.home.model.Address;
import za.co.migal.home.za.mongo.model.AddressEntity;
import za.co.migal.home.za.mongo.repository.AddressRepository;
import za.co.migal.home.za.util.AddressMapper;

@Component
public class AddressModuleImpl implements AddressModule {

  public AddressRepository addressRepository;
  public AddressMapper addressMapper;

  @Override
  public String sayHello() {
    return "Hello from South Africa";
  }

  @Override
  public void addAddress(Address address) {
    addressRepository.save(addressMapper.map(address));
  }

  @Override
  public Address findAddress(long id) {
    return addressMapper.map(addressRepository.findById(id));
  }

  @Override
  public void removeAddress(long id) {
    addressRepository.delete(Long.toString(id));
  }

  @Override
  public Address editAddress(Address address) {
    AddressEntity addressEntity=addressRepository.save(addressMapper.map(address));
    return addressMapper.map(addressEntity);
  }

  @Autowired
  public void setAddressRepository(AddressRepository addressRepository) {
    this.addressRepository = addressRepository;
  }

  @Autowired
  public void setAddressMapper(AddressMapper addressMapper) {
    this.addressMapper = addressMapper;
  }

}
