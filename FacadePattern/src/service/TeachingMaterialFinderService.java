package service;

import model.Slides;
import model.TeachingMaterial;

import java.util.ArrayList;
import java.util.Map;

public class TeachingMaterialFinderService {

    private final Map<String, TeachingMaterial> teachingMaterials;

    public TeachingMaterialFinderService(Map<String, TeachingMaterial> teachingMaterials) {
        this.teachingMaterials = teachingMaterials;
    }

    public TeachingMaterial findTeachingMaterial(final String name) {
        return teachingMaterials.get(name) == null ?
                new Slides("", new ArrayList<>()) : teachingMaterials.get(name);
    }

    public void deleteTeachingMaterial(final String name) {
        teachingMaterials.remove(name);
    }
}
