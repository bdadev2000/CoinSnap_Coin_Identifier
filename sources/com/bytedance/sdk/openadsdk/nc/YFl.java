package com.bytedance.sdk.openadsdk.nc;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW;
import com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements tN {
    private final Sg Sg;
    private final Wwa YFl;
    private final Map<String, vc> tN = new HashMap();

    private YFl(Sg sg2, Wwa wwa) {
        this.Sg = sg2;
        this.YFl = wwa;
    }

    public static YFl YFl(Sg sg2, Wwa wwa) {
        return new YFl(sg2, wwa);
    }

    @Override // com.bytedance.sdk.openadsdk.nc.tN
    public void YFl() {
        this.tN.clear();
    }

    private Wwa YFl(JSONObject jSONObject, String str) {
        String YFl;
        if (jSONObject == null) {
            return null;
        }
        Wwa tN = Wwa.tN();
        tN.AlY(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            tN.aIu(str);
        }
        if (this.YFl == null) {
            return tN;
        }
        String YFl2 = tN.in() != null ? tN.in().YFl() : null;
        if (TextUtils.isEmpty(YFl2)) {
            return this.YFl;
        }
        com.bytedance.sdk.openadsdk.core.model.tN in = this.YFl.in();
        if (in != null && YFl2.equals(in.YFl())) {
            return this.YFl;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (in != null) {
            try {
                YFl = in.YFl();
            } catch (JSONException unused) {
            }
        } else {
            YFl = AbstractJsonLexerKt.NULL;
        }
        jSONObject2.put("lu", YFl);
        jSONObject2.put("ju", YFl2);
        Wwa wwa = this.YFl;
        com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, Sco.YFl(wwa), -5, jSONObject2);
        if (in != null && YFl2.contains("play.google.com/store") && !YFl2.contains(Constants.REFERRER)) {
            tN.in().YFl(in.YFl());
        }
        return tN;
    }

    @Override // com.bytedance.sdk.openadsdk.nc.tN
    public void YFl(Context context, JSONObject jSONObject, String str, int i10, boolean z10) {
        JSONObject optJSONObject;
        if (context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA)) == null) {
            return;
        }
        YFl(context, YFl(optJSONObject, str), optJSONObject, i10, z10);
    }

    private void YFl(Context context, Wwa wwa, JSONObject jSONObject, int i10, boolean z10) {
        if (context == null || wwa == null || wwa.in() == null || jSONObject == null || this.Sg == null || this.tN.get(wwa.in().YFl()) != null) {
            return;
        }
        String Sg = Sco.Sg(i10);
        if (TextUtils.isEmpty(Sg)) {
            return;
        }
        this.tN.put(wwa.in().YFl(), YFl(context, wwa, jSONObject, Sg, z10));
    }

    @Override // com.bytedance.sdk.openadsdk.nc.tN
    public void YFl(Context context, JSONObject jSONObject, String str) {
        Wwa wwa;
        if (context == null || (wwa = this.YFl) == null) {
            return;
        }
        DSW.YFl(context, wwa, str).AlY();
    }

    @Override // com.bytedance.sdk.openadsdk.nc.tN
    public void YFl(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA)) == null) {
            return;
        }
        YFl(YFl(optJSONObject, (String) null), optJSONObject);
    }

    private void YFl(Wwa wwa, JSONObject jSONObject) {
        if (this.Sg == null || wwa == null || wwa.in() == null) {
            return;
        }
        String YFl = wwa.in().YFl();
        if (this.tN.containsKey(YFl)) {
            this.tN.remove(YFl);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.Sg.YFl("app_ad_event", jSONObject2);
            } catch (JSONException e2) {
                YoT.YFl("JsAppAdDownloadManager", e2.getMessage());
            }
        }
    }

    private vc YFl(@NonNull Context context, @NonNull Wwa wwa, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10) {
        vc YFl = DSW.YFl(context, wwa, str);
        YFl.YFl(true);
        return YFl;
    }
}
