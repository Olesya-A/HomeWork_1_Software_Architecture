package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> Textures) {
        this.Poligons = new ArrayList<>();
        this.Textures = Textures;

        Poligons.add(new Poligon(null));
    }

}