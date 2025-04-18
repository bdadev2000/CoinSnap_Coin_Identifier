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
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wm extends xl {

    /* renamed from: q */
    private static final AtomicBoolean f8801q = new AtomicBoolean();

    /* renamed from: h */
    private final String f8802h;

    /* renamed from: i */
    private final MaxAdFormat f8803i;

    /* renamed from: j */
    private final JSONObject f8804j;

    /* renamed from: k */
    private final List f8805k;

    /* renamed from: l */
    private final a.InterfaceC0023a f8806l;

    /* renamed from: m */
    private final WeakReference f8807m;

    /* renamed from: n */
    private final String f8808n;

    /* renamed from: o */
    private long f8809o;

    /* renamed from: p */
    private final List f8810p;

    /* loaded from: classes.dex */
    public class a extends xl {

        /* renamed from: h */
        private final long f8811h;

        /* renamed from: i */
        private final int f8812i;

        /* renamed from: j */
        private final be f8813j;

        /* renamed from: k */
        private final List f8814k;

        /* renamed from: com.applovin.impl.wm$a$a */
        /* loaded from: classes.dex */
        public class C0041a extends je {
            public C0041a(a.InterfaceC0023a interfaceC0023a) {
                super(interfaceC0023a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f8811h;
                com.applovin.impl.sdk.t unused = a.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t tVar = a.this.f9061c;
                    String str2 = a.this.f9060b;
                    StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Ad failed to load in ", elapsedRealtime, " ms for ");
                    o10.append(wm.this.f8803i.getLabel());
                    o10.append(" ad unit ");
                    o10.append(wm.this.f8802h);
                    o10.append(" with error: ");
                    o10.append(maxError);
                    tVar.a(str2, o10.toString());
                }
                a.this.b("failed to load ad: " + maxError.getCode());
                a aVar = a.this;
                aVar.a(aVar.f8813j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (a.this.f8812i < a.this.f8814k.size() - 1) {
                    a aVar2 = a.this;
                    a.this.a.l0().a((xl) new a(aVar2.f8812i + 1, a.this.f8814k), sm.b.MEDIATION);
                } else {
                    wm.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                a.this.b("loaded ad");
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f8811h;
                com.applovin.impl.sdk.t unused = a.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t tVar = a.this.f9061c;
                    String str = a.this.f9060b;
                    StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Ad loaded in ", elapsedRealtime, "ms for ");
                    o10.append(wm.this.f8803i.getLabel());
                    o10.append(" ad unit ");
                    o10.append(wm.this.f8802h);
                    tVar.a(str, o10.toString());
                }
                be beVar = (be) maxAd;
                a.this.a(beVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                int i10 = a.this.f8812i;
                while (true) {
                    i10++;
                    if (i10 >= a.this.f8814k.size()) {
                        wm.this.b(beVar);
                        return;
                    } else {
                        a aVar = a.this;
                        aVar.a((be) aVar.f8814k.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        public a(int i10, List list) {
            super(wm.this.f9060b, wm.this.a, wm.this.f8802h);
            this.f8811h = SystemClock.elapsedRealtime();
            this.f8812i = i10;
            this.f8813j = (be) list.get(i10);
            this.f8814k = list;
        }

        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity p02;
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Loading ad " + (this.f8812i + 1) + " of " + this.f8814k.size() + " from " + this.f8813j.c() + " for " + wm.this.f8803i.getLabel() + " ad unit " + wm.this.f8802h);
            }
            b("started to load ad");
            Context context = (Context) wm.this.f8807m.get();
            if (context instanceof Activity) {
                p02 = (Activity) context;
            } else {
                p02 = this.a.p0();
            }
            this.a.S().loadThirdPartyMediatedAd(wm.this.f8802h, this.f8813j, p02, new C0041a(wm.this.f8806l));
        }

        public void a(be beVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j3, MaxError maxError) {
            wm.this.f8810p.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(ve.b(beVar.b(), this.a)), beVar.E(), beVar.W(), j3, beVar.A(), maxError));
        }
    }

    public wm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0023a interfaceC0023a) {
        super("TaskProcessMediationWaterfall", kVar, str);
        this.f8802h = str;
        this.f8803i = maxAdFormat;
        this.f8804j = jSONObject;
        this.f8806l = interfaceC0023a;
        this.f8807m = new WeakReference(context);
        this.f8808n = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        this.f8805k = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f8805k.add(be.a(i10, map, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, kVar));
        }
        this.f8810p = new ArrayList(this.f8805k.size());
    }

    public static /* synthetic */ void h(wm wmVar) {
        wmVar.e();
    }

    public static /* synthetic */ void i(wm wmVar, MaxError maxError) {
        wmVar.b(maxError);
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f8809o = SystemClock.elapsedRealtime();
        if (this.f8804j.optBoolean("is_testing", false) && !this.a.n0().c() && f8801q.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new nt(this, 21));
        }
        if (this.f8805k.size() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Starting waterfall for " + this.f8803i.getLabel() + " ad unit " + this.f8802h + " with " + this.f8805k.size() + " ad(s)...");
            }
            this.a.l0().a(new a(0, this.f8805k));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.k(this.f9060b, "No ads were returned from the server for " + this.f8803i.getLabel() + " ad unit " + this.f8802h);
        }
        zp.a(this.f8802h, this.f8803i, this.f8804j, this.a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8804j, "settings", new JSONObject());
        long j3 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (ve.a(this.f8804j, this.f8802h, this.a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, vd.e.h(new StringBuilder("Ad Unit ID "), this.f8802h, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (zp.c(this.a) && ((Boolean) this.a.a(oj.f6726o6)).booleanValue()) {
                j3 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j3 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j3);
            zv zvVar = new zv(2, this, maxErrorImpl);
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                w1.a(millis, this.a, zvVar);
                return;
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(zvVar, millis);
                return;
            }
        }
        b(maxErrorImpl);
    }

    public void b(be beVar) {
        this.a.V().b(beVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8809o;
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f9061c;
            String str = this.f9060b;
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Waterfall loaded in ", elapsedRealtime, "ms from ");
            o10.append(beVar.c());
            o10.append(" for ");
            o10.append(this.f8803i.getLabel());
            o10.append(" ad unit ");
            o10.append(this.f8802h);
            tVar.d(str, o10.toString());
        }
        beVar.a(new MaxAdWaterfallInfoImpl(beVar, elapsedRealtime, this.f8810p, this.f8808n));
        bc.f(this.f8806l, beVar);
    }

    public /* synthetic */ void e() {
        zp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.a.p0());
    }

    /* renamed from: a */
    public void b(MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.a.F().c(aa.u);
        } else if (maxError.getCode() == -5001) {
            this.a.F().c(aa.f3631v);
        } else {
            this.a.F().c(aa.f3632w);
        }
        ArrayList arrayList = new ArrayList(this.f8810p.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f8810p) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======\n");
            int i10 = 0;
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
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8809o;
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f9061c;
            String str = this.f9060b;
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Waterfall failed in ", elapsedRealtime, "ms for ");
            o10.append(this.f8803i.getLabel());
            o10.append(" ad unit ");
            o10.append(this.f8802h);
            o10.append(" with error: ");
            o10.append(maxError);
            tVar.d(str, o10.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f8804j, "waterfall_name", ""), JsonUtils.getString(this.f8804j, "waterfall_test_name", ""), elapsedRealtime, this.f8810p, JsonUtils.optList(JsonUtils.getJSONArray(this.f8804j, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f8808n));
        bc.a(this.f8806l, this.f8802h, maxError);
    }
}
