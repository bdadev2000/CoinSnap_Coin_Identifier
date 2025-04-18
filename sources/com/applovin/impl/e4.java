package com.applovin.impl;

import com.applovin.impl.g4;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e4 {
    public static List a(com.applovin.impl.sdk.k kVar) {
        Boolean b3;
        if (!kVar.t().k()) {
            return null;
        }
        if (kVar.t().e() == g4.a.UNIFIED && (b3 = y3.c().b(com.applovin.impl.sdk.k.k())) != null && b3.booleanValue()) {
            return null;
        }
        boolean w02 = kVar.w0();
        Boolean bool = (Boolean) kVar.a(qj.f7234o, Boolean.FALSE);
        if (w02) {
            if (!bool.booleanValue()) {
                return null;
            }
            return b(kVar);
        }
        return b(kVar);
    }

    private static List b(com.applovin.impl.sdk.k kVar) {
        if (kVar.t().i() != null) {
            return m4.b(kVar);
        }
        return m4.a(kVar);
    }

    public static List c(com.applovin.impl.sdk.k kVar) {
        if (!kVar.t().k()) {
            return null;
        }
        return m4.c(kVar);
    }
}
