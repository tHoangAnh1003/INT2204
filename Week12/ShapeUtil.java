import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapeUtil {

    /**
     * In ra thong tin.
     */
    public String printInfo(List<GeometricObject> shapes) {
        if (shapes == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        Map<String, List<GeometricObject>> shapesMap = new HashMap<>();
        shapesMap.put("Circle", null);
        shapesMap.put("Triangle", null);

        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                if (shapesMap.get("Circle") == null) {
                    shapesMap.put("Circle", new ArrayList<>(List.of(shape)));
                } else {
                    shapesMap.get("Circle").add(shape);
                }
            } else if (shape instanceof Triangle) {
                if (shapesMap.get("Triangle") == null) {
                    shapesMap.put("Triangle", new ArrayList<>(List.of(shape)));
                } else {
                    shapesMap.get("Triangle").add(shape);
                }
            }
        }

        List<GeometricObject> circles = shapesMap.get("Circle");
        List<GeometricObject> triangles = shapesMap.get("Triangle");

        if (circles != null) {
            result.append("Circle:\n");
            for (GeometricObject circle : circles) {
                result.append(circle.getInfo()).append("\n");
            }
        } else {
            result.append("Triangle:\n");
            for (GeometricObject triangle : triangles) {
                result.append(triangle.getInfo()).append("\n");
            }
            return result.toString();
        }

        if (triangles != null) {
            result.append("Triangle:\n");
            for (GeometricObject triangle : triangles) {
                result.append(triangle.getInfo()).append("\n");
            }
        }

        return result.toString();
    }

}
