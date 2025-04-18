package com.bytedance.sdk.openadsdk.activity;

import a4.j;
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
import com.bytedance.sdk.component.NjR.AlY;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.rkt;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.wN.DSW;
import com.bytedance.sdk.openadsdk.core.wN.qsH;
import com.bytedance.sdk.openadsdk.core.zB;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.net.URLEncoder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private rkt Sg;
    private String YFl = null;
    private WebView tN;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        lG.Sg(getApplicationContext());
        if (!pDU.wN()) {
            finish();
            return;
        }
        final String stringExtra = getIntent().getStringExtra("_extra_meta");
        String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(this);
        wNVar.setFitsSystemWindows(true);
        wNVar.setBackgroundColor(-1);
        wNVar.setId(520093726);
        wNVar.setOrientation(1);
        wNVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(wNVar);
            int tN = GS.tN(this, 5.0f);
            int tN2 = GS.tN(this, 8.0f);
            int tN3 = GS.tN(this, 10.0f);
            int tN4 = GS.tN(this, 12.0f);
            int tN5 = GS.tN(this, 14.0f);
            int tN6 = GS.tN(this, 20.0f);
            int tN7 = GS.tN(this, 24.0f);
            int tN8 = GS.tN(this, 40.0f);
            int tN9 = GS.tN(this, 44.0f);
            int tN10 = GS.tN(this, 191.0f);
            DSW dsw = new DSW(this);
            dsw.setGravity(15);
            dsw.setLayoutParams(new LinearLayout.LayoutParams(-1, tN9));
            com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(this);
            alY.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(tN8, tN9);
            layoutParams.setMarginStart(tN2);
            alY.setLayoutParams(layoutParams);
            alY.setClickable(true);
            alY.setFocusable(true);
            alY.setPadding(tN5, tN4, tN5, tN4);
            alY.setImageDrawable(qO.tN(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = new com.bytedance.sdk.openadsdk.core.wN.AlY(this);
            alY2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(tN8, tN9);
            layoutParams2.addRule(17, 520093720);
            alY2.setLayoutParams(layoutParams2);
            alY2.setClickable(true);
            alY2.setFocusable(true);
            alY2.setPadding(tN4, tN5, tN4, tN5);
            alY2.setImageDrawable(qO.tN(this, "tt_ad_xmark"));
            qsH qsh = new qsH(this);
            qsh.setId(GA.SVa);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(tN10, tN7);
            layoutParams3.setMarginStart(tN);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            qsh.setLayoutParams(layoutParams3);
            qsh.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            qsh.setGravity(17);
            qsh.setSingleLine(true);
            qsh.setTextColor(Color.parseColor("#222222"));
            qsh.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.wN.AlY alY3 = new com.bytedance.sdk.openadsdk.core.wN.AlY(this);
            alY3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(tN8, tN9);
            layoutParams4.addRule(16, 520093742);
            alY3.setLayoutParams(layoutParams4);
            alY3.setPadding(tN3, tN4, tN3, tN4);
            alY3.setImageDrawable(qO.tN(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.wN.AlY alY4 = new com.bytedance.sdk.openadsdk.core.wN.AlY(this);
            alY4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(tN8, tN9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(tN2);
            alY4.setLayoutParams(layoutParams5);
            alY4.setPadding(tN4, tN6, tN4, tN6);
            alY4.setImageDrawable(qO.tN(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.wN.vc vcVar = new com.bytedance.sdk.openadsdk.core.wN.vc(this, null, R.style.Widget.ProgressBar.Horizontal);
            vcVar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, GS.tN(this, 2.0f));
            layoutParams6.addRule(12);
            vcVar.setLayoutParams(layoutParams6);
            vcVar.setProgress(1);
            vcVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, GS.tN(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            dsw.addView(alY);
            dsw.addView(alY2);
            dsw.addView(qsh);
            dsw.addView(alY3);
            dsw.addView(alY4);
            dsw.addView(vcVar);
            dsw.addView(view);
            wNVar.addView(dsw);
            try {
                WebView webView = new WebView(getApplicationContext());
                this.tN = webView;
                webView.setBackgroundColor(-1);
                wNVar.addView(this.tN, new ViewGroup.LayoutParams(-1, -1));
                alY.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.tN.canGoBack()) {
                            TTWebsiteActivity.this.tN.goBack();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                alY2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                alY2.setVisibility(4);
                alY2.setClickable(false);
                qsh.setText(qO.YFl(this, "tt_privacy_title"));
                alY3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.tN.getUrl();
                        if (!TextUtils.isEmpty(url)) {
                            intent.setData(Uri.parse(url));
                            com.bytedance.sdk.component.utils.Sg.YFl(TTWebsiteActivity.this, intent, null);
                        }
                    }
                });
                alY4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.Sg == null) {
                            TTWebsiteActivity.this.Sg = new rkt(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.Sg.YFl(stringExtra);
                            TTWebsiteActivity.this.Sg.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.Sg.show();
                    }
                });
                if (lG.AlY() != null) {
                    this.YFl = lG.AlY().Sco();
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        String encode = URLEncoder.encode(stringExtra2);
                        if (this.YFl.contains("?")) {
                            this.YFl = a.n(new StringBuilder(), this.YFl, "&gdid_encrypted=", encode);
                        } else {
                            this.YFl = a.n(new StringBuilder(), this.YFl, "?gdid_encrypted=", encode);
                        }
                    }
                }
                if (this.YFl != null) {
                    WebSettings settings = this.tN.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                    try {
                        this.tN.loadUrl(this.YFl, j.q("Referer", TTAdConstant.REQUEST_HEAD_REFERER));
                    } catch (Throwable unused2) {
                        this.tN.loadUrl(this.YFl);
                    }
                    this.tN.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i10) {
                            super.onProgressChanged(webView2, i10);
                            if (vcVar != null && !TTWebsiteActivity.this.isFinishing()) {
                                if (i10 == 100) {
                                    vcVar.setVisibility(8);
                                    if (webView2.canGoBack()) {
                                        alY2.setVisibility(0);
                                        alY2.setClickable(true);
                                        return;
                                    } else {
                                        alY2.setVisibility(4);
                                        alY2.setClickable(false);
                                        return;
                                    }
                                }
                                vcVar.setVisibility(0);
                                vcVar.setProgress(i10);
                            }
                        }
                    });
                    this.tN.setWebViewClient(new AlY.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str) {
                            super.onPageFinished(webView2, str);
                        }

                        @Override // android.webkit.WebViewClient
                        @RequiresApi(api = 23)
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            YoT.YFl("TTAD.TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            YoT.YFl("TTAD.TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=".concat(String.valueOf(webResourceResponse)));
                        }

                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                            if (webView2 == null || webResourceRequest == null) {
                                return false;
                            }
                            webView2.loadUrl(webResourceRequest.getUrl().toString());
                            return true;
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i10, String str, String str2) {
                            super.onReceivedError(webView2, i10, str, str2);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.YFl.tN.Sg(this.tN);
                    return;
                }
                finish();
            } catch (Exception e2) {
                YoT.YFl("TTAD.TTWebsiteActivity", "onCreate: ", e2);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        zB.YFl(this.tN);
        super.onDestroy();
    }

    public static void YFl(Context context, Wwa wwa, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), wwa, str, "open_policy");
        if (TextUtils.isEmpty(lG.AlY().Sco())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (wwa != null) {
            intent.putExtra("_extra_meta", wwa.Gmi().toString());
            intent.putExtra("_extra_glo_d", wwa.NZ());
        }
        com.bytedance.sdk.component.utils.Sg.YFl(context, intent, null);
    }
}
