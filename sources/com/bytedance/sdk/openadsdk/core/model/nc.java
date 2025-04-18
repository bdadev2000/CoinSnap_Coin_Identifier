package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nc {
    private final int[] AlY;
    private final float DSW;
    private final SparseArray<tN.YFl> EH;
    private final int GA;
    private final long NjR;
    private final int[] Sg;
    private final String Wwa;
    private final int[] YFl;
    private final int YoT;
    private final int eT;
    private final JSONObject lG;

    /* renamed from: nc, reason: collision with root package name */
    private final long f10705nc;
    private final int pDU;
    private final JSONObject qO;
    private final float qsH;
    private final int rkt;
    private final int[] tN;

    /* renamed from: vc, reason: collision with root package name */
    private final float f10706vc;
    private final float wN;

    /* loaded from: classes.dex */
    public static class YFl {
        private long AlY;
        private float DSW;
        private int EH;
        private int[] GA;
        private JSONObject Ne;
        private float NjR;
        int Sg;
        private int Wwa;
        float YFl;
        private int[] YoT;
        private int aIu;
        private int[] eT;
        private SparseArray<tN.YFl> lG;

        /* renamed from: nc, reason: collision with root package name */
        private int[] f10707nc;
        private int pDU;
        private String qO;
        private float qsH;
        private int rkt;
        float tN;

        /* renamed from: vc, reason: collision with root package name */
        private float f10708vc;
        private long wN;
        private JSONObject wXo;

        public YFl AlY(float f10) {
            this.DSW = f10;
            return this;
        }

        public YFl Sg(JSONObject jSONObject) {
            this.Ne = jSONObject;
            return this;
        }

        public YFl YFl(int i10) {
            this.aIu = i10;
            return this;
        }

        public YFl tN(int i10) {
            this.Sg = i10;
            return this;
        }

        public YFl vc(float f10) {
            this.NjR = f10;
            return this;
        }

        public YFl wN(float f10) {
            this.qsH = f10;
            return this;
        }

        public YFl AlY(int[] iArr) {
            this.GA = iArr;
            return this;
        }

        public YFl Sg(int i10) {
            this.Wwa = i10;
            return this;
        }

        public YFl YFl(JSONObject jSONObject) {
            this.wXo = jSONObject;
            return this;
        }

        public YFl tN(float f10) {
            this.f10708vc = f10;
            return this;
        }

        public YFl vc(int i10) {
            this.rkt = i10;
            return this;
        }

        public YFl wN(int i10) {
            this.EH = i10;
            return this;
        }

        public YFl AlY(int i10) {
            this.pDU = i10;
            return this;
        }

        public YFl Sg(float f10) {
            this.tN = f10;
            return this;
        }

        public YFl YFl(SparseArray<tN.YFl> sparseArray) {
            this.lG = sparseArray;
            return this;
        }

        public YFl tN(int[] iArr) {
            this.YoT = iArr;
            return this;
        }

        public YFl Sg(long j3) {
            this.wN = j3;
            return this;
        }

        public YFl YFl(float f10) {
            this.YFl = f10;
            return this;
        }

        public YFl Sg(int[] iArr) {
            this.eT = iArr;
            return this;
        }

        public YFl YFl(long j3) {
            this.AlY = j3;
            return this;
        }

        public YFl YFl(int[] iArr) {
            this.f10707nc = iArr;
            return this;
        }

        public YFl YFl(String str) {
            this.qO = str;
            return this;
        }

        public nc YFl() {
            return new nc(this);
        }
    }

    public JSONObject YFl() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.qO;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.qO.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.YFl;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.YFl[1]));
            }
            int[] iArr2 = this.Sg;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.Sg[1]));
            }
            int[] iArr3 = this.tN;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.tN[1]));
            }
            int[] iArr4 = this.AlY;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.AlY[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.wN)).putOpt("down_y", Float.toString(this.f10706vc)).putOpt("up_x", Float.toString(this.DSW)).putOpt("up_y", Float.toString(this.qsH)).putOpt("down_time", Long.valueOf(this.NjR)).putOpt("up_time", Long.valueOf(this.f10705nc)).putOpt("toolType", Integer.valueOf(this.eT)).putOpt("deviceId", Integer.valueOf(this.YoT)).putOpt("source", Integer.valueOf(this.GA)).putOpt("ft", YFl(this.EH, this.pDU)).putOpt("click_area_type", this.Wwa);
            int i10 = this.rkt;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.lG;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private nc(@NonNull YFl yFl) {
        this.YFl = yFl.eT;
        this.Sg = yFl.YoT;
        this.AlY = yFl.GA;
        this.tN = yFl.f10707nc;
        this.wN = yFl.NjR;
        this.f10706vc = yFl.qsH;
        this.DSW = yFl.DSW;
        this.qsH = yFl.f10708vc;
        this.NjR = yFl.wN;
        this.f10705nc = yFl.AlY;
        this.eT = yFl.pDU;
        this.YoT = yFl.EH;
        this.GA = yFl.rkt;
        this.pDU = yFl.Wwa;
        this.EH = yFl.lG;
        this.Wwa = yFl.qO;
        this.rkt = yFl.aIu;
        this.lG = yFl.wXo;
        this.qO = yFl.Ne;
    }

    public static JSONObject YFl(SparseArray<tN.YFl> sparseArray, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    tN.YFl valueAt = sparseArray.valueAt(i11);
                    if (valueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(valueAt.tN)).putOpt("mr", Double.valueOf(valueAt.Sg)).putOpt("phase", Integer.valueOf(valueAt.YFl)).putOpt(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(valueAt.AlY));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
