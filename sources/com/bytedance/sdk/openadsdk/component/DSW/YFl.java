package com.bytedance.sdk.openadsdk.component.DSW;

import android.content.Context;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.vc;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.multipro.Sg;
import com.bytedance.sdk.openadsdk.utils.nc;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import m2.l;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public class YFl {
    public static File Sg(String str) {
        return YFl(lG.YFl(), vc.YFl(lG.YFl()).Sg(), str);
    }

    public static File YFl(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((l) CacheDirFactory.getICacheDir(0)).c());
        return new File(e.h(sb2, File.separator, str));
    }

    public static String Sg() {
        return com.bytedance.sdk.component.utils.vc.YFl(lG.YFl(), Sg.tN(), vc.YFl(lG.YFl()).Sg()).getAbsolutePath();
    }

    public static String YFl() {
        return nc.YFl();
    }

    public static File YFl(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.vc.YFl(context, Sg.tN(), str, str2);
    }

    public static void YFl(File file) {
        if (file == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.utils.vc.Sg(file);
        } catch (Throwable unused) {
        }
    }

    public static void YFl(Context context) {
        try {
            vc.YFl(context).YFl();
        } catch (Throwable unused) {
        }
    }

    public static void YFl(JSONObject jSONObject, int i10) {
        try {
            String vc2 = NjR.Sg().vc();
            int DSW = NjR.Sg().DSW();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", vc2);
            jSONObject3.put("app_icon_id", "@".concat(String.valueOf(DSW)));
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject(MimeTypes.BASE_TYPE_VIDEO) == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", lG.AlY().VOe(String.valueOf(i10)));
                jSONObject2.put(MimeTypes.BASE_TYPE_VIDEO, jSONObject4);
            }
        } catch (Exception e2) {
            YoT.YFl("TTAppOpenUtils", e2.getMessage());
        }
    }

    public static int YFl(Wwa wwa, int i10) {
        return i10 - wwa.ep();
    }
}
