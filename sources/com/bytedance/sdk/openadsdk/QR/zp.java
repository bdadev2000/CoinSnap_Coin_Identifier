package com.bytedance.sdk.openadsdk.QR;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp implements KS {
    private final Map<String, com.com.bytedance.overseas.sdk.zp.KS> KS = new HashMap();
    private final lMd lMd;
    private final woN zp;

    private zp(lMd lmd, woN won) {
        this.lMd = lmd;
        this.zp = won;
    }

    public static zp zp(lMd lmd, woN won) {
        return new zp(lmd, won);
    }

    @Override // com.bytedance.sdk.openadsdk.QR.KS
    public void zp() {
        this.KS.clear();
    }

    private woN zp(JSONObject jSONObject, String str) {
        String zp;
        if (jSONObject == null) {
            return null;
        }
        woN lMd = woN.lMd();
        lMd.KS(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            lMd.cz(str);
        }
        if (this.zp == null) {
            return lMd;
        }
        String zp2 = lMd.Vjb() != null ? lMd.Vjb().zp() : null;
        if (TextUtils.isEmpty(zp2)) {
            return this.zp;
        }
        com.bytedance.sdk.openadsdk.core.model.KS Vjb = this.zp.Vjb();
        if (Vjb != null && zp2.equals(Vjb.zp())) {
            return this.zp;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (Vjb != null) {
            try {
                zp = Vjb.zp();
            } catch (JSONException unused) {
            }
        } else {
            zp = "null";
        }
        jSONObject2.put("lu", zp);
        jSONObject2.put("ju", zp2);
        woN won = this.zp;
        com.bytedance.sdk.openadsdk.core.jU.zp(won, YhE.zp(won), -5, jSONObject2);
        if (Vjb != null && zp2.contains("play.google.com/store") && !zp2.contains(Constants.REFERRER)) {
            lMd.Vjb().zp(Vjb.zp());
        }
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.QR.KS
    public void zp(Context context, JSONObject jSONObject, String str, int i9, boolean z8) {
        JSONObject optJSONObject;
        if (context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA)) == null) {
            return;
        }
        zp(context, zp(optJSONObject, str), optJSONObject, i9, z8);
    }

    private void zp(Context context, woN won, JSONObject jSONObject, int i9, boolean z8) {
        if (context == null || won == null || won.Vjb() == null || jSONObject == null || this.lMd == null || this.KS.get(won.Vjb().zp()) != null) {
            return;
        }
        String lMd = YhE.lMd(i9);
        if (TextUtils.isEmpty(lMd)) {
            return;
        }
        this.KS.put(won.Vjb().zp(), zp(context, won, jSONObject, lMd, z8));
    }

    @Override // com.bytedance.sdk.openadsdk.QR.KS
    public void zp(Context context, JSONObject jSONObject, String str) {
        zp(context, this.zp, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zp(Context context, woN won, String str) {
        if (context == 0 || won == null) {
            return;
        }
        com.com.bytedance.overseas.sdk.zp.jU.zp(context, won, str).jU();
        if (context instanceof com.bytedance.sdk.openadsdk.core.video.KS.lMd) {
            ((com.bytedance.sdk.openadsdk.core.video.KS.lMd) context).pvr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.QR.KS
    public void zp(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA)) == null) {
            return;
        }
        zp(zp(optJSONObject, (String) null), optJSONObject);
    }

    private void zp(woN won, JSONObject jSONObject) {
        if (this.lMd == null || won == null || won.Vjb() == null) {
            return;
        }
        String zp = won.Vjb().zp();
        if (this.KS.containsKey(zp)) {
            this.KS.remove(zp);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.lMd.zp("app_ad_event", jSONObject2);
            } catch (JSONException e4) {
                tG.zp("JsAppAdDownloadManager", e4.getMessage());
            }
        }
    }

    private com.com.bytedance.overseas.sdk.zp.KS zp(@NonNull Context context, @NonNull woN won, @NonNull JSONObject jSONObject, @NonNull String str, boolean z8) {
        com.com.bytedance.overseas.sdk.zp.KS zp = com.com.bytedance.overseas.sdk.zp.jU.zp(context, won, str);
        zp.zp(true);
        return zp;
    }
}
