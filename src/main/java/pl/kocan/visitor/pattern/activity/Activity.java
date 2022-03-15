package pl.kocan.visitor.pattern.activity;

import pl.kocan.visitor.pattern.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
