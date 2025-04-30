package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YW {
    private final int Bj;
    private final float COT;
    private final float HWF;
    private final int[] KS;
    private final int KVG;
    private final float QR;
    private final long YW;
    private final SparseArray<KS.zp> dQp;
    private final long dT;
    private final int[] jU;
    private final float ku;
    private final int[] lMd;
    private final int rV;
    private final int tG;
    private final int vDp;
    private final String vwr;
    private final JSONObject woN;
    private final int[] zp;

    /* loaded from: classes.dex */
    public static class zp {
        private int[] Bj;
        private long COT;
        private JSONObject FP;
        private float HWF;
        float KS;
        private int KVG;
        private float QR;
        private float YW;
        private int cz;
        private int dQp;
        private int[] dT;
        private long jU;
        private float ku;
        int lMd;
        private String pvr;
        private int rV;
        private int[] tG;
        private int[] vDp;
        private int vwr;
        private SparseArray<KS.zp> woN;
        float zp;

        public zp COT(float f9) {
            this.ku = f9;
            return this;
        }

        public zp HWF(float f9) {
            this.YW = f9;
            return this;
        }

        public zp KS(int i9) {
            this.lMd = i9;
            return this;
        }

        public zp jU(float f9) {
            this.QR = f9;
            return this;
        }

        public zp lMd(int i9) {
            this.vwr = i9;
            return this;
        }

        public zp zp(int i9) {
            this.cz = i9;
            return this;
        }

        public zp COT(int i9) {
            this.dQp = i9;
            return this;
        }

        public zp HWF(int i9) {
            this.KVG = i9;
            return this;
        }

        public zp KS(float f9) {
            this.HWF = f9;
            return this;
        }

        public zp jU(int[] iArr) {
            this.tG = iArr;
            return this;
        }

        public zp lMd(float f9) {
            this.KS = f9;
            return this;
        }

        public zp zp(JSONObject jSONObject) {
            this.FP = jSONObject;
            return this;
        }

        public zp KS(int[] iArr) {
            this.vDp = iArr;
            return this;
        }

        public zp jU(int i9) {
            this.rV = i9;
            return this;
        }

        public zp lMd(long j7) {
            this.COT = j7;
            return this;
        }

        public zp zp(SparseArray<KS.zp> sparseArray) {
            this.woN = sparseArray;
            return this;
        }

        public zp lMd(int[] iArr) {
            this.Bj = iArr;
            return this;
        }

        public zp zp(float f9) {
            this.zp = f9;
            return this;
        }

        public zp zp(long j7) {
            this.jU = j7;
            return this;
        }

        public zp zp(int[] iArr) {
            this.dT = iArr;
            return this;
        }

        public zp zp(String str) {
            this.pvr = str;
            return this;
        }

        public YW zp() {
            return new YW(this);
        }
    }

    public JSONObject zp() {
        JSONObject jSONObject = new JSONObject();
        try {
            int[] iArr = this.zp;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.zp[1]));
            }
            int[] iArr2 = this.lMd;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.lMd[1]));
            }
            int[] iArr3 = this.KS;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.KS[1]));
            }
            int[] iArr4 = this.jU;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.jU[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.COT)).putOpt("down_y", Float.toString(this.HWF)).putOpt("up_x", Float.toString(this.QR)).putOpt("up_y", Float.toString(this.ku)).putOpt("down_time", Long.valueOf(this.YW)).putOpt("up_time", Long.valueOf(this.dT)).putOpt("toolType", Integer.valueOf(this.Bj)).putOpt("deviceId", Integer.valueOf(this.vDp)).putOpt("source", Integer.valueOf(this.tG)).putOpt("ft", zp(this.dQp, this.rV)).putOpt("click_area_type", this.vwr);
            int i9 = this.KVG;
            if (i9 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i9));
            }
            JSONObject jSONObject2 = this.woN;
            if (jSONObject2 != null) {
                jSONObject.putOpt("rectInfo", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private YW(@NonNull zp zpVar) {
        this.zp = zpVar.Bj;
        this.lMd = zpVar.vDp;
        this.jU = zpVar.tG;
        this.KS = zpVar.dT;
        this.COT = zpVar.YW;
        this.HWF = zpVar.ku;
        this.QR = zpVar.QR;
        this.ku = zpVar.HWF;
        this.YW = zpVar.COT;
        this.dT = zpVar.jU;
        this.Bj = zpVar.rV;
        this.vDp = zpVar.dQp;
        this.tG = zpVar.KVG;
        this.rV = zpVar.vwr;
        this.dQp = zpVar.woN;
        this.vwr = zpVar.pvr;
        this.KVG = zpVar.cz;
        this.woN = zpVar.FP;
    }

    public static JSONObject zp(SparseArray<KS.zp> sparseArray, int i9) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    KS.zp valueAt = sparseArray.valueAt(i10);
                    if (valueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(valueAt.KS)).putOpt("mr", Double.valueOf(valueAt.lMd)).putOpt("phase", Integer.valueOf(valueAt.zp)).putOpt(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(valueAt.jU));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i9)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
