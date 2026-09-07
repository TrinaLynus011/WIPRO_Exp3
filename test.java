package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // Create Veena object and call play()
        Veena v = new Veena();

        v.play();

        // Create Saxophone object and call play()
        Saxophone s = new Saxophone();

        s.play();

        // Store objects in Playable reference
        Playable p;

        p = v;
        p.play();

        p = s;
        p.play();
    }
}
