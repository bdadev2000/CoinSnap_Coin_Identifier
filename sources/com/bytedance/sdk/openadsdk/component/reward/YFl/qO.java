package com.bytedance.sdk.openadsdk.component.reward.YFl;

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
import com.bytedance.sdk.component.NjR.AlY;
import com.bytedance.sdk.openadsdk.core.zB;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qO implements com.bytedance.sdk.openadsdk.YoT.DSW {
    private ImageView AlY;
    private final AtomicBoolean DSW = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl NjR;
    private final com.bytedance.sdk.openadsdk.core.model.Wwa Sg;
    private final Activity YFl;

    /* renamed from: nc, reason: collision with root package name */
    private int f10596nc;
    private volatile boolean qsH;
    private com.bytedance.sdk.component.NjR.AlY tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.Sg.DSW f10597vc;
    private boolean wN;

    public qO(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.NjR = yFl;
        this.Sg = yFl.Sg;
        this.YFl = yFl.UI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY() {
        YFl(Integer.MAX_VALUE, (String) null);
    }

    private void wN() {
        this.tN.f_();
        YFl(this.tN);
        this.tN.setDisplayZoomControls(false);
        this.tN.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.qO.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (i10 == 100) {
                    qO.this.AlY();
                }
            }
        });
        this.tN.setWebViewClient(new AlY.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.qO.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                qO.this.AlY();
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
                qO.this.YFl(statusCode, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (qO.this.YFl(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    public boolean tN() {
        if (!this.wN) {
            return false;
        }
        ImageView imageView = this.AlY;
        if (imageView != null) {
            imageView.performClick();
            return true;
        }
        com.bytedance.sdk.component.NjR.AlY alY = this.tN;
        if (alY == null) {
            return false;
        }
        this.f10597vc.onClick(alY);
        return true;
    }

    public void Sg() {
        DeviceUtils.AudioInfoReceiver.Sg(this);
        com.bytedance.sdk.component.NjR.AlY alY = this.tN;
        if (alY != null) {
            zB.YFl(alY.getWebView());
        }
    }

    public void YFl() {
        DeviceUtils.AudioInfoReceiver.YFl(this);
        this.f10596nc = DeviceUtils.DSW();
        if (this.Sg.Af() != null) {
            this.f10597vc = new com.bytedance.sdk.openadsdk.core.Sg.DSW("VAST_END_CARD", this.Sg.Af()) { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.qO.1
            };
            com.bytedance.sdk.openadsdk.core.YoT.tN tN = this.Sg.Af().tN();
            if (tN != null) {
                String wN = tN.wN();
                if (!TextUtils.isEmpty(wN)) {
                    this.wN = true;
                    this.AlY = (ImageView) this.NjR.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.qsH);
                    YFl(tN.Sg(), tN.tN());
                    com.bytedance.sdk.openadsdk.NjR.AlY.YFl(wN).YFl(tN.Sg()).Sg(tN.tN()).wN(GS.AlY(com.bytedance.sdk.openadsdk.core.lG.YFl())).AlY(GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl())).tN(2).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(this.Sg, wN, new YFl(this.AlY, wN, this, this.DSW)));
                    return;
                }
                com.bytedance.sdk.component.NjR.AlY alY = (com.bytedance.sdk.component.NjR.AlY) this.NjR.mB.findViewById(com.bytedance.sdk.openadsdk.utils.GA.NjR);
                this.tN = alY;
                if (alY == null) {
                    return;
                }
                wN();
                String AlY = tN.AlY();
                if (AlY != null) {
                    this.wN = true;
                    if (AlY.startsWith("http")) {
                        this.tN.a_(AlY);
                        return;
                    }
                    String YFl2 = com.bytedance.sdk.openadsdk.core.YoT.wN.YFl(AlY);
                    String str = TextUtils.isEmpty(YFl2) ? AlY : YFl2;
                    this.tN.setDefaultTextEncodingName("UTF -8");
                    this.tN.YFl(null, str, "text/html", "UTF-8", null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements com.bytedance.sdk.component.wN.rkt<Bitmap> {
        private final AtomicBoolean AlY;
        private final String Sg;
        private final WeakReference<ImageView> YFl;
        private final WeakReference<qO> tN;

        public YFl(ImageView imageView, String str, qO qOVar, AtomicBoolean atomicBoolean) {
            this.YFl = new WeakReference<>(imageView);
            this.Sg = str;
            this.tN = new WeakReference<>(qOVar);
            this.AlY = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
            qO qOVar;
            ImageView imageView = this.YFl.get();
            if (imageView == null || (qOVar = this.tN.get()) == null || eTVar == null) {
                return;
            }
            Bitmap Sg = eTVar.Sg();
            if (Sg == null) {
                qOVar.YFl(-1, this.Sg);
                return;
            }
            imageView.setImageBitmap(Sg);
            this.AlY.set(true);
            qOVar.AlY();
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(int i10, String str, @Nullable Throwable th2) {
            qO qOVar;
            ImageView imageView = this.YFl.get();
            if (imageView == null || (qOVar = this.tN.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            qOVar.YFl(-2, this.Sg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final int i10, final String str) {
        if (this.qsH) {
            return;
        }
        this.qsH = true;
        final String eT = this.Sg.Af() != null ? this.Sg.Af().eT() : "";
        if (i10 == Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.Sg, eT, "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(new com.bytedance.sdk.component.qsH.qsH("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.qO.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i10);
                        jSONObject.put("error_code", i10);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.AlY.tN.Sg(qO.this.Sg, eT, "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void YFl(com.bytedance.sdk.component.NjR.AlY alY) {
        alY.setVerticalScrollBarEnabled(false);
        alY.setHorizontalScrollBarEnabled(false);
        alY.setMixedContentMode(0);
        alY.setJavaScriptEnabled(true);
        alY.setJavaScriptCanOpenWindowsAutomatically(true);
        alY.setDomStorageEnabled(true);
        alY.setDatabaseEnabled(true);
        alY.setAppCacheEnabled(true);
        alY.setAllowFileAccess(false);
        alY.setSupportZoom(true);
        alY.setBuiltInZoomControls(true);
        alY.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        alY.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean YFl(String str) {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa;
        if (str == null || (wwa = this.Sg) == null || wwa.Af() == null || this.f10597vc == null) {
            return false;
        }
        this.Sg.Af().DSW(str);
        this.f10597vc.onClick(this.tN);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void YFl(int i10, int i11) {
        if (i10 == 0 || i11 == 0 || this.AlY == null) {
            return;
        }
        int tN = GS.tN((Context) this.YFl);
        int AlY = GS.AlY((Context) this.YFl);
        if (i10 / i11 <= tN / AlY) {
            tN = (int) Math.ceil(r5 * r4);
        } else {
            AlY = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.AlY.getLayoutParams();
        layoutParams.width = tN;
        layoutParams.height = AlY;
        layoutParams.gravity = 17;
        this.AlY.setLayoutParams(layoutParams);
        this.AlY.setOnClickListener(this.f10597vc);
        this.AlY.setOnTouchListener(this.f10597vc);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean YFl(lG lGVar) {
        com.bytedance.sdk.openadsdk.core.YoT.tN tN;
        if (!this.wN) {
            return false;
        }
        if (this.AlY != null && this.DSW.get()) {
            this.AlY.setVisibility(0);
        } else {
            com.bytedance.sdk.component.NjR.AlY alY = this.tN;
            if (alY != null) {
                alY.setVisibility(0);
                if (this.tN.getWebView() != null) {
                    this.tN.getWebView().setOnTouchListener(this.f10597vc);
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.Sg;
        if (wwa == null || wwa.Af() == null || (tN = this.Sg.Af().tN()) == null) {
            return true;
        }
        tN.Sg(lGVar != null ? lGVar.DSW() : -1L);
        return true;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.wN wNVar) {
        com.bytedance.sdk.openadsdk.core.Sg.DSW dsw = this.f10597vc;
        if (dsw != null) {
            dsw.YFl(wNVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YoT.DSW
    public void YFl(int i10) {
        int i11 = this.f10596nc;
        if (i11 == 0 && i10 > 0) {
            this.Sg.Af().YFl().NjR(this.NjR.VOe.DSW());
        } else if (i11 > 0 && i10 == 0) {
            this.Sg.Af().YFl().qsH(this.NjR.VOe.DSW());
        }
        this.f10596nc = i10;
    }
}
