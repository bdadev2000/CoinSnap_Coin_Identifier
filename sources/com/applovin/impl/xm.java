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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class xm extends yl {

    /* renamed from: q */
    private static final AtomicBoolean f27938q = new AtomicBoolean();

    /* renamed from: h */
    private final String f27939h;

    /* renamed from: i */
    private final MaxAdFormat f27940i;

    /* renamed from: j */
    private final JSONObject f27941j;

    /* renamed from: k */
    private final List f27942k;

    /* renamed from: l */
    private final a.InterfaceC0085a f27943l;

    /* renamed from: m */
    private final WeakReference f27944m;

    /* renamed from: n */
    private final String f27945n;

    /* renamed from: o */
    private long f27946o;

    /* renamed from: p */
    private final List f27947p;

    /* loaded from: classes4.dex */
    public class b extends yl {

        /* renamed from: h */
        private final long f27948h;

        /* renamed from: i */
        private final int f27949i;

        /* renamed from: j */
        private final ge f27950j;

        /* renamed from: k */
        private final List f27951k;

        /* renamed from: l */
        private boolean f27952l;

        /* renamed from: m */
        private int f27953m;

        /* loaded from: classes4.dex */
        public class a extends oe {
            public a(a.InterfaceC0085a interfaceC0085a) {
                super(interfaceC0085a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f27948h;
                com.applovin.impl.sdk.n unused = b.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = b.this.f28218c;
                    String str2 = b.this.f28217b;
                    StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Ad failed to load in ", elapsedRealtime, " ms for ");
                    r2.append(xm.this.f27940i.getLabel());
                    r2.append(" ad unit ");
                    r2.append(xm.this.f27939h);
                    r2.append(" with error: ");
                    r2.append(maxError);
                    nVar.a(str2, r2.toString());
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                if (b.this.f27953m > 0) {
                    if (!b.this.f28216a.a(ve.K7, String.valueOf(maxError.getCode()))) {
                        b.i(b.this);
                        b.this.f27952l = true;
                        b.this.f28216a.j0().a(b.this, tm.b.MEDIATION, b.this.f27950j.V());
                        return;
                    }
                    com.applovin.impl.sdk.n unused2 = b.this.f28218c;
                    if (com.applovin.impl.sdk.n.a()) {
                        b.this.f28218c.a(b.this.f28217b, "Ignoring failed ad load retry for error code " + maxError.getCode());
                    }
                }
                b bVar = b.this;
                bVar.a(bVar.f27950j, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (b.this.f27949i >= b.this.f27951k.size() - 1) {
                    xm.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f28216a.j0().a((yl) new b(bVar2.f27949i + 1, b.this.f27951k), tm.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f27948h;
                com.applovin.impl.sdk.n unused = b.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = b.this.f28218c;
                    String str = b.this.f28217b;
                    StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Ad loaded in ", elapsedRealtime, "ms for ");
                    r2.append(xm.this.f27940i.getLabel());
                    r2.append(" ad unit ");
                    r2.append(xm.this.f27939h);
                    nVar.a(str, r2.toString());
                }
                ge geVar = (ge) maxAd;
                b.this.a(geVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                int i2 = b.this.f27949i;
                while (true) {
                    i2++;
                    if (i2 >= b.this.f27951k.size()) {
                        xm.this.b(geVar);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((ge) bVar.f27951k.get(i2), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        private b(int i2, List list) {
            super(xm.this.f28217b, xm.this.f28216a, xm.this.f27939h);
            this.f27948h = SystemClock.elapsedRealtime();
            this.f27949i = i2;
            ge geVar = (ge) list.get(i2);
            this.f27950j = geVar;
            this.f27951k = list;
            this.f27953m = geVar.N();
        }

        public void b(String str) {
        }

        public static /* synthetic */ int i(b bVar) {
            int i2 = bVar.f27953m;
            bVar.f27953m = i2 - 1;
            return i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f28218c;
                String str = this.f28217b;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f27952l ? "Retrying loading" : "Loading");
                sb.append(" ad ");
                sb.append(this.f27949i + 1);
                sb.append(" of ");
                sb.append(this.f27951k.size());
                sb.append(" from ");
                sb.append(this.f27950j.c());
                sb.append(" for ");
                sb.append(xm.this.f27940i.getLabel());
                sb.append(" ad unit ");
                sb.append(xm.this.f27939h);
                nVar.a(str, sb.toString());
            }
            b("started to load ad");
            Context context = (Context) xm.this.f27944m.get();
            Activity n02 = context instanceof Activity ? (Activity) context : this.f28216a.n0();
            this.f28216a.T().b(this.f27950j);
            this.f28216a.Q().loadThirdPartyMediatedAd(xm.this.f27939h, this.f27950j, this.f27952l, n02, new a(xm.this.f27943l));
        }

        public /* synthetic */ b(xm xmVar, int i2, List list, a aVar) {
            this(i2, list);
        }

        public void a(ge geVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j2, MaxError maxError) {
            xm.this.f27947p.add(new MaxNetworkResponseInfoImpl(adLoadState, af.a(geVar.b()), geVar.F(), geVar.Z(), j2, geVar.B(), maxError));
        }
    }

    public xm(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.j jVar, a.InterfaceC0085a interfaceC0085a) {
        super("TaskProcessMediationWaterfall", jVar, str);
        this.f27939h = str;
        this.f27940i = maxAdFormat;
        this.f27941j = jSONObject;
        this.f27943l = interfaceC0085a;
        this.f27944m = new WeakReference(context);
        this.f27945n = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.f27942k = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.f27942k.add(ge.a(i2, map, JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), jSONObject, jVar));
        }
        this.f27947p = new ArrayList(this.f27942k.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f27946o = SystemClock.elapsedRealtime();
        if (this.f27941j.optBoolean("is_testing", false) && !this.f28216a.l0().c() && f27938q.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new mt(this, 22));
        }
        if (this.f27942k.size() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Starting waterfall for " + this.f27940i.getLabel() + " ad unit " + this.f27939h + " with " + this.f27942k.size() + " ad(s)...");
            }
            this.f28216a.j0().a(new b(0, this.f27942k));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.k(this.f28217b, "No ads were returned from the server for " + this.f27940i.getLabel() + " ad unit " + this.f27939h);
        }
        yp.a(this.f27939h, this.f27940i, this.f27941j, this.f28216a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f27941j, "settings", new JSONObject());
        long j2 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (af.a(this.f27941j, this.f27939h, this.f28216a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, android.support.v4.media.d.r(new StringBuilder("Ad Unit ID "), this.f27939h, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
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
        kw kwVar = new kw(4, this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            x1.a(millis, this.f28216a, kwVar);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(kwVar, millis);
        }
    }

    public void b(ge geVar) {
        this.f28216a.T().c(geVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f27946o;
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f28218c;
            String str = this.f28217b;
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Waterfall loaded in ", elapsedRealtime, "ms from ");
            r2.append(geVar.c());
            r2.append(" for ");
            r2.append(this.f27940i.getLabel());
            r2.append(" ad unit ");
            r2.append(this.f27939h);
            nVar.d(str, r2.toString());
        }
        geVar.a(new MaxAdWaterfallInfoImpl(geVar, elapsedRealtime, this.f27947p, this.f27945n));
        gc.f(this.f27943l, geVar);
    }

    public /* synthetic */ void e() {
        yp.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f28216a.n0());
    }

    /* renamed from: a */
    public void b(MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.f28216a.D().c(ca.f23257u);
        } else if (maxError.getCode() == -5001) {
            this.f28216a.D().c(ca.f23258v);
        } else {
            this.f28216a.D().c(ca.w);
        }
        ArrayList arrayList = new ArrayList(this.f27947p.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f27947p) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
            int i2 = 0;
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
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f27946o;
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f28218c;
            String str = this.f28217b;
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Waterfall failed in ", elapsedRealtime, "ms for ");
            r2.append(this.f27940i.getLabel());
            r2.append(" ad unit ");
            r2.append(this.f27939h);
            r2.append(" with error: ");
            r2.append(maxError);
            nVar.d(str, r2.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f27941j, "waterfall_name", ""), JsonUtils.getString(this.f27941j, "waterfall_test_name", ""), elapsedRealtime, this.f27947p, JsonUtils.optList(JsonUtils.getJSONArray(this.f27941j, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f27945n));
        gc.a(this.f27943l, this.f27939h, maxError);
    }
}
