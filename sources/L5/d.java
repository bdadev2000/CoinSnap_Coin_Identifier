package l5;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f21585h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f21586a;
    public final JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f21587c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f21588d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f21589e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21590f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f21591g;

    public d(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j7, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j7);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.b = jSONObject;
        this.f21587c = date;
        this.f21588d = jSONArray;
        this.f21589e = jSONObject2;
        this.f21590f = j7;
        this.f21591g = jSONArray2;
        this.f21586a = jSONObject3;
    }

    public static d a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new d(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R0.d, java.lang.Object] */
    public static R0.d c() {
        ?? obj = new Object();
        obj.b = new JSONObject();
        obj.f2620c = f21585h;
        obj.f2621d = new JSONArray();
        obj.f2622e = new JSONObject();
        obj.f2619a = 0L;
        obj.f2623f = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i9 = 0;
        while (true) {
            JSONArray jSONArray = this.f21591g;
            if (i9 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i9);
                String string = jSONObject.getString("rolloutId");
                String string2 = jSONObject.getString("variantId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    String string3 = jSONArray2.getString(i10);
                    if (!hashMap.containsKey(string3)) {
                        hashMap.put(string3, new HashMap());
                    }
                    Map map = (Map) hashMap.get(string3);
                    if (map != null) {
                        map.put(string, string2);
                    }
                }
                i9++;
            } else {
                return hashMap;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f21586a.toString().equals(((d) obj).f21586a.toString());
    }

    public final int hashCode() {
        return this.f21586a.hashCode();
    }

    public final String toString() {
        return this.f21586a.toString();
    }
}
