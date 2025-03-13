import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "avocado", "grape");
//        List<String> result = new ArrayList<>();
//
//        for(String fruit : fruits) {
//            if(fruit.startsWith("a")) {
//                result.add(fruit.toUpperCase());
//            }
//        }
//
//        // 결과 출력
//        for(String item : result) {
//            System.out.println(item);
//        }

        List<String> result = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .map(String::toUpperCase)
                .toList();

        result.forEach(System.out::println);


        IntStream.rangeClosed(1,10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        int reuslt = IntStream.rangeClosed(1, 10).sum();

        System.out.println(reuslt);

        System.out.println(IntStream.range(1,10).boxed().toList()); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(IntStream.rangeClosed(1,10).boxed().toList()); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        List<Integer> numbers = Arrays.asList(1, 4 ,6 ,5, 3, 4, 5);

        List<Integer> limited = numbers.stream()
                .limit(3)
                .toList();
        System.out.println("limited = " + limited);
            // [1, 2, 3]

        List<Integer> skipped = numbers.stream()
                .skip(2)
                .toList();
        System.out.println("skipped = " + skipped);
            // [3, 4, 5]

        // List<String> fruits = Arrays.asList("apple", "banana", "avocado", "grape");
        fruits.stream() // 스트림 생성
                .filter(s-> s.equals("apple")) // 중간연산 1 ( "apple"과 같으면 요소 조건)
                .map(String::toUpperCase) // 중간 연산 2 ( 필터링된 요소 String타입에 , 모두다 대문자로 변환)
                .forEach(System.out::println); // 최종연산




    }
}
