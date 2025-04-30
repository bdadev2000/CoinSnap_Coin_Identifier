package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tG implements com.bytedance.sdk.component.adexpress.KS {
    public final String Bj;
    public final long COT;
    public final long HWF;
    public final float KS;
    public int KVG;
    public final int QR;
    public final int YW;
    public final boolean dQp;
    public final int dT;
    public final float jU;
    public final int ku;
    public final float lMd;
    public SparseArray<KS.zp> rV;
    public JSONObject tG;
    public int vDp;
    public final float zp;

    /* loaded from: classes.dex */
    public static class zp {
        private int Bj;
        private float COT;
        private float HWF;
        private long KS;
        private boolean KVG;
        private float QR;
        private int YW;
        private int dQp;
        private int dT;
        private float jU;
        private int ku;
        private long lMd;
        private JSONObject rV;
        private int tG;
        private String vDp;
        protected SparseArray<KS.zp> zp = new SparseArray<>();

        public zp COT(int i9) {
            this.dT = i9;
            return this;
        }

        public zp HWF(int i9) {
            this.Bj = i9;
            return this;
        }

        public zp KS(float f9) {
            this.HWF = f9;
            return this;
        }

        public zp jU(float f9) {
            this.QR = f9;
            return this;
        }

        public zp lMd(int i9) {
            this.tG = i9;
            return this;
        }

        public zp zp(int i9) {
            this.dQp = i9;
            return this;
        }

        public zp KS(int i9) {
            this.ku = i9;
            return this;
        }

        public zp jU(int i9) {
            this.YW = i9;
            return this;
        }

        public zp lMd(long j7) {
            this.KS = j7;
            return this;
        }

        public zp zp(JSONObject jSONObject) {
            this.rV = jSONObject;
            return this;
        }

        public zp lMd(float f9) {
            this.COT = f9;
            return this;
        }

        public zp zp(boolean z8) {
            this.KVG = z8;
            return this;
        }

        public zp zp(long j7) {
            this.lMd = j7;
            return this;
        }

        public zp zp(float f9) {
            this.jU = f9;
            return this;
        }

        public zp zp(String str) {
            this.vDp = str;
            return this;
        }

        public zp zp(SparseArray<KS.zp> sparseArray) {
            this.zp = sparseArray;
            return this;
        }

        public tG zp() {
            return new tG(this);
        }
    }

    private tG(@NonNull zp zpVar) {
        this.zp = zpVar.QR;
        this.lMd = zpVar.HWF;
        this.KS = zpVar.COT;
        this.jU = zpVar.jU;
        this.COT = zpVar.KS;
        this.HWF = zpVar.lMd;
        this.QR = zpVar.ku;
        this.ku = zpVar.YW;
        this.YW = zpVar.dT;
        this.dT = zpVar.Bj;
        this.Bj = zpVar.vDp;
        this.rV = zpVar.zp;
        this.dQp = zpVar.KVG;
        this.vDp = zpVar.tG;
        this.tG = zpVar.rV;
        this.KVG = zpVar.dQp;
    }
}
