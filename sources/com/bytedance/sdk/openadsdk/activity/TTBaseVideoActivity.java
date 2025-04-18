package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.AlY.Sg;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.component.reward.YFl.eT;
import com.bytedance.sdk.openadsdk.component.reward.YFl.qsH;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.aIu;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements bZ.YFl, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg {
    final bZ AlY;
    private final AtomicBoolean GA;
    int NjR;
    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl Sg;
    public final String YFl;
    private int YoT;
    private boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.YoT.wN f10537nc;
    boolean qsH;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.Sg.Sg tN;

    /* renamed from: vc, reason: collision with root package name */
    int f10538vc;
    protected IListenerManager wN;

    public TTBaseVideoActivity() {
        String str;
        if (lG()) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        this.YFl = str;
        this.AlY = new bZ(Looper.getMainLooper(), this);
        this.eT = false;
        this.YoT = 0;
        this.NjR = 1;
        this.GA = new AtomicBoolean(false);
        this.f10537nc = new com.bytedance.sdk.openadsdk.YoT.wN() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.YoT.wN
            public void YFl() {
                TTBaseVideoActivity.this.pDU();
            }
        };
    }

    private void aIu() {
        this.tN.YFl(this.f10537nc);
        this.f10538vc = (int) this.Sg.VOe.dXO();
        rkt();
        tN();
        if (this.Sg.Sg.Af() != null && this.Sg.Sg.Af().YFl() != null) {
            this.Sg.Sg.Af().YFl().YFl(0L);
        }
    }

    private void qO() {
        setContentView(this.Sg.mB);
        this.Sg.mB.YFl(this.tN);
        this.tN.YFl(this, this.AlY);
        this.tN.eT();
    }

    private boolean wXo() {
        if (this.Sg.f10590nc.get() && this.Sg.DSW) {
            return false;
        }
        if (!(this instanceof TTFullScreenExpressVideoActivity) && !(this instanceof TTRewardExpressVideoActivity)) {
            return true;
        }
        return this.Sg.f10590nc.get();
    }

    public void DSW() {
        if (!Wwa() || this.eT) {
            return;
        }
        this.eT = true;
        getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
            @Override // java.lang.Runnable
            public void run() {
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = tTBaseVideoActivity.Sg;
                com.bytedance.sdk.openadsdk.component.reward.YFl.vc vcVar = yFl.Cfr;
                float[] YFl = yFl.Ga.YFl(tTBaseVideoActivity.NjR);
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                vcVar.YFl(YFl, tTBaseVideoActivity2, tTBaseVideoActivity2.tN);
            }
        });
    }

    public void EH() {
        this.AlY.removeMessages(400);
    }

    public void GA() {
        Message message = new Message();
        message.what = 400;
        if (lG()) {
            YFl(10000);
        }
        this.AlY.sendMessageDelayed(message, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void NjR() {
        this.Sg.VOe.Cfr();
    }

    public IListenerManager Sg(int i10) {
        if (this.wN == null) {
            this.wN = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl().YFl(i10));
        }
        return this.wN;
    }

    public boolean Wwa() {
        return false;
    }

    public abstract void YFl();

    public void YFl(@NonNull Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YoT() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void eT() {
        if (this.Sg.pDU.getAndSet(true) && !Ne.tN(this.Sg.Sg)) {
            return;
        }
        this.Sg.dXO.YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.Sg == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.bZ.wN()) {
            GS.Sg((Activity) this);
        }
        if (Ne.DSW(this.Sg.Sg) && !this.Sg.f10590nc.get()) {
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
        } else if (Ne.wN(this.Sg.Sg) && !this.Sg.UZM.qsH(qsH.Sg)) {
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
        }
    }

    public abstract boolean lG();

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public View nc() {
        return this.Sg.VOe.hQ();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl == null) {
            return;
        }
        yFl.Ga.YFl();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2;
        if (this.Sg != null && (sg2 = this.tN) != null) {
            sg2.VOe();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl;
        super.onCreate(bundle);
        aIu.YFl("BVA", "onCreate ".concat(String.valueOf(this)));
        lG.Sg(getApplicationContext());
        if (!pDU.wN()) {
            finish();
            return;
        }
        Wwa YFl = com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(getIntent(), bundle, this);
        if (YFl == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.Sg.YFl(YFl);
        this.NjR = YFl.SVa();
        YFl(YFl, bundle);
        if (bundle != null) {
            if (YFl.PVM()) {
                this.GA.set(true);
            }
            if (YFl.GT() && (yFl = this.Sg) != null) {
                yFl.GA.set(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.Sg;
            if (yFl2 != null) {
                yFl2.dXO.DSW();
            }
        }
        try {
            qO();
            aIu();
        } catch (Throwable th2) {
            YoT.YFl("TTAD.BVA", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.pDU.tN.Sg();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        aIu.YFl("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl != null && this.tN != null) {
            if (yFl.f10588dd > 0 && yFl.GA.get()) {
                String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.Sg.f10588dd);
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.Sg;
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(valueOf, yFl2.Sg, this.YFl, yFl2.VOe.YFl());
                this.Sg.f10588dd = 0L;
            }
            this.Sg.hQ.Sg();
            this.AlY.removeCallbacksAndMessages(null);
            this.tN.Ne();
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(this.Sg.Sg);
            final AdSlot pq = this.Sg.Sg.pq();
            if (!this.Sg.VOe.bZ() && pq != null && TextUtils.isEmpty(pq.getBidAdm())) {
                pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TTBaseVideoActivity.this.lG()) {
                            com.bytedance.sdk.openadsdk.component.reward.YoT.YFl(lG.YFl()).YFl(pq);
                        } else {
                            com.bytedance.sdk.openadsdk.component.reward.wN.YFl(lG.YFl()).YFl(pq);
                        }
                    }
                });
            }
            com.bytedance.sdk.openadsdk.utils.YoT.YFl();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        aIu.YFl("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.tN;
        if (sg2 == null) {
            return;
        }
        sg2.aIu();
    }

    @Override // android.app.Activity
    public void onRestart() {
        Wwa wwa;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl != null && (wwa = yFl.Sg) != null) {
            if (this.DSW && !wwa.ECi() && !TextUtils.isEmpty(Wwa.YFl(this, wwa))) {
                finish();
            }
            if (wwa.ECi()) {
                wwa.wN(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2;
        boolean z10;
        super.onResume();
        aIu.YFl("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.Sg != null && (sg2 = this.tN) != null) {
            sg2.lG();
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
            yFl.Bh = true;
            yFl.Ga.Sg(this.AlY);
            if (wXo()) {
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.Sg;
                yFl2.Sco.YFl(yFl2.Sg.Gnp());
            }
            this.Sg.lu.EH();
            this.Sg.mn.Ne();
            this.Sg.UZM.GA();
            if (this.tN.Sg()) {
                this.Sg.VOe.YFl(this.tN);
                com.bytedance.sdk.openadsdk.component.reward.YFl.lG lGVar = this.Sg.VOe;
                if (this.YoT != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lGVar.YFl(false, this, z10);
            }
            this.YoT++;
            DSW();
            com.bytedance.sdk.openadsdk.component.reward.view.qsH qsh = this.Sg.YI;
            if (qsh != null) {
                qsh.DSW();
            }
            this.Sg.Ga.YFl(this.AlY);
            this.tN.qO();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (yFl.GA.get()) {
            this.Sg.Sg.qsH(true);
        }
        if (this.GA.get()) {
            this.Sg.Sg.eA();
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(this.Sg, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        aIu.YFl("BVA", "onStart ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl == null) {
            return;
        }
        yFl.mn.mn();
        com.bytedance.sdk.openadsdk.utils.tN.YFl(this, this.Sg.Sg);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        aIu.YFl("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.tN;
        if (sg2 == null) {
            return;
        }
        sg2.wXo();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        eT eTVar;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl != null && (eTVar = yFl.dXO) != null) {
            eTVar.Sg(z10);
            this.Sg.dXO.tN(z10);
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.Sg;
        if (yFl2 != null) {
            com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = yFl2.Vmj;
            if (sg2 instanceof com.bytedance.sdk.openadsdk.component.reward.Sg.wN) {
                ((com.bytedance.sdk.openadsdk.component.reward.Sg.wN) sg2).Sg(z10);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void qsH() {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.tN;
        if (sg2 == null) {
            return;
        }
        sg2.GA();
    }

    public abstract void rkt();

    public void tN() {
        if (Ne.tN(this.Sg.Sg)) {
            YFl(false, Sg.C0098Sg.tN);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.tN;
        if (sg2 != null) {
            sg2.YFl(this.Sg.lu.vc());
            this.tN.YI();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void vc() {
        if (!this.GA.compareAndSet(false, true)) {
            return;
        }
        aIu.YFl("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
        wN();
    }

    public abstract void wN();

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(Bundle bundle) {
    }

    private void YFl(Wwa wwa, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = new com.bytedance.sdk.openadsdk.component.reward.YFl.YFl(this, this.AlY, wwa, this, 0);
        this.Sg = yFl;
        com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(yFl, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            YFl(intent);
            wwa.YFl(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.Sg.f10589ib) {
            YFl();
        }
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg YFl = com.bytedance.sdk.openadsdk.component.reward.Sg.vc.YFl(this.Sg);
        this.tN = YFl;
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.Sg;
        yFl2.Vmj = YFl;
        com.bytedance.sdk.openadsdk.utils.YoT.YFl(yFl2);
        Objects.toString(this.tN);
    }

    public void YFl(boolean z10, int i10) {
        YFl(z10, false, i10);
    }

    public void YFl(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.tN;
        if (sg2 == null) {
            return;
        }
        sg2.YFl(z10, z11, false, i10);
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.tN;
        if (sg2 == null) {
            return;
        }
        sg2.YFl(message);
    }
}
