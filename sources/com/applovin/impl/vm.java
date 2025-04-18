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

/* loaded from: classes.dex */
public class vm extends xl {

    /* renamed from: z */
    private static final AtomicBoolean f8540z = new AtomicBoolean();

    /* renamed from: h */
    private final String f8541h;

    /* renamed from: i */
    private final MaxAdFormat f8542i;

    /* renamed from: j */
    private final JSONObject f8543j;

    /* renamed from: k */
    private final a.InterfaceC0023a f8544k;

    /* renamed from: l */
    private final WeakReference f8545l;

    /* renamed from: m */
    private final String f8546m;

    /* renamed from: n */
    private final Queue f8547n;

    /* renamed from: o */
    private final Object f8548o;

    /* renamed from: p */
    private final Queue f8549p;

    /* renamed from: q */
    private final Object f8550q;

    /* renamed from: r */
    private final int f8551r;

    /* renamed from: s */
    private long f8552s;

    /* renamed from: t */
    private final List f8553t;
    private final AtomicBoolean u;

    /* renamed from: v */
    private final AtomicBoolean f8554v;

    /* renamed from: w */
    private final AtomicBoolean f8555w;

    /* renamed from: x */
    private be f8556x;

    /* renamed from: y */
    private ho f8557y;

    /* loaded from: classes.dex */
    public class b extends xl {

        /* renamed from: h */
        private final String f8558h;

        /* renamed from: i */
        private final long f8559i;

        /* renamed from: j */
        private final be f8560j;

        /* renamed from: k */
        private final c f8561k;

        /* renamed from: l */
        private final int f8562l;

        /* loaded from: classes.dex */
        public class a extends je {
            public a(a.InterfaceC0023a interfaceC0023a) {
                super(interfaceC0023a);
            }

            public static /* synthetic */ void a(a aVar) {
                aVar.a();
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f8559i;
                com.applovin.impl.sdk.t unused = b.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    b.this.f9061c.a(b.this.f8558h, "Ad (" + b.this.f8562l + ") failed to load in " + elapsedRealtime + "ms for " + vm.this.f8542i + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                vm.this.a(bVar.f8560j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (vm.this.f8555w.get()) {
                    return;
                }
                if (vm.this.f8556x != null) {
                    b bVar2 = b.this;
                    if (b.this.b(vm.this.c(bVar2.f8561k))) {
                        vm vmVar = vm.this;
                        vmVar.b(vmVar.f8556x);
                        return;
                    }
                }
                b bVar3 = b.this;
                if ((!vm.this.d(bVar3.f8561k)) && vm.this.f8554v.get() && vm.this.u.get()) {
                    vm.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                boolean z10;
                long D;
                be beVar;
                b.this.b("loaded ad");
                be beVar2 = (be) maxAd;
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f8559i;
                com.applovin.impl.sdk.t unused = b.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    b.this.f9061c.a(b.this.f8558h, "Ad (" + b.this.f8562l + ") loaded in " + elapsedRealtime + "ms for " + vm.this.f8542i + " ad unit " + vm.this.f8541h);
                }
                vm.this.a(beVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                b bVar = b.this;
                vm.this.b(bVar.f8561k);
                if (c.BIDDING == b.this.f8561k) {
                    z10 = vm.this.f8554v.get();
                    D = beVar2.R();
                } else {
                    z10 = vm.this.u.get();
                    D = beVar2.D();
                }
                if (!z10 && D != 0) {
                    vm.this.f8556x = beVar2;
                    if (D < 0) {
                        return;
                    }
                    b bVar2 = b.this;
                    vm.this.f8557y = ho.a(D, bVar2.a, new nt(this, 3));
                    return;
                }
                if (b.this.b(beVar2)) {
                    beVar = beVar2;
                    beVar2 = vm.this.f8556x;
                } else {
                    beVar = vm.this.f8556x;
                }
                vm.this.a(beVar2, beVar);
            }

            public /* synthetic */ void a() {
                vm vmVar = vm.this;
                vmVar.b(vmVar.f8556x);
            }
        }

        private b(be beVar, c cVar) {
            super(vm.this.f9060b, vm.this.a, vm.this.f8541h);
            this.f8558h = this.f9060b + ":" + cVar;
            this.f8559i = SystemClock.elapsedRealtime();
            this.f8560j = beVar;
            this.f8561k = cVar;
            this.f8562l = beVar.I() + 1;
        }

        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity p02;
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f8558h, "Loading ad " + this.f8562l + " of " + vm.this.f8551r + " from " + this.f8560j.c() + " for " + vm.this.f8542i + " ad unit " + vm.this.f8541h);
            }
            b("started to load ad");
            Context context = (Context) vm.this.f8545l.get();
            if (context instanceof Activity) {
                p02 = (Activity) context;
            } else {
                p02 = this.a.p0();
            }
            this.a.S().loadThirdPartyMediatedAd(vm.this.f8541h, this.f8560j, p02, new a(vm.this.f8544k));
        }

