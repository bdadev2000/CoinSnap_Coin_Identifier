package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1095ag extends AnonymousClass37 {
    public final AnonymousClass37 A00 = new C1096ah(this);
    public final FL A01;

    public C1095ag(FL fl) {
        this.A01 = fl;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass37
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(FL.class.getName());
        if ((view instanceof FL) && !A0B()) {
            FL fl = (FL) view;
            if (fl.getLayoutManager() != null) {
                fl.getLayoutManager().A1t(accessibilityEvent);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass37
    public final void A08(View view, C02593s c02593s) {
        super.A08(view, c02593s);
        c02593s.A0O(FL.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c02593s);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass37
    public final boolean A09(View view, int i2, Bundle bundle) {
        if (super.A09(view, i2, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1V(i2, bundle);
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
