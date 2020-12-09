package main.java;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
    /**
     * id 标示
     * center 类中心
     * members 每个类成语
     */
    private int id;
    private Point center;
    private List<Point> members = new ArrayList<Point>();

    public Cluster(int id, Point center) {
        this.id = id;
        this.center = center;
    }

    public Cluster(int id, Point center, List<Point> members) {
        this.id = id;
        this.center = center;
        this.members = members;
    }

    public void addPoint(Point newPoint) {
        if (!members.contains(newPoint)) {
            members.add(newPoint);
        } else {
            System.out.println("样本数据点 {" + newPoint.toString() + "} 已经存在！");
        }
    }

    public int getId() {
        return id;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public List<Point> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        String toString = "Cluster \n" + "Cluster_id=" + this.id + ", center:{" + this.center.toString() + "}";
        for (Point point : members) {
            toString += "\n" + point.toString();
        }
        return toString + "\n";
    }
}

