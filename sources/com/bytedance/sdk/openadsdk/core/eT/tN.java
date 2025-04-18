package com.bytedance.sdk.openadsdk.core.eT;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.YoT;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private static String YFl = "";

    public static boolean Sg(Wwa wwa) {
        return wwa != null && wwa.UZM() == 10;
    }

    public static boolean YFl(int i10) {
        return i10 == 10 || i10 == 9;
    }

    private static JSONArray tN(Wwa wwa) {
        try {
            Wwa.YFl lu = wwa.lu();
            if (lu != null) {
                JSONObject jSONObject = new JSONObject(lu.eT());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
                jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
                jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
                jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
                jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
                JSONArray optJSONArray = jSONObject.optJSONArray("dpa_images");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    jSONObject2.putOpt("image", optJSONArray.get(0));
                }
                jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
                jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
                jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
                jSONObject2.put("button_text", wwa.lL());
                JSONArray jSONArray = new JSONArray();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
                if (optJSONArray2 != null) {
                    jSONArray.put(jSONObject2);
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        try {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i10);
                            jSONObject3.put("button_text", wwa.lL());
                            jSONArray.put(jSONObject3);
                        } catch (Throwable unused) {
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static JSONObject YFl(Wwa wwa, String str) {
        JSONObject ni2 = wwa.ni();
        try {
            ni2.put("show_dislike", wwa.Gnp());
            ni2.put("language", YoT.YFl());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String vc2 = NjR.Sg().vc();
                int DSW = NjR.Sg().DSW();
                jSONObject.put("app_name", vc2);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(DSW)));
                ni2.put("open_app_info", jSONObject);
            }
            ni2.put("os", "Android");
            JSONArray tN = tN(wwa);
            if (tN != null) {
                ni2.put("dpa_data", tN);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("UgenUtils", "parseUGenDataInfo exception", th2.getMessage());
        }
        return ni2;
    }

    public static boolean YFl(Wwa wwa) {
        return wwa != null && wwa.UZM() == 7;
    }

    public static String YFl() {
        return YFl;
    }

    public static JSONObject YFl(Wwa wwa, com.bytedance.sdk.openadsdk.core.eT.wN.tN tNVar) {
        JSONObject jSONObject;
        tNVar.YFl("ad");
        String str = "";
        YFl = "";
        JSONObject jSONObject2 = null;
        try {
            Wwa.YFl lu = wwa.lu();
            if (lu != null) {
                str = lu.lG();
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(lu.rkt()) && !TextUtils.isEmpty(lu.vc())) {
                    str = com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl().YFl("ad", lu.vc(), lu.rkt());
                }
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject = new JSONObject(str);
                    try {
                        try {
                            YFl = "getTemplate success";
                            tNVar.Sg(ImagesContract.LOCAL);
                            return jSONObject;
                        } catch (Throwable th2) {
                            jSONObject2 = jSONObject;
                            th = th2;
                            String str2 = "get template error " + th.getMessage();
                            YFl = str2;
                            tNVar.YFl(2, str2, ImagesContract.LOCAL);
                            return jSONObject2;
                        }
                    } catch (JSONException unused) {
                        String concat = "parse json exception data is ".concat(String.valueOf(str));
                        YFl = concat;
                        tNVar.YFl(2, concat, ImagesContract.LOCAL);
                        return null;
                    }
                } catch (JSONException unused2) {
                    jSONObject = null;
                }
            } else {
                String str3 = "local data is null id is " + lu.vc() + " md5 is " + lu.rkt();
                YFl = str3;
                tNVar.YFl(3, str3, "net");
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
