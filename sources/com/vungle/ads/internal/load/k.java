package com.vungle.ads.internal.load;

import U4.RunnableC0311g;
import c7.C0628g;
import c7.C0665z;
import c7.p1;
import com.vungle.ads.C2122k;
import com.vungle.ads.C2137s;
import com.vungle.ads.D0;
import com.vungle.ads.internal.network.InterfaceC2099a;
import com.vungle.ads.internal.network.InterfaceC2100b;
import com.vungle.ads.o1;

/* loaded from: classes3.dex */
public final class k implements InterfaceC2100b {
    final /* synthetic */ p1 $placement;
    final /* synthetic */ l this$0;

    public k(l lVar, p1 p1Var) {
        this.this$0 = lVar;
        this.$placement = p1Var;
    }

    /* renamed from: onFailure$lambda-1 */
    public static final void m54onFailure$lambda1(l lVar, Throwable th, p1 p1Var) {
        o1 retrofitToVungleError;
        String str;
        String str2;
        String str3;
        G7.j.e(lVar, "this$0");
        G7.j.e(p1Var, "$placement");
        retrofitToVungleError = lVar.retrofitToVungleError(th);
        lVar.onAdLoadFailed(retrofitToVungleError);
        int code = retrofitToVungleError.getCode();
        String str4 = null;
        if (code != 10020) {
            if (code != 10047) {
                C2137s c2137s = C2137s.INSTANCE;
                String referenceId = p1Var.getReferenceId();
                C0665z advertisement$vungle_ads_release = lVar.getAdvertisement$vungle_ads_release();
                if (advertisement$vungle_ads_release != null) {
                    str3 = advertisement$vungle_ads_release.getCreativeId();
                } else {
                    str3 = null;
                }
                C0665z advertisement$vungle_ads_release2 = lVar.getAdvertisement$vungle_ads_release();
                if (advertisement$vungle_ads_release2 != null) {
                    str4 = advertisement$vungle_ads_release2.eventId();
                }
                c2137s.logError$vungle_ads_release(103, "Unable to decode ads response.", referenceId, str3, str4);
                return;
            }
            C2137s c2137s2 = C2137s.INSTANCE;
            String referenceId2 = p1Var.getReferenceId();
            C0665z advertisement$vungle_ads_release3 = lVar.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release3 != null) {
                str2 = advertisement$vungle_ads_release3.getCreativeId();
            } else {
                str2 = null;
            }
            C0665z advertisement$vungle_ads_release4 = lVar.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release4 != null) {
                str4 = advertisement$vungle_ads_release4.eventId();
            }
            c2137s2.logError$vungle_ads_release(217, "Timeout for ads call.", referenceId2, str2, str4);
            return;
        }
        C2137s c2137s3 = C2137s.INSTANCE;
        String referenceId3 = p1Var.getReferenceId();
        C0665z advertisement$vungle_ads_release5 = lVar.getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release5 != null) {
            str = advertisement$vungle_ads_release5.getCreativeId();
        } else {
            str = null;
        }
        C0665z advertisement$vungle_ads_release6 = lVar.getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release6 != null) {
            str4 = advertisement$vungle_ads_release6.eventId();
        }
        c2137s3.logError$vungle_ads_release(101, "Ads request error.", referenceId3, str, str4);
    }

    /* renamed from: onResponse$lambda-0 */
    public static final void m55onResponse$lambda0(l lVar, p1 p1Var, com.vungle.ads.internal.network.j jVar) {
        C0665z c0665z;
        G7.j.e(lVar, "this$0");
        G7.j.e(p1Var, "$placement");
        if (lVar.getVungleApiClient().getRetryAfterHeaderValue(p1Var.getReferenceId()) > 0) {
            lVar.onAdLoadFailed(new C2122k().logError$vungle_ads_release());
            return;
        }
        if (jVar != null && !jVar.isSuccessful()) {
            C2137s.INSTANCE.logError$vungle_ads_release(104, "Failed to get a successful response from the API call", (r13 & 4) != 0 ? null : p1Var.getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            lVar.onAdLoadFailed(new D0());
            return;
        }
        C0628g c0628g = null;
        if (jVar != null) {
            c0665z = (C0665z) jVar.body();
        } else {
            c0665z = null;
        }
        if (c0665z != null) {
            c0628g = c0665z.adUnit();
        }
        if (c0628g == null) {
            C2137s.INSTANCE.logError$vungle_ads_release(215, "Ad response is empty.", (r13 & 4) != 0 ? null : p1Var.getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            lVar.onAdLoadFailed(new D0());
        } else {
            lVar.handleAdMetaData(c0665z);
        }
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2100b
    public void onFailure(InterfaceC2099a interfaceC2099a, Throwable th) {
        ((com.vungle.ads.internal.executor.f) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new RunnableC0311g(this.this$0, th, this.$placement, 9));
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2100b
    public void onResponse(InterfaceC2099a interfaceC2099a, com.vungle.ads.internal.network.j jVar) {
        ((com.vungle.ads.internal.executor.f) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new RunnableC0311g(this.this$0, this.$placement, jVar, 10));
    }
}
