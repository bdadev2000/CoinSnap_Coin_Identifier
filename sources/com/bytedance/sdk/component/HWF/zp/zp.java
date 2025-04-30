package com.bytedance.sdk.component.HWF.zp;

/* loaded from: classes.dex */
public class zp {
    private int Bj;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp COT;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp HWF;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp KS;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp QR;
    private COT YW;
    private boolean dT;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp jU;
    private boolean ku;
    private com.bytedance.sdk.component.HWF.zp.lMd.KS lMd;
    private long tG;
    private int vDp;
    private com.bytedance.sdk.component.HWF.zp.zp.COT zp;

    /* renamed from: com.bytedance.sdk.component.HWF.zp.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0074zp {
        private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp COT;
        private boolean HWF;
        private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp KS;
        private COT QR;
        private boolean YW;
        private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp jU;
        private com.bytedance.sdk.component.HWF.zp.zp.COT ku;
        private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp lMd;
        private long vDp;
        private com.bytedance.sdk.component.HWF.zp.lMd.KS zp;
        private int dT = 5000;
        private int Bj = 10;

        public C0074zp KS(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
            this.jU = zpVar;
            return this;
        }

        public C0074zp lMd(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
            this.KS = zpVar;
            return this;
        }

        public C0074zp zp(long j7) {
            this.vDp = j7;
            return this;
        }

        public C0074zp lMd(int i9) {
            this.Bj = i9;
            return this;
        }

        public C0074zp zp(com.bytedance.sdk.component.HWF.zp.zp.COT cot) {
            this.ku = cot;
            return this;
        }

        public C0074zp zp(COT cot) {
            this.QR = cot;
            return this;
        }

        public C0074zp zp(boolean z8) {
            this.HWF = z8;
            return this;
        }

        public C0074zp zp(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
            this.lMd = zpVar;
            return this;
        }

        public C0074zp zp(com.bytedance.sdk.component.HWF.zp.lMd.KS ks) {
            this.zp = ks;
            return this;
        }

        public C0074zp zp(int i9) {
            this.dT = i9;
            return this;
        }

        public zp zp() {
            zp zpVar = new zp();
            zpVar.lMd = this.zp;
            zpVar.KS = this.lMd;
            zpVar.jU = this.KS;
            zpVar.COT = this.jU;
            zpVar.HWF = this.COT;
            zpVar.ku = this.HWF;
            zpVar.YW = this.QR;
            zpVar.zp = this.ku;
            zpVar.dT = this.YW;
            zpVar.vDp = this.Bj;
            zpVar.Bj = this.dT;
            zpVar.tG = this.vDp;
            return zpVar;
        }
    }

    public boolean Bj() {
        return this.ku;
    }

    public long COT() {
        return this.tG;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp HWF() {
        return this.QR;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp QR() {
        return this.KS;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp YW() {
        return this.COT;
    }

    public com.bytedance.sdk.component.HWF.zp.lMd.KS dT() {
        return this.lMd;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp ku() {
        return this.jU;
    }

    public int tG() {
        return this.vDp;
    }

    public int vDp() {
        return this.Bj;
    }

    private zp() {
        this.Bj = 200;
        this.vDp = 10;
    }

    public boolean KS() {
        return this.dT;
    }

    public COT jU() {
        return this.YW;
    }

    public com.bytedance.sdk.component.HWF.zp.jU.lMd.zp lMd() {
        return this.HWF;
    }

    public com.bytedance.sdk.component.HWF.zp.zp.COT zp() {
        return this.zp;
    }
}
