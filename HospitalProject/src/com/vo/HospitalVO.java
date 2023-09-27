package com.vo;

public class HospitalVO {
	private String category;
	private String hospitalName;
	private String stateCode;
	private String cityCodt;
	private String address;
	private String phone;
	private String site;
	private String openDate;
	private int doctorCount;

	public HospitalVO() {

	}

	public HospitalVO(String category, String hospitalName, String stateCode, String cityCodt, String address,
			String phone, String site, String openDate, int doctorCount) {
		super();
		this.category = category;
		this.hospitalName = hospitalName;
		this.stateCode = stateCode;
		this.cityCodt = cityCodt;
		this.address = address;
		this.phone = phone;
		this.site = site;
		this.openDate = openDate;
		this.doctorCount = doctorCount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getCityCodt() {
		return cityCodt;
	}

	public void setCityCodt(String cityCodt) {
		this.cityCodt = cityCodt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public int getDoctorCount() {
		return doctorCount;
	}

	public void setDoctorCount(int doctorCount) {
		this.doctorCount = doctorCount;
	}

	@Override
	public String toString() {
		return "HospitalVO [category=" + category + ", hospitalName=" + hospitalName + ", stateCode=" + stateCode
				+ ", cityCodt=" + cityCodt + ", address=" + address + ", phone=" + phone + ", site=" + site
				+ ", openDate=" + openDate + ", doctorCount=" + doctorCount + "]";
	}

}
