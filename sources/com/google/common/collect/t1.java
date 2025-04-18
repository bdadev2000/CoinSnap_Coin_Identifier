package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class t1 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Comparator f12034i;

    public t1(x1 x1Var) {
        this.f12034i = x1Var;
    }

    @Override // va.b
    public final Map j() {
        return new TreeMap(this.f12034i);
    }
}
