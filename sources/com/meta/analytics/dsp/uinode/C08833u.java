package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08833u {
    public static final InterfaceC08823t A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C1123Ef();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new C1124Eg();
        } else {
            A01 = new C1666Zs();
        }
    }

    public C08833u() {
        this.A00 = A01.AAW(this);
    }

    public C08833u(Object obj) {
        this.A00 = obj;
    }

    public final C08813s A00(int i9) {
        return null;
    }

    public final C08813s A01(int i9) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C08813s> A03(String str, int i9) {
        return null;
    }

    public final boolean A04(int i9, int i10, Bundle bundle) {
        return false;
    }
}
