package inherit;

public abstract class akademikpersonel extends person{
	protected String departman;

	protected akademikpersonel(String adi, String soyadi, String email, String departman) {
		super(adi, soyadi, email);
		this.departman = departman;
	}

	protected String getDepartman() {
		return departman;
	}

	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	
	protected String giris() {
		return "Fakülte Kapısından Giriş yaptı.";
	}
	protected abstract String cikis(); 
}
