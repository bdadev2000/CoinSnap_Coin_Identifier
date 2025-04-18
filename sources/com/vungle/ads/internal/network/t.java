package com.vungle.ads.internal.network;

import com.vungle.ads.g3;

/* loaded from: classes4.dex */
public final class t implements m0.a {
    final /* synthetic */ g3 $uaMetric;
    final /* synthetic */ y this$0;

    public t(g3 g3Var, y yVar) {
        this.$uaMetric = g3Var;
        this.this$0 = yVar;
    }

    @Override // m0.a
    public void accept(String str) {
        if (str == null) {
            com.vungle.ads.internal.util.v.Companion.e("VungleApiClient", "Cannot Get UserAgent. Setting Default Device UserAgent");
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(7, "Fail to get user agent.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        } else {
            this.$uaMetric.markEnd();
            com.vungle.ads.s.INSTANCE.logMetric$vungle_ads_release(this.$uaMetric.getMetricType(), (r15 & 2) != 0 ? 0L : this.$uaMetric.calculateIntervalDuration(), (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) == 0 ? null : null);
            this.this$0.uaString = str;
        }
    }
}
