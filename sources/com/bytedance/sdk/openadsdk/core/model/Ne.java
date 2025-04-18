package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p5.a;

/* loaded from: classes.dex */
public class Ne {
    private int AlY;
    private int DSW;
    private int NjR;
    private int Sg;
    private int YFl;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10682nc;
    private int qsH;
    private boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10683vc;
    private String wN;

    public Ne(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.tN = jSONObject.optBoolean("is_playable");
        this.AlY = jSONObject.optInt("playable_type", 0);
        this.wN = jSONObject.optString("playable_style");
        JSONObject optJSONObject = jSONObject.optJSONObject("playable");
        if (optJSONObject != null) {
            this.f10683vc = optJSONObject.optString("playable_url", "");
            this.DSW = optJSONObject.optInt("playable_orientation", 0);
            this.Sg = optJSONObject.optInt("new_style", 0);
            this.YFl = optJSONObject.optInt("close_2_app", 0);
            int Sg = Sg(this.AlY);
            this.qsH = optJSONObject.optInt("playable_webview_timeout", Sg);
            this.NjR = optJSONObject.optInt("playable_js_timeout", Sg);
            this.f10682nc = optJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    public static boolean AlY(Wwa wwa) {
        return tN(wwa) && !NjR(wwa);
    }

    public static boolean DSW(Wwa wwa) {
        Ne bZ = bZ(wwa);
        if (bZ == null || wwa.jqV() || !bZ.tN || TextUtils.isEmpty(GA(wwa))) {
            return false;
        }
        return true;
    }

    public static boolean EH(Wwa wwa) {
        int i10;
        if (wwa != null && wwa.BPI() != null) {
            i10 = wwa.BPI().f23469n;
        } else {
            i10 = 0;
        }
        if (i10 == 1) {
            return false;
        }
        return true;
    }

    public static String GA(Wwa wwa) {
        if (wwa == null) {
            return null;
        }
        Ne EH = wwa.EH();
        if (EH != null && EH.tN) {
            String str = EH.f10683vc;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (wwa.rkt() == 20) {
            return wwa.Cqy();
        }
        if (wwa.BPI() == null) {
            return null;
        }
        return wwa.BPI().f23463h;
    }

    public static long Ne(Wwa wwa) {
        if (bZ(wwa) == null) {
            return 5L;
        }
        return r2.Sg();
    }

    public static boolean NjR(Wwa wwa) {
        Ne EH = wwa.EH();
        if (EH == null || !EH.tN || EH.Sg != 1) {
            return false;
        }
        return true;
    }

    private static int Sg(int i10) {
        return i10 == 1 ? 10 : 5;
    }

    private static int UZM(Wwa wwa) {
        Ne bZ = bZ(wwa);
        if (bZ == null) {
            return 0;
        }
        return bZ.AlY;
    }

    public static boolean VOe(Wwa wwa) {
        Ne bZ = bZ(wwa);
        if (bZ != null && bZ.tN()) {
            return true;
        }
        return false;
    }

    public static boolean Wwa(Wwa wwa) {
        return DSW(wwa) && UZM(wwa) == 1;
    }

    public static int YFl(int i10) {
        return i10 + 10;
    }

    public static String YoT(Wwa wwa) {
        Ne bZ = bZ(wwa);
        if (bZ == null) {
            return null;
        }
        return bZ.f10683vc;
    }

    public static long aIu(Wwa wwa) {
        return Math.max(wXo(wwa), Ne(wwa));
    }

    private static Ne bZ(Wwa wwa) {
        if (wwa == null) {
            return null;
        }
        return wwa.EH();
    }

    public static String eT(Wwa wwa) {
        Ne bZ = bZ(wwa);
        if (bZ == null) {
            return null;
        }
        return bZ.wN;
    }

    public static int lG(Wwa wwa) {
        Ne bZ = bZ(wwa);
        if (bZ == null) {
            return 0;
        }
        return bZ.DSW;
    }

    public static boolean nc(Wwa wwa) {
        Ne EH = wwa.EH();
        if (EH == null || !wwa.jqV() || !EH.tN || EH.Sg != 1) {
            return false;
        }
        return true;
    }

    public static boolean pDU(Wwa wwa) {
        return true;
    }

    public static boolean qO(Wwa wwa) {
        return DSW(wwa) && UZM(wwa) == 0;
    }

    public static boolean qsH(Wwa wwa) {
        Ne EH = wwa.EH();
        if (EH == null || wwa.jqV() || !EH.tN || EH.Sg != 1) {
            return false;
        }
        return true;
    }

    public static boolean rkt(Wwa wwa) {
        a BPI = wwa.BPI();
        if (BPI == null || BPI.f23469n != 1) {
            return false;
        }
        return true;
    }

    public static boolean tN(Wwa wwa) {
        return Sg(wwa) && UZM(wwa) == 1;
    }

    public static boolean vc(Wwa wwa) {
        return wN(wwa) && UZM(wwa) == 1;
    }

    public static boolean wN(Wwa wwa) {
        Ne bZ = bZ(wwa);
        if (bZ == null || !wwa.jqV() || !bZ.tN || TextUtils.isEmpty(GA(wwa))) {
            return false;
        }
        return true;
    }

    public static long wXo(Wwa wwa) {
        if (bZ(wwa) == null) {
            return 5L;
        }
        return r2.YFl();
    }

    public static boolean Sg(Wwa wwa) {
        Ne bZ = bZ(wwa);
        return (bZ == null || !bZ.tN || TextUtils.isEmpty(GA(wwa))) ? false : true;
    }

    public static int YFl(Wwa wwa) {
        int i10;
        Ne EH = wwa.EH();
        if (EH != null && (i10 = EH.YFl) >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public boolean tN() {
        return this.f10682nc;
    }

    public int Sg() {
        return this.NjR;
    }

    public void YFl(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.tN);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("PlayableModel", e2.getMessage());
        }
        if (!TextUtils.isEmpty(this.f10683vc)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.f10683vc);
                jSONObject2.put("playable_orientation", this.DSW);
                jSONObject2.put("new_style", this.Sg);
                jSONObject2.put("close_2_app", this.YFl);
                jSONObject2.put("playable_webview_timeout", this.qsH);
                jSONObject2.put("playable_js_timeout", this.NjR);
                jSONObject2.put("playable_backup_enable", this.f10682nc ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.YoT.YFl("PlayableModel", e10.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.AlY);
        } catch (JSONException e11) {
            com.bytedance.sdk.component.utils.YoT.YFl("PlayableModel", e11.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.wN);
        } catch (JSONException e12) {
            com.bytedance.sdk.component.utils.YoT.YFl("PlayableModel", e12.getMessage());
        }
    }

    public int YFl() {
        return this.qsH;
    }
}
