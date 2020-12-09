package main.java;

import sun.security.krb5.internal.crypto.Des;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/amuxiaowu/Desktop/dataSet.txt");
        String s;
        ArrayList<Desc> descs = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((s = bufferedReader.readLine()) != null) {
                splitData(descs, s);
            }
        } catch (IOException e) {

        }

        KmeansRun kRun = new KmeansRun(3, descs);

        Set<Cluster> clusterSet = kRun.run();
        System.out.println("单次迭代运行次数：" + kRun.getIterTimes());
        for (Cluster cluster : clusterSet) {
            System.out.println(cluster);
        }

    }

    private static void splitData(ArrayList<Desc> descs, String s) {
        if (s.startsWith("每年飞行常客里程数")) {
            return;
        }
        String[] splits = s.split("\t");

        float[] floats = new float[]{Float.parseFloat(splits[0]),
                Float.parseFloat(splits[1]),
                Float.parseFloat(splits[2])};
        descs.add(new Desc(floats, splits[3]));
    }
}
