package ch.hslu.prg2.ueb6;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<AddressEntry> list;

    public AddressBook() {
        list = new ArrayList<>();
    }

    public void tester() throws Exception, InvalidEmailAddressException {
        try{
            AddressEntry a = new AddressEntry();
            a.setGivenName("Hans");

            a.setFamilyName("Muster");
            try {
                a.setZipCode("6048");
            } catch (NumberFormatException e) {
            }

            a.setResidence("Horw");
            a.setPhoneNumber("+41413391111");
            a.setEmailAddress("Hans.Muster@info.com");

            list.add(a);
        } catch(InvalidEmailAddressException ex){
            throw ex;
        }
    }
}
