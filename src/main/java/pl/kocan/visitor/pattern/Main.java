package pl.kocan.visitor.pattern;

import pl.kocan.visitor.pattern.activity.Squash;
import pl.kocan.visitor.pattern.activity.Treadmill;
import pl.kocan.visitor.pattern.activity.Weights;

public class Main {

    // single responsibility principle

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        treadmill.calculateCaloriesBurned();
        squash.calculateCaloriesBurned();
        weights.calculateCaloriesBurned();

    }
}
