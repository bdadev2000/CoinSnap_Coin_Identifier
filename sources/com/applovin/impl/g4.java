package com.applovin.impl;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class g4 {
    public static List a(com.applovin.impl.sdk.j jVar) {
        if (!jVar.u().k()) {
            return null;
        }
        boolean t02 = jVar.t0();
        Boolean bool = (Boolean) jVar.a(uj.f27340o, Boolean.FALSE);
        if (!t02 || bool.booleanValue()) {
            return b(jVar);
        }
        return null;
    }

    private static List b(com.applovin.impl.sdk.j jVar) {
        return jVar.u().i() != null ? o4.b(jVar) : o4.a(jVar);
    }

    public static List c(com.applovin.impl.sdk.j jVar) {
        if (jVar.u().k()) {
            return o4.c(jVar);
        }
        return null;
    }
}
