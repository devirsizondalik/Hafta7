package inherit;

public class memur extends person {
	protected String bolum;

	protected memur(String adi, String soyadi, String email, String bolum) {
		super(adi, soyadi, email);
		this.bolum = bolum;
	}

	protected String getBolum() {
		return bolum;
	}

	protected void setBolum(String bolum) {
		this.bolum = bolum;
	}
	protected String giris() {
		return "Personel Kapısından Giriş yaptı.";
	}

	
}
