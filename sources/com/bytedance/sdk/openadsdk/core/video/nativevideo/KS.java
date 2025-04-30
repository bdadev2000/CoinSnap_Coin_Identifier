package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bykv.vk.openvk.component.video.api.zp;
import com.bytedance.sdk.component.utils.KVG;
import com.bytedance.sdk.component.utils.ku;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.utils.yRU;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.QR.HWF;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;
import com.bytedance.sdk.openadsdk.layout.TTVideoDetailLayout;
import com.bytedance.sdk.openadsdk.layout.TTVideoPlayLayoutForLiveLayout;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class KS extends com.bytedance.sdk.openadsdk.core.video.zp.zp {
    private int BO;
    private int DY;
    private int Iv;
    private boolean MBR;
    private WeakReference<KS.jU> Pxi;
    private lMd Rg;
    private final Runnable Rh;
    private final String UPs;
    private final boolean WNy;
    private long YhE;
    private QR aax;
    private long cW;
    private boolean eWG;
    private final boolean fRl;
    private final boolean ffE;
    private final yRU.zp gH;
    private WeakReference<zp> oKZ;
    private int rCC;
    private final zp.InterfaceC0051zp si;

    /* loaded from: classes.dex */
    public interface zp {
        void HWF();

        void zp(int i9);
    }

    public KS(Context context, ViewGroup viewGroup, woN won, String str, boolean z8, boolean z9, boolean z10, QR qr) {
        super(context, won, viewGroup);
        this.cW = 0L;
        this.YhE = 0L;
        this.eWG = true;
        this.BO = 0;
        this.Iv = 0;
        this.si = new zp.InterfaceC0051zp() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1
            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void COT(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                com.bytedance.sdk.openadsdk.core.QR.zp xg = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR.xg();
                if (xg != null && xg.zp() != null) {
                    xg.zp().KS(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).ku);
                }
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh.zp(1);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void KS(com.bykv.vk.openvk.component.video.api.zp zpVar) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void jU(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                com.bytedance.sdk.openadsdk.core.QR.zp xg = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR.xg();
                if (xg != null && xg.zp() != null) {
                    xg.zp().lMd(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).ku);
                }
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR, 3);
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh.zp(0);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void lMd(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        KS.this.fRl();
                        com.bytedance.sdk.openadsdk.rV.zp.COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR, 5);
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh.zp(9);
                        }
                    }
                });
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR.xg() == null || ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR.xg().zp() == null) {
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR.xg().zp().jU(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).ku);
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void lMd(com.bykv.vk.openvk.component.video.api.zp zpVar) {
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.removeCallbacks(KS.this.Rh);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (KS.this.Pxi != null && KS.this.Pxi.get() != null) {
                            KS.this.Pxi.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.lMd();
                        }
                    }
                });
                if (!KS.this.WNy) {
                    KS ks = KS.this;
                    ks.zp(ks.aax);
                }
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh.zp(KS.this.ku(), KS.this.rV());
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, long j7) {
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).yRU = false;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.removeCallbacks(KS.this.Rh);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.lMd();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).rV && KS.this.oKZ != null && KS.this.oKZ.get() != null) {
                            ((zp) KS.this.oKZ.get()).HWF();
                        }
                    }
                });
                KS.this.YhE();
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR, 0);
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh.KS();
                }
                KS ks = KS.this;
                ks.zp(ks.aax);
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, final com.bykv.vk.openvk.component.video.api.KS.zp zpVar2) {
                tG.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).zp, "onError: " + zpVar2.zp() + ", " + zpVar2.lMd() + ", " + zpVar2.KS());
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int zp2 = zpVar2.zp();
                        int lMd = zpVar2.lMd();
                        if (KS.this.Lij() && lMd != -1004) {
                            return;
                        }
                        if (KS.this.KS(zp2, lMd)) {
                            tG.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).zp, "Play video error，show result page、、、、、、、");
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.zp2(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR, (WeakReference<Context>) null, false);
                            KS.this.KS(true);
                            KS.this.jU();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.lMd();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Lij != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Lij.lMd(KS.this.YhE, com.bykv.vk.openvk.component.video.zp.COT.zp.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).ku, ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).irS));
                        }
                        if (KS.this.Pxi != null && KS.this.Pxi.get() != null && !KS.this.Lij()) {
                            ((KS.jU) KS.this.Pxi.get()).zp(zp2, lMd);
                        }
                    }
                });
                KS.this.zp(zpVar2);
                com.bytedance.sdk.openadsdk.core.QR.zp xg = ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR.xg();
                if (xg != null && xg.zp() != null) {
                    xg.zp().zp(com.bytedance.sdk.openadsdk.core.QR.zp.zp.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR, 6);
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh.zp(14);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, boolean z11) {
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.lMd();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9, int i10) {
                ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        KS.this.eWG();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9, int i10, int i11) {
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).yRU = true;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF != null) {
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.woN();
                            ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.postDelayed(KS.this.Rh, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR, 2);
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh.zp(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, int i9) {
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).yRU = false;
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.removeCallbacks(KS.this.Rh);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.lMd();
                    }
                });
                com.bytedance.sdk.openadsdk.rV.zp.COT.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR, 0);
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).Gzh.zp(5);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.zp.InterfaceC0051zp
            public void zp(com.bykv.vk.openvk.component.video.api.zp zpVar, final long j7, final long j9) {
                if (Math.abs(j7 - ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).ku) < 50) {
                    return;
                }
                KS ks = KS.this;
                ks.zp(ks.aax);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).lMd.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        KS.this.zp(j7, j9);
                    }
                });
            }
        };
        this.DY = 0;
        this.Rh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF != null) {
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.zp2(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).QR, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.lMd();
                    KS.this.KS(true);
                    tG.zp(((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).zp, "Show result page after error.......showAdCard");
                }
            }
        };
        this.gH = new yRU.zp() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.6
            @Override // com.bytedance.sdk.component.utils.yRU.zp
            public void zp(Context context2, Intent intent, boolean z11, final int i9) {
                QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        KS.this.COT(i9);
                    }
                });
            }
        };
        this.MBR = false;
        this.rCC = KVG.KS(context);
        zp(z8);
        this.UPs = str;
        try {
            this.BO = viewGroup.getWidth();
            this.Iv = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        zp(context);
        this.WNy = true;
        this.fRl = z9;
        this.ffE = z10;
        if (qr != null) {
            this.aax = qr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean KS(int i9, int i10) {
        boolean z8 = i9 == -1010 || i9 == -1007 || i9 == -1004 || i9 == -110 || i9 == 100 || i9 == 200;
        if (i10 == 1 || i10 == 700 || i10 == 800) {
            return true;
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void COT(int i9) {
        jU(i9);
        if (i9 == 4) {
            this.KVG = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.component.video.api.renderview.lMd Pxi() {
        COT cot;
        if (this.dT.getResources().getConfiguration().orientation != 1 || (cot = this.HWF) == null) {
            return null;
        }
        return cot.tG();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1 > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void eWG() {
        /*
            r8 = this;
            com.bykv.vk.openvk.component.video.api.renderview.lMd r0 = r8.Pxi()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L6e
            com.bytedance.sdk.openadsdk.core.video.KS.jU r0 = r8.COT     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L6e
            android.view.ViewGroup r1 = r8.ox     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L10
            goto L6e
        L10:
            int r0 = r0.jU()     // Catch: java.lang.Throwable -> L6b
            com.bytedance.sdk.openadsdk.core.video.KS.jU r1 = r8.COT     // Catch: java.lang.Throwable -> L6b
            int r1 = r1.COT()     // Catch: java.lang.Throwable -> L6b
            android.view.ViewGroup r2 = r8.ox     // Catch: java.lang.Throwable -> L6b
            int r2 = r2.getWidth()     // Catch: java.lang.Throwable -> L6b
            android.view.ViewGroup r3 = r8.ox     // Catch: java.lang.Throwable -> L6b
            int r3 = r3.getHeight()     // Catch: java.lang.Throwable -> L6b
            if (r2 <= 0) goto L6d
            if (r3 <= 0) goto L6d
            if (r1 <= 0) goto L6d
            if (r0 > 0) goto L2f
            goto L6d
        L2f:
            if (r0 != r1) goto L38
            if (r2 <= r3) goto L36
            r0 = r3
        L34:
            r1 = r0
            goto L54
        L36:
            r0 = r2
            goto L34
        L38:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r1) goto L49
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L6b
            float r0 = r0 * r6
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L6b
            float r0 = r0 / r1
            double r6 = (double) r2     // Catch: java.lang.Throwable -> L6b
            double r6 = r6 * r4
            double r0 = (double) r0     // Catch: java.lang.Throwable -> L6b
            double r6 = r6 / r0
            int r0 = (int) r6     // Catch: java.lang.Throwable -> L6b
            r1 = r2
            goto L54
        L49:
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L6b
            float r1 = r1 * r6
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L6b
            float r1 = r1 / r0
            double r6 = (double) r3     // Catch: java.lang.Throwable -> L6b
            double r6 = r6 * r4
            double r0 = (double) r1     // Catch: java.lang.Throwable -> L6b
            double r6 = r6 / r0
            int r0 = (int) r6     // Catch: java.lang.Throwable -> L6b
            r1 = r0
            r0 = r3
        L54:
            if (r0 > r3) goto L5a
            if (r0 > 0) goto L59
            goto L5a
        L59:
            r3 = r0
        L5a:
            if (r1 > r2) goto L60
            if (r1 > 0) goto L5f
            goto L60
        L5f:
            r2 = r1
        L60:
            com.bytedance.sdk.component.utils.RCv r0 = r8.lMd     // Catch: java.lang.Throwable -> L6b
            com.bytedance.sdk.openadsdk.core.video.nativevideo.KS$5 r1 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.KS$5     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            r0.post(r1)     // Catch: java.lang.Throwable -> L6b
            return
        L6b:
            r0 = move-exception
            goto L7b
        L6d:
            return
        L6e:
            android.content.Context r0 = r8.dT     // Catch: java.lang.Throwable -> L6b
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L6b
            com.bykv.vk.openvk.component.video.api.renderview.lMd r0 = r8.Pxi()     // Catch: java.lang.Throwable -> L6b
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L7b:
            r0.toString()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.eWG():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fRl() {
        this.DY++;
        COT cot = this.HWF;
        if (cot == null) {
            return;
        }
        cot.lMd();
        KS.zp zpVar = this.Lij;
        if (zpVar != null) {
            zpVar.zp(this.YhE, com.bykv.vk.openvk.component.video.zp.COT.zp.zp(this.ku, this.irS));
        }
        this.YhE = System.currentTimeMillis() - this.cW;
        if (this.eWG) {
            this.HWF.zp2(this.QR, (WeakReference<Context>) null, true);
        }
        if (!this.cz) {
            this.cz = true;
            long j7 = this.irS;
            zp(j7, j7);
            long j9 = this.irS;
            this.ku = j9;
            this.YW = j9;
            lMd(this.aax);
        }
        if (!this.rV && this.vwr) {
            COT(this.HWF, null);
        }
        this.tG = true;
    }

    private void ffE() {
        com.bytedance.sdk.openadsdk.core.video.KS.jU jUVar = this.COT;
        if (jUVar != null) {
            if (jUVar.QR()) {
                if (this.vDp) {
                    FP();
                } else {
                    lMd(this.QUv);
                }
            } else {
                this.COT.zp(false, this.ku, this.dQp);
            }
        }
        if (this.pvr.get()) {
            Gzh();
        }
    }

    public void QR(boolean z8) {
        this.eWG = z8;
    }

    public void UPs() {
        HWF hwf = this.Gzh;
        if (hwf != null) {
            hwf.zp(13);
        }
    }

    public void WNy() {
        if (this.MBR && this.FP) {
            this.MBR = false;
            yRU.zp(this.gH);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void jU() {
        com.bytedance.sdk.openadsdk.core.video.KS.jU jUVar = this.COT;
        if (jUVar != null) {
            jUVar.vDp();
            this.COT = null;
        }
        if (this.eWG) {
            if (!"embeded_ad".equals(this.UPs)) {
                this.HWF.zp2(this.QR, (WeakReference<Context>) null, true);
            } else {
                this.HWF.cz();
            }
            this.lMd.removeCallbacksAndMessages(null);
            this.Bj.clear();
            if (this.rV) {
                WNy();
            }
        }
    }

    public void ku(boolean z8) {
        COT cot = this.HWF;
        if (cot != null) {
            cot.zp();
        }
        COT cot2 = this.HWF;
        if (cot2 != null && z8) {
            cot2.vwr();
        }
        ffE();
    }

    public void vwr() {
        if (this.MBR || !this.FP) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.KVG.zp().getApplicationContext();
        this.MBR = true;
        yRU.zp(this.gH, applicationContext);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void lMd() {
        COT cot = this.HWF;
        if (cot != null) {
            cot.zp();
        }
        COT cot2 = this.HWF;
        if (cot2 != null) {
            cot2.vwr();
        }
        ffE();
    }

    private void KS(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        ks.KS(0);
        this.COT.zp(ks);
        this.cW = System.currentTimeMillis();
        this.HWF.KS(8);
        this.HWF.KS(0);
        zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).COT == null) {
                    return;
                }
                KS.this.cW = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).HWF.jU(0);
                ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).COT.zp(true, ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).ku, ((com.bytedance.sdk.openadsdk.core.video.zp.zp) KS.this).dQp);
            }
        });
        if (this.rV) {
            vwr();
        }
    }

    private boolean lMd(int i9, int i10) {
        if (i10 == 0) {
            zp();
            this.KVG = true;
            COT cot = this.HWF;
            if (cot != null) {
                cot.zp2(this.QR, (WeakReference<Context>) null, false);
            }
        }
        if (i10 != 4 && i10 != 0) {
            COT cot2 = this.HWF;
            if (cot2 != null) {
                cot2.zp();
            }
            zp();
            this.KVG = true;
            this.woN = false;
            COT cot3 = this.HWF;
            if (cot3 != null) {
                return cot3.zp(i9, this.QR.eWG(), this.ffE);
            }
        } else if (i10 == 4) {
            this.KVG = false;
            COT cot4 = this.HWF;
            if (cot4 != null) {
                cot4.dQp();
            }
        }
        return true;
    }

    public void zp(final NativeVideoTsView.zp zpVar) {
        COT cot;
        if (!this.rV || (cot = this.HWF) == null) {
            return;
        }
        cot.zp(new NativeVideoTsView.zp() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.2
            @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.zp
            public void zp(View view, int i9) {
                NativeVideoTsView.zp zpVar2 = zpVar;
                if (zpVar2 != null) {
                    zpVar2.zp(view, i9);
                }
            }
        });
    }

    public void zp(PAGNativeAd pAGNativeAd) {
        COT cot;
        if (!this.rV || (cot = this.HWF) == null) {
            return;
        }
        cot.zp(pAGNativeAd);
    }

    private void jU(int i9) {
        if (this.rCC == i9) {
            return;
        }
        this.rCC = i9;
        if (i9 != 4 && i9 != 0) {
            this.woN = false;
        }
        if (!this.woN && !dQp() && this.fRl) {
            lMd(2, i9);
        }
        WeakReference<zp> weakReference = this.oKZ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.oKZ.get().zp(this.rCC);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void KS() {
        zp(true, 3);
    }

    public void zp(int i9, int i10) {
        if (i9 == 0 || i10 == 0) {
            return;
        }
        this.BO = i9;
        this.Iv = i10;
    }

    public void KS(int i9) {
        jU(i9);
        if (i9 == 4) {
            this.KVG = false;
            lMd();
        }
    }

    public void zp(lMd lmd) {
        this.Rg = lmd;
    }

    private void zp(Context context) {
        ViewGroup tTVideoDetailLayout;
        if (this.rV) {
            tTVideoDetailLayout = new TTVideoPlayLayoutForLiveLayout(context);
        } else {
            tTVideoDetailLayout = new TTVideoDetailLayout(context);
        }
        ViewGroup viewGroup = tTVideoDetailLayout;
        if (this.rV) {
            this.HWF = new COT(context, viewGroup, true, 17, this.QR, this, yRU());
        } else {
            this.HWF = new jU(context, viewGroup, true, 17, this.QR, this, false);
        }
        this.HWF.zp(this);
    }

    public HWF zp(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.QR.Fm()) {
            return null;
        }
        if (this.Gzh == null) {
            this.Gzh = HWF.zp();
        }
        this.Gzh.zp(view, this.QR.xg().rV());
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.Gzh.zp((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.Gzh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.zp.zp, com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(KS.jU jUVar) {
        this.Pxi = new WeakReference<>(jUVar);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public boolean zp(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        if (this.COT != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(ks.tG())) {
            tG.zp(this.zp, "[video] play video stop , because no video info");
            return false;
        }
        KS(false);
        ks.tG();
        lMd(ks);
        QUv();
        HWF hwf = this.Gzh;
        if (hwf != null) {
            hwf.zp(false, 0.0f);
        }
        if (!com.bytedance.sdk.openadsdk.core.nativeexpress.woN.lMd(this.UPs) || this.ku <= 0) {
            this.ku = ks.QR();
        }
        if (ks.QR() <= 0) {
            this.cz = false;
            this.pvr.set(false);
        } else {
            long QR = ks.QR();
            this.ku = QR;
            this.YW = Math.max(this.YW, QR);
        }
        COT cot = this.HWF;
        if (cot != null) {
            cot.zp();
            if (this.DY == 0) {
                this.HWF.QR();
            }
            this.HWF.KS(ks.COT(), ks.HWF());
            this.HWF.KS(this.ox);
            this.HWF.zp(ks.COT(), ks.HWF());
        }
        if (this.COT == null) {
            com.bytedance.sdk.openadsdk.core.video.KS.jU jUVar = new com.bytedance.sdk.openadsdk.core.video.KS.jU();
            this.COT = jUVar;
            jUVar.zp(this.si);
        }
        pvr();
        this.YhE = 0L;
        try {
            KS(ks);
            return true;
        } catch (Exception e4) {
            tG.zp(this.zp, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e4)));
            return false;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS
    public void zp(boolean z8, int i9) {
        if (!this.cz && this.pvr.get()) {
            if (z8) {
                dQp.zp zpVar = new dQp.zp();
                zpVar.zp(COT());
                zpVar.KS(ku());
                zpVar.lMd(HWF());
                zpVar.KS(i9);
                zpVar.jU(QR());
                com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(this.HWF, zpVar, this.aax);
                this.cz = false;
            } else {
                irS();
            }
        }
        jU();
        HWF hwf = this.Gzh;
        if (hwf != null) {
            hwf.jU();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.zp
    public void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view) {
        com.bytedance.sdk.openadsdk.core.video.KS.jU jUVar = this.COT;
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
            COT cot = this.HWF;
            if (cot != null) {
                cot.KS(this.ox);
            }
            jU(this.ku);
            COT cot2 = this.HWF;
            if (cot2 != null) {
                cot2.lMd(false, false);
                return;
            }
            return;
        }
        ku(false);
        COT cot3 = this.HWF;
        if (cot3 != null) {
            cot3.lMd(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(long j7, long j9) {
        this.QR.KS(j7);
        this.ku = j7;
        this.irS = j9;
        this.HWF.zp(j7, j9);
        this.HWF.zp(com.bykv.vk.openvk.component.video.zp.COT.zp.zp(j7, j9));
        try {
            KS.zp zpVar = this.Lij;
            if (zpVar != null) {
                zpVar.zp(j7, j9);
            }
        } catch (Throwable th) {
            tG.zp(this.zp, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.QR.zp xg = this.QR.xg();
        if (xg == null || xg.zp() == null) {
            return;
        }
        xg.zp().zp(j7, j9, this.Gzh);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.zp.zp
    public void zp(com.bykv.vk.openvk.component.video.api.jU.lMd lmd, View view, boolean z8) {
        HWF(!this.vwr);
        if (this.dT instanceof Activity) {
            COT cot = this.HWF;
            if (cot != null) {
                cot.lMd(this.ox);
                this.HWF.KS(false);
            }
            zp(1);
            WeakReference<KS.lMd> weakReference = this.RCv;
            KS.lMd lmd2 = weakReference != null ? weakReference.get() : null;
            if (lmd2 != null) {
                lmd2.zp(this.vwr);
            }
        }
    }

    public void zp(zp zpVar) {
        this.oKZ = new WeakReference<>(zpVar);
    }
}
