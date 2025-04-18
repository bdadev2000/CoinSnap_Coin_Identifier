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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ke {
    protected final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final JSONObject f5672b;

    /* renamed from: d */
    protected final JSONObject f5674d;

    /* renamed from: g */
    private final Map f5676g;

    /* renamed from: h */
    private final ql f5677h;

    /* renamed from: i */
    protected final ql f5678i;

    /* renamed from: j */
    private String f5679j;

    /* renamed from: k */
    private String f5680k;

    /* renamed from: c */
    private final Object f5673c = new Object();

    /* renamed from: f */
    protected final Object f5675f = new Object();

    public ke(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (jSONObject2 != null) {
                if (jSONObject != null) {
                    this.a = kVar;
                    if (((Boolean) kVar.a(oj.f6742q6)).booleanValue()) {
                        this.f5677h = new ql(jSONObject2);
                        this.f5678i = new ql(jSONObject);
                        this.f5672b = null;
                        this.f5674d = null;
                    } else {
                        this.f5672b = jSONObject2;
                        this.f5674d = jSONObject;
                        this.f5677h = null;
                        this.f5678i = null;
                    }
                    this.f5676g = map;
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
        return a("mute_state", b("mute_state", ((Integer) this.a.a(qe.f7209u7)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a();
        }
        synchronized (this.f5675f) {
            jSONObject = this.f5674d;
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
        return this.a.m0().k();
    }

    public String e() {
        return this.f5680k;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        ql qlVar = this.f5677h;
        if (qlVar != null) {
            return qlVar.a();
        }
        synchronized (this.f5673c) {
            jSONObject = this.f5672b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f5679j;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        boolean z10;
        if (e("server_parameters") instanceof JSONObject) {
            ql qlVar = this.f5678i;
            if (qlVar != null) {
                bundle = (Bundle) qlVar.a(new ss(23));
            } else {
                bundle = JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
            }
        } else {
            bundle = new Bundle();
        }
        int j3 = j();
        if (j3 != -1) {
            if (j3 == 2) {
                bundle.putBoolean("is_muted", this.a.g0().isMuted());
            } else {
                if (j3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bundle.putBoolean("is_muted", z10);
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
        return a("adapter_timeout_ms", ((Long) this.a.a(qe.R6)).longValue());
    }

    public Boolean n() {
        String str = (String) a4.j.b(this.a, "huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("huc")) {
            return a("huc", Boolean.FALSE);
        }
        return b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = (String) a4.j.b(this.a, "aru");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        if (c("aru")) {
            return a("aru", Boolean.FALSE);
        }
        return b("aru", (Boolean) null);
    }

    public Boolean p() {
        String str = (String) a4.j.b(this.a, "dns");
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
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + q() + AbstractJsonLexerKt.END_OBJ;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        ql qlVar = this.f5677h;
        if (qlVar != null) {
            return qlVar.a(str, bool);
        }
        synchronized (this.f5673c) {
            bool2 = JsonUtils.getBoolean(this.f5672b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean has;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.f5675f) {
            has = this.f5674d.has(str);
        }
        return has;
    }

    public Object e(String str) {
        Object opt;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.b(str);
        }
        synchronized (this.f5675f) {
            opt = this.f5674d.opt(str);
        }
        return opt;
    }

    public void f(String str) {
        this.f5680k = str;
    }

    public Map i() {
        return this.f5676g;
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str, bool);
        }
        synchronized (this.f5675f) {
            bool2 = JsonUtils.getBoolean(this.f5674d, str, bool);
        }
        return bool2;
    }

    public boolean d(String str) {
        boolean has;
        ql qlVar = this.f5677h;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.f5673c) {
            has = this.f5672b.has(str);
        }
        return has;
    }

    public void g(String str) {
        this.f5679j = str;
    }

    public float b(String str, float f10) {
        float f11;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str, f10);
        }
        synchronized (this.f5675f) {
            f11 = JsonUtils.getFloat(this.f5674d, str, f10);
        }
        return f11;
    }

    public void c(String str, int i10) {
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            qlVar.b(str, i10);
            return;
        }
        synchronized (this.f5675f) {
            JsonUtils.putInt(this.f5674d, str, i10);
        }
    }

    public double a(String str, float f10) {
        double d10;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str, f10);
        }
        synchronized (this.f5675f) {
            d10 = JsonUtils.getDouble(this.f5674d, str, f10);
        }
        return d10;
    }

    public int b(String str, int i10) {
        int i11;
        ql qlVar = this.f5677h;
        if (qlVar != null) {
            return qlVar.a(str, i10);
        }
        synchronized (this.f5673c) {
            i11 = JsonUtils.getInt(this.f5672b, str, i10);
        }
        return i11;
    }

    public void c(String str, long j3) {
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            qlVar.b(str, j3);
            return;
        }
        synchronized (this.f5675f) {
            JsonUtils.putLong(this.f5674d, str, j3);
        }
    }

    public int a(String str, int i10) {
        int i11;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str, i10);
        }
        synchronized (this.f5675f) {
            i11 = JsonUtils.getInt(this.f5674d, str, i10);
        }
        return i11;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.f5677h;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.f5673c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f5672b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, String str2) {
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            qlVar.b(str, str2);
            return;
        }
        synchronized (this.f5675f) {
            JsonUtils.putString(this.f5674d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.f5675f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f5674d, str, jSONArray);
        }
        return jSONArray2;
    }

    public long b(String str, long j3) {
        long j10;
        ql qlVar = this.f5677h;
        if (qlVar != null) {
            return qlVar.a(str, j3);
        }
        synchronized (this.f5673c) {
            j10 = JsonUtils.getLong(this.f5672b, str, j3);
        }
        return j10;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str, jSONObject);
        }
        synchronized (this.f5675f) {
            jSONObject2 = JsonUtils.getJSONObject(this.f5674d, str, jSONObject);
        }
        return jSONObject2;
    }

    public List b(String str) {
        List optList;
        List optList2;
        if (str != null) {
            ql qlVar = this.f5677h;
            if (qlVar != null) {
                optList = qlVar.b(str, Collections.emptyList());
            } else {
                optList = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            ql qlVar2 = this.f5678i;
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

    public long a(String str, long j3) {
        long j10;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str, j3);
        }
        synchronized (this.f5675f) {
            j10 = JsonUtils.getLong(this.f5674d, str, j3);
        }
        return j10;
    }

    public String a(String str) {
        String a = a(str, "");
        return StringUtils.isValidString(a) ? a : b(str, "");
    }

    public String b(String str, String str2) {
        String string;
        ql qlVar = this.f5677h;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.f5673c) {
            string = JsonUtils.getString(this.f5672b, str, str2);
        }
        return string;
    }

    public String a(String str, String str2) {
        String string;
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.f5675f) {
            string = JsonUtils.getString(this.f5674d, str, str2);
        }
        return string;
    }

    public static /* synthetic */ Bundle a(ql qlVar) {
        return JsonUtils.toBundle(qlVar.a("server_parameters", (JSONObject) null));
    }

    public void a(String str, Object obj) {
        ql qlVar = this.f5678i;
        if (qlVar != null) {
            qlVar.a(str, obj);
            return;
        }
        synchronized (this.f5675f) {
            JsonUtils.putObject(this.f5674d, str, obj);
        }
    }
}
