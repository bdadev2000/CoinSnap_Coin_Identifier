package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
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
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.zB;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.e;

/* loaded from: classes.dex */
public class rkt implements Handler.Callback {
    FrameLayout AlY;
    private boolean BPI;
    private long Cfr;
    private int Cqy;
    final Wwa DSW;
    private Handler EH;
    com.bytedance.sdk.openadsdk.core.Sg.YFl GA;
    private int GS;
    private ImageView Ga;
    private int Ld;
    private hQ Ne;
    ObjectAnimator NjR;
    private final View Sco;
    FrameLayout Sg;
    private boolean UI;
    private com.bytedance.sdk.openadsdk.common.eT UZM;
    private com.bytedance.sdk.openadsdk.common.tN VB;
    private com.bytedance.sdk.component.NjR.AlY VOe;
    private TextView Wwa;
    ImageView YFl;
    private View YI;
    e YoT;
    private com.bytedance.sdk.openadsdk.core.widget.lG aIu;
    private FrameLayout bZ;
    private View dXO;
    ObjectAnimator eT;
    private ILoader fIu;
    private String ko;
    private View lG;
    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc lu;
    private com.bytedance.sdk.openadsdk.AlY.eT mB;
    private String mn;

    /* renamed from: nc, reason: collision with root package name */
    ObjectAnimator f10715nc;
    com.bytedance.sdk.openadsdk.core.Sg.Sg pDU;
    private final Activity pq;
    private TextView qO;
    FrameLayout qsH;
    private View rkt;
    TextView tN;

    /* renamed from: vc, reason: collision with root package name */
    RelativeLayout f10716vc;
    View wN;
    private TextView wXo;
    private final com.bytedance.sdk.openadsdk.core.GA.AlY.Sg zB;
    private com.bytedance.sdk.openadsdk.core.widget.YFl.wN zG;
    private final AtomicBoolean hQ = new AtomicBoolean(false);
    private final AtomicBoolean ZU = new AtomicBoolean(false);
    private volatile int iY = 0;
    private volatile int Bh = 0;
    private volatile int dGX = 0;

    /* loaded from: classes.dex */
    public static class Sg implements com.bytedance.sdk.openadsdk.AlY.nc {
        private final WeakReference<rkt> AlY;
        private final Wwa Sg;
        private final int YFl;
        private final String tN;

        public Sg(int i10, Wwa wwa, String str, rkt rktVar) {
            this.YFl = i10;
            this.Sg = wwa;
            this.tN = str;
            this.AlY = new WeakReference<>(rktVar);
        }

        @Override // com.bytedance.sdk.openadsdk.AlY.nc
        public void YFl(int i10) {
            rkt rktVar = this.AlY.get();
            if (rktVar != null) {
                tN.YFl.YFl(this.YFl, rktVar.dGX, rktVar.Bh, rktVar.iY - rktVar.Bh, this.Sg, this.tN, i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements com.bytedance.sdk.component.wN.qsH {
        @Override // com.bytedance.sdk.component.wN.qsH
        public Bitmap YFl(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.AlY.YFl.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), bitmap, 25);
        }
    }

    public rkt(Activity activity, final Wwa wwa, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2, View view) {
        int i10;
        this.pq = activity;
        this.DSW = wwa;
        this.mn = str;
        this.zB = sg2;
        this.Sco = view;
        this.GS = Sco.YFl(str);
        if (wwa != null) {
            this.ko = wwa.DjU();
        }
        if (!TextUtils.isEmpty(this.ko)) {
            this.fIu = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().Sg();
            int YFl2 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.fIu, this.ko);
            this.Ld = YFl2;
            if (YFl2 > 0) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.Cqy = i10;
        }
        boolean tN = tN(wwa);
        boolean AlY = AlY(wwa);
        if (Sg(wwa)) {
            this.mn = "landingpage_split_screen";
        } else if (tN) {
            this.mn = "landingpage_direct";
        } else if (AlY) {
            this.mn = "aggregate_page";
        }
        this.GA = new com.bytedance.sdk.openadsdk.core.Sg.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), wwa, this.mn, Sco.YFl(str));
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        this.GA.YFl(hashMap);
        View findViewById = activity.findViewById(R.id.content);
        this.GA.YFl(findViewById);
        com.bytedance.sdk.openadsdk.core.Sg.Sg sg3 = new com.bytedance.sdk.openadsdk.core.Sg.Sg(activity, wwa, this.mn, Sco.YFl(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.1
            @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg
            public boolean YFl(nc ncVar, Map<String, Object> map) {
                if (rkt.DSW(wwa) && rkt.this.zG != null) {
                    rkt.this.zG.YFl(ncVar);
                    rkt.this.zG.YFl(map);
                    if (rkt.vc(rkt.this.DSW) || rkt.this.BPI) {
                        return true;
                    }
                }
                return super.YFl(ncVar, map);
            }
        };
        this.pDU = sg3;
        sg3.YFl(hashMap);
        this.pDU.YFl(findViewById);
        this.qsH = frameLayout;
        if (tN || AlY) {
            try {
                Handler handler = new Handler(Looper.getMainLooper(), this);
                this.EH = handler;
                handler.sendMessage(handler.obtainMessage(100, 0, 0));
            } catch (Exception e2) {
                Log.e("LandingPageModel", "LandingPageModel: ", e2);
            }
        }
    }