        public boolean b(be beVar) {
            if (vm.this.f8556x == null) {
                return false;
            }
            if (beVar == null) {
                return true;
            }
            double M = vm.this.f8556x.M();
            double M2 = beVar.M();
            return (M < 0.0d || M2 < 0.0d) ? vm.this.f8556x.I() < beVar.I() : M > M2;
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
        this.f8547n = new LinkedList();
        this.f8548o = new Object();
        this.f8549p = new LinkedList();
        this.f8550q = new Object();
        this.u = new AtomicBoolean();
        this.f8554v = new AtomicBoolean();
        this.f8555w = new AtomicBoolean();
        this.f8541h = str;
        this.f8542i = maxAdFormat;
        this.f8543j = jSONObject;
        this.f8544k = interfaceC0023a;
        this.f8545l = new WeakReference(context);
        this.f8546m = JsonUtils.getString(jSONObject, "mCode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            be a10 = be.a(i10, map, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, kVar);
            if (a10.W()) {
                this.f8549p.add(a10);
            } else {
                this.f8547n.add(a10);
            }
        }
        int size = this.f8549p.size() + this.f8547n.size();
        this.f8551r = size;
        this.f8553t = new ArrayList(size);
    }

    public static /* synthetic */ void e(vm vmVar, MaxError maxError) {
        vmVar.b(maxError);
    }

