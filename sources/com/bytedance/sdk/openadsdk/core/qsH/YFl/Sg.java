package com.bytedance.sdk.openadsdk.core.qsH.YFl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.YoT;
import com.bytedance.sdk.openadsdk.core.eT.wN.tN;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.UZM;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.YFl;
import com.bytedance.sdk.openadsdk.core.model.qO;
import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.a;

/* loaded from: classes.dex */
public class Sg {
    private static String YFl = "";

    public static boolean Sg() {
        return true;
    }

    public static String YFl() {
        return YFl;
    }

    private static JSONObject Sg(Wwa wwa) {
        JSONObject jSONObject = new JSONObject();
        try {
            hQ.YFl(jSONObject, wwa);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject YFl(float f10, float f11, boolean z10, @NonNull Wwa wwa) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            if ((wwa instanceof qO) && ((qO) wwa).Wm()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("choose_ui_data", jSONObject3);
                YFl.C0128YFl KY = ((qO) wwa).KY();
                JSONObject Sg = KY.Sg();
                if (TextUtils.isEmpty(KY.NjR())) {
                    Sg.put(DataSchemeDataSource.SCHEME_DATA, Sg(KY));
                }
                jSONObject3.put("tpl_info", Sg);
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("creatives", jSONArray);
                for (Wwa wwa2 : ((qO) wwa).OIY()) {
                    JSONObject YFl2 = YFl(false, wwa2);
                    if (YFl2 != null) {
                        YFl2.put("template_Plugin", Sg(wwa2.lu()));
                        YFl2.put("diff_template_Plugin", YFl(wwa2.lu()));
                        jSONArray.put(YFl2);
                    }
                }
                return jSONObject;
            }
            jSONObject.put("creative", YFl(false, wwa));
            jSONObject.put("template_Plugin", Sg(wwa.lu()));
            jSONObject.put("diff_template_Plugin", YFl(wwa.lu()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String Sg(Wwa.YFl yFl) {
        com.bytedance.sdk.component.adexpress.YFl.tN.Sg tN;
        if (yFl == null) {
            return "";
        }
        String NjR = yFl.NjR();
        return (!TextUtils.isEmpty(NjR) || (tN = com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.tN(yFl.vc())) == null) ? NjR : tN.wN();
    }

    public static JSONObject YFl(float f10, float f11, boolean z10, @NonNull Wwa wwa, tN tNVar) {
        YFl = "";
        JSONObject ni2 = wwa.ni();
        try {
            JSONObject Sg = hQ.Sg(wwa);
            Sg.put("language", YoT.YFl());
            ni2.put("xSetting", Sg);
            ni2.put("xAdInfo", Sg(wwa));
            JSONObject jSONObject = new JSONObject();
            hQ.Sg(jSONObject);
            jSONObject.put("platform", "android");
            ni2.put("xAppInfo", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            ni2.put("xSize", jSONObject2);
            tNVar.YFl("adv3");
            UZM UI = wwa.UI();
            if (UI != null) {
                String AlY = UI.AlY();
                if (!TextUtils.isEmpty(AlY)) {
                    ni2.put("xTemplate", new JSONObject(AlY));
                    YFl = "getTemplate success by local data";
                    tNVar.Sg(ImagesContract.LOCAL);
                } else {
                    String YFl2 = com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl().YFl("adv3", UI.YFl(), UI.Sg());
                    if (!TextUtils.isEmpty(YFl2)) {
                        ni2.put("xTemplate", new JSONObject(YFl2));
                        YFl = "getTemplate success by db data";
                        tNVar.Sg(ImagesContract.LOCAL);
                    } else {
                        String str = "local db data is null id is " + UI.YFl() + " md5 is " + UI.Sg();
                        YFl = str;
                        tNVar.YFl(3, str, "net");
                    }
                }
            }
        } catch (Exception e2) {
            String str2 = "load template exception " + e2.getMessage();
            YFl = str2;
            tNVar.YFl(3, str2, "net");
        }
        return ni2;
    }

    public static JSONObject YFl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray optJSONArray = jSONObject2.optJSONArray("keys");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    String optString = optJSONArray.optString(i10);
                    if (jSONObject.has(optString)) {
                        jSONObject3.put(optString, jSONObject.opt(optString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String YFl(Wwa.YFl yFl) {
        return yFl != null ? yFl.nc() : "";
    }

    public static JSONObject YFl(boolean z10, @NonNull Wwa wwa) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", wwa.lL());
            if (wwa.dGX() != null) {
                if (wwa.dGX() != null && !TextUtils.isEmpty(wwa.dGX().YFl())) {
                    jSONObject.put(RewardPlus.ICON, wwa.dGX().YFl());
                } else {
                    jSONObject.put(RewardPlus.ICON, "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (wwa.VB() != null) {
                for (int i10 = 0; i10 < wwa.VB().size(); i10++) {
                    EH eh2 = wwa.VB().get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", eh2.tN());
                    jSONObject2.put("width", eh2.Sg());
                    jSONObject2.put("url", eh2.YFl());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", wwa.ZLB());
            jSONObject.put("interaction_type", wwa.ko());
            jSONObject.put("interaction_method", wwa.lG());
            jSONObject.put("is_compliance_template", Sg());
            jSONObject.put(CampaignEx.JSON_KEY_TITLE, wwa.Hjb());
            jSONObject.put("description", wwa.dd());
            jSONObject.put("source", wwa.zG());
            if (wwa.in() != null) {
                jSONObject.put("comment_num", wwa.in().wN());
                jSONObject.put("score", wwa.in().AlY());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, wwa.in().vc());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, wwa.in().qsH());
            }
            a BPI = wwa.BPI();
            if (BPI != null) {
                JSONObject b3 = BPI.b();
                b3.put("video_duration", BPI.f23459d * BPI.f23473r);
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, b3);
            }
            if (wwa.lu() != null) {
                jSONObject.put("dynamic_creative", wwa.lu().eT());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String YFl(Wwa wwa, String str) {
        List<EH> VB;
        if (wwa != null && (VB = wwa.VB()) != null && VB.size() > 0) {
            for (EH eh2 : VB) {
                if (eh2 != null && TextUtils.equals(str, eh2.YFl())) {
                    return eh2.DSW();
                }
            }
        }
        return null;
    }

    public static Map<String, String> YFl(Wwa wwa) {
        HashMap hashMap = null;
        if (wwa == null) {
            return null;
        }
        List<EH> VB = wwa.VB();
        if (VB != null && VB.size() > 0) {
            hashMap = new HashMap();
            for (EH eh2 : VB) {
                if (eh2 != null) {
                    hashMap.put(eh2.YFl(), eh2.DSW());
                }
            }
        }
        return hashMap;
    }
}
