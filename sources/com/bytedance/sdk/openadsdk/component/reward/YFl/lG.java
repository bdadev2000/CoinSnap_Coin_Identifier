package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.GA.AlY.YFl;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import k5.c;
import l5.e;
import l5.g;
import m2.l;
import org.json.JSONObject;
import p5.a;

/* loaded from: classes.dex */
public class lG {
    final boolean AlY;
    private final Activity DSW;
    private FrameLayout NjR;
    private boolean Wwa;
    private long YoT;
    private com.bytedance.sdk.openadsdk.AlY.DSW aIu;
    private long eT;
    private final YFl lG;

    /* renamed from: nc, reason: collision with root package name */
    private final String f10592nc;
    private String pDU;
    private YFl.InterfaceC0113YFl qO;
    private final com.bytedance.sdk.openadsdk.core.model.Wwa qsH;
    private boolean rkt;
    boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    g f10593vc;
    protected boolean YFl = false;
    boolean Sg = false;
    protected boolean wN = false;
    private int GA = -1;
    private HashSet<String> EH = new HashSet<>();

    public lG(YFl yFl) {
        this.lG = yFl;
        this.DSW = yFl.UI;
        this.qsH = yFl.Sg;
        this.AlY = yFl.AlY;
        this.f10592nc = yFl.wN;
    }

    private void zB() {
        g gVar = this.f10593vc;
        if (gVar != null && gVar.YoT() != null) {
            this.eT = this.f10593vc.wN();
            if (this.f10593vc.YoT().tN() || !this.f10593vc.YoT().Sg()) {
                this.f10593vc.YFl();
                this.f10593vc.tN();
                this.YFl = true;
            }
        }
    }

    public boolean AlY() {
        g gVar = this.f10593vc;
        return (gVar == null || gVar.YoT() == null || !this.f10593vc.YoT().DSW()) ? false : true;
    }

