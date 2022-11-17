package inherit;

public class hoca extends akademikpersonel{
	protected String unvan;

	protected hoca(String adi, String soyadi, String email, String departman, String unvan) {
		super(adi, soyadi, email, departman);
		this.unvan = unvan;
	}

	protected String getUnvan() {
		return unvan;
	}

	protected void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	protected String giris() {
		return "Fakülte A kapısından Giriş yaptı.";
	}


}
