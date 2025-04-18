package com.vungle.ads.internal.load;

import com.vungle.ads.j1;

/* loaded from: classes4.dex */
public final class h implements m {
    final /* synthetic */ a $adLoaderCallback;
    final /* synthetic */ j this$0;

    public h(j jVar, a aVar) {
        this.this$0 = jVar;
        this.$adLoaderCallback = aVar;
    }

    @Override // com.vungle.ads.internal.load.m
    public void onDownloadResult(int i10) {
        if (i10 != 10 && i10 != 13) {
            this.$adLoaderCallback.onFailure(new j1(null, 1, 0 == true ? 1 : 0));
        } else {
            if (i10 == 10) {
                com.vungle.ads.s.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.n.MRAID_DOWNLOAD_JS_RETRY_SUCCESS, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : this.this$0.getAdRequest().getPlacement().getReferenceId(), (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) == 0 ? null : null);
            }
            this.this$0.requestAd();
        }
    }
}
