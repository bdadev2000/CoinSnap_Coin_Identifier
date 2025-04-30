package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1649Za extends AbstractC08984k {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AnonymousClass56 anonymousClass56);

    public abstract boolean A0S(AnonymousClass56 anonymousClass56);

    public abstract boolean A0T(AnonymousClass56 anonymousClass56, int i9, int i10, int i11, int i12);

    public abstract boolean A0U(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, int i9, int i10, int i11, int i12);

    @Override // com.meta.analytics.dsp.uinode.AbstractC08984k
    public final boolean A0D(AnonymousClass56 anonymousClass56) {
        return !this.A00 || anonymousClass56.A0Z();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08984k
    public final boolean A0E(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2) {
        if (c08974j != null && (c08974j.A01 != c08974j2.A01 || c08974j.A03 != c08974j2.A03)) {
            return A0T(anonymousClass56, c08974j.A01, c08974j.A03, c08974j2.A01, c08974j2.A03);
        }
        return A0R(anonymousClass56);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08984k
    public final boolean A0F(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2) {
        int i9 = c08974j.A01;
        int i10 = c08974j.A03;
        View view = anonymousClass56.A0H;
        int oldLeft = c08974j2 == null ? view.getLeft() : c08974j2.A01;
        int oldTop = c08974j2 == null ? view.getTop() : c08974j2.A03;
        if (!anonymousClass56.A0a() && (i9 != oldLeft || i10 != oldTop)) {
            view.layout(oldLeft, oldTop, view.getWidth() + oldLeft, view.getHeight() + oldTop);
            return A0T(anonymousClass56, i9, i10, oldLeft, oldTop);
        }
        return A0S(anonymousClass56);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08984k
    public final boolean A0G(AnonymousClass56 anonymousClass56, C08974j c08974j, C08974j c08974j2) {
        if (c08974j.A01 != c08974j2.A01 || c08974j.A03 != c08974j2.A03) {
            return A0T(anonymousClass56, c08974j.A01, c08974j.A03, c08974j2.A01, c08974j2.A03);
        }
        A0O(anonymousClass56);
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08984k
    public final boolean A0H(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, C08974j c08974j, C08974j c08974j2) {
        int fromTop;
        int toLeft;
        int i9 = c08974j.A01;
        int fromLeft = c08974j.A03;
        if (anonymousClass562.A0f()) {
            fromTop = c08974j.A01;
            toLeft = c08974j.A03;
        } else {
            fromTop = c08974j2.A01;
            toLeft = c08974j2.A03;
        }
        int toTop = A01[1].length();
        if (toTop != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(anonymousClass56, anonymousClass562, i9, fromLeft, fromTop, toLeft);
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

    public final void A0Q(AnonymousClass56 anonymousClass56, boolean z8) {
        A0C(anonymousClass56);
    }
}
