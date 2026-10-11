
public class TestStatistics {
    private int antalRader;
    private int antalTecken;

    public void laggTillRad(String text) {
        antalRader++;
        antalTecken += text.length();
    }
    public int hamtaAntalRader() {
        return antalRader;
    }

    public int hamtaAntalTecken() {
        return antalTecken;
    }
}


