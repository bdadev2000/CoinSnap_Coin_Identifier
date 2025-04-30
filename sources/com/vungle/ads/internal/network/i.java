package com.vungle.ads.internal.network;

import i8.I;
import i8.M;

/* loaded from: classes3.dex */
public final class i {
    public /* synthetic */ i(G7.f fVar) {
        this();
    }

    public final <T> j error(M m, I i9) {
        G7.j.e(i9, "rawResponse");
        if (!i9.c()) {
            G7.f fVar = null;
            return new j(i9, fVar, m, fVar);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response".toString());
    }

    public final <T> j success(T t9, I i9) {
        G7.j.e(i9, "rawResponse");
        if (i9.c()) {
            return new j(i9, t9, null, 0 == true ? 1 : 0);
        }
        throw new IllegalArgumentException("rawResponse must be successful response".toString());
    }

    private i() {
    }
}
