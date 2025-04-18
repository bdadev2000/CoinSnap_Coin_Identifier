package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.tm;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class wm extends yl {

    /* renamed from: z */
    private static final AtomicBoolean f27744z = new AtomicBoolean();

    /* renamed from: h */
    private final String f27745h;

    /* renamed from: i */
    private final MaxAdFormat f27746i;

    /* renamed from: j */
    private final JSONObject f27747j;

    /* renamed from: k */
    private final a.InterfaceC0085a f27748k;

    /* renamed from: l */
    private final WeakReference f27749l;

    /* renamed from: m */
    private final String f27750m;

    /* renamed from: n */
    private final Queue f27751n;

    /* renamed from: o */
    private final Object f27752o;

    /* renamed from: p */
    private final Queue f27753p;

    /* renamed from: q */
    private final Object f27754q;

    /* renamed from: r */
    private final int f27755r;

    /* renamed from: s */
    private long f27756s;

    /* renamed from: t */
    private final List f27757t;

    /* renamed from: u */
    private final AtomicBoolean f27758u;

    /* renamed from: v */
    private final AtomicBoolean f27759v;
    private final AtomicBoolean w;
    private ge x;

    /* renamed from: y */
    private go f27760y;

    /* loaded from: classes2.dex */
    public class b extends yl {

        /* renamed from: h */
        private final String f27761h;

        /* renamed from: i */
        private final long f27762i;

        /* renamed from: j */
        private final ge f27763j;

        /* renamed from: k */
        private final c f27764k;

        /* renamed from: l */
        private final int f27765l;

        /* renamed from: m */
        private boolean f27766m;

        /* renamed from: n */
        private int f27767n;

        /* loaded from: classes2.dex */
        public class a extends oe {
            public a(a.InterfaceC0085a interfaceC0085a) {
                super(interfaceC0085a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f27762i;
                com.applovin.impl.sdk.n unused = b.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    b.this.f28218c.a(b.this.f27761h, "Ad (" + b.this.f27765l + ") failed to load in " + elapsedRealtime + "ms for " + wm.this.f27746i + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                if (!b.this.f27766m) {
                    b bVar = b.this;
                    wm.this.a(bVar.f27763j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                }
                if (wm.this.w.get()) {
                    return;
                }
                if (wm.this.x != null) {
                    b bVar2 = b.this;
                    if (b.this.b(wm.this.c(bVar2.f27764k))) {
                        wm wmVar = wm.this;
                        wmVar.b(wmVar.x);
                        return;
                    }
                }
                if (b.this.f27767n > 0) {
                    if (!b.this.f28216a.a(ve.K7, String.valueOf(maxError.getCode()))) {
                        b.l(b.this);
                        b.this.f27766m = true;
                        b.this.f28216a.j0().a(b.this, tm.b.MEDIATION, b.this.f27763j.V());
                        return;
                    }
                    com.applovin.impl.sdk.n unused2 = b.this.f28218c;
                    if (com.applovin.impl.sdk.n.a()) {
                        b.this.f28218c.a(b.this.f28217b, "Ignoring failed ad load retry for error code " + maxError.getCode());
                    }
                }
                b bVar3 = b.this;
                if ((!wm.this.d(bVar3.f27764k)) && wm.this.f27759v.get() && wm.this.f27758u.get()) {
                    wm.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                boolean z2;
                long E;
                ge geVar;
                b.this.b("loaded ad");
                ge geVar2 = (ge) maxAd;
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f27762i;
                com.applovin.impl.sdk.n unused = b.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    b.this.f28218c.a(b.this.f27761h, "Ad (" + b.this.f27765l + ") loaded in " + elapsedRealtime + "ms for " + wm.this.f27746i + " ad unit " + wm.this.f27745h);
                }
                wm.this.a(geVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                b bVar = b.this;
                wm.this.b(bVar.f27764k);
                if (c.BIDDING == b.this.f27764k) {
                    z2 = wm.this.f27759v.get();
                    E = geVar2.T();
                } else {
                    z2 = wm.this.f27758u.get();
                    E = geVar2.E();
                }
                if (z2 || E == 0) {
                    if (b.this.b(geVar2)) {
                        geVar = geVar2;
                        geVar2 = wm.this.x;
                    } else {
                        geVar = wm.this.x;
                    }
                    wm.this.a(geVar2, geVar);
                    return;
                }
                wm.this.x = geVar2;
                if (E < 0) {
                    return;
                }
                b bVar2 = b.this;
                wm.this.f27760y = go.a(E, bVar2.f28216a, new mt(this, 3));
            }

            public /* synthetic */ void a() {
                wm wmVar = wm.this;
                wmVar.b(wmVar.x);
            }
        }

        private b(ge geVar, c cVar) {
            super(wm.this.f28217b, wm.this.f28216a, wm.this.f27745h);
            this.f27761h = this.f28217b + CertificateUtil.DELIMITER + cVar;
            this.f27762i = SystemClock.elapsedRealtime();
            this.f27763j = geVar;
            this.f27764k = cVar;
            this.f27765l = geVar.J() + 1;
            this.f27767n = geVar.N();
        }

        public void b(String str) {
        }

        public static /* synthetic */ int l(b bVar) {
            int i2 = bVar.f27767n;
            bVar.f27767n = i2 - 1;
            return i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f28218c;
                String str = this.f27761h;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f27766m ? "Retrying loading" : "Loading");
                sb.append(" ad ");
                sb.append(this.f27765l);
                sb.append(" of ");
                sb.append(wm.this.f27755r);
                sb.append(" from ");
                sb.append(this.f27763j.c());
                sb.append(" for ");
                sb.append(wm.this.f27746i);
                sb.append(" ad unit ");
                sb.append(wm.this.f27745h);
                nVar.a(str, sb.toString());
            }
            b("started to load ad");
            Context context = (Context) wm.this.f27749l.get();
            Activity n02 = context instanceof Activity ? (Activity) context : this.f28216a.n0();
            this.f28216a.T().b(this.f27763j);
            this.f28216a.Q().loadThirdPartyMediatedAd(wm.this.f27745h, this.f27763j, this.f27766m, n02, new a(wm.this.f27748k));
        }

        public boolean b(ge geVar) {
            if (wm.this.x == null) {
                return false;
            }
            if (geVar == null) {
                return true;
            }
            double O = wm.this.x.O();
            double O2 = geVar.O();
            return (O < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || O2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? wm.this.x.J() < geVar.J() : O > O2;
        }

        public /* synthetic */ b(wm wmVar, ge geVar, c cVar, a aVar) {
            this(geVar, cVar);
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        BIDDING,
        TAG
    }

    public wm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.j jVar, a.InterfaceC0085a interfaceC0085a) {
        super("TaskProcessMediationWaterfallV2", jVar, str);
        this.f27751n = new LinkedList();
        this.f27752o = new Object();
        this.f27753p = new LinkedList();
        this.f27754q = new Object();
        this.f27758u = new AtomicBoolean();
        this.f27759v = new AtomicBoolean();
        this.w = new AtomicBoolean();
        this.f27745h = str;
        this.f27746i = maxAdFormat;
        this.f27747j = jSONObject;
        this.f27748k = interfaceC0085a;
        this.f27749l = new WeakReference(context);
        this.f27750m = JsonUtils.getString(jSONObject, "mCode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            ge a2 = ge.a(i2, map, JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), jSONObject, jVar);
            if (a2.Z()) {
                this.f27753p.add(a2);
            } else {
                this.f27751n.add(a2);
            }
        }
        int size = this.f27753p.size() + this.f27751n.size();
        this.f27755r = size;
        this.f27757t = new ArrayList(size);
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f27756s = SystemClock.elapsedRealtime();
        if (this.f27747j.optBoolean("is_testing", false) && !this.f28216a.l0().c() && f27744z.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new mt(this, 20));
        }
        if (this.f27755r != 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Starting waterfall for " + this.f27746i.getLabel() + " ad unit " + this.f27745h + " with " + this.f27755r + " ad(s)...");
            }
            d(c.TAG);
            d(c.BIDDING);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.k(this.f28217b, "No ads were returned from the server for " + this.f27746i.getLabel() + " ad unit " + this.f27745h);
        }
        yp.a(this.f27745h, this.f27746i, this.f27747j, this.f28216a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f27747j, "settings", new JSONObject());
        long j2 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (af.a(this.f27747j, this.f27745h, this.f28216a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, android.support.v4.media.d.r(new StringBuilder("Ad Unit ID "), this.f27745h, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (yp.c(this.f28216a) && ((Boolean) this.f28216a.a(sj.s6)).booleanValue()) {
                j2 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j2 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j2);
        kw kwVar = new kw(0, this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            x1.a(millis, this.f28216a, kwVar);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(kwVar, millis);
        }
    }

    public boolean d(c cVar) {
        ge a2 = a(cVar);
        if (a2 == null) {
            b(cVar);
            return false;
        }
        this.f28216a.j0().a((yl) new b(a2, cVar), tm.b.MEDIATION);
        return true;
    }

    public /* synthetic */ void e() {
        yp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f28216a.n0());
    }

    private void f() {
        go goVar = this.f27760y;
        if (goVar == null) {
            return;
        }
        goVar.a();
        this.f27760y = null;
    }

    private void g() {
        a(this.f27751n);
        a(this.f27753p);
    }

    public ge c(c cVar) {
        return a(cVar, true);
    }

    public void b(ge geVar) {
        a(geVar, (ge) null);
    }

    public void b(c cVar) {
        if (c.BIDDING == cVar) {
            this.f27758u.compareAndSet(false, true);
        } else if (c.TAG == cVar) {
            this.f27759v.compareAndSet(false, true);
        }
    }

    private ge a(c cVar) {
        return a(cVar, false);
    }

    private ge a(c cVar, boolean z2) {
        Object poll;
        ge geVar;
        Object poll2;
        ge geVar2;
        if (cVar == c.BIDDING) {
            synchronized (this.f27754q) {
                try {
                    if (z2) {
                        poll2 = this.f27753p.peek();
                    } else {
                        poll2 = this.f27753p.poll();
                    }
                    geVar2 = (ge) poll2;
                } finally {
                }
            }
            return geVar2;
        }
        synchronized (this.f27752o) {
            try {
                if (z2) {
                    poll = this.f27751n.peek();
                } else {
                    poll = this.f27751n.poll();
                }
                geVar = (ge) poll;
            } finally {
            }
        }
        return geVar;
    }

    public void a(ge geVar, ge geVar2) {
        if (this.w.compareAndSet(false, true)) {
            f();
            g();
            this.f28216a.T().a(geVar, geVar2);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f27756s;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f28218c;
                String str = this.f28217b;
                StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Waterfall loaded in ", elapsedRealtime, "ms from ");
                r2.append(geVar.c());
                r2.append(" for ");
                r2.append(this.f27746i);
                r2.append(" ad unit ");
                r2.append(this.f27745h);
                nVar.d(str, r2.toString());
            }
            geVar.a(new MaxAdWaterfallInfoImpl(geVar, elapsedRealtime, this.f27757t, this.f27750m));
            gc.f(this.f27748k, geVar);
        }
    }

    /* renamed from: a */
    public void b(MaxError maxError) {
        int i2 = 0;
        if (this.w.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.f28216a.D().c(ca.f23257u);
            } else if (maxError.getCode() == -5001) {
                this.f28216a.D().c(ca.f23258v);
            } else {
                this.f28216a.D().c(ca.w);
            }
            ArrayList arrayList = new ArrayList(this.f27757t.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f27757t) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
                while (i2 < arrayList.size()) {
                    MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i2);
                    i2++;
                    sb.append(i2);
                    sb.append(") ");
                    sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                    sb.append("\n..code: ");
                    sb.append(maxNetworkResponseInfo2.getError().getCode());
                    sb.append("\n..message: ");
                    sb.append(maxNetworkResponseInfo2.getError().getMessage());
                    sb.append("\n");
                }
                ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f27756s;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f28218c;
                String str = this.f28217b;
                StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Waterfall failed in ", elapsedRealtime, "ms for ");
                r2.append(this.f27746i);
                r2.append(" ad unit ");
                r2.append(this.f27745h);
                r2.append(" with error: ");
                r2.append(maxError);
                nVar.d(str, r2.toString());
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f27747j, "waterfall_name", ""), JsonUtils.getString(this.f27747j, "waterfall_test_name", ""), elapsedRealtime, this.f27757t, JsonUtils.optList(JsonUtils.getJSONArray(this.f27747j, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f27750m));
            gc.a(this.f27748k, this.f27745h, maxError);
        }
    }

    public void a(ge geVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j2, MaxError maxError) {
        this.f27757t.add(new MaxNetworkResponseInfoImpl(adLoadState, af.a(geVar.b()), geVar.F(), geVar.Z(), j2, geVar.B(), maxError));
    }

    private void a(Queue queue) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            a((ge) it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
        }
    }
}
