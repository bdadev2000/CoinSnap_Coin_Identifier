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
    private static JSONObject m;

    /* renamed from: n */
    private static final Object f7453n = new Object();

    /* renamed from: o */
    private static final Map f7454o = Q7.n0.q();

    /* renamed from: h */
    private final String f7455h;

    /* renamed from: i */
    private final MaxAdFormat f7456i;

    /* renamed from: j */
    private final Map f7457j;

    /* renamed from: k */
    private final Context f7458k;
    private final b l;

    /* loaded from: classes.dex */
    public interface b {
        void a(JSONArray jSONArray);
    }

    /* loaded from: classes.dex */
    public static class c implements vj.a, Runnable {

        /* renamed from: a */
        private final b f7459a;
        private final Object b;

        /* renamed from: c */
        private int f7460c;

        /* renamed from: d */
        private final AtomicBoolean f7461d;

        /* renamed from: f */
        private final Collection f7462f;

        /* renamed from: g */
        private final com.applovin.impl.sdk.k f7463g;

        /* renamed from: h */
        private final com.applovin.impl.sdk.t f7464h;

        private c(int i9, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f7460c = i9;
            this.f7459a = bVar;
            this.f7463g = kVar;
            this.f7464h = kVar.L();
            this.b = new Object();
            this.f7462f = new ArrayList(i9);
            this.f7461d = new AtomicBoolean();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7461d.compareAndSet(false, true)) {
                a();
            }
        }

        public void a() {
            ArrayList arrayList;
            synchronized (this.b) {
                arrayList = new ArrayList(this.f7462f);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vj vjVar = (vj) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    wj f9 = vjVar.f();
                    jSONObject.put("name", f9.c());
                    jSONObject.put("class", f9.b());
                    jSONObject.put("adapter_version", vjVar.a());
                    jSONObject.put("sdk_version", vjVar.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError c9 = vjVar.c();
                    if (c9 != null) {
                        jSONObject2.put("error_message", c9.getMessage());
                    } else {
                        jSONObject2.put("signal", vjVar.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", vjVar.b());
                    jSONObject2.put("is_cached", vjVar.g());
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f7464h.a("TaskCollectSignals", "Collected signal from " + f9);
                    }
                } catch (JSONException e4) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f7464h.a("TaskCollectSignals", "Failed to create signal data", e4);
                    }
                    this.f7463g.B().a("TaskCollectSignals", "createSignalsData", e4);
                }
            }
            a(jSONArray);
        }

        public /* synthetic */ c(int i9, b bVar, com.applovin.impl.sdk.k kVar, a aVar) {
            this(i9, bVar, kVar);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f7459a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }

        @Override // com.applovin.impl.vj.a
        public void a(vj vjVar) {
            boolean z8;
            synchronized (this.b) {
                this.f7462f.add(vjVar);
                int i9 = this.f7460c - 1;
                this.f7460c = i9;
                z8 = i9 < 1;
            }
            if (z8 && this.f7461d.compareAndSet(false, true)) {
                if (zp.h() && ((Boolean) this.f7463g.a(oj.f9655Q)).booleanValue()) {
                    this.f7463g.l0().a((xl) new kn(this.f7463g, "handleSignalCollectionCompleted", new F0(this, 0)), sm.b.MEDIATION);
                } else {
                    a();
                }
            }
        }
    }

    public em(String str, MaxAdFormat maxAdFormat, Map map, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f7455h = str;
        this.f7456i = maxAdFormat;
        this.f7457j = map;
        this.f7458k = context;
        this.l = bVar;
    }

    private void a(wj wjVar, vj.a aVar) {
        if (wjVar.r()) {
            AppLovinSdkUtils.runOnUiThread(new O2(this, wjVar, aVar, 4));
        } else {
            this.f12278a.S().collectSignal(this.f7455h, this.f7456i, wjVar, this.f7458k, aVar);
        }
    }

    public /* synthetic */ void b(wj wjVar, vj.a aVar) {
        this.f12278a.S().collectSignal(this.f7455h, this.f7456i, wjVar, this.f7458k, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f7453n) {
                jSONArray = JsonUtils.getJSONArray(m, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f7454o.size() > 0) {
                    a(jSONArray, m);
                    return;
                } else {
                    a(jSONArray.length(), jSONArray, m);
                    return;
                }
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.k(this.b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f12278a.a(qj.f10357F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f7454o.size() > 0) {
                    a(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2.length(), jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e4) {
            a("Failed to wait for signals", e4);
            this.f12278a.B().a("TaskCollectSignals", "waitForSignals", e4);
        } catch (JSONException e9) {
            a("Failed to parse signals JSON", e9);
            this.f12278a.B().a("TaskCollectSignals", "parseSignalsJSON", e9);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f12278a.B().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(int i9, JSONArray jSONArray, JSONObject jSONObject) {
        c cVar = new c(i9, this.l, this.f12278a);
        this.f12278a.l0().a(new kn(this.f12278a, "timeoutCollectSignal", cVar), sm.b.TIMEOUT, ((Long) this.f12278a.a(qe.f10311P6)).longValue());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new wj(this.f7457j, jSONArray.getJSONObject(i10), jSONObject, this.f12278a), cVar);
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f7454o.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e4) {
            com.applovin.impl.sdk.t.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e4);
            kVar.B().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e4);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        Set set = (Set) f7454o.get(this.f7455h);
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                    jSONArray2.put(jSONObject2);
                }
            }
            if (((Boolean) this.f12278a.a(qe.f10313Q6)).booleanValue()) {
                a(jSONArray2.length(), jSONArray2, jSONObject);
                return;
            } else {
                a(set.size(), jSONArray2, jSONObject);
                return;
            }
        }
        a("No signal providers found for ad unit: " + this.f7455h, (Throwable) null);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "No signals collected: " + str, th);
        }
        b bVar = this.l;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f7453n) {
            m = jSONObject;
        }
    }
}
