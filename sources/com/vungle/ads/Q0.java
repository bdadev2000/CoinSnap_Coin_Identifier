package com.vungle.ads;

/* loaded from: classes3.dex */
public abstract class Q0 {
    private final boolean isSingleton;
    final /* synthetic */ f1 this$0;

    public Q0(f1 f1Var, boolean z8) {
        this.this$0 = f1Var;
        this.isSingleton = z8;
    }

    public abstract Object create();

    public final boolean isSingleton() {
        return this.isSingleton;
    }

    public /* synthetic */ Q0(f1 f1Var, boolean z8, int i9, G7.f fVar) {
        this(f1Var, (i9 & 1) != 0 ? true : z8);
    }
}
