package inherit;

public class test {

	public static void main(String[] args) {
		person p=new person("Ahmet","Mehmet","CrazyAhmet@outlook.com"); 
		System.out.println(p.getAdi() + " " + p.getSoyadi() + " " +p.giris());
		akademikpersonel a=new akademikpersonel("Ali","Veli","Aliveli@outlook.com","PCMÜH");
		System.out.println(a.getDepartman()+" "+a.getAdi()+" "+a.getSoyadi()+" "+a.giris());
		
		hoca h=new hoca("Hasan","Kaya","Hasankaya@outlook.com","PCMÜH","Doc.Dr.");
		System.out.println(h.getDepartman()+" "+h.getUnvan()+" "+h.getAdi()+" "+h.getSoyadi()
		+" "+h.giris());
		
		student s=new student("Emre","Orhan","emreorhan@outlook.com",213405);
		System.out.println(s.getOgrId()+" numaralı "+s.getAdi()+" "+s.getSoyadi()+" "+s.giris());
	}

}
