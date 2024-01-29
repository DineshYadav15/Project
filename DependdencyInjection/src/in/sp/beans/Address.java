package in.sp.beans;

public class Address {
	private int houseNo;
	private String city;
	private int pincode;
	
	
	public int getHouseNo() {
		return houseNo;
	}


	public String getCity() {
		return city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public void display()
	{
		System.out.println("HouseNO  : " + houseNo);
		System.out.println("City     : " + city);
		System.out.println("Pincode  : " + pincode);
	}


	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pincode=" + pincode + "]";
	}


	

}
