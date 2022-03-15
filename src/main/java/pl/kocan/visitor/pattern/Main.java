package pl.kocan.visitor.pattern;

import pl.kocan.visitor.pattern.activity.Activity;
import pl.kocan.visitor.pattern.activity.Squash;
import pl.kocan.visitor.pattern.activity.Treadmill;
import pl.kocan.visitor.pattern.activity.Weights;
import pl.kocan.visitor.pattern.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    // single responsibility principle

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(400);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorImpl visitor = new VisitorImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("----------------------------");

        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));
    }
}
