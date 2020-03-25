public class Address {
    private String ownerName;
    private String Address;
    private String Pincode;

    public Address(String ownerName, String address, String pincode) {
        this.ownerName = ownerName;
        Address = address;
        Pincode = pincode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPincode() {
        return Pincode;
    }
}
