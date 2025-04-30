package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public class dQp {
    private woN COT;
    private int KS;
    private com.bykv.vk.openvk.component.video.api.KS.KS jU;
    private String lMd;
    private long zp;

    /* loaded from: classes.dex */
    public static class zp {
        private com.bykv.vk.openvk.component.video.api.KS.zp Bj;
        private int COT;
        private int HWF;
        private int QR;
        private int YW;
        private int ku;
        private long zp = 0;
        private long lMd = 0;
        private long KS = 0;
        private boolean jU = false;
        private boolean dT = false;

        private void tG() {
            long j7 = this.KS;
            if (j7 > 0) {
                long j9 = this.zp;
                if (j9 > j7) {
                    this.zp = j9 % j7;
                }
            }
        }

        public boolean Bj() {
            return this.jU;
        }

        public int COT() {
            return this.HWF;
        }

        public int HWF() {
            long j7 = this.KS;
            if (j7 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.zp * 100) / j7), 100);
        }

        public long KS() {
            return this.KS;
        }

        public int QR() {
            return this.QR;
        }

        public int YW() {
            return this.YW;
        }

        public boolean dT() {
            return this.dT;
        }

        public int jU() {
            return this.COT;
        }

        public int ku() {
            return this.ku;
        }

        public long lMd() {
            return this.lMd;
        }

        public com.bykv.vk.openvk.component.video.api.KS.zp vDp() {
            return this.Bj;
        }

        public long zp() {
            return this.zp;
        }

        public void KS(long j7) {
            this.KS = j7;
            tG();
        }

        public void jU(int i9) {
            this.YW = i9;
        }

        public void lMd(long j7) {
            this.lMd = j7;
        }

        public void zp(long j7) {
            this.zp = j7;
            tG();
        }

        public void lMd(int i9) {
            this.HWF = i9;
        }

        public void KS(int i9) {
            this.QR = i9;
        }

        public void zp(int i9) {
            this.COT = i9;
        }

        public void zp(boolean z8) {
            this.jU = z8;
        }

        public void zp(com.bykv.vk.openvk.component.video.api.KS.zp zpVar) {
            this.Bj = zpVar;
        }
    }

    public dQp(long j7, String str, int i9, com.bykv.vk.openvk.component.video.api.KS.KS ks, woN won) {
        this.zp = j7;
        this.lMd = str;
        this.KS = i9;
        this.jU = ks;
        this.COT = won;
    }

    public woN COT() {
        return this.COT;
    }

    public int KS() {
        return this.KS;
    }

    public com.bykv.vk.openvk.component.video.api.KS.KS jU() {
        return this.jU;
    }

    public String lMd() {
        return this.lMd;
    }

    public long zp() {
        return this.zp;
    }
}
