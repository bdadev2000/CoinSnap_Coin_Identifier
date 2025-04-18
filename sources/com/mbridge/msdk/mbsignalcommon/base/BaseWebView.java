package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.ad;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class BaseWebView extends WebView {
    protected Context a;

    /* renamed from: b, reason: collision with root package name */
    private View.OnTouchListener f14073b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnTouchListener f14074c;
    public long lastTouchTime;
    public b mWebViewClient;

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.f14074c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f14073b != null) {
                    return BaseWebView.this.f14073b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.a = context;
        a();
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public void setFilter(a aVar) {
        b bVar = this.mWebViewClient;
        if (bVar != null && (bVar instanceof b)) {
            bVar.a(aVar);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f14073b = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof b) {
            this.mWebViewClient = (b) webViewClient;
        }
    }

    public void a() {
        if (this.mWebViewClient == null) {
            b bVar = new b();
            this.mWebViewClient = bVar;
            setWebViewClient(bVar);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable th2) {
            ad.b("BaseWebView", th2.getMessage());
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e2) {
            ad.b("BaseWebView", e2.getMessage());
        }
        settings.setDatabaseEnabled(true);
        String path = this.a.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception e10) {
            ad.b("BaseWebView", e10.getMessage());
        }
        super.setOnTouchListener(this.f14074c);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.f14074c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f14073b != null) {
                    return BaseWebView.this.f14073b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.a = context;
        a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.lastTouchTime = 0L;
        this.f14074c = new View.OnTouchListener() { // from class: com.mbridge.msdk.mbsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.f14073b != null) {
                    return BaseWebView.this.f14073b.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.a = context;
        a();
    }
}
