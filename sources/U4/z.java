package U4;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final long f3337d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f3338a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3339c;

    public z(String str, String str2, long j7) {
        this.f3338a = str;
        this.b = str2;
        this.f3339c = j7;
    }

    public static String a(String str, long j7, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(BidResponsed.KEY_TOKEN, str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, j7);
            return jSONObject.toString();
        } catch (JSONException e4) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e4);
            return null;
        }
    }

    public static z b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new z(jSONObject.getString(BidResponsed.KEY_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(CampaignEx.JSON_KEY_TIMESTAMP));
            } catch (JSONException e4) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e4);
                return null;
            }
        }
        return new z(str, null, 0L);
    }
}
