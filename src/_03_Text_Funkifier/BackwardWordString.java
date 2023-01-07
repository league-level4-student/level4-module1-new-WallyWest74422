package _03_Text_Funkifier;

public class BackwardWordString implements TextFunkifier{
	 private String unfunkifiedText;

	    public BackwardWordString(String unfunkifiedText) {

	        this.unfunkifiedText = unfunkifiedText;

	    }

	    @Override
	    public String funkifyText() {
	    String[] wordSplit = unfunkifiedText.split(" "); 
StringBuilder funkyText = new StringBuilder();
for (int i = wordSplit.length; i >0; i--) {
	funkyText.append(wordSplit[i]);
	if(i>1) {
		funkyText.append(" ");
	}
}


	        return funkyText.toString();

	    }
}
