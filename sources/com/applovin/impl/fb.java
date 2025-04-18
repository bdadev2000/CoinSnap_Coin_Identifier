package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

/* loaded from: classes.dex */
public class fb {

    /* renamed from: b */
    protected final com.applovin.impl.sdk.k f4670b;

    /* renamed from: c */
    protected final AppLovinAdServiceImpl f4671c;

    /* renamed from: d */
    private AppLovinAd f4672d;

    /* renamed from: e */
    private String f4673e;

    /* renamed from: f */
    private SoftReference f4674f;

    /* renamed from: h */
    private volatile String f4676h;
    public final Map a = a4.j.r();

    /* renamed from: g */
    private final Object f4675g = new Object();

    /* renamed from: i */
    private volatile boolean f4677i = false;

    /* loaded from: classes.dex */
    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            fb.this.f4670b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.f4670b.L().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            fb.this.f4670b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.f4670b.L().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            fb.this.f4670b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.f4670b.L().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            fb.this.f4670b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.f4670b.L().b("IncentivizedAdController", "Reward validation failed: " + i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements AppLovinAdLoadListener {
        private final AppLovinAdLoadListener a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            fb.this.f4672d = appLovinAd;
            if (this.a != null) {
                AppLovinSdkUtils.runOnUiThread(new rs(2, this, appLovinAd));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            if (this.a != null) {
                AppLovinSdkUtils.runOnUiThread(new st(i10, 0, this));
            }
        }

        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.a.adReceived(appLovinAd);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.t.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th2);
                fb.this.f4670b.B().a("IncentivizedAdController", "adLoaded", th2);
            }
        }

        public /* synthetic */ void a(int i10) {
            try {
                this.a.failedToReceiveAd(i10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.t.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th2);
                fb.this.f4670b.B().a("IncentivizedAdController", "adLoadFailed", th2);
            }
        }
    }

    public fb(String str, AppLovinSdk appLovinSdk) {
        this.f4670b = appLovinSdk.a();
        this.f4671c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f4673e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f4674f;
        if (softReference != null && (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
        }
    }

    public String c() {
        return this.f4673e;
    }

    public boolean d() {
        return this.f4672d != null;
    }

    public String b() {
        String str;
        synchronized (this.f4675g) {
            str = this.f4676h;
        }
        return str;
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, lb lbVar) {
        this.f4670b.F().c(aa.f3625o);
        bc.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        bc.a(lbVar, str);
    }

    /* loaded from: classes.dex */
    public class c implements lb, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {
        private final AppLovinAd a;

        /* renamed from: b */
        private final AppLovinAdDisplayListener f4679b;

        /* renamed from: c */
        private final AppLovinAdClickListener f4680c;

        /* renamed from: d */
        private final AppLovinAdVideoPlaybackListener f4681d;

        /* renamed from: f */
        private final AppLovinAdRewardListener f4682f;

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.a = appLovinAd;
            this.f4679b = appLovinAdDisplayListener;
            this.f4680c = appLovinAdClickListener;
            this.f4681d = appLovinAdVideoPlaybackListener;
            this.f4682f = appLovinAdRewardListener;
        }

        private void a(com.applovin.impl.sdk.ad.b bVar) {
            String str;
            int i10;
            fb.this.f4670b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.f4670b.L().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String b3 = fb.this.b();
            if (!StringUtils.isValidString(b3) || !fb.this.f4677i) {
                fb.this.f4670b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t L = fb.this.f4670b.L();
                    StringBuilder o10 = a4.j.o("Invalid reward state - result: ", b3, " and wasFullyEngaged: ");
                    o10.append(fb.this.f4677i);
                    L.b("IncentivizedAdController", o10.toString());
                }
                fb.this.f4670b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    fb.this.f4670b.L().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.b();
                if (fb.this.f4677i) {
                    fb.this.f4670b.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        fb.this.f4670b.L().b("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    fb.this.f4670b.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        fb.this.f4670b.L().b("IncentivizedAdController", "User close the ad prematurely");
                    }
                    str = "user_closed_video";
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(ch.a(str));
                fb.this.f4670b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    fb.this.f4670b.L().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                bc.a(this.f4682f, bVar, i10);
            }
            if (!bVar.D0().getAndSet(true)) {
                fb.this.f4670b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    fb.this.f4670b.L().a("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                fb.this.f4670b.l0().a((xl) new fn(bVar, fb.this.f4670b), sm.b.OTHER);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            bc.a(this.f4680c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            bc.a(this.f4679b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            AppLovinAd appLovinAd2;
            String str;
            if (appLovinAd instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAd2 = ((com.applovin.impl.sdk.ad.c) appLovinAd).e();
            } else {
                appLovinAd2 = appLovinAd;
            }
            if (appLovinAd2 instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) appLovinAd2);
            } else {
                if (appLovinAd2 == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAd2;
                }
                fb.this.f4670b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    fb.this.f4670b.L().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            fb.this.a(appLovinAd2);
            fb.this.f4670b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.f4670b.L().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            bc.b(this.f4679b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.lb
        public void onAdDisplayFailed(String str) {
            String str2;
            String str3;
            ?? r02 = this.a;
            boolean z10 = r02 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVar = r02;
            if (z10) {
                bVar = ((com.applovin.impl.sdk.ad.c) r02).e();
            }
            boolean z11 = this.f4679b instanceof lb;
            if (bVar instanceof com.applovin.impl.sdk.ad.b) {
                a(bVar);
            } else {
                if (bVar == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + bVar;
                }
                fb.this.f4670b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t L = fb.this.f4670b.L();
                    StringBuilder sb2 = new StringBuilder("Received `");
                    if (z11) {
                        str3 = "adDisplayFailed";
                    } else {
                        str3 = "adHidden";
                    }
                    L.b("IncentivizedAdController", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(sb2, str3, "` callback for ", str2));
                }
            }
            fb.this.a(bVar);
            if (z11) {
                bc.a(this.f4679b, str);
            } else {
                bc.b(this.f4679b, this.a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            fb.this.a("quota_exceeded");
            bc.b(this.f4682f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            fb.this.a("rejected");
            bc.a(this.f4682f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            fb.this.a("accepted");
            bc.c(this.f4682f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            fb.this.a("network_timeout");
            bc.a(this.f4682f, appLovinAd, i10);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            bc.a(this.f4681d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            bc.a(this.f4681d, appLovinAd, d10, z10);
            fb.this.f4677i = z10;
        }

        public /* synthetic */ c(fb fbVar, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f4670b.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f4670b.L().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f4674f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.t.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f4672d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f4672d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.t.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.p pVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, pVar, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.p pVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f4672d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, pVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.t.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a10 = zp.a((AppLovinAd) appLovinAdImpl, this.f4670b);
        String a11 = a(a10, appLovinAdImpl);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAdImpl, a11, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f4670b.v0(), context);
        for (String str : this.a.keySet()) {
            create.setExtraInfo(str, this.a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a10);
        a((com.applovin.impl.sdk.ad.b) a10, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, androidx.lifecycle.p pVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a10 = zp.a((AppLovinAd) appLovinAdImpl, this.f4670b);
        String a11 = a(a10, appLovinAdImpl);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAdImpl, a11, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f4670b.v0(), context);
        for (String str : this.a.keySet()) {
            create.setExtraInfo(str, this.a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a10, viewGroup, pVar);
        a((com.applovin.impl.sdk.ad.b) a10, cVar);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f4670b.l0().a((xl) new ln(bVar, appLovinAdRewardListener, this.f4670b), sm.b.OTHER);
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f4671c.loadNextIncentivizedAd(this.f4673e, appLovinAdLoadListener);
    }

    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f4672d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f4672d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.e() == null || appLovinAd == cVar.e()) {
                this.f4672d = null;
            }
        }
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.t.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED || appLovinAd2.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.t.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    public void a(String str, Object obj) {
        this.a.put(str, obj);
    }

    public void a(String str) {
        synchronized (this.f4675g) {
            this.f4676h = str;
        }
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