    public static /* synthetic */ void l(vm vmVar) {
        vmVar.e();
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f8552s = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f8543j.optBoolean("is_testing", false) && !this.a.n0().c() && f8540z.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new nt(this, 20));
        }
        if (this.f8551r == 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.k(this.f9060b, "No ads were returned from the server for " + this.f8542i.getLabel() + " ad unit " + this.f8541h);
            }
            zp.a(this.f8541h, this.f8542i, this.f8543j, this.a);
            JSONObject jSONObject = JsonUtils.getJSONObject(this.f8543j, "settings", new JSONObject());
            long j3 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
            if (ve.a(this.f8543j, this.f8541h, this.a)) {
                maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, vd.e.h(new StringBuilder("Ad Unit ID "), this.f8541h, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
                if (zp.c(this.a) && ((Boolean) this.a.a(oj.f6726o6)).booleanValue()) {
                    j3 = 0;
                }
            } else {
                maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
            }
            if (j3 > 0) {
                long millis = TimeUnit.SECONDS.toMillis(j3);
                zv zvVar = new zv(i10, this, maxErrorImpl);
                if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                    w1.a(millis, this.a, zvVar);
                    return;
                } else {
                    AppLovinSdkUtils.runOnUiThreadDelayed(zvVar, millis);
                    return;
                }
            }
            b(maxErrorImpl);
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Starting waterfall for " + this.f8542i.getLabel() + " ad unit " + this.f8541h + " with " + this.f8551r + " ad(s)...");
        }
        d(c.TAG);
        d(c.BIDDING);
    }

    public boolean d(c cVar) {
        be a10 = a(cVar);
        if (a10 == null) {
            b(cVar);
            return false;
        }
        this.a.l0().a((xl) new b(a10, cVar), sm.b.MEDIATION);
        return true;
    }

    private void f() {
        ho hoVar = this.f8557y;
        if (hoVar == null) {
            return;
        }
        hoVar.a();
        this.f8557y = null;
    }

    private void g() {
        a(this.f8547n);
        a(this.f8549p);
    }

    public be c(c cVar) {
        return a(cVar, true);
    }

    public /* synthetic */ void e() {
        zp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.a.p0());
    }

    public void b(be beVar) {
        a(beVar, (be) null);
    }

    public void b(c cVar) {
        if (c.BIDDING == cVar) {
            this.u.compareAndSet(false, true);
        } else if (c.TAG == cVar) {
            this.f8554v.compareAndSet(false, true);
        }
    }

    private be a(c cVar) {
        return a(cVar, false);
    }

    private be a(c cVar, boolean z10) {
        Object poll;
        be beVar;
        Object poll2;
        be beVar2;
        if (cVar == c.BIDDING) {
            synchronized (this.f8550q) {
                if (z10) {
                    poll2 = this.f8549p.peek();
                } else {
                    poll2 = this.f8549p.poll();
                }
                beVar2 = (be) poll2;
            }
            return beVar2;
        }
        synchronized (this.f8548o) {
            if (z10) {
                poll = this.f8547n.peek();
            } else {
                poll = this.f8547n.poll();
            }
            beVar = (be) poll;
        }
        return beVar;
    }

    public void a(be beVar, be beVar2) {
        if (this.f8555w.compareAndSet(false, true)) {
            f();
            g();
            this.a.V().a(beVar, beVar2);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8552s;
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f9061c;
                String str = this.f9060b;
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Waterfall loaded in ", elapsedRealtime, "ms from ");
                o10.append(beVar.c());
                o10.append(" for ");
                o10.append(this.f8542i);
                o10.append(" ad unit ");
                o10.append(this.f8541h);
                tVar.d(str, o10.toString());
            }
            beVar.a(new MaxAdWaterfallInfoImpl(beVar, elapsedRealtime, this.f8553t, this.f8546m));
            bc.f(this.f8544k, beVar);
        }
    }

    /* renamed from: a */
    public void b(MaxError maxError) {
        int i10 = 0;
        if (this.f8555w.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.a.F().c(aa.u);
            } else if (maxError.getCode() == -5001) {
                this.a.F().c(aa.f3631v);
            } else {
                this.a.F().c(aa.f3632w);
            }
            ArrayList arrayList = new ArrayList(this.f8553t.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f8553t) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======\n");
                while (i10 < arrayList.size()) {
                    MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                    i10++;
                    sb2.append(i10);
                    sb2.append(") ");
                    sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                    sb2.append("\n..code: ");
                    sb2.append(maxNetworkResponseInfo2.getError().getCode());
                    sb2.append("\n..message: ");
                    sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                    sb2.append("\n");
                }
                ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8552s;
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f9061c;
                String str = this.f9060b;
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Waterfall failed in ", elapsedRealtime, "ms for ");
                o10.append(this.f8542i);
                o10.append(" ad unit ");
                o10.append(this.f8541h);
                o10.append(" with error: ");
                o10.append(maxError);
                tVar.d(str, o10.toString());
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f8543j, "waterfall_name", ""), JsonUtils.getString(this.f8543j, "waterfall_test_name", ""), elapsedRealtime, this.f8553t, JsonUtils.optList(JsonUtils.getJSONArray(this.f8543j, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f8546m));
            bc.a(this.f8544k, this.f8541h, maxError);
        }
    }

    public void a(be beVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j3, MaxError maxError) {
        this.f8553t.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(ve.b(beVar.b(), this.a)), beVar.E(), beVar.W(), j3, beVar.A(), maxError));
    }

    private void a(Queue queue) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            a((be) it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
        }
    }
}
