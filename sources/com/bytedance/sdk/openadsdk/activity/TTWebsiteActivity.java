package com.bytedance.sdk.openadsdk.activity;

import Q7.n0;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.impl.L;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.lMd;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.YW;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.irS;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.core.widget.zp.KS;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.net.URLEncoder;

/* loaded from: classes.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private WebView KS;
    private YW lMd;
    private String zp = null;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        KVG.zp(getApplicationContext());
        if (!tG.COT()) {
            finish();
            return;
        }
        final String stringExtra = getIntent().getStringExtra("_extra_meta");
        String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setBackgroundColor(-1);
        pAGLinearLayout.setId(520093726);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(pAGLinearLayout);
            int lMd = WNy.lMd(this, 5.0f);
            int lMd2 = WNy.lMd(this, 8.0f);
            int lMd3 = WNy.lMd(this, 10.0f);
            int lMd4 = WNy.lMd(this, 12.0f);
            int lMd5 = WNy.lMd(this, 14.0f);
            int lMd6 = WNy.lMd(this, 20.0f);
            int lMd7 = WNy.lMd(this, 24.0f);
            int lMd8 = WNy.lMd(this, 40.0f);
            int lMd9 = WNy.lMd(this, 44.0f);
            int lMd10 = WNy.lMd(this, 191.0f);
            PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this);
            pAGRelativeLayout.setGravity(15);
            pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, lMd9));
            PAGImageView pAGImageView = new PAGImageView(this);
            pAGImageView.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(lMd8, lMd9);
            layoutParams.setMarginStart(lMd2);
            pAGImageView.setLayoutParams(layoutParams);
            pAGImageView.setClickable(true);
            pAGImageView.setFocusable(true);
            pAGImageView.setPadding(lMd5, lMd4, lMd5, lMd4);
            pAGImageView.setImageDrawable(cz.KS(this, "tt_ad_arrow_backward_wrapper"));
            final PAGImageView pAGImageView2 = new PAGImageView(this);
            pAGImageView2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(lMd8, lMd9);
            layoutParams2.addRule(17, 520093720);
            pAGImageView2.setLayoutParams(layoutParams2);
            pAGImageView2.setClickable(true);
            pAGImageView2.setFocusable(true);
            pAGImageView2.setPadding(lMd4, lMd5, lMd4, lMd5);
            pAGImageView2.setImageDrawable(cz.KS(this, "tt_ad_xmark"));
            PAGTextView pAGTextView = new PAGTextView(this);
            pAGTextView.setId(vDp.Ml);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(lMd10, lMd7);
            layoutParams3.setMarginStart(lMd);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            pAGTextView.setLayoutParams(layoutParams3);
            pAGTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            pAGTextView.setGravity(17);
            pAGTextView.setSingleLine(true);
            pAGTextView.setTextColor(Color.parseColor("#222222"));
            pAGTextView.setTextSize(17.0f);
            PAGImageView pAGImageView3 = new PAGImageView(this);
            pAGImageView3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(lMd8, lMd9);
            layoutParams4.addRule(16, 520093742);
            pAGImageView3.setLayoutParams(layoutParams4);
            pAGImageView3.setPadding(lMd3, lMd4, lMd3, lMd4);
            pAGImageView3.setImageDrawable(cz.KS(this, "tt_ad_link"));
            PAGImageView pAGImageView4 = new PAGImageView(this);
            pAGImageView4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(lMd8, lMd9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(lMd2);
            pAGImageView4.setLayoutParams(layoutParams5);
            pAGImageView4.setPadding(lMd4, lMd6, lMd4, lMd6);
            pAGImageView4.setImageDrawable(cz.KS(this, "tt_ad_threedots"));
            final PAGProgressBar pAGProgressBar = new PAGProgressBar(this, null, R.style.Widget.ProgressBar.Horizontal);
            pAGProgressBar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, WNy.lMd(this, 2.0f));
            layoutParams6.addRule(12);
            pAGProgressBar.setLayoutParams(layoutParams6);
            pAGProgressBar.setProgress(1);
            pAGProgressBar.setProgressDrawable(ku.zp(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, WNy.lMd(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            pAGRelativeLayout.addView(pAGImageView);
            pAGRelativeLayout.addView(pAGImageView2);
            pAGRelativeLayout.addView(pAGTextView);
            pAGRelativeLayout.addView(pAGImageView3);
            pAGRelativeLayout.addView(pAGImageView4);
            pAGRelativeLayout.addView(pAGProgressBar);
            pAGRelativeLayout.addView(view);
            pAGLinearLayout.addView(pAGRelativeLayout);
            try {
                WebView webView = new WebView(this);
                this.KS = webView;
                webView.setBackgroundColor(-1);
                pAGLinearLayout.addView(this.KS, new ViewGroup.LayoutParams(-1, -1));
                pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.KS.canGoBack()) {
                            TTWebsiteActivity.this.KS.goBack();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                pAGImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                pAGImageView2.setVisibility(4);
                pAGImageView2.setClickable(false);
                pAGTextView.setText(cz.zp(this, "tt_privacy_title"));
                pAGImageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.KS.getUrl();
                        if (!TextUtils.isEmpty(url)) {
                            intent.setData(Uri.parse(url));
                            lMd.zp(TTWebsiteActivity.this, intent, null);
                        }
                    }
                });
                pAGImageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.lMd == null) {
                            TTWebsiteActivity.this.lMd = new YW(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.lMd.zp(stringExtra);
                            TTWebsiteActivity.this.lMd.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.lMd.show();
                    }
                });
                if (KVG.jU() != null) {
                    this.zp = KVG.jU().eWG();
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        String encode = URLEncoder.encode(stringExtra2);
                        if (this.zp.contains("?")) {
                            this.zp = n0.l(new StringBuilder(), this.zp, "&gdid_encrypted=", encode);
                        } else {
                            this.zp = n0.l(new StringBuilder(), this.zp, "?gdid_encrypted=", encode);
                        }
                    }
                }
                if (this.zp != null) {
                    WebSettings settings = this.KS.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                    try {
                        this.KS.loadUrl(this.zp, L.m("Referer", TTAdConstant.REQUEST_HEAD_REFERER));
                    } catch (Throwable unused2) {
                        this.KS.loadUrl(this.zp);
                    }
                    this.KS.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i9) {
                            super.onProgressChanged(webView2, i9);
                            if (pAGProgressBar != null && !TTWebsiteActivity.this.isFinishing()) {
                                if (i9 == 100) {
                                    pAGProgressBar.setVisibility(8);
                                    if (webView2.canGoBack()) {
                                        pAGImageView2.setVisibility(0);
                                        pAGImageView2.setClickable(true);
                                        return;
                                    } else {
                                        pAGImageView2.setVisibility(4);
                                        pAGImageView2.setClickable(false);
                                        return;
                                    }
                                }
                                pAGProgressBar.setVisibility(0);
                                pAGProgressBar.setProgress(i9);
                            }
                        }
                    });
                    this.KS.setWebViewClient(new SSWebView.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str) {
                            super.onPageFinished(webView2, str);
                        }

                        @Override // android.webkit.WebViewClient
                        @RequiresApi(api = 23)
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            com.bytedance.sdk.component.utils.tG.zp("TTAD.TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            com.bytedance.sdk.component.utils.tG.zp("TTAD.TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=".concat(String.valueOf(webResourceResponse)));
                        }

                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                            if (webView2 != null && webResourceRequest != null) {
                                webView2.loadUrl(webResourceRequest.getUrl().toString());
                                return true;
                            }
                            return false;
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i9, String str, String str2) {
                            super.onReceivedError(webView2, i9, str, str2);
                        }
                    });
                    KS.lMd(this.KS);
                    return;
                }
                finish();
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.TTWebsiteActivity", "onCreate: ", e4);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        irS.zp(this.KS);
    }

    public static void zp(Context context, woN won, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "open_policy");
        if (TextUtils.isEmpty(KVG.jU().eWG())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (won != null) {
            intent.putExtra("_extra_meta", won.TS().toString());
            intent.putExtra("_extra_glo_d", won.OJ());
        }
        lMd.zp(context, intent, null);
    }
}
