package com.mbridge.msdk.mbsignalcommon.commonwebview;

import a4.j;
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
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class CollapsibleWebView extends CommonWebView {

    /* renamed from: e, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.a> f14087e;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.a> f14088f;

    /* renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f14089g;

    /* renamed from: h, reason: collision with root package name */
    private String f14090h;

    /* renamed from: i, reason: collision with root package name */
    private String f14091i;

    /* loaded from: classes4.dex */
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
        Iterator<CommonWebView.a> it = collapsibleWebView.f14087e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static /* synthetic */ void b(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f14088f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public String getCollapseIconName() {
        return this.f14090h;
    }

    public String getExpandIconName() {
        return this.f14091i;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f14087e = new CopyOnWriteArrayList<>();
        this.f14088f = new CopyOnWriteArrayList<>();
        this.f14089g = new CopyOnWriteArrayList<>();
        this.f14090h = "mbridge_arrow_down_white_blackbg";
        this.f14091i = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        ToolBar.b bVar = new ToolBar.b("doCollapse");
        bVar.f14116c = false;
        bVar.f14115b = "mbridge_arrow_down_white_blackbg";
        bVar.f14117d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doCollapse");
                CollapsibleWebView.this.showToolBarButton("doSpand");
                CollapsibleWebView.a(CollapsibleWebView.this);
            }
        };
        arrayList.add(bVar);
        ToolBar.b bVar2 = new ToolBar.b("doSpand");
        bVar2.f14115b = "mbridge_arrow_up_black";
        bVar2.f14117d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.2
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
                CollapsibleWebView.a(collapsibleWebView, (View) collapsibleWebView.f14096d, str);
            }
        });
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.4
            Boolean a = Boolean.FALSE;

            /* renamed from: b, reason: collision with root package name */
            String f14092b = "";

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                if (!this.a.booleanValue()) {
                    CollapsibleWebView.b(CollapsibleWebView.this, webView, str);
                    this.a = Boolean.FALSE;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (!TextUtils.isEmpty(str)) {
                    this.f14092b = str;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i10, String str, String str2) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "error");
                hashMap.put("url", str2);
                hashMap.put("description", str);
                if (!this.a.booleanValue() && this.f14092b.equals(str2)) {
                    this.a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, webView, hashMap);
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, hashMap);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                HashMap q10 = j.q("type", "http");
                String str = webResourceRequest.getUrl() + "";
                q10.put("url", str);
                q10.put("statusCode", webResourceResponse.getStatusCode() + "");
                q10.put("description", "http error");
                if (!this.a.booleanValue() && (this.f14092b.equals(str) || TextUtils.isEmpty(this.f14092b))) {
                    this.a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, webView, q10);
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, q10);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                HashMap q10 = j.q("type", "ssl");
                q10.put("url", sslError.getUrl());
                q10.put("description", "ssl error");
                if (!this.a.booleanValue()) {
                    if (this.f14092b.equals(sslError.getUrl() + "")) {
                        this.a = Boolean.TRUE;
                        CollapsibleWebView.a(CollapsibleWebView.this, webView, q10);
                    }
                }
                CollapsibleWebView.b(CollapsibleWebView.this, webView, q10);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                ad.b("CollapsibleWebView", "WebView called onRenderProcessGone");
                return true;
            }
        });
    }

    public void setCollapseIconName(String str) {
        this.f14090h = str;
    }

    public void setCollapseListener(CommonWebView.a aVar) {
        this.f14087e.add(aVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i10, int i11, int i12, int i13) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.a.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f14091i = str;
    }

    public void setExpandListener(CommonWebView.a aVar) {
        this.f14088f.add(aVar);
    }

    public void setPageLoadListener(a aVar) {
        this.f14089g.add(aVar);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<a> it = collapsibleWebView.f14089g.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }

    public static /* synthetic */ void b(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<a> it = collapsibleWebView.f14089g.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    public static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<a> it = collapsibleWebView.f14089g.iterator();
        while (it.hasNext()) {
            it.next().a(view, (Map<String, String>) map);
        }
    }

    public static /* synthetic */ void b(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<a> it = collapsibleWebView.f14089g.iterator();
        while (it.hasNext()) {
            it.next().b(view, (Map<String, String>) map);
        }
    }
}
