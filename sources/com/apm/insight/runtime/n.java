package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    protected static JSONObject f6050a = new JSONObject();

    public static void a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String a6 = a.a(jSONObject);
            File file = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/configCrash/configNative");
            if (a6 != null) {
                JSONObject jSONObject2 = new JSONObject(a6);
                f6050a = jSONObject2;
                com.apm.insight.l.i.a(file, b(jSONObject2), false);
            } else {
                f6050a = new JSONObject();
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }

    private static JSONArray b(JSONArray jSONArray, f fVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (com.apm.insight.l.l.a(jSONArray)) {
            return jSONArray2;
        }
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i9);
            if (optJSONObject == null) {
                com.apm.insight.c.a().a("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (a(optJSONObject, fVar)) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    public static boolean a(String str, f fVar) {
        if (f6050a == null) {
            return false;
        }
        if (fVar == null) {
            fVar = new f();
        }
        JSONObject optJSONObject = f6050a.optJSONObject(str);
        if (optJSONObject == null || a(optJSONObject.optJSONArray("disable"), fVar)) {
            return false;
        }
        return a(optJSONObject.optJSONArray("enable"), fVar);
    }

    public static JSONObject b(JSONObject jSONObject) {
        StringBuilder sb;
        Iterator<String> keys = jSONObject.keys();
        f fVar = new f();
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"configType".equals(next)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    com.apm.insight.c.a().a("NPTH_CATCH", new IllegalArgumentException(AbstractC2914a.d("err config with key: ", next)));
                } else {
                    if (a(optJSONObject.optJSONArray("disable"), fVar)) {
                        sb = new StringBuilder("match diable ");
                    } else {
                        JSONArray b = b(optJSONObject.optJSONArray("enable"), fVar);
                        if (com.apm.insight.l.l.a(b)) {
                            sb = new StringBuilder("not match ");
                        } else {
                            try {
                                jSONObject2.put(next, new JSONObject().put("enable", b));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    sb.append(next);
                    com.apm.insight.l.q.a((Object) sb.toString());
                }
            }
        }
        return jSONObject2;
    }

    private static boolean a(JSONArray jSONArray, f fVar) {
        if (com.apm.insight.l.l.a(jSONArray)) {
            return false;
        }
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i9);
            if (optJSONObject == null) {
                com.apm.insight.c.a().a("NPTH_CATCH", new IllegalArgumentException("err config: " + jSONArray));
            } else if (a(optJSONObject, fVar)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(JSONObject jSONObject, f fVar) {
        Iterator<String> keys = jSONObject.keys();
        boolean z8 = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                if (next.startsWith("header_")) {
                    if (!a(jSONObject.optJSONObject(next), fVar.b(next.substring(7)))) {
                        com.apm.insight.l.q.a((Object) "not match ".concat(next));
                        return false;
                    }
                    z8 = true;
                } else {
                    if (!next.startsWith("java_")) {
                        com.apm.insight.l.q.a((Object) "no rules match ".concat(next));
                    } else if (!a(jSONObject.optJSONObject(next), fVar.a(next.substring(5)))) {
                        com.apm.insight.l.q.a((Object) "not match ".concat(next));
                        return false;
                    }
                    z8 = true;
                }
            }
        }
        return z8;
    }

    private static boolean a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals("=")) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                if (String.valueOf(optJSONArray.opt(i9)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }
}
