import java.io.*;
import java.util.*;


public class CandidateCode {
    public static void main(String args[]) throws Exception {
        //Write code here

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int C[] = new int[N];

        for (int i = 0; i < N; i++)
            C[i] = scan.nextInt();

        List<List<Integer>> masterList = new ArrayList<List<Integer>>();

        for (int i = 0; i < N; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 10; j >= 5; j--) {
                list.add(C[i] * j);
            }
            masterList.add(list);
        }

        while (masterList.size() > 1) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < masterList.get(0).size(); i++) {
                for (int j = 0; j < masterList.get(1).size(); j++) {
                    int result = masterList.get(0).get(i) + masterList.get(1).get(j);
                    list.add(result);
                }
            }
            masterList.remove(0);
            masterList.remove(0);
            masterList.add(0, list);
        }

        HashSet set=new HashSet(masterList.get(0));

        System.out.println(set.size());
    }
}
