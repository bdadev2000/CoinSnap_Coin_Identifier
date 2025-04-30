package com.bytedance.sdk.component.adexpress.dynamic.jU;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.jU.COT;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class HWF {
    private static HashMap<String, String> QR;
    private KS COT;
    private com.bytedance.sdk.component.adexpress.dynamic.KS.jU HWF;
    private com.bytedance.sdk.component.adexpress.dynamic.KS.KS KS;
    private zp jU;
    private JSONObject lMd;
    private JSONObject zp;

    /* loaded from: classes.dex */
    public static class zp {
        boolean KS;
        float lMd;
        float zp;

        public static zp zp(JSONObject jSONObject) {
            zp zpVar = new zp();
            if (jSONObject != null) {
                zpVar.zp = (float) jSONObject.optDouble("width");
                zpVar.lMd = (float) jSONObject.optDouble("height");
                zpVar.KS = jSONObject.optBoolean("isLandscape");
            }
            return zpVar;
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        QR = hashMap;
        hashMap.put("subtitle", "description");
        QR.put("source", "source|app.app_name");
        QR.put("screenshot", "dynamic_creative.screenshot");
    }

    public HWF(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.zp = jSONObject;
        this.lMd = jSONObject2;
        this.KS = new com.bytedance.sdk.component.adexpress.dynamic.KS.KS(jSONObject2);
        this.jU = zp.zp(jSONObject3);
        this.HWF = com.bytedance.sdk.component.adexpress.dynamic.KS.jU.zp(jSONObject4);
    }

    private void lMd(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        com.bytedance.sdk.component.adexpress.dynamic.KS.KS ks;
        Object zp2;
        Object zp3;
        Object zp4;
        Object zp5;
        if (kuVar == null || (ks = this.KS) == null || (zp2 = ks.zp("image.0.url")) == null) {
            return;
        }
        String valueOf = String.valueOf(zp2);
        if (TextUtils.isEmpty(valueOf) || (zp3 = this.KS.zp(CampaignEx.JSON_KEY_TITLE)) == null) {
            return;
        }
        String valueOf2 = String.valueOf(zp3);
        if (TextUtils.isEmpty(valueOf2) || (zp4 = this.KS.zp("description")) == null) {
            return;
        }
        String valueOf3 = String.valueOf(zp4);
        if (TextUtils.isEmpty(valueOf3) || (zp5 = this.KS.zp(RewardPlus.ICON)) == null) {
            return;
        }
        String valueOf4 = String.valueOf(zp5);
        if (TextUtils.isEmpty(valueOf4)) {
            return;
        }
        Object zp6 = this.KS.zp("app.app_name");
        Object zp7 = this.KS.zp("source");
        if (zp6 == null && zp7 == null) {
            return;
        }
        if (zp6 == null) {
            zp6 = zp7;
        }
        String valueOf5 = String.valueOf(zp6);
        if (TextUtils.isEmpty(valueOf5)) {
            return;
        }
        kuVar.zp("imageUrl", valueOf);
        kuVar.zp(CampaignEx.JSON_KEY_TITLE, valueOf2);
        kuVar.zp("description", valueOf3);
        kuVar.zp(RewardPlus.ICON, valueOf4);
        kuVar.zp("app_name", valueOf5);
        kuVar.zp(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.KS.ku zp(double d2, int i9, double d9, String str, tG tGVar) {
        JSONObject jSONObject;
        this.KS.zp();
        try {
            jSONObject = new JSONObject(this.HWF.lMd);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.KS.ku zp2 = zp(jU.zp(this.zp, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.KS.ku) null);
        zp(zp2);
        COT cot = new COT(d2, i9, d9, str, tGVar);
        COT.zp zpVar = new COT.zp();
        zp zpVar2 = this.jU;
        zpVar.zp = zpVar2.zp;
        zpVar.lMd = zpVar2.lMd;
        zpVar.KS = 0.0f;
        cot.zp(zpVar);
        cot.zp(zp2, 0.0f, 0.0f);
        cot.zp();
        com.bytedance.sdk.component.adexpress.dynamic.KS.lMd lmd = cot.zp;
        if (lmd.jU == 65536.0f) {
            return null;
        }
        return lmd.HWF;
    }

    private void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        if (kuVar == null) {
            return;
        }
        int lMd = com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp()));
        zp zpVar = this.jU;
        float min = zpVar.KS ? zpVar.zp : Math.min(zpVar.zp, lMd);
        if (this.jU.lMd == 0.0f) {
            kuVar.COT(min);
            kuVar.dT().COT().dT("auto");
            kuVar.HWF(0.0f);
        } else {
            kuVar.COT(min);
            int lMd2 = com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), com.bytedance.sdk.component.adexpress.jU.QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp()));
            zp zpVar2 = this.jU;
            kuVar.HWF(zpVar2.KS ? zpVar2.lMd : Math.min(zpVar2.lMd, lMd2));
            kuVar.dT().COT().dT("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.KS.ku zp(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.HWF != null) {
                KS ks = new KS();
                this.COT = ks;
                JSONObject zp2 = ks.zp(this.HWF.zp, optInt, jSONObject);
                if (zp2 != null) {
                    jSONObject = zp2;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.KS.ku zp3 = zp(jSONObject);
        zp3.zp(kuVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            zp3.zp((List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>) null);
            return zp3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i9);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    length = zp3.dT().COT().zpV();
                } else {
                    length = optJSONArray2.length();
                }
                for (int i10 = 0; i10 < length; i10++) {
                    com.bytedance.sdk.component.adexpress.dynamic.KS.ku zp4 = zp(optJSONArray2.optJSONObject(i10), zp3);
                    if (com.bytedance.sdk.component.adexpress.jU.lMd() && "skip-with-time".equals(zp3.dT().lMd()) && !"transparent".equals(zp3.yRU()) && !TextUtils.isEmpty(zp3.yRU())) {
                        zp4.KS(zp3.yRU());
                    }
                    arrayList.add(zp4);
                    arrayList3.add(zp4);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            zp3.zp(arrayList);
        }
        if (arrayList2.size() > 0) {
            zp3.lMd(arrayList2);
        }
        return zp3;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.KS.ku zp(JSONObject jSONObject) {
        String zp2;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        YW.zp(optString, optJSONObject);
        JSONObject zp3 = YW.zp(optString, YW.zp(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar = new com.bytedance.sdk.component.adexpress.dynamic.KS.ku();
        if (TextUtils.isEmpty(optString2)) {
            kuVar.lMd(String.valueOf(kuVar.hashCode()));
        } else {
            kuVar.lMd(optString2);
        }
        if (optJSONObject != null) {
            lMd(kuVar);
            kuVar.KS((float) optJSONObject.optDouble("x"));
            kuVar.jU((float) optJSONObject.optDouble("y"));
            kuVar.COT((float) optJSONObject.optDouble("width"));
            kuVar.HWF((float) optJSONObject.optDouble("height"));
            kuVar.QR(optJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.KS.COT cot = new com.bytedance.sdk.component.adexpress.dynamic.KS.COT();
            cot.zp(optString);
            cot.lMd(optJSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
            cot.KS(optJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.KS.HWF zp4 = com.bytedance.sdk.component.adexpress.dynamic.KS.HWF.zp(optJSONObject);
            cot.zp(zp4);
            com.bytedance.sdk.component.adexpress.dynamic.KS.HWF zp5 = com.bytedance.sdk.component.adexpress.dynamic.KS.HWF.zp(zp3);
            if (zp5 == null) {
                cot.lMd(zp4);
            } else {
                cot.lMd(zp5);
            }
            zp(zp4);
            zp(zp5);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.lMd) != null) {
                zp(cot, jSONObject2.optInt("image_mode"));
            }
            String lMd = cot.lMd();
            com.bytedance.sdk.component.adexpress.dynamic.KS.HWF COT = cot.COT();
            if (QR.containsKey(lMd) && !COT.oB()) {
                COT.cz(QR.get(lMd));
            }
            if (COT.oB()) {
                zp2 = cot.KS();
            } else {
                zp2 = zp(cot.KS());
            }
            if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                if (TextUtils.equals(lMd, "star") || TextUtils.equals(lMd, "text_star")) {
                    zp2 = zp("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(lMd, "score-count") || TextUtils.equals(lMd, "score-count-type-1") || TextUtils.equals(lMd, "score-count-type-2")) {
                    zp2 = zp("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(lMd) && zp4.fw()) {
                    zp2 = zp("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(zp()) && (TextUtils.equals("logo-union", optString) || TextUtils.equals("logo", optString))) {
                StringBuilder c9 = AbstractC2965e.c(zp2, "adx:");
                c9.append(zp());
                cot.lMd(c9.toString());
            } else {
                cot.lMd(zp2);
            }
            kuVar.zp(cot);
        }
        return kuVar;
    }

    private void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.COT cot, int i9) {
        int lastIndexOf;
        if (i9 != 5 && i9 != 15 && i9 != 50 && i9 != 154) {
            cot.zp("image");
            String zp2 = YW.zp("image");
            com.bytedance.sdk.component.adexpress.dynamic.KS.HWF COT = cot.COT();
            COT.cz(zp2);
            cot.QR().cz(zp2);
            String zp3 = YW.zp("image", "clickArea");
            if (!TextUtils.isEmpty(zp3)) {
                COT.dQp(zp3);
                cot.QR().dQp(zp3);
            }
            JSONObject uVa = COT.uVa();
            if (uVa != null) {
                COT.yRU(uVa.optString("imageLottieTosPath"));
                COT.vDp(uVa.optBoolean("animationsLoop"));
                COT.Lij(uVa.optInt("lottieAppNameMaxLength"));
                COT.irS(uVa.optInt("lottieAdDescMaxLength"));
                COT.Gzh(uVa.optInt("lottieAdTitleMaxLength"));
            }
            cot.lMd(zp2);
            if (zp2 != null && (lastIndexOf = zp2.lastIndexOf(".")) > 0) {
                String substring = zp2.substring(0, lastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", zp(substring + ".width"));
                    jSONObject.put("height", zp(substring + ".height"));
                } catch (JSONException unused) {
                }
                cot.KS(jSONObject.toString());
            }
            COT.WLq();
            return;
        }
        cot.zp(MimeTypes.BASE_TYPE_VIDEO);
        String zp4 = YW.zp(MimeTypes.BASE_TYPE_VIDEO);
        cot.COT().cz(zp4);
        String zp5 = YW.zp(MimeTypes.BASE_TYPE_VIDEO, "clickArea");
        if (!TextUtils.isEmpty(zp5)) {
            cot.COT().dQp(zp5);
            cot.QR().dQp(zp5);
        }
        cot.QR().cz(zp4);
        cot.lMd(zp4);
        cot.COT().NJ();
    }

    private String zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.KS.lMd(str2)) {
                String valueOf = String.valueOf(this.KS.zp(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    private String zp() {
        com.bytedance.sdk.component.adexpress.dynamic.KS.KS ks = this.KS;
        if (ks == null) {
            return "";
        }
        return String.valueOf(ks.zp("adx_name"));
    }

    private void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.HWF hwf) {
        if (hwf == null) {
            return;
        }
        String QUv = hwf.QUv();
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            String KS = com.bytedance.sdk.component.adexpress.jU.QR.KS(com.bytedance.sdk.component.adexpress.jU.zp());
            if ("zh".equals(KS)) {
                KS = "cn";
            }
            if (!TextUtils.isEmpty(KS) && hwf.HWF() != null) {
                String optString = hwf.HWF().optString(KS);
                if (!TextUtils.isEmpty(optString)) {
                    QUv = optString;
                }
            }
        }
        if (TextUtils.isEmpty(QUv)) {
            return;
        }
        int indexOf = QUv.indexOf("{{");
        int indexOf2 = QUv.indexOf("}}");
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf2 >= indexOf) {
            String zp2 = zp(QUv.substring(indexOf + 2, indexOf2));
            StringBuilder sb = new StringBuilder(QUv.substring(0, indexOf));
            if (!TextUtils.isEmpty(zp2)) {
                sb.append(zp2);
            }
            sb.append(QUv.substring(indexOf2 + 2));
            hwf.vDp(sb.toString());
            return;
        }
        hwf.vDp(QUv);
    }
}
