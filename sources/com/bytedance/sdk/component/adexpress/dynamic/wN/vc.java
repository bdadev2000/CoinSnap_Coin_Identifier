package com.bytedance.sdk.component.adexpress.dynamic.wN;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.bytedance.sdk.component.adexpress.dynamic.wN.wN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import eb.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc {
    private static HashMap<String, String> DSW;
    private YFl AlY;
    private JSONObject Sg;
    private JSONObject YFl;
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.tN tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.AlY f10403vc;
    private tN wN;

    /* loaded from: classes.dex */
    public static class YFl {
        float Sg;
        float YFl;
        boolean tN;

        public static YFl YFl(JSONObject jSONObject) {
            YFl yFl = new YFl();
            if (jSONObject != null) {
                yFl.YFl = (float) jSONObject.optDouble("width");
                yFl.Sg = (float) jSONObject.optDouble("height");
                yFl.tN = jSONObject.optBoolean("isLandscape");
            }
            return yFl;
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        DSW = hashMap;
        hashMap.put("subtitle", "description");
        DSW.put("source", "source|app.app_name");
        DSW.put("screenshot", "dynamic_creative.screenshot");
    }

    public vc(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.YFl = jSONObject;
        this.Sg = jSONObject2;
        this.tN = new com.bytedance.sdk.component.adexpress.dynamic.AlY.tN(jSONObject2);
        this.AlY = YFl.YFl(jSONObject3);
        this.f10403vc = com.bytedance.sdk.component.adexpress.dynamic.AlY.AlY.YFl(jSONObject4);
    }

    private void Sg(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        com.bytedance.sdk.component.adexpress.dynamic.AlY.tN tNVar;
        Object YFl2;
        Object YFl3;
        Object YFl4;
        Object YFl5;
        if (qsh == null || (tNVar = this.tN) == null || (YFl2 = tNVar.YFl("image.0.url")) == null) {
            return;
        }
        String valueOf = String.valueOf(YFl2);
        if (TextUtils.isEmpty(valueOf) || (YFl3 = this.tN.YFl(CampaignEx.JSON_KEY_TITLE)) == null) {
            return;
        }
        String valueOf2 = String.valueOf(YFl3);
        if (TextUtils.isEmpty(valueOf2) || (YFl4 = this.tN.YFl("description")) == null) {
            return;
        }
        String valueOf3 = String.valueOf(YFl4);
        if (TextUtils.isEmpty(valueOf3) || (YFl5 = this.tN.YFl(RewardPlus.ICON)) == null) {
            return;
        }
        String valueOf4 = String.valueOf(YFl5);
        if (TextUtils.isEmpty(valueOf4)) {
            return;
        }
        Object YFl6 = this.tN.YFl("app.app_name");
        Object YFl7 = this.tN.YFl("source");
        if (YFl6 == null && YFl7 == null) {
            return;
        }
        if (YFl6 == null) {
            YFl6 = YFl7;
        }
        String valueOf5 = String.valueOf(YFl6);
        if (TextUtils.isEmpty(valueOf5)) {
            return;
        }
        qsh.YFl("imageUrl", valueOf);
        qsh.YFl(CampaignEx.JSON_KEY_TITLE, valueOf2);
        qsh.YFl("description", valueOf3);
        qsh.YFl(RewardPlus.ICON, valueOf4);
        qsh.YFl("app_name", valueOf5);
        qsh.YFl(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH YFl(double d10, int i10, double d11, String str, GA ga2) {
        JSONObject jSONObject;
        this.tN.YFl();
        try {
            jSONObject = new JSONObject(this.f10403vc.Sg);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH YFl2 = YFl(AlY.YFl(this.YFl, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH) null);
        YFl(YFl2);
        wN wNVar = new wN(d10, i10, d11, str, ga2);
        wN.YFl yFl = new wN.YFl();
        YFl yFl2 = this.AlY;
        yFl.YFl = yFl2.YFl;
        yFl.Sg = yFl2.Sg;
        yFl.tN = 0.0f;
        wNVar.YFl(yFl);
        wNVar.YFl(YFl2, 0.0f, 0.0f);
        wNVar.YFl();
        com.bytedance.sdk.component.adexpress.dynamic.AlY.Sg sg2 = wNVar.YFl;
        if (sg2.AlY == 65536.0f) {
            return null;
        }
        return sg2.f10366vc;
    }

    private void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        int YFl2;
        if (qsh == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN() != null) {
            YFl2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().EH();
        } else {
            YFl2 = com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl());
        }
        int Sg = com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), YFl2);
        YFl yFl = this.AlY;
        float min = yFl.tN ? yFl.YFl : Math.min(yFl.YFl, Sg);
        if (this.AlY.Sg == 0.0f) {
            qsh.wN(min);
            qsh.nc().wN().nc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            qsh.vc(0.0f);
        } else {
            qsh.wN(min);
            int Sg2 = com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl()));
            YFl yFl2 = this.AlY;
            qsh.vc(yFl2.tN ? yFl2.Sg : Math.min(yFl2.Sg, Sg2));
            qsh.nc().wN().nc("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH YFl(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.f10403vc != null) {
                tN tNVar = new tN();
                this.wN = tNVar;
                JSONObject YFl2 = tNVar.YFl(this.f10403vc.YFl, optInt, jSONObject);
                if (YFl2 != null) {
                    jSONObject = YFl2;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH YFl3 = YFl(jSONObject);
        YFl3.YFl(qsh);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            YFl3.YFl((List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>) null);
            return YFl3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i10);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    length = YFl3.nc().wN().Bn();
                } else {
                    length = optJSONArray2.length();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH YFl4 = YFl(optJSONArray2.optJSONObject(i11), YFl3);
                    if (com.bytedance.sdk.component.adexpress.AlY.Sg() && "skip-with-time".equals(YFl3.nc().Sg()) && !"transparent".equals(YFl3.VOe()) && !TextUtils.isEmpty(YFl3.VOe())) {
                        YFl4.tN(YFl3.VOe());
                    }
                    arrayList.add(YFl4);
                    arrayList3.add(YFl4);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            YFl3.YFl(arrayList);
        }
        if (arrayList2.size() > 0) {
            YFl3.Sg(arrayList2);
        }
        return YFl3;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH YFl(JSONObject jSONObject) {
        String YFl2;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        NjR.YFl(optString, optJSONObject);
        JSONObject YFl3 = NjR.YFl(optString, NjR.YFl(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh = new com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH();
        if (TextUtils.isEmpty(optString2)) {
            qsh.Sg(String.valueOf(qsh.hashCode()));
        } else {
            qsh.Sg(optString2);
        }
        if (optJSONObject != null) {
            Sg(qsh);
            qsh.tN((float) optJSONObject.optDouble("x"));
            qsh.AlY((float) optJSONObject.optDouble("y"));
            qsh.wN((float) optJSONObject.optDouble("width"));
            qsh.vc((float) optJSONObject.optDouble("height"));
            qsh.DSW(optJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.AlY.wN wNVar = new com.bytedance.sdk.component.adexpress.dynamic.AlY.wN();
            wNVar.YFl(optString);
            wNVar.Sg(optJSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
            wNVar.tN(optJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.AlY.vc YFl4 = com.bytedance.sdk.component.adexpress.dynamic.AlY.vc.YFl(optJSONObject);
            wNVar.YFl(YFl4);
            com.bytedance.sdk.component.adexpress.dynamic.AlY.vc YFl5 = com.bytedance.sdk.component.adexpress.dynamic.AlY.vc.YFl(YFl3);
            if (YFl5 == null) {
                wNVar.Sg(YFl4);
            } else {
                wNVar.Sg(YFl5);
            }
            YFl(YFl4);
            YFl(YFl5);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.Sg) != null) {
                YFl(wNVar, jSONObject2.optInt("image_mode"));
            }
            String Sg = wNVar.Sg();
            com.bytedance.sdk.component.adexpress.dynamic.AlY.vc wN = wNVar.wN();
            if (DSW.containsKey(Sg) && !wN.VB()) {
                wN.aIu(DSW.get(Sg));
            }
            if (wN.VB()) {
                YFl2 = wNVar.tN();
            } else {
                YFl2 = YFl(wNVar.tN());
            }
            if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                if (TextUtils.equals(Sg, "star") || TextUtils.equals(Sg, "text_star")) {
                    YFl2 = YFl("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(Sg, "score-count") || TextUtils.equals(Sg, "score-count-type-1") || TextUtils.equals(Sg, "score-count-type-2")) {
                    YFl2 = YFl("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(Sg) && YFl4.qf()) {
                    YFl2 = YFl("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(YFl()) && (TextUtils.equals("logo-union", optString) || TextUtils.equals("logo", optString))) {
                StringBuilder n10 = j.n(YFl2, "adx:");
                n10.append(YFl());
                wNVar.Sg(n10.toString());
            } else {
                wNVar.Sg(YFl2);
            }
            qsh.YFl(wNVar);
        }
        return qsh;
    }

    private void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.wN wNVar, int i10) {
        int lastIndexOf;
        if (i10 != 5 && i10 != 15 && i10 != 50 && i10 != 154) {
            wNVar.YFl("image");
            String YFl2 = NjR.YFl("image");
            com.bytedance.sdk.component.adexpress.dynamic.AlY.vc wN = wNVar.wN();
            wN.aIu(YFl2);
            wNVar.DSW().aIu(YFl2);
            String YFl3 = NjR.YFl("image", "clickArea");
            if (!TextUtils.isEmpty(YFl3)) {
                wN.EH(YFl3);
                wNVar.DSW().EH(YFl3);
            }
            JSONObject dBO = wN.dBO();
            if (dBO != null) {
                wN.VOe(dBO.optString("imageLottieTosPath"));
                wN.YoT(dBO.optBoolean("animationsLoop"));
                wN.YI(dBO.optInt("lottieAppNameMaxLength"));
                wN.dXO(dBO.optInt("lottieAdDescMaxLength"));
                wN.Ga(dBO.optInt("lottieAdTitleMaxLength"));
            }
            wNVar.Sg(YFl2);
            if (YFl2 != null && (lastIndexOf = YFl2.lastIndexOf(".")) > 0) {
                String substring = YFl2.substring(0, lastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", YFl(substring + ".width"));
                    jSONObject.put("height", YFl(substring + ".height"));
                } catch (JSONException unused) {
                }
                wNVar.tN(jSONObject.toString());
            }
            wN.dc();
            return;
        }
        wNVar.YFl(MimeTypes.BASE_TYPE_VIDEO);
        String YFl4 = NjR.YFl(MimeTypes.BASE_TYPE_VIDEO);
        wNVar.wN().aIu(YFl4);
        String YFl5 = NjR.YFl(MimeTypes.BASE_TYPE_VIDEO, "clickArea");
        if (!TextUtils.isEmpty(YFl5)) {
            wNVar.wN().EH(YFl5);
            wNVar.DSW().EH(YFl5);
        }
        wNVar.DSW().aIu(YFl4);
        wNVar.Sg(YFl4);
        wNVar.wN().zl();
    }

    private String YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.tN.Sg(str2)) {
                String valueOf = String.valueOf(this.tN.YFl(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    private String YFl() {
        com.bytedance.sdk.component.adexpress.dynamic.AlY.tN tNVar = this.tN;
        return tNVar == null ? "" : String.valueOf(tNVar.YFl("adx_name"));
    }

    private void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.vc vcVar) {
        if (vcVar == null) {
            return;
        }
        String Cfr = vcVar.Cfr();
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            String tN = com.bytedance.sdk.component.adexpress.AlY.qsH.tN(com.bytedance.sdk.component.adexpress.AlY.YFl());
            if ("zh".equals(tN)) {
                tN = "cn";
            }
            if (!TextUtils.isEmpty(tN) && vcVar.vc() != null) {
                String optString = vcVar.vc().optString(tN);
                if (!TextUtils.isEmpty(optString)) {
                    Cfr = optString;
                }
            }
        }
        if (TextUtils.isEmpty(Cfr)) {
            return;
        }
        int indexOf = Cfr.indexOf("{{");
        int indexOf2 = Cfr.indexOf("}}");
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf2 >= indexOf) {
            String YFl2 = YFl(Cfr.substring(indexOf + 2, indexOf2));
            StringBuilder sb2 = new StringBuilder(Cfr.substring(0, indexOf));
            if (!TextUtils.isEmpty(YFl2)) {
                sb2.append(YFl2);
            }
            sb2.append(Cfr.substring(indexOf2 + 2));
            vcVar.YoT(sb2.toString());
            return;
        }
        vcVar.YoT(Cfr);
    }
}
