package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import t.InterfaceC2702a;

/* loaded from: classes.dex */
public class ql {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f10392a;
    private final Object b = new Object();

    public ql(JSONObject jSONObject) {
        this.f10392a = jSONObject;
    }

    public Object a(InterfaceC2702a interfaceC2702a) {
        Object apply;
        synchronized (this.b) {
            apply = interfaceC2702a.apply(this);
        }
        return apply;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.b) {
            stringList = JsonUtils.getStringList(this.f10392a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.b) {
            this.f10392a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.b) {
            jSONObject = this.f10392a.toString();
        }
        return jSONObject;
    }

    public void a(S.a aVar) {
        synchronized (this.b) {
            aVar.accept(this);
        }
    }

    public Object b(String str) {
        Object opt;
        synchronized (this.b) {
            opt = this.f10392a.opt(str);
        }
        return opt;
    }

    public void b(String str, int i9) {
        synchronized (this.b) {
            JsonUtils.putInt(this.f10392a, str, i9);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.b) {
            bool2 = JsonUtils.getBoolean(this.f10392a, str, bool);
        }
        return bool2;
    }

    public double a(String str, double d2) {
        double d9;
        synchronized (this.b) {
            d9 = JsonUtils.getDouble(this.f10392a, str, d2);
        }
        return d9;
    }

    public void b(String str, long j7) {
        synchronized (this.b) {
            JsonUtils.putLong(this.f10392a, str, j7);
        }
    }

    public float a(String str, float f9) {
        float f10;
        synchronized (this.b) {
            f10 = JsonUtils.getFloat(this.f10392a, str, f9);
        }
        return f10;
    }

    public void b(String str, String str2) {
        synchronized (this.b) {
            JsonUtils.putString(this.f10392a, str, str2);
        }
    }

    public int a(String str, int i9) {
        int i10;
        synchronized (this.b) {
            i10 = JsonUtils.getInt(this.f10392a, str, i9);
        }
        return i10;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.b) {
            integerList = JsonUtils.getIntegerList(this.f10392a, str, list);
        }
        return integerList;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f10392a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f10392a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j7) {
        long j9;
        synchronized (this.b) {
            j9 = JsonUtils.getLong(this.f10392a, str, j7);
        }
        return j9;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.b) {
            string = JsonUtils.getString(this.f10392a, str, str2);
        }
        return string;
    }

    public boolean a(String str) {
        boolean has;
        synchronized (this.b) {
            has = this.f10392a.has(str);
        }
        return has;
    }

    public void a(String str, boolean z8) {
        synchronized (this.b) {
            JsonUtils.putBoolean(this.f10392a, str, z8);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.b) {
            JsonUtils.putObject(this.f10392a, str, obj);
        }
    }

    public JSONObject a() {
        JSONObject deepCopy;
        synchronized (this.b) {
            deepCopy = JsonUtils.deepCopy(this.f10392a);
        }
        return deepCopy;
    }
}
