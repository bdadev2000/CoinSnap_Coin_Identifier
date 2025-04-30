package com.mbridge.msdk.videocommon.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f19327a;
    private int b;

    public c(String str, int i9) {
        this.f19327a = str;
        this.b = i9;
    }

    private static c c() {
        return new c("Virtual Item", 1);
    }

    public final String a() {
        return this.f19327a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reward{name='");
        sb.append(this.f19327a);
        sb.append("', amount=");
        return o.l(sb, this.b, '}');
    }

    public static c b(String str) {
        c cVar = null;
        try {
            com.mbridge.msdk.videocommon.d.a b = com.mbridge.msdk.videocommon.d.b.a().b();
            if (TextUtils.isEmpty(str)) {
                cVar = c();
            } else if (b != null && b.j() != null) {
                cVar = b.j().get(str);
            }
            return cVar == null ? c() : cVar;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        this.f19327a = str;
    }

    public final void a(int i9) {
        this.b = i9;
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                hashMap.put(optJSONObject.optString("id"), new c(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("name");
            int optInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new c(optString, optInt);
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
