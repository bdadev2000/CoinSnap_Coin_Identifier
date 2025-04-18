package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public abstract class gi implements m2 {
    public static final m2.a a = new ss(14);

    public static gi a(Bundle bundle) {
        int i10 = bundle.getInt(a(0), -1);
        if (i10 == 0) {
            return (gi) ja.f5463d.a(bundle);
        }
        if (i10 == 1) {
            return (gi) dh.f4302c.a(bundle);
        }
        if (i10 == 2) {
            return (gi) zk.f9467d.a(bundle);
        }
        if (i10 == 3) {
            return (gi) Cdo.f4347d.a(bundle);
        }
        throw new IllegalArgumentException(eb.j.i("Encountered unknown rating type: ", i10));
    }

    public static /* synthetic */ gi c(Bundle bundle) {
        return a(bundle);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
