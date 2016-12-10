package assign5.assign5.ValuesObjectFactories.AddrecFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.AddrecFactory;
import assign5.assign5.ValuesObjects.Addrec;

import java.util.UUID;


public class AddrecFactoryImp implements AddrecFactory {
    private static AddrecFactoryImp factory = null;

    private  AddrecFactoryImp() {
    }
    public static AddrecFactoryImp getInstance(){
        if(factory ==null)
            factory = new AddrecFactoryImp();
        return factory;
    }
    public Addrec createAddrec(Long addressId, String street, String town, String postCode, String country) {
        Addrec addrec = new Addrec
                .Builder()
                .addressId(addressId)
                .street(street)
                .town(town)
                .postCode(postCode)
                .country(country)
                .build();
        return addrec;
    }
}
