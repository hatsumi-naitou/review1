public class Parson {

	public static String uji = "氏";
	public static String na = "名";

	public String firstName;
	public String lastName;

	public String getFirstName(){
		firstName() = null;
	}

	public setFirstName(String setFirstName){
    	firstName = firstName;
	}

	public String getLastName(){
		lastName() = null;
	}

	public setLastName(String setLastName){
		lastName = lastName;
	}

	public String showName(){
		System.out.println("氏：" + lastName + "　名：" + firstName + );
		//氏：ラストネーム＿名：ファーストネーム　をコンソールに表示する
	}

}

//渡辺　高志　1.3
//和田　充史　2

public static void main(String[] arg){
	Parson.setLastName("渡辺");
	Parson.setFirstName("高志");
	Parson.showName();

}



