package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class tl {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f27172a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27173b = new Object();

    public tl(JSONObject jSONObject) {
        this.f27172a = jSONObject;
    }

    public Object a(Function function) {
        Object apply;
        synchronized (this.f27173b) {
            apply = function.apply(this);
        }
        return apply;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f27173b) {
            stringList = JsonUtils.getStringList(this.f27172a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f27173b) {
            this.f27172a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f27173b) {
            jSONObject = this.f27172a.toString();
        }
        return jSONObject;
    }

    public void a(Consumer consumer) {
        synchronized (this.f27173b) {
            consumer.accept(this);
        }
    }

    public Object b(String str) {
        Object opt;
        synchronized (this.f27173b) {
            opt = this.f27172a.opt(str);
        }
        return opt;
    }

    public void b(String str, int i2) {
        synchronized (this.f27173b) {
            JsonUtils.putInt(this.f27172a, str, i2);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f27173b) {
            bool2 = JsonUtils.getBoolean(this.f27172a, str, bool);
        }
        return bool2;
    }

    public double a(String str, double d) {
        double d2;
        synchronized (this.f27173b) {
            d2 = JsonUtils.getDouble(this.f27172a, str, d);
        }
        return d2;
    }

    public void b(String str, long j2) {
        synchronized (this.f27173b) {
            JsonUtils.putLong(this.f27172a, str, j2);
        }
    }

    public float a(String str, float f2) {
        float f3;
        synchronized (this.f27173b) {
            f3 = JsonUtils.getFloat(this.f27172a, str, f2);
        }
        return f3;
    }

    public void b(String str, String str2) {
        synchronized (this.f27173b) {
            JsonUtils.putString(this.f27172a, str, str2);
        }
    }

    public int a(String str, int i2) {
        int i3;
        synchronized (this.f27173b) {
            i3 = JsonUtils.getInt(this.f27172a, str, i2);
        }
        return i3;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f27173b) {
            integerList = JsonUtils.getIntegerList(this.f27172a, str, list);
        }
        return integerList;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f27173b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f27172a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f27173b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f27172a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j2) {
        long j3;
        synchronized (this.f27173b) {
            j3 = JsonUtils.getLong(this.f27172a, str, j2);
        }
        return j3;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f27173b) {
            string = JsonUtils.getString(this.f27172a, str, str2);
        }
        return string;
    }

    public boolean a(String str) {
        boolean has;
        synchronized (this.f27173b) {
            has = this.f27172a.has(str);
        }
        return has;
    }

    public void a(String str, boolean z2) {
        synchronized (this.f27173b) {
            JsonUtils.putBoolean(this.f27172a, str, z2);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f27173b) {
            JsonUtils.putObject(this.f27172a, str, obj);
        }
    }

    public JSONObject a() {
        JSONObject deepCopy;
        synchronized (this.f27173b) {
            deepCopy = JsonUtils.deepCopy(this.f27172a);
        }
        return deepCopy;
    }
}
