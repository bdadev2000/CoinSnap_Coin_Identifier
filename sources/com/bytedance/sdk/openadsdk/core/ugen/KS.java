package com.bytedance.sdk.openadsdk.core.ugen;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    public static JSONObject zp(woN won, String str) {
        JSONObject Eg = won.Eg();
        try {
            Eg.put("show_dislike", won.bQm());
            Eg.put("language", Bj.zp());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String COT = ku.lMd().COT();
                int HWF = ku.lMd().HWF();
                jSONObject.put("app_name", COT);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(HWF)));
                Eg.put("open_app_info", jSONObject);
            }
        } catch (Throwable th) {
            tG.zp("UgenUtils", "parseUGenDataInfo excaption", th.getMessage());
        }
        return Eg;
    }

    public static boolean zp(woN won) {
        return won != null && won.yRU() == 7;
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [boolean] */
    public static JSONObject zp(woN won, com.bytedance.sdk.openadsdk.core.ugen.jU.lMd lmd) {
        String str;
        ?? isEmpty;
        lmd.zp();
        JSONObject jSONObject = null;
        try {
            str = "";
            woN.zp fRl = won.fRl();
            if (won.fRl() != null) {
                str = fRl.KVG();
            }
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(fRl.dQp()) && !TextUtils.isEmpty(fRl.COT())) {
                str = com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp().zp("ad", fRl.COT(), fRl.dQp());
            }
            isEmpty = TextUtils.isEmpty(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (isEmpty != 0) {
                lmd.zp(3, "local data is null", ImagesContract.LOCAL);
                return null;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                try {
                    lmd.zp(ImagesContract.LOCAL);
                    return jSONObject2;
                } catch (JSONException unused) {
                    lmd.zp(2, "parse json exception data is ".concat(String.valueOf(str)), ImagesContract.LOCAL);
                    return null;
                }
            } catch (JSONException unused2) {
            }
        } catch (Throwable th2) {
            jSONObject = isEmpty;
            th = th2;
            lmd.zp(2, "get template error " + th.getMessage(), ImagesContract.LOCAL);
            return jSONObject;
        }
    }
}
