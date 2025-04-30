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
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.YW.COT;
import com.bytedance.sdk.openadsdk.component.reward.zp.HWF;
import com.bytedance.sdk.openadsdk.component.reward.zp.ku;
import com.bytedance.sdk.openadsdk.component.reward.zp.zp;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.core.video.KS.KS;
import com.bytedance.sdk.openadsdk.core.video.KS.lMd;
import com.bytedance.sdk.openadsdk.lMd.lMd;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.pvr;
import com.bytedance.sdk.openadsdk.utils.yRU;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements RCv.zp, KS, lMd {
    protected COT Bj;
    protected IListenerManager COT;
    int HWF;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.lMd.lMd KS;
    int YW;
    public boolean dT;
    final RCv jU;
    boolean ku;
    zp lMd;
    private final AtomicBoolean rV;
    private int tG;
    private boolean vDp;
    public final String zp;

    public TTBaseVideoActivity() {
        String str;
        if (dQp()) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        this.zp = str;
        this.jU = new RCv(Looper.getMainLooper(), this);
        this.vDp = false;
        this.tG = 0;
        this.YW = 1;
        this.dT = true;
        this.rV = new AtomicBoolean(false);
        this.Bj = new COT() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.YW.COT
            public void zp() {
                TTBaseVideoActivity.this.dT();
            }
        };
    }

    private void FP() {
        this.KS.zp(this.Bj);
        this.HWF = (int) this.lMd.UPs.Gzh();
        rV();
        HWF();
        if (this.lMd.zp.xg() != null && this.lMd.zp.xg().zp() != null) {
            this.lMd.zp.xg().zp().zp(0L);
        }
    }

    private void cz() {
        setContentView(this.lMd.MBR);
        this.lMd.MBR.zp(this.KS);
        this.KS.zp(this, this.jU);
        this.KS.vDp();
    }

    private boolean ot() {
        if (this.lMd.FP.get() && this.lMd.pvr) {
            return false;
        }
        if (!(this instanceof TTFullScreenExpressVideoActivity) && !(this instanceof TTRewardExpressVideoActivity)) {
            return true;
        }
        return this.lMd.FP.get();
    }

    public void Bj() {
        if (!KVG() || this.vDp) {
            return;
        }
        this.vDp = true;
        getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                zp zpVar = tTBaseVideoActivity.lMd;
                HWF hwf = zpVar.BO;
                float[] zp = zpVar.Pxi.zp(tTBaseVideoActivity.YW);
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                hwf.zp(zp, tTBaseVideoActivity2, tTBaseVideoActivity2.KS);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.KS
    public View COT() {
        return this.lMd.UPs.QUv();
    }

    public void HWF() {
        if (cz.Bj(this.lMd.zp)) {
            zp(false, lMd.C0123lMd.KS);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = this.KS;
        if (lmd != null) {
            lmd.zp(this.lMd.rCC.HWF());
            this.KS.Gzh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.KS
    public void KS() {
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = this.KS;
        if (lmd == null) {
            return;
        }
        lmd.rV();
    }

    public boolean KVG() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public final void QR() {
        if (!this.rV.compareAndSet(false, true)) {
            return;
        }
        pvr.zp("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
        ku();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.KS
    public void YW() {
    }

    public abstract boolean dQp();

    public void dT() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.lMd == null) {
            return;
        }
        if (yRU.COT()) {
            WNy.lMd((Activity) this);
        }
        if (cz.lMd(this.lMd.zp) && !this.lMd.FP.get()) {
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.KS
    public void jU() {
        this.lMd.UPs.irS();
    }

    public abstract void ku();

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.KS
    public void lMd() {
        if (this.lMd.RCv.getAndSet(true) && !cz.Bj(this.lMd.zp)) {
            return;
        }
        this.lMd.oKZ.zp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zp zpVar = this.lMd;
        if (zpVar == null) {
            return;
        }
        zpVar.Pxi.zp();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd;
        if (this.lMd != null && (lmd = this.KS) != null) {
            lmd.ox();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        zp zpVar;
        super.onCreate(bundle);
        pvr.zp("BVA", "onCreate ".concat(String.valueOf(this)));
        KVG.zp(getApplicationContext());
        if (!tG.COT()) {
            finish();
            return;
        }
        woN zp = com.bytedance.sdk.openadsdk.component.reward.zp.lMd.zp(getIntent(), bundle, this);
        if (zp == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.lMd.zp(zp);
        this.YW = zp.bX();
        zp(zp, bundle);
        if (bundle != null) {
            if (zp.RA()) {
                this.rV.set(true);
            }
            if (zp.Vc() && (zpVar = this.lMd) != null) {
                zpVar.ox.set(true);
            }
            zp zpVar2 = this.lMd;
            if (zpVar2 != null) {
                zpVar2.oKZ.QR();
            }
        }
        try {
            cz();
            FP();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.BVA", "onCreate: ", th);
            this.dT = false;
            com.bytedance.sdk.openadsdk.lMd.KS.lMd();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pvr.zp("BVA", "onDestroy ".concat(String.valueOf(this)));
        zp zpVar = this.lMd;
        if (zpVar != null && this.KS != null) {
            if (zpVar.vwr > 0 && zpVar.ox.get()) {
                String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.lMd.vwr);
                zp zpVar2 = this.lMd;
                com.bytedance.sdk.openadsdk.lMd.KS.zp(valueOf, zpVar2.zp, this.zp, zpVar2.UPs.zp());
                this.lMd.vwr = 0L;
            }
            this.lMd.Iv.lMd();
            this.jU.removeCallbacksAndMessages(null);
            this.KS.yRU();
            com.bytedance.sdk.openadsdk.rV.zp.COT.zp(this.lMd.zp);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        pvr.zp("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = this.KS;
        if (lmd == null) {
            return;
        }
        lmd.FP();
    }

    @Override // android.app.Activity
    public void onRestart() {
        woN won;
        super.onRestart();
        zp zpVar = this.lMd;
        if (zpVar != null && (won = zpVar.zp) != null) {
            if (this.QR && !won.Ml() && !TextUtils.isEmpty(woN.zp(this, won))) {
                finish();
            }
            if (won.Ml()) {
                won.COT(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd;
        boolean z8;
        super.onResume();
        pvr.zp("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.lMd != null && (lmd = this.KS) != null) {
            lmd.vwr();
            zp zpVar = this.lMd;
            zpVar.COT = true;
            zpVar.Pxi.lMd(this.jU);
            if (ot()) {
                zp zpVar2 = this.lMd;
                zpVar2.Rh.zp(zpVar2.zp.bQm());
            }
            this.lMd.rCC.dQp();
            this.lMd.si.pvr();
            this.lMd.ffE.tG();
            if (this.KS.lMd()) {
                this.lMd.UPs.zp(this.KS);
                com.bytedance.sdk.openadsdk.component.reward.zp.tG tGVar = this.lMd.UPs;
                if (this.tG != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                tGVar.zp(false, this, z8);
            }
            this.tG++;
            Bj();
            com.bytedance.sdk.openadsdk.component.reward.view.KS ks = this.lMd.eWG;
            if (ks != null) {
                ks.QR();
            }
            this.lMd.Pxi.zp(this.jU);
            this.KS.cz();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        zp zpVar = this.lMd;
        if (zpVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (zpVar.ox.get()) {
            this.lMd.zp.ku(true);
        }
        if (this.rV.get()) {
            this.lMd.zp.VgU();
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.lMd.zp(this.lMd, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        pvr.zp("BVA", "onStart ".concat(String.valueOf(this)));
        zp zpVar = this.lMd;
        if (zpVar == null) {
            return;
        }
        zpVar.si.QUv();
        com.bytedance.sdk.openadsdk.utils.KS.zp(this, this.lMd.zp);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        pvr.zp("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = this.KS;
        if (lmd == null) {
            return;
        }
        lmd.ot();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z8) {
        ku kuVar;
        super.onWindowFocusChanged(z8);
        zp zpVar = this.lMd;
        if (zpVar != null && (kuVar = zpVar.oKZ) != null) {
            kuVar.lMd(z8);
            this.lMd.oKZ.KS(z8);
        }
        zp zpVar2 = this.lMd;
        if (zpVar2 != null) {
            com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = zpVar2.Vjb;
            if (lmd instanceof com.bytedance.sdk.openadsdk.component.reward.lMd.COT) {
                ((com.bytedance.sdk.openadsdk.component.reward.lMd.COT) lmd).lMd(z8);
            }
        }
    }

    public abstract void rV();

    public void tG() {
        this.jU.removeMessages(400);
    }

    public void vDp() {
        Message message = new Message();
        message.what = 400;
        if (dQp()) {
            KS(10000);
        }
        this.jU.sendMessageDelayed(message, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    public boolean woN() {
        return false;
    }

    public abstract void zp();

    public void zp(@NonNull Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void zp(Bundle bundle) {
    }

    private void zp(woN won, Bundle bundle) {
        zp zpVar = new zp(this, this.jU, won);
        this.lMd = zpVar;
        com.bytedance.sdk.openadsdk.component.reward.zp.lMd.zp(zpVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            zp(intent);
            won.zp(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.lMd.KVG) {
            zp();
        }
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd zp = com.bytedance.sdk.openadsdk.component.reward.lMd.HWF.zp(this.lMd);
        this.KS = zp;
        this.lMd.Vjb = zp;
        Objects.toString(zp);
    }

    public void zp(boolean z8, int i9) {
        zp(z8, false, i9);
    }

    public void zp(boolean z8, boolean z9, int i9) {
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = this.KS;
        if (lmd == null) {
            return;
        }
        lmd.zp(z8, z9, false, i9);
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = this.KS;
        if (lmd == null) {
            return;
        }
        lmd.zp(message);
    }

    public IListenerManager zp(int i9) {
        if (this.COT == null) {
            this.COT = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp().zp(i9));
        }
        return this.COT;
    }
}
