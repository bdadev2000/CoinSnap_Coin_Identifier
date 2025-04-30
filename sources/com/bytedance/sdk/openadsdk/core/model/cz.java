package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cz {
    private String COT;
    private String HWF;
    private boolean KS;
    private int QR;
    private int YW;
    private boolean dT;
    private int jU;
    private int ku;
    private int lMd;
    private int zp;

    public cz(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.KS = jSONObject.optBoolean("is_playable");
        this.jU = jSONObject.optInt("playable_type", 0);
        this.COT = jSONObject.optString("playable_style");
        JSONObject optJSONObject = jSONObject.optJSONObject("playable");
        if (optJSONObject != null) {
            this.HWF = optJSONObject.optString("playable_url", "");
            this.QR = optJSONObject.optInt("playable_orientation", 0);
            this.lMd = optJSONObject.optInt("new_style", 0);
            this.zp = optJSONObject.optInt("close_2_app", 0);
            int lMd = lMd(this.jU);
            this.ku = optJSONObject.optInt("playable_webview_timeout", lMd);
            this.YW = optJSONObject.optInt("playable_js_timeout", lMd);
            this.dT = optJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    public static boolean Bj(woN won) {
        if (lMd(won) && vwr(won) == 1) {
            return true;
        }
        return false;
    }

    public static String COT(woN won) {
        cz woN = woN(won);
        if (woN == null) {
            return null;
        }
        return woN.HWF;
    }

    public static String HWF(woN won) {
        if (won == null) {
            return null;
        }
        cz tG = won.tG();
        if (tG != null && tG.KS) {
            String str = tG.HWF;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (won.rV() == 20) {
            return won.aax();
        }
        if (won.eWG() == null) {
            return null;
        }
        return won.eWG().vDp();
    }

    public static boolean KS(woN won) {
        cz tG = won.tG();
        return tG != null && tG.KS && tG.lMd == 1;
    }

    public static boolean KVG(woN won) {
        cz woN = woN(won);
        if (woN != null && woN.KS()) {
            return true;
        }
        return false;
    }

    public static boolean QR(woN won) {
        return true;
    }

    public static boolean YW(woN won) {
        com.bykv.vk.openvk.component.video.api.KS.lMd eWG = won.eWG();
        if (eWG == null || eWG.cz() != 1) {
            return false;
        }
        return true;
    }

    public static long dQp(woN won) {
        if (woN(won) == null) {
            return 5L;
        }
        return r2.lMd();
    }

    public static int dT(woN won) {
        cz woN = woN(won);
        if (woN == null) {
            return 0;
        }
        return woN.QR;
    }

    public static String jU(woN won) {
        cz woN = woN(won);
        if (woN == null) {
            return null;
        }
        return woN.COT;
    }

    public static boolean ku(woN won) {
        int i9;
        if (won != null && won.eWG() != null) {
            i9 = won.eWG().cz();
        } else {
            i9 = 0;
        }
        if (i9 == 1) {
            return false;
        }
        return true;
    }

    private static int lMd(int i9) {
        return i9 == 1 ? 10 : 5;
    }

    public static long rV(woN won) {
        if (woN(won) == null) {
            return 5L;
        }
        return r2.zp();
    }

    public static long tG(woN won) {
        return Math.max(rV(won), dQp(won));
    }

    public static boolean vDp(woN won) {
        if (lMd(won) && vwr(won) == 0) {
            return true;
        }
        return false;
    }

    private static int vwr(woN won) {
        cz woN = woN(won);
        if (woN == null) {
            return 0;
        }
        return woN.jU;
    }

    private static cz woN(woN won) {
        if (won == null) {
            return null;
        }
        return won.tG();
    }

    public static int zp(int i9) {
        return i9 + 10;
    }

    public static boolean lMd(woN won) {
        cz woN = woN(won);
        return (woN == null || !woN.KS || TextUtils.isEmpty(HWF(won))) ? false : true;
    }

    public static int zp(woN won) {
        int i9;
        cz tG = won.tG();
        if (tG != null && (i9 = tG.zp) >= 0 && i9 <= 100) {
            return i9;
        }
        return 0;
    }

    public boolean KS() {
        return this.dT;
    }

    public int lMd() {
        return this.YW;
    }

    public void zp(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.KS);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("PlayableModel", e4.getMessage());
        }
        if (!TextUtils.isEmpty(this.HWF)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.HWF);
                jSONObject2.put("playable_orientation", this.QR);
                jSONObject2.put("new_style", this.lMd);
                jSONObject2.put("close_2_app", this.zp);
                jSONObject2.put("playable_webview_timeout", this.ku);
                jSONObject2.put("playable_js_timeout", this.YW);
                jSONObject2.put("playable_backup_enable", this.dT ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e9) {
                com.bytedance.sdk.component.utils.tG.zp("PlayableModel", e9.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.jU);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.tG.zp("PlayableModel", e10.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.COT);
        } catch (JSONException e11) {
            com.bytedance.sdk.component.utils.tG.zp("PlayableModel", e11.getMessage());
        }
    }

    public int zp() {
        return this.ku;
    }
}
