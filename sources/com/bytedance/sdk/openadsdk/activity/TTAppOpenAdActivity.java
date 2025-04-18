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
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.pDU;
import com.bytedance.sdk.openadsdk.component.NjR.qsH;
import com.bytedance.sdk.openadsdk.core.VOe;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.zB;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements bZ.YFl {
    private static com.bytedance.sdk.openadsdk.YFl.AlY.Sg qsH;
    private com.bytedance.sdk.openadsdk.component.tN Cfr;
    private DSW EH;
    private FrameLayout Ga;
    private IListenerManager Ne;
    private int UZM;
    private com.bytedance.sdk.openadsdk.YFl.AlY.Sg VOe;
    private boolean Wwa;
    private int YI;
    private TTAdDislikeToast YoT;
    private String aIu;
    private boolean dXO;
    private pDU eT;
    private AdSlot hQ;
    private float lG;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.vc.Sg f10535nc;
    private int qO;
    private float rkt;
    private Wwa wXo;
    protected final AtomicBoolean YFl = new AtomicBoolean(false);
    protected final bZ Sg = new bZ(Looper.getMainLooper(), this);
    final AtomicBoolean tN = new AtomicBoolean(false);
    final AtomicBoolean AlY = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.qsH.YFl NjR = new com.bytedance.sdk.openadsdk.component.qsH.YFl();
    protected boolean wN = false;
    private final AtomicBoolean GA = new AtomicBoolean(false);
    private zB pDU = zB.Sg();
    private final AtomicBoolean bZ = new AtomicBoolean(false);

    /* renamed from: vc, reason: collision with root package name */
    long f10536vc = 0;
    private volatile boolean pq = false;
    private final com.bytedance.sdk.openadsdk.component.YFl mn = new com.bytedance.sdk.openadsdk.component.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.YFl
        public void AlY() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl, l5.e
        public void Sg(long j3, int i10) {
            StringBuilder sb2 = new StringBuilder("onError() called with: totalPlayTime = [");
            sb2.append(j3);
            sb2.append("], percent = [");
            sb2.append(i10);
            sb2.append("]");
            TTAppOpenAdActivity.this.qO();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl, l5.e
        public void YFl() {
            TTAppOpenAdActivity.this.qO();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl
        public void tN() {
            TTAppOpenAdActivity.this.vc();
            TTAppOpenAdActivity.this.pDU.AlY();
            TTAppOpenAdActivity.this.rkt();
            if (TTAppOpenAdActivity.this.Wwa) {
                TTAppOpenAdActivity.this.eT();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl
        public void wN() {
            TTAppOpenAdActivity.this.Wwa();
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl, l5.e
        public void YFl(long j3, long j10) {
            TTAppOpenAdActivity.this.NjR.YFl(j3);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.wN && tTAppOpenAdActivity.Cfr != null && TTAppOpenAdActivity.this.Cfr.wN() != null && TTAppOpenAdActivity.this.Cfr.wN().Sg()) {
                TTAppOpenAdActivity.this.Cfr.wN().AlY();
            }
            TTAppOpenAdActivity.this.YoT();
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl, com.bytedance.sdk.openadsdk.component.vc.YFl
        public void Sg(View view) {
            TTAppOpenAdActivity.this.YFl();
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl, com.bytedance.sdk.openadsdk.component.vc.YFl
        public void Sg() {
            TTAppOpenAdActivity.this.pq = true;
            if (com.bytedance.sdk.openadsdk.aIu.YFl.YFl("splash_auto_close_switch", 0) == 0) {
                if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                    if (TTAppOpenAdActivity.this.VOe != null) {
                        TTAppOpenAdActivity.this.VOe.tN();
                    }
                } else {
                    TTAppOpenAdActivity.this.YFl("onAdTimeOver");
                }
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl, com.bytedance.sdk.openadsdk.component.vc.YFl
        public void YFl(View view) {
            TTAppOpenAdActivity.this.aIu();
        }

        @Override // com.bytedance.sdk.openadsdk.component.YFl, com.bytedance.sdk.openadsdk.component.vc.YFl
        public void YFl(int i10, int i11, boolean z10) {
            if (TTAppOpenAdActivity.this.Cfr != null) {
                TTAppOpenAdActivity.this.Cfr.YFl(i10, i11, z10 || i10 == 0);
            }
        }
    };
    private final Runnable zB = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            String str;
            int i10;
            if (TTAppOpenAdActivity.this.GA.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.wXo != null && TTAppOpenAdActivity.this.wXo.yn() && TTAppOpenAdActivity.this.wXo.Af() != null && TTAppOpenAdActivity.this.wXo.Af().YFl() != null) {
                TTAppOpenAdActivity.this.wXo.Af().YFl().YFl(0L);
            }
            TTAppOpenAdActivity.this.EH = new DSW();
            TTAppOpenAdActivity.this.EH.YFl(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.pDU.AlY();
            if (TTAppOpenAdActivity.this.f10535nc != null) {
                TTAppOpenAdActivity.this.f10535nc.Sg();
            }
            TTAppOpenAdActivity.this.lG();
            View findViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (findViewById != null) {
                try {
                    jSONObject.put("width", findViewById.getWidth());
                    jSONObject.put("height", findViewById.getHeight());
                    jSONObject.put("alpha", findViewById.getAlpha());
                } catch (JSONException e2) {
                    Log.e("TTAppOpenAdActivity", "run: ", e2);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.UZM);
            if (TTAppOpenAdActivity.this.Wwa) {
                str = "video_normal_ad";
            } else {
                str = "image_normal_ad";
            }
            jSONObject2.put("openad_creative_type", str);
            if (qsH.tN() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.dXO || TTAppOpenAdActivity.this.wXo.ZS()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.EH());
                TTAppOpenAdActivity.this.YFl(jSONObject2);
            }
            if (TTAppOpenAdActivity.this.wXo.Zu()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            jSONObject2.put("is_icon_only", i10);
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(TTAppOpenAdActivity.this.wXo, "open_ad", jSONObject2);
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.wXo, new wN.YFl(TTAppOpenAdActivity.this.EH()));
            TTAppOpenAdActivity.this.GA.set(true);
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
        GS.YFl((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                GS.YFl((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e2) {
                        YoT.YFl("TTAppOpenAdActivity", e2.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (lG.AlY().wXo(String.valueOf(this.qO)) == 1) {
            if (this.NjR.Sg() >= lG.AlY().Ne(String.valueOf(this.qO)) * 1000) {
                aIu();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lG.Sg(getApplicationContext());
        if (!Sg(bundle)) {
            finish();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.pDU.wN()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.AlY.tN.wN(this.wXo, "open_ad", (JSONObject) null);
        }
        this.Wwa = Wwa.wN(this.wXo);
        new StringBuilder("onCreate: isVideo is ").append(this.Wwa);
        if (this.Wwa) {
            this.NjR.YFl((float) this.wXo.BPI().f23459d);
        } else {
            this.NjR.YFl(lG.AlY().VOe(String.valueOf(this.qO)));
        }
        com.bytedance.sdk.openadsdk.component.vc.Sg sg2 = new com.bytedance.sdk.openadsdk.component.vc.Sg(this.NjR);
        this.f10535nc = sg2;
        sg2.YFl(this.mn);
        DSW();
        FrameLayout frameLayout = new FrameLayout(this);
        this.Ga = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.Ga);
            this.Ga.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z10;
                    try {
                        int UZM = TTAppOpenAdActivity.this.wXo.UZM();
                        TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                        if (tTAppOpenAdActivity.wXo != null && TTAppOpenAdActivity.this.wXo.Ne() == 2 && (UZM == 3 || UZM == 7 || UZM == 10)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        tTAppOpenAdActivity.dXO = z10;
                        if (TTAppOpenAdActivity.this.dXO) {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity2.Cfr = new com.bytedance.sdk.openadsdk.component.Sg(tTAppOpenAdActivity2, tTAppOpenAdActivity2.wXo, TTAppOpenAdActivity.this.Ga, TTAppOpenAdActivity.this.mn, TTAppOpenAdActivity.this.YI, TTAppOpenAdActivity.this.Wwa, TTAppOpenAdActivity.this.NjR);
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity3.Cfr = new com.bytedance.sdk.openadsdk.component.tN(tTAppOpenAdActivity3, tTAppOpenAdActivity3.wXo, TTAppOpenAdActivity.this.Ga, TTAppOpenAdActivity.this.mn, TTAppOpenAdActivity.this.YI, TTAppOpenAdActivity.this.Wwa, TTAppOpenAdActivity.this.NjR);
                            TTAppOpenAdActivity.this.Cfr.YFl(TTAppOpenAdActivity.this.lG, TTAppOpenAdActivity.this.rkt);
                        }
                        TTAppOpenAdActivity.this.Cfr.YFl((ViewGroup) TTAppOpenAdActivity.this.Ga);
                        TTAppOpenAdActivity.this.Cfr.YFl();
                        TTAppOpenAdActivity.this.Cfr.Sg();
                    } catch (Throwable th2) {
                        TTAppOpenAdActivity.this.finish();
                        YoT.YFl("TTAppOpenAdActivity", th2.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                        /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
                        
                            r0 = r5.getBoundingRects();
                         */
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public android.view.WindowInsets onApplyWindowInsets(android.view.View r5, android.view.WindowInsets r6) {
                            /*
                                r4 = this;
                                android.view.DisplayCutout r5 = n0.w0.h(r6)     // Catch: java.lang.Throwable -> L27
                                if (r5 == 0) goto L27
                                java.util.List r0 = l0.d.j(r5)     // Catch: java.lang.Throwable -> L27
                                if (r0 == 0) goto L27
                                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L27
                                if (r0 != 0) goto L27
                                android.view.View r0 = r2     // Catch: java.lang.Throwable -> L27
                                int r1 = l0.d.z(r5)     // Catch: java.lang.Throwable -> L27
                                int r2 = l0.d.C(r5)     // Catch: java.lang.Throwable -> L27
                                int r3 = l0.d.D(r5)     // Catch: java.lang.Throwable -> L27
                                int r5 = l0.d.w(r5)     // Catch: java.lang.Throwable -> L27
                                r0.setPadding(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L27
                            L27:
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.AnonymousClass3.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.pDU.tN.Sg();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.wXo != null) {
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("videoForceBreak", this.wXo);
        }
        this.Sg.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.vc.Sg sg2 = this.f10535nc;
        if (sg2 != null) {
            sg2.wN();
        }
        com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(this.wXo);
        if (this.Wwa) {
            com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(this.wXo, this.NjR.Sg(), this.NjR.YFl(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(this.wXo, -1L, this.NjR.YFl(), false);
        }
        if (this.pDU.wN() && this.GA.get()) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(String.valueOf(this.pDU.tN()), this.wXo, "open_ad", this.EH);
            this.pDU = zB.Sg();
        }
        com.bytedance.sdk.openadsdk.component.tN tNVar = this.Cfr;
        if (tNVar != null) {
            tNVar.tN();
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("recycleRes");
        }
        qsH = null;
        this.VOe = null;
        pDU pdu = this.eT;
        if (pdu != null) {
            pdu.setCallback(null);
        }
        if (rkt.JwO().UZM(String.valueOf(this.qO)) == 1 && !Wwa.vc(this.wXo)) {
            com.bytedance.sdk.openadsdk.component.vc.YFl(lG.YFl()).YFl(this.hQ);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.wN = false;
        tN();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.tN tNVar;
        super.onResume();
        this.wN = true;
        if (this.YFl.getAndSet(true)) {
            if (this.bZ.get()) {
                qO();
                if (this.Wwa && (tNVar = this.Cfr) != null && tNVar.wN() != null) {
                    this.Cfr.wN().YFl(3);
                }
                finish();
                return;
            }
            Sg();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            Wwa wwa = this.wXo;
            if (wwa != null) {
                str = wwa.ni().toString();
            } else {
                str = null;
            }
            bundle.putString("material_meta", str);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.aIu);
            bundle.putInt("ad_source", this.UZM);
            bundle.putLong("start_show_time", this.f10536vc);
        } catch (Throwable th2) {
            YoT.YFl("TTAppOpenAdActivity", th2.getMessage());
        }
        qsH = this.VOe;
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.tN.YFl(this, this.wXo);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        int i10;
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (!this.dXO) {
                this.pDU.AlY();
            }
            Wwa wwa = this.wXo;
            if (wwa != null && wwa.xSx() && !this.wXo.VRF()) {
                this.wXo.DSW(true);
                Wwa wwa2 = this.wXo;
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa2, "open_ad", wwa2.EQ());
            }
        } else if (this.GA.get()) {
            if (this.pDU.wN()) {
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(String.valueOf(this.pDU.tN()), this.wXo, "open_ad", this.EH);
            }
            this.pDU = zB.Sg();
        }
        Wwa wwa3 = this.wXo;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 8;
        }
        com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(wwa3, i10);
    }

    private void DSW() {
        if (26 == Build.VERSION.SDK_INT) {
            if (getResources().getConfiguration().orientation == 1) {
                this.YI = 1;
            } else {
                this.YI = 2;
            }
        } else {
            this.YI = this.wXo.SVa();
        }
        qsH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int EH() {
        if (this.wXo.ZS()) {
            return 5;
        }
        if (this.dXO) {
            return this.Cfr.AlY();
        }
        return -1;
    }

    private void GA() {
        this.YoT.show(TTAdDislikeToast.getDislikeTip());
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void NjR() {
        if (this.YI == 2) {
            if (wN()) {
                setRequestedOrientation(8);
            } else {
                setRequestedOrientation(0);
            }
        } else {
            setRequestedOrientation(1);
        }
        if (this.YI == 2 || !GS.tN((Activity) this)) {
            getWindow().addFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wwa() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdClicked");
        } else {
            com.bytedance.sdk.openadsdk.YFl.AlY.Sg sg2 = this.VOe;
            if (sg2 != null) {
                sg2.onAdClicked();
            }
        }
        if (rkt.JwO().bZ(String.valueOf(this.qO))) {
            this.bZ.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YoT() {
        if (!this.Wwa || this.wXo.Zu()) {
            return;
        }
        this.Sg.removeMessages(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aIu() {
        com.bytedance.sdk.openadsdk.component.tN tNVar;
        VOe.tN(this.qO);
        qO();
        if (this.Wwa && (tNVar = this.Cfr) != null && tNVar.wN() != null) {
            this.Cfr.wN().YFl(4);
        }
        com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(this.wXo, (int) this.NjR.Sg(), this.f10535nc.YFl(), this.NjR.YFl());
        Wwa wwa = this.wXo;
        if (wwa != null && wwa.yn() && this.wXo.Af() != null && this.wXo.Af().YFl() != null) {
            com.bytedance.sdk.openadsdk.core.YoT.AlY YFl = this.wXo.Af().YFl();
            com.bytedance.sdk.openadsdk.component.tN tNVar2 = this.Cfr;
            long DSW = (tNVar2 == null || tNVar2.wN() == null) ? 0L : this.Cfr.wN().DSW();
            YFl.vc(DSW);
            YFl.wN(DSW);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eT() {
        if (!this.Wwa || this.wXo.Zu() || this.pq) {
            return;
        }
        this.Sg.sendEmptyMessageDelayed(100, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lG() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.YFl.AlY.Sg sg2 = this.VOe;
        if (sg2 != null) {
            sg2.YFl();
        }
    }

    private void nc() {
        if (this.eT == null) {
            pDU pdu = new pDU(this, this.wXo);
            this.eT = pdu;
            pdu.setDislikeSource("video_player");
            this.eT.setCallback(new pDU.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                public void Sg(View view) {
                    TTAppOpenAdActivity.this.tN.set(false);
                    TTAppOpenAdActivity.this.Sg();
                }

                @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                public void YFl(View view) {
                    TTAppOpenAdActivity.this.tN.set(true);
                    TTAppOpenAdActivity.this.tN();
                }

                @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                public void YFl(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.AlY.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.AlY.set(true);
                    TTAppOpenAdActivity.this.pDU();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.eT);
        if (this.YoT == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.YoT = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pDU() {
        this.YoT.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qO() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.YFl.AlY.Sg sg2 = this.VOe;
        if (sg2 != null) {
            sg2.Sg();
        }
    }

    private void qsH() {
        int min;
        int max;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.YI);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
            if (i10 == 27) {
                try {
                    NjR();
                } catch (Throwable th2) {
                    YoT.YFl("TTAppOpenAdActivity", th2.getMessage());
                    return;
                }
            } else {
                NjR();
            }
        }
        Pair<Integer, Integer> qsH2 = GS.qsH(getApplicationContext());
        if (this.YI == 2) {
            min = Math.max(((Integer) qsH2.first).intValue(), ((Integer) qsH2.second).intValue());
            max = Math.min(((Integer) qsH2.first).intValue(), ((Integer) qsH2.second).intValue());
        } else {
            min = Math.min(((Integer) qsH2.first).intValue(), ((Integer) qsH2.second).intValue());
            max = Math.max(((Integer) qsH2.first).intValue(), ((Integer) qsH2.second).intValue());
        }
        this.rkt = max;
        this.lG = min;
        float YFl = GS.YFl();
        if (GS.tN((Activity) this)) {
            int i11 = this.YI;
            if (i11 == 1) {
                this.rkt -= YFl;
            } else if (i11 == 2) {
                this.lG -= YFl;
            }
        }
        com.bytedance.sdk.openadsdk.component.tN tNVar = this.Cfr;
        if (tNVar != null) {
            tNVar.YFl(this.lG, this.rkt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rkt() {
        if (this.GA.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.zB);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vc() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        this.f10535nc.Sg(lG.AlY().Ne(String.valueOf(this.qO)));
        this.f10535nc.YFl(this.NjR.YFl());
    }

    public IListenerManager AlY() {
        if (this.Ne == null) {
            this.Ne = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl().YFl(7));
        }
        return this.Ne;
    }

    public void tN() {
        if (this.Wwa) {
            com.bytedance.sdk.openadsdk.component.tN tNVar = this.Cfr;
            if (tNVar != null && tNVar.wN() != null && this.Cfr.wN().Sg()) {
                this.Cfr.wN().AlY();
            }
            YoT();
        }
        com.bytedance.sdk.openadsdk.component.vc.Sg sg2 = this.f10535nc;
        if (sg2 != null) {
            sg2.AlY();
        }
    }

    public boolean wN() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e2) {
            YoT.YFl("TTAppOpenAdActivity", e2.getMessage());
            return false;
        }
    }

    public void Sg() {
        if (this.tN.get()) {
            return;
        }
        if (this.Wwa) {
            com.bytedance.sdk.openadsdk.component.tN tNVar = this.Cfr;
            if (tNVar != null && tNVar.wN() != null && this.Cfr.wN().tN()) {
                this.Cfr.wN().wN();
            }
            eT();
        }
        com.bytedance.sdk.openadsdk.component.vc.Sg sg2 = this.f10535nc;
        if (sg2 != null) {
            sg2.tN();
        }
    }

    public void YFl() {
        if (isFinishing()) {
            return;
        }
        if (this.AlY.get()) {
            GA();
            return;
        }
        if (this.eT == null) {
            try {
                nc();
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th2);
            }
        }
        pDU pdu = this.eT;
        if (pdu != null) {
            pdu.YFl();
        }
    }

    private boolean Sg(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.wXo = com.bytedance.sdk.openadsdk.core.Sg.YFl(new JSONObject(stringExtra));
                    } catch (Exception e2) {
                        YoT.YFl("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e2);
                    }
                }
                this.aIu = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.wXo = com.bytedance.sdk.openadsdk.core.bZ.YFl().Sg();
            this.VOe = com.bytedance.sdk.openadsdk.core.bZ.YFl().wN();
            com.bytedance.sdk.openadsdk.core.bZ.YFl().vc();
        }
        YFl(getIntent());
        YFl(bundle);
        Wwa wwa = this.wXo;
        if (wwa == null) {
            finish();
            return false;
        }
        this.hQ = wwa.pq();
        this.wXo.YFl(this.f10536vc);
        this.qO = this.wXo.kU();
        com.bytedance.sdk.openadsdk.utils.Sg.YFl(this.wXo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject YFl(JSONObject jSONObject) {
        if (EH() == 0) {
            return this.Cfr.YFl(jSONObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final String str) {
        mn.tN(new com.bytedance.sdk.component.qsH.qsH("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.AlY().executeAppOpenAdCallback(TTAppOpenAdActivity.this.aIu, str);
                } catch (Throwable th2) {
                    YoT.YFl("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void YFl(Intent intent) {
        if (intent != null) {
            this.UZM = intent.getIntExtra("ad_source", 0);
            this.f10536vc = intent.getLongExtra("start_show_time", 0L);
        }
    }

    public void YFl(Bundle bundle) {
        if (bundle != null) {
            if (this.VOe == null) {
                this.VOe = qsH;
                qsH = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.aIu = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.UZM = bundle.getInt("ad_source", 0);
                this.f10536vc = bundle.getLong("start_show_time", 0L);
                this.wXo = com.bytedance.sdk.openadsdk.core.Sg.YFl(new JSONObject(string));
            } catch (Throwable th2) {
                YoT.YFl("TTAppOpenAdActivity", th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        com.bytedance.sdk.openadsdk.component.tN tNVar;
        if (message.what == 100) {
            if (this.Wwa && (tNVar = this.Cfr) != null && tNVar.wN() != null) {
                this.Cfr.wN().YFl(1);
            }
            qO();
            finish();
        }
    }
}
