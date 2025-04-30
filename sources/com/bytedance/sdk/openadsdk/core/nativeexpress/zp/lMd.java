package com.bytedance.sdk.openadsdk.core.nativeexpress.zp;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.model.vwr;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.model.zp;
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

/* loaded from: classes.dex */
public class lMd {
    private static String lMd(woN.zp zpVar) {
        com.bytedance.sdk.component.adexpress.zp.KS.lMd KS;
        if (zpVar != null) {
            String ku = zpVar.ku();
            if (TextUtils.isEmpty(ku) && (KS = com.bytedance.sdk.component.adexpress.zp.lMd.lMd.KS(zpVar.COT())) != null) {
                return KS.COT();
            }
            return ku;
        }
        return "";
    }

    public static boolean zp() {
        return true;
    }

    public static JSONObject zp(float f9, float f10, boolean z8, @NonNull woN won) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f9);
            jSONObject2.put("height", f10);
            if (z8) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            if ((won instanceof vwr) && ((vwr) won).THm()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("choose_ui_data", jSONObject3);
                zp.C0110zp Vs = ((vwr) won).Vs();
                JSONObject lMd = Vs.lMd();
                if (TextUtils.isEmpty(Vs.ku())) {
                    lMd.put(DataSchemeDataSource.SCHEME_DATA, lMd(Vs));
                }
                jSONObject3.put("tpl_info", lMd);
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("creatives", jSONArray);
                for (woN won2 : ((vwr) won).xHP()) {
                    JSONObject zp = zp(false, won2);
                    if (zp != null) {
                        zp.put("template_Plugin", lMd(won2.fRl()));
                        zp.put("diff_template_Plugin", zp(won2.fRl()));
                        jSONArray.put(zp);
                    }
                }
                return jSONObject;
            }
            jSONObject.put("creative", zp(false, won));
            jSONObject.put("template_Plugin", lMd(won.fRl()));
            jSONObject.put("diff_template_Plugin", zp(won.fRl()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String zp(woN.zp zpVar) {
        if (zpVar != null) {
            return zpVar.YW();
        }
        return "";
    }

    public static JSONObject zp(boolean z8, @NonNull woN won) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", won.oB());
            if (won.BO() != null) {
                if (won.BO() != null && !TextUtils.isEmpty(won.BO().zp())) {
                    jSONObject.put(RewardPlus.ICON, won.BO().zp());
                } else {
                    jSONObject.put(RewardPlus.ICON, "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (won.Rg() != null) {
                for (int i9 = 0; i9 < won.Rg().size(); i9++) {
                    rV rVVar = won.Rg().get(i9);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", rVVar.KS());
                    jSONObject2.put("width", rVVar.lMd());
                    jSONObject2.put("url", rVVar.zp());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", won.mW());
            jSONObject.put("interaction_type", won.oKZ());
            jSONObject.put("interaction_method", won.dQp());
            jSONObject.put("is_compliance_template", zp());
            jSONObject.put(CampaignEx.JSON_KEY_TITLE, won.rCC());
            jSONObject.put("description", won.MBR());
            jSONObject.put("source", won.Pxi());
            if (won.Vjb() != null) {
                jSONObject.put("comment_num", won.Vjb().COT());
                jSONObject.put("score", won.Vjb().jU());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, won.Vjb().HWF());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, won.Vjb().ku());
            }
            com.bykv.vk.openvk.component.video.api.KS.lMd eWG = won.eWG();
            if (eWG != null) {
                JSONObject vwr = eWG.vwr();
                vwr.put("video_duration", eWG.HWF() * eWG.ot());
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, vwr);
            }
            if (won.fRl() != null) {
                jSONObject.put("dynamic_creative", won.fRl().dT());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String zp(woN won, String str) {
        List<rV> Rg;
        if (won != null && (Rg = won.Rg()) != null && Rg.size() > 0) {
            for (rV rVVar : Rg) {
                if (rVVar != null && TextUtils.equals(str, rVVar.zp())) {
                    return rVVar.QR();
                }
            }
        }
        return null;
    }

    public static Map<String, String> zp(woN won) {
        HashMap hashMap = null;
        if (won == null) {
            return null;
        }
        List<rV> Rg = won.Rg();
        if (Rg != null && Rg.size() > 0) {
            hashMap = new HashMap();
            for (rV rVVar : Rg) {
                if (rVVar != null) {
                    hashMap.put(rVVar.zp(), rVVar.QR());
                }
            }
        }
        return hashMap;
    }
}
