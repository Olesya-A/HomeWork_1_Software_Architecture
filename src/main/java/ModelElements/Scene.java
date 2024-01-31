package ModelElements;

import java.util.List;

public class Scene {
    public Integer Id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(Integer id,
                 List<PoligonalModel> models,
                 List<Flash> flashes,
                 List<Camera> cameras) throws Exception {
        if (models.isEmpty()) {
            throw new Exception("Необходимо наличие хотя бы одной модели!");
        }
        if (cameras.isEmpty()) {
            throw new Exception("Необходимо наличие хотя бы одной камеры!");
        }
        this.Id = id;
        this.Models = models;
        this.Flashes = flashes;
        this.Cameras = cameras;

//        this.Cameras.add(new Camera());
//        this.Models.add(new PoligonalModel(null));
    }

    public <T> T method1(T value) {
        return value;
    }

    public <T, E> T method1(T value1, E value2) {
        return value1;
    }
}