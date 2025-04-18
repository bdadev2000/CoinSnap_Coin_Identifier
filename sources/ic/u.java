package ic;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final long f19577d = TimeUnit.DAYS.toMillis(7);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19579c;

    public u(String str, String str2, long j3) {
        this.a = str;
        this.f19578b = str2;
        this.f19579c = j3;
    }

    public static String a(long j3, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(BidResponsed.KEY_TOKEN, str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, j3);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e2);
            return null;
        }
    }

    public static u b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new u(jSONObject.getString(BidResponsed.KEY_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(CampaignEx.JSON_KEY_TIMESTAMP));
            } catch (JSONException e2) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e2);
                return null;
            }
        }
        return new u(str, null, 0L);
    }
}
