package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.irS;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class dQp implements Handler.Callback {
    private com.bytedance.sdk.openadsdk.core.widget.zp.COT BO;
    ObjectAnimator Bj;
    View COT;
    private TextView FP;
    private ImageView Gzh;
    RelativeLayout HWF;
    private String Iv;
    TextView KS;
    private View KVG;
    private View Lij;
    final woN QR;
    private long QUv;
    private LandingPageLoadingLayout RCv;
    private int Rh;
    private int UPs;
    private String WNy;
    ObjectAnimator YW;
    private final Activity YhE;
    private ILoader aax;
    private TTRoundRectImageView cz;
    private Handler dQp;
    ObjectAnimator dT;
    private boolean eWG;
    private com.com.bytedance.overseas.sdk.zp.KS fRl;
    private com.bytedance.sdk.openadsdk.lMd.dT ffE;
    private int gH;
    private View irS;
    FrameLayout jU;
    FrameLayout ku;
    FrameLayout lMd;
    private boolean oKZ;
    private RCv ot;
    private FrameLayout ox;
    private TextView pvr;
    com.bytedance.sdk.openadsdk.core.lMd.lMd rV;
    com.bytedance.sdk.openadsdk.core.lMd.zp tG;
    KS.zp vDp;
    private TextView vwr;
    private View woN;
    private SSWebView yRU;
    ImageView zp;
    private final AtomicBoolean cW = new AtomicBoolean(false);
    private final AtomicBoolean Pxi = new AtomicBoolean(false);
    private volatile int Rg = 0;
    private volatile int si = 0;
    private volatile int DY = 0;

    public dQp(Activity activity, final woN won, String str, FrameLayout frameLayout) {
        int i9;
        this.YhE = activity;
        this.QR = won;
        this.WNy = str;
        this.UPs = YhE.zp(str);
        if (won != null) {
            this.Iv = won.fVt();
        }
        if (!TextUtils.isEmpty(this.Iv)) {
            this.aax = com.bytedance.sdk.openadsdk.jU.lMd.zp().lMd();
            int zp = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(this.aax, this.Iv);
            this.Rh = zp;
            if (zp > 0) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            this.gH = i9;
        }
        boolean KS = KS(won);
        boolean jU = jU(won);
        if (lMd(won)) {
            this.WNy = "landingpage_split_screen";
        } else if (KS) {
            this.WNy = "landingpage_direct";
        } else if (jU) {
            this.WNy = "aggregate_page";
        }
        this.tG = new com.bytedance.sdk.openadsdk.core.lMd.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), won, this.WNy, YhE.zp(str));
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        this.tG.zp(hashMap);
        View findViewById = activity.findViewById(R.id.content);
        this.tG.zp(findViewById);
        com.bytedance.sdk.openadsdk.core.lMd.lMd lmd = new com.bytedance.sdk.openadsdk.core.lMd.lMd(activity, won, this.WNy, YhE.zp(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.1
            @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd
            public boolean zp(YW yw, Map<String, Object> map) {
                if (dQp.QR(won) && dQp.this.BO != null) {
                    dQp.this.BO.zp(yw);
                    dQp.this.BO.zp(map);
                    if (dQp.HWF(dQp.this.QR) || dQp.this.oKZ) {
                        return true;
                    }
                }
                return super.zp(yw, map);
            }
        };
        this.rV = lmd;
        lmd.zp(hashMap);
        this.rV.zp(findViewById);
        this.ku = frameLayout;
        if (KS || jU) {
            try {
                Handler handler = new Handler(Looper.getMainLooper(), this);
                this.dQp = handler;
                handler.sendMessage(handler.obtainMessage(100, 0, 0));
            } catch (Exception e4) {
                Log.e("LandingPageModel", "LandingPageModel: ", e4);
            }
        }
    }

    public static /* synthetic */ int KVG(dQp dqp) {
        int i9 = dqp.si;
        dqp.si = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int rV(dQp dqp) {
        int i9 = dqp.Rg;
        dqp.Rg = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int woN(dQp dqp) {
        int i9 = dqp.DY;
        dqp.DY = i9 + 1;
        return i9;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        long j7;
        woN won;
        woN won2;
        if (message.what == 100) {
            int i9 = message.arg1;
            if (KS(this.QR) && (won2 = this.QR) != null && won2.ku() != null) {
                j7 = this.QR.ku().lMd();
            } else if (jU(this.QR) && (won = this.QR) != null && won.ku() != null) {
                j7 = this.QR.ku().jU();
            } else {
                j7 = 20;
            }
            KS.zp zpVar = this.vDp;
            if (zpVar != null) {
                zpVar.zp(i9 * 1000, j7 * 1000);
            }
            long j9 = i9;
            if (j9 >= j7) {
                KS.zp zpVar2 = this.vDp;
                if (zpVar2 != null) {
                    zpVar2.zp(j7 * 1000, 100);
                }
            } else if (j9 < j7 && this.dQp != null) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i9 + 1;
                this.dQp.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }

    private void Bj() {
        this.HWF.setVisibility(8);
        if (KS(this.QR) || jU(this.QR) || !KS()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.Bj = ofFloat;
        ofFloat.setDuration(100L);
        this.Bj.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.14
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dQp.this.ox.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                dQp.this.zp((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                dQp.this.ox.setLayoutParams(layoutParams);
            }
        });
        this.Bj.start();
    }

    public static boolean COT(woN won) {
        return KS(won) && !ku(won);
    }

    public static boolean HWF(woN won) {
        return (won == null || won.Ay() == 1 || !QR(won)) ? false : true;
    }

    public static boolean QR(woN won) {
        if (won != null) {
            return won.rV() == 19 || won.rV() == 20;
        }
        return false;
    }

    private void YW() {
        RCv rCv = new RCv(this.YhE);
        this.ot = rCv;
        rCv.lMd(this.yRU).KS(this.QR.fgJ()).jU(this.QR.GP()).zp(this.QR).lMd(jU(this.QR) ? this.UPs : -1).zp(this.QR.UPs()).lMd(this.WNy).COT(this.QR.dm()).zp(this.yRU).zp(new com.bytedance.sdk.openadsdk.core.widget.lMd() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.lMd
            public void zp() {
                if (dQp.jU(dQp.this.QR) && (dQp.this.YhE instanceof com.bytedance.sdk.openadsdk.core.video.KS.lMd)) {
                    ((com.bytedance.sdk.openadsdk.core.video.KS.lMd) dQp.this.YhE).vwr();
                } else if (dQp.this.BO != null) {
                    dQp.this.BO.lMd();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dQp() {
        return woN.COT(this.QR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dT() {
        if (this.cW.get() || this.Pxi.get()) {
            return;
        }
        this.cW.set(true);
        com.bytedance.sdk.openadsdk.lMd.KS.zp(this.QR, this.WNy, System.currentTimeMillis() - this.QUv, true);
        Bj();
    }

    public static boolean jU(woN won) {
        return won != null && won.rV() == 33;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void ku() {
        LandingPageLoadingLayout landingPageLoadingLayout;
        SSWebView sSWebView = this.yRU;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.zp.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()).zp(false).lMd(false).zp(this.yRU.getWebView());
            SSWebView sSWebView2 = this.yRU;
            if (sSWebView2 != null && sSWebView2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.lMd.dT zp = new com.bytedance.sdk.openadsdk.lMd.dT(this.QR, this.yRU.getWebView(), new com.bytedance.sdk.openadsdk.lMd.YW() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.8
                    @Override // com.bytedance.sdk.openadsdk.lMd.YW
                    public void zp(int i9) {
                        int i10 = dQp.this.Rh;
                        int i11 = dQp.this.DY;
                        int i12 = dQp.this.si;
                        int i13 = dQp.this.Rg - dQp.this.si;
                        dQp dqp = dQp.this;
                        KS.zp.zp(i10, i11, i12, i13, dqp.QR, dqp.WNy, i9);
                    }
                }, this.gH).zp(true);
                this.ffE = zp;
                zp.zp(this.WNy);
            }
            YW();
            this.yRU.setLandingPage(true);
            this.yRU.setTag(this.WNy);
            this.yRU.setMaterialMeta(this.QR.hl());
            com.bytedance.sdk.openadsdk.core.widget.zp.COT cot = new com.bytedance.sdk.openadsdk.core.widget.zp.COT(com.bytedance.sdk.openadsdk.core.KVG.zp(), this.ot, this.QR.fgJ(), this.ffE, true) { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.9
                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    dQp.this.dT();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (dQp.this.YhE instanceof com.bytedance.sdk.openadsdk.core.video.KS.KS) {
                        ((com.bytedance.sdk.openadsdk.core.video.KS.KS) dQp.this.YhE).lMd();
                    }
                    dQp.this.QUv = System.currentTimeMillis();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i9, String str, String str2) {
                    boolean z8;
                    boolean z9;
                    super.onReceivedError(webView, i9, str, str2);
                    String jU = com.bytedance.sdk.openadsdk.core.widget.zp.COT.jU(str2);
                    boolean z10 = false;
                    if (this.HWF != null) {
                        if (webView != null && str2 != null && str2.equals(webView.getUrl())) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.HWF.zp(webView, i9, str, str2, com.bytedance.sdk.openadsdk.core.widget.zp.COT.jU(str2), z9);
                    }
                    if (jU != null && jU.startsWith("image")) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (jU != null && jU.startsWith("mp4")) {
                        z10 = true;
                    }
                    if (!z8 && !z10 && !dQp.this.cW.get()) {
                        dQp.this.vDp();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        dQp.this.vDp();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(dQp.this.Iv)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        dQp.rV(dQp.this);
                        WebResourceResponseModel zp2 = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(dQp.this.aax, dQp.this.Iv, str);
                        if (zp2 != null && zp2.getWebResourceResponse() != null) {
                            dQp.KVG(dQp.this);
                            return zp2.getWebResourceResponse();
                        }
                        if (zp2 != null && zp2.getMsg() == 2) {
                            dQp.woN(dQp.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.tG.zp("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.BO = cot;
            this.yRU.setWebViewClient(cot);
            this.BO.zp(this.QR);
            this.BO.zp(this.WNy);
            this.yRU.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.ot, this.ffE) { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.10
                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.jU, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i9) {
                    super.onProgressChanged(webView, i9);
                    if (dQp.this.YhE != null && !dQp.this.YhE.isFinishing() && i9 == 100) {
                        dQp.this.dT();
                    }
                    if (dQp.this.RCv != null) {
                        dQp.this.RCv.zp(i9);
                    }
                }
            });
            if (this.fRl == null) {
                this.fRl = com.com.bytedance.overseas.sdk.zp.jU.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), this.QR, this.WNy);
            }
            this.yRU.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.11
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
                    if (dQp.this.fRl != null) {
                        dQp.this.fRl.jU();
                    }
                }
            });
            SSWebView sSWebView3 = this.yRU;
            sSWebView3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.dQp.zp(sSWebView3.getWebView(), 6003));
            this.yRU.setMixedContentMode(0);
            this.yRU.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.12
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if ((!dQp.this.oKZ || dQp.QR(dQp.this.QR)) && !dQp.jU(dQp.this.QR)) {
                        dQp.this.rV.onTouch(view, motionEvent);
                    }
                    if ((!dQp.this.oKZ || dQp.QR(dQp.this.QR)) && !dQp.jU(dQp.this.QR) && motionEvent.getAction() == 1 && dQp.this.rV.QR()) {
                        dQp.this.yRU.getWebView().performClick();
                        dQp.this.oKZ = true;
                    }
                    if (dQp.this.ffE != null) {
                        dQp.this.ffE.lMd(motionEvent.getActionMasked());
                        return false;
                    }
                    return false;
                }
            });
            this.yRU.getWebView().setOnClickListener(this.rV);
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.QR, this.WNy, this.gH);
            com.bytedance.sdk.openadsdk.utils.woN.zp(this.yRU, this.QR.aax());
            this.eWG = true;
        }
        if (this.yRU == null || (landingPageLoadingLayout = this.RCv) == null) {
            return;
        }
        landingPageLoadingLayout.zp();
    }

    private void rV() {
        if (KS()) {
            this.Lij.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.Gzh, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.YW = duration;
            duration.setRepeatMode(2);
            this.YW.setRepeatCount(-1);
            this.YW.start();
            this.Lij.setClickable(true);
            this.Lij.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!dQp.this.oKZ) {
                        dQp.this.rV.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    dQp.this.dT = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    dQp.this.dT.setDuration(200L);
                    dQp.this.dT.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.3.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dQp.this.ox.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            dQp.this.zp((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            dQp.this.ox.setLayoutParams(layoutParams);
                        }
                    });
                    if (dQp.this.rV.QR()) {
                        dQp.this.Lij.performClick();
                        dQp.this.oKZ = true;
                    }
                    dQp.this.dT.start();
                    dQp.this.Lij.setVisibility(8);
                    return true;
                }
            });
            this.Lij.setOnClickListener(this.rV);
        }
        if (!dQp()) {
            this.ku.setVisibility(8);
            this.lMd.setVisibility(0);
            this.zp.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.zp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dQp dqp = dQp.this;
                    com.bytedance.sdk.openadsdk.lMd.KS.KS(dqp.QR, dqp.WNy);
                }
            });
            woN won = this.QR;
            if (won != null && won.Rg() != null && this.QR.Rg().size() > 0 && this.QR.Rg().get(0) != null && !TextUtils.isEmpty(this.QR.Rg().get(0).zp())) {
                com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.QR.Rg().get(0), this.zp, this.QR);
            }
        }
        try {
            String zp = this.QR.Rg().get(0).zp();
            com.bytedance.sdk.openadsdk.HWF.jU.zp().zp(zp).zp(this.QR.Rg().get(0).lMd()).lMd(this.QR.Rg().get(0).KS()).COT(WNy.jU(com.bytedance.sdk.openadsdk.core.KVG.zp())).jU(WNy.KS(com.bytedance.sdk.openadsdk.core.KVG.zp())).KS(2).zp(new com.bytedance.sdk.component.COT.ku() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.6
                @Override // com.bytedance.sdk.component.COT.ku
                public Bitmap zp(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.jU.zp.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), bitmap, 25);
                }
            }).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(this.QR, zp, new com.bytedance.sdk.component.COT.KVG<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.5
                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(int i9, String str, @Nullable Throwable th) {
                }

                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(com.bytedance.sdk.component.COT.Bj<Bitmap> bj) {
                    try {
                        Bitmap lMd = bj.lMd();
                        if (lMd != null && bj.KS() != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.KVG.zp().getResources(), lMd);
                            if (!dQp.this.dQp()) {
                                dQp.this.lMd.setBackground(bitmapDrawable);
                                return;
                            }
                            dQp.this.jU.setBackground(bitmapDrawable);
                            View COT = dQp.this.YhE instanceof com.bytedance.sdk.openadsdk.core.video.KS.KS ? ((com.bytedance.sdk.openadsdk.core.video.KS.KS) dQp.this.YhE).COT() : null;
                            if (COT == null || !(COT.getParent() instanceof View)) {
                                return;
                            }
                            ((View) COT.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    private void tG() {
        if (KS(this.QR) || jU(this.QR)) {
            ComponentCallbacks2 componentCallbacks2 = this.YhE;
            if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.video.KS.KS) {
                ((com.bytedance.sdk.openadsdk.core.video.KS.KS) componentCallbacks2).lMd();
                ((com.bytedance.sdk.openadsdk.core.video.KS.KS) this.YhE).YW();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void vDp() {
        if (this.cW.get()) {
            return;
        }
        tG();
        this.Pxi.set(true);
        ComponentCallbacks2 componentCallbacks2 = this.YhE;
        if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.video.KS.KS) {
            ((com.bytedance.sdk.openadsdk.core.video.KS.KS) componentCallbacks2).KS();
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.RCv;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.lMd();
        }
        if (jU(this.QR)) {
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.QR, this.WNy);
            View view = this.woN;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.woN.getLayoutParams();
                layoutParams.addRule(13);
                layoutParams.addRule(10, 0);
                this.woN.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = this.HWF;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.KVG.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.KVG.getLayoutParams();
        layoutParams2.addRule(13);
        layoutParams2.addRule(10, 0);
        this.KVG.setLayoutParams(layoutParams2);
        if (this.QR.BO() != null && !TextUtils.isEmpty(this.QR.BO().zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.QR.BO().zp(), this.QR.BO().lMd(), this.QR.BO().KS(), this.cz, this.QR);
        }
        this.vwr.setText(this.QR.Pxi());
        this.pvr.setText(this.QR.MBR());
        if (this.FP != null) {
            lMd();
            this.FP.setClickable(true);
            this.FP.setOnClickListener(this.tG);
            this.FP.setOnTouchListener(this.tG);
        }
    }

    public boolean KS() {
        return this.QR.mW() == 15 || this.QR.mW() == 16;
    }

    public void lMd() {
        woN won = this.QR;
        if (won == null || TextUtils.isEmpty(won.oB())) {
            return;
        }
        this.FP.setText(this.QR.oB());
    }

    public void COT() {
        SSWebView sSWebView;
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.ffE;
        if (dTVar != null && (sSWebView = this.yRU) != null) {
            dTVar.zp(sSWebView);
        }
        Handler handler = this.dQp;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ObjectAnimator objectAnimator = this.dT;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.dT.cancel();
        }
        ObjectAnimator objectAnimator2 = this.Bj;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.Bj.cancel();
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.RCv;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.lMd();
        }
        ObjectAnimator objectAnimator3 = this.YW;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        SSWebView sSWebView2 = this.yRU;
        if (sSWebView2 != null) {
            irS.zp(sSWebView2.getWebView());
        }
        this.yRU = null;
        RCv rCv = this.ot;
        if (rCv != null) {
            rCv.Bj();
        }
        com.bytedance.sdk.openadsdk.lMd.dT dTVar2 = this.ffE;
        if (dTVar2 != null) {
            dTVar2.KS(true);
        }
        if (!TextUtils.isEmpty(this.Iv) && this.eWG) {
            KS.zp.zp(this.si, this.Rg, this.QR);
        }
        com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(this.aax);
    }

    public void jU() {
        FrameLayout frameLayout = this.ox;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.irS;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public static boolean KS(woN won) {
        if (won == null) {
            return false;
        }
        if (ku(won)) {
            return true;
        }
        return won.oKZ() == 3 && won.rV() == 5 && !cz.lMd(won) && (won.CZ() == 0.0f || won.CZ() == 100.0f);
    }

    public static boolean lMd(woN won) {
        return won != null && won.oKZ() == 3 && won.rV() == 6 && !cz.lMd(won) && won.bX() == 1 && (won.CZ() == 0.0f || won.CZ() == 100.0f);
    }

    public void HWF() {
        RCv rCv = this.ot;
        if (rCv != null) {
            rCv.dT();
        }
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.ffE;
        if (dTVar != null) {
            dTVar.QR();
        }
    }

    public void QR() {
        com.bytedance.sdk.openadsdk.lMd.dT dTVar = this.ffE;
        if (dTVar != null) {
            dTVar.ku();
        }
    }

    public void zp(KS.zp zpVar) {
        this.vDp = zpVar;
    }

    public void zp() {
        long zp;
        View view;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        SSWebView sSWebView = (SSWebView) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.FP);
        this.yRU = sSWebView;
        if (sSWebView != null && !woN.zp(this.QR)) {
            this.yRU.d_();
        } else {
            WNy.zp((View) this.yRU, 8);
        }
        this.ox = (FrameLayout) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.cz);
        this.RCv = (LandingPageLoadingLayout) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.RCv);
        this.Lij = this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.ot);
        this.Gzh = (ImageView) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.yRU);
        this.irS = this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.UPs);
        this.lMd = (FrameLayout) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.vwr);
        this.zp = (ImageView) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.pvr);
        this.HWF = (RelativeLayout) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.ox);
        this.KS = (TextView) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.VTk);
        this.jU = (FrameLayout) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.dT);
        View findViewById = this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.Lij);
        this.KVG = findViewById;
        if (findViewById == null) {
            this.KVG = this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.ffE);
        }
        this.woN = this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.Gzh);
        this.vwr = (TextView) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.QUv);
        this.pvr = (TextView) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.cW);
        this.cz = (TTRoundRectImageView) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.irS);
        this.FP = (TextView) this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.YhE);
        if (this.KS != null && this.QR.ku() != null) {
            this.KS.setText(this.QR.ku().COT());
        }
        this.COT = this.YhE.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.WNy);
        if ((KS(this.QR) || lMd(this.QR) || jU(this.QR)) && this.QR.ku() != null) {
            View view2 = this.COT;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (jU(this.QR)) {
                zp = this.QR.ku().KS();
            } else {
                zp = this.QR.ku().zp();
            }
            com.bytedance.sdk.openadsdk.core.tG.KS().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.dQp.7
                @Override // java.lang.Runnable
                public void run() {
                    if (!dQp.this.cW.get()) {
                        dQp dqp = dQp.this;
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(dqp.QR, dqp.WNy, System.currentTimeMillis() - dQp.this.QUv, false);
                        dQp.this.vDp();
                    }
                }
            }, zp * 1000);
        }
        ku();
        if (lMd(this.QR)) {
            rV();
            if (!KS()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ox.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.ox.setLayoutParams(layoutParams);
            }
        }
        if ((KS(this.QR) || jU(this.QR)) && (view = this.irS) != null) {
            view.setVisibility(8);
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.RCv;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.zp(this.QR, this.WNy);
        }
        KS.zp.zp(SystemClock.elapsedRealtime() - elapsedRealtime, this.QR, this.WNy, this.aax, this.Iv);
    }

    public static boolean YW(woN won) {
        return (won == null || !com.bytedance.sdk.openadsdk.core.KVG.jU().yRU() || !won.WNy() || lMd(won) || KS(won) || jU(won)) ? false : true;
    }

    public static boolean ku(woN won) {
        return won != null && won.rV() == 19;
    }

    public static boolean zp(woN won) {
        if (won == null || ku(won)) {
            return false;
        }
        return KS(won) || lMd(won) || jU(won);
    }

    public void zp(float f9) {
        try {
            ((com.bytedance.sdk.openadsdk.core.video.KS.KS) this.YhE).jU();
        } catch (Throwable unused) {
        }
    }
}
