package com.applovin.impl.mediation;

import Q7.n0;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.em;
import com.applovin.impl.km;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.oj;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9059a;
    private final Map b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f9060c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f9061d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f9062e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f9063f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Object f9064g = new Object();

    /* loaded from: classes.dex */
    public class a implements em.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f9065a;
        final /* synthetic */ Map b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9066c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f9067d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f9068e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f9069f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f9070g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0023a f9071h;

        public a(long j7, Map map, String str, MaxAdFormat maxAdFormat, Map map2, Map map3, Context context, a.InterfaceC0023a interfaceC0023a) {
            this.f9065a = j7;
            this.b = map;
            this.f9066c = str;
            this.f9067d = maxAdFormat;
            this.f9068e = map2;
            this.f9069f = map3;
            this.f9070g = context;
            this.f9071h = interfaceC0023a;
        }

        @Override // com.applovin.impl.em.b
        public void a(JSONArray jSONArray) {
            this.b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f9065a));
            this.b.put("calfc", Integer.valueOf(d.this.b(this.f9066c)));
            km kmVar = new km(this.f9066c, this.f9067d, this.f9068e, this.f9069f, this.b, jSONArray, this.f9070g, d.this.f9059a, this.f9071h);
            if (((Boolean) d.this.f9059a.a(qe.f10300J7)).booleanValue()) {
                d.this.f9059a.l0().a((xl) kmVar, sm.b.MEDIATION);
            } else {
                d.this.f9059a.l0().a(kmVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH(ToolBar.REFRESH),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");


        /* renamed from: a, reason: collision with root package name */
        private final String f9079a;

        b(String str) {
            this.f9079a = str;
        }

        public String b() {
            return this.f9079a;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements a.InterfaceC0023a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9080a;
        private final WeakReference b;

        /* renamed from: c, reason: collision with root package name */
        private final d f9081c;

        /* renamed from: d, reason: collision with root package name */
        private final C0024d f9082d;

        /* renamed from: f, reason: collision with root package name */
        private final MaxAdFormat f9083f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f9084g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f9085h;

        /* renamed from: i, reason: collision with root package name */
        private final Map f9086i;

        /* renamed from: j, reason: collision with root package name */
        private final int f9087j;

        /* renamed from: k, reason: collision with root package name */
        private long f9088k;
        private long l;

        public /* synthetic */ c(Map map, Map map2, Map map3, C0024d c0024d, MaxAdFormat maxAdFormat, long j7, long j9, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, c0024d, maxAdFormat, j7, j9, dVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            boolean z8;
            this.f9081c.c(str);
            if (((Boolean) this.f9080a.a(qe.f10343z7)).booleanValue() && this.f9082d.f9090c.get()) {
                this.f9080a.L();
                if (t.a()) {
                    this.f9080a.L().a("MediationAdLoadManager", "Ad failed to load but its load state was destroyed");
                    return;
                }
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9088k;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f9080a.S().processWaterfallInfoPostback(str, this.f9083f, maxAdWaterfallInfoImpl, this.l, elapsedRealtime);
            }
            if (maxError.getCode() == -5603 && zp.c(this.f9080a) && ((Boolean) this.f9080a.a(oj.f9821o6)).booleanValue()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!this.f9080a.a(qe.f10342y7, this.f9083f) || this.f9082d.f9091d >= this.f9087j || z8) {
                this.f9082d.f9091d = 0;
                this.f9082d.b.set(false);
                if (this.f9082d.f9092e != null) {
                    MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                    maxErrorImpl.setLoadTag(this.f9082d.f9089a);
                    maxErrorImpl.setRequestLatencyMillis(elapsedRealtime);
                    bc.a(this.f9082d.f9092e, str, maxError);
                    this.f9082d.f9092e = null;
                    return;
                }
                return;
            }
            C0024d.f(this.f9082d);
            final int pow = (int) Math.pow(2.0d, this.f9082d.f9091d);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.i
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.this.a(pow, str);
                }
            }, TimeUnit.SECONDS.toMillis(pow));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (((Boolean) this.f9080a.a(qe.f10343z7)).booleanValue() && this.f9082d.f9090c.get()) {
                this.f9080a.L();
                if (t.a()) {
                    this.f9080a.L().a("MediationAdLoadManager", "Ad loaded but its load state was destroyed");
                }
                this.f9080a.S().destroyAd(maxAd);
                return;
            }
            be beVar = (be) maxAd;
            beVar.i(this.f9082d.f9089a);
            beVar.a(SystemClock.elapsedRealtime() - this.f9088k);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) beVar.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f9080a.S().processWaterfallInfoPostback(beVar.getAdUnitId(), this.f9083f, maxAdWaterfallInfoImpl, this.l, beVar.getRequestLatencyMillis());
            }
            this.f9081c.a(maxAd.getAdUnitId());
            this.f9082d.f9091d = 0;
            if (this.f9082d.f9092e == null) {
                this.f9081c.a(beVar);
                this.f9082d.b.set(false);
                return;
            }
            beVar.z().c().a(this.f9082d.f9092e);
            this.f9082d.f9092e.onAdLoaded(beVar);
            if (beVar.O().endsWith("load")) {
                this.f9082d.f9092e.onAdRevenuePaid(beVar);
            }
            this.f9082d.f9092e = null;
            if ((this.f9080a.c(qe.f10340w7).contains(maxAd.getAdUnitId()) || this.f9080a.a(qe.f10339v7, maxAd.getFormat())) && !this.f9080a.n0().c() && !this.f9080a.n0().d()) {
                Context context = (Context) this.b.get();
                if (context == null) {
                    context = com.applovin.impl.sdk.k.k();
                }
                Context context2 = context;
                this.f9088k = SystemClock.elapsedRealtime();
                this.l = System.currentTimeMillis();
                this.f9086i.put("art", b.SEQUENTIAL_OR_PRECACHE.b());
                this.f9081c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f9084g, this.f9085h, this.f9086i, context2, this);
                return;
            }
            this.f9082d.b.set(false);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private c(Map map, Map map2, Map map3, C0024d c0024d, MaxAdFormat maxAdFormat, long j7, long j9, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f9080a = kVar;
            this.b = new WeakReference(context);
            this.f9081c = dVar;
            this.f9082d = c0024d;
            this.f9083f = maxAdFormat;
            this.f9085h = map2;
            this.f9084g = map;
            this.f9086i = map3;
            this.f9088k = j7;
            this.l = j9;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f9087j = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f9087j = Math.min(2, ((Integer) kVar.a(qe.f10341x7)).intValue());
            } else {
                this.f9087j = ((Integer) kVar.a(qe.f10341x7)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i9, String str) {
            this.f9085h.put("retry_delay_sec", Integer.valueOf(i9));
            this.f9085h.put("retry_attempt", Integer.valueOf(this.f9082d.f9091d));
            Context context = (Context) this.b.get();
            if (context == null) {
                context = com.applovin.impl.sdk.k.k();
            }
            Context context2 = context;
            this.f9086i.put("art", b.EXPONENTIAL_RETRY.b());
            this.f9086i.put("era", Integer.valueOf(this.f9082d.f9091d));
            this.l = System.currentTimeMillis();
            this.f9081c.a(str, this.f9083f, this.f9084g, this.f9085h, this.f9086i, context2, this);
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0024d {

        /* renamed from: a, reason: collision with root package name */
        private final String f9089a;
        private final AtomicBoolean b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f9090c;

        /* renamed from: d, reason: collision with root package name */
        private int f9091d;

        /* renamed from: e, reason: collision with root package name */
        private volatile a.InterfaceC0023a f9092e;

        public /* synthetic */ C0024d(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int f(C0024d c0024d) {
            int i9 = c0024d.f9091d;
            c0024d.f9091d = i9 + 1;
            return i9;
        }

        private C0024d(String str) {
            this.b = new AtomicBoolean();
            this.f9090c = new AtomicBoolean();
            this.f9089a = str;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f9059a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder b8 = AbstractC2965e.b(str);
        b8.append(str2 != null ? "-".concat(str2) : "");
        return b8.toString();
    }

    private be e(String str) {
        be beVar;
        synchronized (this.f9062e) {
            beVar = (be) this.f9061d.get(str);
            this.f9061d.remove(str);
        }
        return beVar;
    }

    public void c(String str, String str2) {
        synchronized (this.f9060c) {
            String b8 = b(str, str2);
            a(str, str2).f9090c.set(true);
            this.b.remove(b8);
        }
    }

    public boolean d(String str) {
        boolean z8;
        synchronized (this.f9062e) {
            if (this.f9061d.get(str) != null) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar) {
        synchronized (this.f9062e) {
            try {
                if (this.f9061d.containsKey(beVar.getAdUnitId())) {
                    t.h("AppLovinSdk", "Ad in cache already: " + beVar.getAdUnitId());
                }
                this.f9061d.put(beVar.getAdUnitId(), beVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(String str) {
        int intValue;
        synchronized (this.f9064g) {
            try {
                Integer num = (Integer) this.f9063f.get(str);
                intValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public void c(String str) {
        synchronized (this.f9064g) {
            try {
                this.f9059a.L();
                if (t.a()) {
                    this.f9059a.L().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f9063f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f9063f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, b bVar, Map map, Map map2, Context context, a.InterfaceC0023a interfaceC0023a) {
        be e4 = (this.f9059a.n0().d() || zp.f(com.applovin.impl.sdk.k.k())) ? null : e(str);
        if (e4 != null) {
            e4.i(str2);
            e4.z().c().a(interfaceC0023a);
            interfaceC0023a.onAdLoaded(e4);
            if (e4.O().endsWith("load")) {
                interfaceC0023a.onAdRevenuePaid(e4);
            }
        }
        C0024d a6 = a(str, str2);
        if (!a6.b.compareAndSet(false, true)) {
            if (a6.f9092e != null && a6.f9092e != interfaceC0023a) {
                t.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            a6.f9092e = interfaceC0023a;
            return;
        }
        if (e4 == null) {
            a6.f9092e = interfaceC0023a;
        }
        Map q9 = n0.q();
        q9.put("art", bVar.b());
        if (StringUtils.isValidString(str2)) {
            q9.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, q9, context, new c(map, map2, q9, a6, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f9059a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0023a interfaceC0023a) {
        this.f9059a.l0().a((xl) new em(str, maxAdFormat, map, context, this.f9059a, new a(SystemClock.elapsedRealtime(), map3, str, maxAdFormat, map, map2, context, interfaceC0023a)), sm.b.MEDIATION);
    }

    private C0024d a(String str, String str2) {
        C0024d c0024d;
        synchronized (this.f9060c) {
            try {
                String b8 = b(str, str2);
                c0024d = (C0024d) this.b.get(b8);
                if (c0024d == null) {
                    c0024d = new C0024d(str2, null);
                    this.b.put(b8, c0024d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0024d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f9064g) {
            try {
                this.f9059a.L();
                if (t.a()) {
                    this.f9059a.L().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f9063f.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
