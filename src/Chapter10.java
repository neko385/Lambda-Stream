import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {
    public static void main(String[] args) throws Exception {
        List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));
        
        long c1 = list.stream().filter(c -> c.isDone() == false).count();
        System.out.println("未完了のタスクの個数は" + c1);
        
        System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
        
        list.stream()
        			.filter(f -> f.isDone() == false) // 真偽値がfalseのものを抽出
        			.sorted((f1, f2) -> f1.compareTo(f2)) // 日付順に並び替え
        			.forEach(System.out::println);
        
        
    }
}