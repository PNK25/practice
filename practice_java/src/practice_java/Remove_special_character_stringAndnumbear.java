package practice_java;

public class Remove_special_character_stringAndnumbear {

	public static void main(String[] args) {
		String s="374(233)24#$-224!56";
		String e="fhieifjl^ieeieiee#@efe$";
		String j=e.replaceAll("[^a-zA-Z0-9]","");
		String h=e.replaceAll("[^a-zA-Z]","");
		String g=s.replaceAll("[^a-zA-Z0-9]","");
		String f=s.replaceAll("[^0-9]","");
		System.out.println(g+"  removing special character:  "+f);
		System.out.println(j+"   removing special character:   "+h);
        System.out.println(g);
	}

}
