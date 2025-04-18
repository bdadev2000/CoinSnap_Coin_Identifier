package com.bytedance.sdk.openadsdk.core.widget.YFl;

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
import com.bytedance.sdk.component.NjR.AlY;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.openadsdk.AlY.Sg;
import com.bytedance.sdk.openadsdk.AlY.eT;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.nc;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.qO;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN extends AlY.YFl {
    private static final HashSet<String> Wwa;
    protected final Context AlY;
    protected boolean DSW;
    private final Stack<String> EH;
    private com.bytedance.sdk.openadsdk.common.tN GA;
    protected boolean NjR;
    private String Sg;
    private final boolean YFl;
    private boolean YoT;
    private Map<String, Object> eT;
    private Wwa lG;

    /* renamed from: nc, reason: collision with root package name */
    private nc f10764nc;
    private String pDU;
    protected boolean qsH;
    private JSONObject rkt;
    protected final hQ tN;

    /* renamed from: vc, reason: collision with root package name */
    protected eT f10765vc;
    protected final String wN;

    static {
        HashSet<String> hashSet = new HashSet<>();
        Wwa = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public wN(Context context, hQ hQVar, String str, com.bytedance.sdk.openadsdk.common.tN tNVar, eT eTVar, boolean z10) {
        this(context, hQVar, str, eTVar, z10);
        this.GA = tNVar;
    }

    public static String AlY(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !Wwa.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(substring);
    }

    private boolean wN(String str) {
        if (!rkt.DSW(this.lG)) {
            return false;
        }
        return TextUtils.equals(this.lG.LL(), str);
    }

    public boolean Sg(String str) {
        String str2;
        String str3;
        if (this.AlY == null) {
            return false;
        }
        Wwa wwa = this.lG;
        if (wwa == null || wwa.in() == null) {
            str2 = "";
            str3 = "";
        } else {
            str2 = this.lG.in().tN();
            str3 = this.lG.in().YFl();
        }
        if (!com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.tN.YFl()) {
            return com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.YFl.YFl(str, this.AlY, this.Sg, this.lG, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.YFl.YFl(this.lG, str2, this.AlY, this.Sg, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.AlY.YFl(this.AlY, str3, str2, this.Sg, this.lG);
        }
        Context context = this.AlY;
        Wwa wwa2 = this.lG;
        return com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.tN.YFl(context, str, wwa2, Sco.Sg(wwa2), null, true) || com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.wN.YFl(this.lG, str2, this.AlY, this.Sg, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.wN.YFl(this.AlY, str3, str2, this.Sg, this.lG);
    }

    public void YFl(nc ncVar) {
        this.f10764nc = ncVar;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        eT eTVar = this.f10765vc;
        if (eTVar != null) {
            eTVar.YFl(webView, str, this.YFl);
        }
        com.bytedance.sdk.openadsdk.common.tN tNVar = this.GA;
        if (tNVar != null) {
            tNVar.Sg(webView, str, this.YFl);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Wwa wwa;
        super.onPageStarted(webView, str, bitmap);
        eT eTVar = this.f10765vc;
        if (eTVar != null) {
            eTVar.YFl(webView, str, bitmap, this.YFl);
        }
        com.bytedance.sdk.openadsdk.common.tN tNVar = this.GA;
        if (tNVar != null) {
            tNVar.tN(webView, str, this.YFl);
        }
        if (this.YFl && (wwa = this.lG) != null && wwa.iY() && this.lG.nc().Sg() >= 2) {
            if (!TextUtils.isEmpty(str) && !str.equals(this.pDU)) {
                if (this.EH.contains(str)) {
                    while (!str.equals(this.EH.peek())) {
                        this.EH.pop();
                    }
                } else {
                    this.EH.push(str);
                }
            }
            this.pDU = str;
        }
        if (this.qsH && !this.NjR) {
            this.NjR = true;
            tN.YFl(this.AlY).YFl(true).Sg(webView.getSettings().getBuiltInZoomControls()).YFl(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        boolean z10;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f10765vc != null && webResourceResponse != null) {
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
            String str3 = str2;
            if (webResourceRequest.isForMainFrame()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10765vc.YFl(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), str, str3, z10);
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
        if (this.f10765vc != null) {
            int i10 = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i10 = sslError.getPrimaryError();
                    str = "SslError: ".concat(String.valueOf(sslError));
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.f10765vc.YFl(webView, i10, str, str3, AlY(str3), true);
        }
    }

    @Override // com.bytedance.sdk.component.NjR.AlY.YFl, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.wN.wN.YFl().Sg();
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
        eT eTVar = this.f10765vc;
        if (eTVar != null) {
            eTVar.YFl(str, this.YFl);
        }
        com.bytedance.sdk.openadsdk.common.tN tNVar = this.GA;
        if (tNVar != null) {
            tNVar.YFl(webView, str, this.YFl);
        }
        if (YFl(webView, str)) {
            return true;
        }
        try {
            parse = Uri.parse(str);
            lowerCase = parse.getScheme().toLowerCase();
        } catch (Throwable unused) {
            hQ hQVar = this.tN;
            if (hQVar != null && hQVar.AlY()) {
                return true;
            }
        }
        if ("bytedance".equals(lowerCase)) {
            com.bytedance.sdk.openadsdk.utils.rkt.YFl(parse, this.tN);
            return true;
        }
        if (tN(str)) {
            return true;
        }
        if (!EH.YFl(str)) {
            if (rkt.DSW(this.lG)) {
                YFl(lowerCase, str);
                return true;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.addFlags(268435456);
                this.AlY.startActivity(intent);
            } catch (Throwable unused2) {
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public boolean tN(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                if (rkt.DSW(this.lG) && this.rkt == null && this.f10764nc == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.AlY instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.AlY.startActivity(intent);
                Sg();
                this.rkt = null;
                this.f10764nc = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public void YFl(Map<String, Object> map) {
        this.eT = map;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f10765vc == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.f10765vc.YFl(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        eT eTVar = this.f10765vc;
        if (eTVar != null) {
            eTVar.Sg(webView, str, this.YFl);
        }
        com.bytedance.sdk.openadsdk.common.tN tNVar = this.GA;
        if (tNVar != null) {
            tNVar.YFl(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public wN(Context context, hQ hQVar, String str, eT eTVar, boolean z10) {
        this.DSW = true;
        this.qsH = true;
        this.NjR = false;
        this.AlY = context;
        this.tN = hQVar;
        this.wN = str;
        this.f10765vc = eTVar;
        this.YFl = z10;
        this.EH = new Stack<>();
    }

    public void YFl(JSONObject jSONObject) {
        this.rkt = jSONObject;
    }

    public void YFl(String str) {
        this.Sg = str;
    }

    public void YFl(Wwa wwa) {
        this.lG = wwa;
    }

    private void YFl(String str, String str2) {
        if ((wN(str) || "market".equals(str)) && ((this.f10764nc != null || this.rkt != null) && Sg(str2))) {
            Sg();
        }
        this.f10764nc = null;
        this.rkt = null;
    }

    private boolean YFl(WebView webView, String str) {
        if (!Sco.AlY(this.lG) || this.lG.nc() == null || webView == null) {
            return false;
        }
        if (this.EH.size() + 1 != this.lG.nc().Sg()) {
            return false;
        }
        qO.YFl(this.AlY, str, this.lG, Sg.YFl.AlY);
        return true;
    }

    public void Sg() {
        if (TextUtils.isEmpty(this.Sg) || !rkt.vc(this.lG) || this.YoT) {
            return;
        }
        nc ncVar = this.f10764nc;
        if (ncVar != null) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.lG, ncVar, this.Sg, true, this.eT, 1);
            this.YoT = true;
            return;
        }
        JSONObject jSONObject = this.rkt;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.lG, this.Sg, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
            this.YoT = true;
        }
    }
}
