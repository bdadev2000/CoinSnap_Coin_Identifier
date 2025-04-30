package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.ke;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.zl;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9126a;
    private final t b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9127c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final JSONArray f9128d = new JSONArray();

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f9129e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Object f9130f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private List f9131g;

    public e(com.applovin.impl.sdk.k kVar) {
        this.f9126a = kVar;
        this.b = kVar.L();
    }

    public void a(ke keVar, long j7, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z8;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f9130f) {
            try {
                z8 = !a(keVar);
                if (z8) {
                    this.f9129e.put(keVar.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", keVar.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j7);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f9128d.put(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            this.f9126a.a(keVar);
            this.f9126a.S().processAdapterInitializationPostback(keVar, j7, initializationStatus, str);
            this.f9126a.o().a(initializationStatus, keVar.b());
        }
    }

    public JSONArray b() {
        JSONArray jSONArray;
        synchronized (this.f9130f) {
            jSONArray = this.f9128d;
        }
        return jSONArray;
    }

    public boolean c() {
        return this.f9127c.get();
    }

    public void a(ke keVar, Activity activity) {
        a(keVar, activity, null);
    }

    public void a(ke keVar, Activity activity, Runnable runnable) {
        List list;
        if (this.f9126a.n0().c() && (list = this.f9131g) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    keVar = null;
                    break;
                }
                ke keVar2 = (ke) it.next();
                if (keVar2.b().equals(keVar.b())) {
                    keVar = keVar2;
                    break;
                }
            }
        }
        if (keVar == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        g a6 = this.f9126a.O().a(keVar);
        if (a6 == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (t.a()) {
                this.b.d("MediationAdapterInitializationManager", "Initializing adapter " + keVar);
            }
            a6.a(MaxAdapterParametersImpl.a(keVar), activity, runnable);
        }
    }

    public boolean a(ke keVar) {
        boolean containsKey;
        synchronized (this.f9130f) {
            containsKey = this.f9129e.containsKey(keVar.b());
        }
        return containsKey;
    }

    public void a(Activity activity) {
        if (this.f9127c.compareAndSet(false, true)) {
            String str = (String) this.f9126a.a(qj.f10358G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List a6 = a(JsonUtils.getJSONArray(jSONObject, this.f9126a.n0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f9131g = a6;
                    long parseLong = StringUtils.parseLong(this.f9126a.g0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    zl zlVar = new zl(a6, activity, this.f9126a);
                    if (parseLong > 0) {
                        this.f9126a.l0().a(zlVar, sm.b.MEDIATION, parseLong);
                    } else {
                        this.f9126a.l0().a(zlVar);
                    }
                } catch (JSONException e4) {
                    if (t.a()) {
                        this.b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e4);
                    }
                }
            }
        }
    }

    public LinkedHashMap a() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f9130f) {
            linkedHashMap = this.f9129e;
        }
        return linkedHashMap;
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            arrayList.add(new ke(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null), jSONObject, this.f9126a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f9130f) {
            this.f9129e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f9126a.o().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
