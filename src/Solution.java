import java.io.*;
import java.util.*;

class Result {
    public static int acharMinimoDeDias(List<Float> duracoes) {
        int dias = 0;
        do{
            for(int i = 0; i < duracoes.size(); i++){
                if(duracoes.get(i) > 1.99 | duracoes.size() == 1){
                    dias++;
                    duracoes.remove(i);
                    break;
                }
                else{
                    for (int j = 1; j < duracoes.size(); j++){
                        if(duracoes.get(i) + duracoes.get(j) <= 3.0){
                            duracoes.remove(i);
                            duracoes.remove(j-1);
                            break;
                        }
                    }
                    dias++;
                }
                break;
            }
        }while (duracoes.size() != 0);

        return dias;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException{
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