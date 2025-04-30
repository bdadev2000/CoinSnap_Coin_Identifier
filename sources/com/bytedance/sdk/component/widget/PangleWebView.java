package com.bytedance.sdk.component.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class PangleWebView extends WebView {
    private boolean COT;
    private boolean KS;
    private boolean jU;
    private final HashSet<String> lMd;
    public long zp;

    public PangleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lMd = new HashSet<>();
        this.zp = System.currentTimeMillis();
        zp();
    }

    private void lMd() {
        if (this.KS) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.lMd.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    private void zp() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new SSWebView.zp());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (!this.KS && !this.COT) {
            super.addJavascriptInterface(obj, str);
            this.lMd.add(str);
        } else {
            tG.zp("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z8) {
        if (!this.KS && !this.COT) {
            super.clearCache(z8);
        } else {
            tG.zp("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.KS) {
            return;
        }
        this.KS = true;
        lMd();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.KS && !this.COT) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            tG.zp("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (!this.KS && !this.COT) {
            super.goBack();
        } else {
            tG.zp("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i9) {
        if (!this.KS && !this.COT) {
            super.goBackOrForward(i9);
        } else {
            tG.zp("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (!this.KS && !this.COT) {
            super.goForward();
        } else {
            tG.zp("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!this.KS && !this.COT) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            tG.zp("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (!this.KS && !this.COT) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e4) {
                tG.zp("TTAD.PangleWebView", "loadUrl: ", e4);
                return;
            }
        }
        tG.zp("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.jU) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.KS && !this.COT) {
            super.onDraw(canvas);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        if (!this.KS && !this.COT) {
            super.onMeasure(i9, i10);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (!this.KS && !this.COT) {
            try {
                super.onPause();
                return;
            } catch (Exception e4) {
                tG.zp("TTAD.PangleWebView", "onPause: ", e4);
                return;
            }
        }
        tG.zp("TTAD.PangleWebView", "onPause: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (!this.KS && !this.COT) {
            try {
                super.onResume();
                return;
            } catch (Exception e4) {
                tG.zp("TTAD.PangleWebView", "onResume: ", e4);
                return;
            }
        }
        tG.zp("TTAD.PangleWebView", "onResume: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (!this.KS && !this.COT) {
            super.pauseTimers();
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (!this.KS && !this.COT) {
            super.reload();
        } else {
            tG.zp("TTAD.PangleWebView", "reload: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (!this.KS && !this.COT) {
            super.removeJavascriptInterface(str);
            this.lMd.remove(str);
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (!this.KS && !this.COT) {
            super.resumeTimers();
        }
    }

    public void setDestroyOnDetached(boolean z8) {
        this.jU = z8;
    }

    public void setRecycler(boolean z8) {
        this.COT = z8;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (!this.KS && !this.COT) {
            try {
                super.stopLoading();
                return;
            } catch (Exception e4) {
                tG.zp("TTAD.PangleWebView", "stopLoading: ", e4);
                return;
            }
        }
        tG.zp("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
    }

    public PangleWebView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.lMd = new HashSet<>();
        this.zp = System.currentTimeMillis();
        zp();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!this.KS && !this.COT) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e4) {
                tG.zp("TTAD.PangleWebView", "loadUrl: ", e4);
                return;
            }
        }
        tG.zp("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }
}
