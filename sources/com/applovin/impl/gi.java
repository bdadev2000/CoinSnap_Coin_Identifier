package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;

/* loaded from: classes.dex */
public abstract class gi implements InterfaceC0725m2 {

    /* renamed from: a */
    public static final InterfaceC0725m2.a f7916a = new I(15);

    public static gi a(Bundle bundle) {
        int i9 = bundle.getInt(a(0), -1);
        if (i9 == 0) {
            return (gi) ja.f8421d.a(bundle);
        }
        if (i9 == 1) {
            return (gi) dh.f7297c.a(bundle);
        }
        if (i9 == 2) {
            return (gi) zk.f12661d.a(bundle);
        }
        if (i9 == 3) {
            return (gi) Cdo.f7337d.a(bundle);
        }
        throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Encountered unknown rating type: "));
    }

    public static /* synthetic */ gi c(Bundle bundle) {
        return a(bundle);
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }
}
