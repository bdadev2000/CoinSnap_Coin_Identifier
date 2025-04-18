package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.vj;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class em extends xl {

    /* renamed from: m */
    private static JSONObject f4483m;

    /* renamed from: n */
    private static final Object f4484n = new Object();

    /* renamed from: o */
    private static final Map f4485o = a4.j.r();

    /* renamed from: h */
    private final String f4486h;

    /* renamed from: i */
    private final MaxAdFormat f4487i;

    /* renamed from: j */
    private final Map f4488j;

    /* renamed from: k */
    private final Context f4489k;

    /* renamed from: l */
    private final b f4490l;

    /* loaded from: classes.dex */
    public interface b {
        void a(JSONArray jSONArray);
    }

    /* loaded from: classes.dex */
    public static class c implements vj.a, Runnable {
        private final b a;

        /* renamed from: b */
        private final Object f4491b;

        /* renamed from: c */
        private int f4492c;

        /* renamed from: d */
        private final AtomicBoolean f4493d;

        /* renamed from: f */
        private final Collection f4494f;

        /* renamed from: g */
        private final com.applovin.impl.sdk.k f4495g;

        /* renamed from: h */
        private final com.applovin.impl.sdk.t f4496h;

        private c(int i10, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f4492c = i10;
            this.a = bVar;
            this.f4495g = kVar;
            this.f4496h = kVar.L();
            this.f4491b = new Object();
            this.f4494f = new ArrayList(i10);
            this.f4493d = new AtomicBoolean();
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.a();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4493d.compareAndSet(false, true)) {
                a();
            }
        }

        public void a() {
            ArrayList arrayList;
            synchronized (this.f4491b) {
                arrayList = new ArrayList(this.f4494f);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vj vjVar = (vj) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    wj f10 = vjVar.f();
                    jSONObject.put("name", f10.c());
                    jSONObject.put("class", f10.b());
                    jSONObject.put("adapter_version", vjVar.a());
                    jSONObject.put("sdk_version", vjVar.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError c10 = vjVar.c();
                    if (c10 != null) {
                        jSONObject2.put("error_message", c10.getMessage());
                    } else {
                        jSONObject2.put("signal", vjVar.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", vjVar.b());
                    jSONObject2.put("is_cached", vjVar.g());
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f4496h.a("TaskCollectSignals", "Collected signal from " + f10);
                    }
                } catch (JSONException e2) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f4496h.a("TaskCollectSignals", "Failed to create signal data", e2);
                    }
                    this.f4495g.B().a("TaskCollectSignals", "createSignalsData", e2);
                }
            }
            a(jSONArray);
        }

        public /* synthetic */ c(int i10, b bVar, com.applovin.impl.sdk.k kVar, a aVar) {
            this(i10, bVar, kVar);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }

        @Override // com.applovin.impl.vj.a
        public void a(vj vjVar) {
            int i10;
            boolean z10;
            synchronized (this.f4491b) {
                this.f4494f.add(vjVar);
                int i11 = this.f4492c - 1;
                this.f4492c = i11;
                i10 = 0;
                z10 = i11 < 1;
            }
            if (z10 && this.f4493d.compareAndSet(false, true)) {
                if (zp.h() && ((Boolean) this.f4495g.a(oj.Q)).booleanValue()) {
                    this.f4495g.l0().a((xl) new kn(this.f4495g, "handleSignalCollectionCompleted", new nt(this, i10)), sm.b.MEDIATION);
                } else {
                    a();
                }
            }
        }
    }

    public em(String str, MaxAdFormat maxAdFormat, Map map, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f4486h = str;
        this.f4487i = maxAdFormat;
        this.f4488j = map;
        this.f4489k = context;
        this.f4490l = bVar;
    }

    private void a(wj wjVar, vj.a aVar) {
        if (wjVar.r()) {
            AppLovinSdkUtils.runOnUiThread(new yv(4, this, wjVar, aVar));
        } else {
            this.a.S().collectSignal(this.f4486h, this.f4487i, wjVar, this.f4489k, aVar);
        }
    }

    public /* synthetic */ void b(wj wjVar, vj.a aVar) {
        this.a.S().collectSignal(this.f4486h, this.f4487i, wjVar, this.f4489k, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f4484n) {
                jSONArray = JsonUtils.getJSONArray(f4483m, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f4485o.size() > 0) {
                    a(jSONArray, f4483m);
                    return;
                } else {
                    a(jSONArray.length(), jSONArray, f4483m);
                    return;
                }
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.k(this.f9060b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.a.a(qj.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f4485o.size() > 0) {
                    a(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2.length(), jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e2) {
            a("Failed to wait for signals", e2);
            this.a.B().a("TaskCollectSignals", "waitForSignals", e2);
        } catch (JSONException e10) {
            a("Failed to parse signals JSON", e10);
            this.a.B().a("TaskCollectSignals", "parseSignalsJSON", e10);
        } catch (Throwable th2) {
            a("Failed to collect signals", th2);
            this.a.B().a("TaskCollectSignals", "collectSignals", th2);
        }
    }

    private void a(int i10, JSONArray jSONArray, JSONObject jSONObject) {
        c cVar = new c(i10, this.f4490l, this.a);
        this.a.l0().a(new kn(this.a, "timeoutCollectSignal", cVar), sm.b.TIMEOUT, ((Long) this.a.a(qe.P6)).longValue());
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            a(new wj(this.f4488j, jSONArray.getJSONObject(i11), jSONObject, this.a), cVar);
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f4485o.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e2) {
            com.applovin.impl.sdk.t.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e2);
            kVar.B().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e2);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        Set set = (Set) f4485o.get(this.f4486h);
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                    jSONArray2.put(jSONObject2);
                }
            }
            if (((Boolean) this.a.a(qe.Q6)).booleanValue()) {
                a(jSONArray2.length(), jSONArray2, jSONObject);
                return;
            } else {
                a(set.size(), jSONArray2, jSONObject);
                return;
            }
        }
        a("No signal providers found for ad unit: " + this.f4486h, (Throwable) null);
    }

    private void a(String str, Throwable th2) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "No signals collected: " + str, th2);
        }
        b bVar = this.f4490l;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f4484n) {
            f4483m = jSONObject;
        }
    }
}
