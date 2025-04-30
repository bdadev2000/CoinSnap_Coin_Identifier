package com.bytedance.sdk.component.zp;

import android.text.TextUtils;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class KVG {
    public final String COT;
    public final String HWF;
    public final String KS;
    public final String QR;
    public final String jU;
    public final String ku;
    public final String lMd;
    public final int zp;

    /* loaded from: classes.dex */
    public static final class zp {
        private String COT;
        private String HWF;
        private String KS;
        private String QR;
        private String jU;
        private String lMd;
        private String zp;

        private zp() {
        }

        public zp COT(String str) {
            this.COT = str;
            return this;
        }

        public zp HWF(String str) {
            this.HWF = str;
            return this;
        }

        public zp KS(String str) {
            this.KS = str;
            return this;
        }

        public zp QR(String str) {
            this.QR = str;
            return this;
        }

        public zp jU(String str) {
            this.jU = str;
            return this;
        }

        public zp lMd(String str) {
            this.lMd = str;
            return this;
        }

        public zp zp(String str) {
            this.zp = str;
            return this;
        }

        public KVG zp() {
            return new KVG(this);
        }
    }

    public static zp zp() {
        return new zp();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("methodName: ");
        sb.append(this.jU);
        sb.append(", params: ");
        sb.append(this.COT);
        sb.append(", callbackId: ");
        sb.append(this.HWF);
        sb.append(", type: ");
        sb.append(this.KS);
        sb.append(", version: ");
        return AbstractC2914a.h(sb, this.lMd, ", ");
    }

    private KVG(String str, int i9) {
        this.lMd = null;
        this.KS = null;
        this.jU = null;
        this.COT = null;
        this.HWF = str;
        this.QR = null;
        this.zp = i9;
        this.ku = null;
    }

    public static KVG zp(String str, int i9) {
        return new KVG(str, i9);
    }

    public static boolean zp(KVG kvg) {
        return kvg == null || kvg.zp != 1 || TextUtils.isEmpty(kvg.jU) || TextUtils.isEmpty(kvg.COT);
    }

    private KVG(zp zpVar) {
        this.lMd = zpVar.zp;
        this.KS = zpVar.lMd;
        this.jU = zpVar.KS;
        this.COT = zpVar.jU;
        this.HWF = zpVar.COT;
        this.QR = zpVar.HWF;
        this.zp = 1;
        this.ku = zpVar.QR;
    }
}
