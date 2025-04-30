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
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.QR.jU;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserDownloadButton;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewBottomBar;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.ku;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.zp.COT;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.lMd.dT;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements jU {
    TTAdDislikeToast DY;
    private View MBR;
    private TextView Vjb;
    private LinearLayout fVt;
    private boolean fgJ;
    private long fs;
    private boolean mW;
    private View oB;
    private TextView qtv;
    private LandingPageLoadingLayout rCC;
    TTAdDislikeDialog si;
    private ku sqt;
    private boolean GP = false;
    final AtomicBoolean Rh = new AtomicBoolean(false);
    final AtomicBoolean gH = new AtomicBoolean(false);

    private void KVG() {
        try {
            if (this.si == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.COT, this.KVG);
                this.si = tTAdDislikeDialog;
                tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void lMd(View view) {
                        TTVideoLandingPageLink2Activity.this.Rh.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void zp(View view) {
                        TTVideoLandingPageLink2Activity.this.Rh.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                    public void zp(int i9, FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.gH.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.gH.set(true);
                        TTVideoLandingPageLink2Activity.this.woN();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.si);
            if (this.DY == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.COT);
                this.DY = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    private void dQp() {
        TTAdDislikeToast tTAdDislikeToast = this.DY;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.zp(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rV() {
        LandingPageLoadingLayout landingPageLoadingLayout = this.rCC;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.lMd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void woN() {
        TTAdDislikeToast tTAdDislikeToast;
        if (!isFinishing() && (tTAdDislikeToast = this.DY) != null) {
            tTAdDislikeToast.zp(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LandingPageLoadingLayout landingPageLoadingLayout = this.rCC;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.zp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        long j7;
        super.onCreate(bundle);
        if (tG.COT() && this.KVG != null && this.zp != null) {
            this.mW = KVG.jU().yRU();
            this.zp.setWebViewClient(new COT(this.COT, this.dT, this.ku, this.oKZ, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTVideoLandingPageLink2Activity.this.MBR != null && !TTVideoLandingPageLink2Activity.this.fgJ) {
                            TTVideoLandingPageLink2Activity.this.MBR.setVisibility(8);
                        }
                        if (TTVideoLandingPageLink2Activity.this.fVt != null) {
                            TTVideoLandingPageLink2Activity.this.fVt.setVisibility(0);
                        }
                        TTVideoLandingPageLink2Activity.this.GP = true;
                        TTVideoLandingPageLink2Activity.this.rV();
                        TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                        KS.zp(tTVideoLandingPageLink2Activity.KVG, tTVideoLandingPageLink2Activity.YhE, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.fs, true);
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.COT, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    TTVideoLandingPageLink2Activity.this.fs = System.currentTimeMillis();
                }
            });
            this.zp.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.zp.jU(this.dT, this.oKZ) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                @Override // com.bytedance.sdk.openadsdk.core.widget.zp.jU, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i9) {
                    super.onProgressChanged(webView, i9);
                    if (TTVideoLandingPageLink2Activity.this.mW && TTVideoLandingPageLink2Activity.this.sqt != null && i9 == 100) {
                        TTVideoLandingPageLink2Activity.this.sqt.zp(webView);
                    }
                    if (TTVideoLandingPageLink2Activity.this.rCC != null) {
                        TTVideoLandingPageLink2Activity.this.rCC.zp(i9);
                    }
                }
            });
            TextView textView = (TextView) findViewById(vDp.VTk);
            if (textView != null && this.KVG.ku() != null) {
                textView.setText(this.KVG.ku().COT());
            }
            woN won = this.KVG;
            if (won != null && won.ku() != null) {
                j7 = this.KVG.ku().zp() * 1000;
            } else {
                j7 = 10000;
            }
            tG.KS().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TTVideoLandingPageLink2Activity.this.fgJ = true;
                        if (TTVideoLandingPageLink2Activity.this.rCC != null) {
                            TTVideoLandingPageLink2Activity.this.rCC.lMd();
                        }
                        TTVideoLandingPageLink2Activity.this.oB.setVisibility(0);
                        if (!TTVideoLandingPageLink2Activity.this.GP) {
                            TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                            KS.zp(tTVideoLandingPageLink2Activity.KVG, tTVideoLandingPageLink2Activity.YhE, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.fs, false);
                        }
                    } catch (Exception unused) {
                    }
                }
            }, j7);
            return;
        }
        finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    public void onDestroy() {
        rV();
        if (!this.fgJ && this.oKZ != null && this.zp != null && this.rCC.getVisibility() == 8) {
            this.oKZ.zp(this.zp);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tG() {
        KS.zp(this.KVG, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public boolean COT() {
        int i9 = this.tG;
        return i9 == 5 || i9 == 15 || i9 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void KS() {
        super.KS();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(cz.zp(KVG.zp(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.vDp();
                }
            });
        }
        this.qtv = (TextView) findViewById(520093714);
        this.rCC = (LandingPageLoadingLayout) findViewById(vDp.Rh);
        this.MBR = findViewById(vDp.DY);
        this.oB = findViewById(vDp.ffE);
        TextView textView2 = (TextView) findViewById(vDp.rCC);
        TextView textView3 = (TextView) findViewById(vDp.MBR);
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) findViewById(vDp.gH);
        this.Vjb = (TextView) findViewById(vDp.oB);
        if (this.KVG.BO() != null && !TextUtils.isEmpty(this.KVG.BO().zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.KVG.BO(), tTRoundRectImageView, this.KVG);
        }
        textView2.setText(this.KVG.Pxi());
        textView3.setText(this.KVG.MBR());
        findViewById(vDp.fgJ).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.zp(tTVideoLandingPageLink2Activity.COT, tTVideoLandingPageLink2Activity.KVG, tTVideoLandingPageLink2Activity.YhE);
            }
        });
        boolean yRU = KVG.jU().yRU();
        this.mW = yRU;
        if (yRU) {
            ((PangleViewStub) findViewById(vDp.Vjb)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(vDp.bX);
            this.fVt = linearLayout;
            linearLayout.setVisibility(8);
            this.sqt = new ku(this, this.fVt, this.zp, this.KVG, "landingpage_split_screen");
            if (this.zp.getWebView() != null) {
                this.zp.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                    float zp = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.zp = motionEvent.getY();
                        }
                        dT dTVar = TTVideoLandingPageLink2Activity.this.oKZ;
                        if (dTVar != null) {
                            dTVar.lMd(motionEvent.getActionMasked());
                        }
                        if (motionEvent.getAction() == 2) {
                            float y4 = motionEvent.getY();
                            float f9 = this.zp;
                            if (y4 - f9 > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.sqt != null) {
                                    TTVideoLandingPageLink2Activity.this.sqt.zp();
                                }
                                return false;
                            }
                            if (y4 - f9 < -8.0f && TTVideoLandingPageLink2Activity.this.sqt != null) {
                                TTVideoLandingPageLink2Activity.this.sqt.lMd();
                            }
                        }
                        return false;
                    }
                });
            }
        } else if (this.zp.getWebView() != null) {
            this.zp.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    dT dTVar = TTVideoLandingPageLink2Activity.this.oKZ;
                    if (dTVar != null) {
                        dTVar.lMd(motionEvent.getActionMasked());
                        return false;
                    }
                    return false;
                }
            });
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.rCC;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.zp(this.KVG, this.YhE);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void YW() {
        super.YW();
        woN won = this.KVG;
        if (won != null) {
            won.HWF(true);
        }
        TextView textView = this.Vjb;
        if (textView != null) {
            textView.setText(lMd());
            this.Vjb.setClickable(true);
            this.Vjb.setOnClickListener(this.Rg);
            this.Vjb.setOnTouchListener(this.Rg);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void jU() {
        if (COT()) {
            super.jU();
            NativeVideoTsView nativeVideoTsView = this.rV;
            if (nativeVideoTsView != null) {
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.rV.getNativeVideoController().zp(false);
                    ((com.bytedance.sdk.openadsdk.core.video.nativevideo.KS) this.rV.getNativeVideoController()).QR(false);
                    this.vDp.setClickable(true);
                    this.vDp.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 0) {
                                TTVideoLandingPageLink2Activity.this.tG();
                                return false;
                            }
                            return false;
                        }
                    });
                }
                this.rV.getNativeVideoController().zp(new KS.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
                    public void lMd(long j7, int i9) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
                    public void zp() {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
                    public void zp(long j7, int i9) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
                    public void zp(long j7, long j9) {
                        if (TTVideoLandingPageLink2Activity.this.qtv != null) {
                            int max = (int) Math.max(0L, (j9 - j7) / 1000);
                            TTVideoLandingPageLink2Activity.this.qtv.setText(String.valueOf(max));
                            if (max <= 0) {
                                TTVideoLandingPageLink2Activity.this.qtv.setVisibility(8);
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
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.KVG.Rg().get(0), imageView, this.KVG);
            this.vDp.setVisibility(0);
            this.vDp.removeAllViews();
            this.vDp.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.openadsdk.lMd.KS.KS(TTVideoLandingPageLink2Activity.this.KVG, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    public void vDp() {
        if (isFinishing()) {
            return;
        }
        if (this.gH.get()) {
            dQp();
            return;
        }
        if (this.si == null) {
            KVG();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.si;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.zp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public View zp() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setBackgroundColor(-1);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        pAGLinearLayout.addView(pAGFrameLayout, new LinearLayout.LayoutParams(-1, WNy.lMd(this, 220.0f)));
        View pAGFrameLayout2 = new PAGFrameLayout(this);
        pAGFrameLayout2.setId(vDp.eWG);
        pAGFrameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setPadding(0, WNy.lMd(this, 20.0f), 0, 0);
        pAGFrameLayout.addView(pAGLinearLayout2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout2.addView(view, layoutParams);
        ShadowTextView shadowTextView = new ShadowTextView(this);
        shadowTextView.setId(520093713);
        shadowTextView.setGravity(17);
        shadowTextView.setText(cz.lMd(this, "tt_reward_feedback"));
        shadowTextView.setTextColor(-1);
        shadowTextView.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, WNy.lMd(this, 28.0f));
        int lMd = WNy.lMd(this, 16.0f);
        layoutParams2.rightMargin = lMd;
        layoutParams2.leftMargin = lMd;
        pAGLinearLayout2.addView(shadowTextView, layoutParams2);
        ShadowImageView shadowImageView = new ShadowImageView(this);
        shadowImageView.setId(vDp.Pxi);
        shadowImageView.setPadding(WNy.lMd(this, 7.0f), WNy.lMd(this, 7.0f), WNy.lMd(this, 7.0f), WNy.lMd(this, 7.0f));
        shadowImageView.setImageResource(cz.jU(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(WNy.lMd(this, 28.0f), WNy.lMd(this, 28.0f));
        layoutParams3.rightMargin = WNy.lMd(this, 12.0f);
        pAGLinearLayout2.addView(shadowImageView, layoutParams3);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this);
        pAGRelativeLayout.setVisibility(8);
        pAGRelativeLayout.setId(vDp.oKZ);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = WNy.lMd(this, 10.0f);
        pAGLinearLayout.addView(pAGRelativeLayout, layoutParams4);
        CornerIV cornerIV = new CornerIV(this);
        cornerIV.setId(vDp.BO);
        cornerIV.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        cornerIV.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(WNy.lMd(this, 44.0f), WNy.lMd(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = WNy.lMd(this, 5.0f);
        pAGRelativeLayout.addView(cornerIV, layoutParams5);
        PAGTextView pAGTextView = new PAGTextView(this);
        int i9 = vDp.Iv;
        pAGTextView.setId(i9);
        pAGTextView.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this, "tt_circle_solid_mian"));
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 19.0f);
        pAGTextView.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(WNy.lMd(this, 44.0f), WNy.lMd(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = WNy.lMd(this, 5.0f);
        pAGRelativeLayout.addView(pAGTextView, layoutParams6);
        PAGTextView pAGTextView2 = new PAGTextView(this);
        pAGTextView2.setId(vDp.aax);
        pAGTextView2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView2.setEllipsize(truncateAt);
        pAGTextView2.setTextColor(Color.parseColor("#e5000000"));
        pAGTextView2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = WNy.lMd(this, 5.0f);
        layoutParams7.rightMargin = WNy.lMd(this, 80.0f);
        layoutParams7.addRule(1, i9);
        pAGRelativeLayout.addView(pAGTextView2, layoutParams7);
        PAGTextView pAGTextView3 = new PAGTextView(this);
        pAGTextView3.setId(vDp.Rg);
        pAGTextView3.setClickable(true);
        pAGTextView3.setMaxLines(1);
        pAGTextView3.setEllipsize(truncateAt);
        pAGTextView3.setFocusable(true);
        pAGTextView3.setGravity(17);
        pAGTextView3.setText(cz.lMd(this, "tt_video_mobile_go_detail"));
        pAGTextView3.setTextColor(-1);
        pAGTextView3.setTextSize(2, 14.0f);
        pAGTextView3.setPadding(WNy.lMd(this, 2.0f), WNy.lMd(this, 2.0f), WNy.lMd(this, 2.0f), WNy.lMd(this, 2.0f));
        pAGTextView3.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(WNy.lMd(this, 90.0f), WNy.lMd(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = WNy.lMd(this, 5.0f);
        pAGRelativeLayout.addView(pAGTextView3, layoutParams8);
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(this);
        pAGLinearLayout.addView(pAGFrameLayout3, new LinearLayout.LayoutParams(-1, -1));
        View sSWebView = new SSWebView(this);
        sSWebView.setId(vDp.si);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = WNy.lMd(this, 2.0f);
        pAGFrameLayout3.addView(sSWebView, layoutParams9);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(this);
        pAGRelativeLayout2.setId(vDp.DY);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        pAGFrameLayout3.addView(pAGRelativeLayout2, new FrameLayout.LayoutParams(-1, -1));
        View landingPageLoadingLayout = new LandingPageLoadingLayout(this);
        landingPageLoadingLayout.setId(vDp.Rh);
        pAGRelativeLayout2.addView(landingPageLoadingLayout, new RelativeLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(this);
        pAGLinearLayout3.setId(vDp.ffE);
        pAGLinearLayout3.setOrientation(1);
        pAGLinearLayout3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        pAGRelativeLayout2.addView(pAGLinearLayout3, layoutParams10);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this);
        tTRoundRectImageView.setId(vDp.gH);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(WNy.lMd(this, 80.0f), WNy.lMd(this, 80.0f));
        layoutParams11.gravity = 17;
        pAGLinearLayout3.addView(tTRoundRectImageView, layoutParams11);
        PAGTextView pAGTextView4 = new PAGTextView(this);
        pAGTextView4.setId(vDp.rCC);
        pAGTextView4.setTextColor(Color.parseColor("#161823"));
        pAGTextView4.setTextSize(0, WNy.lMd(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = WNy.lMd(this, 12.0f);
        pAGLinearLayout3.addView(pAGTextView4, layoutParams12);
        PAGTextView pAGTextView5 = new PAGTextView(this);
        pAGTextView5.setId(vDp.MBR);
        pAGTextView5.setTextColor(Color.parseColor("#80161823"));
        pAGTextView5.setTextSize(0, WNy.lMd(this, 16.0f));
        pAGTextView5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int lMd2 = WNy.lMd(this, 60.0f);
        layoutParams13.rightMargin = lMd2;
        layoutParams13.leftMargin = lMd2;
        layoutParams13.topMargin = WNy.lMd(this, 8.0f);
        pAGLinearLayout3.addView(pAGTextView5, layoutParams13);
        PAGTextView pAGTextView6 = new PAGTextView(this);
        pAGTextView6.setId(vDp.oB);
        pAGTextView6.setGravity(17);
        pAGTextView6.setTextColor(-1);
        pAGTextView6.setText(cz.lMd(this, "tt_video_mobile_go_detail"));
        pAGTextView6.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(WNy.lMd(this, 255.0f), WNy.lMd(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = WNy.lMd(this, 32.0f);
        pAGLinearLayout3.addView(pAGTextView6, layoutParams14);
        View pAGLogoView = new PAGLogoView(this);
        pAGLogoView.setId(vDp.fgJ);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, WNy.lMd(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = WNy.lMd(this, 16.0f);
        layoutParams15.bottomMargin = WNy.lMd(this, 20.0f);
        pAGRelativeLayout2.addView(pAGLogoView, layoutParams15);
        View pangleViewStub = new PangleViewStub(this, new PangleViewStub.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.zp
            public View zp(Context context) {
                return new LandingPageBrowserDownloadButton(context);
            }
        });
        pangleViewStub.setId(vDp.qtv);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, WNy.lMd(this, 48.0f));
        layoutParams16.gravity = 81;
        pAGFrameLayout3.addView(pangleViewStub, layoutParams16);
        View pangleViewStub2 = new PangleViewStub(this, new PangleViewStub.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.zp
            public View zp(Context context) {
                return new LandingPageBrowserNewBottomBar(context);
            }
        });
        pangleViewStub2.setId(vDp.Vjb);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, WNy.lMd(this, 44.0f));
        layoutParams17.gravity = 80;
        pAGFrameLayout3.addView(pangleViewStub2, layoutParams17);
        return pAGLinearLayout;
    }
}
