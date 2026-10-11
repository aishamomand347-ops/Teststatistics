import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
   class TestStatisticsTest {
       @Test
       void nyStatistikBorjarPaNoll() {
           TestStatistics statistik = new TestStatistics();

           assertEquals(0, statistik.hamtaAntalRader());
           assertEquals(0, statistik.hamtaAntalTecken());

       }
       @Test
       void raknaEnRad() {
           TestStatistics statistik = new TestStatistics();

           statistik.laggTillRad("Hej");

           assertEquals(1, statistik.hamtaAntalRader());
           assertEquals(3, statistik.hamtaAntalTecken());
       }
       @Test
       void raknaFleraRader() {
           TestStatistics statistik = new TestStatistics();

           statistik.laggTillRad("Hej");
           statistik.laggTillRad("Java");

           assertEquals(2, statistik.hamtaAntalRader());
           assertEquals(7, statistik.hamtaAntalTecken());
       }
   }