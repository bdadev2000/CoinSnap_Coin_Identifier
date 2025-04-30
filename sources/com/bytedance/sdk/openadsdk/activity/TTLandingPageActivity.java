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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.QR.jU;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserDownloadButton;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewBottomBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewTitleBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserTitleBar;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserTitleBarForDark;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.dT;
import com.bytedance.sdk.openadsdk.common.ku;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.irS;
import com.bytedance.sdk.openadsdk.core.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.zp.COT;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.lMd.YW;
import com.bytedance.sdk.openadsdk.multipro.lMd;
import com.bytedance.sdk.openadsdk.utils.Bj;
import com.bytedance.sdk.openadsdk.utils.HWF;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.dQp;
import com.bytedance.sdk.openadsdk.utils.vDp;
import com.com.bytedance.overseas.sdk.zp.KS;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTLandingPageActivity extends TTBaseActivity implements jU {
    private PangleViewStub Bj;
    private String FP;
    private int Gzh;
    private SSWebView HWF;
    TTAdDislikeToast KS;
    private RCv KVG;
    private LandingPageLoadingLayout UPs;
    private ku WNy;
    private TextView YW;
    private dT YhE;
    private boolean cW;
    private KS cz;
    private String dQp;
    private Context dT;
    private boolean fRl;
    private Bj ffE;
    private int irS;
    private ImageView ku;
    TTAdDislikeDialog lMd;
    private ILoader ox;
    private woN pvr;
    private String rV;
    private PAGProgressBar tG;
    private Button vDp;
    private String vwr;
    private int woN;
    private String yRU;
    com.bytedance.sdk.openadsdk.lMd.dT zp;
    private final AtomicBoolean ot = new AtomicBoolean(true);
    private final AtomicInteger RCv = new AtomicInteger(0);
    private final AtomicInteger Lij = new AtomicInteger(0);
    private final AtomicInteger QUv = new AtomicInteger(0);
    final AtomicBoolean jU = new AtomicBoolean(false);
    final AtomicBoolean COT = new AtomicBoolean(false);
    private String eWG = "ダウンロード";

    @Override // android.app.Activity
    public void onBackPressed() {
        if (QR() && !this.ot.getAndSet(true)) {
            ku();
            lMd(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                tG.zp("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        KS();
    }

    @Override // android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public void onCreate(@Nullable Bundle bundle) {
        int i9;
        zp(3);
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.tG.COT()) {
            finish();
            return;
        }
        try {
            KVG.zp(this);
        } catch (Throwable unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            setContentView(lMd());
            Intent intent = getIntent();
            int intExtra = intent.getIntExtra("sdk_version", 1);
            this.rV = intent.getStringExtra("adid");
            this.dQp = intent.getStringExtra("log_extra");
            this.woN = intent.getIntExtra("source", -1);
            String stringExtra = intent.getStringExtra("url");
            this.FP = stringExtra;
            lMd(4);
            String stringExtra2 = intent.getStringExtra("web_title");
            this.vwr = intent.getStringExtra("event_tag");
            this.yRU = intent.getStringExtra("gecko_id");
            if (lMd.KS()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.pvr = com.bytedance.sdk.openadsdk.core.lMd.zp(new JSONObject(stringExtra3));
                    } catch (Exception e4) {
                        tG.zp("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e4);
                    }
                }
            } else {
                this.pvr = cz.zp().lMd();
                cz.zp().HWF();
            }
            if (this.pvr == null) {
                finish();
                return;
            }
            this.cW = KVG.jU().yRU();
            COT();
            if (!TextUtils.isEmpty(this.yRU)) {
                this.ox = com.bytedance.sdk.openadsdk.jU.lMd.zp().lMd();
                int zp = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(this.ox, this.yRU);
                this.Gzh = zp;
                if (zp > 0) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                this.irS = i9;
            }
            this.dT = this;
            if (this.HWF != null) {
                com.bytedance.sdk.openadsdk.core.widget.zp.KS.zp(this).zp(false).lMd(false).zp(this.HWF.getWebView());
            }
            SSWebView sSWebView = this.HWF;
            if (sSWebView != null && sSWebView.getWebView() != null) {
                this.zp = new com.bytedance.sdk.openadsdk.lMd.dT(this.pvr, this.HWF.getWebView(), new YW() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.lMd.YW
                    public void zp(int i10) {
                        KS.zp.zp(TTLandingPageActivity.this.Gzh, TTLandingPageActivity.this.Lij.get(), TTLandingPageActivity.this.QUv.get(), TTLandingPageActivity.this.RCv.get() - TTLandingPageActivity.this.QUv.get(), TTLandingPageActivity.this.pvr, "landingpage", i10);
                    }
                }, this.irS).zp(true);
            }
            HWF();
            this.HWF.setLandingPage(true);
            this.HWF.setTag("landingpage");
            this.HWF.setMaterialMeta(this.pvr.hl());
            this.HWF.setWebViewClient(new COT(this.dT, this.KVG, this.rV, this.zp, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.tG != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.tG.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.UPs != null) {
                        TTLandingPageActivity.this.UPs.lMd();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.yRU)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.RCv.incrementAndGet();
                        WebResourceResponseModel zp2 = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(TTLandingPageActivity.this.ox, TTLandingPageActivity.this.yRU, str);
                        if (zp2 != null && zp2.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.QUv.incrementAndGet();
                            return zp2.getWebResourceResponse();
                        }
                        if (zp2 != null && zp2.getMsg() == 2) {
                            TTLandingPageActivity.this.Lij.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        tG.zp("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            });
            SSWebView sSWebView2 = this.HWF;
            if (sSWebView2 != null) {
                sSWebView2.setUserAgentString(dQp.zp(sSWebView2.getWebView(), intExtra));
            }
            SSWebView sSWebView3 = this.HWF;
            if (sSWebView3 != null) {
                sSWebView3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.pvr, "landingpage", this.irS);
            com.bytedance.sdk.openadsdk.utils.woN.zp(this.HWF, stringExtra);
            this.HWF.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.KVG, this.zp) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.jU, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (TTLandingPageActivity.this.UPs != null) {
                        TTLandingPageActivity.this.UPs.zp(i10);
                    }
                    if (TTLandingPageActivity.this.cW) {
                        if (TTLandingPageActivity.this.YhE != null) {
                            TTLandingPageActivity.this.YhE.zp(i10);
                        }
                        if (TTLandingPageActivity.this.WNy != null && i10 == 100) {
                            TTLandingPageActivity.this.WNy.zp(webView);
                            return;
                        }
                        return;
                    }
                    if (TTLandingPageActivity.this.tG != null && !TTLandingPageActivity.this.isFinishing()) {
                        if (i10 == 100 && TTLandingPageActivity.this.tG.isShown()) {
                            TTLandingPageActivity.this.tG.setVisibility(8);
                        } else {
                            TTLandingPageActivity.this.tG.setProgress(i10);
                        }
                    }
                }
            });
            if (this.HWF.getWebView() != null) {
                if (this.cW) {
                    this.HWF.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.14
                        float zp = 0.0f;

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            com.bytedance.sdk.openadsdk.lMd.dT dTVar = TTLandingPageActivity.this.zp;
                            if (dTVar != null) {
                                dTVar.lMd(motionEvent.getActionMasked());
                            }
                            if (motionEvent.getAction() == 0) {
                                this.zp = motionEvent.getY();
                            }
                            if (motionEvent.getAction() == 2) {
                                float y4 = motionEvent.getY();
                                float f9 = this.zp;
                                if (y4 - f9 > 8.0f) {
                                    if (TTLandingPageActivity.this.YhE != null) {
                                        TTLandingPageActivity.this.YhE.zp();
                                    }
                                    if (TTLandingPageActivity.this.WNy != null) {
                                        TTLandingPageActivity.this.WNy.zp();
                                    }
                                    return false;
                                }
                                if (y4 - f9 < -8.0f) {
                                    if (TTLandingPageActivity.this.YhE != null) {
                                        TTLandingPageActivity.this.YhE.lMd();
                                    }
                                    if (TTLandingPageActivity.this.WNy != null) {
                                        TTLandingPageActivity.this.WNy.lMd();
                                    }
                                }
                            }
                            return false;
                        }
                    });
                } else {
                    this.HWF.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.15
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            com.bytedance.sdk.openadsdk.lMd.dT dTVar = TTLandingPageActivity.this.zp;
                            if (dTVar != null) {
                                dTVar.lMd(motionEvent.getActionMasked());
                                return false;
                            }
                            return false;
                        }
                    });
                }
            }
            this.HWF.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.16
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
                    if (TTLandingPageActivity.this.cz != null) {
                        TTLandingPageActivity.this.cz.jU();
                    }
                }
            });
            TextView textView = this.YW;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = com.bytedance.sdk.component.utils.cz.zp(this, "tt_web_title_default");
                }
                textView.setText(stringExtra2);
            }
            KS();
            Bj zp2 = HWF.zp(this, new HWF.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.17
                @Override // com.bytedance.sdk.openadsdk.utils.HWF.zp
                public void lMd() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.HWF.zp
                public View zp() {
                    return TTLandingPageActivity.this.ku;
                }
            });
            this.ffE = zp2;
            zp2.zp(0L);
            KS.zp.zp(SystemClock.elapsedRealtime() - elapsedRealtime, this.pvr, "landingpage", this.ox, this.yRU);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        SSWebView sSWebView;
        super.onDestroy();
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.zp;
        if (dTVar != null && (sSWebView = this.HWF) != null) {
            dTVar.zp(sSWebView);
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView2 = this.HWF;
        if (sSWebView2 != null) {
            irS.zp(sSWebView2.getWebView());
        }
        this.HWF = null;
        RCv rCv = this.KVG;
        if (rCv != null) {
            rCv.Bj();
        }
        com.bytedance.sdk.openadsdk.lMd.dT dTVar2 = this.zp;
        if (dTVar2 != null) {
            dTVar2.KS(true);
        }
        if (!TextUtils.isEmpty(this.yRU)) {
            KS.zp.zp(this.QUv.get(), this.RCv.get(), this.pvr);
        }
        com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(this.ox);
        Bj bj = this.ffE;
        if (bj != null) {
            bj.KS();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Bj bj = this.ffE;
        if (bj != null) {
            bj.lMd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        RCv rCv = this.KVG;
        if (rCv != null) {
            rCv.dT();
        }
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.zp;
        if (dTVar != null) {
            dTVar.QR();
        }
        if (!this.fRl) {
            this.fRl = true;
            zp(4);
        }
        Bj bj = this.ffE;
        if (bj != null) {
            bj.zp();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.KS.zp(this, this.pvr);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.zp;
        if (dTVar != null) {
            dTVar.ku();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.QR.jU
    public void zp(boolean z8, JSONArray jSONArray) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bj() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.KS) == null) {
            return;
        }
        tTAdDislikeToast.zp(TTAdDislikeToast.getDislikeSendTip());
    }

    private void COT() {
        this.HWF = (SSWebView) findViewById(vDp.si);
        this.Bj = (PangleViewStub) findViewById(vDp.qtv);
        PangleViewStub pangleViewStub = (PangleViewStub) findViewById(vDp.fs);
        PangleViewStub pangleViewStub2 = (PangleViewStub) findViewById(vDp.GP);
        LandingPageLoadingLayout landingPageLoadingLayout = (LandingPageLoadingLayout) findViewById(520093721);
        this.UPs = landingPageLoadingLayout;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.zp(this.pvr, this.vwr, true);
            this.UPs.zp();
        }
        if (this.cW) {
            PangleViewStub pangleViewStub3 = (PangleViewStub) findViewById(vDp.mW);
            PangleViewStub pangleViewStub4 = (PangleViewStub) findViewById(vDp.Vjb);
            pangleViewStub3.setVisibility(0);
            pangleViewStub4.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(vDp.fVt);
            LinearLayout linearLayout = (LinearLayout) findViewById(vDp.bX);
            dT dTVar = new dT(this, relativeLayout, this.pvr);
            this.YhE = dTVar;
            ImageView KS = dTVar.KS();
            this.ku = KS;
            KS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
            this.WNy = new ku(this, linearLayout, this.HWF, this.pvr, "landingpage");
            return;
        }
        int tG = com.bytedance.sdk.openadsdk.core.ku.lMd().tG();
        if (tG != 0) {
            if (tG == 1 && pangleViewStub2 != null) {
                pangleViewStub2.setVisibility(0);
            }
        } else if (pangleViewStub != null) {
            pangleViewStub.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(520093720);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.HWF != null) {
                        if (TTLandingPageActivity.this.HWF.COT()) {
                            TTLandingPageActivity.this.HWF.HWF();
                        } else if (TTLandingPageActivity.this.QR()) {
                            TTLandingPageActivity.this.onBackPressed();
                        } else {
                            TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(520093716);
        this.ku = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.YW = (TextView) findViewById(vDp.Ml);
        PAGProgressBar pAGProgressBar = (PAGProgressBar) findViewById(vDp.sqt);
        this.tG = pAGProgressBar;
        pAGProgressBar.setVisibility(0);
        TextView textView = (TextView) findViewById(vDp.Rea);
        textView.setText(com.bytedance.sdk.component.utils.cz.zp(KVG.zp(), "tt_reward_feedback"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTLandingPageActivity.this.zp();
            }
        });
    }

    private void HWF() {
        RCv rCv = new RCv(this);
        this.KVG = rCv;
        rCv.lMd(this.HWF).KS(this.rV).jU(this.dQp).zp(this.pvr).lMd(this.woN).zp(this.pvr.UPs()).COT(this.pvr.dm()).zp(this.HWF).lMd("landingpage").zp(this);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void KS() {
        woN won = this.pvr;
        if (won == null || won.oKZ() != 4) {
            return;
        }
        PangleViewStub pangleViewStub = this.Bj;
        if (pangleViewStub != null) {
            pangleViewStub.setVisibility(0);
        }
        Button button = (Button) findViewById(vDp.TS);
        this.vDp = button;
        if (button != null) {
            zp(jU());
            if (this.cz == null) {
                this.cz = com.com.bytedance.overseas.sdk.zp.jU.zp(this, this.pvr, TextUtils.isEmpty(this.vwr) ? YhE.lMd(this.woN) : this.vwr);
            }
            zp zpVar = new zp(this, this.pvr, this.vwr, this.woN);
            zpVar.zp(false);
            this.vDp.setOnClickListener(zpVar);
            this.vDp.setOnTouchListener(zpVar);
            zpVar.KS(true);
            zpVar.zp(this.cz);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean QR() {
        return !TextUtils.isEmpty(this.FP) && this.FP.contains("__luban_sdk");
    }

    private void YW() {
        try {
            if (this.lMd == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.dT, this.pvr);
                this.lMd = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void lMd(View view) {
                        TTLandingPageActivity.this.jU.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void zp(View view) {
                        TTLandingPageActivity.this.jU.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void zp(int i9, FilterWord filterWord) {
                        if (TTLandingPageActivity.this.COT.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.COT.set(true);
                        TTLandingPageActivity.this.Bj();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.lMd);
            if (this.KS == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.dT);
                this.KS = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void dT() {
        TTAdDislikeToast tTAdDislikeToast = this.KS;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.zp(TTAdDislikeToast.getDislikeTip());
    }

    private String jU() {
        woN won = this.pvr;
        if (won != null && !TextUtils.isEmpty(won.oB())) {
            this.eWG = this.pvr.oB();
        }
        return this.eWG;
    }

    private void ku() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.KVG.zp("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private View lMd() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setOrientation(1);
        pAGFrameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        View pangleViewStub = new PangleViewStub(this, new PangleViewStub.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.18
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.zp
            public View zp(Context context) {
                return new LandingPageBrowserTitleBar(context);
            }
        });
        pangleViewStub.setId(vDp.fs);
        pAGLinearLayout.addView(pangleViewStub, new LinearLayout.LayoutParams(-1, WNy.lMd(this, 44.0f)));
        View pangleViewStub2 = new PangleViewStub(this, new PangleViewStub.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.19
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.zp
            public View zp(Context context) {
                return new LandingPageBrowserTitleBarForDark(context);
            }
        });
        pangleViewStub2.setId(vDp.GP);
        pAGLinearLayout.addView(pangleViewStub2, new LinearLayout.LayoutParams(-1, WNy.lMd(this, 44.0f)));
        View pangleViewStub3 = new PangleViewStub(this, new PangleViewStub.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.zp
            public View zp(Context context) {
                return new LandingPageBrowserNewTitleBar(context);
            }
        });
        pangleViewStub3.setId(vDp.mW);
        pAGLinearLayout.addView(pangleViewStub3, new LinearLayout.LayoutParams(-1, WNy.lMd(this, 44.0f)));
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(pAGFrameLayout2, layoutParams);
        SSWebView sSWebView = new SSWebView(this);
        sSWebView.setId(vDp.si);
        pAGFrameLayout2.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        PangleViewStub pangleViewStub4 = new PangleViewStub(this, new PangleViewStub.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.zp
            public View zp(Context context) {
                return new LandingPageBrowserDownloadButton(context);
            }
        });
        pangleViewStub4.setId(vDp.qtv);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        pAGFrameLayout2.addView(pangleViewStub4, layoutParams2);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
        pAGProgressBar.setId(vDp.sqt);
        pAGProgressBar.setProgress(1);
        pAGProgressBar.setVisibility(8);
        pAGProgressBar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.ku.zp(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, WNy.lMd(this, 3.0f));
        layoutParams3.gravity = 49;
        pAGFrameLayout2.addView(pAGProgressBar, layoutParams3);
        PangleViewStub pangleViewStub5 = new PangleViewStub(this, new PangleViewStub.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.zp
            public View zp(Context context) {
                return new LandingPageBrowserNewBottomBar(context);
            }
        });
        pangleViewStub5.setId(vDp.Vjb);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, WNy.lMd(this, 44.0f));
        layoutParams4.gravity = 80;
        pAGFrameLayout2.addView(pangleViewStub5, layoutParams4);
        View landingPageLoadingLayout = new LandingPageLoadingLayout(this);
        landingPageLoadingLayout.setId(520093721);
        pAGFrameLayout.addView(landingPageLoadingLayout, new FrameLayout.LayoutParams(-1, -1));
        return pAGFrameLayout;
    }

    private void zp(int i9) {
        int i10;
        if (i9 == 1 || (i10 = Build.VERSION.SDK_INT) == 26) {
            return;
        }
        if (i10 == 27) {
            try {
                setRequestedOrientation(i9);
            } catch (Throwable unused) {
            }
        } else {
            setRequestedOrientation(i9);
        }
    }

    private void zp(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.vDp) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.vDp != null && !TTLandingPageActivity.this.isFinishing()) {
                    TTLandingPageActivity.this.vDp.setText(str);
                }
            }
        });
    }

    public void zp() {
        if (isFinishing()) {
            return;
        }
        if (this.COT.get()) {
            dT();
            return;
        }
        if (this.lMd == null) {
            YW();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.lMd;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.zp();
        }
    }

    private void lMd(final int i9) {
        if (this.ku == null || !QR()) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
            @Override // java.lang.Runnable
            public void run() {
                WNy.zp((View) TTLandingPageActivity.this.ku, i9);
            }
        });
    }
}
