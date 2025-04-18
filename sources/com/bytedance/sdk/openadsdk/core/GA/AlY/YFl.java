package com.bytedance.sdk.openadsdk.core.GA.AlY;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.GA.pDU;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.core.GA.AlY.tN;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.YoT.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import j5.a;
import java.util.Objects;
import k5.c;
import l5.e;
import p5.b;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.sdk.openadsdk.core.GA.YFl.YFl {
    private InterfaceC0113YFl BPI;
    private long GS;
    private final DSW Sco;
    private final int UI;
    private final Runnable ZU;
    private long lu;
    private boolean mB;
    protected boolean mn;
    protected long pq;
    final tN.Sg zB;

    /* renamed from: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements tN.Sg {
        private boolean Sg = true;

        public AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void AlY(c cVar) {
            com.bytedance.sdk.openadsdk.core.YoT.YFl Af = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH.Af();
            if (Af != null && Af.YFl() != null) {
                Af.YFl().Sg(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).NjR);
            }
            wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH, 3);
            if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO != null) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO.YFl(0);
            }
            if (YFl.this.BPI != null) {
                YFl.this.BPI.YFl(2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void Sg(c cVar, int i10) {
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void YFl(c cVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl;
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.1
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO != null) {
                        try {
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO.YFl(9);
                        } catch (Exception unused2) {
                        }
                    }
                    YFl.this.ZU();
                }
            });
            com.bytedance.sdk.openadsdk.core.YoT.YFl Af = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH.Af();
            if (Af != null && Af.YFl() != null) {
                long wN = YFl.this.wN();
                Af.YFl().AlY(wN);
                Af.YFl().wN(wN);
            }
            wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH, 5);
            if (YFl.this.BPI != null) {
                YFl.this.BPI.YFl(3);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void tN(c cVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl;
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void wN(c cVar) {
            wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH, 0);
            if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO != null) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO.YFl(1);
            }
            if (YFl.this.BPI != null) {
                YFl.this.BPI.YFl(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void Sg(c cVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl;
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.removeCallbacks(YFl.this.ZU);
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW != null) {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.Sg();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void YFl(c cVar, long j3) {
            String unused = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl;
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).bZ = false;
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.removeCallbacks(YFl.this.ZU);
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW != null) {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.Sg();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).aIu.get()) {
                YFl yFl = YFl.this;
                yFl.pq = j3;
                yFl.YFl(yFl.Sco);
                YFl.this.pq();
            }
            if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO != null) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO.tN();
            }
            wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH, 0);
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void YFl(c cVar, b bVar) {
            YoT.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl, "onError: " + bVar.a + "," + bVar.f23474b + "," + bVar.f23475c);
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.removeCallbacks(YFl.this.ZU);
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW != null) {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.Sg();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).Ga != null) {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).Ga.Sg(YFl.this.lu, a.a(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).NjR, ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).Cfr));
                    }
                }
            });
            YFl.this.YFl(bVar);
            wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH, 6);
            if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO != null) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO.YFl(14);
            }
            if (YFl.this.BPI != null) {
                YFl.this.BPI.YFl(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void YFl(c cVar, boolean z10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl;
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.removeCallbacks(YFl.this.ZU);
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW != null) {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.Sg();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void YFl(c cVar, int i10, int i11) {
            String unused = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl;
            com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).f10635vc == null) {
                        return;
                    }
                    try {
                        final float AlY = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).f10635vc.AlY();
                        final float wN = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).f10635vc.wN();
                        if (AlY != 0.0f && wN != 0.0f) {
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (!YFl.this.BPI()) {
                                        YFl.this.YFl(AlY, wN);
                                        return;
                                    }
                                    if (!rkt.Sg(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH) && ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).VOe.wN != 4) {
                                        if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH.dXO() == 3) {
                                            YFl.this.YFl(true, AlY, wN);
                                            return;
                                        } else if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH.dXO() != 0) {
                                            YFl.this.Sg(AlY, wN);
                                            return;
                                        } else {
                                            YFl.this.tN(AlY, wN);
                                            return;
                                        }
                                    }
                                    YFl.this.YFl(true, AlY, wN);
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        YoT.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl, th2.getMessage());
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void YFl(c cVar, int i10, int i11, int i12) {
            String unused = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl;
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).bZ = true;
            YFl.this.UI();
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW != null) {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.lG();
                    }
                }
            });
            wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH, 3);
            if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO != null) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO.YFl(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void YFl(c cVar, int i10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl;
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).bZ = false;
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.removeCallbacks(YFl.this.ZU);
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW != null) {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.Sg();
                    }
                }
            });
            wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH, 0);
            if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO != null) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO.YFl(5);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg, k5.b
        public void YFl(c cVar, long j3, long j10) {
            if (Math.abs(j3 - ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).NjR) < 50) {
                return;
            }
            YFl yFl = YFl.this;
            yFl.YFl(yFl.Sco);
            YFl.this.YFl(j3, j10);
            YFl.this.Sg(j3, j10);
            com.bytedance.sdk.openadsdk.core.YoT.YFl Af = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).qsH.Af();
            if (Af != null && Af.YFl() != null) {
                Af.YFl().YFl(j3, j10, ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).dXO);
            }
            if (!this.Sg || j10 - j3 >= 500) {
                return;
            }
            this.Sg = false;
            YFl(cVar);
        }

        @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.tN.Sg
        public void YFl(int i10, int i11) {
            YFl yFl = YFl.this;
            yFl.Sg(yFl.Sco);
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).VOe.AlY = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).f10635vc.aIu();
            YFl.this.Cfr();
            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).aIu.set(false);
            YFl yFl2 = YFl.this;
            yFl2.YFl(yFl2.Sco);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0113YFl {
        void YFl(int i10);
    }

    public YFl(Context context, ViewGroup viewGroup, Wwa wwa, DSW dsw) {
        super(context, wwa, viewGroup);
        this.GS = 0L;
        this.lu = 0L;
        this.mB = false;
        this.pq = 0L;
        this.mn = false;
        this.zB = new AnonymousClass1();
        this.ZU = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).Ga != null) {
                    YFl.this.Wwa();
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).Ga.YFl();
                }
            }
        };
        this.Sco = dsw;
        this.UI = wwa.kU();
        if (wwa.yn() && wwa.Af() != null && this.UZM != null) {
            if (this.dXO == null) {
                this.dXO = vc.YFl();
            }
            this.dXO.YFl(this.UZM, wwa.Af().pDU());
        }
        com.bytedance.sdk.openadsdk.core.GA.Sg.wN wNVar = new com.bytedance.sdk.openadsdk.core.GA.Sg.wN(context.getApplicationContext(), new pDU(context), true, 17, this.qsH, this);
        this.DSW = wNVar;
        wNVar.YFl(this);
    }

    public void Wwa() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl
    public boolean bZ() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean BPI() {
        return this.qsH.qjy() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void UI() {
        int ZU;
        int i10 = this.VOe.wN;
        if (i10 != 2 && i10 != 1) {
            ZU = i10 == 4 ? lG.AlY().NjR(String.valueOf(this.UI)) : 5000;
        } else {
            ZU = lG.AlY().ZU() * 1000;
        }
        this.tN.removeCallbacks(this.ZU);
        this.tN.postDelayed(this.ZU, ZU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU() {
        if (this.DSW == null) {
            return;
        }
        this.tN.removeCallbacks(this.ZU);
        this.DSW.Sg();
        this.lu = System.currentTimeMillis() - this.GS;
        if (!this.mB) {
            this.mB = true;
            long j3 = this.Cfr;
            Sg(j3, j3);
            long j10 = this.Cfr;
            this.NjR = j10;
            this.f10634nc = j10;
            Sg(this.Sco);
        }
        e eVar = this.Ga;
        if (eVar != null) {
            eVar.YFl(this.lu, a.a(this.NjR, this.Cfr));
        }
        this.pDU = true;
    }

    private void mB() {
        this.f10635vc.tN(hQ());
        this.f10635vc.YFl(this.VOe);
        this.GS = System.currentTimeMillis();
        this.DSW.tN(8);
        this.DSW.tN(0);
        YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).f10635vc == null) {
                    return;
                }
                YFl.this.GS = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.AlY(0);
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).f10635vc.YFl(true, ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).NjR, ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).rkt);
            }
        });
    }

    private boolean zG() {
        return Sco() == null || this.f10635vc == null || (!com.bytedance.sdk.openadsdk.core.eT.tN.YFl(this.qsH.UZM()) ? this.qsH.lu() != null : this.qsH.UI() != null) || this.qsH.Cfr() == 1;
    }

    public void GS() {
        vc vcVar = this.dXO;
        if (vcVar != null) {
            vcVar.YFl(2);
        }
    }

    public q5.c Sco() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.wN wNVar = this.DSW;
        if (wNVar != null) {
            return wNVar.GA();
        }
        return null;
    }

    public void lu() {
        vc vcVar = this.dXO;
        if (vcVar != null) {
            vcVar.YFl(13);
        }
    }

    public void mn() {
        this.zB.YFl((c) null, 0, 0);
    }

    public void zB() {
        if (this.mB || !this.aIu.get()) {
            return;
        }
        Ga();
        com.bytedance.sdk.openadsdk.core.YoT.YFl Af = this.qsH.Af();
        if (Af == null || Af.YFl() == null) {
            return;
        }
        Af.YFl().tN(wN());
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void AlY() {
        tN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void tN() {
        tN tNVar = this.f10635vc;
        if (tNVar == null) {
            return;
        }
        tNVar.YoT();
        this.f10635vc = null;
        com.bytedance.sdk.openadsdk.core.GA.Sg.wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.NjR();
        }
        this.tN.removeCallbacks(this.ZU);
        this.tN.removeCallbacksAndMessages(null);
        vc vcVar = this.dXO;
        if (vcVar != null) {
            vcVar.AlY();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void Sg() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.YFl();
            this.DSW.EH();
            this.DSW.Wwa();
        }
        tN tNVar = this.f10635vc;
        if (tNVar != null) {
            if (tNVar.DSW()) {
                if (this.GA) {
                    if (NjR.Ne()) {
                        this.f10635vc.Sg(3);
                        tN tNVar2 = this.f10635vc;
                        tNVar2.YFl(false, tNVar2.lG(), this.rkt);
                    } else {
                        wXo();
                    }
                } else {
                    Sg(this.hQ);
                }
            } else {
                this.f10635vc.YFl(false, this.NjR, this.rkt);
            }
        }
        if (this.mB || !this.aIu.get()) {
            return;
        }
        Ga();
        com.bytedance.sdk.openadsdk.core.YoT.YFl Af = this.qsH.Af();
        if (Af == null || Af.YFl() == null) {
            return;
        }
        Af.YFl().tN(wN());
    }

    public void YFl(boolean z10, float f10, float f11) {
        try {
            Objects.toString(this.qsH.pq());
            if (!zG() || z10) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
                layoutParams.addRule(13);
                if (Sco() != null) {
                    if (Sco() instanceof TextureView) {
                        ((TextureView) Sco()).setLayoutParams(layoutParams);
                    } else if (Sco() instanceof SurfaceView) {
                        ((SurfaceView) Sco()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.UZM.getLayoutParams();
                    if (this.UZM.getHeight() > 0) {
                        float min = Math.min(this.UZM.getWidth() / f10, this.UZM.getHeight() / f11);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f10 * min);
                            layoutParams.height = (int) (f11 * min);
                            if (Sco() instanceof TextureView) {
                                ((TextureView) Sco()).setLayoutParams(layoutParams);
                            } else if (Sco() instanceof SurfaceView) {
                                ((SurfaceView) Sco()).setLayoutParams(layoutParams);
                            }
                            if (this.VOe.wN == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.UZM.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            YoT.YFl(this.YFl, "changeSize error", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN(float f10, float f11) {
        try {
            if (Sco() != null && this.f10635vc != null) {
                boolean z10 = this.qsH.SVa() == 1;
                int[] Sg = GS.Sg(lG.YFl());
                YFl(Sg[0], Sg[1], f10, f11, z10);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(float f10, float f11) {
        try {
            Objects.toString(this.qsH.pq());
            if (zG()) {
                return;
            }
            int[] Sg = GS.Sg(lG.YFl());
            boolean z10 = false;
            boolean z11 = this.qsH.SVa() == 1;
            float f12 = Sg[0];
            float f13 = Sg[1];
            if (z11) {
                if (f10 > f11) {
                    YFl(f12, f13, f10, f11, true);
                    return;
                }
            } else if (f10 < f11) {
                YFl(f12, f13, f10, f11, false);
                return;
            }
            float f14 = f10 / f11;
            float f15 = f12 / f13;
            if (z11) {
                if (f15 < 0.5625f && f14 == 0.5625f) {
                    f10 = (9.0f * f13) / 16.0f;
                    z10 = true;
                    f11 = f13;
                }
            } else if (f15 > 1.7777778f && f14 == 1.7777778f) {
                f11 = (9.0f * f12) / 16.0f;
                z10 = true;
                f10 = f12;
            }
            if (z10) {
                f12 = f10;
                f13 = f11;
            }
            int i10 = (int) f12;
            int i11 = (int) f13;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(13);
            if (Sco() != null) {
                if (Sco() instanceof TextureView) {
                    ((TextureView) Sco()).setLayoutParams(layoutParams);
                } else if (Sco() instanceof SurfaceView) {
                    ((SurfaceView) Sco()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.UZM.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i11;
                    layoutParams2.width = i10;
                    this.UZM.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th2) {
            YoT.YFl(this.YFl, "changeSize error", th2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public boolean YFl(@NonNull p5.c cVar) {
        int qO;
        View view;
        if (this.f10635vc != null) {
            YoT.YFl(this.YFl, "playVideoUrl: already invoked");
            return false;
        }
        cVar.GA();
        if (TextUtils.isEmpty(cVar.GA())) {
            YoT.YFl(this.YFl, "No video info");
            return false;
        }
        Sg(cVar);
        cVar.tN(1);
        this.mn = !cVar.GA().startsWith("http");
        if (this.dXO != null) {
            if (this.VOe.wN == 1) {
                qO = lG.AlY().nc(String.valueOf(this.UI));
            } else {
                qO = lG.AlY().qO(String.valueOf(this.UI));
            }
            ViewGroup viewGroup = this.UZM;
            if (viewGroup != null && (view = (View) viewGroup.getParent()) != null) {
                try {
                    View findViewById = view.findViewById(GA.YoT);
                    View findViewById2 = view.findViewById(GA.CR);
                    vc vcVar = this.dXO;
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    vcVar.YFl(findViewById2, friendlyObstructionPurpose);
                    this.dXO.YFl(findViewById, friendlyObstructionPurpose);
                } catch (Throwable unused) {
                }
            }
            this.dXO.YFl(qO > 0, qO / 1000.0f);
        }
        Cfr();
        if (cVar.DSW() > 0) {
            long DSW = cVar.DSW();
            this.NjR = DSW;
            this.f10634nc = Math.max(this.f10634nc, DSW);
        }
        com.bytedance.sdk.openadsdk.core.GA.Sg.wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.YFl();
            this.DSW.DSW();
            this.DSW.tN(cVar.wN(), cVar.vc());
            this.DSW.tN(this.UZM);
        }
        tN tNVar = new tN();
        this.f10635vc = tNVar;
        tNVar.YFl(this.zB);
        qO();
        this.lu = 0L;
        mB();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(final long j3, final long j10) {
        this.qsH.tN(j3);
        this.NjR = j3;
        this.Cfr = j10;
        final int a = a.a(j3, j10);
        this.tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.YFl(j3, j10);
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).DSW.YFl(a);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).Ga != null) {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).Ga.YFl(j3, j10);
                    }
                } catch (Throwable th2) {
                    YoT.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) YFl.this).YFl, "onProgressUpdate error: ", th2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void YFl(boolean z10, int i10) {
        tN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(float f10, float f11) {
        ViewGroup viewGroup;
        try {
            if (Sco() != null && this.f10635vc != null && (viewGroup = this.UZM) != null) {
                float width = viewGroup.getWidth();
                float f12 = f10 / (width * 1.0f);
                float height = this.UZM.getHeight();
                if (f12 <= f11 / (1.0f * height)) {
                    width = (height / f11) * f10;
                } else {
                    height = (width / f10) * f11;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (Sco() instanceof TextureView) {
                    ((TextureView) Sco()).setLayoutParams(layoutParams);
                } else if (Sco() instanceof SurfaceView) {
                    ((SurfaceView) Sco()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th2) {
            YoT.YFl(this.YFl, "changeVideoSizeSupportInteraction error", th2);
        }
    }

    private void YFl(float f10, float f11, float f12, float f13, boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        if (f12 <= 0.0f || f13 <= 0.0f) {
            try {
                f12 = this.qsH.BPI().f23457b;
                f13 = this.qsH.BPI().a;
            } catch (Throwable unused) {
                return;
            }
        }
        if (f13 > 0.0f && f12 > 0.0f) {
            if (z10) {
                if (f12 < f13) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
            } else if (f12 > f13) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
            }
            layoutParams.addRule(13);
            if (Sco() != null) {
                if (Sco() instanceof TextureView) {
                    ((TextureView) Sco()).setLayoutParams(layoutParams);
                } else if (Sco() instanceof SurfaceView) {
                    ((SurfaceView) Sco()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.UZM.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.AlY.Sg.YFl(lG.YFl()) || this.UZM.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.UZM.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public void YFl(l5.a aVar, View view) {
        tN tNVar = this.f10635vc;
        if (tNVar == null) {
            return;
        }
        if (tNVar.vc()) {
            YFl();
            this.DSW.Sg(true, false);
            this.DSW.vc();
            return;
        }
        if (!this.f10635vc.DSW()) {
            com.bytedance.sdk.openadsdk.core.GA.Sg.wN wNVar = this.DSW;
            if (wNVar != null) {
                wNVar.tN(this.UZM);
            }
            AlY(this.NjR);
            com.bytedance.sdk.openadsdk.core.GA.Sg.wN wNVar2 = this.DSW;
            if (wNVar2 != null) {
                wNVar2.Sg(false, false);
                return;
            }
            return;
        }
        Sg();
        com.bytedance.sdk.openadsdk.core.GA.Sg.wN wNVar3 = this.DSW;
        if (wNVar3 != null) {
            wNVar3.Sg(false, false);
        }
    }

    public void YFl(InterfaceC0113YFl interfaceC0113YFl) {
        this.BPI = interfaceC0113YFl;
    }
}
