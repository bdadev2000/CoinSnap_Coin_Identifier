package com.vungle.ads.internal.network;

import com.vungle.ads.C2137s;
import com.vungle.ads.h1;

/* loaded from: classes3.dex */
public final class t implements S.a {
    final /* synthetic */ h1 $uaMetric;
    final /* synthetic */ y this$0;

    public t(h1 h1Var, y yVar) {
        this.$uaMetric = h1Var;
        this.this$0 = yVar;
    }

    @Override // S.a
    public void accept(String str) {
        if (str == null) {
            com.vungle.ads.internal.util.v.Companion.e("VungleApiClient", "Cannot Get UserAgent. Setting Default Device UserAgent");
            C2137s.INSTANCE.logError$vungle_ads_release(7, "Fail to get user agent.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        } else {
            this.$uaMetric.markEnd();
            C2137s.INSTANCE.logMetric$vungle_ads_release(this.$uaMetric.getMetricType(), (r15 & 2) != 0 ? 0L : this.$uaMetric.calculateIntervalDuration(), (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) == 0 ? null : null);
            this.this$0.uaString = str;
        }
    }
}
