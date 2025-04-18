package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class e0 extends g0 {
    public static g0 f(int i10) {
        return i10 < 0 ? g0.f11957b : i10 > 0 ? g0.f11958c : g0.a;
    }

    @Override // com.google.common.collect.g0
    public final g0 a(int i10, int i11) {
        return f(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // com.google.common.collect.g0
    public final g0 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.common.collect.g0
    public final g0 c(boolean z10, boolean z11) {
        return f(z10 == z11 ? 0 : z10 ? 1 : -1);
    }

    @Override // com.google.common.collect.g0
    public final g0 d(boolean z10, boolean z11) {
        return f(z11 == z10 ? 0 : z11 ? 1 : -1);
    }

    @Override // com.google.common.collect.g0
    public final int e() {
        return 0;
    }
}
