package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f19333a;
    private Map<String, com.mbridge.msdk.videocommon.b.c> b;

    /* renamed from: c, reason: collision with root package name */
    private long f19334c;

    /* renamed from: d, reason: collision with root package name */
    private long f19335d;

    /* renamed from: e, reason: collision with root package name */
    private long f19336e;

    /* renamed from: f, reason: collision with root package name */
    private long f19337f;

    /* renamed from: g, reason: collision with root package name */
    private long f19338g;

    /* renamed from: h, reason: collision with root package name */
    private long f19339h;

    /* renamed from: j, reason: collision with root package name */
    private String f19341j;

    /* renamed from: i, reason: collision with root package name */
    private int f19340i = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f19342k = "";
    private String l = "";

    public final String a() {
        return this.f19342k;
    }

    public final String b() {
        return this.f19341j;
    }

    public final String c() {
        return this.l;
    }

    public final long d() {
        return this.f19334c * 1000;
    }

    public final long e() {
        return this.f19335d * 1000;
    }

    public final long f() {
        return this.f19336e * 1000;
    }

    public final long g() {
        return this.f19337f;
    }

    public final long h() {
        return this.f19338g;
    }

    public final long i() {
        return this.f19339h;
    }

    public final Map<String, com.mbridge.msdk.videocommon.b.c> j() {
        return this.b;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f19333a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f19333a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.b.c> map2 = this.b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.b.c> entry2 : this.b.entrySet()) {
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
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f19334c);
            jSONObject.put("ruct", this.f19335d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f19336e);
            jSONObject.put("dlct", this.f19337f);
            jSONObject.put("vcct", this.f19338g);
            jSONObject.put("current_time", this.f19339h);
            jSONObject.put("vtag", this.f19342k);
            jSONObject.put("isDefault", this.f19340i);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public final void a(long j7) {
        this.f19334c = j7;
    }

    public final void b(long j7) {
        this.f19335d = j7;
    }

    public final void c(long j7) {
        this.f19336e = j7;
    }

    public final void d(long j7) {
        this.f19337f = j7;
    }

    public final void e(long j7) {
        this.f19338g = j7;
    }

    public final void a(Map<String, Integer> map) {
        this.f19333a = map;
    }

    public final void b(Map<String, com.mbridge.msdk.videocommon.b.c> map) {
        this.b = map;
    }

    public final void a(int i9) {
        this.f19340i = i9;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("caplist");
                    aVar2.f19341j = jSONObject.optString("ab_id", "");
                    aVar2.l = jSONObject.optString("rid", "");
                    if (optJSONObject != null && optJSONObject.length() > 0) {
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys != null && keys.hasNext()) {
                            String next = keys.next();
                            int optInt = optJSONObject.optInt(next, 1000);
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && optInt == 0) {
                                    hashMap.put(next, 1000);
                                } else {
                                    hashMap.put(next, Integer.valueOf(optInt));
                                }
                            }
                        }
                        aVar2.f19333a = hashMap;
                    }
                    aVar2.b = com.mbridge.msdk.videocommon.b.c.a(jSONObject.optJSONArray("reward"));
                    aVar2.f19334c = jSONObject.optLong("getpf", 43200L);
                    aVar2.f19335d = jSONObject.optLong("ruct", 5400L);
                    aVar2.f19336e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L);
                    aVar2.f19337f = jSONObject.optLong("dlct", 3600L);
                    aVar2.f19338g = jSONObject.optLong("vcct", 5L);
                    aVar2.f19339h = jSONObject.optLong("current_time");
                    aVar2.f19342k = jSONObject.optString("vtag", "");
                    return aVar2;
                } catch (Exception e4) {
                    e = e4;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }
        return aVar;
    }
}
