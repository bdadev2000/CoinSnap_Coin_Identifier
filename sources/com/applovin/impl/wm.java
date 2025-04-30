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
import x0.AbstractC2914a;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public class wm extends xl {

    /* renamed from: q */
    private static final AtomicBoolean f12015q = new AtomicBoolean();

    /* renamed from: h */
    private final String f12016h;

    /* renamed from: i */
    private final MaxAdFormat f12017i;

    /* renamed from: j */
    private final JSONObject f12018j;

    /* renamed from: k */
    private final List f12019k;
    private final a.InterfaceC0023a l;
    private final WeakReference m;

    /* renamed from: n */
    private final String f12020n;

    /* renamed from: o */
    private long f12021o;

    /* renamed from: p */
    private final List f12022p;

    /* loaded from: classes.dex */
    public class a extends xl {

        /* renamed from: h */
        private final long f12023h;

        /* renamed from: i */
        private final int f12024i;

        /* renamed from: j */
        private final be f12025j;

        /* renamed from: k */
        private final List f12026k;

        /* renamed from: com.applovin.impl.wm$a$a */
        /* loaded from: classes.dex */
        public class C0041a extends je {
            public C0041a(a.InterfaceC0023a interfaceC0023a) {
                super(interfaceC0023a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f12023h;
                com.applovin.impl.sdk.t unused = a.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t tVar = a.this.f12279c;
                    String str2 = a.this.b;
                    StringBuilder a6 = AbstractC2933a.a("Ad failed to load in ", elapsedRealtime, " ms for ");
                    a6.append(wm.this.f12017i.getLabel());
                    a6.append(" ad unit ");
                    a6.append(wm.this.f12016h);
                    a6.append(" with error: ");
                    a6.append(maxError);
                    tVar.a(str2, a6.toString());
                }
                a.this.b("failed to load ad: " + maxError.getCode());
                a aVar = a.this;
                aVar.a(aVar.f12025j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (a.this.f12024i < a.this.f12026k.size() - 1) {
                    a aVar2 = a.this;
                    a.this.f12278a.l0().a((xl) new a(aVar2.f12024i + 1, a.this.f12026k), sm.b.MEDIATION);
                } else {
                    wm.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                a.this.b("loaded ad");
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f12023h;
                com.applovin.impl.sdk.t unused = a.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    com.applovin.impl.sdk.t tVar = a.this.f12279c;
                    String str = a.this.b;
                    StringBuilder a6 = AbstractC2933a.a("Ad loaded in ", elapsedRealtime, "ms for ");
                    a6.append(wm.this.f12017i.getLabel());
                    a6.append(" ad unit ");
                    a6.append(wm.this.f12016h);
                    tVar.a(str, a6.toString());
                }
                be beVar = (be) maxAd;
                a.this.a(beVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                int i9 = a.this.f12024i;
                while (true) {
                    i9++;
                    if (i9 >= a.this.f12026k.size()) {
                        wm.this.b(beVar);
                        return;
                    } else {
                        a aVar = a.this;
                        aVar.a((be) aVar.f12026k.get(i9), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        public a(int i9, List list) {
            super(wm.this.b, wm.this.f12278a, wm.this.f12016h);
            this.f12023h = SystemClock.elapsedRealtime();
            this.f12024i = i9;
            this.f12025j = (be) list.get(i9);
            this.f12026k = list;
        }

        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity p02;
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Loading ad " + (this.f12024i + 1) + " of " + this.f12026k.size() + " from " + this.f12025j.c() + " for " + wm.this.f12017i.getLabel() + " ad unit " + wm.this.f12016h);
            }
            b("started to load ad");
            Context context = (Context) wm.this.m.get();
            if (context instanceof Activity) {
                p02 = (Activity) context;
            } else {
                p02 = this.f12278a.p0();
            }
            this.f12278a.S().loadThirdPartyMediatedAd(wm.this.f12016h, this.f12025j, p02, new C0041a(wm.this.l));
        }

        public void a(be beVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j7, MaxError maxError) {
            wm.this.f12022p.add(new MaxNetworkResponseInfoImpl(adLoadState, new MaxMediatedNetworkInfoImpl(ve.b(beVar.b(), this.f12278a)), beVar.E(), beVar.W(), j7, beVar.A(), maxError));
        }
    }

    public wm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0023a interfaceC0023a) {
        super("TaskProcessMediationWaterfall", kVar, str);
        this.f12016h = str;
        this.f12017i = maxAdFormat;
        this.f12018j = jSONObject;
        this.l = interfaceC0023a;
        this.m = new WeakReference(context);
        this.f12020n = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        this.f12019k = new ArrayList(jSONArray.length());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            this.f12019k.add(be.a(i9, map, JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null), jSONObject, kVar));
        }
        this.f12022p = new ArrayList(this.f12019k.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f12021o = SystemClock.elapsedRealtime();
        if (this.f12018j.optBoolean("is_testing", false) && !this.f12278a.n0().c() && f12015q.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new F0(this, 21));
        }
        if (this.f12019k.size() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Starting waterfall for " + this.f12017i.getLabel() + " ad unit " + this.f12016h + " with " + this.f12019k.size() + " ad(s)...");
            }
            this.f12278a.l0().a(new a(0, this.f12019k));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.k(this.b, "No ads were returned from the server for " + this.f12017i.getLabel() + " ad unit " + this.f12016h);
        }
        zp.a(this.f12016h, this.f12017i, this.f12018j, this.f12278a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f12018j, "settings", new JSONObject());
        long j7 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (ve.a(this.f12018j, this.f12016h, this.f12278a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, AbstractC2914a.h(new StringBuilder("Ad Unit ID "), this.f12016h, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (zp.c(this.f12278a) && ((Boolean) this.f12278a.a(oj.f9821o6)).booleanValue()) {
                j7 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j7 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j7);
            P2 p2 = new P2(2, this, maxErrorImpl);
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                C0771w1.a(millis, this.f12278a, p2);
                return;
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(p2, millis);
                return;
            }
        }
        b(maxErrorImpl);
    }

    public void b(be beVar) {
        this.f12278a.V().b(beVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12021o;
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f12279c;
            String str = this.b;
            StringBuilder a6 = AbstractC2933a.a("Waterfall loaded in ", elapsedRealtime, "ms from ");
            a6.append(beVar.c());
            a6.append(" for ");
            a6.append(this.f12017i.getLabel());
            a6.append(" ad unit ");
            a6.append(this.f12016h);
            tVar.d(str, a6.toString());
        }
        beVar.a(new MaxAdWaterfallInfoImpl(beVar, elapsedRealtime, this.f12022p, this.f12020n));
        bc.f(this.l, beVar);
    }

    public /* synthetic */ void e() {
        zp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f12278a.p0());
    }

    /* renamed from: a */
    public void b(MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.f12278a.F().c(aa.f6611u);
        } else if (maxError.getCode() == -5001) {
            this.f12278a.F().c(aa.f6612v);
        } else {
            this.f12278a.F().c(aa.f6613w);
        }
        ArrayList arrayList = new ArrayList(this.f12022p.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f12022p) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
            int i9 = 0;
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
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12021o;
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t tVar = this.f12279c;
            String str = this.b;
            StringBuilder a6 = AbstractC2933a.a("Waterfall failed in ", elapsedRealtime, "ms for ");
            a6.append(this.f12017i.getLabel());
            a6.append(" ad unit ");
            a6.append(this.f12016h);
            a6.append(" with error: ");
            a6.append(maxError);
            tVar.d(str, a6.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f12018j, "waterfall_name", ""), JsonUtils.getString(this.f12018j, "waterfall_test_name", ""), elapsedRealtime, this.f12022p, JsonUtils.optList(JsonUtils.getJSONArray(this.f12018j, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f12020n));
        bc.a(this.l, this.f12016h, maxError);
    }
}
