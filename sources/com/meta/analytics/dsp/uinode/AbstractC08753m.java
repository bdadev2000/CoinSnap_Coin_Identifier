package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08753m {
    public static final C08743l A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C1131En();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C1670Zw();
        } else {
            A00 = new C08743l();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i9) {
        A00.A01(accessibilityEvent, i9);
    }
}
