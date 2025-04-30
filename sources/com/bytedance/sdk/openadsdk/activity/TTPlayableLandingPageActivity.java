package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.jU.ku;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.component.zp.HWF;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.YW.QR;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.FP;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.irS;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.lMd.jU;
import com.bytedance.sdk.openadsdk.core.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.DefaultEndCardBackupLayout;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.jU.lMd;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.lMd.KS.COT;
import com.bytedance.sdk.openadsdk.lMd.YW;
import com.bytedance.sdk.openadsdk.lMd.dT;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.dQp;
import com.bytedance.sdk.openadsdk.vDp.QR;
import com.bytedance.sdk.openadsdk.vDp.ku;
import com.com.bytedance.overseas.sdk.zp.KS;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTPlayableLandingPageActivity extends TTBaseActivity implements RCv.zp, QR, jU {
    private static final QR.zp si = new QR.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
        @Override // com.bytedance.sdk.openadsdk.vDp.QR.zp
        public void zp(String str, String str2, Throwable th) {
            tG.zp(str, str2, th);
        }
    };
    private ILoader BO;
    private ShadowTextView Bj;
    private SSWebView COT;
    private com.bytedance.sdk.openadsdk.core.RCv FP;
    private PlayableLoadingView KVG;
    private woN Lij;
    private int Pxi;
    private boolean QUv;
    private dT Rg;
    private String WNy;
    private COT aax;
    private KS cW;
    private com.bytedance.sdk.openadsdk.core.RCv cz;
    private PAGProgressBar dQp;
    private RelativeLayout dT;
    private int eWG;
    private boolean irS;
    TTAdDislikeToast lMd;
    private ku oKZ;
    private int ot;
    private String ox;
    private String pvr;
    private int rV;
    private Context tG;
    private ShadowImageView vDp;
    private String vwr;
    private DefaultEndCardBackupLayout woN;
    private String yRU;
    FP zp;
    private boolean HWF = true;
    private boolean ku = false;
    private boolean YW = true;
    final AtomicBoolean KS = new AtomicBoolean(false);
    private final String RCv = "embeded_ad";
    private final RCv Gzh = new RCv(Looper.getMainLooper(), this);
    private final AtomicBoolean YhE = new AtomicBoolean(false);
    private final AtomicInteger UPs = new AtomicInteger(0);
    private final AtomicInteger fRl = new AtomicInteger(0);
    private final AtomicInteger ffE = new AtomicInteger(0);
    private boolean Iv = false;
    protected com.bytedance.sdk.openadsdk.YW.jU jU = new com.bytedance.sdk.openadsdk.YW.jU() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
        @Override // com.bytedance.sdk.openadsdk.YW.jU
        public void lMd() {
            if (cz.QR(TTPlayableLandingPageActivity.this.Lij) && cz.ku(TTPlayableLandingPageActivity.this.Lij)) {
                TTPlayableLandingPageActivity.this.Gzh.sendMessageDelayed(TTPlayableLandingPageActivity.this.zp(0, 0), 1000L);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.YW.jU
        public void zp() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && cz.QR(TTPlayableLandingPageActivity.this.Lij) && cz.YW(TTPlayableLandingPageActivity.this.Lij)) {
                TTPlayableLandingPageActivity.this.Gzh.removeMessages(2);
                TTPlayableLandingPageActivity.this.Gzh.sendMessage(TTPlayableLandingPageActivity.this.zp(1, 0));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.YW.jU
        public void zp(int i9) {
            if (!cz.QR(TTPlayableLandingPageActivity.this.Lij) || TTPlayableLandingPageActivity.this.KVG == null) {
                return;
            }
            TTPlayableLandingPageActivity.this.KVG.setProgress(i9);
        }
    };

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        COT cot = this.aax;
        if (cot != null) {
            cot.ku();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.tG.COT()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            KVG.zp(this);
        } catch (Throwable unused) {
        }
        zp(bundle);
        woN won = this.Lij;
        if (won == null) {
            return;
        }
        int dT = cz.dT(won);
        int i9 = 0;
        if (dT != 0) {
            if (dT != 1) {
                if (dT == 2) {
                    setRequestedOrientation(0);
                }
            } else {
                setRequestedOrientation(1);
            }
        } else {
            setRequestedOrientation(14);
        }
        this.tG = this;
        try {
            setContentView(jU());
            YW();
            HWF();
            zp();
            Bj();
            QR();
            if (!TextUtils.isEmpty(this.WNy)) {
                this.BO = lMd.zp().lMd();
                int zp = lMd.zp().zp(this.BO, this.WNy);
                this.eWG = zp;
                if (zp > 0) {
                    i9 = 2;
                }
                this.Pxi = i9;
            }
            ku();
            COT cot = this.aax;
            if (cot != null) {
                cot.QR();
            }
            KS.zp.zp(SystemClock.elapsedRealtime() - elapsedRealtime, this.Lij, "embeded_ad", this.BO, this.WNy);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        COT cot = this.aax;
        if (cot != null) {
            cot.zp(true);
            this.aax.vDp();
        }
        this.Gzh.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.WNy)) {
            KS.zp.zp(this.fRl.get(), this.UPs.get(), this.Lij);
        }
        lMd.zp().zp(this.BO);
        SSWebView sSWebView = this.COT;
        if (sSWebView != null) {
            irS.zp(sSWebView.getWebView());
            this.COT.vDp();
        }
        this.COT = null;
        com.bytedance.sdk.openadsdk.core.RCv rCv = this.cz;
        if (rCv != null) {
            rCv.Bj();
        }
        com.bytedance.sdk.openadsdk.core.RCv rCv2 = this.FP;
        if (rCv2 != null) {
            rCv2.Bj();
        }
        ku kuVar = this.oKZ;
        if (kuVar != null) {
            kuVar.fRl();
        }
        dT dTVar = this.Rg;
        if (dTVar != null) {
            dTVar.KS(true);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.core.RCv rCv = this.cz;
        if (rCv != null) {
            rCv.lMd(false);
        }
        ku kuVar = this.oKZ;
        if (kuVar != null) {
            kuVar.zp(true);
            this.oKZ.lMd(false);
        }
        DeviceUtils.AudioInfoReceiver.lMd((com.bytedance.sdk.openadsdk.YW.QR) this);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        boolean z8;
        super.onResume();
        com.bytedance.sdk.openadsdk.core.RCv rCv = this.cz;
        if (rCv != null) {
            rCv.dT();
            SSWebView sSWebView = this.COT;
            if (sSWebView != null) {
                com.bytedance.sdk.openadsdk.core.RCv rCv2 = this.cz;
                if (sSWebView.getVisibility() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                rCv2.lMd(z8);
            }
        }
        com.bytedance.sdk.openadsdk.core.RCv rCv3 = this.FP;
        if (rCv3 != null) {
            rCv3.dT();
        }
        ku kuVar = this.oKZ;
        if (kuVar != null) {
            kuVar.lMd(true);
        }
        dT dTVar = this.Rg;
        if (dTVar != null) {
            dTVar.QR();
        }
        DeviceUtils.AudioInfoReceiver.zp((com.bytedance.sdk.openadsdk.YW.QR) this);
        if (DeviceUtils.QR() == 0) {
            this.Iv = true;
        }
        KS(this.Iv);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            woN won = this.Lij;
            if (won != null) {
                str = won.Eg().toString();
            } else {
                str = null;
            }
            bundle.putString("material_meta", str);
            bundle.putInt("sdk_version", this.rV);
            bundle.putString("adid", this.vwr);
            bundle.putString("log_extra", this.pvr);
            bundle.putInt("source", this.ot);
            bundle.putBoolean("ad_pending_download", this.irS);
            bundle.putString("url", this.yRU);
            bundle.putString("web_title", this.ox);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        COT cot = this.aax;
        if (cot != null) {
            cot.dT();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        COT cot = this.aax;
        if (cot != null) {
            cot.YW();
        }
        dT dTVar = this.Rg;
        if (dTVar != null) {
            dTVar.ku();
        }
    }

    private void Bj() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.Lij);
        this.aax = new com.bytedance.sdk.openadsdk.lMd.KVG(3, "embeded_ad", this.Lij);
        this.cz = new com.bytedance.sdk.openadsdk.core.RCv(this);
        this.cz.lMd(this.COT).zp(this.Lij).zp(arrayList).KS(this.vwr).jU(this.pvr).lMd("embeded_ad").lMd(this.ot).zp(this).zp(this.aax).zp(this.jU).zp(this.COT).COT(this.Lij.dm());
        COT();
    }

    private void HWF() {
        if (this.Lij.oKZ() == 4) {
            this.cW = com.com.bytedance.overseas.sdk.zp.jU.zp(this.tG, this.Lij, "interaction");
        }
    }

    private void QR() {
        int i9 = KVG.jU().Gzh(String.valueOf(this.Lij.FGx())).KVG;
        if (i9 >= 0) {
            this.Gzh.sendEmptyMessageDelayed(1, i9 * 1000);
        } else {
            WNy.zp((View) this.dT, 0);
        }
    }

    private void YW() {
        RelativeLayout relativeLayout = this.dT;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.aax != null) {
                        TTPlayableLandingPageActivity.this.aax.ku();
                    }
                    TTPlayableLandingPageActivity.this.Gzh.sendMessage(TTPlayableLandingPageActivity.this.zp(4, 0));
                    TTPlayableLandingPageActivity.this.zp("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        ShadowTextView shadowTextView = this.Bj;
        if (shadowTextView != null) {
            shadowTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.lMd();
                }
            });
        }
        ShadowImageView shadowImageView = this.vDp;
        if (shadowImageView != null) {
            shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.Iv = !r2.Iv;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.KS(tTPlayableLandingPageActivity.Iv);
                    if (TTPlayableLandingPageActivity.this.oKZ != null) {
                        TTPlayableLandingPageActivity.this.oKZ.zp(TTPlayableLandingPageActivity.this.Iv);
                    }
                }
            });
        }
        this.COT.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        WNy.zp((View) this.COT, 4);
        this.KVG.lMd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dT() {
        if (this.YhE.getAndSet(true)) {
            return;
        }
        if (cz.KVG(this.Lij) && (!this.ku || !this.HWF)) {
            if (this.woN == null || this.KVG == null) {
                return;
            }
            zp zpVar = new zp(this, this.Lij, "embeded_ad", this.ot);
            zpVar.zp(this.cW);
            this.woN.zp(this.Lij, "embeded_ad", zpVar);
            WNy.zp((View) this.woN, 0);
            WNy.zp((View) this.KVG, 8);
            WNy.zp((View) this.vDp, 8);
            return;
        }
        SSWebView sSWebView = this.COT;
        if (sSWebView == null || this.KVG == null) {
            return;
        }
        WNy.zp((View) sSWebView, 0);
        WNy.zp((View) this.KVG, 8);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void ku() {
        SSWebView sSWebView = this.COT;
        if (sSWebView == null) {
            return;
        }
        sSWebView.setLandingPage(true);
        this.COT.setTag("landingpage");
        this.COT.setMaterialMeta(this.Lij.hl());
        dT zp = new dT(this.Lij, this.COT.getWebView(), new YW() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.11
            @Override // com.bytedance.sdk.openadsdk.lMd.YW
            public void zp(int i9) {
                KS.zp.zp(TTPlayableLandingPageActivity.this.eWG, TTPlayableLandingPageActivity.this.ffE.get(), TTPlayableLandingPageActivity.this.fRl.get(), TTPlayableLandingPageActivity.this.UPs.get() - TTPlayableLandingPageActivity.this.fRl.get(), TTPlayableLandingPageActivity.this.Lij, "embeded_ad", i9);
            }
        }, this.Pxi).zp(true);
        this.Rg = zp;
        zp.zp("embeded_ad");
        this.Rg.zp(this.aax);
        this.COT.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.zp.COT(this.tG, this.cz, this.vwr, this.Rg, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                TTPlayableLandingPageActivity.this.ku = true;
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if (TTPlayableLandingPageActivity.this.oKZ != null) {
                    TTPlayableLandingPageActivity.this.oKZ.ku(str);
                }
                try {
                    TTPlayableLandingPageActivity.this.jU.lMd();
                } catch (Throwable unused) {
                }
                try {
                    if (TTPlayableLandingPageActivity.this.dQp != null) {
                        TTPlayableLandingPageActivity.this.dQp.setVisibility(8);
                    }
                    if (TTPlayableLandingPageActivity.this.HWF) {
                        TTPlayableLandingPageActivity.this.dT();
                        TTPlayableLandingPageActivity.this.zp("py_loading_success");
                        com.bytedance.sdk.openadsdk.core.RCv rCv = this.KS;
                        if (rCv != null) {
                            rCv.lMd(true);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                TTPlayableLandingPageActivity.this.HWF = false;
                if (TTPlayableLandingPageActivity.this.oKZ == null || webResourceError == null || webResourceRequest == null) {
                    return;
                }
                TTPlayableLandingPageActivity.this.oKZ.zp(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            @RequiresApi(api = 21)
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (TTPlayableLandingPageActivity.this.yRU != null && webResourceRequest != null && webResourceRequest.getUrl() != null && TTPlayableLandingPageActivity.this.yRU.equals(webResourceRequest.getUrl().toString())) {
                    TTPlayableLandingPageActivity.this.HWF = false;
                }
                if (TTPlayableLandingPageActivity.this.oKZ != null && webResourceRequest != null) {
                    try {
                        TTPlayableLandingPageActivity.this.oKZ.zp(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    } catch (Throwable unused) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                int i9;
                try {
                    if (TTPlayableLandingPageActivity.this.oKZ != null) {
                        TTPlayableLandingPageActivity.this.oKZ.YW(str);
                    }
                    if (!TextUtils.isEmpty(TTPlayableLandingPageActivity.this.WNy)) {
                        TTPlayableLandingPageActivity.this.UPs.incrementAndGet();
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponseModel zp2 = lMd.zp().zp(TTPlayableLandingPageActivity.this.BO, TTPlayableLandingPageActivity.this.WNy, str);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (TTPlayableLandingPageActivity.this.aax != null) {
                        ku.zp zp3 = com.bytedance.sdk.component.adexpress.jU.ku.zp(str);
                        if (zp2 != null && zp2.getWebResourceResponse() != null) {
                            i9 = 1;
                        } else {
                            i9 = 2;
                        }
                        if (zp3 == ku.zp.HTML) {
                            TTPlayableLandingPageActivity.this.aax.zp(str, currentTimeMillis, currentTimeMillis2, i9);
                        } else if (zp3 == ku.zp.JS) {
                            TTPlayableLandingPageActivity.this.aax.lMd(str, currentTimeMillis, currentTimeMillis2, i9);
                        }
                    }
                    if (zp2 != null && zp2.getWebResourceResponse() != null) {
                        TTPlayableLandingPageActivity.this.fRl.incrementAndGet();
                        if (TTPlayableLandingPageActivity.this.oKZ != null) {
                            TTPlayableLandingPageActivity.this.oKZ.dT(str);
                        }
                        return zp2.getWebResourceResponse();
                    }
                    if (zp2 != null && zp2.getMsg() == 2) {
                        TTPlayableLandingPageActivity.this.ffE.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Exception unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i9, String str, String str2) {
                super.onReceivedError(webView, i9, str, str2);
            }
        });
        zp(this.COT);
        com.bytedance.sdk.openadsdk.utils.woN.zp(this.COT, this.yRU);
        com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.oKZ;
        if (kuVar != null) {
            kuVar.QR(this.yRU);
        }
        this.COT.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.cz, this.Rg) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.jU, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i9) {
                super.onProgressChanged(webView, i9);
                if (TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    TTPlayableLandingPageActivity.this.jU.zp(i9);
                } catch (Throwable unused) {
                }
                if (TTPlayableLandingPageActivity.this.dQp != null) {
                    if (i9 == 100) {
                        TTPlayableLandingPageActivity.this.ku = true;
                        TTPlayableLandingPageActivity.this.dQp.setVisibility(8);
                        TTPlayableLandingPageActivity.this.dT();
                        return;
                    }
                    TTPlayableLandingPageActivity.this.dQp.setProgress(i9);
                }
            }
        });
        this.COT.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.14
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (TTPlayableLandingPageActivity.this.Rg != null) {
                    TTPlayableLandingPageActivity.this.Rg.lMd(motionEvent.getActionMasked());
                    return false;
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tG() {
        TTAdDislikeToast tTAdDislikeToast = this.lMd;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.zp(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void vDp() {
        TTAdDislikeToast tTAdDislikeToast = this.lMd;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.zp(TTAdDislikeToast.getDislikeTip());
        }
    }

    private void COT() {
        if (this.oKZ != null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.ku.lMd().woN()) {
            com.bytedance.sdk.openadsdk.vDp.QR.zp(si);
        }
        com.bytedance.sdk.openadsdk.vDp.zp zpVar = new com.bytedance.sdk.openadsdk.vDp.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.vDp.zp
            public void zp(int i9, String str) {
                super.zp(i9, str);
                if (cz.KVG(TTPlayableLandingPageActivity.this.Lij)) {
                    TTPlayableLandingPageActivity.this.Gzh.sendMessage(TTPlayableLandingPageActivity.this.zp(3, cz.zp(i9)));
                    TTPlayableLandingPageActivity.this.dT();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vDp.zp
            public com.bytedance.sdk.openadsdk.vDp.jU zp() {
                String HWF = com.bytedance.sdk.openadsdk.common.zp.HWF();
                HWF.getClass();
                char c9 = 65535;
                switch (HWF.hashCode()) {
                    case 1653:
                        if (HWF.equals("2g")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case 1684:
                        if (HWF.equals("3g")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 1715:
                        if (HWF.equals("4g")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 1746:
                        if (HWF.equals("5g")) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 3649301:
                        if (HWF.equals("wifi")) {
                            c9 = 4;
                            break;
                        }
                        break;
                }
                switch (c9) {
                    case 0:
                        return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_2G;
                    case 1:
                        return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_3G;
                    case 2:
                        return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_4G;
                    case 3:
                        return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_5G;
                    case 4:
                        return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.vDp.jU.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vDp.zp
            public void zp(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(TTPlayableLandingPageActivity.this.Lij, "embeded_ad", "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.vDp.KS ks = new com.bytedance.sdk.openadsdk.vDp.KS() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.vDp.KS
            public void zp(String str, JSONObject jSONObject) {
                TTPlayableLandingPageActivity.this.cz.zp(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.vwr);
            jSONObject.put("log_extra", this.pvr);
            this.oKZ = com.bytedance.sdk.openadsdk.vDp.ku.zp(getApplicationContext(), this.COT.getWebView(), ks, zpVar).HWF(this.yRU).COT(com.bytedance.sdk.openadsdk.common.zp.zp(KVG.zp())).zp(com.bytedance.sdk.openadsdk.common.zp.zp()).KS(jSONObject).lMd(com.bytedance.sdk.openadsdk.common.zp.COT()).zp("sdkEdition", com.bytedance.sdk.openadsdk.common.zp.KS()).jU(com.bytedance.sdk.openadsdk.common.zp.jU()).KS(false).zp(this.Iv).zp(cz.tG(this.Lij)).lMd(cz.tG(this.Lij)).jU(true);
        } catch (Throwable unused) {
        }
        if (this.oKZ == null) {
            tG.zp("Pangle", "new PlayablePlugin Object failed, mPlayablePlugin is null");
            return;
        }
        if (!TextUtils.isEmpty(cz.jU(this.Lij))) {
            this.oKZ.KS(cz.jU(this.Lij));
        }
        Set<String> Bj = this.oKZ.Bj();
        final WeakReference weakReference = new WeakReference(this.oKZ);
        for (String str : Bj) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str)) {
                this.cz.zp().zp(str, new com.bytedance.sdk.component.zp.COT<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.zp.COT
                    public JSONObject zp(@NonNull JSONObject jSONObject2, @NonNull HWF hwf) {
                        try {
                            com.bytedance.sdk.openadsdk.vDp.ku kuVar = (com.bytedance.sdk.openadsdk.vDp.ku) weakReference.get();
                            if (kuVar == null) {
                                return null;
                            }
                            return kuVar.jU(zp(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private View jU() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        pAGFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.COT = new SSWebView(this);
        this.COT.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.COT.setVisibility(4);
        this.dQp = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, WNy.lMd(this, 3.0f));
        layoutParams.gravity = 49;
        this.dQp.setLayoutParams(layoutParams);
        this.dQp.setProgress(1);
        this.dQp.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.ku.zp(this, "tt_browser_progress_style"));
        this.KVG = new PlayableLoadingView(this);
        this.KVG.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.KVG.setClickable(true);
        this.KVG.setFocusable(true);
        this.woN = new DefaultEndCardBackupLayout(this);
        this.woN.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.vDp = new ShadowImageView(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(WNy.lMd(this, 28.0f), WNy.lMd(this, 28.0f));
        layoutParams2.leftMargin = WNy.lMd(this, 12.0f);
        layoutParams2.topMargin = WNy.lMd(this, 20.0f);
        this.vDp.setLayoutParams(layoutParams2);
        this.vDp.setScaleType(ImageView.ScaleType.CENTER);
        this.vDp.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ku.zp(this, "tt_unmute_wrapper"));
        this.Bj = new ShadowTextView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, WNy.lMd(this, 28.0f));
        layoutParams3.gravity = 8388661;
        layoutParams3.leftMargin = WNy.lMd(this, 16.0f);
        layoutParams3.rightMargin = WNy.lMd(this, 80.0f);
        layoutParams3.topMargin = WNy.lMd(this, 20.0f);
        this.Bj.setLayoutParams(layoutParams3);
        this.Bj.setGravity(17);
        this.Bj.setText(com.bytedance.sdk.component.utils.cz.zp(this, "tt_reward_feedback"));
        this.Bj.setTextColor(Color.parseColor("#ffffff"));
        this.Bj.setTextSize(14.0f);
        this.dT = new PAGRelativeLayout(this);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(WNy.lMd(this, 28.0f), WNy.lMd(this, 28.0f));
        layoutParams4.gravity = 8388661;
        layoutParams4.topMargin = WNy.lMd(this, 20.0f);
        layoutParams4.rightMargin = WNy.lMd(this, 24.0f);
        this.dT.setLayoutParams(layoutParams4);
        this.dT.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this, "tt_mute_btn_bg"));
        this.dT.setGravity(17);
        this.dT.setVisibility(8);
        PAGImageView pAGImageView = new PAGImageView(this);
        pAGImageView.setLayoutParams(new RelativeLayout.LayoutParams(WNy.lMd(this, 12.0f), WNy.lMd(this, 12.0f)));
        pAGImageView.setImageDrawable(com.bytedance.sdk.component.utils.cz.KS(this, "tt_video_close_drawable"));
        pAGImageView.setVisibility(0);
        this.dT.addView(pAGImageView);
        pAGFrameLayout.addView(this.COT);
        pAGFrameLayout.addView(this.dQp);
        pAGFrameLayout.addView(this.woN);
        pAGFrameLayout.addView(this.KVG);
        pAGFrameLayout.addView(this.vDp);
        pAGFrameLayout.addView(this.Bj);
        pAGFrameLayout.addView(this.dT);
        return pAGFrameLayout;
    }

    public void KS() {
        woN won = this.Lij;
        if (won != null) {
            this.zp = new com.bytedance.sdk.openadsdk.dislike.lMd(this, won.GP(), this.Lij.sqt(), this.Lij.Eg().toString());
        }
        if (this.lMd == null) {
            this.lMd = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.lMd);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.jU
    public void lMd(boolean z8) {
        com.com.bytedance.overseas.sdk.zp.KS ks;
        this.irS = true;
        this.QUv = z8;
        if (!z8) {
            try {
                Toast.makeText(this.tG, com.bytedance.sdk.component.utils.cz.zp(KVG.zp(), "tt_toast_later_download"), 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.QUv || (ks = this.cW) == null) {
            return;
        }
        ks.jU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message zp(int i9, int i10) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i9;
        if (i9 == 3) {
            obtain.arg2 = i10;
        }
        return obtain;
    }

    private void zp(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.rV = intent.getIntExtra("sdk_version", 1);
            this.vwr = intent.getStringExtra("adid");
            this.pvr = intent.getStringExtra("log_extra");
            this.ot = intent.getIntExtra("source", -1);
            this.irS = intent.getBooleanExtra("ad_pending_download", false);
            this.yRU = intent.getStringExtra("url");
            this.WNy = intent.getStringExtra("gecko_id");
            this.ox = intent.getStringExtra("web_title");
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.Lij = com.bytedance.sdk.openadsdk.core.lMd.zp(new JSONObject(stringExtra));
                    } catch (Exception e4) {
                        tG.zp("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e4);
                    }
                }
            } else {
                this.Lij = com.bytedance.sdk.openadsdk.core.cz.zp().lMd();
                com.bytedance.sdk.openadsdk.core.cz.zp().HWF();
            }
        }
        if (bundle != null) {
            try {
                this.rV = bundle.getInt("sdk_version", 1);
                this.vwr = bundle.getString("adid");
                this.pvr = bundle.getString("log_extra");
                this.ot = bundle.getInt("source", -1);
                this.irS = bundle.getBoolean("ad_pending_download", false);
                this.yRU = bundle.getString("url");
                this.ox = bundle.getString("web_title");
                String string = bundle.getString("material_meta", null);
                if (!TextUtils.isEmpty(string)) {
                    this.Lij = com.bytedance.sdk.openadsdk.core.lMd.zp(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.Lij == null) {
            tG.zp("TTPWPActivity", "material is null, no data to display");
            finish();
        } else {
            try {
                this.Iv = KVG.jU().KVG(this.Lij.QUv().getCodeId());
            } catch (Throwable th) {
                tG.zp("TTPWPActivity", th.getMessage());
            }
        }
    }

    public void KS(boolean z8) {
        Drawable zp;
        try {
            this.Iv = z8;
            if (z8) {
                zp = com.bytedance.sdk.openadsdk.utils.ku.zp(this.tG, "tt_mute_wrapper");
            } else {
                zp = com.bytedance.sdk.openadsdk.utils.ku.zp(this.tG, "tt_unmute_wrapper");
            }
            this.vDp.setImageDrawable(zp);
            com.bytedance.sdk.openadsdk.vDp.ku kuVar = this.oKZ;
            if (kuVar != null) {
                kuVar.zp(z8);
            }
        } catch (Exception e4) {
            tG.zp("TTPWPActivity", e4.getMessage());
        }
    }

    public void lMd() {
        if (this.Lij == null || isFinishing()) {
            return;
        }
        if (this.KS.get()) {
            vDp();
            return;
        }
        if (this.zp == null) {
            KS();
        }
        this.zp.zp(new FP.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.FP.zp
            public void zp() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.FP.zp
            public void zp(int i9, String str) {
                if (TTPlayableLandingPageActivity.this.KS.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.KS.set(true);
                TTPlayableLandingPageActivity.this.tG();
            }
        });
        FP fp = this.zp;
        if (fp != null) {
            fp.zp();
        }
    }

    public void zp() {
        if (this.KVG == null) {
            return;
        }
        woN won = this.Lij;
        if (won != null && !cz.QR(won)) {
            this.KVG.zp();
            return;
        }
        this.KVG.lMd();
        if (this.KVG.getPlayView() != null) {
            zp zpVar = new zp(this, this.Lij, "embeded_ad", this.ot) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.lMd.zp, com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
                public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
                    woN won2 = this.COT;
                    if (won2 != null && won2.woN() == 1 && !z8) {
                        return;
                    }
                    super.zp(view, f9, f10, f11, f12, sparseArray, z8);
                    TTPlayableLandingPageActivity.this.irS = true;
                    TTPlayableLandingPageActivity.this.QUv = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.yRU);
                    } catch (JSONException e4) {
                        tG.zp("TTPWPActivity", "onClick JSON ERROR", e4);
                    }
                    com.bytedance.sdk.openadsdk.lMd.KS.lMd(TTPlayableLandingPageActivity.this.Lij, ((com.bytedance.sdk.openadsdk.core.lMd.lMd) this).HWF, "click_playable_download_button_loading", jSONObject);
                }
            };
            zpVar.zp(this.cW);
            this.KVG.getPlayView().setOnClickListener(zpVar);
        }
        if (cz.YW(this.Lij)) {
            this.Gzh.sendMessageDelayed(zp(2, cz.zp(2)), cz.rV(this.Lij));
        }
    }

    private void zp(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.zp.KS.zp(this.tG).zp(false).lMd(false).zp(sSWebView.getWebView());
        sSWebView.setUserAgentString(dQp.zp(sSWebView.getWebView(), this.rV));
        sSWebView.setMixedContentMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str) {
        com.bytedance.sdk.openadsdk.lMd.KS.KS(this.Lij, "embeded_ad", str, (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        int i9 = message.what;
        if (i9 == 1) {
            WNy.zp((View) this.dT, 0);
            return;
        }
        if (i9 != 2) {
            return;
        }
        PlayableLoadingView playableLoadingView = this.KVG;
        if (playableLoadingView == null || !playableLoadingView.KS()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i10 = message.arg2;
                if (i10 != 0) {
                    jSONObject.put("remove_loading_page_reason", i10);
                }
                jSONObject.put("playable_url", this.yRU);
                PlayableLoadingView playableLoadingView2 = this.KVG;
                jSONObject.put("duration", playableLoadingView2 != null ? playableLoadingView2.getDisplayDuration() : 0L);
            } catch (JSONException e4) {
                tG.zp("TTPWPActivity", "handleMsg json error", e4);
            }
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.Lij, "embeded_ad", "remove_loading_page", jSONObject);
            this.Gzh.removeMessages(2);
            PlayableLoadingView playableLoadingView3 = this.KVG;
            if (playableLoadingView3 != null) {
                playableLoadingView3.zp();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YW.QR
    public void zp(int i9) {
        KS(i9 <= 0);
    }
}
