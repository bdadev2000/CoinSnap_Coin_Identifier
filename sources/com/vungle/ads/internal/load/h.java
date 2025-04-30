package com.vungle.ads.internal.load;

import com.vungle.ads.C2125l0;
import com.vungle.ads.C2137s;

/* loaded from: classes3.dex */
public final class h implements m {
    final /* synthetic */ a $adLoaderCallback;
    final /* synthetic */ j this$0;

    public h(j jVar, a aVar) {
        this.this$0 = jVar;
        this.$adLoaderCallback = aVar;
    }

    @Override // com.vungle.ads.internal.load.m
    public void onDownloadResult(int i9) {
        if (i9 != 10 && i9 != 13) {
            this.$adLoaderCallback.onFailure(new C2125l0(null, 1, null));
            return;
        }
        if (i9 == 10) {
            C2137s.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.n.MRAID_DOWNLOAD_JS_RETRY_SUCCESS, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : this.this$0.getAdRequest().getPlacement().getReferenceId(), (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) == 0 ? null : null);
        }
        this.this$0.requestAd();
    }
}
