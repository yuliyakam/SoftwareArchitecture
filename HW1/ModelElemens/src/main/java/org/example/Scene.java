package org.example;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id,List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras)throws Exception {
        this.id = id;
        this.flashes = flashes;

        if(models.size() > 0) {
            this.models = models;
        }
        else {
            throw  new Exception("Список моделей пуст");
        }
        if(cameras.size() > 0) {
            this.cameras = cameras;
        }
        else {
            throw  new Exception("Список камер пуст");
        }
    }
    public <T> T method1(T param){
        return param;
    }
    public <T> T method2(T param1, T param2){
        return param1;
    }
}
