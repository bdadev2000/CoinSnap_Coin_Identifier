package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ql {
    private final JSONObject a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7248b = new Object();

    public ql(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public Object a(n.a aVar) {
        Object apply;
        synchronized (this.f7248b) {
            apply = aVar.apply(this);
        }
        return apply;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f7248b) {
            stringList = JsonUtils.getStringList(this.a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f7248b) {
            this.a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f7248b) {
            jSONObject = this.a.toString();
        }
        return jSONObject;
    }

    public void a(m0.a aVar) {
        synchronized (this.f7248b) {
            aVar.accept(this);
        }
    }

    public Object b(String str) {
        Object opt;
        synchronized (this.f7248b) {
            opt = this.a.opt(str);
        }
        return opt;
    }

    public void b(String str, int i10) {
        synchronized (this.f7248b) {
            JsonUtils.putInt(this.a, str, i10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f7248b) {
            bool2 = JsonUtils.getBoolean(this.a, str, bool);
        }
        return bool2;
    }

    public double a(String str, double d10) {
        double d11;
        synchronized (this.f7248b) {
            d11 = JsonUtils.getDouble(this.a, str, d10);
        }
        return d11;
    }

    public void b(String str, long j3) {
        synchronized (this.f7248b) {
            JsonUtils.putLong(this.a, str, j3);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f7248b) {
            f11 = JsonUtils.getFloat(this.a, str, f10);
        }
        return f11;
    }

    public void b(String str, String str2) {
        synchronized (this.f7248b) {
            JsonUtils.putString(this.a, str, str2);
        }
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f7248b) {
            i11 = JsonUtils.getInt(this.a, str, i10);
        }
        return i11;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f7248b) {
            integerList = JsonUtils.getIntegerList(this.a, str, list);
        }
        return integerList;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f7248b) {
            jSONArray2 = JsonUtils.getJSONArray(this.a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f7248b) {
            jSONObject2 = JsonUtils.getJSONObject(this.a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j3) {
        long j10;
        synchronized (this.f7248b) {
            j10 = JsonUtils.getLong(this.a, str, j3);
        }
        return j10;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f7248b) {
            string = JsonUtils.getString(this.a, str, str2);
        }
        return string;
    }

    public boolean a(String str) {
        boolean has;
        synchronized (this.f7248b) {
            has = this.a.has(str);
        }
        return has;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f7248b) {
            JsonUtils.putBoolean(this.a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f7248b) {
            JsonUtils.putObject(this.a, str, obj);
        }
    }

    public JSONObject a() {
        JSONObject deepCopy;
        synchronized (this.f7248b) {
            deepCopy = JsonUtils.deepCopy(this.a);
        }
        return deepCopy;
    }
}
