package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class pe {

    /* renamed from: a */
    protected final com.applovin.impl.sdk.j f26025a;

    /* renamed from: b */
    private final JSONObject f26026b;
    protected final JSONObject d;

    /* renamed from: g */
    private final Map f26029g;

    /* renamed from: h */
    private final tl f26030h;

    /* renamed from: i */
    protected final tl f26031i;

    /* renamed from: j */
    private String f26032j;

    /* renamed from: k */
    private String f26033k;

    /* renamed from: c */
    private final Object f26027c = new Object();

    /* renamed from: f */
    protected final Object f26028f = new Object();

    public pe(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f26025a = jVar;
        if (((Boolean) jVar.a(sj.u6)).booleanValue()) {
            this.f26030h = new tl(jSONObject2);
            this.f26031i = new tl(jSONObject);
            this.f26026b = null;
            this.d = null;
        } else {
            this.f26026b = jSONObject2;
            this.d = jSONObject;
            this.f26030h = null;
            this.f26031i = null;
        }
        this.f26029g = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f26025a.a(ve.C7)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a();
        }
        synchronized (this.f26028f) {
            jSONObject = this.d;
        }
        return jSONObject;
    }

    public String b() {
        return a(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, (String) null);
    }

    public String c() {
        return a("name", (String) null);
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f26025a.k0().k();
    }

    public String e() {
        return this.f26033k;
    }

    public void f(String str) {
        this.f26033k = str;
    }

    public void g(String str) {
        this.f26032j = str;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f26032j;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            tl tlVar = this.f26031i;
            bundle = tlVar != null ? (Bundle) tlVar.a(new rs(29)) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int j2 = j();
        if (j2 != -1) {
            if (j2 == 2) {
                bundle.putBoolean("is_muted", this.f26025a.g0().isMuted());
            } else {
                bundle.putBoolean("is_muted", j2 == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f26025a.a(ve.Z6)).longValue());
    }

    public Boolean n() {
        String str = this.f26025a.g0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f26025a.g0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        tl tlVar = this.f26030h;
        if (tlVar != null) {
            return tlVar.a(str, bool);
        }
        synchronized (this.f26027c) {
            bool2 = JsonUtils.getBoolean(this.f26026b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean has;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str);
        }
        synchronized (this.f26028f) {
            has = this.d.has(str);
        }
        return has;
    }

    public Object e(String str) {
        Object opt;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.b(str);
        }
        synchronized (this.f26028f) {
            opt = this.d.opt(str);
        }
        return opt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        tl tlVar = this.f26030h;
        if (tlVar != null) {
            return tlVar.a();
        }
        synchronized (this.f26027c) {
            jSONObject = this.f26026b;
        }
        return jSONObject;
    }

    public Map i() {
        return this.f26029g;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str, bool);
        }
        synchronized (this.f26028f) {
            bool2 = JsonUtils.getBoolean(this.d, str, bool);
        }
        return bool2;
    }

    public float b(String str, float f2) {
        float f3;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str, f2);
        }
        synchronized (this.f26028f) {
            f3 = JsonUtils.getFloat(this.d, str, f2);
        }
        return f3;
    }

    public void c(String str, int i2) {
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            tlVar.b(str, i2);
            return;
        }
        synchronized (this.f26028f) {
            JsonUtils.putInt(this.d, str, i2);
        }
    }

    public boolean d(String str) {
        boolean has;
        tl tlVar = this.f26030h;
        if (tlVar != null) {
            return tlVar.a(str);
        }
        synchronized (this.f26027c) {
            has = this.f26026b.has(str);
        }
        return has;
    }

    public double a(String str, float f2) {
        double d;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str, f2);
        }
        synchronized (this.f26028f) {
            d = JsonUtils.getDouble(this.d, str, f2);
        }
        return d;
    }

    public int b(String str, int i2) {
        int i3;
        tl tlVar = this.f26030h;
        if (tlVar != null) {
            return tlVar.a(str, i2);
        }
        synchronized (this.f26027c) {
            i3 = JsonUtils.getInt(this.f26026b, str, i2);
        }
        return i3;
    }

    public void c(String str, long j2) {
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            tlVar.b(str, j2);
            return;
        }
        synchronized (this.f26028f) {
            JsonUtils.putLong(this.d, str, j2);
        }
    }

    public int a(String str, int i2) {
        int i3;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str, i2);
        }
        synchronized (this.f26028f) {
            i3 = JsonUtils.getInt(this.d, str, i2);
        }
        return i3;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        tl tlVar = this.f26030h;
        if (tlVar != null) {
            return tlVar.a(str, jSONArray);
        }
        synchronized (this.f26027c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f26026b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, String str2) {
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            tlVar.b(str, str2);
            return;
        }
        synchronized (this.f26028f) {
            JsonUtils.putString(this.d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str, jSONArray);
        }
        synchronized (this.f26028f) {
            jSONArray2 = JsonUtils.getJSONArray(this.d, str, jSONArray);
        }
        return jSONArray2;
    }

    public long b(String str, long j2) {
        long j3;
        tl tlVar = this.f26030h;
        if (tlVar != null) {
            return tlVar.a(str, j2);
        }
        synchronized (this.f26027c) {
            j3 = JsonUtils.getLong(this.f26026b, str, j2);
        }
        return j3;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str, jSONObject);
        }
        synchronized (this.f26028f) {
            jSONObject2 = JsonUtils.getJSONObject(this.d, str, jSONObject);
        }
        return jSONObject2;
    }

    public List b(String str) {
        List optList;
        List optList2;
        if (str != null) {
            tl tlVar = this.f26030h;
            if (tlVar != null) {
                optList = tlVar.b(str, Collections.emptyList());
            } else {
                optList = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            tl tlVar2 = this.f26031i;
            if (tlVar2 != null) {
                optList2 = tlVar2.b(str, Collections.emptyList());
            } else {
                optList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(optList2.size() + optList.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public long a(String str, long j2) {
        long j3;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str, j2);
        }
        synchronized (this.f26028f) {
            j3 = JsonUtils.getLong(this.d, str, j2);
        }
        return j3;
    }

    public String a(String str) {
        String a2 = a(str, "");
        return StringUtils.isValidString(a2) ? a2 : b(str, "");
    }

    public String b(String str, String str2) {
        String string;
        tl tlVar = this.f26030h;
        if (tlVar != null) {
            return tlVar.a(str, str2);
        }
        synchronized (this.f26027c) {
            string = JsonUtils.getString(this.f26026b, str, str2);
        }
        return string;
    }

    public String a(String str, String str2) {
        String string;
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            return tlVar.a(str, str2);
        }
        synchronized (this.f26028f) {
            string = JsonUtils.getString(this.d, str, str2);
        }
        return string;
    }

    public static /* synthetic */ Bundle a(tl tlVar) {
        return JsonUtils.toBundle(tlVar.a("server_parameters", (JSONObject) null));
    }

    public void a(String str, Object obj) {
        tl tlVar = this.f26031i;
        if (tlVar != null) {
            tlVar.a(str, obj);
            return;
        }
        synchronized (this.f26028f) {
            JsonUtils.putObject(this.d, str, obj);
        }
    }
}
