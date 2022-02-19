import java.io.*;
import java.util.*;

class Result {
    public static int acharMinimoDeDias(List<Float> duracoes) {
        int dias = 0;
        Collections.sort(duracoes);
        System.out.println(duracoes);

        while (duracoes.size() != 0) {
            System.out.println(duracoes);
            if (duracoes.size() == 1) {
                dias++;
                duracoes.remove(0);
            } else if (duracoes.get(0) + duracoes.get((duracoes.size() - 1)) <= 3.0) {
                dias++;
                duracoes.remove(0);
                duracoes.remove((duracoes.size() - 1));
            } else {
                duracoes.remove((duracoes.size() - 1));
                dias++;
            }
        }
        return dias;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int duracoesCount = sc.nextInt();

        List<Float> duracoes = new ArrayList<>();

        for (int i = 0; i < duracoesCount; i++) {
            float duracoesItem = sc.nextFloat();
            duracoes.add(duracoesItem);
        }

        int result = Result.acharMinimoDeDias(duracoes);

        System.out.println(result);
        sc.close();
    }
}