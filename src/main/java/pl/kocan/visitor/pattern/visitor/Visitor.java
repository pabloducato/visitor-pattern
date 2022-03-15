package pl.kocan.visitor.pattern.visitor;

import pl.kocan.visitor.pattern.activity.Squash;
import pl.kocan.visitor.pattern.activity.Treadmill;
import pl.kocan.visitor.pattern.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);

    void visit(Squash squash);

    void visit(Weights weights);
}
