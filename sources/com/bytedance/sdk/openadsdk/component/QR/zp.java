package com.bytedance.sdk.openadsdk.component.QR;

import android.content.Context;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.HWF;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.multipro.lMd;
import com.bytedance.sdk.openadsdk.utils.dT;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class zp {
    public static File lMd(String str) {
        return zp(KVG.zp(), HWF.zp(KVG.zp()).lMd(), str);
    }

    public static File zp(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(CacheDirFactory.getICacheDir(0).lMd());
        return new File(AbstractC2914a.h(sb, File.separator, str));
    }

    public static String lMd() {
        return com.bytedance.sdk.component.utils.HWF.zp(KVG.zp(), lMd.KS(), HWF.zp(KVG.zp()).lMd()).getAbsolutePath();
    }

    public static String zp() {
        return dT.zp();
    }

    public static File zp(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.HWF.zp(context, lMd.KS(), str, str2);
    }

    public static void zp(File file) {
        if (file == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.utils.HWF.lMd(file);
        } catch (Throwable unused) {
        }
    }

    public static void zp(Context context) {
        try {
            HWF.zp(context).zp();
        } catch (Throwable unused) {
        }
    }

    public static void zp(JSONObject jSONObject, int i9) {
        try {
            String COT = ku.lMd().COT();
            int HWF = ku.lMd().HWF();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", COT);
            jSONObject3.put("app_icon_id", "@".concat(String.valueOf(HWF)));
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject(MimeTypes.BASE_TYPE_VIDEO) == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", KVG.jU().ot(String.valueOf(i9)));
                jSONObject2.put(MimeTypes.BASE_TYPE_VIDEO, jSONObject4);
            }
        } catch (Exception e4) {
            tG.zp("TTAppOpenUtils", e4.getMessage());
        }
    }

    public static int zp(woN won, int i9) {
        return i9 - won.Sr();
    }
}
