package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.3T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3T {
    public static final C3S A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C07890d() { // from class: com.facebook.ads.redexgen.X.0U
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C07890d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C1E();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C08231m();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C08382b();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C3I();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C09496l();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            A00 = new F5();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new C1674a1();
        } else {
            A00 = new C3S();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(View view) {
        return A00.A07(view);
    }

    public static C08733k A05(View view, C08733k c08733k) {
        return A00.A08(view, c08733k);
    }

    public static C08733k A06(View view, C08733k c08733k) {
        return A00.A09(view, c08733k);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i9) {
        A00.A0C(view, i9);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(View view, AnonymousClass37 anonymousClass37) {
        A00.A0E(view, anonymousClass37);
    }

    public static void A0C(View view, C3D c3d) {
        A00.A0F(view, c3d);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j7) {
        A00.A0H(view, runnable, j7);
    }

    public static boolean A0F(View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
