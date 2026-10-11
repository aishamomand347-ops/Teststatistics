
public class TestStatistics {
    private int antalRader;
    private int antalTecken;
    private int antalOrd;
    private String langstaOrd = "";

    public boolean laggTillRad(String text) {
        if (text.equalsIgnoreCase("stop")) {
            return false;
        }

        antalRader++;
        antalTecken += text.length();

        String rensadText = text.trim();

        if (!rensadText.isEmpty()) {
            String[] ord = rensadText.split("\\s+");
            antalOrd += ord.length;

            for (String ordText : ord) {
                if (ordText.length() > langstaOrd.length()) {
                    langstaOrd = ordText;
                }
            }
        }

        return true;
    } {

    }
    public int hamtaAntalRader() {
        return antalRader;
    }

    public int hamtaAntalTecken() {
        return antalTecken;
    }
    public int hamtaAntalOrd() {
        return antalOrd;
    }

    public String hamtaLangstaOrd() {
        return langstaOrd;
    }
}


