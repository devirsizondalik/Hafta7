package inherit;

public class student extends person {
	protected int ogrId;

	protected student(String adi, String soyadi, String email, int ogrId) {
		super(adi, soyadi, email);
		this.ogrId = ogrId;
	}

	protected int getOgrId() {
		return ogrId;
	}

	protected void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}
	protected String giris() {
		return super.giris();
	}

}	
