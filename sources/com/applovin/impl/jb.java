package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
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
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class jb {

    /* renamed from: b */
    protected final com.applovin.impl.sdk.j f24649b;

    /* renamed from: c */
    protected final AppLovinAdServiceImpl f24650c;
    private AppLovinAd d;
    private String e;

    /* renamed from: f */
    private SoftReference f24651f;

    /* renamed from: h */
    private volatile String f24653h;

    /* renamed from: a */
    public final Map f24648a = Collections.synchronizedMap(new HashMap());

    /* renamed from: g */
    private final Object f24652g = new Object();

    /* renamed from: i */
    private volatile boolean f24654i = false;

    /* loaded from: classes.dex */
    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            jb.this.f24649b.J();
            if (com.applovin.impl.sdk.n.a()) {
                jb.this.f24649b.J().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            jb.this.f24649b.J();
            if (com.applovin.impl.sdk.n.a()) {
                jb.this.f24649b.J().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            jb.this.f24649b.J();
            if (com.applovin.impl.sdk.n.a()) {
                jb.this.f24649b.J().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i2) {
            jb.this.f24649b.J();
            if (com.applovin.impl.sdk.n.a()) {
                jb.this.f24649b.J().b("IncentivizedAdController", "Reward validation failed: " + i2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final AppLovinAdLoadListener f24656a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f24656a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            jb.this.d = appLovinAd;
            if (this.f24656a != null) {
                AppLovinSdkUtils.runOnUiThread(new ms(4, this, appLovinAd));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            if (this.f24656a != null) {
                AppLovinSdkUtils.runOnUiThread(new du(i2, 0, this));
            }
        }

        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f24656a.adReceived(appLovinAd);
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                jb.this.f24649b.E().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        public /* synthetic */ void a(int i2) {
            try {
                this.f24656a.failedToReceiveAd(i2);
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                jb.this.f24649b.E().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements qb, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a */
        private final AppLovinAd f24658a;

        /* renamed from: b */
        private final AppLovinAdDisplayListener f24659b;

        /* renamed from: c */
        private final AppLovinAdClickListener f24660c;
        private final AppLovinAdVideoPlaybackListener d;

        /* renamed from: f */
        private final AppLovinAdRewardListener f24661f;

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f24658a = appLovinAd;
            this.f24659b = appLovinAdDisplayListener;
            this.f24660c = appLovinAdClickListener;
            this.d = appLovinAdVideoPlaybackListener;
            this.f24661f = appLovinAdRewardListener;
        }

        private void a(com.applovin.impl.sdk.ad.b bVar) {
            String str;
            int i2;
            jb.this.f24649b.J();
            if (com.applovin.impl.sdk.n.a()) {
                jb.this.f24649b.J().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String b2 = jb.this.b();
            if (!StringUtils.isValidString(b2) || !jb.this.f24654i) {
                jb.this.f24649b.J();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n J = jb.this.f24649b.J();
                    StringBuilder v2 = android.support.v4.media.d.v("Invalid reward state - result: ", b2, " and wasFullyEngaged: ");
                    v2.append(jb.this.f24654i);
                    J.b("IncentivizedAdController", v2.toString());
                }
                jb.this.f24649b.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jb.this.f24649b.J().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.b();
                if (jb.this.f24654i) {
                    jb.this.f24649b.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jb.this.f24649b.J().b("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i2 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    jb.this.f24649b.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jb.this.f24649b.J().b("IncentivizedAdController", "User close the ad prematurely");
                    }
                    str = "user_closed_video";
                    i2 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(fh.a(str));
                jb.this.f24649b.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jb.this.f24649b.J().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                gc.a(this.f24661f, bVar, i2);
            }
            if (bVar.F0().getAndSet(true)) {
                return;
            }
            jb.this.f24649b.J();
            if (com.applovin.impl.sdk.n.a()) {
                jb.this.f24649b.J().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            jb.this.f24649b.j0().a((yl) new en(bVar, jb.this.f24649b), tm.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            gc.a(this.f24660c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            gc.a(this.f24659b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd e = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).e() : appLovinAd;
            if (e instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) e);
            } else {
                if (e == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + e;
                }
                jb.this.f24649b.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jb.this.f24649b.J().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            jb.this.a(e);
            jb.this.f24649b.J();
            if (com.applovin.impl.sdk.n.a()) {
                jb.this.f24649b.J().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            gc.b(this.f24659b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.qb
        public void onAdDisplayFailed(String str) {
            String str2;
            ?? r02 = this.f24658a;
            boolean z2 = r02 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVar = r02;
            if (z2) {
                bVar = ((com.applovin.impl.sdk.ad.c) r02).e();
            }
            boolean z3 = this.f24659b instanceof qb;
            if (bVar instanceof com.applovin.impl.sdk.ad.b) {
                a(bVar);
            } else {
                if (bVar == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + bVar;
                }
                jb.this.f24649b.J();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n J = jb.this.f24649b.J();
                    StringBuilder sb = new StringBuilder("Received `");
                    sb.append(z3 ? "adDisplayFailed" : "adHidden");
                    sb.append("` callback for ");
                    sb.append(str2);
                    J.b("IncentivizedAdController", sb.toString());
                }
            }
            jb.this.a(bVar);
            if (z3) {
                gc.a(this.f24659b, str);
            } else {
                gc.b(this.f24659b, this.f24658a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            jb.this.a("quota_exceeded");
            gc.b(this.f24661f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            jb.this.a("rejected");
            gc.a(this.f24661f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            jb.this.a("accepted");
            gc.c(this.f24661f, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i2) {
            jb.this.a("network_timeout");
            gc.a(this.f24661f, appLovinAd, i2);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            gc.a(this.d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z2) {
            gc.a(this.d, appLovinAd, d, z2);
            jb.this.f24654i = z2;
        }

        public /* synthetic */ c(jb jbVar, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }
    }

    public jb(String str, AppLovinSdk appLovinSdk) {
        this.f24649b = appLovinSdk.a();
        this.f24650c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f24651f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public String c() {
        return this.e;
    }

    public boolean d() {
        return this.d != null;
    }

    public String b() {
        String str;
        synchronized (this.f24652g) {
            str = this.f24653h;
        }
        return str;
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, qb qbVar) {
        this.f24649b.D().c(ca.f23251o);
        gc.a(appLovinAdVideoPlaybackListener, appLovinAd, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, false);
        gc.a(qbVar, str);
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f24649b.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f24649b.J().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f24651f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.d);
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
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a2 = yp.a(appLovinAdImpl, this.f24649b);
        String a3 = a(a2, appLovinAdImpl);
        if (StringUtils.isValidString(a3)) {
            a(appLovinAdImpl, a3, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f24649b.s0(), context);
        for (String str : this.f24648a.keySet()) {
            create.setExtraInfo(str, this.f24648a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a2);
        a((com.applovin.impl.sdk.ad.b) a2, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a2 = yp.a(appLovinAdImpl, this.f24649b);
        String a3 = a(a2, appLovinAdImpl);
        if (StringUtils.isValidString(a3)) {
            a(appLovinAdImpl, a3, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f24649b.s0(), context);
        for (String str : this.f24648a.keySet()) {
            create.setExtraInfo(str, this.f24648a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a2, viewGroup, lifecycle);
        a((com.applovin.impl.sdk.ad.b) a2, cVar);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f24649b.j0().a((yl) new kn(bVar, appLovinAdRewardListener, this.f24649b), tm.b.OTHER);
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f24650c.loadNextIncentivizedAd(this.e, appLovinAdLoadListener);
    }

    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.e() == null || appLovinAd == cVar.e()) {
                this.d = null;
            }
        }
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED || appLovinAd2.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.n.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    public void a(String str, Object obj) {
        this.f24648a.put(str, obj);
    }

    public void a(String str) {
        synchronized (this.f24652g) {
            this.f24653h = str;
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
