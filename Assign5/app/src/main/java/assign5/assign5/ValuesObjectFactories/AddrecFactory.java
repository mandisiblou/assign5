package assign5.assign5.ValuesObjectFactories;

import assign5.assign5.ValuesObjects.Addrec;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface AddrecFactory {
    Addrec createAddrec(Long addressId, String street, String town, String postCode, String country);
}
