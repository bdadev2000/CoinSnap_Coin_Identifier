package com.bytedance.sdk.openadsdk.core.widget.zp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.KVG;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.model.YW;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.dT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT extends SSWebView.zp {
    private static final HashSet<String> rV;
    private boolean Bj;
    protected final String COT;
    protected dT HWF;
    protected final RCv KS;
    private YW YW;
    private Map<String, Object> dT;
    protected final Context jU;
    private String lMd;
    private woN tG;
    private JSONObject vDp;
    private final boolean zp;
    protected boolean QR = true;
    protected boolean ku = true;

    static {
        HashSet<String> hashSet = new HashSet<>();
        rV = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public COT(Context context, RCv rCv, String str, dT dTVar, boolean z8) {
        this.jU = context;
        this.KS = rCv;
        this.COT = str;
        this.HWF = dTVar;
        this.zp = z8;
    }

    private boolean COT(String str) {
        if (!dQp.QR(this.tG)) {
            return false;
        }
        return TextUtils.equals(this.tG.uVa(), str);
    }

    public static String jU(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !rV.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(substring);
    }

    public boolean KS(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                if (dQp.QR(this.tG) && this.vDp == null && this.YW == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.jU instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.jU.startActivity(intent);
                lMd();
                this.vDp = null;
                this.YW = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public boolean lMd(String str) {
        String str2;
        String str3;
        if (this.jU == null) {
            return false;
        }
        woN won = this.tG;
        if (won != null && won.Vjb() != null) {
            str2 = this.tG.Vjb().KS();
            str3 = this.tG.Vjb().zp();
        } else {
            str2 = "";
            str3 = "";
        }
        return com.com.bytedance.overseas.sdk.zp.zp.zp(str, this.jU, this.lMd, this.tG, (Map<String, Object>) null) || com.com.bytedance.overseas.sdk.zp.zp.zp(this.tG, str2, this.jU, this.lMd, (Map<String, Object>) null) || com.com.bytedance.overseas.sdk.zp.lMd.zp(this.jU, str3, str2, this.lMd, this.tG);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        dT dTVar = this.HWF;
        if (dTVar != null) {
            dTVar.zp(webView, str, this.zp);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        dT dTVar = this.HWF;
        if (dTVar != null) {
            dTVar.zp(webView, str, bitmap);
        }
        if (this.ku) {
            KS.zp(this.jU).zp(true).lMd(webView.getSettings().getBuiltInZoomControls()).zp(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i9, String str, String str2) {
        super.onReceivedError(webView, i9, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.HWF != null && webResourceResponse != null) {
            Uri url = webResourceRequest.getUrl();
            String str2 = "";
            if (url == null) {
                str = "";
            } else {
                str = url.toString();
            }
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str2 = requestHeaders.get("accept");
            }
            boolean isForMainFrame = webResourceRequest.isForMainFrame();
            this.HWF.zp(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), str, str2, isForMainFrame);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.HWF != null) {
            int i9 = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i9 = sslError.getPrimaryError();
                    str = "SslError: ".concat(String.valueOf(sslError));
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.HWF.zp(webView, i9, str, str3, jU(str3), true);
        }
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView.zp, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.COT.COT.zp().lMd();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        String lowerCase;
        try {
            parse = Uri.parse(str);
            lowerCase = parse.getScheme().toLowerCase();
        } catch (Throwable unused) {
            RCv rCv = this.KS;
            if (rCv != null && rCv.jU()) {
                return true;
            }
        }
        if ("bytedance".equals(lowerCase)) {
            com.bytedance.sdk.openadsdk.utils.dQp.zp(parse, this.KS);
            return true;
        }
        if (KS(str)) {
            return true;
        }
        if (!KVG.zp(str)) {
            if (dQp.QR(this.tG)) {
                zp(lowerCase, str);
                return true;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addFlags(268435456);
                this.jU.startActivity(intent);
            } catch (Throwable unused2) {
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void zp(YW yw) {
        this.YW = yw;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.HWF == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String str = "";
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders.containsKey("accept")) {
            str = requestHeaders.get("accept");
        }
        this.HWF.zp(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public void zp(Map<String, Object> map) {
        this.dT = map;
    }

    public void zp(JSONObject jSONObject) {
        this.vDp = jSONObject;
    }

    public void zp(String str) {
        this.lMd = str;
    }

    public void zp(woN won) {
        this.tG = won;
    }

    private void zp(String str, String str2) {
        if ((COT(str) || "market".equals(str)) && ((this.YW != null || this.vDp != null) && lMd(str2))) {
            lMd();
        }
        this.YW = null;
        this.vDp = null;
    }

    public void lMd() {
        if (TextUtils.isEmpty(this.lMd) || !dQp.HWF(this.tG) || this.Bj) {
            return;
        }
        YW yw = this.YW;
        if (yw != null) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.tG, yw, this.lMd, true, this.dT, 1);
            this.Bj = true;
            return;
        }
        JSONObject jSONObject = this.vDp;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.tG, this.lMd, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
            this.Bj = true;
        }
    }
}
