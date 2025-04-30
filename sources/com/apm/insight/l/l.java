package com.apm.insight.l;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {
    public static int a(@Nullable JSONObject jSONObject, int i9, String... strArr) {
        JSONObject c9 = c(jSONObject, strArr);
        if (c9 == null) {
            return i9;
        }
        int optInt = c9.optInt(strArr[strArr.length - 1], i9);
        q.a("JSONUtil", "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + optInt);
        return optInt;
    }

    @Nullable
    public static String b(@Nullable JSONObject jSONObject, String... strArr) {
        JSONObject c9 = c(jSONObject, strArr);
        if (c9 == null) {
            return null;
        }
        String optString = c9.optString(strArr[strArr.length - 1]);
        q.a("ApmConfig", "normal get configArray: " + strArr[strArr.length - 1] + " : " + optString);
        return optString;
    }

    @Nullable
    public static JSONObject c(@Nullable JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            q.a("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i9 = 0; i9 < strArr.length - 1; i9++) {
            jSONObject = jSONObject.optJSONObject(strArr[i9]);
            if (jSONObject == null) {
                q.a("JSONUtil", "err get json: not found node:" + strArr[i9]);
                return null;
            }
        }
        return jSONObject;
    }

    public static JSONArray a(int i9, int i10, JSONArray jSONArray) {
        int i11 = i10 + i9;
        if (jSONArray.length() <= i11) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < i9; i12++) {
            jSONArray2.put(jSONArray.opt(i12));
        }
        while (i9 < i11) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (i11 - i9)));
            i9++;
        }
        return jSONArray2;
    }

    public static HashMap<String, Object> b(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }

    @Nullable
    public static JSONArray a(@Nullable JSONObject jSONObject, String... strArr) {
        JSONObject c9 = c(jSONObject, strArr);
        if (c9 == null) {
            return null;
        }
        JSONArray optJSONArray = c9.optJSONArray(strArr[strArr.length - 1]);
        q.a("ApmConfig", "normal get configArray: " + strArr[strArr.length - 1] + " : " + optJSONArray);
        return optJSONArray;
    }

    @Nullable
    public static JSONArray a(@Nullable String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return a(jSONObject) || a(jSONObject.optJSONArray(str));
    }
}
