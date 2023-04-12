package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> cricketTeamScore = Collections.synchronizedMap(new HashMap<>());
        cricketTeamScore.put("Australia", 349);
        cricketTeamScore.put("India", 250);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable task = () -> {
            incrementTeamScore(cricketTeamScore, "India");
        };

        for(int i = 0; i < 100; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Score of Team India : " + cricketTeamScore.get("India"));
    }

    private static void incrementTeamScore(Map<String, Integer> cricketTeamScore, String team) {
        synchronized (cricketTeamScore) {
            Integer score = cricketTeamScore.get(team);
            cricketTeamScore.put(team, score + 1);
        }
    }
}
