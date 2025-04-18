package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02613u {
    public static final InterfaceC02603t A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new FV();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new FW();
        } else {
            A01 = new C1111ax();
        }
    }

    public C02613u() {
        this.A00 = A01.AAw(this);
    }

    public C02613u(Object obj) {
        this.A00 = obj;
    }

    public final C02593s A00(int i2) {
        return null;
    }

    public final C02593s A01(int i2) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    public final List<C02593s> A03(String str, int i2) {
        return null;
    }

    public final boolean A04(int i2, int i3, Bundle bundle) {
        return false;
    }
}
