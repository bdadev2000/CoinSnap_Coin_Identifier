package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bykv.vk.openvk.component.video.api.jU.lMd;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.utils.yRU;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.QR.jU;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.irS;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.zp.COT;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.lMd.YW;
import com.bytedance.sdk.openadsdk.lMd.dT;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.dQp;
import com.bytedance.sdk.openadsdk.utils.vDp;
import com.com.bytedance.overseas.sdk.zp.KS;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseActivity implements jU {
    protected int Bj;
    protected Context COT;
    protected PangleViewStub Gzh;
    protected int HWF;
    protected ImageView KS;
    protected woN KVG;
    protected TextView Lij;
    private int MBR;
    protected com.bytedance.sdk.openadsdk.multipro.lMd.zp Pxi;
    protected KS QUv;
    protected TextView RCv;
    protected String YW;
    protected String YhE;
    protected String aax;
    protected long dQp;
    protected RCv dT;
    protected int eWG;
    protected Button irS;
    protected TextView jU;
    protected String ku;
    protected ImageView lMd;
    protected dT oKZ;
    protected RelativeLayout ot;
    protected CornerIV ox;
    private int rCC;
    protected NativeVideoTsView rV;
    private ILoader si;
    protected FrameLayout vDp;
    protected TextView yRU;
    protected SSWebView zp;
    protected int tG = -1;
    protected int woN = 0;
    protected int vwr = 0;
    protected int pvr = 0;
    protected int cz = 0;
    protected String FP = "ダウンロード";
    protected boolean cW = false;
    protected boolean WNy = false;
    protected boolean UPs = true;
    protected boolean fRl = false;
    protected String ffE = null;
    protected AtomicBoolean BO = new AtomicBoolean(true);
    protected JSONArray Iv = null;
    private final AtomicInteger DY = new AtomicInteger(0);
    private final AtomicInteger Rh = new AtomicInteger(0);
    private final AtomicInteger gH = new AtomicInteger(0);
    protected com.bytedance.sdk.openadsdk.core.lMd.zp Rg = null;
    private final KS.lMd oB = new KS.lMd() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.component.video.api.jU.KS.lMd
        public void zp(boolean z8) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.cW = z8;
            if (!tTVideoLandingPageActivity.isFinishing()) {
                if (z8) {
                    WNy.zp((View) TTVideoLandingPageActivity.this.zp, 8);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.vDp.getLayoutParams();
                    TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                    tTVideoLandingPageActivity2.vwr = marginLayoutParams.leftMargin;
                    tTVideoLandingPageActivity2.woN = marginLayoutParams.topMargin;
                    tTVideoLandingPageActivity2.pvr = marginLayoutParams.width;
                    tTVideoLandingPageActivity2.cz = marginLayoutParams.height;
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.leftMargin = 0;
                    tTVideoLandingPageActivity2.vDp.setLayoutParams(marginLayoutParams);
                    return;
                }
                WNy.zp((View) TTVideoLandingPageActivity.this.zp, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.vDp.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                marginLayoutParams2.width = tTVideoLandingPageActivity3.pvr;
                marginLayoutParams2.height = tTVideoLandingPageActivity3.cz;
                marginLayoutParams2.leftMargin = tTVideoLandingPageActivity3.vwr;
                marginLayoutParams2.topMargin = tTVideoLandingPageActivity3.woN;
                tTVideoLandingPageActivity3.vDp.setLayoutParams(marginLayoutParams2);
            }
        }
    };
    private final yRU.zp fgJ = new yRU.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.yRU.zp
        public void zp(Context context, Intent intent, boolean z8, final int i9) {
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    zp(i9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zp(int i9) {
            SSWebView sSWebView;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.eWG == 0 && i9 != 0 && (sSWebView = tTVideoLandingPageActivity.zp) != null && (str = tTVideoLandingPageActivity.ffE) != null) {
                sSWebView.a_(str);
            }
            NativeVideoTsView nativeVideoTsView = TTVideoLandingPageActivity.this.rV;
            if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.WNy && tTVideoLandingPageActivity2.eWG != i9) {
                    ((com.bytedance.sdk.openadsdk.core.video.nativevideo.KS) tTVideoLandingPageActivity2.rV.getNativeVideoController()).KS(i9);
                }
            }
            TTVideoLandingPageActivity.this.eWG = i9;
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public static class zp extends AsyncTask<Void, Void, Drawable> {
        private final WeakReference<lMd> lMd;
        private final Bitmap zp;

        @Override // android.os.AsyncTask
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap zp = com.bytedance.sdk.component.adexpress.jU.zp.zp(KVG.zp(), this.zp, 25);
                if (zp == null) {
                    return null;
                }
                return new BitmapDrawable(KVG.zp().getResources(), zp);
            } catch (Throwable th) {
                tG.zp("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        private zp(Bitmap bitmap, lMd lmd) {
            this.zp = bitmap;
            this.lMd = new WeakReference<>(lmd);
        }

        @Override // android.os.AsyncTask
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<lMd> weakReference;
            if (drawable == null || (weakReference = this.lMd) == null || weakReference.get() == null) {
                return;
            }
            this.lMd.get().zp(drawable);
        }
    }

    private boolean KVG() {
        NativeVideoTsView nativeVideoTsView = this.rV;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            return this.rV.getNativeVideoController().dQp();
        }
        return true;
    }

    private void dQp() {
        if (this.rV != null && !KVG()) {
            this.rV.tG();
        }
    }

    private void rV() {
        NativeVideoTsView nativeVideoTsView = this.rV;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null && !KVG()) {
            this.rV.tG();
        }
    }

    private void tG() {
        RCv rCv = new RCv(this);
        this.dT = rCv;
        rCv.lMd(this.zp).KS(this.ku).jU(this.YW).lMd(this.Bj).zp(this.KVG).zp(this.KVG.UPs()).zp(this.zp).lMd("landingpage_split_screen").COT(this.KVG.dm());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void vDp() {
        woN won = this.KVG;
        if (won != null && won.oKZ() == 4) {
            this.Gzh.setVisibility(0);
            Button button = (Button) findViewById(vDp.TS);
            this.irS = button;
            if (button != null) {
                zp(lMd());
                this.irS.setOnClickListener(this.Rg);
                this.irS.setOnTouchListener(this.Rg);
            }
        }
    }

    private void vwr() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.dT.zp("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean woN() {
        if (!TextUtils.isEmpty(this.ffE) && this.ffE.contains("__luban_sdk")) {
            return true;
        }
        return false;
    }

    public void Bj() {
        try {
            yRU.zp(this.fgJ);
        } catch (Exception unused) {
        }
    }

    public abstract boolean COT();

    public int QR() {
        NativeVideoTsView nativeVideoTsView = this.rV;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            return this.rV.getNativeVideoController().dT();
        }
        return 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void YW() {
        woN won = this.KVG;
        if (won == null) {
            return;
        }
        this.QUv = com.com.bytedance.overseas.sdk.zp.jU.zp(this, won, this.YhE);
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar = new com.bytedance.sdk.openadsdk.core.lMd.zp(this, this.KVG, this.YhE, this.Bj);
        this.Rg = zpVar;
        zpVar.zp(false);
        this.Rg.KS(true);
        this.Lij.setOnClickListener(this.Rg);
        this.Lij.setOnTouchListener(this.Rg);
        this.Rg.zp(this.QUv);
    }

    public void dT() {
        yRU.zp(this.fgJ, this.COT);
    }

    public void ku() {
        String str;
        woN won = this.KVG;
        if (won != null && won.oKZ() == 4) {
            WNy.zp((View) this.ot, 0);
            if (!TextUtils.isEmpty(this.KVG.rCC())) {
                str = this.KVG.rCC();
            } else if (!TextUtils.isEmpty(this.KVG.MBR())) {
                str = this.KVG.MBR();
            } else if (!TextUtils.isEmpty(this.KVG.Pxi())) {
                str = this.KVG.Pxi();
            } else {
                str = "";
            }
            if (this.KVG.BO() != null && this.KVG.BO().zp() != null) {
                WNy.zp((View) this.ox, 0);
                WNy.zp((View) this.yRU, 4);
                com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.KVG.BO(), this.ox, this.KVG);
            } else if (!TextUtils.isEmpty(str)) {
                WNy.zp((View) this.ox, 4);
                WNy.zp((View) this.yRU, 0);
                this.yRU.setText(str.substring(0, 1));
            }
            if (!TextUtils.isEmpty(this.KVG.oB())) {
                this.Lij.setText(this.KVG.oB());
            }
            if (!TextUtils.isEmpty(str)) {
                this.RCv.setText(str);
            }
            WNy.zp((View) this.RCv, 0);
            WNy.zp((View) this.Lij, 0);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        NativeVideoTsView nativeVideoTsView;
        if (this.cW && (nativeVideoTsView = this.rV) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((com.bykv.vk.openvk.component.video.api.jU.zp) this.rV.getNativeVideoController()).COT(null, null);
            this.cW = false;
        } else if (woN() && !this.BO.getAndSet(true)) {
            vwr();
            zp(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vDp();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        int i9;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.tG.COT()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            KVG.zp(this);
        } catch (Throwable unused2) {
        }
        this.eWG = com.bytedance.sdk.component.utils.KVG.KS(getApplicationContext());
        try {
            setContentView(zp());
            this.COT = this;
            Intent intent = getIntent();
            this.HWF = intent.getIntExtra("sdk_version", 1);
            this.ku = intent.getStringExtra("adid");
            this.YW = intent.getStringExtra("log_extra");
            this.Bj = intent.getIntExtra("source", -1);
            this.ffE = intent.getStringExtra("url");
            String stringExtra = intent.getStringExtra("web_title");
            this.YhE = intent.getStringExtra("event_tag");
            this.aax = intent.getStringExtra("gecko_id");
            this.fRl = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.dQp = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.KVG = com.bytedance.sdk.openadsdk.core.lMd.zp(new JSONObject(stringExtra3));
                    } catch (Exception unused3) {
                    }
                }
                woN won = this.KVG;
                if (won != null) {
                    this.tG = won.mW();
                }
            } else {
                woN lMd = cz.zp().lMd();
                this.KVG = lMd;
                if (lMd != null) {
                    this.tG = lMd.mW();
                }
                cz.zp().HWF();
            }
            if (this.KVG == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.aax)) {
                this.si = com.bytedance.sdk.openadsdk.jU.lMd.zp().lMd();
                int zp2 = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(this.si, this.aax);
                this.rCC = zp2;
                if (zp2 > 0) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                this.MBR = i9;
            }
            if (stringExtra2 != null) {
                try {
                    this.Pxi = com.bytedance.sdk.openadsdk.multipro.lMd.zp.zp(new JSONObject(stringExtra2));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.lMd.zp zpVar = this.Pxi;
                if (zpVar != null) {
                    this.dQp = zpVar.QR;
                }
            }
            if (bundle != null) {
                String string = bundle.getString("material_meta");
                if (this.KVG == null) {
                    try {
                        this.KVG = com.bytedance.sdk.openadsdk.core.lMd.zp(new JSONObject(string));
                    } catch (Throwable unused5) {
                    }
                }
                long j7 = bundle.getLong("video_play_position");
                if (j7 > 0) {
                    this.dQp = j7;
                }
            }
            KS();
            YW();
            tG();
            zp(4);
            if (this.zp != null) {
                com.bytedance.sdk.openadsdk.core.widget.zp.KS.zp(this.COT).zp(true).lMd(false).zp(this.zp.getWebView());
                dT zp3 = new dT(this.KVG, this.zp.getWebView(), new YW() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.lMd.YW
                    public void zp(int i10) {
                        KS.zp.zp(TTVideoLandingPageActivity.this.rCC, TTVideoLandingPageActivity.this.gH.get(), TTVideoLandingPageActivity.this.Rh.get(), TTVideoLandingPageActivity.this.DY.get() - TTVideoLandingPageActivity.this.Rh.get(), TTVideoLandingPageActivity.this.KVG, "landingpage_split_screen", i10);
                    }
                }, this.MBR).zp(true);
                this.oKZ = zp3;
                zp3.zp("landingpage_split_screen");
            }
            SSWebView sSWebView = this.zp;
            if (sSWebView != null) {
                sSWebView.setLandingPage(true);
                this.zp.setTag("landingpage_split_screen");
                this.zp.setMaterialMeta(this.KVG.hl());
                this.zp.setWebViewClient(new COT(this.COT, this.dT, this.ku, this.oKZ, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.aax)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.DY.incrementAndGet();
                            WebResourceResponseModel zp4 = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(TTVideoLandingPageActivity.this.si, TTVideoLandingPageActivity.this.aax, str);
                            if (zp4 != null && zp4.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.Rh.incrementAndGet();
                                return zp4.getWebResourceResponse();
                            }
                            if (zp4 != null && zp4.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.gH.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th) {
                            tG.zp("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                SSWebView sSWebView2 = this.zp;
                sSWebView2.setUserAgentString(dQp.zp(sSWebView2.getWebView(), this.HWF));
            }
            SSWebView sSWebView3 = this.zp;
            if (sSWebView3 != null) {
                sSWebView3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.KVG, "landingpage_split_screen", this.MBR);
            com.bytedance.sdk.openadsdk.utils.woN.zp(this.zp, this.ffE);
            this.zp.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.dT, this.oKZ) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.jU, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                }
            });
            this.zp.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j9) {
                    com.com.bytedance.overseas.sdk.zp.KS ks = TTVideoLandingPageActivity.this.QUv;
                    if (ks != null) {
                        ks.jU();
                    }
                }
            });
            TextView textView = this.jU;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = com.bytedance.sdk.component.utils.cz.zp(this, "tt_web_title_default");
                }
                textView.setText(stringExtra);
            }
            dT();
            jU();
            vDp();
            KS.zp.zp(SystemClock.elapsedRealtime() - elapsedRealtime, this.KVG, "landingpage_split_screen", this.si, this.aax);
        } catch (Throwable unused6) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Bj();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.KVG.HWF(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.zp;
        if (sSWebView != null) {
            irS.zp(sSWebView.getWebView());
        }
        this.zp = null;
        RCv rCv = this.dT;
        if (rCv != null) {
            rCv.Bj();
        }
        NativeVideoTsView nativeVideoTsView = this.rV;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            this.rV.getNativeVideoController().jU();
        }
        this.rV = null;
        this.KVG = null;
        dT dTVar = this.oKZ;
        if (dTVar != null) {
            dTVar.KS(true);
        }
        if (!TextUtils.isEmpty(this.aax)) {
            KS.zp.zp(this.Rh.get(), this.DY.get(), this.KVG);
        }
        com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(this.si);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        dQp();
        NativeVideoTsView nativeVideoTsView = this.rV;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            zp(this.rV.getNativeVideoController());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.UPs) {
            rV();
        }
        this.UPs = false;
        RCv rCv = this.dT;
        if (rCv != null) {
            rCv.dT();
        }
        dT dTVar = this.oKZ;
        if (dTVar != null) {
            dTVar.QR();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        woN won = this.KVG;
        if (won != null) {
            str = won.Eg().toString();
        } else {
            str = null;
        }
        bundle.putString("material_meta", str);
        bundle.putLong("video_play_position", this.dQp);
        bundle.putBoolean("is_complete", this.WNy);
        long j7 = this.dQp;
        NativeVideoTsView nativeVideoTsView = this.rV;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            j7 = this.rV.getNativeVideoController().COT();
        }
        bundle.putLong("video_play_position", j7);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.KS.zp(this, this.KVG);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        dT dTVar = this.oKZ;
        if (dTVar != null) {
            dTVar.ku();
        }
    }

    public abstract View zp();

    private void zp(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.irS) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.irS != null && !tTVideoLandingPageActivity.isFinishing()) {
                    TTVideoLandingPageActivity.this.irS.setText(str);
                }
            }
        });
    }

    public long HWF() {
        NativeVideoTsView nativeVideoTsView = this.rV;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0L;
        }
        return this.rV.getNativeVideoController().ku();
    }

    public void KS() {
        this.Gzh = (PangleViewStub) findViewById(vDp.qtv);
        this.zp = (SSWebView) findViewById(vDp.si);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.lMd = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObject;
                    SSWebView sSWebView = TTVideoLandingPageActivity.this.zp;
                    if (sSWebView != null) {
                        if (sSWebView.COT()) {
                            TTVideoLandingPageActivity.this.zp.HWF();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.woN()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        NativeVideoTsView nativeVideoTsView = TTVideoLandingPageActivity.this.rV;
                        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObject = YhE.zp(tTVideoLandingPageActivity.KVG, tTVideoLandingPageActivity.rV.getNativeVideoController().HWF(), TTVideoLandingPageActivity.this.rV.getNativeVideoController().vDp());
                        } else {
                            jSONObject = null;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(tTVideoLandingPageActivity2.KVG, "embeded_ad", "detail_back", tTVideoLandingPageActivity2.HWF(), TTVideoLandingPageActivity.this.QR(), jSONObject2, (QR) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.rV;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.fRl);
        }
        ImageView imageView2 = (ImageView) findViewById(vDp.Pxi);
        this.KS = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObject;
                    NativeVideoTsView nativeVideoTsView2 = TTVideoLandingPageActivity.this.rV;
                    if (nativeVideoTsView2 != null) {
                        if (nativeVideoTsView2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObject = YhE.zp(tTVideoLandingPageActivity.KVG, tTVideoLandingPageActivity.rV.getNativeVideoController().HWF(), TTVideoLandingPageActivity.this.rV.getNativeVideoController().vDp());
                        } else {
                            jSONObject = null;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(tTVideoLandingPageActivity2.KVG, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.HWF(), TTVideoLandingPageActivity.this.QR(), jSONObject2, (QR) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.jU = (TextView) findViewById(vDp.Ml);
        this.vDp = (FrameLayout) findViewById(vDp.eWG);
        this.ot = (RelativeLayout) findViewById(vDp.oKZ);
        this.yRU = (TextView) findViewById(vDp.Iv);
        this.RCv = (TextView) findViewById(vDp.aax);
        this.Lij = (TextView) findViewById(vDp.Rg);
        this.ox = (CornerIV) findViewById(vDp.BO);
        ku();
    }

    public void jU() {
        if (COT()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.COT, this.KVG, true, null);
                this.rV = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.rV.getNativeVideoController().zp(false);
                }
                if (this.WNy) {
                    this.vDp.setVisibility(0);
                    this.vDp.removeAllViews();
                    this.vDp.addView(this.rV);
                    this.rV.lMd(true);
                } else {
                    if (!this.fRl) {
                        this.dQp = 0L;
                    }
                    if (this.Pxi != null && this.rV.getNativeVideoController() != null) {
                        this.rV.getNativeVideoController().lMd(this.Pxi.QR);
                        this.rV.getNativeVideoController().KS(this.Pxi.COT);
                        this.rV.setIsQuiet(KVG.jU().KS(String.valueOf(this.KVG.FGx())));
                    }
                    if (this.rV.zp(this.dQp, this.UPs, this.WNy)) {
                        this.vDp.setVisibility(0);
                        this.vDp.removeAllViews();
                        this.vDp.addView(this.rV);
                    }
                    if (this.rV.getNativeVideoController() != null) {
                        this.rV.getNativeVideoController().zp(false);
                        this.rV.getNativeVideoController().zp(this.oB);
                    }
                }
                String zp2 = this.KVG.Rg().get(0).zp();
                com.bytedance.sdk.openadsdk.HWF.jU.zp().zp(zp2).zp(this.KVG.Rg().get(0).lMd()).lMd(this.KVG.Rg().get(0).KS()).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).KS(2).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(this.KVG, zp2, new com.bytedance.sdk.component.COT.KVG<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(int i9, String str, @Nullable Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.COT.KVG
                    public void zp(Bj<Bitmap> bj) {
                        try {
                            new zp(bj.lMd(), TTVideoLandingPageActivity.this.rV.getNativeVideoController().tG()).execute(new Void[0]);
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.rV.findViewById(520093726).setOnTouchListener(null);
                this.rV.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e4) {
                tG.zp("TTVideoLandingPage", e4.getMessage());
                if (this.rV == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e4);
                }
            }
            if (this.eWG == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.cz.lMd(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public String lMd() {
        woN won = this.KVG;
        if (won != null && !TextUtils.isEmpty(won.oB())) {
            this.FP = this.KVG.oB();
        }
        return this.FP;
    }

    private void zp(com.bykv.vk.openvk.component.video.api.jU.KS ks) {
        this.WNy = this.WNy || ks.dQp();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.WNy));
        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(ks.COT()));
        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(ks.HWF() + ks.ku()));
        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_duration", Long.valueOf(ks.ku()));
    }

    private void zp(final int i9) {
        if (this.KS == null || !woN()) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                WNy.zp((View) TTVideoLandingPageActivity.this.KS, i9);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.QR.jU
    public void zp(boolean z8, JSONArray jSONArray) {
        if (!z8 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.Iv = jSONArray;
    }
}
