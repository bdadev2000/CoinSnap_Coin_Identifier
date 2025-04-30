package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0505o;
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
    protected final com.applovin.impl.sdk.k b;

    /* renamed from: c */
    protected final AppLovinAdServiceImpl f7619c;

    /* renamed from: d */
    private AppLovinAd f7620d;

    /* renamed from: e */
    private String f7621e;

    /* renamed from: f */
    private SoftReference f7622f;

    /* renamed from: h */
    private volatile String f7624h;

    /* renamed from: a */
    public final Map f7618a = Q7.n0.q();

    /* renamed from: g */
    private final Object f7623g = new Object();

    /* renamed from: i */
    private volatile boolean f7625i = false;

    /* loaded from: classes.dex */
    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            fb.this.b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.b.L().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            fb.this.b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.b.L().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            fb.this.b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.b.L().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i9) {
            fb.this.b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.b.L().b("IncentivizedAdController", "Reward validation failed: " + i9);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final AppLovinAdLoadListener f7627a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f7627a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            fb.this.f7620d = appLovinAd;
            if (this.f7627a != null) {
                AppLovinSdkUtils.runOnUiThread(new F(2, this, appLovinAd));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i9) {
            if (this.f7627a != null) {
                AppLovinSdkUtils.runOnUiThread(new K0(i9, 0, this));
            }
        }

        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f7627a.adReceived(appLovinAd);
            } catch (Throwable th) {
                com.applovin.impl.sdk.t.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                fb.this.b.B().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        public /* synthetic */ void a(int i9) {
            try {
                this.f7627a.failedToReceiveAd(i9);
            } catch (Throwable th) {
                com.applovin.impl.sdk.t.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                fb.this.b.B().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    public fb(String str, AppLovinSdk appLovinSdk) {
        this.b = appLovinSdk.a();
        this.f7619c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f7621e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f7622f;
        if (softReference != null && (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
        }
    }

    public String c() {
        return this.f7621e;
    }

    public boolean d() {
        if (this.f7620d != null) {
            return true;
        }
        return false;
    }

    public String b() {
        String str;
        synchronized (this.f7623g) {
            str = this.f7624h;
        }
        return str;
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, lb lbVar) {
        this.b.F().c(aa.f6605o);
        bc.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        bc.a(lbVar, str);
    }

    /* loaded from: classes.dex */
    public class c implements lb, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a */
        private final AppLovinAd f7628a;
        private final AppLovinAdDisplayListener b;

        /* renamed from: c */
        private final AppLovinAdClickListener f7629c;

        /* renamed from: d */
        private final AppLovinAdVideoPlaybackListener f7630d;

        /* renamed from: f */
        private final AppLovinAdRewardListener f7631f;

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f7628a = appLovinAd;
            this.b = appLovinAdDisplayListener;
            this.f7629c = appLovinAdClickListener;
            this.f7630d = appLovinAdVideoPlaybackListener;
            this.f7631f = appLovinAdRewardListener;
        }

        private void a(com.applovin.impl.sdk.ad.b bVar) {
            String str;
            int i9;
            fb.this.b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.b.L().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String b = fb.this.b();
            if (!StringUtils.isValidString(b) || !fb.this.f7625i) {
                fb.this.b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t L8 = fb.this.b.L();
                    StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Invalid reward state - result: ", b, " and wasFullyEngaged: ");
                    n2.append(fb.this.f7625i);
                    L8.b("IncentivizedAdController", n2.toString());
                }
                fb.this.b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    fb.this.b.L().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.b();
                if (fb.this.f7625i) {
                    fb.this.b.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        fb.this.b.L().b("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i9 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    fb.this.b.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        fb.this.b.L().b("IncentivizedAdController", "User close the ad prematurely");
                    }
                    str = "user_closed_video";
                    i9 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(ch.a(str));
                fb.this.b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    fb.this.b.L().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                bc.a(this.f7631f, bVar, i9);
            }
            if (!bVar.D0().getAndSet(true)) {
                fb.this.b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    fb.this.b.L().a("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                fb.this.b.l0().a((xl) new fn(bVar, fb.this.b), sm.b.OTHER);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            bc.a(this.f7629c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            bc.a(this.b, appLovinAd);
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
                fb.this.b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    fb.this.b.L().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            fb.this.a(appLovinAd2);
            fb.this.b.L();
            if (com.applovin.impl.sdk.t.a()) {
                fb.this.b.L().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            bc.b(this.b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.lb
        public void onAdDisplayFailed(String str) {
            String str2;
            String str3;
            ?? r02 = this.f7628a;
            boolean z8 = r02 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVar = r02;
            if (z8) {
                bVar = ((com.applovin.impl.sdk.ad.c) r02).e();
            }
            boolean z9 = this.b instanceof lb;
            if (bVar instanceof com.applovin.impl.sdk.ad.b) {
                a(bVar);
            } else {
                if (bVar == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + bVar;
                }
                fb.this.b.L();
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t L8 = fb.this.b.L();
                    StringBuilder sb = new StringBuilder("Received `");
                    if (z9) {
                        str3 = "adDisplayFailed";
                    } else {
                        str3 = "adHidden";
                    }
                    L8.b("IncentivizedAdController", Q7.n0.l(sb, str3, "` callback for ", str2));
                }
            }
            fb.this.a(bVar);
            if (z9) {
                bc.a(this.b, str);
            } else {
                bc.b(this.b, this.f7628a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            fb.this.a("quota_exceeded");
            bc.b(this.f7631f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            fb.this.a("rejected");
            bc.a(this.f7631f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            fb.this.a("accepted");
            bc.c(this.f7631f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i9) {
            fb.this.a("network_timeout");
            bc.a(this.f7631f, appLovinAd, i9);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            bc.a(this.f7630d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z8) {
            bc.a(this.f7630d, appLovinAd, d2, z8);
            fb.this.f7625i = z8;
        }

        public /* synthetic */ c(fb fbVar, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.b.L().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f7622f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.t.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f7620d);
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
            appLovinAdImpl = (AppLovinAdImpl) this.f7620d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.t.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, abstractC0505o, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f7620d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, abstractC0505o, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.t.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a6 = zp.a((AppLovinAd) appLovinAdImpl, this.b);
        String a9 = a(a6, appLovinAdImpl);
        if (StringUtils.isValidString(a9)) {
            a(appLovinAdImpl, a9, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.b.v0(), context);
        for (String str : this.f7618a.keySet()) {
            create.setExtraInfo(str, this.f7618a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a6);
        a((com.applovin.impl.sdk.ad.b) a6, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a6 = zp.a((AppLovinAd) appLovinAdImpl, this.b);
        String a9 = a(a6, appLovinAdImpl);
        if (StringUtils.isValidString(a9)) {
            a(appLovinAdImpl, a9, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.b.v0(), context);
        for (String str : this.f7618a.keySet()) {
            create.setExtraInfo(str, this.f7618a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a6, viewGroup, abstractC0505o);
        a((com.applovin.impl.sdk.ad.b) a6, cVar);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.b.l0().a((xl) new ln(bVar, appLovinAdRewardListener, this.b), sm.b.OTHER);
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7619c.loadNextIncentivizedAd(this.f7621e, appLovinAdLoadListener);
    }

    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f7620d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f7620d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.e() == null || appLovinAd == cVar.e()) {
                this.f7620d = null;
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
        this.f7618a.put(str, obj);
    }

    public void a(String str) {
        synchronized (this.f7623g) {
            this.f7624h = str;
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
