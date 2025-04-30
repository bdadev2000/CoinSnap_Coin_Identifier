package L2;

import G7.j;
import android.os.Build;
import com.facebook.appevents.n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f1717a;
    public b b;

    /* renamed from: c, reason: collision with root package name */
    public JSONArray f1718c;

    /* renamed from: d, reason: collision with root package name */
    public String f1719d;

    /* renamed from: e, reason: collision with root package name */
    public String f1720e;

    /* renamed from: f, reason: collision with root package name */
    public String f1721f;

    /* renamed from: g, reason: collision with root package name */
    public Long f1722g;

    public final boolean a() {
        int i9;
        b bVar = this.b;
        if (bVar == null) {
            i9 = -1;
        } else {
            i9 = c.f1716a[bVar.ordinal()];
        }
        Long l = this.f1722g;
        if (i9 != 1) {
            String str = this.f1721f;
            if (i9 != 2) {
                if ((i9 != 3 && i9 != 4 && i9 != 5) || str == null || l == null) {
                    return false;
                }
            } else if (str == null || this.f1720e == null || l == null) {
                return false;
            }
        } else if (this.f1718c == null || l == null) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (!a()) {
            return;
        }
        n.w(this.f1717a, toString());
    }

    public final String toString() {
        int i9;
        b bVar = this.b;
        if (bVar == null) {
            i9 = -1;
        } else {
            i9 = c.f1716a[bVar.ordinal()];
        }
        Long l = this.f1722g;
        JSONObject jSONObject = null;
        try {
            if (i9 != 1) {
                if (i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("device_os_version", Build.VERSION.RELEASE);
                    jSONObject2.put("device_model", Build.MODEL);
                    String str = this.f1719d;
                    if (str != null) {
                        jSONObject2.put("app_version", str);
                    }
                    if (l != null) {
                        jSONObject2.put(CampaignEx.JSON_KEY_TIMESTAMP, l);
                    }
                    String str2 = this.f1720e;
                    if (str2 != null) {
                        jSONObject2.put("reason", str2);
                    }
                    String str3 = this.f1721f;
                    if (str3 != null) {
                        jSONObject2.put("callstack", str3);
                    }
                    if (bVar != null) {
                        jSONObject2.put("type", bVar);
                    }
                    jSONObject = jSONObject2;
                }
            } else {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = this.f1718c;
                if (jSONArray != null) {
                    jSONObject3.put("feature_names", jSONArray);
                }
                if (l != null) {
                    jSONObject3.put(CampaignEx.JSON_KEY_TIMESTAMP, l);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String jSONObject4 = new JSONObject().toString();
            j.d(jSONObject4, "JSONObject().toString()");
            return jSONObject4;
        }
        String jSONObject5 = jSONObject.toString();
        j.d(jSONObject5, "params.toString()");
        return jSONObject5;
    }
}
