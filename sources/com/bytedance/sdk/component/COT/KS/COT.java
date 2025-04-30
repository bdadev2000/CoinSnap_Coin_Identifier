package com.bytedance.sdk.component.COT.KS;

import android.content.Context;
import com.bytedance.sdk.component.COT.FP;
import com.bytedance.sdk.component.COT.pvr;
import com.bytedance.sdk.component.COT.tG;
import com.bytedance.sdk.component.COT.vDp;
import com.bytedance.sdk.component.COT.vwr;
import com.bytedance.sdk.component.COT.woN;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class COT implements tG {
    private pvr COT;
    private com.bytedance.sdk.component.COT.KS HWF;
    private com.bytedance.sdk.component.COT.jU KS;
    private woN QR;
    private FP YW;
    private vwr jU;
    private com.bytedance.sdk.component.COT.lMd ku;
    private ExecutorService lMd;
    private vDp zp;

    /* loaded from: classes.dex */
    public static class zp {
        private pvr COT;
        private com.bytedance.sdk.component.COT.KS HWF;
        private com.bytedance.sdk.component.COT.jU KS;
        private woN QR;
        private FP YW;
        private vwr jU;
        private com.bytedance.sdk.component.COT.lMd ku;
        private ExecutorService lMd;
        private vDp zp;

        public zp zp(com.bytedance.sdk.component.COT.lMd lmd) {
            this.ku = lmd;
            return this;
        }

        public zp zp(FP fp) {
            this.YW = fp;
            return this;
        }

        public zp zp(com.bytedance.sdk.component.COT.jU jUVar) {
            this.KS = jUVar;
            return this;
        }

        public COT zp() {
            return new COT(this);
        }
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public vwr COT() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public pvr HWF() {
        return this.COT;
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public FP KS() {
        return this.YW;
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public com.bytedance.sdk.component.COT.KS QR() {
        return this.HWF;
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public com.bytedance.sdk.component.COT.lMd YW() {
        return this.ku;
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public com.bytedance.sdk.component.COT.jU jU() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public woN ku() {
        return this.QR;
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public ExecutorService lMd() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.COT.tG
    public vDp zp() {
        return this.zp;
    }

    private COT(zp zpVar) {
        this.zp = zpVar.zp;
        this.lMd = zpVar.lMd;
        this.KS = zpVar.KS;
        this.jU = zpVar.jU;
        this.COT = zpVar.COT;
        this.HWF = zpVar.HWF;
        this.ku = zpVar.ku;
        this.QR = zpVar.QR;
        this.YW = zpVar.YW;
    }

    public static COT zp(Context context) {
        return new zp().zp();
    }
}
