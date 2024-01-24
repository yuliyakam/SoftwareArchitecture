package org.example;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligons;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();
        poligons.add(new Poligon(new ArrayList<Point3D>()));
    }
}
