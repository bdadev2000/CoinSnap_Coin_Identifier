package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
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
import x0.AbstractC2914a;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public class vm extends xl {

    /* renamed from: z */
    private static final AtomicBoolean f11762z = new AtomicBoolean();

    /* renamed from: h */
    private final String f11763h;

    /* renamed from: i */
    private final MaxAdFormat f11764i;

    /* renamed from: j */
    private final JSONObject f11765j;

    /* renamed from: k */
    private final a.InterfaceC0023a f11766k;
    private final WeakReference l;
    private final String m;

    /* renamed from: n */
    private final Queue f11767n;

    /* renamed from: o */
    private final Object f11768o;

    /* renamed from: p */
    private final Queue f11769p;

    /* renamed from: q */
    private final Object f11770q;

    /* renamed from: r */
    private final int f11771r;

    /* renamed from: s */
    private long f11772s;

    /* renamed from: t */
    private final List f11773t;

    /* renamed from: u */
    private final AtomicBoolean f11774u;

    /* renamed from: v */
    private final AtomicBoolean f11775v;

    /* renamed from: w */
    private final AtomicBoolean f11776w;

    /* renamed from: x */
    private be f11777x;

    /* renamed from: y */
    private ho f11778y;

    /* loaded from: classes.dex */
    public class b extends xl {

        /* renamed from: h */
        private final String f11779h;

        /* renamed from: i */
        private final long f11780i;

        /* renamed from: j */
        private final be f11781j;

        /* renamed from: k */
        private final c f11782k;
        private final int l;

        /* loaded from: classes.dex */
        public class a extends je {
            public a(a.InterfaceC0023a interfaceC0023a) {
                super(interfaceC0023a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f11780i;
                com.applovin.impl.sdk.t unused = b.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    b.this.f12279c.a(b.this.f11779h, "Ad (" + b.this.l + ") failed to load in " + elapsedRealtime + "ms for " + vm.this.f11764i + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                vm.this.a(bVar.f11781j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (vm.this.f11776w.get()) {
                    return;
                }
                if (vm.this.f11777x != null) {
                    b bVar2 = b.this;
                    if (b.this.b(vm.this.c(bVar2.f11782k))) {
                        vm vmVar = vm.this;
                        vmVar.b(vmVar.f11777x);
                        return;
                    }
                }
                b bVar3 = b.this;
                if ((!vm.this.d(bVar3.f11782k)) && vm.this.f11775v.get() && vm.this.f11774u.get()) {
                    vm.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                boolean z8;
                long D8;
                be beVar;
                b.this.b("loaded ad");
                be beVar2 = (be) maxAd;
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f11780i;
                com.applovin.impl.sdk.t unused = b.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    b.this.f12279c.a(b.this.f11779h, "Ad (" + b.this.l + ") loaded in " + elapsedRealtime + "ms for " + vm.this.f11764i + " ad unit " + vm.this.f11763h);
                }
                vm.this.a(beVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                b bVar = b.this;
                vm.this.b(bVar.f11782k);
                if (c.BIDDING == b.this.f11782k) {
                    z8 = vm.this.f11775v.get();
                    D8 = beVar2.R();
                } else {
                    z8 = vm.this.f11774u.get();
                    D8 = beVar2.D();
                }
                if (!z8 && D8 != 0) {
                    vm.this.f11777x = beVar2;
                    if (D8 < 0) {
                        return;
                    }
                    b bVar2 = b.this;
                    vm.this.f11778y = ho.a(D8, bVar2.f12278a, new F0(this, 3));
                    return;
                }
                if (b.this.b(beVar2)) {
                    beVar = beVar2;
                    beVar2 = vm.this.f11777x;
                } else {
                    beVar = vm.this.f11777x;
                }
                vm.this.a(beVar2, beVar);
            }

            public /* synthetic */ void a() {
                vm vmVar = vm.this;
                vmVar.b(vmVar.f11777x);
            }
        }

        private b(be beVar, c cVar) {
            super(vm.this.b, vm.this.f12278a, vm.this.f11763h);
            this.f11779h = this.b + ":" + cVar;
            this.f11780i = SystemClock.elapsedRealtime();
            this.f11781j = beVar;
            this.f11782k = cVar;
            this.l = beVar.I() + 1;
        }

        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity p02;
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.f11779h, "Loading ad " + this.l + " of " + vm.this.f11771r + " from " + this.f11781j.c() + " for " + vm.this.f11764i + " ad unit " + vm.this.f11763h);
            }
            b("started to load ad");
            Context context = (Context) vm.this.l.get();
            if (context instanceof Activity) {
                p02 = (Activity) context;
            } else {
                p02 = this.f12278a.p0();
            }
            this.f12278a.S().loadThirdPartyMediatedAd(vm.this.f11763h, this.f11781j, p02, new a(vm.this.f11766k));
        }

        public boolean b(be beVar) {
            if (vm.this.f11777x == null) {
                return false;
            }
            if (beVar == null) {
                return true;
            }
            double M8 = vm.this.f11777x.M();
            double M9 = beVar.M();
            return (M8 < 0.0d || M9 < 0.0d) ? vm.this.f11777x.I() < beVar.I() : M8 > M9;
        }

        public /* synthetic */ b(vm vmVar, be beVar, c cVar, a aVar) {
            this(beVar, cVar);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        BIDDING,
        TAG
    }

    public vm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0023a interfaceC0023a) {
        super("TaskProcessMediationWaterfallV2", kVar, str);
        this.f11767n = new LinkedList();
        this.f11768o = new Object();
        this.f11769p = new LinkedList();
        this.f11770q = new Object();
        this.f11774u = new AtomicBoolean();
        this.f11775v = new AtomicBoolean();
        this.f11776w = new AtomicBoolean();
        this.f11763h = str;
        this.f11764i = maxAdFormat;
        this.f11765j = jSONObject;
        this.f11766k = interfaceC0023a;
        this.l = new WeakReference(context);
        this.m = JsonUtils.getString(jSONObject, "mCode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            be a6 = be.a(i9, map, JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null), jSONObject, kVar);
            if (a6.W()) {
                this.f11769p.add(a6);
            } else {
                this.f11767n.add(a6);
            }
        }
        int size = this.f11769p.size() + this.f11767n.size();
        this.f11771r = size;
        this.f11773t = new ArrayList(size);
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f11772s = SystemClock.elapsedRealtime();
        if (this.f11765j.optBoolean("is_testing", false) && !this.f12278a.n0().c() && f11762z.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new F0(this, 20));
        }
        if (this.f11771r == 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.k(this.b, "No ads were returned from the server for " + this.f11764i.getLabel() + " ad unit " + this.f11763h);
            }
            zp.a(this.f11763h, this.f11764i, this.f11765j, this.f12278a);
            JSONObject jSONObject = JsonUtils.getJSONObject(this.f11765j, "settings", new JSONObject());
            long j7 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
            if (ve.a(this.f11765j, this.f11763h, this.f12278a)) {
                maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, AbstractC2914a.h(new StringBuilder("Ad Unit ID "), this.f11763h, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
                if (zp.c(this.f12278a) && ((Boolean) this.f12278a.a(oj.f9821o6)).booleanValue()) {
                    j7 = 0;
                }
            } else {
                maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
            }
            if (j7 > 0) {
                long millis = TimeUnit.SECONDS.toMillis(j7);
                P2 p2 = new P2(0, this, maxErrorImpl);
                if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                    C0771w1.a(millis, this.f12278a, p2);
                    return;
                } else {
                    AppLovinSdkUtils.runOnUiThreadDelayed(p2, millis);
                    return;
                }
            }
            b(maxErrorImpl);
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Starting waterfall for " + this.f11764i.getLabel() + " ad unit " + this.f11763h + " with " + this.f11771r + " ad(s)...");
        }
        d(c.TAG);
        d(c.BIDDING);
    }

    public boolean d(c cVar) {
        be a6 = a(cVar);
        if (a6 == null) {
            b(cVar);
            return false;
        }
        this.f12278a.l0().a((xl) new b(a6, cVar), sm.b.MEDIATION);
        return true;
    }

    private void f() {
        ho hoVar = this.f11778y;
        if (hoVar == null) {
            return;
        }
        hoVar.a();
        this.f11778y = null;
    }

    private void g() {
        a(this.f11767n);
        a(this.f11769p);
    }

    public be c(c cVar) {
        return a(cVar, true);
    }

    public /* synthetic */ void e() {
        zp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f12278a.p0());
    }

    public void b(be beVar) {
        a(beVar, (be) null);
    }

    public void b(c cVar) {
        if (c.BIDDING == cVar) {
            this.f11774u.compareAndSet(false, true);
        } else if (c.TAG == cVar) {
            this.f11775v.compareAndSet(false, true);
        }
    }

    private be a(c cVar) {
        return a(cVar, false);
    }

    private be a(c cVar, boolean z8) {
        Object poll;
        be beVar;
        Object poll2;
        be beVar2;
        if (cVar == c.BIDDING) {
            synchronized (this.f11770q) {
                try {
                    if (z8) {
                        poll2 = this.f11769p.peek();
                    } else {
                        poll2 = this.f11769p.poll();
                    }
                    beVar2 = (be) poll2;
                } finally {
                }
            }
            return beVar2;
        }
        synchronized (this.f11768o) {
            try {
                if (z8) {
                    poll = this.f11767n.peek();
                } else {
                    poll = this.f11767n.poll();
                }
                beVar = (be) poll;
            } finally {
            }
        }
        return beVar;
    }

    public void a(be beVar, be beVar2) {
        if (this.f11776w.compareAndSet(false, true)) {
            f();
            g();
            this.f12278a.V().a(beVar, beVar2);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11772s;
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f12279c;
                String str = this.b;
                StringBuilder a6 = AbstractC2933a.a("Waterfall loaded in ", elapsedRealtime, "ms from ");
                a6.append(beVar.c());
                a6.append(" for ");
                a6.append(this.f11764i);
                a6.append(" ad unit ");
                a6.append(this.f11763h);
                tVar.d(str, a6.toString());
            }
            beVar.a(new MaxAdWaterfallInfoImpl(beVar, elapsedRealtime, this.f11773t, this.m));
            bc.f(this.f11766k, beVar);
        }
    }

    /* renamed from: a */
    public void b(MaxError maxError) {
        int i9 = 0;
        if (this.f11776w.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.f12278a.F().c(aa.f6611u);
            } else if (maxError.getCode() == -5001) {
                this.f12278a.F().c(aa.f6612v);
            } else {
                this.f12278a.F().c(aa.f6613w);
            }
            ArrayList arrayList = new ArrayList(this.f11773t.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f11773t) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
                while (i9 < arrayList.size()) {
                    MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i9);
                    i9++;
                    sb.append(i9);
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
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11772s;
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f12279c;
                String str = this.b;
                StringBuilder a6 = AbstractC2933a.a("Waterfall failed in ", elapsedRealtime, "ms for ");
                a6.append(this.f11764i);
                a6.append(" ad unit ");
                a6.append(this.f11763h);
                a6.append(" with error: ");
                a6.append(maxError);
                tVar.d(str, a6.toString());
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f11765j, "waterfall_name", ""), JsonUtils.getString(this.f11765j, "waterfall_test_name", ""), elapsedRealtime, this.f11773t, JsonUtils.optList(JsonUtils.getJSONArray(this.f11765j, "mwf_info_urls", null), Collections.EMPTY_LIST), this.m));
            bc.a(this.f11766k, this.f11763h, maxError);
        }
    }

    public void a(be beVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j7, MaxError maxError) {
        this.f11773t.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(ve.b(beVar.b(), this.f12278a)), beVar.E(), beVar.W(), j7, beVar.A(), maxError));
    }

    private void a(Queue queue) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            a((be) it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
        }
    }
}
