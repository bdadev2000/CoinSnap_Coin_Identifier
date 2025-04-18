package com.bytedance.sdk.openadsdk.core.GA.Sg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.component.utils.Ne;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.GA.GA;
import com.bytedance.sdk.openadsdk.GA.pDU;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.GA.Sg.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.VOe;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import j5.a;
import java.lang.ref.WeakReference;
import java.util.List;
import k5.b;
import l5.c;
import l5.d;
import l5.e;

/* loaded from: classes.dex */
public class tN extends com.bytedance.sdk.openadsdk.core.GA.YFl.YFl {
    private int BPI;
    private int Bh;
    private int Cqy;
    private final boolean GS;
    private final Ne.YFl Ld;
    private final String Sco;
    private WeakReference<c> UI;
    private boolean VB;
    private WeakReference<YFl> ZU;
    private final Runnable dGX;
    private Sg fIu;
    private final b iY;
    private DSW ko;
    private final boolean lu;
    private boolean mB;
    private long mn;
    private long pq;
    private final boolean zB;
    private int zG;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(int i10);

        void vc();
    }

    public tN(Context context, ViewGroup viewGroup, Wwa wwa, String str, boolean z10, boolean z11, boolean z12, DSW dsw) {
        super(context, wwa, viewGroup);
        this.pq = 0L;
        this.mn = 0L;
        this.mB = true;
        this.BPI = 0;
        this.zG = 0;
        this.iY = new b() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1
            @Override // k5.b
            public void AlY(k5.c cVar) {
                com.bytedance.sdk.openadsdk.core.YoT.YFl Af = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH.Af();
                if (Af != null && Af.YFl() != null) {
                    Af.YFl().Sg(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).NjR);
                }
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH, 3);
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO != null) {
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO.YFl(0);
                }
            }

            @Override // k5.b
            public void Sg(k5.c cVar, int i10) {
            }

            @Override // k5.b
            public void YFl(k5.c cVar) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH, 5);
                            if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO != null) {
                                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO.YFl(9);
                            }
                        } catch (Exception unused) {
                        }
                        tN.this.Sco();
                    }
                });
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH.Af() == null || ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH.Af().YFl() == null) {
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH.Af().YFl().AlY(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).NjR);
            }

            @Override // k5.b
            public void tN(k5.c cVar) {
            }

            @Override // k5.b
            public void wN(k5.c cVar) {
                com.bytedance.sdk.openadsdk.core.YoT.YFl Af = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH.Af();
                if (Af != null && Af.YFl() != null) {
                    Af.YFl().tN(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).NjR);
                }
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO != null) {
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO.YFl(1);
                }
            }

            @Override // k5.b
            public void Sg(k5.c cVar) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.removeCallbacks(tN.this.dGX);
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tN.this.UI != null && tN.this.UI.get() != null) {
                            tN.this.UI.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW != null) {
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.Sg();
                        }
                    }
                });
                if (tN.this.zB) {
                    return;
                }
                tN tNVar = tN.this;
                tNVar.YFl(tNVar.ko);
            }

            @Override // k5.b
            public void YFl(k5.c cVar, long j3) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).bZ = false;
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.removeCallbacks(tN.this.dGX);
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW != null) {
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.Sg();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).EH && tN.this.ZU != null && tN.this.ZU.get() != null) {
                            ((YFl) tN.this.ZU.get()).vc();
                        }
                    }
                });
                tN.this.pq();
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH, 0);
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO != null) {
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO.tN();
                }
                tN tNVar = tN.this;
                tNVar.YFl(tNVar.ko);
            }

            @Override // k5.b
            public void YFl(k5.c cVar, final p5.b bVar) {
                YoT.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).YFl, "onError: " + bVar.a + ", " + bVar.f23474b + ", " + bVar.f23475c);
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        p5.b bVar2 = bVar;
                        int i10 = bVar2.a;
                        int i11 = bVar2.f23474b;
                        if (tN.this.YI() && i11 != -1004) {
                            return;
                        }
                        if (tN.this.tN(i10, i11)) {
                            YoT.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).YFl, "Play video error，show result page、、、、、、、");
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH, (WeakReference<Context>) null, false);
                            tN.this.tN(true);
                            tN.this.AlY();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW != null) {
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.Sg();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).Ga != null) {
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).Ga.Sg(tN.this.mn, a.a(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).NjR, ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).Cfr));
                        }
                        if (tN.this.UI != null && tN.this.UI.get() != null && !tN.this.YI()) {
                            ((c) tN.this.UI.get()).YFl(i10, i11);
                        }
                    }
                });
                tN.this.YFl(bVar);
                com.bytedance.sdk.openadsdk.core.YoT.YFl Af = ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH.Af();
                if (Af != null && Af.YFl() != null) {
                    Af.YFl().YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH, 6);
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO != null) {
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO.YFl(14);
                }
            }

            @Override // k5.b
            public void YFl(k5.c cVar, boolean z13) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW != null) {
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.Sg();
                        }
                    }
                });
            }

            @Override // k5.b
            public void YFl(k5.c cVar, int i10, int i11) {
                com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        tN.this.lu();
                    }
                });
            }

            @Override // k5.b
            public void YFl(k5.c cVar, int i10, int i11, int i12) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).bZ = true;
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW != null) {
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.lG();
                            ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.postDelayed(tN.this.dGX, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH, 2);
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO != null) {
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO.YFl(4);
                }
            }

            @Override // k5.b
            public void YFl(k5.c cVar, int i10) {
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).bZ = false;
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.removeCallbacks(tN.this.dGX);
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.Sg();
                    }
                });
                com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH, 0);
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO != null) {
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).dXO.YFl(5);
                }
            }

            @Override // k5.b
            public void YFl(k5.c cVar, final long j3, final long j10) {
                if (Math.abs(j3 - ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).NjR) < 50) {
                    return;
                }
                tN tNVar = tN.this;
                tNVar.YFl(tNVar.ko);
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).tN.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        tN.this.YFl(j3, j10);
                        tN.this.Sg(j3, j10);
                    }
                });
            }
        };
        this.Bh = 0;
        this.dGX = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW != null) {
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).qsH, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.Sg();
                    tN.this.tN(true);
                    YoT.YFl(((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).YFl, "Show result page after error.......showAdCard");
                }
            }
        };
        this.Ld = new Ne.YFl() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.6
            @Override // com.bytedance.sdk.component.utils.Ne.YFl
            public void YFl(Context context2, Intent intent, boolean z13, final int i10) {
                mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tN.this.wN(i10);
                    }
                });
            }
        };
        this.VB = false;
        this.Cqy = EH.tN(context);
        YFl(z10);
        this.Sco = str;
        try {
            this.BPI = viewGroup.getWidth();
            this.zG = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        YFl(context);
        this.zB = true;
        this.GS = z11;
        this.lu = z12;
        if (dsw != null) {
            this.ko = dsw;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tN(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    private void GS() {
        com.bytedance.sdk.openadsdk.core.GA.AlY.tN tNVar = this.f10635vc;
        if (tNVar != null) {
            if (tNVar.DSW()) {
                if (this.GA) {
                    wXo();
                } else {
                    Sg(this.hQ);
                }
            } else {
                this.f10635vc.YFl(false, this.NjR, this.rkt);
            }
        }
        if (this.aIu.get()) {
            Ga();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sco() {
        this.Bh++;
        wN wNVar = this.DSW;
        if (wNVar == null) {
            return;
        }
        wNVar.Sg();
        e eVar = this.Ga;
        if (eVar != null) {
            eVar.YFl(this.mn, a.a(this.NjR, this.Cfr));
        }
        this.mn = System.currentTimeMillis() - this.pq;
        if (this.mB) {
            this.DSW.YFl(this.qsH, (WeakReference<Context>) null, true);
        }
        if (!this.wXo) {
            this.wXo = true;
            long j3 = this.Cfr;
            Sg(j3, j3);
            long j10 = this.Cfr;
            this.NjR = j10;
            this.f10634nc = j10;
            Sg(this.ko);
        }
        if (!this.EH && this.qO) {
            wN(this.DSW, null);
        }
        this.pDU = true;
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
    public void lu() {
        /*
            r8 = this;
            q5.c r0 = r8.mB()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6b
            com.bytedance.sdk.openadsdk.core.GA.AlY.tN r0 = r8.f10635vc     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6b
            android.view.ViewGroup r1 = r8.UZM     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L10
            goto L6b
        L10:
            int r0 = r0.AlY()     // Catch: java.lang.Throwable -> L78
            com.bytedance.sdk.openadsdk.core.GA.AlY.tN r1 = r8.f10635vc     // Catch: java.lang.Throwable -> L78
            int r1 = r1.wN()     // Catch: java.lang.Throwable -> L78
            android.view.ViewGroup r2 = r8.UZM     // Catch: java.lang.Throwable -> L78
            int r2 = r2.getWidth()     // Catch: java.lang.Throwable -> L78
            android.view.ViewGroup r3 = r8.UZM     // Catch: java.lang.Throwable -> L78
            int r3 = r3.getHeight()     // Catch: java.lang.Throwable -> L78
            if (r2 <= 0) goto L6a
            if (r3 <= 0) goto L6a
            if (r1 <= 0) goto L6a
            if (r0 > 0) goto L2f
            goto L6a
        L2f:
            if (r0 != r1) goto L38
            if (r2 <= r3) goto L35
            r0 = r3
            goto L36
        L35:
            r0 = r2
        L36:
            r1 = r0
            goto L54
        L38:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r1) goto L49
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L78
            float r0 = r0 * r6
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L78
            float r0 = r0 / r1
            double r6 = (double) r2     // Catch: java.lang.Throwable -> L78
            double r6 = r6 * r4
            double r0 = (double) r0     // Catch: java.lang.Throwable -> L78
            double r6 = r6 / r0
            int r0 = (int) r6     // Catch: java.lang.Throwable -> L78
            r1 = r2
            goto L54
        L49:
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L78
            float r1 = r1 * r6
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L78
            float r1 = r1 / r0
            double r6 = (double) r3     // Catch: java.lang.Throwable -> L78
            double r6 = r6 * r4
            double r0 = (double) r1     // Catch: java.lang.Throwable -> L78
            double r6 = r6 / r0
            int r0 = (int) r6     // Catch: java.lang.Throwable -> L78
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
            com.bytedance.sdk.component.utils.bZ r0 = r8.tN     // Catch: java.lang.Throwable -> L78
            com.bytedance.sdk.openadsdk.core.GA.Sg.tN$5 r1 = new com.bytedance.sdk.openadsdk.core.GA.Sg.tN$5     // Catch: java.lang.Throwable -> L78
            r1.<init>()     // Catch: java.lang.Throwable -> L78
            r0.post(r1)     // Catch: java.lang.Throwable -> L78
        L6a:
            return
        L6b:
            android.content.Context r0 = r8.eT     // Catch: java.lang.Throwable -> L78
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L78
            q5.c r0 = r8.mB()     // Catch: java.lang.Throwable -> L78
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L78
            return
        L78:
            r0 = move-exception
            r0.toString()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.lu():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q5.c mB() {
        wN wNVar;
        if (this.eT.getResources().getConfiguration().orientation != 1 || (wNVar = this.DSW) == null) {
            return null;
        }
        return wNVar.GA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wN(int i10) {
        AlY(i10);
        if (i10 == 4) {
            this.lG = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void AlY() {
        com.bytedance.sdk.openadsdk.core.GA.AlY.tN tNVar = this.f10635vc;
        if (tNVar != null) {
            tNVar.YoT();
            this.f10635vc = null;
        }
        if (this.mB) {
            if (!"embeded_ad".equals(this.Sco)) {
                this.DSW.YFl(this.qsH, (WeakReference<Context>) null, true);
            } else {
                this.DSW.aIu();
            }
            this.tN.removeCallbacksAndMessages(null);
            this.YoT.clear();
            if (this.EH) {
                mn();
            }
        }
    }

    public void DSW(boolean z10) {
        this.mB = z10;
    }

    public void Wwa() {
        if (this.VB || !this.Ne) {
            return;
        }
        Context applicationContext = lG.YFl().getApplicationContext();
        this.VB = true;
        Ne.YFl(this.Ld, applicationContext);
    }

    public void mn() {
        if (this.VB && this.Ne) {
            this.VB = false;
            Ne.YFl(this.Ld);
        }
    }

    public void qsH(boolean z10) {
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.YFl();
        }
        wN wNVar2 = this.DSW;
        if (wNVar2 != null && z10) {
            wNVar2.Wwa();
        }
        GS();
    }

    public void zB() {
        com.bytedance.sdk.openadsdk.core.YoT.vc vcVar = this.dXO;
        if (vcVar != null) {
            vcVar.YFl(13);
        }
    }

    private void tN(p5.c cVar) {
        cVar.tN(0);
        this.f10635vc.YFl(cVar);
        this.pq = System.currentTimeMillis();
        this.DSW.tN(8);
        this.DSW.tN(0);
        YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).f10635vc == null) {
                    return;
                }
                tN.this.pq = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).DSW.AlY(0);
                ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).f10635vc.YFl(true, ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).NjR, ((com.bytedance.sdk.openadsdk.core.GA.YFl.YFl) tN.this).rkt);
            }
        });
        if (this.EH) {
            Wwa();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void Sg() {
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.YFl();
        }
        wN wNVar2 = this.DSW;
        if (wNVar2 != null) {
            wNVar2.Wwa();
        }
        GS();
    }

    public void YFl(final vc.YFl yFl) {
        wN wNVar;
        if (!this.EH || (wNVar = this.DSW) == null) {
            return;
        }
        wNVar.YFl(new vc.YFl() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.tN.2
            @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc.YFl
            public void YFl(View view, int i10) {
                vc.YFl yFl2 = yFl;
                if (yFl2 != null) {
                    yFl2.YFl(view, i10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(long j3, long j10) {
        this.qsH.tN(j3);
        this.NjR = j3;
        this.Cfr = j10;
        this.DSW.YFl(j3, j10);
        this.DSW.YFl(a.a(j3, j10));
        try {
            e eVar = this.Ga;
            if (eVar != null) {
                eVar.YFl(j3, j10);
            }
        } catch (Throwable th2) {
            YoT.YFl(this.YFl, "onProgressUpdate error: ", th2);
        }
        com.bytedance.sdk.openadsdk.core.YoT.YFl Af = this.qsH.Af();
        if (Af == null || Af.YFl() == null) {
            return;
        }
        Af.YFl().YFl(j3, j10, this.dXO);
    }

    public void YFl(PAGNativeAd pAGNativeAd) {
        wN wNVar;
        if (!this.EH || (wNVar = this.DSW) == null) {
            return;
        }
        wNVar.YFl(pAGNativeAd);
    }

    private void AlY(int i10) {
        if (this.Cqy == i10) {
            return;
        }
        this.Cqy = i10;
        if (i10 != 4 && i10 != 0) {
            this.Wwa = false;
        }
        if (!this.Wwa && !EH() && this.GS) {
            Sg(2, i10);
        }
        WeakReference<YFl> weakReference = this.ZU;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZU.get().YFl(this.Cqy);
    }

    public void YFl(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.BPI = i10;
        this.zG = i11;
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void tN() {
        YFl(true, 3);
    }

    public void tN(int i10) {
        AlY(i10);
        if (i10 == 4) {
            this.lG = false;
            Sg();
        }
    }

    public void YFl(Sg sg2) {
        this.fIu = sg2;
    }

    private void YFl(Context context) {
        ViewGroup ga2;
        if (this.EH) {
            ga2 = new pDU(context);
        } else {
            ga2 = new GA(context);
        }
        ViewGroup viewGroup = ga2;
        if (this.EH) {
            this.DSW = new wN(context, viewGroup, true, 17, this.qsH, this, VOe());
        } else {
            this.DSW = new AlY(context, viewGroup, true, 17, this.qsH, this, false);
        }
        this.DSW.YFl(this);
    }

    private boolean Sg(int i10, int i11) {
        if (i11 == 0) {
            YFl();
            this.lG = true;
            wN wNVar = this.DSW;
            if (wNVar != null) {
                wNVar.YFl(this.qsH, (WeakReference<Context>) null, false);
            }
        }
        if (i11 != 4 && i11 != 0) {
            wN wNVar2 = this.DSW;
            if (wNVar2 != null) {
                wNVar2.YFl();
            }
            YFl();
            this.lG = true;
            this.Wwa = false;
            wN wNVar3 = this.DSW;
            if (wNVar3 != null) {
                return wNVar3.YFl(i10, this.qsH.BPI(), this.lu);
            }
        } else if (i11 == 4) {
            this.lG = false;
            wN wNVar4 = this.DSW;
            if (wNVar4 != null) {
                wNVar4.EH();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.YoT.vc YFl(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.qsH.yn()) {
            return null;
        }
        if (this.dXO == null) {
            this.dXO = com.bytedance.sdk.openadsdk.core.YoT.vc.YFl();
        }
        this.dXO.YFl(view, this.qsH.Af().pDU());
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.dXO.YFl((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.dXO;
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void YFl(c cVar) {
        this.UI = new WeakReference<>(cVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public boolean YFl(p5.c cVar) {
        if (this.f10635vc != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(cVar.GA())) {
            YoT.YFl(this.YFl, "[video] play video stop , because no video info");
            return false;
        }
        tN(false);
        cVar.GA();
        Sg(cVar);
        Cfr();
        com.bytedance.sdk.openadsdk.core.YoT.vc vcVar = this.dXO;
        if (vcVar != null) {
            vcVar.YFl(false, 0.0f);
        }
        if (!VOe.Sg(this.Sco) || this.NjR <= 0) {
            this.NjR = cVar.DSW();
        }
        if (cVar.DSW() <= 0) {
            this.wXo = false;
            this.aIu.set(false);
        } else {
            long DSW = cVar.DSW();
            this.NjR = DSW;
            this.f10634nc = Math.max(this.f10634nc, DSW);
        }
        wN wNVar = this.DSW;
        if (wNVar != null) {
            wNVar.YFl();
            if (this.Bh == 0) {
                this.DSW.DSW();
            }
            this.DSW.tN(cVar.wN(), cVar.vc());
            this.DSW.tN(this.UZM);
            this.DSW.YFl(cVar.wN(), cVar.vc());
        }
        if (this.f10635vc == null) {
            com.bytedance.sdk.openadsdk.core.GA.AlY.tN tNVar = new com.bytedance.sdk.openadsdk.core.GA.AlY.tN();
            this.f10635vc = tNVar;
            tNVar.YFl(this.iY);
        }
        qO();
        this.mn = 0L;
        try {
            tN(cVar);
            return true;
        } catch (Exception e2) {
            YoT.YFl(this.YFl, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e2)));
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, l5.g
    public void YFl(boolean z10, int i10) {
        if (!this.wXo && this.aIu.get()) {
            if (z10) {
                EH.YFl yFl = new EH.YFl();
                yFl.YFl(wN());
                yFl.tN(qsH());
                yFl.Sg(vc());
                yFl.tN(i10);
                yFl.AlY(DSW());
                com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(this.DSW, yFl, this.ko);
                this.wXo = false;
            } else {
                dXO();
            }
        }
        AlY();
        com.bytedance.sdk.openadsdk.core.YoT.vc vcVar = this.dXO;
        if (vcVar != null) {
            vcVar.AlY();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl, com.bytedance.sdk.openadsdk.core.GA.Sg.YFl
    public void YFl(l5.a aVar, View view) {
        com.bytedance.sdk.openadsdk.core.GA.AlY.tN tNVar = this.f10635vc;
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
            wN wNVar = this.DSW;
            if (wNVar != null) {
                wNVar.tN(this.UZM);
            }
            AlY(this.NjR);
            wN wNVar2 = this.DSW;
            if (wNVar2 != null) {
                wNVar2.Sg(false, false);
                return;
            }
            return;
        }
        qsH(false);
        wN wNVar3 = this.DSW;
        if (wNVar3 != null) {
            wNVar3.Sg(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.YFl.YFl
    public void YFl(l5.a aVar, View view, boolean z10) {
        vc(!this.qO);
        if (this.eT instanceof Activity) {
            wN wNVar = this.DSW;
            if (wNVar != null) {
                wNVar.Sg(this.UZM);
                this.DSW.tN(false);
            }
            YFl(1);
            WeakReference<d> weakReference = this.YI;
            d dVar = weakReference != null ? weakReference.get() : null;
            if (dVar != null) {
                dVar.YFl(this.qO);
            }
        }
    }

    public void YFl(YFl yFl) {
        this.ZU = new WeakReference<>(yFl);
    }
}
