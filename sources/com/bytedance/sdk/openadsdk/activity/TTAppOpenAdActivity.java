package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.apiImpl.KS.lMd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.HWF;
import com.bytedance.sdk.openadsdk.component.KS;
import com.bytedance.sdk.openadsdk.component.ku.zp;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.QR.jU;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.pvr;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.rV.zp.COT;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.cW;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements RCv.zp {
    private static lMd ku;
    private TTAdDislikeDialog Bj;
    private woN FP;
    private FrameLayout Gzh;
    private float KVG;
    private int Lij;
    private KS QUv;
    private int RCv;
    private AdSlot cW;
    private String cz;
    private QR dQp;
    private com.bytedance.sdk.openadsdk.component.HWF.lMd dT;
    private boolean irS;
    private IListenerManager ot;
    private int pvr;
    private TTAdDislikeToast vDp;
    private boolean vwr;
    private float woN;
    private lMd yRU;
    protected final AtomicBoolean zp = new AtomicBoolean(false);
    protected final RCv lMd = new RCv(Looper.getMainLooper(), this);
    final AtomicBoolean KS = new AtomicBoolean(false);
    final AtomicBoolean jU = new AtomicBoolean(false);
    private final zp YW = new zp();
    protected boolean COT = false;
    private final AtomicBoolean tG = new AtomicBoolean(false);
    private cW rV = cW.lMd();
    private final AtomicBoolean ox = new AtomicBoolean(false);
    long HWF = 0;
    private final com.bytedance.sdk.openadsdk.component.zp YhE = new com.bytedance.sdk.openadsdk.component.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.zp
        public void COT() {
            TTAppOpenAdActivity.this.vwr();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp
        public void KS() {
            TTAppOpenAdActivity.this.HWF();
            TTAppOpenAdActivity.this.rV.jU();
            TTAppOpenAdActivity.this.KVG();
            if (TTAppOpenAdActivity.this.vwr) {
                TTAppOpenAdActivity.this.Bj();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp
        public void jU() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp, com.bykv.vk.openvk.component.video.api.jU.KS.zp
        public void lMd(long j7, int i9) {
            StringBuilder sb = new StringBuilder("onError() called with: totalPlayTime = [");
            sb.append(j7);
            sb.append("], percent = [");
            sb.append(i9);
            sb.append("]");
            TTAppOpenAdActivity.this.pvr();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp, com.bykv.vk.openvk.component.video.api.jU.KS.zp
        public void zp() {
            TTAppOpenAdActivity.this.pvr();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp, com.bykv.vk.openvk.component.video.api.jU.KS.zp
        public void zp(long j7, long j9) {
            TTAppOpenAdActivity.this.YW.zp(j7);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.COT && tTAppOpenAdActivity.QUv != null && TTAppOpenAdActivity.this.QUv.COT() != null && TTAppOpenAdActivity.this.QUv.COT().lMd()) {
                TTAppOpenAdActivity.this.QUv.COT().jU();
            }
            TTAppOpenAdActivity.this.vDp();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp, com.bytedance.sdk.openadsdk.component.HWF.zp
        public void lMd(View view) {
            TTAppOpenAdActivity.this.zp();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp, com.bytedance.sdk.openadsdk.component.HWF.zp
        public void lMd() {
            if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                if (TTAppOpenAdActivity.this.yRU != null) {
                    TTAppOpenAdActivity.this.yRU.KS();
                }
            } else {
                TTAppOpenAdActivity.this.zp("onAdTimeOver");
            }
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp, com.bytedance.sdk.openadsdk.component.HWF.zp
        public void zp(View view) {
            TTAppOpenAdActivity.this.cz();
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp, com.bytedance.sdk.openadsdk.component.HWF.zp
        public void zp(int i9, int i10, boolean z8) {
            if (TTAppOpenAdActivity.this.QUv != null) {
                TTAppOpenAdActivity.this.QUv.zp(i9, i10, z8);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.zp
        public void zp(int i9) {
            TTAppOpenAdActivity.this.FP.FP(i9);
            TTAppOpenAdActivity.this.QR();
        }
    };
    private final Runnable WNy = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (TTAppOpenAdActivity.this.tG.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.FP != null && TTAppOpenAdActivity.this.FP.Fm() && TTAppOpenAdActivity.this.FP.xg() != null && TTAppOpenAdActivity.this.FP.xg().zp() != null) {
                TTAppOpenAdActivity.this.FP.xg().zp().zp(0L);
            }
            TTAppOpenAdActivity.this.dQp = new QR();
            TTAppOpenAdActivity.this.dQp.zp(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.rV.jU();
            if (TTAppOpenAdActivity.this.dT != null) {
                TTAppOpenAdActivity.this.dT.lMd();
            }
            TTAppOpenAdActivity.this.woN();
            View findViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (findViewById != null) {
                try {
                    jSONObject.put("width", findViewById.getWidth());
                    jSONObject.put("height", findViewById.getHeight());
                    jSONObject.put("alpha", findViewById.getAlpha());
                } catch (JSONException e4) {
                    Log.e("TTAppOpenAdActivity", "run: ", e4);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.RCv);
            if (TTAppOpenAdActivity.this.vwr) {
                str = "video_normal_ad";
            } else {
                str = "image_normal_ad";
            }
            jSONObject2.put("openad_creative_type", str);
            if (com.bytedance.sdk.openadsdk.component.view.zp.KS() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.irS || TTAppOpenAdActivity.this.FP.zR()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.dQp());
                TTAppOpenAdActivity.this.zp(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.FP.hG() ? 1 : 0);
            com.bytedance.sdk.openadsdk.lMd.KS.zp(TTAppOpenAdActivity.this.FP, "open_ad", jSONObject2);
            COT.zp(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.FP, TTAppOpenAdActivity.this.dQp());
            TTAppOpenAdActivity.this.tG.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WNy.zp((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i9) {
                if (i9 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                WNy.zp((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e4) {
                        tG.zp("TTAppOpenAdActivity", e4.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (KVG.jU().cz(String.valueOf(this.pvr)) == 1) {
            if (this.YW.lMd() >= KVG.jU().FP(String.valueOf(this.pvr)) * 1000) {
                cz();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KVG.zp(getApplicationContext());
        if (!lMd(bundle)) {
            finish();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.tG.COT()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.lMd.KS.KS(this.FP, "open_ad", null);
        }
        this.vwr = woN.COT(this.FP);
        new StringBuilder("onCreate: isVideo is ").append(this.vwr);
        if (this.vwr) {
            this.YW.zp((float) this.FP.eWG().HWF());
        } else {
            this.YW.zp(KVG.jU().ot(String.valueOf(this.pvr)));
        }
        com.bytedance.sdk.openadsdk.component.HWF.lMd lmd = new com.bytedance.sdk.openadsdk.component.HWF.lMd(this.YW);
        this.dT = lmd;
        lmd.zp(this.YhE);
        QR();
        FrameLayout frameLayout = new FrameLayout(this);
        this.Gzh = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.Gzh);
            this.Gzh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z8;
                    try {
                        int yRU = TTAppOpenAdActivity.this.FP.yRU();
                        TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                        if (tTAppOpenAdActivity.FP != null && TTAppOpenAdActivity.this.FP.cz() == 2 && (yRU == 3 || yRU == 7)) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        tTAppOpenAdActivity.irS = z8;
                        if (TTAppOpenAdActivity.this.irS) {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity2.QUv = new com.bytedance.sdk.openadsdk.component.lMd(tTAppOpenAdActivity2, tTAppOpenAdActivity2.FP, TTAppOpenAdActivity.this.Gzh, TTAppOpenAdActivity.this.YhE, TTAppOpenAdActivity.this.Lij, TTAppOpenAdActivity.this.vwr, TTAppOpenAdActivity.this.YW);
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity3.QUv = new KS(tTAppOpenAdActivity3, tTAppOpenAdActivity3.FP, TTAppOpenAdActivity.this.Gzh, TTAppOpenAdActivity.this.YhE, TTAppOpenAdActivity.this.Lij, TTAppOpenAdActivity.this.vwr, TTAppOpenAdActivity.this.YW);
                            TTAppOpenAdActivity.this.QUv.zp(TTAppOpenAdActivity.this.woN, TTAppOpenAdActivity.this.KVG);
                        }
                        TTAppOpenAdActivity.this.QUv.zp((ViewGroup) TTAppOpenAdActivity.this.Gzh);
                        TTAppOpenAdActivity.this.QUv.zp();
                        TTAppOpenAdActivity.this.QUv.lMd();
                    } catch (Throwable th) {
                        TTAppOpenAdActivity.this.finish();
                        tG.zp("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
        } catch (Throwable unused) {
            com.bytedance.sdk.openadsdk.lMd.KS.lMd();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.lMd.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.HWF.lMd lmd = this.dT;
        if (lmd != null) {
            lmd.COT();
        }
        COT.zp(this.FP);
        if (this.vwr) {
            com.bytedance.sdk.openadsdk.component.jU.zp.zp(this.FP, this.YW.lMd(), this.YW.zp(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.jU.zp.zp(this.FP, -1L, this.YW.zp(), false);
        }
        if (this.rV.COT() && this.tG.get()) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(String.valueOf(this.rV.KS()), this.FP, "open_ad", this.dQp);
            this.rV = cW.lMd();
        }
        KS ks = this.QUv;
        if (ks != null) {
            ks.KS();
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp("recycleRes");
        }
        ku = null;
        this.yRU = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.Bj;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback(null);
        }
        if (dQp.etV().RCv(String.valueOf(this.pvr)) == 1) {
            HWF.zp(KVG.zp()).zp(this.cW);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.COT = false;
        KS();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        KS ks;
        super.onResume();
        this.COT = true;
        if (this.zp.getAndSet(true)) {
            if (this.ox.get()) {
                pvr();
                if (this.vwr && (ks = this.QUv) != null && ks.COT() != null) {
                    this.QUv.COT().zp(3);
                }
                finish();
                return;
            }
            lMd();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            woN won = this.FP;
            if (won != null) {
                str = won.Eg().toString();
            } else {
                str = null;
            }
            bundle.putString("material_meta", str);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.cz);
            bundle.putInt("ad_source", this.RCv);
            bundle.putLong("start_show_time", this.HWF);
        } catch (Throwable th) {
            tG.zp("TTAppOpenAdActivity", th.getMessage());
        }
        ku = this.yRU;
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.KS.zp(this, this.FP);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z8) {
        int i9;
        super.onWindowFocusChanged(z8);
        if (z8) {
            if (!this.irS) {
                this.rV.jU();
            }
            woN won = this.FP;
            if (won != null && won.IhO() && !this.FP.Oza()) {
                this.FP.QR(true);
                woN won2 = this.FP;
                com.bytedance.sdk.openadsdk.lMd.KS.zp(won2, "open_ad", won2.ITK());
            }
        } else if (this.tG.get()) {
            if (this.rV.COT()) {
                com.bytedance.sdk.openadsdk.lMd.KS.zp(String.valueOf(this.rV.KS()), this.FP, "open_ad", this.dQp);
            }
            this.rV = cW.lMd();
        }
        woN won3 = this.FP;
        if (z8) {
            i9 = 4;
        } else {
            i9 = 8;
        }
        COT.zp(won3, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bj() {
        if (!this.vwr || this.FP.hG()) {
            return;
        }
        this.lMd.sendEmptyMessageDelayed(100, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HWF() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        this.dT.lMd(KVG.jU().FP(String.valueOf(this.pvr)));
        this.dT.zp(this.YW.zp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KVG() {
        if (this.tG.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.WNy);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void QR() {
        if (26 == Build.VERSION.SDK_INT) {
            if (getResources().getConfiguration().orientation == 1) {
                this.Lij = 1;
            } else {
                this.Lij = 2;
            }
        } else {
            this.Lij = this.FP.bX();
        }
        ku();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void YW() {
        if (this.Lij == 2) {
            if (COT()) {
                setRequestedOrientation(8);
            } else {
                setRequestedOrientation(0);
            }
        } else {
            setRequestedOrientation(1);
        }
        if (this.Lij == 2 || !WNy.KS((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cz() {
        KS ks;
        pvr.KS(this.pvr);
        pvr();
        if (this.vwr && (ks = this.QUv) != null && ks.COT() != null) {
            this.QUv.COT().zp(4);
        }
        com.bytedance.sdk.openadsdk.component.jU.zp.zp(this.FP, (int) this.YW.lMd(), this.dT.zp(), this.YW.zp());
        woN won = this.FP;
        if (won != null && won.Fm() && this.FP.xg() != null && this.FP.xg().zp() != null) {
            jU zp = this.FP.xg().zp();
            KS ks2 = this.QUv;
            long QR = (ks2 == null || ks2.COT() == null) ? 0L : this.QUv.COT().QR();
            zp.HWF(QR);
            zp.COT(QR);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int dQp() {
        if (this.FP.zR()) {
            return 5;
        }
        if (this.irS) {
            return this.QUv.jU();
        }
        return -1;
    }

    private void dT() {
        if (this.Bj == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this, this.FP);
            this.Bj = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                public void lMd(View view) {
                    TTAppOpenAdActivity.this.KS.set(false);
                    TTAppOpenAdActivity.this.lMd();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                public void zp(View view) {
                    TTAppOpenAdActivity.this.KS.set(true);
                    TTAppOpenAdActivity.this.KS();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                public void zp(int i9, FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.jU.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.jU.set(true);
                    TTAppOpenAdActivity.this.rV();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.Bj);
        if (this.vDp == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.vDp = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    private void ku() {
        int min;
        int max;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.Lij);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 != 26) {
            if (i9 == 27) {
                try {
                    YW();
                } catch (Throwable th) {
                    tG.zp("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                YW();
            }
        }
        Pair<Integer, Integer> ku2 = WNy.ku(getApplicationContext());
        if (this.Lij == 2) {
            min = Math.max(((Integer) ku2.first).intValue(), ((Integer) ku2.second).intValue());
            max = Math.min(((Integer) ku2.first).intValue(), ((Integer) ku2.second).intValue());
        } else {
            min = Math.min(((Integer) ku2.first).intValue(), ((Integer) ku2.second).intValue());
            max = Math.max(((Integer) ku2.first).intValue(), ((Integer) ku2.second).intValue());
        }
        this.KVG = max;
        this.woN = min;
        float zp = WNy.zp();
        if (WNy.KS((Activity) this)) {
            int i10 = this.Lij;
            if (i10 == 1) {
                this.KVG -= zp;
            } else if (i10 == 2) {
                this.woN -= zp;
            }
        }
        KS ks = this.QUv;
        if (ks != null) {
            ks.zp(this.woN, this.KVG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvr() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp("onAdSkip");
            return;
        }
        lMd lmd = this.yRU;
        if (lmd != null) {
            lmd.lMd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rV() {
        this.vDp.zp(TTAdDislikeToast.getDislikeSendTip());
    }

    private void tG() {
        this.vDp.zp(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vDp() {
        if (!this.vwr || this.FP.hG()) {
            return;
        }
        this.lMd.removeMessages(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vwr() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp("onAdClicked");
        } else {
            lMd lmd = this.yRU;
            if (lmd != null) {
                lmd.onAdClicked();
            }
        }
        if (dQp.etV().ox(String.valueOf(this.pvr))) {
            this.ox.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void woN() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp("onAdShow");
            return;
        }
        lMd lmd = this.yRU;
        if (lmd != null) {
            lmd.zp();
        }
    }

    public boolean COT() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e4) {
            tG.zp("TTAppOpenAdActivity", e4.getMessage());
            return false;
        }
    }

    public void KS() {
        if (this.vwr) {
            KS ks = this.QUv;
            if (ks != null && ks.COT() != null && this.QUv.COT().lMd()) {
                this.QUv.COT().jU();
            }
            vDp();
        }
        com.bytedance.sdk.openadsdk.component.HWF.lMd lmd = this.dT;
        if (lmd != null) {
            lmd.jU();
        }
    }

    public IListenerManager jU() {
        if (this.ot == null) {
            this.ot = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp().zp(7));
        }
        return this.ot;
    }

    public void lMd() {
        if (this.KS.get()) {
            return;
        }
        if (this.vwr) {
            KS ks = this.QUv;
            if (ks != null && ks.COT() != null && this.QUv.COT().KS()) {
                this.QUv.COT().COT();
            }
            Bj();
        }
        com.bytedance.sdk.openadsdk.component.HWF.lMd lmd = this.dT;
        if (lmd != null) {
            lmd.KS();
        }
    }

    public void zp() {
        if (isFinishing()) {
            return;
        }
        if (this.jU.get()) {
            tG();
            return;
        }
        if (this.Bj == null) {
            try {
                dT();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.Bj;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.zp();
        }
    }

    private boolean lMd(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.FP = com.bytedance.sdk.openadsdk.core.lMd.zp(new JSONObject(stringExtra));
                    } catch (Exception e4) {
                        tG.zp("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e4);
                    }
                }
                this.cz = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.FP = cz.zp().lMd();
            this.yRU = cz.zp().COT();
            cz.zp().HWF();
        }
        zp(getIntent());
        zp(bundle);
        woN won = this.FP;
        if (won == null) {
            finish();
            return false;
        }
        this.cW = won.QUv();
        this.FP.zp(this.HWF);
        this.pvr = this.FP.FGx();
        com.bytedance.sdk.openadsdk.utils.lMd.zp(this.FP);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject zp(JSONObject jSONObject) {
        if (dQp() == 0) {
            return this.QUv.zp(jSONObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final String str) {
        QUv.KS(new ku("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.jU().executeAppOpenAdCallback(TTAppOpenAdActivity.this.cz, str);
                } catch (Throwable th) {
                    tG.zp("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void zp(Intent intent) {
        if (intent != null) {
            this.RCv = intent.getIntExtra("ad_source", 0);
            this.HWF = intent.getLongExtra("start_show_time", 0L);
        }
    }

    public void zp(Bundle bundle) {
        if (bundle != null) {
            if (this.yRU == null) {
                this.yRU = ku;
                ku = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.cz = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.RCv = bundle.getInt("ad_source", 0);
                this.HWF = bundle.getLong("start_show_time", 0L);
                this.FP = com.bytedance.sdk.openadsdk.core.lMd.zp(new JSONObject(string));
            } catch (Throwable th) {
                tG.zp("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        KS ks;
        if (message.what == 100) {
            if (this.vwr && (ks = this.QUv) != null && ks.COT() != null) {
                this.QUv.COT().zp(1);
            }
            pvr();
            finish();
        }
    }
}
