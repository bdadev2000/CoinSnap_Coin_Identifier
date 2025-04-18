package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {
    private Map<String, Integer> a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.b.c> f16344b;

    /* renamed from: c, reason: collision with root package name */
    private long f16345c;

    /* renamed from: d, reason: collision with root package name */
    private long f16346d;

    /* renamed from: e, reason: collision with root package name */
    private long f16347e;

    /* renamed from: f, reason: collision with root package name */
    private long f16348f;

    /* renamed from: g, reason: collision with root package name */
    private long f16349g;

    /* renamed from: h, reason: collision with root package name */
    private long f16350h;

    /* renamed from: j, reason: collision with root package name */
    private String f16352j;

    /* renamed from: i, reason: collision with root package name */
    private int f16351i = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f16353k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f16354l = "";

    public final String a() {
        return this.f16353k;
    }

    public final String b() {
        return this.f16352j;
    }

    public final String c() {
        return this.f16354l;
    }

    public final long d() {
        return this.f16345c * 1000;
    }

    public final long e() {
        return this.f16346d * 1000;
    }

    public final long f() {
        return this.f16347e * 1000;
    }

    public final long g() {
        return this.f16348f;
    }

    public final long h() {
        return this.f16349g;
    }

    public final long i() {
        return this.f16350h;
    }

    public final Map<String, com.mbridge.msdk.videocommon.b.c> j() {
        return this.f16344b;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.b.c> map2 = this.f16344b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.b.c> entry2 : this.f16344b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.b.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.a());
                            jSONObject3.put("amount", value.b());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f16345c);
            jSONObject.put("ruct", this.f16346d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f16347e);
            jSONObject.put("dlct", this.f16348f);
            jSONObject.put("vcct", this.f16349g);
            jSONObject.put("current_time", this.f16350h);
            jSONObject.put("vtag", this.f16353k);
            jSONObject.put("isDefault", this.f16351i);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return jSONObject;
        }
    }

    public final void a(long j3) {
        this.f16345c = j3;
    }

    public final void b(long j3) {
        this.f16346d = j3;
    }

    public final void c(long j3) {
        this.f16347e = j3;
    }

    public final void d(long j3) {
        this.f16348f = j3;
    }

    public final void e(long j3) {
        this.f16349g = j3;
    }

    public final void a(Map<String, Integer> map) {
        this.a = map;
    }

    public final void b(Map<String, com.mbridge.msdk.videocommon.b.c> map) {
        this.f16344b = map;
    }

    public final void a(int i10) {
        this.f16351i = i10;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("caplist");
                    aVar2.f16352j = jSONObject.optString("ab_id", "");
                    aVar2.f16354l = jSONObject.optString("rid", "");
                    if (optJSONObject != null && optJSONObject.length() > 0) {
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys != null && keys.hasNext()) {
                            String next = keys.next();
                            int intValue = Integer.valueOf(optJSONObject.optInt(next, 1000)).intValue();
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && intValue == 0) {
                                    hashMap.put(next, 1000);
                                } else {
                                    hashMap.put(next, Integer.valueOf(intValue));
                                }
                            }
                        }
                        aVar2.a = hashMap;
                    }
                    aVar2.f16344b = com.mbridge.msdk.videocommon.b.c.a(jSONObject.optJSONArray("reward"));
                    aVar2.f16345c = jSONObject.optLong("getpf", 43200L);
                    aVar2.f16346d = jSONObject.optLong("ruct", 5400L);
                    aVar2.f16347e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L);
                    aVar2.f16348f = jSONObject.optLong("dlct", 3600L);
                    aVar2.f16349g = jSONObject.optLong("vcct", 5L);
                    aVar2.f16350h = jSONObject.optLong("current_time");
                    aVar2.f16353k = jSONObject.optString("vtag", "");
                    return aVar2;
                } catch (Exception e2) {
                    e = e2;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        return aVar;
    }
}