    public void Cfr() {
        g gVar = this.f10593vc;
        if (gVar instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) {
            ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) gVar).mn();
        }
    }

    public long DSW() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            return gVar.wN();
        }
        return this.eT;
    }

    public void EH() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            gVar.YFl();
        }
    }

    public void GA() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            gVar.AlY();
        }
    }

    public boolean Ga() {
        g gVar = this.f10593vc;
        if (gVar != null && gVar.YoT() != null) {
            return this.f10593vc.YoT().YFl();
        }
        return false;
    }

    public boolean Ne() {
        return this.f10593vc != null;
    }

    public long NjR() {
        return this.eT;
    }

    public void UZM() {
        YoT();
    }

    public boolean VOe() {
        g gVar = this.f10593vc;
        return gVar != null && gVar.YoT() == null;
    }

    public int Wwa() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            return gVar.DSW();
        }
        return 0;
    }

    public void YI() {
        try {
            if (Sg()) {
                this.wN = true;
                EH();
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e2.getMessage());
        }
    }

    public void YoT() {
        g gVar = this.f10593vc;
        if (gVar == null) {
            return;
        }
        gVar.tN();
        this.f10593vc = null;
    }

    public long aIu() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            return gVar.qsH();
        }
        return 0L;
    }

    public boolean bZ() {
        return this.tN;
    }

    public double dXO() {
        long AlY;
        com.bytedance.sdk.openadsdk.core.model.lG NjR = this.qsH.NjR();
        if (com.bytedance.sdk.openadsdk.core.model.rkt.tN(this.qsH) && NjR != null) {
            AlY = NjR.Sg();
        } else if (com.bytedance.sdk.openadsdk.core.model.rkt.AlY(this.qsH) && NjR != null) {
            AlY = NjR.AlY();
        } else {
            a BPI = this.qsH.BPI();
            if (BPI != null) {
                return BPI.f23459d * BPI.f23473r;
            }
            return 0.0d;
        }
        return AlY;
    }

    public long eT() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            return gVar.vc();
        }
        return 0L;
    }

    public View hQ() {
        g gVar = this.f10593vc;
        if (gVar instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) {
            return (View) ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) gVar).Sco();
        }
        return null;
    }

    public int lG() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            return gVar.nc();
        }
        return 0;
    }

    public void mn() {
        g gVar = this.f10593vc;
        if (gVar instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) {
            ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) gVar).lu();
        }
    }

    public void nc() {
        try {
            if (Sg()) {
                this.f10593vc.YFl();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.Sg("RewardFullVideoPlayerManager onPause throw Exception :" + th2.getMessage());
        }
    }

    public void pDU() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            gVar.Sg();
        }
    }

    public void pq() {
        g gVar = this.f10593vc;
        if (gVar instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) {
            ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) gVar).GS();
        }
    }

    public long qO() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            return this.f10593vc.vc() + gVar.qsH();
        }
        return 0L;
    }

    public long qsH() {
        return this.YoT;
    }

    public long rkt() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            return gVar.qsH();
        }
        return 0L;
    }

    public boolean vc() {
        return this.YFl;
    }

    public boolean wN() {
        g gVar = this.f10593vc;
        return gVar != null && gVar.rkt();
    }

    public boolean wXo() {
        g gVar = this.f10593vc;
        if (gVar != null) {
            if (gVar.YoT() != null) {
                c YoT = this.f10593vc.YoT();
                if (YoT.DSW() || YoT.qsH()) {
                    g gVar2 = this.f10593vc;
                    if (gVar2 instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) {
                        ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) gVar2).zB();
                    }
                    return true;
                }
            } else if (vc()) {
                YFl(false);
                g gVar3 = this.f10593vc;
                if (gVar3 instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) {
                    ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) gVar3).zB();
                }
                return true;
            }
        }
        return false;
    }

    public void AlY(boolean z10) {
        this.Wwa = z10;
        if (this.f10593vc instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) {
            if (z10) {
                ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) this.f10593vc).Sg(this.qsH.BPI().f23473r);
            } else {
                a BPI = this.qsH.BPI();
                BPI.getClass();
                BPI.f23473r = Math.min(4, Math.max(1, 1));
                ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) this.f10593vc).Sg(1);
            }
        }
    }

    public boolean Sg() {
        g gVar = this.f10593vc;
        return (gVar == null || gVar.YoT() == null || !this.f10593vc.YoT().vc()) ? false : true;
    }

    public com.bytedance.sdk.openadsdk.AlY.DSW YFl() {
        return this.aIu;
    }

    public n5.a tN() {
        g gVar = this.f10593vc;
        if (gVar == null) {
            return null;
        }
        if (gVar instanceof com.bytedance.sdk.openadsdk.component.reward.tN) {
            return ((com.bytedance.sdk.openadsdk.component.reward.tN) gVar).Wwa();
        }
        return gVar.GA();
    }

    private void Sg(long j3, long j10) {
        int abs = (int) Math.abs(this.GA - j3);
        int i10 = this.GA;
        if (i10 < 0 || abs > 500 || i10 > j10 || abs >= 500 || this.EH.contains(this.pDU)) {
            return;
        }
        if (this.GA > j3) {
            com.bytedance.sdk.openadsdk.core.pDU.tN().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.lG.1
                @Override // java.lang.Runnable
                public void run() {
                    lG.this.YI();
                    lG.this.lG.YI.YFl(lG.this.GA, lG.this.pDU);
                }
            }, abs);
        } else {
            YI();
            this.lG.YI.YFl(this.GA, this.pDU);
        }
        this.EH.add(this.pDU);
    }

    public void YFl(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.AlY.DSW dsw) {
        if (this.rkt) {
            return;
        }
        this.rkt = true;
        this.NjR = frameLayout;
        this.aIu = dsw;
        if (com.bytedance.sdk.openadsdk.core.model.Wwa.wN(this.qsH)) {
            this.f10593vc = new com.bytedance.sdk.openadsdk.core.GA.AlY.YFl(this.DSW, this.NjR, this.qsH, dsw);
            AlY(this.Wwa);
            YFl.InterfaceC0113YFl interfaceC0113YFl = this.qO;
            if (interfaceC0113YFl != null) {
                ((com.bytedance.sdk.openadsdk.core.GA.AlY.YFl) this.f10593vc).YFl(interfaceC0113YFl);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.tN tNVar = new com.bytedance.sdk.openadsdk.component.reward.tN(this.qsH, dsw);
        this.f10593vc = tNVar;
        YFl.InterfaceC0113YFl interfaceC0113YFl2 = this.qO;
        if (interfaceC0113YFl2 != null) {
            tNVar.YFl(interfaceC0113YFl2);
        }
    }

    public void tN(boolean z10) {
        this.tN = z10;
    }

    public void Sg(boolean z10) {
        g gVar = this.f10593vc;
        if (gVar != null) {
            gVar.Sg(z10);
        }
    }

    public void Sg(com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2) {
        if (!wXo() || sg2 == null) {
            return;
        }
        sg2.YFl(NjR(), true);
    }

    public void YFl(long j3, long j10) {
        this.YoT = j3;
        Sg(j3, j10);
    }

    public void YFl(int i10, String str) {
        this.GA = i10;
        this.pDU = str;
    }

    public void YFl(long j3) {
        this.eT = j3;
    }

    public void YFl(boolean z10) {
        this.YFl = z10;
    }

    public void YFl(int i10, int i11) {
        if (this.f10593vc != null) {
            EH.YFl yFl = new EH.YFl();
            yFl.Sg(eT());
            yFl.tN(qO());
            yFl.YFl(DSW());
            yFl.YFl(i10);
            yFl.Sg(i11);
            com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.AlY(this.f10593vc.GA(), yFl);
        }
    }

    public void YFl(e eVar) {
        g gVar = this.f10593vc;
        if (gVar != null) {
            gVar.YFl(eVar);
        }
    }

    public void YFl(String str, boolean z10) {
        if (this.f10593vc != null) {
            long DSW = DSW();
            if (this.qsH.Xns()) {
                DSW = this.lG.tN();
            }
            long j3 = DSW;
            JSONObject YFl = Sco.YFl(this.qsH, this.f10593vc.vc(), this.f10593vc.YoT());
            try {
                YFl.put("auto_click", z10);
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.qsH, this.f10592nc, str, j3, lG(), YFl, this.aIu);
            qO();
            lG();
        }
        pq();
    }

    public boolean YFl(long j3, boolean z10, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2) {
        boolean z11 = false;
        if (!Ne()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rkt.tN(this.lG.Sg) || com.bytedance.sdk.openadsdk.core.model.rkt.AlY(this.lG.Sg)) {
            return true;
        }
        if (!z10 || !VOe()) {
            YFl(sg2);
        }
        try {
            z11 = YFl(j3, this.lG.iY);
        } catch (Exception e2) {
            Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e2);
        }
        if (z11 && !z10) {
            this.lG.dXO.YFl(map);
        }
        return z11;
    }

    public void YFl(com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2) {
        if (this.lG.f10590nc.get()) {
            return;
        }
        YFl yFl = this.lG;
        if (!yFl.Bh || Ne.tN(yFl.Sg)) {
            return;
        }
        if ((!com.bytedance.sdk.openadsdk.core.model.Wwa.wN(this.lG.Sg) && com.bytedance.sdk.openadsdk.core.lG.AlY().GA(String.valueOf(this.lG.f10591vc)) == 1 && this.lG.YI.AlY()) || com.bytedance.sdk.openadsdk.core.model.rkt.tN(this.lG.Sg) || com.bytedance.sdk.openadsdk.core.model.rkt.AlY(this.lG.Sg) || this.wN || !sg2.vc()) {
            return;
        }
        this.lG.zG.removeMessages(300);
        Message obtain = Message.obtain();
        obtain.what = 300;
        this.lG.zG.sendMessageDelayed(obtain, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    private boolean YFl(long j3, boolean z10) {
        if (this.f10593vc == null || this.qsH.BPI() == null) {
            return false;
        }
        String d10 = ((l) CacheDirFactory.getICacheDir(this.qsH.dBO())).d();
        File file = new File(d10, this.qsH.BPI().c());
        if (file.exists() && file.length() > 0) {
            this.Sg = true;
        }
        com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl = com.bytedance.sdk.openadsdk.core.model.Wwa.YFl(d10, this.qsH);
        YFl.Sg(this.qsH.zz());
        YFl.YFl(this.NjR.getWidth());
        YFl.Sg(this.NjR.getHeight());
        YFl.tN(this.qsH.uGS());
        YFl.YFl(j3);
        YFl.YFl(z10);
        if (this.lG.Sg.YFl() && !this.lG.YI.qsH() && com.bytedance.sdk.openadsdk.core.model.Wwa.wN(this.qsH)) {
            YFl.AlY = 1;
        }
        return this.f10593vc.YFl(YFl);
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2) {
        try {
            this.wN = false;
            if (vc()) {
                zB();
                Sg(sg2);
            } else if (AlY()) {
                pDU();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public void YFl(boolean z10, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2, boolean z11) {
        if (!z11 || z10 || this.wN) {
            return;
        }
        if (AlY()) {
            pDU();
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
        } else {
            zB();
            Sg(sg2);
            Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    public void YFl(YFl.InterfaceC0113YFl interfaceC0113YFl) {
        this.qO = interfaceC0113YFl;
    }
}
