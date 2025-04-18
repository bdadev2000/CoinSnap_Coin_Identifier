package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.utils.vc;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class YFl {
    public final boolean AlY;
    public final Context BPI;
    public com.bytedance.sdk.openadsdk.utils.eT Bn;
    public final vc Cfr;
    public final boolean DSW;
    private long DjU;
    public final wN GS;
    public final YoT Ga;
    public boolean Hjb;
    public int Jc;
    public boolean Ld;
    public int RX;

    @NonNull
    public final pDU Sco;
    public final com.bytedance.sdk.openadsdk.core.model.Wwa Sg;

    @NonNull
    public final Activity UI;

    @Nullable
    public com.bytedance.sdk.openadsdk.activity.vc UT;
    public final qsH UZM;
    public float VB;

    @NonNull
    public final lG VOe;
    public com.bytedance.sdk.openadsdk.component.reward.Sg.Sg Vmj;
    public final int YFl;
    public final com.bytedance.sdk.openadsdk.component.reward.view.qsH YI;
    private long YP;
    public com.bytedance.sdk.openadsdk.component.reward.top.tN ZLB;
    public final com.bytedance.sdk.openadsdk.core.GA.AlY.Sg ZU;
    public final AlY bZ;
    public int dGX;
    public final eT dXO;
    public String fIu;
    public final tN hQ;
    public boolean iY;

    /* renamed from: ib, reason: collision with root package name */
    public boolean f10589ib;
    public boolean in;
    public final boolean ko;
    public com.bytedance.sdk.openadsdk.common.YoT lL;
    public final com.bytedance.sdk.openadsdk.component.reward.view.nc lu;
    public final com.bytedance.sdk.openadsdk.component.reward.view.DSW mB;
    public final Wwa mn;
    public com.bytedance.sdk.openadsdk.YoT.qsH pq;
    public final boolean tN;
    public boolean tQ;
    public boolean uGS;

    /* renamed from: vc, reason: collision with root package name */
    public final int f10591vc;
    public final String wN;
    public final EH zB;
    public final bZ zG;
    public boolean zz;
    public int qsH = 0;
    public int NjR = 0;

    /* renamed from: nc, reason: collision with root package name */
    public final AtomicBoolean f10590nc = new AtomicBoolean(false);
    public final AtomicBoolean eT = new AtomicBoolean(false);
    public final AtomicBoolean YoT = new AtomicBoolean(false);
    public final AtomicBoolean GA = new AtomicBoolean(false);
    public final AtomicBoolean pDU = new AtomicBoolean(false);
    public final AtomicBoolean EH = new AtomicBoolean(false);
    public final AtomicBoolean rkt = new AtomicBoolean(false);
    public final AtomicBoolean lG = new AtomicBoolean(false);
    public final AtomicBoolean Wwa = new AtomicBoolean(false);
    public final AtomicBoolean qO = new AtomicBoolean(false);
    public final AtomicBoolean aIu = new AtomicBoolean(false);
    public final AtomicBoolean wXo = new AtomicBoolean(false);
    public final AtomicBoolean Ne = new AtomicBoolean(false);
    public boolean Bh = false;
    public int Cqy = 1;

    /* renamed from: dd, reason: collision with root package name */
    public long f10588dd = 0;

    public YFl(@NonNull Activity activity, bZ bZVar, @NonNull com.bytedance.sdk.openadsdk.core.model.Wwa wwa, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2, int i10) {
        boolean z10;
        boolean z11;
        String str;
        YoT yoT;
        com.bytedance.sdk.openadsdk.component.reward.view.nc njR;
        this.UI = activity;
        this.ZU = sg2;
        Context YFl = com.bytedance.sdk.openadsdk.core.lG.YFl();
        this.BPI = YFl;
        this.Sg = wwa;
        this.YFl = i10;
        if (i10 != 0 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.ko = z10;
        if (i10 != 0 && i10 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.in = z11;
        this.zG = bZVar;
        boolean z12 = wwa.pq().getDurationSlotType() == 7;
        this.AlY = z12;
        if (z12) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        this.wN = str;
        this.zz = wwa.YFl();
        this.DSW = com.bytedance.sdk.openadsdk.core.model.rkt.NjR(wwa);
        int kU = wwa.kU();
        this.f10591vc = kU;
        this.iY = com.bytedance.sdk.openadsdk.core.lG.AlY().lG(String.valueOf(kU));
        this.tN = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().pDU(String.valueOf(kU));
        if (i10 == 2) {
            yoT = new GA(this);
        } else {
            yoT = new YoT(this);
        }
        this.Ga = yoT;
        if (i10 == 2) {
            njR = new com.bytedance.sdk.openadsdk.component.reward.view.eT(this);
        } else if (wwa.YFl()) {
            njR = new com.bytedance.sdk.openadsdk.component.reward.view.nc(this);
        } else {
            njR = new com.bytedance.sdk.openadsdk.component.reward.view.NjR(this);
        }
        this.lu = njR;
        this.mB = new com.bytedance.sdk.openadsdk.component.reward.view.DSW(this);
        this.VOe = new lG(this);
        this.bZ = new AlY(this);
        this.UZM = new qsH(this, wwa);
        this.YI = new com.bytedance.sdk.openadsdk.component.reward.view.qsH(this);
        this.mn = new Wwa(this);
        this.zB = new EH(this);
        this.Sco = new pDU(this);
        this.GS = new wN(this);
        this.dXO = new eT(this);
        this.Cfr = new vc(this);
        this.hQ = new tN(this);
        this.pq = new com.bytedance.sdk.openadsdk.YoT.qsH(YFl);
        this.Bn = com.bytedance.sdk.openadsdk.utils.vc.YFl(activity, new vc.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.YFl.1
            @Override // com.bytedance.sdk.openadsdk.utils.vc.YFl
            public void Sg() {
                pDU pdu = YFl.this.Sco;
                if (pdu != null) {
                    pdu.vc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vc.YFl
            public View YFl() {
                com.bytedance.sdk.openadsdk.component.reward.view.nc ncVar = YFl.this.lu;
                if (ncVar != null) {
                    return ncVar.nc();
                }
                return null;
            }
        });
    }

    public void Sg() {
        if (this.DjU <= 0) {
            this.DjU = SystemClock.elapsedRealtime();
        }
        this.YP = (SystemClock.elapsedRealtime() - this.DjU) + this.YP;
    }

    public void YFl(boolean z10) {
        this.f10589ib = z10;
        this.Sco.AlY(z10);
    }

    public long tN() {
        return (SystemClock.elapsedRealtime() - this.DjU) + this.YP;
    }

    public void YFl() {
        this.DjU = SystemClock.elapsedRealtime();
    }
}
