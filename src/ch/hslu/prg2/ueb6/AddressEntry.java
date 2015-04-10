package ch.hslu.prg2.ueb6;

public class AddressEntry {

    private String givenName, familyName;
    private String zipCode;
    private String residence;
    private String phoneNumber;
    private String eMailAddress;

    public AddressEntry() {

    }

    public AddressEntry(String givenName, String familyName,
            String zipCode, String residence,
            String phoneNumber, String eMailAddress) {

    }

    public void setGivenName(String givenName) {
        if(givenName.equals("")){
            throw new IllegalArgumentException("Given Name must not be an empty string");
        }
        
        this.givenName = givenName;
    }

    public void setFamilyName(String familyName) {
        if(familyName.equals("")){
            throw new IllegalArgumentException("Family Name must not be an empty string");
        }
        
        this.familyName = familyName;
    }

    public void setZipCode(String zipCode) throws Exception {
        if(!isNumeric(zipCode)){
            throw new IllegalArgumentException("zipcode has to be a number");
        }
        if(zipCode.length() > 6 || zipCode.length() < 4){
            throw new IllegalArgumentException(zipCode + " is not a Swiss PLZ");
        }
        
        this.zipCode = zipCode;
    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    
    public void setResidence(String residence) {

    }

    public void setPhoneNumber(String phoneNumber) {
        if(!isNumeric(phoneNumber)){
            throw new IllegalArgumentException("zipcode has to be a number");
        }
        
        if(phoneNumber.length() < 8){
            throw new IllegalArgumentException(zipCode + " is not a Swiss PLZ");
        }
    }

    public void setEmailAddress(String eMailAdresse) {
        // wirft InvalidEmailException falls eMailAdresse kein @ enthaelt
    }
}
