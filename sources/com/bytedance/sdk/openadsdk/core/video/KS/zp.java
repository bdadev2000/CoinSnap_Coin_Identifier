package com.bytedance.sdk.openadsdk.core.video.KS;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.QR.HWF;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.KS.jU;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.layout.TTVideoPlayLayoutForLiveLayout;
import com.bytedance.sdk.openadsdk.rV.zp.COT;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.Objects;

/* loaded from: classes.dex */
public class zp extends com.bytedance.sdk.openadsdk.core.video.zp.zp {
    private final Runnable BO;
    private boolean Pxi;
    final jU.lMd UPs;
    HWF WNy;
    protected boolean YhE;
    protected long cW;
    private long eWG;
    private final QR fRl;
    private long ffE;
    private final int oKZ;

    public zp(Context context, ViewGroup viewGroup, woN won, QR qr) {
        super(context, won, viewGroup);
        this.ffE = 0L;
        this.eWG = 0L;
        this.Pxi = false;
        this.cW = 0L;
        this.YhE = false;
        this.UPs = new jU.lMd() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1
            private boolean lMd = true;

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void COT(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR, 0);
                HWF hwf = zp.this.WNy;
                if (hwf != null) {
                    hwf.zp(1);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void KS(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp;
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void jU(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                com.bytedance.sdk.openadsdk.core.QR.zp xg = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR.xg();
                if (xg != null && xg.zp() != null) {
                    xg.zp().lMd(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).ku);
                }
                COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR, 3);
                HWF hwf = zp.this.WNy;
                if (hwf != null) {
                    hwf.zp(0);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void lMd(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zp.this.oKZ();
                    }
                });
                com.bytedance.sdk.openadsdk.core.QR.zp xg = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR.xg();
                if (xg != null && xg.zp() != null) {
                    long COT = zp.this.COT();
                    xg.zp().jU(COT);
                    xg.zp().COT(COT);
                }
                COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR, 5);
                HWF hwf = zp.this.WNy;
                if (hwf != null) {
                    hwf.zp(9);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void lMd(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.removeCallbacks(zp.this.BO);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.lMd();
                        }
                    }
                });
                zp zpVar2 = zp.this;
                HWF hwf = zpVar2.WNy;
                if (hwf != null) {
                    hwf.zp(zpVar2.ku(), zp.this.rV());
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, long j7) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).yRU = false;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.removeCallbacks(zp.this.BO);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.lMd();
                        }
                    }
                });
                if (!((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).pvr.get()) {
                    zp zpVar2 = zp.this;
                    zpVar2.cW = j7;
                    zpVar2.zp(zpVar2.fRl);
                    zp.this.YhE();
                }
                HWF hwf = zp.this.WNy;
                if (hwf != null) {
                    hwf.KS();
                }
                COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR, 0);
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, com.bykv.vk.openvk.component.video.api.KS.zp zpVar2) {
                tG.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp, "onError: " + zpVar2.zp() + "," + zpVar2.lMd() + "," + zpVar2.KS());
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.removeCallbacks(zp.this.BO);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.lMd();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).Lij != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).Lij.lMd(zp.this.eWG, com.bykv.vk.openvk.component.video.zp.COT.zp.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).ku, ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).irS));
                        }
                    }
                });
                zp.this.zp(zpVar2);
                COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR, 6);
                HWF hwf = zp.this.WNy;
                if (hwf != null) {
                    hwf.zp(14);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, boolean z8) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.removeCallbacks(zp.this.BO);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.lMd();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9, int i10) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!zp.this.BO()) {
                            zp.this.Iv();
                            return;
                        }
                        if (!dQp.lMd(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR) && ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).ot.COT != 4) {
                            if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR.Lij() == 3) {
                                zp.this.QR(true);
                                return;
                            } else if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR.Lij() == 0) {
                                zp.this.si();
                                return;
                            } else {
                                zp.this.Rg();
                                return;
                            }
                        }
                        zp.this.QR(true);
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9, int i10, int i11) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).yRU = true;
                zp.this.Pxi();
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.woN();
                        }
                    }
                });
                COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR, 3);
                HWF hwf = zp.this.WNy;
                if (hwf != null) {
                    hwf.zp(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9) {
                String unused = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).yRU = false;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.removeCallbacks(zp.this.BO);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.lMd();
                        }
                    }
                });
                COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR, 0);
                HWF hwf = zp.this.WNy;
                if (hwf != null) {
                    hwf.zp(5);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, long j7, long j9) {
                if (Math.abs(j7 - ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).ku) < 50) {
                    return;
                }
                zp zpVar2 = zp.this;
                zpVar2.zp(zpVar2.fRl);
                zp.this.zp(j7, j9);
                com.bytedance.sdk.openadsdk.core.QR.zp xg = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).QR.xg();
                if (xg != null && xg.zp() != null) {
                    xg.zp().zp(j7, j9, zp.this.WNy);
                }
                if (!this.lMd || j9 - j7 >= 500) {
                    return;
                }
                this.lMd = false;
                zp(zpVar);
            }

            @Override // com.bytedance.sdk.openadsdk.core.video.KS.jU.lMd
            public void zp(int i9, int i10) {
                zp zpVar = zp.this;
                zpVar.lMd(zpVar.fRl);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).ot.jU = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).COT.cz();
                zp.this.QUv();
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).pvr.set(false);
                zp zpVar2 = zp.this;
                zpVar2.zp(zpVar2.fRl);
            }
        };
        this.BO = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).Lij != null) {
                    zp.this.vwr();
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).Lij.zp();
                }
            }
        };
        this.fRl = qr;
        this.oKZ = won.FGx();
        if (won.Fm() && won.xg() != null && this.ox != null) {
            if (this.WNy == null) {
                this.WNy = HWF.zp();
            }
            this.WNy.zp(this.ox, won.xg().rV());
        }
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = new com.bytedance.sdk.openadsdk.core.video.nativevideo.COT(context.getApplicationContext(), new TTVideoPlayLayoutForLiveLayout(context), true, 17, this.QR, this);
        this.HWF = cot;
        cot.zp(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.zp.zp
    public boolean ox() {
        return true;
    }

    public void vwr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean BO() {
        return this.QR.CZ() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Iv() {
        ViewGroup viewGroup;
        try {
            if (fRl() != null && this.COT != null && (viewGroup = this.ox) != null) {
                int width = viewGroup.getWidth();
                int height = this.ox.getHeight();
                float jU = this.COT.jU();
                float COT = this.COT.COT();
                float f9 = width;
                float f10 = height;
                if (jU / (f9 * 1.0f) <= COT / (1.0f * f10)) {
                    f9 = (f10 / COT) * jU;
                } else {
                    f10 = (f9 / jU) * COT;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f9, (int) f10);
                layoutParams.addRule(13);
                if (fRl() instanceof TextureView) {
                    ((TextureView) fRl()).setLayoutParams(layoutParams);
                } else if (fRl() instanceof SurfaceView) {
                    ((SurfaceView) fRl()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            tG.zp(this.zp, "changeVideoSizeSupportInteraction error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pxi() {
        int aax;
        int i9 = this.ot.COT;
        if (i9 != 2 && i9 != 1) {
            aax = i9 == 4 ? KVG.jU().YW(String.valueOf(this.oKZ)) : 5000;
        } else {
            aax = KVG.jU().aax() * 1000;
        }
        this.lMd.removeCallbacks(this.BO);
        this.lMd.postDelayed(this.BO, aax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rg() {
        try {
            Objects.toString(this.QR.QUv());
            if (aax()) {
                return;
            }
            int[] lMd = WNy.lMd(KVG.zp());
            boolean z8 = false;
            boolean z9 = this.QR.bX() == 1;
            float f9 = lMd[0];
            float f10 = lMd[1];
            float jU = this.COT.jU();
            float COT = this.COT.COT();
            if (z9) {
                if (jU > COT) {
                    zp(f9, f10, jU, COT, true);
                    return;
                }
            } else if (jU < COT) {
                zp(f9, f10, jU, COT, false);
                return;
            }
            float f11 = jU / COT;
            float f12 = f9 / f10;
            if (z9) {
                if (f12 < 0.5625f && f11 == 0.5625f) {
                    jU = (9.0f * f10) / 16.0f;
                    z8 = true;
                    COT = f10;
                }
            } else if (f12 > 1.7777778f && f11 == 1.7777778f) {
                COT = (9.0f * f9) / 16.0f;
                z8 = true;
                jU = f9;
            }
            if (z8) {
                f9 = jU;
                f10 = COT;
            }
            int i9 = (int) f9;
            int i10 = (int) f10;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i9, i10);
            layoutParams.addRule(13);
            if (fRl() != null) {
                if (fRl() instanceof TextureView) {
                    ((TextureView) fRl()).setLayoutParams(layoutParams);
                } else if (fRl() instanceof SurfaceView) {
                    ((SurfaceView) fRl()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.ox.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i10;
                    layoutParams2.width = i9;
                    this.ox.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
            tG.zp(this.zp, "changeSize error", th);
        }
    }

    private boolean aax() {
        return fRl() == null || this.COT == null || this.QR.fRl() != null || this.QR.Gzh() == 1;
    }

    private void eWG() {
        this.COT.KS(cW());
        this.COT.zp(this.ot);
        this.ffE = System.currentTimeMillis();
        this.HWF.KS(8);
        this.HWF.KS(0);
        zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).COT == null) {
                    return;
                }
                zp.this.ffE = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.jU(0);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).COT.zp(true, ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).ku, ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).dQp);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oKZ() {
        if (this.HWF == null) {
            return;
        }
        this.lMd.removeCallbacks(this.BO);
        this.HWF.lMd();
        this.eWG = System.currentTimeMillis() - this.ffE;
        if (!this.Pxi) {
            this.Pxi = true;
            long j7 = this.irS;
            zp(j7, j7);
            long j9 = this.irS;
            this.ku = j9;
            this.YW = j9;
            lMd(this.fRl);
        }
        KS.zp zpVar = this.Lij;
        if (zpVar != null) {
            zpVar.zp(this.eWG, com.bykv.vk.openvk.component.video.zp.COT.zp.zp(this.ku, this.irS));
        }
        this.tG = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void si() {
        try {
            if (fRl() != null && this.COT != null) {
                boolean z8 = this.QR.bX() == 1;
                int[] lMd = WNy.lMd(KVG.zp());
                zp(lMd[0], lMd[1], this.COT.jU(), this.COT.COT(), z8);
            }
        } catch (Throwable unused) {
        }
    }

    public void QR(boolean z8) {
        try {
            Objects.toString(this.QR.QUv());
            if (!aax() || z8) {
                float jU = this.COT.jU();
                float COT = this.COT.COT();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) jU, (int) COT);
                layoutParams.addRule(13);
                if (fRl() != null) {
                    if (fRl() instanceof TextureView) {
                        ((TextureView) fRl()).setLayoutParams(layoutParams);
                    } else if (fRl() instanceof SurfaceView) {
                        ((SurfaceView) fRl()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.ox.getLayoutParams();
                    if (this.ox.getHeight() > 0) {
                        float min = Math.min(this.ox.getWidth() / jU, this.ox.getHeight() / COT);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (jU * min);
                            layoutParams.height = (int) (COT * min);
                            if (fRl() instanceof TextureView) {
                                ((TextureView) fRl()).setLayoutParams(layoutParams);
                            } else if (fRl() instanceof SurfaceView) {
                                ((SurfaceView) fRl()).setLayoutParams(layoutParams);
                            }
                            if (this.ot.COT == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.ox.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            tG.zp(this.zp, "changeSize error", th);
        }
    }

    public void UPs() {
        if (this.Pxi || !this.pvr.get()) {
            return;
        }
        Gzh();
        com.bytedance.sdk.openadsdk.core.QR.zp xg = this.QR.xg();
        if (xg == null || xg.zp() == null) {
            return;
        }
        xg.zp().KS(COT());
    }

    public void WNy() {
        this.UPs.zp((com.bykv.vk.openvk.component.video.api.zp) null, 0, 0);
    }

    public com.bykv.vk.openvk.component.video.api.renderview.lMd fRl() {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            return cot.tG();
        }
        return null;
    }

    public void ffE() {
        HWF hwf = this.WNy;
        if (hwf != null) {
            hwf.zp(2);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void jU() {
        KS();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void KS() {
        jU jUVar = this.COT;
        if (jUVar == null) {
            return;
        }
        jUVar.vDp();
        this.COT = null;
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.YW();
        }
        this.lMd.removeCallbacks(this.BO);
        this.lMd.removeCallbacksAndMessages(null);
        HWF hwf = this.WNy;
        if (hwf != null) {
            hwf.jU();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void lMd() {
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.zp();
            this.HWF.dQp();
            this.HWF.vwr();
        }
        jU jUVar = this.COT;
        if (jUVar != null) {
            if (jUVar.QR()) {
                if (this.vDp) {
                    if (ku.ot()) {
                        this.COT.lMd(3);
                        jU jUVar2 = this.COT;
                        jUVar2.zp(false, jUVar2.woN(), this.dQp);
                    } else {
                        FP();
                    }
                } else {
                    lMd(this.QUv);
                }
            } else {
                this.COT.zp(false, this.ku, this.dQp);
            }
        }
        if (this.Pxi || !this.pvr.get()) {
            return;
        }
        Gzh();
        com.bytedance.sdk.openadsdk.core.QR.zp xg = this.QR.xg();
        if (xg == null || xg.zp() == null) {
            return;
        }
        xg.zp().KS(COT());
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean zp(@NonNull com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        int vwr;
        View view;
        if (this.COT != null) {
            tG.zp(this.zp, "playVideoUrl: already invoked");
            return false;
        }
        ks.tG();
        if (TextUtils.isEmpty(ks.tG())) {
            tG.zp(this.zp, "No video info");
            return false;
        }
        lMd(ks);
        ks.KS(1);
        this.YhE = !ks.tG().startsWith("http");
        if (this.WNy != null) {
            if (this.ot.COT == 1) {
                vwr = KVG.jU().dT(String.valueOf(this.oKZ));
            } else {
                vwr = KVG.jU().vwr(String.valueOf(this.oKZ));
            }
            ViewGroup viewGroup = this.ox;
            if (viewGroup != null && (view = (View) viewGroup.getParent()) != null) {
                try {
                    View findViewById = view.findViewById(vDp.vDp);
                    View findViewById2 = view.findViewById(520093757);
                    View findViewById3 = view.findViewById(vDp.mfu);
                    HWF hwf = this.WNy;
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    hwf.zp(findViewById, friendlyObstructionPurpose);
                    this.WNy.zp(findViewById3, friendlyObstructionPurpose);
                    this.WNy.zp(findViewById2, friendlyObstructionPurpose);
                } catch (Throwable unused) {
                }
            }
            this.WNy.zp(vwr > 0, vwr / 1000.0f);
        }
        QUv();
        if (ks.QR() > 0) {
            long QR = ks.QR();
            this.ku = QR;
            this.YW = Math.max(this.YW, QR);
        }
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
        if (cot != null) {
            cot.zp();
            this.HWF.QR();
            this.HWF.KS(ks.COT(), ks.HWF());
            this.HWF.KS(this.ox);
        }
        jU jUVar = new jU();
        this.COT = jUVar;
        jUVar.zp(this.UPs);
        pvr();
        this.eWG = 0L;
        eWG();
        return true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(boolean z8, int i9) {
        KS();
    }

    private void zp(float f9, float f10, float f11, float f12, boolean z8) {
        RelativeLayout.LayoutParams layoutParams;
        if (f11 <= 0.0f || f12 <= 0.0f) {
            try {
                f11 = this.QR.eWG().KS();
                f12 = this.QR.eWG().lMd();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f12 > 0.0f && f11 > 0.0f) {
            if (z8) {
                if (f11 < f12) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f9, (int) ((f12 * f9) / f11));
            } else if (f11 > f12) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f11 * f10) / f12), (int) f10);
            }
            layoutParams.addRule(13);
            if (fRl() != null) {
                if (fRl() instanceof TextureView) {
                    ((TextureView) fRl()).setLayoutParams(layoutParams);
                } else if (fRl() instanceof SurfaceView) {
                    ((SurfaceView) fRl()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.ox.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.jU.lMd.zp(KVG.zp()) || this.ox.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.ox.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view) {
        jU jUVar = this.COT;
        if (jUVar == null) {
            return;
        }
        if (jUVar.HWF()) {
            zp();
            this.HWF.lMd(true, false);
            this.HWF.HWF();
            return;
        }
        if (!this.COT.QR()) {
            com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot = this.HWF;
            if (cot != null) {
                cot.KS(this.ox);
            }
            jU(this.ku);
            com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot2 = this.HWF;
            if (cot2 != null) {
                cot2.lMd(false, false);
                return;
            }
            return;
        }
        lMd();
        com.bytedance.sdk.openadsdk.core.video.nativevideo.COT cot3 = this.HWF;
        if (cot3 != null) {
            cot3.lMd(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final long j7, final long j9) {
        this.QR.KS(j7);
        this.ku = j7;
        this.irS = j9;
        final int zp = com.bykv.vk.openvk.component.video.zp.COT.zp.zp(j7, j9);
        this.lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.KS.zp.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.zp(j7, j9);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).HWF.zp(zp);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).Lij != null) {
                        ((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).Lij.zp(j7, j9);
                    }
                } catch (Throwable th) {
                    tG.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) zp.this).zp, "onProgressUpdate error: ", th);
                }
            }
        });
    }
}
