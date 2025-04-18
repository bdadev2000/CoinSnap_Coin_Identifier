package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.am;
import com.applovin.impl.an;
import com.applovin.impl.fi;
import com.applovin.impl.la;
import com.applovin.impl.ma;
import com.applovin.impl.pe;
import com.applovin.impl.q6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.impl.uj;
import com.applovin.impl.ve;
import com.applovin.mediation.adapter.MaxAdapter;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f25470a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f25471b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f25472c = new AtomicBoolean();
    private final Set d = new HashSet();
    private final Object e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final JSONArray f25473f = new JSONArray();

    /* renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f25474g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f25475h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Map f25476i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f25477j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Object f25478k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private List f25479l;

    public e(com.applovin.impl.sdk.j jVar) {
        this.f25470a = jVar;
        this.f25471b = jVar.J();
    }

    private void c(pe peVar) {
        String b2 = peVar.b();
        synchronized (this.e) {
            try {
                if (this.d.contains(b2)) {
                    return;
                }
                this.d.add(b2);
                this.f25470a.E().a(la.f25015m, ma.a(peVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(pe peVar, long j2, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z2;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f25475h) {
            try {
                z2 = !b(peVar);
                if (z2) {
                    this.f25474g.put(peVar.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, peVar.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j2);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f25473f.put(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.f25470a.a(peVar);
            this.f25470a.Q().processAdapterInitializationPostback(peVar, j2, initializationStatus, str);
            this.f25470a.p().a(initializationStatus, peVar.b());
        }
    }

    public void b(pe peVar, Activity activity) {
        List list;
        if (((Boolean) this.f25470a.a(ve.Y7)).booleanValue()) {
            a(peVar, activity);
            return;
        }
        if (((Boolean) this.f25470a.a(ve.X7)).booleanValue()) {
            pe peVar2 = (pe) this.f25476i.get(peVar.b());
            if (peVar2 != null) {
                peVar = peVar2;
            }
        } else {
            if (this.f25470a.l0().c() && (list = this.f25479l) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        peVar = null;
                        break;
                    }
                    pe peVar3 = (pe) it.next();
                    if (peVar3.b().equals(peVar.b())) {
                        peVar = peVar3;
                        break;
                    }
                }
            }
            if (peVar == null) {
                return;
            }
        }
        g a2 = this.f25470a.M().a(peVar);
        if (a2 != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25471b.d("MediationAdapterInitializationManager", "Initializing adapter " + peVar);
            }
            c(peVar);
            a2.a(MaxAdapterParametersImpl.a(peVar), activity, (MaxAdapter.OnCompletionListener) null);
            return;
        }
        com.applovin.impl.sdk.n.h("MediationAdapterInitializationManager", "Mediation adapter could not be initialized, double check that the adapter is included in your build. Adapter spec: " + peVar);
    }

    public boolean c() {
        return this.f25472c.get();
    }

    public boolean b(pe peVar) {
        boolean containsKey;
        synchronized (this.f25475h) {
            containsKey = this.f25474g.containsKey(peVar.b());
        }
        return containsKey;
    }

    private pe a(pe peVar) {
        List<pe> list;
        if (((Boolean) this.f25470a.a(ve.X7)).booleanValue()) {
            pe peVar2 = (pe) this.f25476i.get(peVar.b());
            return peVar2 != null ? peVar2 : peVar;
        }
        if (!this.f25470a.l0().c() || (list = this.f25479l) == null) {
            return peVar;
        }
        for (pe peVar3 : list) {
            if (peVar3.b().equals(peVar.b())) {
                return peVar3;
            }
        }
        return null;
    }

    public JSONArray b() {
        JSONArray shallowCopy;
        synchronized (this.f25475h) {
            shallowCopy = JsonUtils.shallowCopy(this.f25473f);
        }
        return shallowCopy;
    }

    public fi a(pe peVar, Activity activity) {
        pe a2 = a(peVar);
        if (a2 == null) {
            return fi.c(MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String b2 = peVar.b();
        synchronized (this.f25478k) {
            try {
                fi fiVar = (fi) this.f25477j.get(b2);
                if (fiVar == null || (fiVar.d() && a2.q())) {
                    final fi fiVar2 = new fi();
                    this.f25477j.put(b2, fiVar2);
                    g a3 = this.f25470a.M().a(a2);
                    if (a3 == null) {
                        fiVar2.a("Adapter implementation not found");
                        return fiVar2;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f25471b.d("MediationAdapterInitializationManager", "Initializing adapter " + a2);
                    }
                    c(a2);
                    a3.a(MaxAdapterParametersImpl.a(a2), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.l
                        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                        public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                            e.a(fi.this, initializationStatus, str);
                        }
                    });
                    an.a(a2.m(), fiVar2, "The adapter (" + peVar.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f25470a);
                    return fiVar2;
                }
                return fiVar;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(fi fiVar, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                fiVar.a(str);
                return;
            } else {
                fiVar.b(initializationStatus);
                return;
            }
        }
        q6.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        fiVar.a("Adapter reported INITIALIZING");
    }

    public void a(Activity activity) {
        if (this.f25472c.compareAndSet(false, true)) {
            String str = (String) this.f25470a.a(uj.F);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<pe> a2 = a(JsonUtils.getJSONArray(jSONObject, this.f25470a.l0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f25479l = a2;
                    for (pe peVar : a2) {
                        this.f25476i.put(peVar.b(), peVar);
                    }
                    long parseLong = StringUtils.parseLong(this.f25470a.g0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    am amVar = new am(a2, activity, this.f25470a);
                    if (parseLong > 0) {
                        this.f25470a.j0().a(amVar, tm.b.MEDIATION, parseLong);
                    } else {
                        this.f25470a.j0().a(amVar);
                    }
                } catch (JSONException e) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f25471b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                    q6.a((Throwable) e);
                }
            }
        }
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f25475h) {
            num = (Integer) this.f25474g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f25475h) {
            hashSet = new HashSet(this.f25474g.keySet());
        }
        return hashSet;
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new pe(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), jSONObject, this.f25470a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f25475h) {
            this.f25474g.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f29540j, Integer.valueOf(initializationStatus.getCode()));
        }
        this.f25470a.p().a(initializationStatus, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f29540j);
    }
}
