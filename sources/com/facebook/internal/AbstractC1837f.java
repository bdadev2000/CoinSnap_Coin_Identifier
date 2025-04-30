package com.facebook.internal;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1837f {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f13613a;

    static {
        HashMap hashMap = new HashMap();
        f13613a = hashMap;
        hashMap.put(Boolean.class, new C1836e(0));
        hashMap.put(Integer.class, new C1836e(1));
        hashMap.put(Long.class, new C1836e(2));
        hashMap.put(Double.class, new C1836e(3));
        hashMap.put(String.class, new C1836e(4));
        hashMap.put(String[].class, new C1836e(5));
        hashMap.put(JSONArray.class, new C1836e(6));
    }

    public static final Bundle a(JSONObject jSONObject) {
        G7.j.e(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    C1836e c1836e = (C1836e) f13613a.get(obj.getClass());
                    if (c1836e != null) {
                        G7.j.d(next, "key");
                        c1836e.a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException(G7.j.j(obj.getClass(), "Unsupported type: "));
                    }
                }
            }
        }
        return bundle;
    }
}
