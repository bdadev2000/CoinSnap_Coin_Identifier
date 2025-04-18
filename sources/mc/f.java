package mc;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f22166h = new Date(0);
    public final JSONObject a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f22167b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f22168c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f22169d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f22170e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22171f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f22172g;

    public f(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j3, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j3);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f22167b = jSONObject;
        this.f22168c = date;
        this.f22169d = jSONArray;
        this.f22170e = jSONObject2;
        this.f22171f = j3;
        this.f22172g = jSONArray2;
        this.a = jSONObject3;
    }

    public static f a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = this.f22172g;
            if (i10 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string = jSONObject.getString("rolloutId");
                String string2 = jSONObject.getString("variantId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    String string3 = jSONArray2.getString(i11);
                    if (!hashMap.containsKey(string3)) {
                        hashMap.put(string3, new HashMap());
                    }
                    Map map = (Map) hashMap.get(string3);
                    if (map != null) {
                        map.put(string, string2);
                    }
                }
                i10++;
            } else {
                return hashMap;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.a.toString().equals(((f) obj).toString());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
