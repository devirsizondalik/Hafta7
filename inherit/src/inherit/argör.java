package inherit;

public class argör extends akademikpersonel{
		protected String unvanArgor;

		protected argör(String adi, String soyadi, String email, String departman, String unvanArgor) {
			super(adi, soyadi, email, departman);
			this.unvanArgor = unvanArgor;
		}

		protected String getUnvanArgor() {
			return unvanArgor;
		}

		protected void setUnvanArgor(String unvanArgor) {
			this.unvanArgor = unvanArgor;
		}
		protected String cikis() {
			return "Fakülte B kapısından Çıkış yaptı.";
		}

		

}
