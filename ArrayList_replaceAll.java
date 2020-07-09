
import java.util.*;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }
        int count = 0;
        // リストの全要素が偶数の場合、リストの各要素を2で割る
        while(Main.checkEvenOrOdd(list)){
            count++;
            UnaryOperator<Integer> op = s -> s / 2;
            list.replaceAll(op);
        }
        System.out.println(count);
    }
    // 引数リストの要素が全て偶数ならtrue、奇数があればfalse
    private static boolean checkEvenOrOdd(List<Integer> plist){
        for(Integer i : plist){
            if(i % 2 != 0){
                return false;
            }
        }
        return true;
    }
}

