package _03_Text_Funkifier;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
public String funkifyText() {
	String upperUnfunkyText = unfunkifiedText.toUpperCase();
	StringBuilder funkyText = new StringBuilder(unfunkifiedText.toLowerCase());
	for (int i = 1; i < unfunkifiedText.length(); i+=2) {
			funkyText.replace(i, i+1, upperUnfunkyText.substring(i, i+1));
			System.out.println(funkyText.toString());
		System.out.println(funkyText);
	}
	return funkyText.toString();
}
}
