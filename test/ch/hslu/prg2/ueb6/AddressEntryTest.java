
package ch.hslu.prg2.ueb6;

import org.junit.Test;

public class AddressEntryTest {
    
    public AddressEntryTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGivenNameEmptyString() {
        AddressEntry entry = new AddressEntry();
        entry.setGivenName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetFamilyNameEmptyString() {
        AddressEntry entry = new AddressEntry();
        entry.setFamilyName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetZipCodeEmpty() throws Exception {
        AddressEntry entry = new AddressEntry();
        entry.setZipCode("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetZipCodeTooLong() throws Exception {
        AddressEntry entry = new AddressEntry();
        entry.setZipCode("1234567");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetZipCodeTooShort() throws Exception {
        AddressEntry entry = new AddressEntry();
        entry.setZipCode("123");
    }

    @Test
    public void testSetResidence() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPhoneNumberTooShort() {
        AddressEntry entry = new AddressEntry();
        entry.setPhoneNumber("123");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetPhoneNumberNoNumber() {
        AddressEntry entry = new AddressEntry();
        entry.setPhoneNumber("hallo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEmailAddressEmptyString() {
        AddressEntry entry = new AddressEntry();
        entry.setGivenName("");
    }
    
    @Test
    public void testSetEmailAddressInvalidMail(){
        AddressEntry entry = new AddressEntry();
        entry.setGivenName("test.ch");
    }
}
