package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.KVG;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.io.File;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public class tG {
    private long Bj;
    com.bykv.vk.openvk.component.video.api.jU.KS HWF;
    boolean KS;
    private boolean KVG;
    private final Activity QR;
    private FrameLayout YW;
    private final String dT;
    final boolean jU;
    private final woN ku;
    private com.bytedance.sdk.openadsdk.lMd.QR pvr;
    private String rV;
    private long vDp;
    private boolean vwr;
    private final zp woN;
    protected boolean zp = false;
    boolean lMd = false;
    protected boolean COT = false;
    private int tG = -1;
    private HashSet<String> dQp = new HashSet<>();

    public tG(zp zpVar) {
        this.woN = zpVar;
        this.QR = zpVar.oB;
        this.ku = zpVar.zp;
        this.jU = zpVar.HWF;
        this.dT = zpVar.QR;
    }

    private void YhE() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null && ks.vDp() != null) {
            this.Bj = this.HWF.COT();
            if (this.HWF.vDp().KS() || !this.HWF.vDp().lMd()) {
                this.HWF.zp();
                this.HWF.KS();
                this.zp = true;
            }
        }
    }

    public long Bj() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            return ks.HWF();
        }
        return 0L;
    }

    public boolean COT() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        return ks != null && ks.KVG();
    }

    public boolean FP() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            if (ks.vDp() != null) {
                com.bykv.vk.openvk.component.video.api.zp vDp = this.HWF.vDp();
                if (vDp.QR() || vDp.ku()) {
                    com.bykv.vk.openvk.component.video.api.jU.KS ks2 = this.HWF;
                    if (ks2 instanceof com.bytedance.sdk.openadsdk.core.video.KS.zp) {
                        ((com.bytedance.sdk.openadsdk.core.video.KS.zp) ks2).UPs();
                    }
                    return true;
                }
            } else if (HWF()) {
                zp(false);
                com.bykv.vk.openvk.component.video.api.jU.KS ks3 = this.HWF;
                if (ks3 instanceof com.bytedance.sdk.openadsdk.core.video.KS.zp) {
                    ((com.bytedance.sdk.openadsdk.core.video.KS.zp) ks3).UPs();
                }
                return true;
            }
        }
        return false;
    }

    public double Gzh() {
        long jU;
        KVG ku = this.ku.ku();
        if (com.bytedance.sdk.openadsdk.core.model.dQp.KS(this.ku) && ku != null) {
            jU = ku.lMd();
        } else if (com.bytedance.sdk.openadsdk.core.model.dQp.jU(this.ku) && ku != null) {
            jU = ku.jU();
        } else {
            com.bykv.vk.openvk.component.video.api.KS.lMd eWG = this.ku.eWG();
            if (eWG != null) {
                return eWG.HWF() * eWG.ot();
            }
            return 0.0d;
        }
        return jU;
    }

    public boolean HWF() {
        return this.zp;
    }

    public long KVG() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            return ks.ku();
        }
        return 0L;
    }

    public boolean Lij() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null && ks.vDp() != null) {
            return this.HWF.vDp().zp();
        }
        return false;
    }

    public long QR() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            return ks.COT();
        }
        return this.Bj;
    }

    public View QUv() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks instanceof com.bytedance.sdk.openadsdk.core.video.KS.zp) {
            return (View) ((com.bytedance.sdk.openadsdk.core.video.KS.zp) ks).fRl();
        }
        return null;
    }

    public void RCv() {
        try {
            if (lMd()) {
                this.COT = true;
                dQp();
            }
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e4.getMessage());
        }
    }

    public long YW() {
        return this.Bj;
    }

    public void cW() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks instanceof com.bytedance.sdk.openadsdk.core.video.KS.zp) {
            ((com.bytedance.sdk.openadsdk.core.video.KS.zp) ks).ffE();
        }
    }

    public long cz() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            return ks.ku();
        }
        return 0L;
    }

    public void dQp() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            ks.zp();
        }
    }

    public void dT() {
        try {
            if (lMd()) {
                this.HWF.zp();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.lMd("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void irS() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks instanceof com.bytedance.sdk.openadsdk.core.video.KS.zp) {
            ((com.bytedance.sdk.openadsdk.core.video.KS.zp) ks).WNy();
        }
    }

    public long ku() {
        return this.vDp;
    }

    public boolean ot() {
        if (this.HWF != null) {
            return true;
        }
        return false;
    }

    public boolean ox() {
        return this.KS;
    }

    public long pvr() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            return this.HWF.HWF() + ks.ku();
        }
        return 0L;
    }

    public void rV() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            ks.lMd();
        }
    }

    public void tG() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            ks.jU();
        }
    }

    public void vDp() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks == null) {
            return;
        }
        ks.KS();
        this.HWF = null;
    }

    public int vwr() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            return ks.QR();
        }
        return 0;
    }

    public int woN() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            return ks.dT();
        }
        return 0;
    }

    public boolean yRU() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null && ks.vDp() == null) {
            return true;
        }
        return false;
    }

    public void COT(boolean z8) {
        this.vwr = z8;
        if (this.HWF instanceof com.bytedance.sdk.openadsdk.core.video.KS.zp) {
            if (z8) {
                ((com.bytedance.sdk.openadsdk.core.video.KS.zp) this.HWF).lMd(this.ku.eWG().ot());
            } else {
                this.ku.eWG().dT(1);
                ((com.bytedance.sdk.openadsdk.core.video.KS.zp) this.HWF).lMd(1);
            }
        }
    }

    public com.bykv.vk.openvk.component.video.api.lMd.zp KS() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks == null) {
            return null;
        }
        if (ks instanceof com.bytedance.sdk.openadsdk.component.reward.KS) {
            return ((com.bytedance.sdk.openadsdk.component.reward.KS) ks).vwr();
        }
        return ks.tG();
    }

    public boolean jU() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        return (ks == null || ks.vDp() == null || !this.HWF.vDp().QR()) ? false : true;
    }

    public boolean lMd() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        return (ks == null || ks.vDp() == null || !this.HWF.vDp().HWF()) ? false : true;
    }

    public com.bytedance.sdk.openadsdk.lMd.QR zp() {
        return this.pvr;
    }

    private void lMd(long j7, long j9) {
        int abs = (int) Math.abs(this.tG - j7);
        int i9 = this.tG;
        if (i9 < 0 || abs > 500 || i9 > j9 || abs >= 500 || this.dQp.contains(this.rV)) {
            return;
        }
        if (this.tG > j7) {
            com.bytedance.sdk.openadsdk.core.tG.KS().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.tG.1
                @Override // java.lang.Runnable
                public void run() {
                    tG.this.RCv();
                    tG.this.woN.eWG.zp(tG.this.tG, tG.this.rV);
                }
            }, abs);
        } else {
            RCv();
            this.woN.eWG.zp(this.tG, this.rV);
        }
        this.dQp.add(this.rV);
    }

    public void jU(final boolean z8) {
        vDp();
        com.bytedance.sdk.openadsdk.core.tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.tG.2
            @Override // java.lang.Runnable
            public void run() {
                if (!tG.this.KS) {
                    if (z8) {
                        com.bytedance.sdk.openadsdk.component.reward.vDp.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()).zp(tG.this.ku.QUv());
                    } else {
                        com.bytedance.sdk.openadsdk.component.reward.COT.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()).zp(tG.this.ku.QUv());
                    }
                }
            }
        });
    }

    public void zp(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.lMd.QR qr) {
        if (this.KVG) {
            return;
        }
        this.KVG = true;
        this.YW = frameLayout;
        this.pvr = qr;
        if (woN.COT(this.ku)) {
            this.HWF = new com.bytedance.sdk.openadsdk.core.video.KS.zp(this.QR, this.YW, this.ku, qr);
            COT(this.vwr);
        } else {
            this.HWF = new com.bytedance.sdk.openadsdk.component.reward.KS(this.ku, qr);
        }
    }

    public void KS(boolean z8) {
        this.KS = z8;
    }

    public void lMd(boolean z8) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            ks.lMd(z8);
        }
    }

    public void zp(long j7, long j9) {
        this.vDp = j7;
        lMd(j7, j9);
    }

    public void lMd(com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd) {
        if (!FP() || lmd == null) {
            return;
        }
        lmd.zp(YW(), true);
    }

    public void zp(int i9, String str) {
        this.tG = i9;
        this.rV = str;
    }

    public void zp(long j7) {
        this.Bj = j7;
    }

    public void zp(boolean z8) {
        this.zp = z8;
    }

    public void zp(int i9, int i10) {
        if (this.HWF != null) {
            dQp.zp zpVar = new dQp.zp();
            zpVar.lMd(Bj());
            zpVar.KS(pvr());
            zpVar.zp(QR());
            zpVar.zp(i9);
            zpVar.lMd(i10);
            com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.jU(this.HWF.tG(), zpVar);
        }
    }

    public void zp(KS.zp zpVar) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            ks.zp(zpVar);
        }
    }

    public void zp(String str) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.HWF;
        if (ks != null) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.ku, this.dT, str, QR(), woN(), YhE.zp(this.ku, ks.HWF(), this.HWF.vDp()), this.pvr);
            pvr();
            woN();
        }
        cW();
    }

    public boolean zp(long j7, boolean z8, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd) {
        boolean z9 = false;
        if (!ot()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.dQp.KS(this.woN.zp) || com.bytedance.sdk.openadsdk.core.model.dQp.jU(this.woN.zp)) {
            return true;
        }
        if (!z8 || !yRU()) {
            zp(lmd);
        }
        try {
            z9 = zp(j7, this.woN.jU);
        } catch (Exception e4) {
            Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e4);
        }
        if (z9 && !z8) {
            this.woN.oKZ.zp(map);
        }
        return z9;
    }

    public void zp(com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd) {
        if (this.woN.FP.get()) {
            return;
        }
        zp zpVar = this.woN;
        if (!zpVar.COT || cz.Bj(zpVar.zp)) {
            return;
        }
        if ((!woN.COT(this.woN.zp) && com.bytedance.sdk.openadsdk.core.KVG.jU().vDp(String.valueOf(this.woN.dQp)) == 1 && this.woN.eWG.jU()) || com.bytedance.sdk.openadsdk.core.model.dQp.KS(this.woN.zp) || com.bytedance.sdk.openadsdk.core.model.dQp.jU(this.woN.zp) || this.COT || !lmd.HWF()) {
            return;
        }
        this.woN.qtv.removeMessages(300);
        Message obtain = Message.obtain();
        obtain.what = 300;
        this.woN.qtv.sendMessageDelayed(obtain, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    private boolean zp(long j7, boolean z8) {
        if (this.HWF == null || this.ku.eWG() == null) {
            return false;
        }
        String zp = CacheDirFactory.getICacheDir(this.ku.jyq()).zp();
        File file = new File(zp, this.ku.eWG().rV());
        if (file.exists() && file.length() > 0) {
            this.lMd = true;
        }
        com.bytedance.sdk.openadsdk.core.video.zp.lMd zp2 = woN.zp(zp, this.ku);
        zp2.lMd(this.ku.fgJ());
        zp2.zp(this.YW.getWidth());
        zp2.lMd(this.YW.getHeight());
        zp2.KS(this.ku.GP());
        zp2.zp(j7);
        zp2.zp(z8);
        if (this.woN.oB.KVG() && !this.woN.eWG.ku() && woN.COT(this.ku)) {
            zp2.jU = 1;
        }
        return this.HWF.zp(zp2);
    }

    public void zp(com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd) {
        try {
            this.COT = false;
            if (HWF()) {
                YhE();
                lMd(lmd);
            } else if (jU()) {
                rV();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void zp(boolean z8, com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd, boolean z9) {
        if (!z9 || z8 || this.COT) {
            return;
        }
        if (jU()) {
            rV();
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
        } else {
            YhE();
            lMd(lmd);
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }
}
