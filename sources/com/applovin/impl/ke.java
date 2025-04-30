package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ke {

    /* renamed from: a */
    protected final com.applovin.impl.sdk.k f8655a;
    private final JSONObject b;

    /* renamed from: d */
    protected final JSONObject f8657d;

    /* renamed from: g */
    private final Map f8659g;

    /* renamed from: h */
    private final ql f8660h;

    /* renamed from: i */
    protected final ql f8661i;

    /* renamed from: j */
    private String f8662j;

    /* renamed from: k */
    private String f8663k;

    /* renamed from: c */
    private final Object f8656c = new Object();

    /* renamed from: f */
    protected final Object f8658f = new Object();

    public ke(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (jSONObject2 != null) {
                if (jSONObject != null) {
                    this.f8655a = kVar;
                    if (((Boolean) kVar.a(oj.f9836q6)).booleanValue()) {
                        this.f8660h = new ql(jSONObject2);
                        this.f8661i = new ql(jSONObject);
                        this.b = null;
                        this.f8657d = null;
                    } else {
                        this.b = jSONObject2;
                        this.f8657d = jSONObject;
                        this.f8660h = null;
                        this.f8661i = null;
                    }
                    this.f8659g = map;
                    return;
                }
                throw new IllegalArgumentException("No ad object specified");
            }
            throw new IllegalArgumentException("No full response specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static /* synthetic */ Bundle i(ql qlVar) {
        return a(qlVar);
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f8655a.a(qe.f10338u7)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a();
        }
        synchronized (this.f8658f) {
            jSONObject = this.f8657d;
        }
        return jSONObject;
    }

    public String b() {
        return a("class", (String) null);
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
        return this.f8655a.m0().k();
    }

    public String e() {
        return this.f8663k;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        ql qlVar = this.f8660h;
        if (qlVar != null) {
            return qlVar.a();
        }
        synchronized (this.f8656c) {
            jSONObject = this.b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f8662j;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        boolean z8;
        if (e("server_parameters") instanceof JSONObject) {
            ql qlVar = this.f8661i;
            if (qlVar != null) {
                bundle = (Bundle) qlVar.a(new I(24));
            } else {
                bundle = JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
            }
        } else {
            bundle = new Bundle();
        }
        int j7 = j();
        if (j7 != -1) {
            if (j7 == 2) {
                bundle.putBoolean("is_muted", this.f8655a.g0().isMuted());
            } else {
                if (j7 == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                bundle.putBoolean("is_muted", z8);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_CURRENCY)) {
            bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, b(AppLovinEventParameters.REVENUE_CURRENCY, ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f8655a.a(qe.f10314R6)).longValue());
    }

    public Boolean n() {
        String str = (String) Q7.n0.d(this.f8655a, "huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("huc")) {
            return a("huc", Boolean.FALSE);
        }
        return b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = (String) Q7.n0.d(this.f8655a, "aru");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("aru")) {
            return a("aru", Boolean.FALSE);
        }
        return b("aru", (Boolean) null);
    }

    public Boolean p() {
        String str = (String) Q7.n0.d(this.f8655a, "dns");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("dns")) {
            return a("dns", Boolean.FALSE);
        }
        return b("dns", (Boolean) null);
    }

    public boolean q() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + q() + '}';
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        ql qlVar = this.f8660h;
        if (qlVar != null) {
            return qlVar.a(str, bool);
        }
        synchronized (this.f8656c) {
            bool2 = JsonUtils.getBoolean(this.b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean has;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.f8658f) {
            has = this.f8657d.has(str);
        }
        return has;
    }

    public Object e(String str) {
        Object opt;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.b(str);
        }
        synchronized (this.f8658f) {
            opt = this.f8657d.opt(str);
        }
        return opt;
    }

    public void f(String str) {
        this.f8663k = str;
    }

    public Map i() {
        return this.f8659g;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str, bool);
        }
        synchronized (this.f8658f) {
            bool2 = JsonUtils.getBoolean(this.f8657d, str, bool);
        }
        return bool2;
    }

    public boolean d(String str) {
        boolean has;
        ql qlVar = this.f8660h;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.f8656c) {
            has = this.b.has(str);
        }
        return has;
    }

    public void g(String str) {
        this.f8662j = str;
    }

    public float b(String str, float f9) {
        float f10;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str, f9);
        }
        synchronized (this.f8658f) {
            f10 = JsonUtils.getFloat(this.f8657d, str, f9);
        }
        return f10;
    }

    public void c(String str, int i9) {
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            qlVar.b(str, i9);
            return;
        }
        synchronized (this.f8658f) {
            JsonUtils.putInt(this.f8657d, str, i9);
        }
    }

    public double a(String str, float f9) {
        double d2;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str, f9);
        }
        synchronized (this.f8658f) {
            d2 = JsonUtils.getDouble(this.f8657d, str, f9);
        }
        return d2;
    }

    public int b(String str, int i9) {
        int i10;
        ql qlVar = this.f8660h;
        if (qlVar != null) {
            return qlVar.a(str, i9);
        }
        synchronized (this.f8656c) {
            i10 = JsonUtils.getInt(this.b, str, i9);
        }
        return i10;
    }

    public void c(String str, long j7) {
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            qlVar.b(str, j7);
            return;
        }
        synchronized (this.f8658f) {
            JsonUtils.putLong(this.f8657d, str, j7);
        }
    }

    public int a(String str, int i9) {
        int i10;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str, i9);
        }
        synchronized (this.f8658f) {
            i10 = JsonUtils.getInt(this.f8657d, str, i9);
        }
        return i10;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.f8660h;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.f8656c) {
            jSONArray2 = JsonUtils.getJSONArray(this.b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, String str2) {
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            qlVar.b(str, str2);
            return;
        }
        synchronized (this.f8658f) {
            JsonUtils.putString(this.f8657d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.f8658f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8657d, str, jSONArray);
        }
        return jSONArray2;
    }

    public long b(String str, long j7) {
        long j9;
        ql qlVar = this.f8660h;
        if (qlVar != null) {
            return qlVar.a(str, j7);
        }
        synchronized (this.f8656c) {
            j9 = JsonUtils.getLong(this.b, str, j7);
        }
        return j9;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str, jSONObject);
        }
        synchronized (this.f8658f) {
            jSONObject2 = JsonUtils.getJSONObject(this.f8657d, str, jSONObject);
        }
        return jSONObject2;
    }

    public List b(String str) {
        List optList;
        List optList2;
        if (str != null) {
            ql qlVar = this.f8660h;
            if (qlVar != null) {
                optList = qlVar.b(str, Collections.emptyList());
            } else {
                optList = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            ql qlVar2 = this.f8661i;
            if (qlVar2 != null) {
                optList2 = qlVar2.b(str, Collections.emptyList());
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

    public long a(String str, long j7) {
        long j9;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str, j7);
        }
        synchronized (this.f8658f) {
            j9 = JsonUtils.getLong(this.f8657d, str, j7);
        }
        return j9;
    }

    public String a(String str) {
        String a6 = a(str, "");
        return StringUtils.isValidString(a6) ? a6 : b(str, "");
    }

    public String b(String str, String str2) {
        String string;
        ql qlVar = this.f8660h;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.f8656c) {
            string = JsonUtils.getString(this.b, str, str2);
        }
        return string;
    }

    public String a(String str, String str2) {
        String string;
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.f8658f) {
            string = JsonUtils.getString(this.f8657d, str, str2);
        }
        return string;
    }

    public static /* synthetic */ Bundle a(ql qlVar) {
        return JsonUtils.toBundle(qlVar.a("server_parameters", (JSONObject) null));
    }

    public void a(String str, Object obj) {
        ql qlVar = this.f8661i;
        if (qlVar != null) {
            qlVar.a(str, obj);
            return;
        }
        synchronized (this.f8658f) {
            JsonUtils.putObject(this.f8657d, str, obj);
        }
    }
}
