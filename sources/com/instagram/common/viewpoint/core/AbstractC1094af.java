package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1094af extends AbstractC02764k {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0R(AnonymousClass56 anonymousClass56);

    public abstract boolean A0S(AnonymousClass56 anonymousClass56);

    public abstract boolean A0T(AnonymousClass56 anonymousClass56, int i2, int i3, int i4, int i5);

    public abstract boolean A0U(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, int i2, int i3, int i4, int i5);

    @Override // com.instagram.common.viewpoint.core.AbstractC02764k
    public final boolean A0D(AnonymousClass56 anonymousClass56) {
        return !this.A00 || anonymousClass56.A0Z();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02764k
    public final boolean A0E(AnonymousClass56 anonymousClass56, C02754j c02754j, C02754j c02754j2) {
        if (c02754j != null && (c02754j.A01 != c02754j2.A01 || c02754j.A03 != c02754j2.A03)) {
            return A0T(anonymousClass56, c02754j.A01, c02754j.A03, c02754j2.A01, c02754j2.A03);
        }
        return A0R(anonymousClass56);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02764k
    public final boolean A0F(AnonymousClass56 anonymousClass56, C02754j c02754j, C02754j c02754j2) {
        int i2 = c02754j.A01;
        int oldLeft = c02754j.A03;
        View view = anonymousClass56.A0H;
        int oldTop = c02754j2 == null ? view.getLeft() : c02754j2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c02754j2 == null ? view.getTop() : c02754j2.A03;
        if (!anonymousClass56.A0a() && (i2 != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0T(anonymousClass56, i2, oldLeft, oldTop, top);
        }
        return A0S(anonymousClass56);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02764k
    public final boolean A0G(AnonymousClass56 anonymousClass56, C02754j c02754j, C02754j c02754j2) {
        if (c02754j.A01 != c02754j2.A01 || c02754j.A03 != c02754j2.A03) {
            return A0T(anonymousClass56, c02754j.A01, c02754j.A03, c02754j2.A01, c02754j2.A03);
        }
        A0O(anonymousClass56);
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02764k
    public final boolean A0H(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, C02754j c02754j, C02754j c02754j2) {
        int i2;
        int i3;
        int i4 = c02754j.A01;
        int i5 = c02754j.A03;
        if (anonymousClass562.A0f()) {
            i2 = c02754j.A01;
            i3 = c02754j.A03;
        } else {
            i2 = c02754j2.A01;
            i3 = c02754j2.A03;
        }
        return A0U(anonymousClass56, anonymousClass562, i4, i5, i2, i3);
    }

    public final void A0N(AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0O(AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0P(AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0Q(AnonymousClass56 anonymousClass56, boolean z2) {
        A0C(anonymousClass56);
    }
}
