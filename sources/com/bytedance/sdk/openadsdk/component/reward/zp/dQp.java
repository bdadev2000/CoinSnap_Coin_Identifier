package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.irS;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.WNy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dQp implements com.bytedance.sdk.openadsdk.YW.QR {
    private boolean COT;
    private com.bytedance.sdk.openadsdk.core.lMd.QR HWF;
    private SSWebView KS;
    private boolean QR;
    private final zp YW;
    private int dT;
    private ImageView jU;
    private volatile boolean ku;
    private final woN lMd;
    private final Activity zp;

    public dQp(zp zpVar) {
        this.YW = zpVar;
        this.lMd = zpVar.zp;
        this.zp = zpVar.oB;
    }

    private void COT() {
        this.KS.d_();
        zp(this.KS);
        this.KS.setDisplayZoomControls(false);
        this.KS.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.dQp.4
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i9) {
                super.onProgressChanged(webView, i9);
                if (i9 == 100) {
                    dQp.this.jU();
                }
            }
        });
        this.KS.setWebViewClient(new SSWebView.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.dQp.5
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                dQp.this.jU();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                String str;
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (!webResourceRequest.isForMainFrame()) {
                    return;
                }
                int statusCode = webResourceResponse.getStatusCode();
                if (webResourceRequest.getUrl() != null) {
                    str = webResourceRequest.getUrl().toString();
                } else {
                    str = null;
                }
                dQp.this.zp(statusCode, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (dQp.this.zp(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jU() {
        zp(Integer.MAX_VALUE, (String) null);
    }

    public boolean KS() {
        if (!this.COT) {
            return false;
        }
        ImageView imageView = this.jU;
        if (imageView != null) {
            imageView.performClick();
            return true;
        }
        SSWebView sSWebView = this.KS;
        if (sSWebView == null) {
            return false;
        }
        this.HWF.onClick(sSWebView);
        return true;
    }

    public void lMd() {
        DeviceUtils.AudioInfoReceiver.lMd(this);
        SSWebView sSWebView = this.KS;
        if (sSWebView != null) {
            irS.zp(sSWebView.getWebView());
        }
    }

    public void zp() {
        DeviceUtils.AudioInfoReceiver.zp(this);
        this.dT = DeviceUtils.QR();
        if (this.lMd.xg() != null) {
            this.HWF = new com.bytedance.sdk.openadsdk.core.lMd.QR("VAST_END_CARD", this.lMd.xg()) { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.dQp.1
            };
            com.bytedance.sdk.openadsdk.core.QR.KS KS = this.lMd.xg().KS();
            if (KS != null) {
                final String COT = KS.COT();
                if (!TextUtils.isEmpty(COT)) {
                    this.COT = true;
                    this.jU = (ImageView) this.zp.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.ku);
                    zp(KS.lMd(), KS.KS());
                    com.bytedance.sdk.openadsdk.HWF.jU.zp(COT).zp(KS.lMd()).lMd(KS.KS()).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).KS(2).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(this.lMd, COT, new com.bytedance.sdk.component.COT.KVG<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.dQp.2
                        @Override // com.bytedance.sdk.component.COT.KVG
                        public void zp(com.bytedance.sdk.component.COT.Bj<Bitmap> bj) {
                            if (dQp.this.jU == null || bj == null) {
                                return;
                            }
                            Bitmap lMd = bj.lMd();
                            if (lMd != null) {
                                dQp.this.jU.setImageBitmap(lMd);
                                dQp.this.QR = true;
                                dQp.this.jU();
                                return;
                            }
                            dQp.this.zp(-1, COT);
                        }

                        @Override // com.bytedance.sdk.component.COT.KVG
                        public void zp(int i9, String str, @Nullable Throwable th) {
                            if (dQp.this.jU != null) {
                                dQp.this.jU.setVisibility(8);
                            }
                            dQp.this.zp(-2, COT);
                        }
                    }));
                    return;
                }
                SSWebView sSWebView = (SSWebView) this.zp.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.YW);
                this.KS = sSWebView;
                if (sSWebView == null) {
                    return;
                }
                COT();
                String jU = KS.jU();
                if (jU != null) {
                    this.COT = true;
                    if (jU.startsWith("http")) {
                        this.KS.a_(jU);
                        return;
                    }
                    String zp = com.bytedance.sdk.openadsdk.core.QR.COT.zp(jU);
                    String str = TextUtils.isEmpty(zp) ? jU : zp;
                    this.KS.setDefaultTextEncodingName("UTF -8");
                    this.KS.zp(null, str, "text/html", "UTF-8", null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final int i9, final String str) {
        String str2;
        if (this.ku) {
            return;
        }
        this.ku = true;
        if (this.lMd.xg() != null) {
            str2 = this.lMd.xg().Bj();
        } else {
            str2 = "";
        }
        final String str3 = str2;
        if (i9 == Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(this.lMd, str3, "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(new com.bytedance.sdk.component.ku.ku("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.dQp.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i9);
                        jSONObject.put("error_code", i9);
                        String str4 = str;
                        if (str4 != null) {
                            jSONObject.put("url", str4);
                        }
                        com.bytedance.sdk.openadsdk.lMd.KS.lMd(dQp.this.lMd, str3, "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void zp(SSWebView sSWebView) {
        sSWebView.setVerticalScrollBarEnabled(false);
        sSWebView.setHorizontalScrollBarEnabled(false);
        sSWebView.setMixedContentMode(0);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setDatabaseEnabled(true);
        sSWebView.setAppCacheEnabled(true);
        sSWebView.setAllowFileAccess(false);
        sSWebView.setSupportZoom(true);
        sSWebView.setBuiltInZoomControls(true);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        sSWebView.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zp(String str) {
        woN won;
        if (str == null || (won = this.lMd) == null || won.xg() == null || this.HWF == null) {
            return false;
        }
        this.lMd.xg().QR(str);
        this.HWF.onClick(this.KS);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zp(int i9, int i10) {
        if (i9 == 0 || i10 == 0 || this.jU == null) {
            return;
        }
        int KS = WNy.KS((Context) this.zp);
        int jU = WNy.jU((Context) this.zp);
        if (i9 / i10 <= KS / jU) {
            KS = (int) Math.ceil(r5 * r4);
        } else {
            jU = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.jU.getLayoutParams();
        layoutParams.width = KS;
        layoutParams.height = jU;
        this.jU.setLayoutParams(layoutParams);
        this.jU.setOnClickListener(this.HWF);
        this.jU.setOnTouchListener(this.HWF);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean zp(tG tGVar) {
        com.bytedance.sdk.openadsdk.core.QR.KS KS;
        if (!this.COT) {
            return false;
        }
        ImageView imageView = this.jU;
        if (imageView != null && this.QR) {
            imageView.setVisibility(0);
        } else {
            SSWebView sSWebView = this.KS;
            if (sSWebView != null) {
                sSWebView.setVisibility(0);
                if (this.KS.getWebView() != null) {
                    this.KS.getWebView().setOnTouchListener(this.HWF);
                }
            }
        }
        woN won = this.lMd;
        if (won == null || won.xg() == null || (KS = this.lMd.xg().KS()) == null) {
            return true;
        }
        KS.lMd(tGVar != null ? tGVar.QR() : -1L);
        return true;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.lMd.COT cot) {
        com.bytedance.sdk.openadsdk.core.lMd.QR qr = this.HWF;
        if (qr != null) {
            qr.zp(cot);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YW.QR
    public void zp(int i9) {
        int i10 = this.dT;
        if (i10 == 0 && i9 > 0) {
            this.lMd.xg().zp().YW(this.YW.UPs.QR());
        } else if (i10 > 0 && i9 == 0) {
            this.lMd.xg().zp().ku(this.YW.UPs.QR());
        }
        this.dT = i9;
    }
}
