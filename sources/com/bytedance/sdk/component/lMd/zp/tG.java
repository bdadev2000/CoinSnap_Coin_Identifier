package com.bytedance.sdk.component.lMd.zp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class tG {
    public com.bytedance.sdk.component.KS.zp.zp lMd = new com.bytedance.sdk.component.KS.zp.zp();
    public Bj zp;

    /* loaded from: classes.dex */
    public static class zp {
        Object COT;
        rV HWF;
        QR KS;
        int QR;
        String jU;
        String ku;
        Map<String, List<String>> lMd;
        com.bytedance.sdk.component.lMd.zp.zp zp;

        public zp() {
            this.lMd = new HashMap();
        }

        public zp lMd(String str) {
            return zp(QR.KS(str));
        }

        public zp zp(com.bytedance.sdk.component.lMd.zp.zp zpVar) {
            this.zp = zpVar;
            return this;
        }

        public zp lMd(String str, String str2) {
            if (!this.lMd.containsKey(str)) {
                this.lMd.put(str, new ArrayList());
            }
            this.lMd.get(str).add(str2);
            return this;
        }

        public zp zp(String str) {
            this.ku = str;
            return this;
        }

        public zp(tG tGVar) {
            this.KS = tGVar.lMd();
            this.jU = tGVar.KS();
            this.lMd = tGVar.jU();
            this.COT = tGVar.zp();
            this.HWF = tGVar.ku();
            this.zp = tGVar.COT();
            this.QR = tGVar.QR();
            this.ku = tGVar.HWF();
        }

        public zp zp(int i9) {
            this.QR = i9;
            return this;
        }

        public zp zp(Object obj) {
            this.COT = obj;
            return this;
        }

        public tG lMd() {
            return new tG() { // from class: com.bytedance.sdk.component.lMd.zp.tG.zp.1
                @Override // com.bytedance.sdk.component.lMd.zp.tG
                public com.bytedance.sdk.component.lMd.zp.zp COT() {
                    return zp.this.zp;
                }

                @Override // com.bytedance.sdk.component.lMd.zp.tG
                public String HWF() {
                    return zp.this.ku;
                }

                @Override // com.bytedance.sdk.component.lMd.zp.tG
                public String KS() {
                    return zp.this.jU;
                }

                @Override // com.bytedance.sdk.component.lMd.zp.tG
                public int QR() {
                    return zp.this.QR;
                }

                @Override // com.bytedance.sdk.component.lMd.zp.tG
                public Map jU() {
                    return zp.this.lMd;
                }

                @Override // com.bytedance.sdk.component.lMd.zp.tG
                public rV ku() {
                    return zp.this.HWF;
                }

                @Override // com.bytedance.sdk.component.lMd.zp.tG
                public QR lMd() {
                    return zp.this.KS;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.lMd.zp.tG
                public Object zp() {
                    return zp.this.COT;
                }
            };
        }

        public zp zp(QR qr) {
            this.KS = qr;
            return this;
        }

        public zp zp(String str, String str2) {
            return lMd(str, str2);
        }

        public zp zp() {
            return zp("GET", (rV) null);
        }

        private zp zp(String str, rV rVVar) {
            this.jU = str;
            this.HWF = rVVar;
            return this;
        }

        public zp zp(rV rVVar) {
            return zp("POST", rVVar);
        }
    }

    public abstract com.bytedance.sdk.component.lMd.zp.zp COT();

    public abstract String HWF();

    public abstract String KS();

    public abstract int QR();

    public zp YW() {
        return new zp(this);
    }

    public abstract Map<String, List<String>> jU();

    public rV ku() {
        return null;
    }

    public abstract QR lMd();

    public abstract Object zp();

    public void zp(Bj bj) {
        this.zp = bj;
    }
}
