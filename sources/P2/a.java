package P2;

import G7.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f2412a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public Long f2413c;

    public a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f2413c = valueOf;
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(valueOf.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        j.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f2412a = stringBuffer2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f2413c;
            if (l != null) {
                jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, l);
            }
            jSONObject.put("error_message", this.b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        j.d(jSONObject2, "params.toString()");
        return jSONObject2;
    }
}
