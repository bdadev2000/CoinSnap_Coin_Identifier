package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.fm;
import com.applovin.impl.gc;
import com.applovin.impl.ge;
import com.applovin.impl.lm;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.ve;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f25405a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25406b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f25407c = new Object();
    private final Map d = new HashMap(4);
    private final Object e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f25408f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Object f25409g = new Object();

    /* loaded from: classes2.dex */
    public class a implements fm.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f25410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f25411b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25412c;
        final /* synthetic */ MaxAdFormat d;
        final /* synthetic */ Map e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f25413f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f25414g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0085a f25415h;

        public a(long j2, Map map, String str, MaxAdFormat maxAdFormat, Map map2, Map map3, Context context, a.InterfaceC0085a interfaceC0085a) {
            this.f25410a = j2;
            this.f25411b = map;
            this.f25412c = str;
            this.d = maxAdFormat;
            this.e = map2;
            this.f25413f = map3;
            this.f25414g = context;
            this.f25415h = interfaceC0085a;
        }

        @Override // com.applovin.impl.fm.b
        public void a(JSONArray jSONArray) {
            this.f25411b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f25410a));
            this.f25411b.put("calfc", Integer.valueOf(d.this.b(this.f25412c)));
            lm lmVar = new lm(this.f25412c, this.d, this.e, this.f25413f, this.f25411b, jSONArray, this.f25414g, d.this.f25405a, this.f25415h);
            if (((Boolean) d.this.f25405a.a(ve.T7)).booleanValue()) {
                d.this.f25405a.j0().a((yl) lmVar, tm.b.MEDIATION);
            } else {
                d.this.f25405a.j0().a(lmVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");


        /* renamed from: a, reason: collision with root package name */
        private final String f25423a;

        b(String str) {
            this.f25423a = str;
        }

        public String b() {
            return this.f25423a;
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements a.InterfaceC0085a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.j f25424a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f25425b;

        /* renamed from: c, reason: collision with root package name */
        private final d f25426c;
        private final C0086d d;

        /* renamed from: f, reason: collision with root package name */
        private final MaxAdFormat f25427f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f25428g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f25429h;

        /* renamed from: i, reason: collision with root package name */
        private final Map f25430i;

        /* renamed from: j, reason: collision with root package name */
        private final int f25431j;

        /* renamed from: k, reason: collision with root package name */
        private long f25432k;

        /* renamed from: l, reason: collision with root package name */
        private long f25433l;

        public /* synthetic */ c(Map map, Map map2, Map map3, C0086d c0086d, MaxAdFormat maxAdFormat, long j2, long j3, d dVar, com.applovin.impl.sdk.j jVar, Context context, a aVar) {
            this(map, map2, map3, c0086d, maxAdFormat, j2, j3, dVar, jVar, context);
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
            this.f25426c.c(str);
            if (((Boolean) this.f25424a.a(ve.H7)).booleanValue() && this.d.f25436c.get()) {
                this.f25424a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25424a.J().a("MediationAdLoadManager", "Ad failed to load but its load state was destroyed");
                    return;
                }
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25432k;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f25424a.Q().processWaterfallInfoPostback(str, this.f25427f, maxAdWaterfallInfoImpl, maxError, this.f25433l, elapsedRealtime);
            }
            boolean z2 = maxError.getCode() == -5603 && yp.c(this.f25424a) && ((Boolean) this.f25424a.a(sj.s6)).booleanValue();
            if (this.f25424a.a(ve.G7, this.f25427f) && this.d.d < this.f25431j && !z2) {
                C0086d.f(this.d);
                final int pow = (int) Math.pow(2.0d, this.d.d);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.c.this.a(pow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(pow));
                return;
            }
            this.d.d = 0;
            this.d.f25435b.set(false);
            if (this.d.e != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.d.f25434a);
                maxErrorImpl.setRequestLatencyMillis(elapsedRealtime);
                gc.a(this.d.e, str, maxError);
                this.d.e = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (((Boolean) this.f25424a.a(ve.H7)).booleanValue() && this.d.f25436c.get()) {
                this.f25424a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25424a.J().a("MediationAdLoadManager", "Ad loaded but its load state was destroyed");
                }
                this.f25424a.Q().destroyAd(maxAd);
                return;
            }
            ge geVar = (ge) maxAd;
            geVar.i(this.d.f25434a);
            geVar.a(SystemClock.elapsedRealtime() - this.f25432k);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) geVar.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f25424a.Q().processWaterfallInfoPostback(geVar.getAdUnitId(), this.f25427f, maxAdWaterfallInfoImpl, null, this.f25433l, geVar.getRequestLatencyMillis());
            }
            this.f25426c.a(maxAd.getAdUnitId());
            this.d.d = 0;
            if (this.d.e == null) {
                this.f25426c.a(geVar);
                this.d.f25435b.set(false);
                return;
            }
            geVar.A().c().a(this.d.e);
            this.d.e.onAdLoaded(geVar);
            if (geVar.Q().endsWith("load")) {
                this.d.e.onAdRevenuePaid(geVar);
            }
            this.d.e = null;
            if ((!this.f25424a.c(ve.E7).contains(maxAd.getAdUnitId()) && !this.f25424a.a(ve.D7, maxAd.getFormat())) || this.f25424a.l0().c() || this.f25424a.l0().d()) {
                this.d.f25435b.set(false);
                return;
            }
            Context context = (Context) this.f25425b.get();
            if (context == null) {
                context = com.applovin.impl.sdk.j.l();
            }
            Context context2 = context;
            this.f25432k = SystemClock.elapsedRealtime();
            this.f25433l = System.currentTimeMillis();
            this.f25430i.put("art", b.SEQUENTIAL_OR_PRECACHE.b());
            this.f25426c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f25428g, this.f25429h, this.f25430i, context2, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private c(Map map, Map map2, Map map3, C0086d c0086d, MaxAdFormat maxAdFormat, long j2, long j3, d dVar, com.applovin.impl.sdk.j jVar, Context context) {
            this.f25424a = jVar;
            this.f25425b = new WeakReference(context);
            this.f25426c = dVar;
            this.d = c0086d;
            this.f25427f = maxAdFormat;
            this.f25429h = map2;
            this.f25428g = map;
            this.f25430i = map3;
            this.f25432k = j2;
            this.f25433l = j3;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f25431j = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f25431j = Math.min(2, ((Integer) jVar.a(ve.F7)).intValue());
            } else {
                this.f25431j = ((Integer) jVar.a(ve.F7)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i2, String str) {
            this.f25429h.put("retry_delay_sec", Integer.valueOf(i2));
            this.f25429h.put("retry_attempt", Integer.valueOf(this.d.d));
            Context context = (Context) this.f25425b.get();
            if (context == null) {
                context = com.applovin.impl.sdk.j.l();
            }
            Context context2 = context;
            this.f25430i.put("art", b.EXPONENTIAL_RETRY.b());
            this.f25430i.put("era", Integer.valueOf(this.d.d));
            this.f25433l = System.currentTimeMillis();
            this.f25426c.a(str, this.f25427f, this.f25428g, this.f25429h, this.f25430i, context2, this);
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0086d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25434a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f25435b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f25436c;
        private int d;
        private volatile a.InterfaceC0085a e;

        public /* synthetic */ C0086d(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int f(C0086d c0086d) {
            int i2 = c0086d.d;
            c0086d.d = i2 + 1;
            return i2;
        }

        private C0086d(String str) {
            this.f25435b = new AtomicBoolean();
            this.f25436c = new AtomicBoolean();
            this.f25434a = str;
        }
    }

    public d(com.applovin.impl.sdk.j jVar) {
        this.f25405a = jVar;
    }

    private String b(String str, String str2) {
        StringBuilder q2 = androidx.compose.foundation.text.input.a.q(str);
        q2.append(str2 != null ? "-".concat(str2) : "");
        return q2.toString();
    }

    private ge e(String str) {
        ge geVar;
        synchronized (this.e) {
            geVar = (ge) this.d.get(str);
            this.d.remove(str);
        }
        return geVar;
    }

    public void c(String str, String str2) {
        synchronized (this.f25407c) {
            String b2 = b(str, str2);
            a(str, str2).f25436c.set(true);
            this.f25406b.remove(b2);
        }
    }

    public boolean d(String str) {
        boolean z2;
        synchronized (this.e) {
            z2 = this.d.get(str) != null;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ge geVar) {
        synchronized (this.e) {
            try {
                if (this.d.containsKey(geVar.getAdUnitId())) {
                    com.applovin.impl.sdk.n.h("AppLovinSdk", "Ad in cache already: " + geVar.getAdUnitId());
                }
                this.d.put(geVar.getAdUnitId(), geVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(String str) {
        int intValue;
        synchronized (this.f25409g) {
            try {
                Integer num = (Integer) this.f25408f.get(str);
                intValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public void c(String str) {
        synchronized (this.f25409g) {
            try {
                this.f25405a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25405a.J().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f25408f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f25408f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, b bVar, Map map, Map map2, Context context, a.InterfaceC0085a interfaceC0085a) {
        ge e = (this.f25405a.l0().d() || yp.f(com.applovin.impl.sdk.j.l())) ? null : e(str);
        if (e != null) {
            e.i(str2);
            e.A().c().a(interfaceC0085a);
            interfaceC0085a.onAdLoaded(e);
            if (e.Q().endsWith("load")) {
                interfaceC0085a.onAdRevenuePaid(e);
            }
        }
        C0086d a2 = a(str, str2);
        if (a2.f25435b.compareAndSet(false, true)) {
            if (e == null) {
                a2.e = interfaceC0085a;
            }
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            synchronizedMap.put("art", bVar.b());
            if (StringUtils.isValidString(str2)) {
                synchronizedMap.put("alt", str2);
            }
            a(str, maxAdFormat, map, map2, synchronizedMap, context, new c(map, map2, synchronizedMap, a2, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f25405a, context, null));
            return;
        }
        if (a2.e != null && a2.e != interfaceC0085a) {
            com.applovin.impl.sdk.n.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        a2.e = interfaceC0085a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0085a interfaceC0085a) {
        this.f25405a.j0().a((yl) new fm(str, maxAdFormat, map, context, this.f25405a, new a(SystemClock.elapsedRealtime(), map3, str, maxAdFormat, map, map2, context, interfaceC0085a)), tm.b.MEDIATION);
    }

    private C0086d a(String str, String str2) {
        C0086d c0086d;
        synchronized (this.f25407c) {
            try {
                String b2 = b(str, str2);
                c0086d = (C0086d) this.f25406b.get(b2);
                if (c0086d == null) {
                    c0086d = new C0086d(str2, null);
                    this.f25406b.put(b2, c0086d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0086d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f25409g) {
            try {
                this.f25405a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25405a.J().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f25408f.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
