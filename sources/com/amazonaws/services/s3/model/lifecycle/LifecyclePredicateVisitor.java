package com.amazonaws.services.s3.model.lifecycle;

/* loaded from: classes7.dex */
public interface LifecyclePredicateVisitor {
    void visit(LifecycleAndOperator lifecycleAndOperator);

    void visit(LifecyclePrefixPredicate lifecyclePrefixPredicate);

    void visit(LifecycleTagPredicate lifecycleTagPredicate);
}
