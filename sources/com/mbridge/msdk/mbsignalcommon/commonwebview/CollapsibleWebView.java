package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class CollapsibleWebView extends CommonWebView {

    /* renamed from: e, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.a> f16600e;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.a> f16601f;

    /* renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f16602g;

    /* renamed from: h, reason: collision with root package name */
    private String f16603h;

    /* renamed from: i, reason: collision with root package name */
    private String f16604i;

    /* loaded from: classes3.dex */
    public interface a {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    public static /* synthetic */ void a(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f16600e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static /* synthetic */ void b(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f16601f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public String getCollapseIconName() {
        return this.f16603h;
    }

    public String getExpandIconName() {
        return this.f16604i;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f16600e = new CopyOnWriteArrayList<>();
        this.f16601f = new CopyOnWriteArrayList<>();
        this.f16602g = new CopyOnWriteArrayList<>();
        this.f16603h = "mbridge_arrow_down_white_blackbg";
        this.f16604i = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        ToolBar.b bVar = new ToolBar.b("doCollapse");
        bVar.f16639c = false;
        bVar.b = "mbridge_arrow_down_white_blackbg";
        bVar.f16640d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doCollapse");
                CollapsibleWebView.this.showToolBarButton("doSpand");
                CollapsibleWebView.a(CollapsibleWebView.this);
            }
        };
        arrayList.add(bVar);
        ToolBar.b bVar2 = new ToolBar.b("doSpand");
        bVar2.b = "mbridge_arrow_up_black";
        bVar2.f16640d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doSpand");
                CollapsibleWebView.this.showToolBarButton("doCollapse");
                CollapsibleWebView.b(CollapsibleWebView.this);
            }
        };
        arrayList.add(bVar2);
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new CommonWebView.b() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.3
            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.b
            public final void a(String str) {
                CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
                CollapsibleWebView.a(collapsibleWebView, (View) collapsibleWebView.f16612d, str);
            }
        });
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.4

            /* renamed from: a, reason: collision with root package name */
            Boolean f16608a = Boolean.FALSE;
            String b = "";

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                if (!this.f16608a.booleanValue()) {
                    CollapsibleWebView.b(CollapsibleWebView.this, webView, str);
                    this.f16608a = Boolean.FALSE;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (!TextUtils.isEmpty(str)) {
                    this.b = str;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i9, String str, String str2) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "error");
                hashMap.put("url", str2);
                hashMap.put("description", str);
                if (!this.f16608a.booleanValue() && this.b.equals(str2)) {
                    this.f16608a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, webView, hashMap);
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, hashMap);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                HashMap m = L.m("type", "http");
                String str = webResourceRequest.getUrl() + "";
                m.put("url", str);
                m.put("statusCode", webResourceResponse.getStatusCode() + "");
                m.put("description", "http error");
                if (!this.f16608a.booleanValue() && (this.b.equals(str) || TextUtils.isEmpty(this.b))) {
                    this.f16608a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, webView, m);
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, m);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                HashMap m = L.m("type", "ssl");
                m.put("url", sslError.getUrl());
                m.put("description", "ssl error");
                if (!this.f16608a.booleanValue()) {
                    if (this.b.equals(sslError.getUrl() + "")) {
                        this.f16608a = Boolean.TRUE;
                        CollapsibleWebView.a(CollapsibleWebView.this, webView, m);
                    }
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, m);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                ad.b("CollapsibleWebView", "WebView called onRenderProcessGone");
                return true;
            }
        });
    }

    public void setCollapseIconName(String str) {
        this.f16603h = str;
    }

    public void setCollapseListener(CommonWebView.a aVar) {
        this.f16600e.add(aVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i9, int i10, int i11, int i12) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f16610a.getLayoutParams();
        layoutParams.setMargins(i9, i10, i11, i12);
        this.f16610a.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f16604i = str;
    }

    public void setExpandListener(CommonWebView.a aVar) {
        this.f16601f.add(aVar);
    }

    public void setPageLoadListener(a aVar) {
        this.f16602g.add(aVar);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<a> it = collapsibleWebView.f16602g.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }

    public static /* synthetic */ void b(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<a> it = collapsibleWebView.f16602g.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    public static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<a> it = collapsibleWebView.f16602g.iterator();
        while (it.hasNext()) {
            it.next().a(view, (Map<String, String>) map);
        }
    }

    public static /* synthetic */ void b(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<a> it = collapsibleWebView.f16602g.iterator();
        while (it.hasNext()) {
            it.next().b(view, (Map<String, String>) map);
        }
    }
}
