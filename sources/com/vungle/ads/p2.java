package com.vungle.ads;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class p2 {
    private final boolean isSingleton;
    final /* synthetic */ e3 this$0;

    public p2(e3 e3Var, boolean z10) {
        this.this$0 = e3Var;
        this.isSingleton = z10;
    }

    public abstract Object create();

    public final boolean isSingleton() {
        return this.isSingleton;
    }

    public /* synthetic */ p2(e3 e3Var, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e3Var, (i10 & 1) != 0 ? true : z10);
    }
}
