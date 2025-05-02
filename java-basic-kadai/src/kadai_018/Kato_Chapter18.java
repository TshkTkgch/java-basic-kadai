package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String adress = "東京";
	
	public void commonIntroduce() {
		System.out.println(this.familyName + this.givenName + "です。" + this.adress + "在住です。");
	}
	
	public abstract  void eachIntroduce();
	
	public void execIntroduce() {
		this.commonIntroduce();
		eachIntroduce();
	};
}
