package _03_Text_Funkifier;

public class BackwardWordString implements TextFunkifier {
	private String unfunkifiedText;

	public BackwardWordString(String unfunkifiedText) {

		this.unfunkifiedText = unfunkifiedText;

	}

	@Override
	public String funkifyText() {
		String[] wordSplit = unfunkifiedText.split(" ");
		System.out.println(wordSplit[0]);
		StringBuilder funkyText = new StringBuilder();
		System.out.println(unfunkifiedText);
		for (int i = wordSplit.length - 1; i >= 0; i--) {
			funkyText.append(wordSplit[i]);
			if (i > 0) {
				funkyText.append(" ");
			}
			System.out.println(funkyText.toString());
		}
		return funkyText.toString();
	}
}
