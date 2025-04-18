package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.AlY.eT;
import com.bytedance.sdk.openadsdk.AlY.nc;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW;
import com.bytedance.sdk.openadsdk.common.GA;
import com.bytedance.sdk.openadsdk.common.NjR;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.pDU;
import com.bytedance.sdk.openadsdk.core.bZ;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.YFl.vc;
import com.bytedance.sdk.openadsdk.core.zB;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.qsH;
import com.bytedance.sdk.openadsdk.utils.rkt;
import com.bytedance.sdk.openadsdk.utils.vc;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTLandingPageActivity extends TTBaseActivity {
    private String EH;
    private com.bytedance.sdk.openadsdk.core.wN.vc GA;
    private com.bytedance.sdk.openadsdk.core.widget.YFl.wN GS;
    private int Ga;
    private TextView NjR;
    private com.bytedance.sdk.openadsdk.common.tN Sco;
    pDU Sg;
    private String VOe;
    private String Wwa;
    eT YFl;
    private Button YoT;
    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc aIu;
    private ILoader bZ;
    private int dXO;
    private GA eT;
    private com.bytedance.sdk.openadsdk.common.eT hQ;
    private int lG;
    private com.bytedance.sdk.openadsdk.utils.eT mn;

    /* renamed from: nc, reason: collision with root package name */
    private Context f10539nc;
    private String pDU;
    private boolean pq;
    private Wwa qO;
    private ImageView qsH;
    private hQ rkt;
    TTAdDislikeToast tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.NjR.AlY f10540vc;
    private String wXo;
    private vc.YFl zB;
    private final AtomicBoolean Ne = new AtomicBoolean(true);
    private final AtomicInteger UZM = new AtomicInteger(0);
    private final AtomicInteger YI = new AtomicInteger(0);
    private final AtomicInteger Cfr = new AtomicInteger(0);
    final AtomicBoolean AlY = new AtomicBoolean(false);
    final AtomicBoolean wN = new AtomicBoolean(false);
    private String lu = "ダウンロード";

    /* loaded from: classes.dex */
    public static class Sg implements View.OnScrollChangeListener {
        private final WeakReference<eT> YFl;

        public Sg(eT eTVar) {
            this.YFl = new WeakReference<>(eTVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
            eT eTVar = this.YFl.get();
            if (eTVar != null) {
                eTVar.Sg(i11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements nc {
        private final WeakReference<TTLandingPageActivity> AlY;
        private final Wwa Sg;
        private final int YFl;
        private final String tN;

        public YFl(int i10, Wwa wwa, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.YFl = i10;
            this.Sg = wwa;
            this.tN = str;
            this.AlY = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.AlY.nc
        public void YFl(int i10) {
            TTLandingPageActivity tTLandingPageActivity = this.AlY.get();
            if (tTLandingPageActivity != null) {
                tN.YFl.YFl(this.YFl, tTLandingPageActivity.YI.get(), tTLandingPageActivity.Cfr.get(), tTLandingPageActivity.UZM.get() - tTLandingPageActivity.Cfr.get(), this.Sg, this.tN, i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class tN implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.common.tN> Sg;
        private final WeakReference<eT> YFl;

        public tN(eT eTVar, com.bytedance.sdk.openadsdk.common.tN tNVar) {
            this.YFl = new WeakReference<>(eTVar);
            this.Sg = new WeakReference<>(tNVar);
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            eT eTVar = this.YFl.get();
            if (eTVar != null) {
                eTVar.YFl(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.tN tNVar = this.Sg.get();
            if (tNVar != null) {
                tNVar.YFl(motionEvent);
                return false;
            }
            return false;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (DSW() && !this.Ne.getAndSet(true)) {
            qsH();
            Sg(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th2) {
                YoT.YFl("TTAD.LandingPageAct", "onBackPressed: ", th2.getMessage());
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tN();
    }

    @Override // android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public void onCreate(@Nullable Bundle bundle) {
        int i10;
        YFl(3);
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.pDU.wN()) {
            finish();
            return;
        }
        try {
            lG.Sg(this);
        } catch (Throwable unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            setContentView(Sg());
            Intent intent = getIntent();
            int intExtra = intent.getIntExtra("sdk_version", 1);
            this.pDU = intent.getStringExtra("adid");
            this.EH = intent.getStringExtra("log_extra");
            this.lG = intent.getIntExtra("source", -1);
            String stringExtra = intent.getStringExtra("url");
            this.wXo = stringExtra;
            Sg(4);
            String stringExtra2 = intent.getStringExtra("web_title");
            this.Wwa = intent.getStringExtra("event_tag");
            this.VOe = intent.getStringExtra("gecko_id");
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.qO = com.bytedance.sdk.openadsdk.core.Sg.YFl(new JSONObject(stringExtra3));
                    } catch (Exception e2) {
                        YoT.YFl("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e2);
                    }
                }
            } else {
                this.qO = bZ.YFl().Sg();
                bZ.YFl().vc();
            }
            if (this.qO == null) {
                finish();
                return;
            }
            wN();
            if (!TextUtils.isEmpty(this.VOe)) {
                this.bZ = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().Sg();
                int YFl2 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.bZ, this.VOe);
                this.Ga = YFl2;
                if (YFl2 > 0) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.dXO = i10;
            }
            this.f10539nc = this;
            if (this.f10540vc != null) {
                com.bytedance.sdk.openadsdk.core.widget.YFl.tN.YFl(this).YFl(false).Sg(false).YFl(this.f10540vc.getWebView());
            }
            com.bytedance.sdk.component.NjR.AlY alY = this.f10540vc;
            if (alY != null && alY.getWebView() != null) {
                eT YFl3 = new eT(this.qO, this.f10540vc.getWebView(), new YFl(this.Ga, this.qO, "landingpage", this), this.dXO).YFl(true);
                this.YFl = YFl3;
                this.zB = YFl3.YFl;
                this.Sco = Sco.YFl(this.qO, this.f10540vc, this.f10539nc, this.Wwa);
            }
            vc();
            this.f10540vc.setLandingPage(true);
            this.f10540vc.setTag("landingpage");
            this.f10540vc.setMaterialMeta(this.qO.JT());
            com.bytedance.sdk.openadsdk.core.widget.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(this.f10539nc, this.rkt, this.pDU, this.Sco, this.YFl, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.GA != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.GA.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.hQ != null) {
                        TTLandingPageActivity.this.hQ.Sg();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.VOe)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.UZM.incrementAndGet();
                        WebResourceResponseModel YFl4 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(TTLandingPageActivity.this.bZ, TTLandingPageActivity.this.VOe, str);
                        if (YFl4 != null && YFl4.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.Cfr.incrementAndGet();
                            return YFl4.getWebResourceResponse();
                        }
                        if (YFl4 != null && YFl4.getMsg() == 2) {
                            TTLandingPageActivity.this.YI.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th2) {
                        YoT.YFl("TTAD.LandingPageAct", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.GS = wNVar;
            wNVar.YFl(this.qO);
            this.f10540vc.setWebViewClient(this.GS);
            com.bytedance.sdk.component.NjR.AlY alY2 = this.f10540vc;
            if (alY2 != null) {
                alY2.setUserAgentString(rkt.YFl(alY2.getWebView(), intExtra));
            }
            com.bytedance.sdk.component.NjR.AlY alY3 = this.f10540vc;
            if (alY3 != null) {
                alY3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.qO, "landingpage", this.dXO);
            com.bytedance.sdk.openadsdk.utils.Wwa.YFl(this.f10540vc, stringExtra);
            this.f10540vc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.rkt, this.YFl, this.Sco) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i11) {
                    super.onProgressChanged(webView, i11);
                    if (TTLandingPageActivity.this.hQ != null) {
                        TTLandingPageActivity.this.hQ.YFl(i11);
                    }
                    if (TTLandingPageActivity.this.GA != null && !TTLandingPageActivity.this.isFinishing()) {
                        if (i11 == 100 && TTLandingPageActivity.this.GA.isShown()) {
                            TTLandingPageActivity.this.GA.setVisibility(8);
                        } else {
                            TTLandingPageActivity.this.GA.setProgress(i11);
                        }
                    }
                }
            });
            if (this.f10540vc.getWebView() != null) {
                this.f10540vc.getWebView().setOnScrollChangeListener(new Sg(this.YFl));
                this.f10540vc.getWebView().setOnTouchListener(new tN(this.YFl, this.Sco));
            }
            this.f10540vc.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j3) {
                    if (TTLandingPageActivity.this.aIu != null) {
                        TTLandingPageActivity.this.aIu.AlY();
                    }
                }
            });
            TextView textView = this.NjR;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = qO.YFl(this, "tt_web_title_default");
                }
                textView.setText(stringExtra2);
            }
            tN();
            com.bytedance.sdk.openadsdk.utils.eT YFl4 = com.bytedance.sdk.openadsdk.utils.vc.YFl(this, new vc.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // com.bytedance.sdk.openadsdk.utils.vc.YFl
                public void Sg() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.vc.YFl
                public View YFl() {
                    return TTLandingPageActivity.this.qsH;
                }
            });
            this.mn = YFl4;
            YFl4.YFl(0L);
            tN.YFl.YFl(SystemClock.elapsedRealtime() - elapsedRealtime, this.qO, "landingpage", this.bZ, this.VOe);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.NjR.AlY alY;
        super.onDestroy();
        eT eTVar = this.YFl;
        if (eTVar != null && (alY = this.f10540vc) != null) {
            eTVar.YFl(alY);
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.NjR.AlY alY2 = this.f10540vc;
        if (alY2 != null) {
            zB.YFl(alY2.getWebView());
        }
        this.f10540vc = null;
        hQ hQVar = this.rkt;
        if (hQVar != null) {
            hQVar.eT();
        }
        eT eTVar2 = this.YFl;
        if (eTVar2 != null) {
            eTVar2.tN(true);
        }
        if (!TextUtils.isEmpty(this.VOe)) {
            tN.YFl.YFl(this.Cfr.get(), this.UZM.get(), this.qO);
        }
        com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.bZ);
        com.bytedance.sdk.openadsdk.utils.eT eTVar3 = this.mn;
        if (eTVar3 != null) {
            eTVar3.tN();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.utils.eT eTVar = this.mn;
        if (eTVar != null) {
            eTVar.Sg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        hQ hQVar = this.rkt;
        if (hQVar != null) {
            hQVar.nc();
        }
        eT eTVar = this.YFl;
        if (eTVar != null) {
            eTVar.DSW();
        }
        if (!this.pq) {
            this.pq = true;
            YFl(4);
        }
        com.bytedance.sdk.openadsdk.utils.eT eTVar2 = this.mn;
        if (eTVar2 != null) {
            eTVar2.YFl();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.tN.YFl(this, this.qO);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        eT eTVar = this.YFl;
        if (eTVar != null) {
            eTVar.qsH();
        }
    }

    private String AlY() {
        Wwa wwa = this.qO;
        if (wwa != null && !TextUtils.isEmpty(wwa.lL())) {
            this.lu = this.qO.lL();
        }
        return this.lu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean DSW() {
        return !TextUtils.isEmpty(this.wXo) && this.wXo.contains("__luban_sdk");
    }

    private void NjR() {
        try {
            if (this.Sg == null) {
                pDU pdu = new pDU(this.f10539nc, this.qO);
                this.Sg = pdu;
                pdu.setDislikeSource("landing_page");
                this.Sg.setCallback(new pDU.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void Sg(View view) {
                        TTLandingPageActivity.this.AlY.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void YFl(View view) {
                        TTLandingPageActivity.this.AlY.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void YFl(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.wN.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.wN.set(true);
                        TTLandingPageActivity.this.eT();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.Sg);
            if (this.tN == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.f10539nc);
                this.tN = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th2);
        }
    }

    private View Sg() {
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(this);
        tNVar.setFitsSystemWindows(true);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(this);
        wNVar.setOrientation(1);
        tNVar.addView(wNVar, new FrameLayout.LayoutParams(-1, -1));
        View ga2 = new GA(this, new GA.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.common.GA.YFl
            public View YFl(Context context) {
                return new NjR(context);
            }
        });
        ga2.setId(com.bytedance.sdk.openadsdk.utils.GA.f10819ib);
        wNVar.addView(ga2, new LinearLayout.LayoutParams(-1, GS.tN(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar2 = new com.bytedance.sdk.openadsdk.core.wN.tN(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        wNVar.addView(tNVar2, layoutParams);
        com.bytedance.sdk.component.NjR.AlY alY = new com.bytedance.sdk.component.NjR.AlY(this);
        alY.setId(com.bytedance.sdk.openadsdk.utils.GA.fIu);
        tNVar2.addView(alY, new FrameLayout.LayoutParams(-1, -1));
        GA ga3 = new GA(this, new GA.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.common.GA.YFl
            public View YFl(Context context) {
                return new com.bytedance.sdk.openadsdk.common.vc(context);
            }
        });
        ga3.setId(com.bytedance.sdk.openadsdk.utils.GA.RX);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        tNVar2.addView(ga3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.vc vcVar = new com.bytedance.sdk.openadsdk.core.wN.vc(this, null, R.style.Widget.ProgressBar.Horizontal);
        vcVar.setId(com.bytedance.sdk.openadsdk.utils.GA.lL);
        vcVar.setProgress(1);
        vcVar.setVisibility(8);
        vcVar.setProgressDrawable(qsH.YFl(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, GS.tN(this, 3.0f));
        layoutParams3.gravity = 49;
        tNVar2.addView(vcVar, layoutParams3);
        View eTVar = new com.bytedance.sdk.openadsdk.common.eT(this);
        eTVar.setId(520093721);
        tNVar.addView(eTVar, new FrameLayout.LayoutParams(-1, -1));
        return tNVar;
    }

    private void YFl(int i10) {
        int i11;
        if (i10 == 1 || (i11 = Build.VERSION.SDK_INT) == 26) {
            return;
        }
        if (i11 == 27) {
            try {
                setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        } else {
            setRequestedOrientation(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eT() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.tN) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void nc() {
        TTAdDislikeToast tTAdDislikeToast = this.tN;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private void qsH() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.rkt.YFl("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void tN() {
        Wwa wwa = this.qO;
        if (wwa == null || wwa.ko() != 4) {
            return;
        }
        GA ga2 = this.eT;
        if (ga2 != null) {
            ga2.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.GA.AfY);
        this.YoT = button;
        if (button != null) {
            YFl(AlY());
            if (this.aIu == null) {
                this.aIu = DSW.YFl(this, this.qO, TextUtils.isEmpty(this.Wwa) ? Sco.Sg(this.lG) : this.Wwa);
            }
            com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.core.Sg.YFl(this, this.qO, this.Wwa, this.lG);
            yFl.YFl(false);
            this.YoT.setOnClickListener(yFl);
            this.YoT.setOnTouchListener(yFl);
            yFl.tN(true);
            yFl.YFl(this.aIu);
        }
    }

    private void vc() {
        hQ hQVar = new hQ(this);
        this.rkt = hQVar;
        hQVar.Sg(this.f10540vc).tN(this.pDU).AlY(this.EH).YFl(this.qO).Sg(this.lG).YFl(this.qO.GS()).wN(this.qO.cC()).YFl(this.f10540vc).Sg("landingpage");
    }

    private void wN() {
        com.bytedance.sdk.component.NjR.AlY alY = (com.bytedance.sdk.component.NjR.AlY) findViewById(com.bytedance.sdk.openadsdk.utils.GA.fIu);
        this.f10540vc = alY;
        Sco.YFl(this.qO, alY);
        this.eT = (GA) findViewById(com.bytedance.sdk.openadsdk.utils.GA.RX);
        GA ga2 = (GA) findViewById(com.bytedance.sdk.openadsdk.utils.GA.f10819ib);
        com.bytedance.sdk.openadsdk.common.eT eTVar = (com.bytedance.sdk.openadsdk.common.eT) findViewById(520093721);
        this.hQ = eTVar;
        if (eTVar != null) {
            eTVar.YFl(this.qO);
            this.hQ.YFl();
        }
        if (ga2 != null) {
            ga2.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(520093720);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.f10540vc != null) {
                        if (TTLandingPageActivity.this.zB != null) {
                            TTLandingPageActivity.this.zB.YFl();
                        }
                        if (TTLandingPageActivity.this.f10540vc.wN()) {
                            TTLandingPageActivity.this.f10540vc.vc();
                        } else if (TTLandingPageActivity.this.DSW()) {
                            TTLandingPageActivity.this.onBackPressed();
                        } else {
                            TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(520093716);
        this.qsH = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.NjR = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.GA.SVa);
        com.bytedance.sdk.openadsdk.core.wN.vc vcVar = (com.bytedance.sdk.openadsdk.core.wN.vc) findViewById(com.bytedance.sdk.openadsdk.utils.GA.lL);
        this.GA = vcVar;
        if (vcVar != null) {
            vcVar.setVisibility(0);
        }
        View findViewById = findViewById(com.bytedance.sdk.openadsdk.utils.GA.kA);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.YFl();
                }
            });
        }
    }

    private void YFl(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.YoT) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.YoT != null && !TTLandingPageActivity.this.isFinishing()) {
                    TTLandingPageActivity.this.YoT.setText(str);
                }
            }
        });
    }

    public void YFl() {
        if (isFinishing()) {
            return;
        }
        if (this.wN.get()) {
            nc();
            return;
        }
        if (this.Sg == null) {
            NjR();
        }
        pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.YFl();
        }
    }

    private void Sg(final int i10) {
        if (this.qsH == null || !DSW()) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                GS.YFl((View) TTLandingPageActivity.this.qsH, i10);
            }
        });
    }
}
