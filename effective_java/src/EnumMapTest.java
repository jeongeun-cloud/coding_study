import java.util.*;

enum DayOfWeek {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumMapTest {
    public static void main(String[] args) {
        Map<DayOfWeek, String> enumMap = new EnumMap<>(DayOfWeek.class);
        initMap(enumMap);
        Map<DayOfWeek, String> hashMap = new HashMap<>();
        initMap(hashMap);

        System.out.print("hashMap : ");
        calcGetPerformance(hashMap);

        System.out.print("enumMap : ");
        calcGetPerformance(enumMap);
    }

    private static void initMap(Map<DayOfWeek, String> map) {
        map.put(DayOfWeek.MON, "��");
        map.put(DayOfWeek.TUE, "ȭ");
        map.put(DayOfWeek.WED, "��");
        map.put(DayOfWeek.THU, "��");
        map.put(DayOfWeek.FRI, "��");
        map.put(DayOfWeek.SAT, "��");
        map.put(DayOfWeek.SUN, "��");
    }

    private static void calcGetPerformance(Map<DayOfWeek, String> map) {
        long[] testCase = new long[10];

        for (int i = 0; i < testCase.length; i++) {
            long startTime = System.nanoTime();
            for (int j = 0; j < 10_000_000; j++) {
                map.get(DayOfWeek.TUE);
            }
            long endTime = System.nanoTime();
            testCase[i] = endTime - startTime;
        }

        long sum = 0;
        for (final long l : testCase) {
            sum += l;

            if (sum < 0) {
                System.out.println("------�����÷ο� ��---- : " + sum);
            }
        }

        System.out.println(sum / testCase.length);
    }

}