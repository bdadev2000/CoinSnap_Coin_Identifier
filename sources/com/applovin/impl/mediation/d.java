package com.applovin.impl.mediation;

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

/* loaded from: classes.dex */
public class d {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6105b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f6106c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f6107d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f6108e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f6109f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Object f6110g = new Object();

    /* loaded from: classes.dex */
    public class a implements em.b {
        final /* synthetic */ long a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f6111b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6112c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f6113d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f6114e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f6115f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f6116g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0023a f6117h;

        public a(long j3, Map map, String str, MaxAdFormat maxAdFormat, Map map2, Map map3, Context context, a.InterfaceC0023a interfaceC0023a) {
            this.a = j3;
            this.f6111b = map;
            this.f6112c = str;
            this.f6113d = maxAdFormat;
            this.f6114e = map2;
            this.f6115f = map3;
            this.f6116g = context;
            this.f6117h = interfaceC0023a;
        }

        @Override // com.applovin.impl.em.b
        public void a(JSONArray jSONArray) {
            this.f6111b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.a));
            this.f6111b.put("calfc", Integer.valueOf(d.this.b(this.f6112c)));
            km kmVar = new km(this.f6112c, this.f6113d, this.f6114e, this.f6115f, this.f6111b, jSONArray, this.f6116g, d.this.a, this.f6117h);
            if (((Boolean) d.this.a.a(qe.J7)).booleanValue()) {
                d.this.a.l0().a((xl) kmVar, sm.b.MEDIATION);
            } else {
                d.this.a.l0().a(kmVar);
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

        private final String a;

        b(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements a.InterfaceC0023a {
        private final com.applovin.impl.sdk.k a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f6126b;

        /* renamed from: c, reason: collision with root package name */
        private final d f6127c;

        /* renamed from: d, reason: collision with root package name */
        private final C0024d f6128d;

        /* renamed from: f, reason: collision with root package name */
        private final MaxAdFormat f6129f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f6130g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f6131h;

        /* renamed from: i, reason: collision with root package name */
        private final Map f6132i;

        /* renamed from: j, reason: collision with root package name */
        private final int f6133j;

        /* renamed from: k, reason: collision with root package name */
        private long f6134k;

        /* renamed from: l, reason: collision with root package name */
        private long f6135l;

        public /* synthetic */ c(Map map, Map map2, Map map3, C0024d c0024d, MaxAdFormat maxAdFormat, long j3, long j10, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, c0024d, maxAdFormat, j3, j10, dVar, kVar, context);
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
            boolean z10;
            this.f6127c.c(str);
            if (((Boolean) this.a.a(qe.f7214z7)).booleanValue() && this.f6128d.f6137c.get()) {
                this.a.L();
                if (t.a()) {
                    this.a.L().a("MediationAdLoadManager", "Ad failed to load but its load state was destroyed");
                    return;
                }
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6134k;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.a.S().processWaterfallInfoPostback(str, this.f6129f, maxAdWaterfallInfoImpl, this.f6135l, elapsedRealtime);
            }
            if (maxError.getCode() == -5603 && zp.c(this.a) && ((Boolean) this.a.a(oj.f6726o6)).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.a.a(qe.f7213y7, this.f6129f) || this.f6128d.f6138d >= this.f6133j || z10) {
                this.f6128d.f6138d = 0;
                this.f6128d.f6136b.set(false);
                if (this.f6128d.f6139e != null) {
                    MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                    maxErrorImpl.setLoadTag(this.f6128d.a);
                    maxErrorImpl.setRequestLatencyMillis(elapsedRealtime);
                    bc.a(this.f6128d.f6139e, str, maxError);
                    this.f6128d.f6139e = null;
                    return;
                }
                return;
            }
            C0024d.f(this.f6128d);
            final int pow = (int) Math.pow(2.0d, this.f6128d.f6138d);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.j
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.this.a(pow, str);
                }
            }, TimeUnit.SECONDS.toMillis(pow));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (((Boolean) this.a.a(qe.f7214z7)).booleanValue() && this.f6128d.f6137c.get()) {
                this.a.L();
                if (t.a()) {
                    this.a.L().a("MediationAdLoadManager", "Ad loaded but its load state was destroyed");
                }
                this.a.S().destroyAd(maxAd);
                return;
            }
            be beVar = (be) maxAd;
            beVar.i(this.f6128d.a);
            beVar.a(SystemClock.elapsedRealtime() - this.f6134k);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) beVar.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.a.S().processWaterfallInfoPostback(beVar.getAdUnitId(), this.f6129f, maxAdWaterfallInfoImpl, this.f6135l, beVar.getRequestLatencyMillis());
            }
            this.f6127c.a(maxAd.getAdUnitId());
            this.f6128d.f6138d = 0;
            if (this.f6128d.f6139e == null) {
                this.f6127c.a(beVar);
                this.f6128d.f6136b.set(false);
                return;
            }
            beVar.z().c().a(this.f6128d.f6139e);
            this.f6128d.f6139e.onAdLoaded(beVar);
            if (beVar.O().endsWith("load")) {
                this.f6128d.f6139e.onAdRevenuePaid(beVar);
            }
            this.f6128d.f6139e = null;
            if ((this.a.c(qe.f7211w7).contains(maxAd.getAdUnitId()) || this.a.a(qe.f7210v7, maxAd.getFormat())) && !this.a.n0().c() && !this.a.n0().d()) {
                Context context = (Context) this.f6126b.get();
                if (context == null) {
                    context = com.applovin.impl.sdk.k.k();
                }
                this.f6134k = SystemClock.elapsedRealtime();
                this.f6135l = System.currentTimeMillis();
                this.f6132i.put("art", b.SEQUENTIAL_OR_PRECACHE.b());
                this.f6127c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f6130g, this.f6131h, this.f6132i, context, this);
                return;
            }
            this.f6128d.f6136b.set(false);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private c(Map map, Map map2, Map map3, C0024d c0024d, MaxAdFormat maxAdFormat, long j3, long j10, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.a = kVar;
            this.f6126b = new WeakReference(context);
            this.f6127c = dVar;
            this.f6128d = c0024d;
            this.f6129f = maxAdFormat;
            this.f6131h = map2;
            this.f6130g = map;
            this.f6132i = map3;
            this.f6134k = j3;
            this.f6135l = j10;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f6133j = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f6133j = Math.min(2, ((Integer) kVar.a(qe.f7212x7)).intValue());
            } else {
                this.f6133j = ((Integer) kVar.a(qe.f7212x7)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f6131h.put("retry_delay_sec", Integer.valueOf(i10));
            this.f6131h.put("retry_attempt", Integer.valueOf(this.f6128d.f6138d));
            Context context = (Context) this.f6126b.get();
            if (context == null) {
                context = com.applovin.impl.sdk.k.k();
            }
            this.f6132i.put("art", b.EXPONENTIAL_RETRY.b());
            this.f6132i.put("era", Integer.valueOf(this.f6128d.f6138d));
            this.f6135l = System.currentTimeMillis();
            this.f6127c.a(str, this.f6129f, this.f6130g, this.f6131h, this.f6132i, context, this);
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0024d {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f6136b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f6137c;

        /* renamed from: d, reason: collision with root package name */
        private int f6138d;

        /* renamed from: e, reason: collision with root package name */
        private volatile a.InterfaceC0023a f6139e;

        public /* synthetic */ C0024d(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int f(C0024d c0024d) {
            int i10 = c0024d.f6138d;
            c0024d.f6138d = i10 + 1;
            return i10;
        }

        private C0024d(String str) {
            this.f6136b = new AtomicBoolean();
            this.f6137c = new AtomicBoolean();
            this.a = str;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder m10 = eb.j.m(str);
        m10.append(str2 != null ? "-".concat(str2) : "");
        return m10.toString();
    }

    private be e(String str) {
        be beVar;
        synchronized (this.f6108e) {
            beVar = (be) this.f6107d.get(str);
            this.f6107d.remove(str);
        }
        return beVar;
    }

    public void c(String str, String str2) {
        synchronized (this.f6106c) {
            String b3 = b(str, str2);
            a(str, str2).f6137c.set(true);
            this.f6105b.remove(b3);
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f6108e) {
            if (this.f6107d.get(str) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar) {
        synchronized (this.f6108e) {
            if (this.f6107d.containsKey(beVar.getAdUnitId())) {
                t.h("AppLovinSdk", "Ad in cache already: " + beVar.getAdUnitId());
            }
            this.f6107d.put(beVar.getAdUnitId(), beVar);
        }
    }

    public int b(String str) {
        int intValue;
        synchronized (this.f6110g) {
            Integer num = (Integer) this.f6109f.get(str);
            intValue = num != null ? num.intValue() : 0;
        }
        return intValue;
    }

    public void c(String str) {
        synchronized (this.f6110g) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f6109f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f6109f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, b bVar, Map map, Map map2, Context context, a.InterfaceC0023a interfaceC0023a) {
        be e2 = (this.a.n0().d() || zp.f(com.applovin.impl.sdk.k.k())) ? null : e(str);
        if (e2 != null) {
            e2.i(str2);
            e2.z().c().a(interfaceC0023a);
            interfaceC0023a.onAdLoaded(e2);
            if (e2.O().endsWith("load")) {
                interfaceC0023a.onAdRevenuePaid(e2);
            }
        }
        C0024d a10 = a(str, str2);
        if (a10.f6136b.compareAndSet(false, true)) {
            if (e2 == null) {
                a10.f6139e = interfaceC0023a;
            }
            Map r6 = a4.j.r();
            r6.put("art", bVar.b());
            if (StringUtils.isValidString(str2)) {
                r6.put("alt", str2);
            }
            a(str, maxAdFormat, map, map2, r6, context, new c(map, map2, r6, a10, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.a, context, null));
            return;
        }
        if (a10.f6139e != null && a10.f6139e != interfaceC0023a) {
            t.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        a10.f6139e = interfaceC0023a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0023a interfaceC0023a) {
        this.a.l0().a((xl) new em(str, maxAdFormat, map, context, this.a, new a(SystemClock.elapsedRealtime(), map3, str, maxAdFormat, map, map2, context, interfaceC0023a)), sm.b.MEDIATION);
    }

    private C0024d a(String str, String str2) {
        C0024d c0024d;
        synchronized (this.f6106c) {
            String b3 = b(str, str2);
            c0024d = (C0024d) this.f6105b.get(b3);
            if (c0024d == null) {
                c0024d = new C0024d(str2, null);
                this.f6105b.put(b3, c0024d);
            }
        }
        return c0024d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f6110g) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f6109f.remove(str);
        }
    }
}
