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
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final t f6173b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f6174c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final JSONArray f6175d = new JSONArray();

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f6176e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Object f6177f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private List f6178g;

    public e(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f6173b = kVar.L();
    }

    public void a(ke keVar, long j3, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z10;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f6177f) {
            z10 = !a(keVar);
            if (z10) {
                this.f6176e.put(keVar.b(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", keVar.b());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putLong(jSONObject, "init_time_ms", j3);
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f6175d.put(jSONObject);
            }
        }
        if (z10) {
            this.a.a(keVar);
            this.a.S().processAdapterInitializationPostback(keVar, j3, initializationStatus, str);
            this.a.o().a(initializationStatus, keVar.b());
        }
    }

    public JSONArray b() {
        JSONArray jSONArray;
        synchronized (this.f6177f) {
            jSONArray = this.f6175d;
        }
        return jSONArray;
    }

    public boolean c() {
        return this.f6174c.get();
    }

    public void a(ke keVar, Activity activity) {
        a(keVar, activity, null);
    }

    public void a(ke keVar, Activity activity, Runnable runnable) {
        List list;
        if (this.a.n0().c() && (list = this.f6178g) != null) {
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
        g a = this.a.O().a(keVar);
        if (a == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (t.a()) {
                this.f6173b.d("MediationAdapterInitializationManager", "Initializing adapter " + keVar);
            }
            a.a(MaxAdapterParametersImpl.a(keVar), activity, runnable);
        }
    }

    public boolean a(ke keVar) {
        boolean containsKey;
        synchronized (this.f6177f) {
            containsKey = this.f6176e.containsKey(keVar.b());
        }
        return containsKey;
    }

    public void a(Activity activity) {
        if (this.f6174c.compareAndSet(false, true)) {
            String str = (String) this.a.a(qj.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List a = a(JsonUtils.getJSONArray(jSONObject, this.a.n0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f6178g = a;
                    long parseLong = StringUtils.parseLong(this.a.g0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    zl zlVar = new zl(a, activity, this.a);
                    if (parseLong > 0) {
                        this.a.l0().a(zlVar, sm.b.MEDIATION, parseLong);
                    } else {
                        this.a.l0().a(zlVar);
                    }
                } catch (JSONException e2) {
                    if (t.a()) {
                        this.f6173b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e2);
                    }
                }
            }
        }
    }

    public LinkedHashMap a() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f6177f) {
            linkedHashMap = this.f6176e;
        }
        return linkedHashMap;
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new ke(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f6177f) {
            this.f6176e.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.a.o().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
