package n6;

import com.facebook.appevents.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22459b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f22460c;

    public a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f22460c = valueOf;
        this.f22459b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        if (valueOf != null) {
            stringBuffer.append(valueOf.longValue());
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
            this.a = stringBuffer2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f22460c;
            if (l10 != null) {
                jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, l10);
            }
            jSONObject.put("error_message", this.f22459b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.a = name;
        JSONObject G = g.G(name);
        if (G != null) {
            this.f22460c = Long.valueOf(G.optLong(CampaignEx.JSON_KEY_TIMESTAMP, 0L));
            this.f22459b = G.optString("error_message", null);
        }
    }
}
