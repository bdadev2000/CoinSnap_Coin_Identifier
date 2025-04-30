package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;

/* loaded from: classes.dex */
public class KS implements com.bykv.vk.openvk.component.video.api.jU.KS {
    private boolean COT;
    private final woN HWF;
    private final com.bykv.vk.openvk.component.video.api.lMd.zp QR;
    private final zp zp;
    private boolean lMd = true;
    private long KS = 0;
    private boolean jU = false;

    /* loaded from: classes.dex */
    public static class zp implements com.bykv.vk.openvk.component.video.api.zp {
        private KS.zp COT;
        private long HWF;
        private int KS = 0;
        private final com.bykv.vk.openvk.component.video.api.lMd.zp QR;
        private CountDownTimer jU;
        private final com.bytedance.sdk.openadsdk.lMd.QR ku;
        private long lMd;
        private final long zp;

        public zp(long j7, com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, com.bytedance.sdk.openadsdk.lMd.QR qr) {
            this.zp = j7;
            this.QR = zpVar;
            this.ku = qr;
        }

        public void Bj() {
            this.KS = 0;
            CountDownTimer countDownTimer = this.jU;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.jU = null;
            }
            if (this.COT != null) {
                this.COT = null;
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp
        public int COT() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp
        public boolean KS() {
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp
        public boolean QR() {
            if (this.KS == 2) {
                return true;
            }
            return false;
        }

        public void YW() {
            if (this.KS == 1) {
                return;
            }
            this.KS = 1;
            final long rV = rV();
            final long j7 = rV - this.lMd;
            CountDownTimer countDownTimer = new CountDownTimer(j7, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.KS.zp.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    zp.this.KS = 4;
                    if (zp.this.COT != null) {
                        zp.this.COT.zp(zp.this.dQp(), 100);
                    }
                    dQp.zp zpVar = new dQp.zp();
                    zpVar.zp(rV);
                    zpVar.KS(rV);
                    zpVar.lMd(zp.this.vDp());
                    zpVar.jU(zp.this.tG());
                    com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.lMd(zp.this.QR, zpVar, zp.this.ku);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j9) {
                    long j10 = (j7 - j9) + zp.this.lMd;
                    zp.this.HWF = j10;
                    if (zp.this.COT != null) {
                        zp.this.COT.zp(j10, rV);
                    }
                }
            };
            this.jU = countDownTimer;
            countDownTimer.start();
        }

        public long dQp() {
            return this.HWF;
        }

        public void dT() {
            this.KS = 2;
            this.lMd = this.HWF;
            CountDownTimer countDownTimer = this.jU;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.jU = null;
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp
        public int jU() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp
        public boolean ku() {
            if (this.KS == 0) {
                return true;
            }
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp
        public boolean lMd() {
            return false;
        }

        public long rV() {
            return this.zp;
        }

        public int tG() {
            return 0;
        }

        public long vDp() {
            return 0L;
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp
        public boolean zp() {
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.zp
        public boolean HWF() {
            return this.KS == 1;
        }

        public void zp(long j7) {
            this.lMd = j7;
        }

        public void zp(KS.zp zpVar) {
            this.COT = zpVar;
        }
    }

    public KS(woN won, com.bytedance.sdk.openadsdk.lMd.QR qr) {
        long j7;
        com.bykv.vk.openvk.component.video.api.lMd.zp zpVar = new com.bykv.vk.openvk.component.video.api.lMd.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.KS.1
        };
        this.QR = zpVar;
        this.HWF = won;
        com.bykv.vk.openvk.component.video.api.KS.lMd eWG = won.eWG();
        long j9 = 10;
        if (eWG != null) {
            j7 = (long) eWG.HWF();
        } else {
            j7 = 10;
        }
        if (j7 <= 0) {
            eWG.zp(10.0d);
        } else {
            j9 = j7;
        }
        this.zp = new zp(j9 * 1000, zpVar, qr);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean Bj() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void COT(boolean z8) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public long HWF() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void KS(long j7) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean KVG() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public int QR() {
        return 0;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public long YW() {
        return COT();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean dQp() {
        return this.COT;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public int dT() {
        return com.bykv.vk.openvk.component.video.zp.COT.zp.zp(this.zp.HWF, this.zp.zp);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void jU(boolean z8) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public long ku() {
        return this.zp.rV();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void lMd(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean rV() {
        return this.jU;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public com.bykv.vk.openvk.component.video.api.jU.lMd tG() {
        return null;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public com.bykv.vk.openvk.component.video.api.zp vDp() {
        return this.zp;
    }

    public com.bykv.vk.openvk.component.video.api.lMd.zp vwr() {
        return this.QR;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean woN() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(KS.jU jUVar) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public long COT() {
        return this.zp.dQp();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void KS() {
        this.zp.Bj();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void jU() {
        KS();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void lMd() {
        this.zp.YW();
        dQp.zp zpVar = new dQp.zp();
        zpVar.zp(COT());
        zpVar.KS(ku());
        zpVar.lMd(HWF());
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.lMd(this.QR, zpVar);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(KS.lMd lmd) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void KS(boolean z8) {
        this.COT = z8;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp() {
        this.zp.dT();
        dQp.zp zpVar = new dQp.zp();
        zpVar.zp(COT());
        zpVar.KS(ku());
        zpVar.lMd(HWF());
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(this.QR, zpVar);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void lMd(long j7) {
        this.KS = j7;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void lMd(boolean z8) {
        this.jU = z8;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(boolean z8, int i9) {
        KS();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean zp(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        this.jU = ks.ku();
        if (ks.QR() > 0) {
            this.zp.zp(ks.QR());
        }
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(this.HWF, this.QR, ks);
        this.zp.YW();
        return true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(long j7) {
        this.zp.zp(j7);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(boolean z8) {
        this.lMd = z8;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(KS.zp zpVar) {
        this.zp.zp(zpVar);
    }
}
