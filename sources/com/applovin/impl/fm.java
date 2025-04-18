package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.tm;
import com.applovin.impl.yj;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class fm extends yl {

    /* renamed from: m */
    private static JSONObject f23930m;

    /* renamed from: n */
    private static final Object f23931n = new Object();

    /* renamed from: o */
    private static final Map f23932o = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private final String f23933h;

    /* renamed from: i */
    private final MaxAdFormat f23934i;

    /* renamed from: j */
    private final Map f23935j;

    /* renamed from: k */
    private final Context f23936k;

    /* renamed from: l */
    private final b f23937l;

    /* loaded from: classes2.dex */
    public interface b {
        void a(JSONArray jSONArray);
    }

    /* loaded from: classes2.dex */
    public static class c implements yj.a, Runnable {

        /* renamed from: a */
        private final b f23938a;

        /* renamed from: b */
        private final Object f23939b;

        /* renamed from: c */
        private int f23940c;
        private final AtomicBoolean d;

        /* renamed from: f */
        private final Collection f23941f;

        /* renamed from: g */
        private final com.applovin.impl.sdk.j f23942g;

        /* renamed from: h */
        private final com.applovin.impl.sdk.n f23943h;

        private c(int i2, b bVar, com.applovin.impl.sdk.j jVar) {
            this.f23940c = i2;
            this.f23938a = bVar;
            this.f23942g = jVar;
            this.f23943h = jVar.J();
            this.f23939b = new Object();
            this.f23941f = new ArrayList(i2);
            this.d = new AtomicBoolean();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.compareAndSet(false, true)) {
                a();
            }
        }

        public void a() {
            ArrayList arrayList;
            synchronized (this.f23939b) {
                arrayList = new ArrayList(this.f23941f);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yj yjVar = (yj) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    zj f2 = yjVar.f();
                    jSONObject.put("name", f2.c());
                    jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, f2.b());
                    jSONObject.put("adapter_version", yjVar.a());
                    jSONObject.put("sdk_version", yjVar.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError c2 = yjVar.c();
                    if (c2 != null) {
                        jSONObject2.put("error_message", c2.getMessage());
                    } else {
                        jSONObject2.put("signal", yjVar.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", yjVar.b());
                    jSONObject2.put("is_cached", yjVar.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f23943h.a("TaskCollectSignals", "Collected signal from " + f2);
                    }
                } catch (JSONException e) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f23943h.a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.f23942g.E().a("TaskCollectSignals", "createSignalsData", e);
                }
            }
            a(jSONArray);
        }

        public /* synthetic */ c(int i2, b bVar, com.applovin.impl.sdk.j jVar, a aVar) {
            this(i2, bVar, jVar);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f23938a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }

        @Override // com.applovin.impl.yj.a
        public void a(yj yjVar) {
            boolean z2;
            synchronized (this.f23939b) {
                this.f23941f.add(yjVar);
                int i2 = this.f23940c - 1;
                this.f23940c = i2;
                z2 = i2 < 1;
            }
            if (z2 && this.d.compareAndSet(false, true)) {
                if (yp.h() && ((Boolean) this.f23942g.a(sj.T)).booleanValue()) {
                    this.f23942g.j0().a((yl) new jn(this.f23942g, "handleSignalCollectionCompleted", new mt(this, 0)), tm.b.MEDIATION);
                } else {
                    a();
                }
            }
        }
    }

    public fm(String str, MaxAdFormat maxAdFormat, Map map, Context context, com.applovin.impl.sdk.j jVar, b bVar) {
        super("TaskCollectSignals", jVar);
        this.f23933h = str;
        this.f23934i = maxAdFormat;
        this.f23935j = map;
        this.f23936k = context;
        this.f23937l = bVar;
    }

    private void a(zj zjVar, yj.a aVar) {
        if (zjVar.r()) {
            AppLovinSdkUtils.runOnUiThread(new ks(this, 5, zjVar, aVar));
        } else {
            this.f28216a.Q().collectSignal(this.f23933h, this.f23934i, zjVar, this.f23936k, aVar);
        }
    }

    public /* synthetic */ void b(zj zjVar, yj.a aVar) {
        this.f28216a.Q().collectSignal(this.f23933h, this.f23934i, zjVar, this.f23936k, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f23931n) {
                jSONArray = JsonUtils.getJSONArray(f23930m, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f23932o.size() > 0) {
                    b(jSONArray, f23930m);
                    return;
                } else {
                    a(jSONArray, f23930m);
                    return;
                }
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.k(this.f28217b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f28216a.a(uj.E, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f23932o.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e) {
            a("Failed to wait for signals", e);
            this.f28216a.E().a("TaskCollectSignals", "waitForSignals", e);
        } catch (JSONException e2) {
            a("Failed to parse signals JSON", e2);
            this.f28216a.E().a("TaskCollectSignals", "parseSignalsJSON", e2);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f28216a.E().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) {
        Set set = (Set) f23932o.get(this.f23933h);
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                    jSONArray2.put(jSONObject2);
                }
            }
            a(jSONArray2, jSONObject);
            return;
        }
        a("No signal providers found for ad unit: " + this.f23933h, (Throwable) null);
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        c cVar = new c(jSONArray.length(), this.f23937l, this.f28216a);
        this.f28216a.j0().a(new jn(this.f28216a, "timeoutCollectSignal", cVar), tm.b.TIMEOUT, ((Long) this.f28216a.a(ve.Y6)).longValue());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            a(new zj(this.f23935j, jSONArray.getJSONObject(i2), jSONObject, this.f28216a), cVar);
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f23932o.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            com.applovin.impl.sdk.n.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            jVar.E().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "No signals collected: " + str, th);
        }
        b bVar = this.f23937l;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f23931n) {
            f23930m = jSONObject;
        }
    }
}
