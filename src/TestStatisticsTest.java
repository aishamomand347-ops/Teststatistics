import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestStatisticsTest {

    @Test
    void nyStatistikBorjarPaNoll() {
        TestStatistics statistik = new TestStatistics();

        assertEquals(0, statistik.hamtaAntalRader());
        assertEquals(0, statistik.hamtaAntalTecken());
        assertEquals(0, statistik.hamtaAntalOrd());
        assertEquals("", statistik.hamtaLangstaOrd());
    }

    @Test
    void raknaEnRadOchDessOrd() {
        TestStatistics statistik = new TestStatistics();

        assertTrue(statistik.laggTillRad("Hej Java"));

        assertEquals(1, statistik.hamtaAntalRader());
        assertEquals(8, statistik.hamtaAntalTecken());
        assertEquals(2, statistik.hamtaAntalOrd());
        assertEquals("Java", statistik.hamtaLangstaOrd());
    }

    @Test
    void raknaFleraRaderOchHanteraStop() {
        TestStatistics statistik = new TestStatistics();

        statistik.laggTillRad("Hej Java");
        statistik.laggTillRad("programmering");

        assertFalse(statistik.laggTillRad("stop"));

        assertEquals(2, statistik.hamtaAntalRader());
        assertEquals(21, statistik.hamtaAntalTecken());
        assertEquals(3, statistik.hamtaAntalOrd());
        assertEquals("programmering", statistik.hamtaLangstaOrd());
    }
}