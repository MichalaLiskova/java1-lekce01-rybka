package cz.czechitas.java.lekce01;

import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import cz.czechitas.java.playground.CzechitasGameApplication;
import cz.czechitas.java.playground.Kamen;
import cz.czechitas.java.playground.Rybka;
import javafx.scene.paint.Color;

public class RybkaApplication extends CzechitasGameApplication {
  private Rybka rybka;
  private Kamen kamen;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  protected void initSettings(GameSettings settings) {
    settings.setNative(true);
    settings.setWidth(800);
    settings.setHeight(600);
    settings.setTitle("Rybka Renata");
    settings.setVersion("1.0");
  }

  @Override
  protected void initGame() {
    FXGL.getGameScene().setBackgroundColor(Color.AQUA);
    super.initGame();
  }

  @Override
  protected void onStart() {
    kamen = new Kamen(200, 200);
    rybka = new Rybka(100, 100);

    for (int i = 100; i <120; i++) {
      rybka.plavatVpravo();
          }
    for (int i = 120; i <140 ; i++) {
      rybka.plavatDolu();
    }
    for (int i = 140; i <160 ; i++) {
      rybka.plavatVlevo();
    }
    for (int i = 160; i <180; i++) {
      rybka.plavatNahoru();
    }

     //kód je možné taky udělat fori (int i=0; i<20) a totez na ostatni pokyny,vpravo,dolu,vlevo,nahoru)
    // TODO tady napište svůj kód
  }
}
