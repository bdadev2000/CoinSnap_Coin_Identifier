package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.YoT.qsH;
import com.bytedance.sdk.openadsdk.component.reward.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.eT;
import com.bytedance.sdk.openadsdk.utils.vc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5.a;

/* loaded from: classes.dex */
public class Sg {
    private static com.bytedance.sdk.openadsdk.YFl.wN.YFl Sg;
    private static com.bytedance.sdk.openadsdk.YFl.tN.Sg tN;
    private com.bytedance.sdk.openadsdk.YFl.wN.YFl DSW;
    private com.bytedance.sdk.openadsdk.core.wN.tN EH;
    private com.bytedance.sdk.openadsdk.core.wN.tN GA;
    private boolean Ne;
    private boolean NjR;
    private Runnable UZM;
    private boolean VOe;
    private Bundle Wwa;
    public eT YFl;
    private final qsH YI;
    private int YoT;
    private com.bytedance.sdk.openadsdk.component.reward.top.tN aIu;
    private int bZ;
    private vc eT;
    private int lG;

    /* renamed from: nc, reason: collision with root package name */
    private Activity f10528nc;
    private com.bytedance.sdk.openadsdk.activity.tN pDU;
    private com.bytedance.sdk.openadsdk.GA.eT qO;
    private com.bytedance.sdk.openadsdk.YFl.tN.Sg qsH;
    private com.bytedance.sdk.openadsdk.core.wN.qsH rkt;
    private final Wwa wN;
    private AbstractC0106Sg wXo;
    private final List<vc> AlY = new ArrayList();

    /* renamed from: vc, reason: collision with root package name */
    private final Bundle f10529vc = new Bundle();

    /* loaded from: classes.dex */
    public static class AlY extends AbstractC0106Sg {
        private int DSW;
        private boolean qsH;

        /* renamed from: vc, reason: collision with root package name */
        private final int f10532vc;