    public static /* synthetic */ int GA(rkt rktVar) {
        int i10 = rktVar.dGX;
        rktVar.dGX = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int YoT(rkt rktVar) {
        int i10 = rktVar.Bh;
        rktVar.Bh = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int nc(rkt rktVar) {
        int i10 = rktVar.iY;
        rktVar.iY = i10 + 1;
        return i10;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        long j3;
        Wwa wwa;
        Wwa wwa2;
        if (message.what == 100) {
            int i10 = message.arg1;
            if (tN(this.DSW) && (wwa2 = this.DSW) != null && wwa2.NjR() != null) {
                j3 = this.DSW.NjR().Sg();
            } else if (AlY(this.DSW) && (wwa = this.DSW) != null && wwa.NjR() != null) {
                j3 = this.DSW.NjR().AlY();
            } else {
                j3 = 20;
            }
            e eVar = this.YoT;
            if (eVar != null) {
                eVar.YFl(i10 * 1000, j3 * 1000);
            }
            long j10 = i10;
            if (j10 >= j3) {
                e eVar2 = this.YoT;
                if (eVar2 != null) {
                    eVar2.YFl(j3 * 1000, 100);
                }
            } else if (j10 < j3 && this.EH != null) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i10 + 1;
                this.EH.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }

    public static boolean AlY(Wwa wwa) {
        return wwa != null && wwa.rkt() == 33;
    }

    public static boolean DSW(Wwa wwa) {
        if (wwa != null) {
            return wwa.rkt() == 19 || wwa.rkt() == 20;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean EH() {
        return Wwa.wN(this.DSW);
    }

    private void GA() {
        if ((tN(this.DSW) || AlY(this.DSW)) && (this.pq instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.Sg)) {
            this.zB.eT();
            this.zB.YoT();
        }
    }

    private void NjR() {
        hQ hQVar = new hQ(this.pq);
        this.Ne = hQVar;
        hQVar.Sg(this.VOe).tN(this.DSW.zz()).AlY(this.DSW.uGS()).YFl(this.DSW).Sg(AlY(this.DSW) ? this.GS : -1).YFl(this.DSW.GS()).Sg(this.mn).wN(this.DSW.cC()).YFl(this.VOe).YFl(new com.bytedance.sdk.openadsdk.core.widget.vc() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.vc
            public void YFl() {
                if (rkt.AlY(rkt.this.DSW) && (rkt.this.pq instanceof com.bytedance.sdk.openadsdk.core.GA.AlY.Sg)) {
                    ((com.bytedance.sdk.openadsdk.core.GA.AlY.Sg) rkt.this.pq).c_();
                } else if (rkt.this.zG != null) {
                    rkt.this.zG.Sg();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void YoT() {
        if (this.hQ.get()) {
            return;
        }
        GA();
        this.ZU.set(true);
        this.zB.qsH();
        com.bytedance.sdk.openadsdk.common.eT eTVar = this.UZM;
        if (eTVar != null) {
            eTVar.Sg();
        }
        if (AlY(this.DSW)) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), this.DSW, this.mn, "show_agg_backup");
            View view = this.lG;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.lG.getLayoutParams();
                layoutParams.addRule(13);
                layoutParams.addRule(10, 0);
                this.lG.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = this.f10716vc;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.2
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
        this.rkt.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.rkt.getLayoutParams();
        layoutParams2.addRule(13);
        layoutParams2.addRule(10, 0);
        this.rkt.setLayoutParams(layoutParams2);
        if (this.DSW.dGX() != null && !TextUtils.isEmpty(this.DSW.dGX().YFl())) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.DSW.dGX().YFl(), this.DSW.dGX().Sg(), this.DSW.dGX().tN(), this.aIu, this.DSW);
        }
        this.Wwa.setText(this.DSW.zG());
        this.qO.setText(this.DSW.dd());
        if (this.wXo != null) {
            Sg();
            this.wXo.setClickable(true);
            this.wXo.setOnClickListener(this.GA);
            this.wXo.setOnTouchListener(this.GA);
        }
    }

    private void eT() {
        this.f10716vc.setVisibility(8);
        if (tN(this.DSW) || AlY(this.DSW) || !tN()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.eT = ofFloat;
        ofFloat.setDuration(100L);
        this.eT.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.13
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) rkt.this.bZ.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                rkt.this.YFl((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                rkt.this.bZ.setLayoutParams(layoutParams);
            }
        });
        this.eT.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nc() {
        if (this.hQ.get() || this.ZU.get()) {
            return;
        }
        this.hQ.set(true);
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.DSW, this.mn, System.currentTimeMillis() - this.Cfr, true);
        eT();
    }

    private void pDU() {
        if (tN()) {
            this.YI.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.Ga, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.NjR = duration;
            duration.setRepeatMode(2);
            this.NjR.setRepeatCount(-1);
            this.NjR.start();
            this.YI.setClickable(true);
            this.YI.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!rkt.this.BPI) {
                        rkt.this.pDU.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    rkt.this.f10715nc = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    rkt.this.f10715nc.setDuration(200L);
                    rkt.this.f10715nc.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.3.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) rkt.this.bZ.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            rkt.this.YFl((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            rkt.this.bZ.setLayoutParams(layoutParams);
                        }
                    });
                    if (rkt.this.pDU.DSW()) {
                        rkt.this.YI.performClick();
                        rkt.this.BPI = true;
                    }
                    rkt.this.f10715nc.start();
                    rkt.this.YI.setVisibility(8);
                    return true;
                }
            });
            this.YI.setOnClickListener(this.pDU);
        }
        if (!EH()) {
            this.qsH.setVisibility(8);
            this.Sg.setVisibility(0);
            this.YFl.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.YFl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    rkt rktVar = rkt.this;
                    com.bytedance.sdk.openadsdk.AlY.tN.Sg(rktVar.DSW, rktVar.mn);
                }
            });
            Wwa wwa = this.DSW;
            if (wwa != null && wwa.VB() != null && this.DSW.VB().size() > 0 && this.DSW.VB().get(0) != null && !TextUtils.isEmpty(this.DSW.VB().get(0).YFl())) {
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.DSW.VB().get(0), this.YFl, this.DSW);
            }
        }
        try {
            String YFl2 = this.DSW.VB().get(0).YFl();
            com.bytedance.sdk.openadsdk.NjR.AlY.YFl().YFl(YFl2).YFl(this.DSW.VB().get(0).Sg()).Sg(this.DSW.VB().get(0).tN()).wN(GS.AlY(com.bytedance.sdk.openadsdk.core.lG.YFl())).AlY(GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl())).tN(2).YFl(new YFl()).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(this.DSW, YFl2, new com.bytedance.sdk.component.wN.rkt<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.5
                @Override // com.bytedance.sdk.component.wN.rkt
                public void YFl(int i10, String str, @Nullable Throwable th2) {
                }

                @Override // com.bytedance.sdk.component.wN.rkt
                public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
                    try {
                        Bitmap Sg2 = eTVar.Sg();
                        if (Sg2 != null && eTVar.tN() != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.lG.YFl().getResources(), Sg2);
                            if (!rkt.this.EH()) {
                                rkt.this.Sg.setBackground(bitmapDrawable);
                                return;
                            }
                            rkt.this.AlY.setBackground(bitmapDrawable);
                            View nc2 = rkt.this.zB.nc();
                            if (nc2 == null || !(nc2.getParent() instanceof View)) {
                                return;
                            }
                            ((View) nc2.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void qsH() {
        com.bytedance.sdk.openadsdk.common.eT eTVar;
        com.bytedance.sdk.component.NjR.AlY alY = this.VOe;
        if (alY != null && alY.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.YFl.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()).YFl(false).Sg(false).YFl(this.VOe.getWebView());
            com.bytedance.sdk.component.NjR.AlY alY2 = this.VOe;
            if (alY2 != null && alY2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.AlY.eT YFl2 = new com.bytedance.sdk.openadsdk.AlY.eT(this.DSW, this.VOe.getWebView(), new Sg(this.Ld, this.DSW, this.mn, this), this.Cqy).YFl(true);
                this.mB = YFl2;
                YFl2.YFl(this.mn);
                com.bytedance.sdk.openadsdk.common.tN YFl3 = Sco.YFl(this.DSW, this.VOe, this.pq, this.mn);
                this.VB = YFl3;
                if (YFl3 != null) {
                    YFl3.YFl(this.mn);
                }
                Sco.YFl(this.DSW, this.VOe);
            }
            NjR();
            this.VOe.setLandingPage(true);
            this.VOe.setTag(this.mn);
            this.VOe.setMaterialMeta(this.DSW.JT());
            com.bytedance.sdk.openadsdk.core.widget.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(com.bytedance.sdk.openadsdk.core.lG.YFl(), this.Ne, this.DSW.zz(), this.VB, this.mB, true) { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.7
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    rkt.this.nc();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    rkt.this.zB.eT();
                    rkt.this.Cfr = System.currentTimeMillis();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str, String str2) {
                    boolean z10;
                    boolean z11;
                    super.onReceivedError(webView, i10, str, str2);
                    String AlY = com.bytedance.sdk.openadsdk.core.widget.YFl.wN.AlY(str2);
                    boolean z12 = true;
                    if (this.f10765vc != null) {
                        if (webView != null && str2 != null && str2.equals(webView.getUrl())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f10765vc.YFl(webView, i10, str, str2, com.bytedance.sdk.openadsdk.core.widget.YFl.wN.AlY(str2), z11);
                    }
                    if (AlY != null && AlY.startsWith("image")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (AlY == null || !AlY.startsWith("mp4")) {
                        z12 = false;
                    }
                    if (!z10 && !z12 && !rkt.this.hQ.get()) {
                        rkt.this.YoT();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        rkt.this.YoT();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(rkt.this.ko)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        rkt.nc(rkt.this);
                        WebResourceResponseModel YFl4 = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(rkt.this.fIu, rkt.this.ko, str);
                        if (YFl4 != null && YFl4.getWebResourceResponse() != null) {
                            rkt.YoT(rkt.this);
                            return YFl4.getWebResourceResponse();
                        }
                        if (YFl4 != null && YFl4.getMsg() == 2) {
                            rkt.GA(rkt.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.YoT.YFl("LandingPageModel", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.zG = wNVar;
            this.VOe.setWebViewClient(wNVar);
            this.zG.YFl(this.DSW);
            this.zG.YFl(this.mn);
            this.VOe.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.Ne, this.mB, this.VB) { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.8
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (rkt.this.pq != null && !rkt.this.pq.isFinishing() && i10 == 100) {
                        rkt.this.nc();
                    }
                    if (rkt.this.UZM != null) {
                        rkt.this.UZM.YFl(i10);
                    }
                }
            });
            if (this.lu == null) {
                this.lu = com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), this.DSW, this.mn);
            }
            this.VOe.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.9
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j3) {
                    if (rkt.this.lu != null) {
                        rkt.this.lu.AlY();
                    }
                }
            });
            com.bytedance.sdk.component.NjR.AlY alY3 = this.VOe;
            alY3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.rkt.YFl(alY3.getWebView(), BuildConfig.VERSION_CODE));
            this.VOe.setMixedContentMode(0);
            this.VOe.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.10
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    if (rkt.this.mB != null) {
                        rkt.this.mB.Sg(i11);
                    }
                }
            });
            this.VOe.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if ((!rkt.this.BPI || rkt.DSW(rkt.this.DSW)) && !rkt.AlY(rkt.this.DSW)) {
                        rkt.this.pDU.onTouch(view, motionEvent);
                    }
                    if ((!rkt.this.BPI || rkt.DSW(rkt.this.DSW)) && !rkt.AlY(rkt.this.DSW) && motionEvent.getAction() == 1 && rkt.this.pDU.DSW()) {
                        rkt.this.VOe.getWebView().performClick();
                        rkt.this.BPI = true;
                    }
                    if (rkt.this.mB != null) {
                        rkt.this.mB.YFl(motionEvent);
                    }
                    if (rkt.this.VB != null) {
                        rkt.this.VB.YFl(motionEvent);
                        return false;
                    }
                    return false;
                }
            });
            this.VOe.getWebView().setOnClickListener(this.pDU);
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.DSW, this.mn, this.Cqy);
            com.bytedance.sdk.openadsdk.utils.Wwa.YFl(this.VOe, this.DSW.Cqy());
            this.UI = true;
        }
        if (this.VOe == null || (eTVar = this.UZM) == null) {
            return;
        }
        eTVar.YFl();
    }

    public static boolean vc(Wwa wwa) {
        return (wwa == null || wwa.toy() == 1 || !DSW(wwa)) ? false : true;
    }

    public static boolean wN(Wwa wwa) {
        return tN(wwa) && !qsH(wwa);
    }

    public void Sg() {
        Wwa wwa = this.DSW;
        if (wwa == null || TextUtils.isEmpty(wwa.lL())) {
            return;
        }
        this.wXo.setText(this.DSW.lL());
    }

    public boolean tN() {
        return this.DSW.ZLB() == 15 || this.DSW.ZLB() == 16;
    }

    public void AlY() {
        FrameLayout frameLayout = this.bZ;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.dXO;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public void wN() {
        com.bytedance.sdk.component.NjR.AlY alY;
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.mB;
        if (eTVar != null && (alY = this.VOe) != null) {
            eTVar.YFl(alY);
        }
        Handler handler = this.EH;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ObjectAnimator objectAnimator = this.f10715nc;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f10715nc.cancel();
        }
        ObjectAnimator objectAnimator2 = this.eT;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.eT.cancel();
        }
        com.bytedance.sdk.openadsdk.common.eT eTVar2 = this.UZM;
        if (eTVar2 != null) {
            eTVar2.Sg();
        }
        ObjectAnimator objectAnimator3 = this.NjR;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        com.bytedance.sdk.component.NjR.AlY alY2 = this.VOe;
        if (alY2 != null) {
            zB.YFl(alY2.getWebView());
        }
        this.VOe = null;
        hQ hQVar = this.Ne;
        if (hQVar != null) {
            hQVar.eT();
        }
        com.bytedance.sdk.openadsdk.AlY.eT eTVar3 = this.mB;
        if (eTVar3 != null) {
            eTVar3.tN(true);
        }
        if (!TextUtils.isEmpty(this.ko) && this.UI) {
            tN.YFl.YFl(this.Bh, this.iY, this.DSW);
        }
        com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(this.fIu);
    }

    public static boolean Sg(Wwa wwa) {
        return wwa != null && wwa.ko() == 3 && wwa.rkt() == 6 && !Ne.Sg(wwa) && wwa.SVa() == 1 && (wwa.qjy() == 0.0f || wwa.qjy() == 100.0f);
    }

    public static boolean tN(Wwa wwa) {
        if (wwa == null) {
            return false;
        }
        if (qsH(wwa)) {
            return true;
        }
        return wwa.ko() == 3 && wwa.rkt() == 5 && !Ne.Sg(wwa) && (wwa.qjy() == 0.0f || wwa.qjy() == 100.0f);
    }

    public void DSW() {
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.mB;
        if (eTVar != null) {
            eTVar.qsH();
        }
    }

    public void YFl(e eVar) {
        this.YoT = eVar;
    }

    public void vc() {
        hQ hQVar = this.Ne;
        if (hQVar != null) {
            hQVar.nc();
        }
        com.bytedance.sdk.openadsdk.AlY.eT eTVar = this.mB;
        if (eTVar != null) {
            eTVar.DSW();
        }
    }

    public void YFl() {
        long YFl2;
        View view;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.NjR.AlY alY = (com.bytedance.sdk.component.NjR.AlY) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.wXo);
        this.VOe = alY;
        if (alY != null && !Wwa.YFl(this.DSW)) {
            this.VOe.f_();
        } else {
            GS.YFl((View) this.VOe, 8);
        }
        this.bZ = (FrameLayout) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.aIu);
        this.UZM = (com.bytedance.sdk.openadsdk.common.eT) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.UZM);
        this.YI = this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Ne);
        this.Ga = (ImageView) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.VOe);
        this.dXO = this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.zB);
        this.Sg = (FrameLayout) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Wwa);
        this.YFl = (ImageView) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.qO);
        this.f10716vc = (RelativeLayout) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.bZ);
        this.tN = (TextView) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.NZ);
        this.AlY = (FrameLayout) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.f10821nc);
        View findViewById = this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.YI);
        this.rkt = findViewById;
        if (findViewById == null) {
            this.rkt = this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.GS);
        }
        this.lG = this.pq.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Ga);
        this.Wwa = (TextView) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Cfr);
        this.qO = (TextView) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.hQ);
        this.aIu = (com.bytedance.sdk.openadsdk.core.widget.lG) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.dXO);
        this.wXo = (TextView) this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.pq);
        if (this.tN != null && this.DSW.NjR() != null) {
            this.tN.setText(this.DSW.NjR().wN());
        }
        this.wN = this.Sco.findViewById(com.bytedance.sdk.openadsdk.utils.GA.mn);
        if ((tN(this.DSW) || Sg(this.DSW) || AlY(this.DSW)) && this.DSW.NjR() != null) {
            View view2 = this.wN;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (AlY(this.DSW)) {
                YFl2 = this.DSW.NjR().tN();
            } else {
                YFl2 = this.DSW.NjR().YFl();
            }
            com.bytedance.sdk.openadsdk.core.pDU.tN().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.rkt.6
                @Override // java.lang.Runnable
                public void run() {
                    if (!rkt.this.hQ.get()) {
                        rkt rktVar = rkt.this;
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(rktVar.DSW, rktVar.mn, System.currentTimeMillis() - rkt.this.Cfr, false);
                        rkt.this.YoT();
                    }
                }
            }, YFl2 * 1000);
        }
        qsH();
        if (Sg(this.DSW)) {
            pDU();
            if (!tN()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.bZ.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.bZ.setLayoutParams(layoutParams);
            }
        }
        if ((tN(this.DSW) || AlY(this.DSW)) && (view = this.dXO) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.eT eTVar = this.UZM;
        if (eTVar != null) {
            eTVar.YFl(this.DSW);
        }
        tN.YFl.YFl(SystemClock.elapsedRealtime() - valueOf.longValue(), this.DSW, this.mn, this.fIu, this.ko);
    }

    public static boolean NjR(Wwa wwa) {
        return (wwa == null || !com.bytedance.sdk.openadsdk.core.lG.AlY().Ne() || !wwa.Sco() || Sg(wwa) || tN(wwa) || AlY(wwa)) ? false : true;
    }

    public static boolean qsH(Wwa wwa) {
        return wwa != null && wwa.rkt() == 19;
    }

    public static boolean YFl(Wwa wwa) {
        if (wwa == null || qsH(wwa)) {
            return false;
        }
        return tN(wwa) || Sg(wwa) || AlY(wwa);
    }

    public void YFl(float f10) {
        try {
            this.zB.NjR();
        } catch (Throwable unused) {
        }
    }
}
