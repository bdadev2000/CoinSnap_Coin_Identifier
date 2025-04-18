package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03495c {
    public static C0S A00(Context context, InterfaceC03997h interfaceC03997h) {
        return A01(context, interfaceC03997h, null);
    }

    public static C0S A01(Context context, InterfaceC03997h interfaceC03997h, String str) {
        C1069Ym sdkContext = A09(context);
        C0W A77 = interfaceC03997h.A77(sdkContext);
        if (A77 != null) {
            return str != null ? A77.AAJ(str) : A77.AAI();
        }
        return new C1205bb();
    }

    public static C1070Yn A02(Activity activity) {
        return new C1070Yn(activity, (InterfaceC03997h) A0A(), A00(activity, A0A()));
    }

    public static C1070Yn A03(Context context) {
        return new C1070Yn(context, A0A(), new C1205bb());
    }

    public static C1070Yn A04(Context context) {
        if (C0659Ih.A0r(context)) {
            return new C1070Yn(context, A0A(), A00(context, A0A()));
        }
        return A03(context);
    }

    public static C1070Yn A05(Context context, String str) {
        return new C1070Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1070Yn A06(Context context, String str) {
        return new C1070Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1070Yn A07(Context context, String str) {
        return new C1070Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static EQ A08(Context context) {
        return new EQ(context, A0A(), A0A().A77(A09(context)));
    }

    public static C1069Ym A09(Context context) {
        return new C1069Ym(context, A0A());
    }

    public static synchronized YL A0A() {
        YL A02;
        synchronized (C03495c.class) {
            A02 = YL.A02();
        }
        return A02;
    }
}
