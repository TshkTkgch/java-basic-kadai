package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName;
	public String givenName;
	public String adress;
	
	public Kato_Chapter18() {
		this.familyName = "加藤";
		this.adress = "東京";
	}
	
	public void commonIntroduce() {
		System.out.println(this.familyName + "です。" + this.adress + "在住です。");
	}
	
	public abstract  void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
		eachIntroduce();
	};
}
