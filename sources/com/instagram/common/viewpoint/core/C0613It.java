package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.It, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0613It {
    public final View A00;
    public final C1044Zr A01;
    public final J7 A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C0613It(C1044Zr c1044Zr, View view, String str, boolean z2, boolean z3) {
        this.A03 = str;
        this.A01 = c1044Zr;
        this.A02 = c1044Zr.A09();
        this.A00 = view;
        this.A05 = z3;
        this.A06 = z2;
    }

    public final View A00() {
        return this.A00;
    }

    public final C1044Zr A01() {
        return this.A01;
    }

    public final J7 A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
