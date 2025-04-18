package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Bl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0443Bl extends TV {
    public static String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C0443Bl(C02583r c02583r, int i2, List<QK> list, C0833Rk c0833Rk, Bundle bundle) {
        super(c02583r, i2, list, c0833Rk, bundle);
        c02583r.A1f(this);
        this.A03 = new C0924Ux(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A23 = this.A0C.A23();
        if (this.A05 == null || A23 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A23 < curPos - 1) {
            int i2 = A23 + 1;
            if (A00[2].charAt(8) != 'R') {
                throw new RuntimeException();
            }
            A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
            A0U(i2);
        }
    }

    private void A01(int i2) {
        int visibleItem = this.A0C.A24();
        int lastVisibleItem = this.A0C.A25();
        int firstVisibleItem = this.A0C.A23();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i2);
    }

    @Override // com.instagram.common.viewpoint.core.TV, com.instagram.common.viewpoint.core.AbstractC02854t
    public final void A0L(FL fl, int i2) {
    }

    @Override // com.instagram.common.viewpoint.core.TV, com.instagram.common.viewpoint.core.AbstractC02854t
    public final void A0M(FL fl, int i2, int i3) {
        if (this.A0C.A23() != -1) {
            UO curCard = (UO) this.A0C.A1m(this.A0C.A23());
            if (curCard != null && curCard.A18() && !curCard.A17()) {
                curCard.A15();
            }
            A01(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.TV
    public final void A0X(View view, boolean z2) {
        view.setAlpha(z2 ? 1.0f : 0.8f);
    }

    @Override // com.instagram.common.viewpoint.core.TV
    public final void A0Z(UO uo, boolean z2) {
        A0X(uo, z2);
        if (!z2 && uo.A17()) {
            uo.A14();
        }
    }

    @Override // com.instagram.common.viewpoint.core.TV
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C0833Rk A0b() {
        return this.A04;
    }

    public final void A0c(C0833Rk c0833Rk) {
        this.A04 = c0833Rk;
    }

    public final void A0d(List<QK> list) {
        this.A05 = list;
    }
}
