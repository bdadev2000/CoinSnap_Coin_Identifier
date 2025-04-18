package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.EH;
import com.bytedance.sdk.openadsdk.common.GA;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.eT;
import com.bytedance.sdk.openadsdk.common.pDU;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.wN.DSW;
import com.bytedance.sdk.openadsdk.core.wN.qsH;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity {
    TTAdDislikeToast Bh;
    private PAGLogoView Bn;
    private eT Cqy;
    private long Hjb;
    private View Jc;
    private boolean RX;
    private View VB;
    private LinearLayout Vmj;
    pDU iY;

    /* renamed from: ib, reason: collision with root package name */
    private TextView f10548ib;
    private com.bytedance.sdk.openadsdk.common.tN in;
    private boolean lL;
    private TextView tQ;
    private com.bytedance.sdk.openadsdk.core.widget.YFl.wN uGS;
    private EH zz;

    /* renamed from: dd, reason: collision with root package name */
    private boolean f10547dd = false;
    final AtomicBoolean dGX = new AtomicBoolean(false);
    final AtomicBoolean Ld = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void lG() {
        TTAdDislikeToast tTAdDislikeToast;
        if (!isFinishing() && (tTAdDislikeToast = this.Bh) != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void rkt() {
        try {
            if (this.iY == null) {
                pDU pdu = new pDU(this.wN, this.rkt);
                this.iY = pdu;
                pdu.setDislikeSource("landing_page");
                this.iY.setCallback(new pDU.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void Sg(View view) {
                        TTVideoLandingPageLink2Activity.this.dGX.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void YFl(View view) {
                        TTVideoLandingPageLink2Activity.this.dGX.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                    public void YFl(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.Ld.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.Ld.set(true);
                        TTVideoLandingPageLink2Activity.this.lG();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.iY);
            if (this.Bh == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.wN);
                this.Bh = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eT eTVar = this.Cqy;
        if (eTVar != null) {
            eTVar.YFl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Wwa wwa;
        com.bytedance.sdk.component.NjR.AlY alY;
        long j3;
        super.onCreate(bundle);
        if (com.bytedance.sdk.openadsdk.core.pDU.wN() && (wwa = this.rkt) != null && (alY = this.YFl) != null) {
            com.bytedance.sdk.openadsdk.common.tN YFl = Sco.YFl(wwa, alY, this.wN, this.pq);
            this.in = YFl;
            if (YFl != null) {
                YFl.YFl("landingpage_split_screen");
            }
            this.lL = lG.AlY().Ne();
            if (this.YFl.getWebView() != null) {
                this.YFl.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                    @Override // android.view.View.OnScrollChangeListener
                    public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                        com.bytedance.sdk.openadsdk.AlY.eT eTVar = TTVideoLandingPageLink2Activity.this.UI;
                        if (eTVar != null) {
                            eTVar.Sg(i11);
                        }
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.widget.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.core.widget.YFl.wN(this.wN, this.f10545nc, this.qsH, this.in, this.UI, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTVideoLandingPageLink2Activity.this.VB != null && !TTVideoLandingPageLink2Activity.this.RX) {
                            TTVideoLandingPageLink2Activity.this.VB.setVisibility(8);
                        }
                        if (TTVideoLandingPageLink2Activity.this.Vmj != null) {
                            TTVideoLandingPageLink2Activity.this.Vmj.setVisibility(0);
                        }
                        TTVideoLandingPageLink2Activity.this.f10547dd = true;
                        TTVideoLandingPageLink2Activity.this.pDU();
                        TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(tTVideoLandingPageLink2Activity.rkt, tTVideoLandingPageLink2Activity.pq, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.Hjb, true);
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.wN, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    TTVideoLandingPageLink2Activity.this.Hjb = System.currentTimeMillis();
                }
            };
            this.uGS = wNVar;
            wNVar.YFl(this.rkt);
            this.YFl.setWebViewClient(this.uGS);
            this.YFl.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.YFl.AlY(this.f10545nc, this.UI, this.in) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
                @Override // com.bytedance.sdk.openadsdk.core.widget.YFl.AlY, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (TTVideoLandingPageLink2Activity.this.lL && TTVideoLandingPageLink2Activity.this.zz != null && i10 == 100) {
                        TTVideoLandingPageLink2Activity.this.zz.YFl(webView, TTVideoLandingPageLink2Activity.this.ko);
                    }
                    if (TTVideoLandingPageLink2Activity.this.Cqy != null) {
                        TTVideoLandingPageLink2Activity.this.Cqy.YFl(i10);
                    }
                }
            });
            TextView textView = (TextView) findViewById(GA.NZ);
            if (textView != null && this.rkt.NjR() != null) {
                textView.setText(this.rkt.NjR().wN());
            }
            Wwa wwa2 = this.rkt;
            if (wwa2 != null && wwa2.NjR() != null) {
                j3 = this.rkt.NjR().YFl() * 1000;
            } else {
                j3 = 10000;
            }
            com.bytedance.sdk.openadsdk.core.pDU.tN().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TTVideoLandingPageLink2Activity.this.RX = true;
                        if (TTVideoLandingPageLink2Activity.this.Cqy != null) {
                            TTVideoLandingPageLink2Activity.this.Cqy.Sg();
                        }
                        TTVideoLandingPageLink2Activity.this.Jc.setVisibility(0);
                        if (TTVideoLandingPageLink2Activity.this.Bn != null) {
                            TTVideoLandingPageLink2Activity.this.Bn.setVisibility(0);
                        }
                        if (!TTVideoLandingPageLink2Activity.this.f10547dd) {
                            TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                            com.bytedance.sdk.openadsdk.AlY.tN.YFl(tTVideoLandingPageLink2Activity.rkt, tTVideoLandingPageLink2Activity.pq, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.Hjb, false);
                        }
                    } catch (Exception unused) {
                    }
                }
            }, j3);
            return;
        }
        finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    public void onDestroy() {
        pDU();
        if (!this.RX && this.UI != null && this.YFl != null && this.Cqy.getVisibility() == 8) {
            this.UI.YFl(this.YFl);
        }
        super.onDestroy();
    }

    private void EH() {
        TTAdDislikeToast tTAdDislikeToast = this.Bh;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void GA() {
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.rkt, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pDU() {
        eT eTVar = this.Cqy;
        if (eTVar != null) {
            eTVar.Sg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void AlY() {
        if (wN()) {
            super.AlY();
            com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar = this.pDU;
            if (vcVar != null) {
                if (vcVar.getNativeVideoController() != null) {
                    this.pDU.getNativeVideoController().YFl(false);
                    ((com.bytedance.sdk.openadsdk.core.GA.Sg.tN) this.pDU.getNativeVideoController()).DSW(false);
                    this.YoT.setClickable(true);
                    this.YoT.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 0) {
                                TTVideoLandingPageLink2Activity.this.GA();
                                return false;
                            }
                            return false;
                        }
                    });
                }
                this.pDU.getNativeVideoController().YFl(new e() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                    @Override // l5.e
                    public void Sg(long j3, int i10) {
                    }

                    @Override // l5.e
                    public void YFl() {
                    }

                    @Override // l5.e
                    public void YFl(long j3, int i10) {
                    }

                    @Override // l5.e
                    public void YFl(long j3, long j10) {
                        if (TTVideoLandingPageLink2Activity.this.tQ != null) {
                            int max = (int) Math.max(0L, (j10 - j3) / 1000);
                            TTVideoLandingPageLink2Activity.this.tQ.setText(String.valueOf(max));
                            if (max <= 0) {
                                TTVideoLandingPageLink2Activity.this.tQ.setVisibility(8);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.rkt.VB().get(0), imageView, this.rkt);
            this.YoT.setVisibility(0);
            this.YoT.removeAllViews();
            this.YoT.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.openadsdk.AlY.tN.Sg(TTVideoLandingPageLink2Activity.this.rkt, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void NjR() {
        super.NjR();
        Wwa wwa = this.rkt;
        if (wwa != null) {
            wwa.vc(true);
        }
        TextView textView = this.f10548ib;
        if (textView != null) {
            textView.setText(Sg());
            this.f10548ib.setClickable(true);
            this.f10548ib.setOnClickListener(this.fIu);
            this.f10548ib.setOnTouchListener(this.fIu);
        }
    }

    public void YoT() {
        if (isFinishing()) {
            return;
        }
        if (this.Ld.get()) {
            EH();
            return;
        }
        if (this.iY == null) {
            rkt();
        }
        pDU pdu = this.iY;
        if (pdu != null) {
            pdu.YFl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void tN() {
        super.tN();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(qO.YFl(lG.YFl(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.YoT();
                }
            });
        }
        this.tQ = (TextView) findViewById(520093714);
        this.Cqy = (eT) findViewById(GA.Bh);
        this.VB = findViewById(GA.iY);
        this.Jc = findViewById(GA.GS);
        TextView textView2 = (TextView) findViewById(GA.Ld);
        TextView textView3 = (TextView) findViewById(GA.Cqy);
        com.bytedance.sdk.openadsdk.core.widget.lG lGVar = (com.bytedance.sdk.openadsdk.core.widget.lG) findViewById(GA.dGX);
        this.f10548ib = (TextView) findViewById(GA.VB);
        if (this.rkt.dGX() != null && !TextUtils.isEmpty(this.rkt.dGX().YFl())) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.rkt.dGX(), lGVar, this.rkt);
        }
        textView2.setText(this.rkt.zG());
        textView3.setText(this.rkt.dd());
        findViewById(GA.Jc).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.YFl(tTVideoLandingPageLink2Activity.wN, tTVideoLandingPageLink2Activity.rkt, tTVideoLandingPageLink2Activity.pq);
            }
        });
        com.bytedance.sdk.component.NjR.AlY alY = this.YFl;
        if (alY != null && alY.getWebView() != null) {
            Sco.YFl(this.rkt, this.YFl);
        }
        boolean Ne = lG.AlY().Ne();
        this.lL = Ne;
        if (Ne) {
            ((com.bytedance.sdk.openadsdk.common.GA) findViewById(GA.tQ)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(GA.ZLB);
            this.Vmj = linearLayout;
            linearLayout.setVisibility(8);
            this.zz = new EH(this, this.Vmj, this.YFl, this.rkt, "landingpage_split_screen");
            if (this.YFl.getWebView() != null) {
                this.YFl.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    float YFl = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.YFl = motionEvent.getY();
                        }
                        com.bytedance.sdk.openadsdk.AlY.eT eTVar = TTVideoLandingPageLink2Activity.this.UI;
                        if (eTVar != null) {
                            eTVar.YFl(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.in != null) {
                            TTVideoLandingPageLink2Activity.this.in.YFl(motionEvent);
                        }
                        if (motionEvent.getAction() == 2) {
                            float y4 = motionEvent.getY();
                            float f10 = this.YFl;
                            if (y4 - f10 > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.zz != null) {
                                    TTVideoLandingPageLink2Activity.this.zz.YFl();
                                }
                                return false;
                            }
                            if (y4 - f10 < -8.0f && TTVideoLandingPageLink2Activity.this.zz != null) {
                                TTVideoLandingPageLink2Activity.this.zz.Sg();
                            }
                        }
                        return false;
                    }
                });
            }
        } else if (this.YFl.getWebView() != null) {
            this.YFl.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    com.bytedance.sdk.openadsdk.AlY.eT eTVar = TTVideoLandingPageLink2Activity.this.UI;
                    if (eTVar != null) {
                        eTVar.YFl(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.in != null) {
                        TTVideoLandingPageLink2Activity.this.in.YFl(motionEvent);
                        return false;
                    }
                    return false;
                }
            });
        }
        eT eTVar = this.Cqy;
        if (eTVar != null) {
            eTVar.YFl(this.rkt);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public boolean wN() {
        int i10 = this.GA;
        return i10 == 5 || i10 == 15 || i10 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public View YFl() {
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(this);
        wNVar.setFitsSystemWindows(true);
        wNVar.setOrientation(1);
        wNVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(this);
        wNVar.addView(tNVar, new LinearLayout.LayoutParams(-1, GS.tN(this, 220.0f)));
        View tNVar2 = new com.bytedance.sdk.openadsdk.core.wN.tN(this);
        tNVar2.setId(GA.lu);
        tNVar.addView(tNVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(this);
        wNVar2.setOrientation(0);
        wNVar2.setPadding(0, GS.tN(this, 20.0f), 0, 0);
        tNVar.addView(wNVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        wNVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.EH eh2 = new com.bytedance.sdk.openadsdk.core.widget.EH(this);
        eh2.setId(520093713);
        eh2.setGravity(17);
        eh2.setText(qO.YFl(this, "tt_reward_feedback"));
        eh2.setTextColor(-1);
        eh2.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, GS.tN(this, 28.0f));
        int tN = GS.tN(this, 16.0f);
        layoutParams2.rightMargin = tN;
        layoutParams2.leftMargin = tN;
        wNVar2.addView(eh2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.widget.pDU pdu = new com.bytedance.sdk.openadsdk.core.widget.pDU(this);
        pdu.setId(GA.mB);
        pdu.setPadding(GS.tN(this, 7.0f), GS.tN(this, 7.0f), GS.tN(this, 7.0f), GS.tN(this, 7.0f));
        pdu.setImageResource(qO.AlY(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(GS.tN(this, 28.0f), GS.tN(this, 28.0f));
        layoutParams3.rightMargin = GS.tN(this, 12.0f);
        wNVar2.addView(pdu, layoutParams3);
        DSW dsw = new DSW(this);
        dsw.setVisibility(8);
        dsw.setId(GA.UI);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = GS.tN(this, 10.0f);
        wNVar.addView(dsw, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.YFl yFl = new com.bytedance.sdk.openadsdk.core.widget.YFl(this);
        yFl.setId(GA.ZU);
        yFl.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        yFl.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(GS.tN(this, 44.0f), GS.tN(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = GS.tN(this, 5.0f);
        dsw.addView(yFl, layoutParams5);
        qsH qsh = new qsH(this);
        int i10 = GA.BPI;
        qsh.setId(i10);
        qsh.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this, "tt_circle_solid_mian"));
        qsh.setGravity(17);
        qsh.setTextColor(-1);
        qsh.setTextSize(2, 19.0f);
        qsh.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(GS.tN(this, 44.0f), GS.tN(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = GS.tN(this, 5.0f);
        dsw.addView(qsh, layoutParams6);
        qsH qsh2 = new qsH(this);
        qsh2.setId(GA.zG);
        qsh2.setMaxLines(1);
        qsh2.setEllipsize(TextUtils.TruncateAt.END);
        qsh2.setTextColor(Color.parseColor("#e5000000"));
        qsh2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = GS.tN(this, 5.0f);
        layoutParams7.rightMargin = GS.tN(this, 80.0f);
        layoutParams7.addRule(1, i10);
        dsw.addView(qsh2, layoutParams7);
        qsH qsh3 = new qsH(this);
        qsh3.setId(GA.ko);
        qsh3.setClickable(true);
        qsh3.setMaxLines(1);
        qsh3.setEllipsize(TextUtils.TruncateAt.END);
        qsh3.setFocusable(true);
        qsh3.setGravity(17);
        qsh3.setText(qO.YFl(this, "tt_video_mobile_go_detail"));
        qsh3.setTextColor(-1);
        qsh3.setTextSize(2, 14.0f);
        qsh3.setPadding(GS.tN(this, 2.0f), GS.tN(this, 2.0f), GS.tN(this, 2.0f), GS.tN(this, 2.0f));
        qsh3.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(GS.tN(this, 90.0f), GS.tN(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = GS.tN(this, 5.0f);
        dsw.addView(qsh3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar3 = new com.bytedance.sdk.openadsdk.core.wN.tN(this);
        wNVar.addView(tNVar3, new LinearLayout.LayoutParams(-1, -1));
        View alY = new com.bytedance.sdk.component.NjR.AlY(this);
        alY.setId(GA.fIu);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = GS.tN(this, 2.0f);
        tNVar3.addView(alY, layoutParams9);
        DSW dsw2 = new DSW(this);
        dsw2.setId(GA.iY);
        dsw2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        tNVar3.addView(dsw2, new FrameLayout.LayoutParams(-1, -1));
        View eTVar = new eT(this);
        eTVar.setId(GA.Bh);
        dsw2.addView(eTVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar3 = new com.bytedance.sdk.openadsdk.core.wN.wN(this);
        wNVar3.setId(GA.GS);
        wNVar3.setOrientation(1);
        wNVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        dsw2.addView(wNVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.lG lGVar = new com.bytedance.sdk.openadsdk.core.widget.lG(this);
        lGVar.setId(GA.dGX);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(GS.tN(this, 80.0f), GS.tN(this, 80.0f));
        layoutParams11.gravity = 17;
        wNVar3.addView(lGVar, layoutParams11);
        qsH qsh4 = new qsH(this);
        qsh4.setId(GA.Ld);
        qsh4.setTextColor(Color.parseColor("#161823"));
        qsh4.setTextSize(0, GS.tN(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = GS.tN(this, 12.0f);
        wNVar3.addView(qsh4, layoutParams12);
        qsH qsh5 = new qsH(this);
        qsh5.setId(GA.Cqy);
        qsh5.setTextColor(Color.parseColor("#80161823"));
        qsh5.setTextSize(0, GS.tN(this, 16.0f));
        qsh5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int tN2 = GS.tN(this, 60.0f);
        layoutParams13.rightMargin = tN2;
        layoutParams13.leftMargin = tN2;
        layoutParams13.topMargin = GS.tN(this, 8.0f);
        wNVar3.addView(qsh5, layoutParams13);
        qsH qsh6 = new qsH(this);
        qsh6.setId(GA.VB);
        qsh6.setGravity(17);
        qsh6.setTextColor(-1);
        qsh6.setText(qO.YFl(this, "tt_video_mobile_go_detail"));
        qsh6.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(GS.tN(this, 255.0f), GS.tN(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = GS.tN(this, 32.0f);
        wNVar3.addView(qsh6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.Bn = pAGLogoView;
        pAGLogoView.setId(GA.Jc);
        this.Bn.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, GS.tN(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = GS.tN(this, 18.0f);
        layoutParams15.bottomMargin = GS.tN(this, 61.0f);
        dsw2.addView(this.Bn, layoutParams15);
        View ga2 = new com.bytedance.sdk.openadsdk.common.GA(this, new GA.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.GA.YFl
            public View YFl(Context context) {
                return new com.bytedance.sdk.openadsdk.common.vc(context);
            }
        });
        ga2.setId(com.bytedance.sdk.openadsdk.utils.GA.RX);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, GS.tN(this, 48.0f));
        layoutParams16.gravity = 81;
        tNVar3.addView(ga2, layoutParams16);
        View ga3 = new com.bytedance.sdk.openadsdk.common.GA(this, new GA.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.GA.YFl
            public View YFl(Context context) {
                return new com.bytedance.sdk.openadsdk.common.DSW(context);
            }
        });
        ga3.setId(com.bytedance.sdk.openadsdk.utils.GA.tQ);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, GS.tN(this, 44.0f));
        layoutParams17.gravity = 80;
        tNVar3.addView(ga3, layoutParams17);
        return wNVar;
    }
}
