public class Week4 {
    public static int max2Int(int a, int b) {
        int max_value = a;
        if (a < b)
            max_value = b;
        return max_value;
    }

    public static int minArray (int[] array) {
        int min_value = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (min_value > array[i]) {
                min_value = array[i];
            }
        }
        return min_value;
    }

    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        double BMI = weight / (height * height);
        BMI = Math.round(BMI * 10.0) / 10.0;
        if (BMI >= 25) {
            return "Béo phì";
        } else if (BMI >= 23) {
            return "Thừa cân";
        } else if (BMI >= 18.5) {
            return "Bình thường";
        } else {
            return "Thiếu cân";
        }
    }
}