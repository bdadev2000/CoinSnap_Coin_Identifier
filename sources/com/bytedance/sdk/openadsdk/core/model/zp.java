package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private boolean COT;
    private String KS;
    private long YW;
    private boolean dT;
    private C0110zp jU;
    private String ku;
    private int lMd;
    private String zp;
    private List<woN> HWF = new ArrayList();
    private List<QR> QR = new ArrayList();
    private volatile boolean Bj = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.model.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0110zp extends woN.zp {
        private int zp;

        public JSONObject lMd() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", COT());
                jSONObject.put("md5", HWF());
                jSONObject.put("url", QR());
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, ku());
                jSONObject.put("diff_data", YW());
                jSONObject.put("version", jU());
                jSONObject.put("dynamic_creative", dT());
                jSONObject.put("count_down_time", zp());
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }

        public void zp(int i9) {
            this.zp = i9;
        }

        public int zp() {
            return this.zp;
        }

        public static C0110zp zp(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0110zp c0110zp = new C0110zp();
            c0110zp.lMd(jSONObject.optString("id"));
            c0110zp.KS(jSONObject.optString("md5"));
            c0110zp.jU(jSONObject.optString("url"));
            c0110zp.COT(jSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
            c0110zp.HWF(jSONObject.optString("diff_data"));
            c0110zp.zp(jSONObject.optString("version"));
            c0110zp.QR(jSONObject.optString("dynamic_creative"));
            c0110zp.zp(jSONObject.optInt("count_down_time"));
            if (zp(c0110zp)) {
                return c0110zp;
            }
            return null;
        }

        private static boolean zp(C0110zp c0110zp) {
            return (c0110zp == null || TextUtils.isEmpty(c0110zp.COT()) || TextUtils.isEmpty(c0110zp.QR())) ? false : true;
        }
    }

    @Nullable
    public JSONObject Bj() {
        try {
            JSONObject jSONObject = new JSONObject();
            C0110zp ku = ku();
            if (ku != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject lMd = ku.lMd();
                if (lMd != null) {
                    jSONObject2.put("tpl_info", lMd);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            List<woN> list = this.HWF;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i9 = 0; i9 < this.HWF.size(); i9++) {
                    jSONArray.put(this.HWF.get(i9).Eg());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.dT);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public woN COT() {
        if (this.HWF.size() > 0) {
            return this.HWF.get(0);
        }
        return null;
    }

    public boolean HWF() {
        if (ku() != null && KS() != null && KS().size() > 1) {
            this.COT = true;
        } else {
            this.COT = false;
            zp((C0110zp) null);
        }
        return this.COT;
    }

    public List<woN> KS() {
        return this.HWF;
    }

    public boolean QR() {
        return this.dT;
    }

    public boolean YW() {
        return this.Bj;
    }

    public void dT() {
        this.Bj = false;
    }

    public boolean jU() {
        List<woN> list = this.HWF;
        if (list != null && list.size() > 0) {
            return true;
        }
        return false;
    }

    public C0110zp ku() {
        return this.jU;
    }

    public int lMd() {
        return this.lMd;
    }

    public String zp() {
        woN COT = COT();
        if (COT != null) {
            return COT.Gor();
        }
        return "";
    }

    public void KS(String str) {
        this.ku = str;
    }

    public void lMd(String str) {
        this.KS = str;
    }

    public static zp lMd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            zp zpVar = new zp();
            JSONObject optJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (optJSONObject != null) {
                zpVar.zp(optJSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    arrayList.add(com.bytedance.sdk.openadsdk.core.lMd.zp(optJSONArray.optJSONObject(i9)));
                }
                zpVar.zp(arrayList);
            }
            zpVar.zp(jSONObject.optBoolean("is_choose_ad_original", false));
            return zpVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void zp(int i9) {
        this.lMd = i9;
    }

    public void zp(woN won) {
        this.HWF.add(won);
    }

    public void zp(List<woN> list) {
        this.HWF = list;
    }

    public void zp(QR qr) {
        this.QR.add(qr);
    }

    public void zp(long j7) {
        this.YW = j7;
    }

    public static Map<String, woN> zp(zp zpVar) {
        if (zpVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (woN won : zpVar.KS()) {
            if (!TextUtils.isEmpty(won.fVt())) {
                hashMap.put(won.fVt(), won);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public void zp(boolean z8) {
        this.dT = z8;
    }

    public void zp(C0110zp c0110zp) {
        this.jU = c0110zp;
        if (c0110zp == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zp.lMd.lMd.zp(woN.zp.zp(c0110zp, ""));
    }

    public void zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        zp(C0110zp.zp(jSONObject.optJSONObject("tpl_info")));
    }
}
