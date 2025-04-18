package com.vungle.ads.internal.load;

import bh.o3;
import bh.z;
import com.vungle.ads.b2;
import com.vungle.ads.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements com.vungle.ads.internal.network.b {
    final /* synthetic */ o3 $placement;
    final /* synthetic */ l this$0;

    public k(l lVar, o3 o3Var) {
        this.this$0 = lVar;
        this.$placement = o3Var;
    }

    /* renamed from: onFailure$lambda-1 */
    public static final void m34onFailure$lambda1(l this$0, Throwable th2, o3 placement) {
        n3 retrofitToVungleError;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placement, "$placement");
        retrofitToVungleError = this$0.retrofitToVungleError(th2);
        this$0.onAdLoadFailed(retrofitToVungleError);
        int code = retrofitToVungleError.getCode();
        String str4 = null;
        if (code != 10020) {
            if (code != 10047) {
                com.vungle.ads.s sVar = com.vungle.ads.s.INSTANCE;
                String referenceId = placement.getReferenceId();
                z advertisement$vungle_ads_release = this$0.getAdvertisement$vungle_ads_release();
                if (advertisement$vungle_ads_release != null) {
                    str3 = advertisement$vungle_ads_release.getCreativeId();
                } else {
                    str3 = null;
                }
                z advertisement$vungle_ads_release2 = this$0.getAdvertisement$vungle_ads_release();
                if (advertisement$vungle_ads_release2 != null) {
                    str4 = advertisement$vungle_ads_release2.eventId();
                }
                sVar.logError$vungle_ads_release(103, "Unable to decode ads response.", referenceId, str3, str4);
                return;
            }
            com.vungle.ads.s sVar2 = com.vungle.ads.s.INSTANCE;
            String referenceId2 = placement.getReferenceId();
            z advertisement$vungle_ads_release3 = this$0.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release3 != null) {
                str2 = advertisement$vungle_ads_release3.getCreativeId();
            } else {
                str2 = null;
            }
            z advertisement$vungle_ads_release4 = this$0.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release4 != null) {
                str4 = advertisement$vungle_ads_release4.eventId();
            }
            sVar2.logError$vungle_ads_release(217, "Timeout for ads call.", referenceId2, str2, str4);
            return;
        }
        com.vungle.ads.s sVar3 = com.vungle.ads.s.INSTANCE;
        String referenceId3 = placement.getReferenceId();
        z advertisement$vungle_ads_release5 = this$0.getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release5 != null) {
            str = advertisement$vungle_ads_release5.getCreativeId();
        } else {
            str = null;
        }
        z advertisement$vungle_ads_release6 = this$0.getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release6 != null) {
            str4 = advertisement$vungle_ads_release6.eventId();
        }
        sVar3.logError$vungle_ads_release(101, "Ads request error.", referenceId3, str, str4);
    }

    /* renamed from: onResponse$lambda-0 */
    public static final void m35onResponse$lambda0(l this$0, o3 placement, com.vungle.ads.internal.network.j jVar) {
        z zVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placement, "$placement");
        if (this$0.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
            this$0.onAdLoadFailed(new com.vungle.ads.k().logError$vungle_ads_release());
            return;
        }
        boolean z10 = false;
        if (jVar != null && !jVar.isSuccessful()) {
            z10 = true;
        }
        if (z10) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(104, "Failed to get a successful response from the API call", (r13 & 4) != 0 ? null : placement.getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            this$0.onAdLoadFailed(new b2());
            return;
        }
        bh.g gVar = null;
        if (jVar != null) {
            zVar = (z) jVar.body();
        } else {
            zVar = null;
        }
        if (zVar != null) {
            gVar = zVar.adUnit();
        }
        if (gVar == null) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(215, "Ad response is empty.", (r13 & 4) != 0 ? null : placement.getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            this$0.onAdLoadFailed(new b2());
        } else {
            this$0.handleAdMetaData(zVar);
        }
    }

    @Override // com.vungle.ads.internal.network.b
    public void onFailure(com.vungle.ads.internal.network.a aVar, Throwable th2) {
        ((com.vungle.ads.internal.executor.f) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new androidx.emoji2.text.n(21, this.this$0, th2, this.$placement));
    }

    @Override // com.vungle.ads.internal.network.b
    public void onResponse(com.vungle.ads.internal.network.a aVar, com.vungle.ads.internal.network.j jVar) {
        ((com.vungle.ads.internal.executor.f) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new androidx.emoji2.text.n(20, this.this$0, this.$placement, jVar));
    }
}