        public AlY(Sg sg2, Wwa wwa, com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar) {
            super(sg2, wwa, tNVar);
            this.f10532vc = lG.AlY().Ga(String.valueOf(wwa.kU())).f10745vc;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.Sg.AbstractC0106Sg
        public int YFl(Wwa wwa) {
            return lG.AlY().eT(String.valueOf(wwa.kU()));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.Sg.AbstractC0106Sg, android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (!this.qsH && this.AlY <= this.DSW) {
                this.qsH = true;
                vc Wwa = this.YFl.Wwa();
                if (Wwa instanceof com.bytedance.sdk.openadsdk.activity.wN) {
                    ((com.bytedance.sdk.openadsdk.activity.wN) Wwa).Ne();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.Sg.AbstractC0106Sg
        public void YFl(int i10) {
            boolean z10 = this.wN == 0;
            int i11 = this.AlY;
            super.YFl(i10);
            if (!z10) {
                if (this.tN < i11) {
                    this.DSW = (int) ((1.0f - (this.f10532vc / 100.0f)) * this.AlY);
                }
            } else if (this.wN == 1) {
                this.DSW = 3;
            } else {
                this.DSW = (int) ((1.0f - (this.f10532vc / 100.0f)) * this.tN);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.Sg$Sg, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0106Sg implements Handler.Callback {
        protected int AlY;
        private final com.bytedance.sdk.openadsdk.component.reward.top.tN DSW;
        private boolean NjR;
        protected final Wwa Sg;
        protected final Sg YFl;

        /* renamed from: nc, reason: collision with root package name */
        private boolean f10533nc;
        private final Context qsH;
        protected float tN;

        /* renamed from: vc, reason: collision with root package name */
        private final Handler f10534vc = new Handler(Looper.getMainLooper(), this);
        protected int wN;

        public AbstractC0106Sg(Sg sg2, Wwa wwa, com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar) {
            this.YFl = sg2;
            this.Sg = wwa;
            this.DSW = tNVar;
            this.qsH = tNVar.getContext();
            this.AlY = YFl(wwa);
        }

        private void AlY() {
            if (this.YFl.qO()) {
                this.DSW.showSkipButton();
                this.NjR = true;
            } else {
                this.f10533nc = true;
                this.DSW.showCloseButton();
            }
        }

        public void Sg() {
            if (this.AlY >= 0 && !this.NjR && !this.f10533nc) {
                this.f10534vc.removeMessages(this.wN);
                this.f10534vc.sendEmptyMessage(this.wN);
            }
        }

        public abstract int YFl(Wwa wwa);

        public void YFl() {
            this.f10534vc.removeMessages(this.wN);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                if (this.AlY > 0) {
                    com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar = this.DSW;
                    Context context = this.qsH;
                    int Sg = qO.Sg(context, "tt_reward_full_skip");
                    int i11 = this.AlY;
                    this.AlY = i11 - 1;
                    tNVar.setSkipText(context.getString(Sg, Integer.valueOf(i11)));
                    if (this.AlY >= 0) {
                        this.f10534vc.removeMessages(message.what);
                        this.f10534vc.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    AlY();
                }
            } else if (i10 == 2) {
                if (this.AlY > 0) {
                    com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar2 = this.DSW;
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = this.AlY;
                    this.AlY = i12 - 1;
                    sb2.append(i12);
                    sb2.append("s");
                    tNVar2.setSkipText(sb2.toString());
                    if (this.AlY >= 0) {
                        this.f10534vc.removeMessages(message.what);
                        this.f10534vc.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    AlY();
                }
            }
            return true;
        }

        public void tN() {
            this.f10534vc.removeMessages(this.wN);
        }

        public void YFl(int i10) {
            if (this.NjR || this.f10533nc) {
                return;
            }
            float f10 = i10;
            this.tN = f10;
            if (f10 > this.AlY) {
                if (this.wN == 0) {
                    this.wN = 2;
                }
            } else {
                this.wN = 2;
                this.AlY = (int) f10;
            }
            this.f10534vc.removeCallbacksAndMessages(null);
            this.f10534vc.sendEmptyMessage(this.wN);
        }
    }

    /* loaded from: classes.dex */
    public static class YFl extends AbstractC0106Sg {
        public YFl(Sg sg2, Wwa wwa, com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar) {
            super(sg2, wwa, tNVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.Sg.AbstractC0106Sg
        public int YFl(Wwa wwa) {
            return lG.AlY().qO(String.valueOf(wwa.kU()));
        }
    }

    /* loaded from: classes.dex */
    public static class tN implements Runnable {
        private final Wwa YFl;

        public tN(Wwa wwa) {
            this.YFl = wwa;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.YFl.TMt()) {
                YoT.YFl(lG.YFl()).YFl(this.YFl.pq());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.wN.YFl(lG.YFl()).YFl(this.YFl.pq());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class wN {
        public boolean AlY;
        public final int Sg;
        public final Bundle YFl = new Bundle();
        public boolean tN;

        public wN(int i10) {
            this.Sg = i10;
        }
    }

    public Sg(Activity activity, Wwa wwa) {
        com.bytedance.sdk.openadsdk.core.model.YFl rQ;
        List<Wwa> tN2;
        this.wN = wwa;
        this.f10528nc = activity;
        this.YI = new qsH(activity.getApplicationContext());
        int i10 = 0;
        if ((wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) && (rQ = ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).rQ()) != null) {
            boolean eT = rQ.eT();
            this.NjR = eT;
            if (eT) {
                if (!rkt.JwO().IXB()) {
                    this.NjR = false;
                }
                if (this.NjR && (tN2 = rQ.tN()) != null) {
                    Iterator<Wwa> it = tN2.iterator();
                    while (it.hasNext()) {
                        this.AlY.add(YFl(this, it.next(), i10));
                        this.bZ++;
                        i10++;
                    }
                }
            }
        }
        if (this.AlY.isEmpty() && !Ne.tN(wwa)) {
            this.AlY.add(YFl(this, wwa, i10));
            i10++;
        }
        if (!rkt.JwO().pDU(String.valueOf(wwa.kU())) && !Ne.tN(wwa)) {
            if (YFl()) {
                this.YFl = com.bytedance.sdk.openadsdk.utils.vc.YFl(activity, new vc.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.Sg.1
                    @Override // com.bytedance.sdk.openadsdk.utils.vc.YFl
                    public void Sg() {
                        if (Sg.this.aIu != null) {
                            Sg.this.aIu.setSkipInvisiable();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.utils.vc.YFl
                    public View YFl() {
                        if (Sg.this.aIu != null) {
                            return Sg.this.aIu.getCloseButton();
                        }
                        return null;
                    }
                });
                return;
            }
            return;
        }
        this.AlY.add(new com.bytedance.sdk.openadsdk.activity.tN(this, wwa, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vc Wwa() {
        return this.eT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qO() {
        if (this.AlY.isEmpty()) {
            return false;
        }
        return this.AlY.get(r0.size() - 1) instanceof com.bytedance.sdk.openadsdk.activity.tN;
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.tN DSW() {
        return this.aIu;
    }

    public boolean EH() {
        return this.Ne;
    }

    public boolean GA() {
        return this.VOe;
    }

    public Bundle NjR() {
        return this.f10529vc;
    }

    public void YoT() {
        if (EH()) {
            return;
        }
        rkt();
        com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl = this.DSW;
        if (yFl != null) {
            yFl.YFl();
        } else {
            com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2 = this.qsH;
            if (sg2 != null) {
                sg2.YFl();
            }
        }
        Runnable runnable = this.UZM;
        if (runnable != null) {
            runnable.run();
            this.UZM = null;
        }
    }

    public void eT() {
        com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl = this.DSW;
        if (yFl != null) {
            yFl.Sg();
            return;
        }
        com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2 = this.qsH;
        if (sg2 != null) {
            sg2.Sg();
        }
    }

    public qsH lG() {
        return this.YI;
    }

    public void nc() {
        com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl = this.DSW;
        if (yFl != null) {
            yFl.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2 = this.qsH;
        if (sg2 != null) {
            sg2.onAdClicked();
        }
    }

    public void pDU() {
        this.VOe = true;
    }

    @Nullable
    public vc qsH() {
        int i10;
        vc vcVar = this.eT;
        if (vcVar == null || (i10 = vcVar.NjR + 1) < 0 || i10 >= this.AlY.size()) {
            return null;
        }
        return this.AlY.get(i10);
    }

    public void rkt() {
        this.Ne = true;
    }

    public int vc() {
        return this.YoT;
    }

    public void wN(TTAdActivity tTAdActivity) {
        this.lG = 6;
        int Sg2 = Sg();
        for (vc vcVar : this.AlY) {
            if (vcVar.NjR >= Sg2) {
                vcVar.EH();
            }
        }
        vc vcVar2 = this.eT;
        if (vcVar2 != null) {
            vcVar2.YI();
        }
        vc vcVar3 = this.eT;
        if (vcVar3 != null && !vcVar3.qO()) {
            pDU.Sg().post(new tN(this.wN));
        }
        AbstractC0106Sg abstractC0106Sg = this.wXo;
        if (abstractC0106Sg != null) {
            abstractC0106Sg.tN();
        }
        eT eTVar = this.YFl;
        if (eTVar != null) {
            eTVar.tN();
        }
        this.eT = null;
        this.f10528nc = null;
    }

    private void Sg(vc vcVar, wN wNVar) {
        if (this.f10528nc == null) {
            return;
        }
        Sg();
        if (vcVar == null) {
            vc vcVar2 = this.eT;
            int i10 = vcVar2 != null ? vcVar2.NjR + 1 : 0;
            if (i10 < this.AlY.size()) {
                vcVar = this.AlY.get(i10);
            }
            if (vcVar == null) {
                YFl(this.eT);
                return;
            }
        }
        vc vcVar3 = this.eT;
        if (vcVar3 != null) {
            if (vcVar3 == vcVar) {
                return;
            }
            vcVar3.wN(this.f10528nc);
            this.eT.tN(this.f10528nc);
            View YFl2 = this.eT.YFl();
            if (YFl2 != null) {
                this.EH.removeView(YFl2);
            }
            this.eT.EH();
            this.eT.f10551nc = false;
        }
        vcVar.f10551nc = true;
        vcVar.YFl(this.f10528nc, wNVar);
        View YFl3 = vcVar.YFl();
        if (YFl3 != null) {
            ViewParent parent = YFl3.getParent();
            if (parent != null) {
                if (parent == this.EH) {
                    YFl3.setVisibility(0);
                } else if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(YFl3);
                }
            }
            if (YFl3.getParent() == null) {
                this.EH.addView(YFl3, new ViewGroup.LayoutParams(-1, -1));
            }
            if (this.f10528nc.getWindow().getContainer() == null) {
                this.f10528nc.setContentView(this.GA);
            }
        }
        vc vcVar4 = this.eT;
        this.eT = vcVar;
        YFl(vcVar4, vcVar, wNVar);
    }

    private static vc YFl(Sg sg2, Wwa wwa, int i10) {
        boolean TMt = wwa.TMt();
        AdSlot pq = wwa.pq();
        if (pq != null) {
            TMt = pq.getDurationSlotType() == 7;
        }
        if (TMt) {
            return new com.bytedance.sdk.openadsdk.activity.wN(sg2, wwa, i10);
        }
        return new com.bytedance.sdk.openadsdk.activity.AlY(sg2, wwa, i10);
    }

    public void AlY(TTAdActivity tTAdActivity) {
        this.lG = 5;
        vc vcVar = this.eT;
        if (vcVar != null) {
            vcVar.tN(tTAdActivity);
        }
    }

    public void tN(TTAdActivity tTAdActivity) {
        this.lG = 4;
        vc vcVar = this.eT;
        if (vcVar != null) {
            vcVar.wN(tTAdActivity);
        }
        AbstractC0106Sg abstractC0106Sg = this.wXo;
        if (abstractC0106Sg != null) {
            abstractC0106Sg.YFl();
        }
        eT eTVar = this.YFl;
        if (eTVar != null) {
            eTVar.Sg();
        }
    }

    public void AlY() {
        vc vcVar = this.eT;
        if (vcVar != null) {
            vcVar.lG();
        }
    }

    public boolean YFl() {
        return this.NjR;
    }

    public void YFl(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl, com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2) {
        this.Wwa = bundle;
        this.lG = 1;
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(tTAdActivity);
        this.GA = tNVar;
        tNVar.setFitsSystemWindows(true);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar2 = new com.bytedance.sdk.openadsdk.core.wN.tN(tTAdActivity);
        this.EH = tNVar2;
        this.GA.addView(tNVar2, new FrameLayout.LayoutParams(-1, -1));
        if (this.NjR) {
            this.qO = new com.bytedance.sdk.openadsdk.GA.eT(tTAdActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, GS.tN(tTAdActivity, 2.0f));
            layoutParams.gravity = 80;
            this.GA.addView(this.qO, layoutParams);
            com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(tTAdActivity);
            this.rkt = qsh;
            qsh.setTextColor(-1);
            this.rkt.setTextSize(15.0f);
            this.rkt.setShadowLayer(1.0f, 0.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = GS.tN(tTAdActivity, 60.0f);
            layoutParams2.rightMargin = GS.tN(tTAdActivity, 16.0f);
            layoutParams2.gravity = 8388661;
            this.GA.addView(this.rkt, layoutParams2);
            com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar3 = new com.bytedance.sdk.openadsdk.component.reward.top.tN(tTAdActivity);
            this.aIu = tNVar3;
            this.GA.addView(tNVar3, new FrameLayout.LayoutParams(-1, -2));
            this.aIu.YFl(this.wN);
            this.aIu.setShowDislike(true);
        }
        this.DSW = yFl;
        this.qsH = sg2;
        if (yFl == null && bundle != null) {
            this.DSW = Sg;
            Sg = null;
        }
        if (sg2 == null && bundle != null) {
            this.qsH = tN;
            tN = null;
        }
        Sg(null, new wN(1));
    }

    public Activity tN() {
        return this.f10528nc;
    }

    public com.bytedance.sdk.openadsdk.activity.tN wN() {
        com.bytedance.sdk.openadsdk.activity.tN tNVar = this.pDU;
        if (tNVar != null) {
            return tNVar;
        }
        vc vcVar = this.eT;
        int i10 = vcVar != null ? vcVar.NjR : -1;
        int size = this.AlY.size() - 1;
        while (true) {
            if (size <= i10) {
                break;
            }
            vc vcVar2 = this.AlY.get(size);
            if (vcVar2 instanceof com.bytedance.sdk.openadsdk.activity.tN) {
                this.pDU = (com.bytedance.sdk.openadsdk.activity.tN) vcVar2;
                break;
            }
            size--;
        }
        return this.pDU;
    }

    public void Sg(TTAdActivity tTAdActivity) {
        this.lG = 3;
        vc vcVar = this.eT;
        if (vcVar != null) {
            vcVar.Sg(tTAdActivity);
        }
        AbstractC0106Sg abstractC0106Sg = this.wXo;
        if (abstractC0106Sg != null) {
            abstractC0106Sg.Sg();
        }
        eT eTVar = this.YFl;
        if (eTVar != null) {
            eTVar.YFl();
        }
    }

    public int Sg() {
        vc vcVar = this.eT;
        if (vcVar != null) {
            return vcVar.NjR;
        }
        return -1;
    }

    private void YFl(vc vcVar, vc vcVar2, wN wNVar) {
        if (this.NjR) {
            boolean z10 = vcVar2 instanceof com.bytedance.sdk.openadsdk.activity.YFl;
            if (z10) {
                this.YoT++;
                YFl(0.0f);
                if (this.wXo == null) {
                    if (vcVar2 instanceof com.bytedance.sdk.openadsdk.activity.AlY) {
                        this.wXo = new YFl(this, this.wN, this.aIu);
                    } else {
                        this.wXo = new AlY(this, this.wN, this.aIu);
                    }
                }
                int i10 = 0;
                for (int i11 = vcVar2.NjR; i11 < this.AlY.size(); i11++) {
                    vc vcVar3 = this.AlY.get(i11);
                    if (vcVar3 instanceof com.bytedance.sdk.openadsdk.activity.tN) {
                        break;
                    }
                    a BPI = vcVar3.qsH.BPI();
                    i10 = BPI != null ? (int) (i10 + BPI.f23459d) : (int) (i10 + 10);
                }
                this.wXo.YFl(i10);
                eT eTVar = this.YFl;
                if (eTVar != null && vcVar == null) {
                    eTVar.YFl(i10 * 1000);
                }
            } else if (vcVar2 instanceof com.bytedance.sdk.openadsdk.activity.tN) {
                com.bytedance.sdk.openadsdk.GA.eT eTVar2 = this.qO;
                if (eTVar2 != null) {
                    GS.DSW(eTVar2);
                    this.qO = null;
                }
                com.bytedance.sdk.openadsdk.component.reward.top.tN tNVar = this.aIu;
                if (tNVar != null) {
                    GS.DSW(tNVar);
                    GS.DSW(this.aIu.getITopLayout());
                    this.aIu = null;
                }
                AbstractC0106Sg abstractC0106Sg = this.wXo;
                if (abstractC0106Sg != null) {
                    abstractC0106Sg.tN();
                }
                if (vcVar instanceof com.bytedance.sdk.openadsdk.activity.wN) {
                    ((com.bytedance.sdk.openadsdk.activity.wN) vcVar).Ne();
                }
                eT eTVar3 = this.YFl;
                if (eTVar3 != null) {
                    eTVar3.tN();
                }
            }
            if (z10) {
                this.rkt.setText(this.f10528nc.getString(qO.Sg(lG.YFl(), "tt_multiple_ad_indicator"), Integer.valueOf(vcVar2.NjR + 1), Integer.valueOf(this.bZ)));
            } else {
                this.rkt.setVisibility(8);
            }
        }
        for (int i12 = vcVar != null ? vcVar.NjR : 0; i12 < this.AlY.size(); i12++) {
            this.AlY.get(i12).YFl(vcVar, vcVar2, wNVar);
        }
        vcVar2.YFl(this.f10528nc, this.Wwa);
        int i13 = this.lG;
        if (i13 == 2) {
            vcVar2.AlY(this.f10528nc);
            return;
        }
        if (i13 == 3) {
            vcVar2.AlY(this.f10528nc);
            vcVar2.Sg(this.f10528nc);
        } else if (i13 != 4) {
            if (i13 != 5) {
                return;
            }
            vcVar2.tN(this.f10528nc);
        } else {
            vcVar2.wN(this.f10528nc);
        }
    }

    public void YFl(TTAdActivity tTAdActivity) {
        this.lG = 2;
        vc vcVar = this.eT;
        if (vcVar != null) {
            vcVar.AlY(tTAdActivity);
        }
    }

    public void YFl(TTAdActivity tTAdActivity, Bundle bundle) {
        com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl = this.DSW;
        if (yFl != null) {
            Sg = yFl;
            return;
        }
        com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2 = this.qsH;
        if (sg2 != null) {
            tN = sg2;
        }
    }

    public void YFl(vc vcVar, wN wNVar) {
        vc vcVar2 = this.eT;
        if (vcVar2 == null || vcVar2 == vcVar) {
            Sg(null, wNVar);
        }
    }

    public void YFl(vc vcVar) {
        if (vcVar instanceof com.bytedance.sdk.openadsdk.activity.wN) {
            ((com.bytedance.sdk.openadsdk.activity.wN) vcVar).Ne();
        }
        Activity activity = this.f10528nc;
        if (activity != null) {
            activity.finish();
        }
    }

    public void YFl(vc vcVar, boolean z10, boolean z11, boolean z12, int i10) {
        com.bytedance.sdk.openadsdk.activity.tN wN2;
        vc vcVar2 = this.eT;
        if ((vcVar2 == null || vcVar2 == vcVar) && (wN2 = wN()) != null) {
            wN wNVar = new wN(i10);
            wNVar.YFl.putBoolean("isSkip", z10);
            wNVar.YFl.putBoolean("force", z11);
            wNVar.YFl.putBoolean("isFromLandingPage", z12);
            Sg(wN2, wNVar);
        }
    }

    public void YFl(Activity activity) {
        vc vcVar = this.eT;
        if (vcVar != null) {
            vcVar.YFl(activity);
        }
    }

    public void YFl(float f10) {
        com.bytedance.sdk.openadsdk.GA.eT eTVar = this.qO;
        if (eTVar == null) {
            return;
        }
        eTVar.setProgress(f10);
        if (f10 == 0.0f && this.qO.getVisibility() == 0) {
            this.qO.setVisibility(4);
        } else {
            if (f10 <= 0.0f || this.qO.getVisibility() == 0) {
                return;
            }
            this.qO.setVisibility(0);
        }
    }

    public void YFl(int i10) {
        AbstractC0106Sg abstractC0106Sg = this.wXo;
        if (abstractC0106Sg == null) {
            return;
        }
        if (i10 == 2) {
            abstractC0106Sg.YFl();
            eT eTVar = this.YFl;
            if (eTVar != null) {
                eTVar.Sg();
                return;
            }
            return;
        }
        if (i10 == 1) {
            abstractC0106Sg.Sg();
            eT eTVar2 = this.YFl;
            if (eTVar2 != null) {
                eTVar2.YFl();
            }
        }
    }

    public void YFl(final vc vcVar, final boolean z10, final int i10, final String str, final int i11, final String str2) {
        Activity activity;
        if (!this.Ne) {
            this.UZM = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.Sg.2
                @Override // java.lang.Runnable
                public void run() {
                    Sg.this.YFl(vcVar, z10, i10, str, i11, str2);
                }
            };
            return;
        }
        if (GA()) {
            return;
        }
        pDU();
        if (this.DSW == null || (activity = this.f10528nc) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.Sg.3
            @Override // java.lang.Runnable
            public void run() {
                Sg.this.DSW.YFl(z10, i10, str, i11, str2);
            }
        });
        if (YFl()) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), vcVar.qsH, vcVar.b_(), z10 ? "reward_success" : "reward_fail");
        }
    }

    public void YFl(View view) {
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.EH.addView(view, 0);
    }
}
