package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1084Zb extends AnonymousClass37 {
    public static String[] A02 = {"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    public final AnonymousClass37 A00 = new C1085Zc(this);
    public final C0553Eb A01;

    public C1084Zb(C0553Eb c0553Eb) {
        this.A01 = c0553Eb;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass37
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0553Eb.class.getName());
        if ((view instanceof C0553Eb) && !A0B()) {
            C0553Eb c0553Eb = (C0553Eb) view;
            if (c0553Eb.getLayoutManager() != null) {
                c0553Eb.getLayoutManager().A1t(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass37
    public final void A08(View view, C03153s c03153s) {
        super.A08(view, c03153s);
        c03153s.A0O(C0553Eb.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c03153s);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass37
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            A02[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            AbstractC03364o layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "ZdbAAVtg";
            strArr2[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1V(i10, bundle);
        }
        return false;
    }

    public final AnonymousClass37 A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1p();
    }
}
