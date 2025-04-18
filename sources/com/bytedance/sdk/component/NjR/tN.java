package com.bytedance.sdk.component.NjR;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.NjR.AlY;
import com.bytedance.sdk.component.utils.YoT;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class tN extends WebView {
    private boolean AlY;
    private final HashSet<String> Sg;
    public long YFl;
    private boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private YFl f10324vc;
    private boolean wN;

    public tN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Sg = new HashSet<>();
        this.YFl = System.currentTimeMillis();
        YFl();
    }

    private void Sg() {
        if (this.tN) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.Sg.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    private void YFl() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new AlY.YFl());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (!this.tN && !this.wN) {
            super.addJavascriptInterface(obj, str);
            this.Sg.add(str);
        } else {
            YoT.YFl("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z10) {
        if (!this.tN && !this.wN) {
            super.clearCache(z10);
        } else {
            YoT.YFl("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.tN) {
            return;
        }
        this.tN = true;
        Sg();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.tN && !this.wN) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            YoT.YFl("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (!this.tN && !this.wN) {
            super.goBack();
        } else {
            YoT.YFl("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i10) {
        if (!this.tN && !this.wN) {
            super.goBackOrForward(i10);
        } else {
            YoT.YFl("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (!this.tN && !this.wN) {
            super.goForward();
        } else {
            YoT.YFl("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!this.tN && !this.wN) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            YoT.YFl("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (!this.tN && !this.wN) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                YoT.YFl("TTAD.PangleWebView", "loadUrl: ", e2);
                return;
            }
        }
        YoT.YFl("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
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
        if (this.AlY) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.tN && !this.wN) {
            super.onDraw(canvas);
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.tN && !this.wN) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (!this.tN && !this.wN) {
            try {
                super.onPause();
                return;
            } catch (Exception e2) {
                YoT.YFl("TTAD.PangleWebView", "onPause: ", e2);
                return;
            }
        }
        YoT.YFl("TTAD.PangleWebView", "onPause: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (!this.tN && !this.wN) {
            try {
                super.onResume();
                return;
            } catch (Exception e2) {
                YoT.YFl("TTAD.PangleWebView", "onResume: ", e2);
                return;
            }
        }
        YoT.YFl("TTAD.PangleWebView", "onResume: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (!this.tN && !this.wN) {
            super.pauseTimers();
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (!this.tN && !this.wN) {
            super.reload();
        } else {
            YoT.YFl("TTAD.PangleWebView", "reload: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (!this.tN && !this.wN) {
            super.removeJavascriptInterface(str);
            this.Sg.remove(str);
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (!this.tN && !this.wN) {
            super.resumeTimers();
        }
    }

    public void setArbitrageTouchListener(YFl yFl) {
        this.f10324vc = yFl;
    }

    public void setDestroyOnDetached(boolean z10) {
        this.AlY = z10;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        YFl yFl = this.f10324vc;
        if (yFl == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            yFl.YFl(onTouchListener);
            super.setOnTouchListener(this.f10324vc);
        }
    }

    public void setRecycler(boolean z10) {
        this.wN = z10;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (!this.tN && !this.wN) {
            try {
                super.stopLoading();
                return;
            } catch (Exception e2) {
                YoT.YFl("TTAD.PangleWebView", "stopLoading: ", e2);
                return;
            }
        }
        YoT.YFl("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
    }

    public tN(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Sg = new HashSet<>();
        this.YFl = System.currentTimeMillis();
        YFl();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!this.tN && !this.wN) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                YoT.YFl("TTAD.PangleWebView", "loadUrl: ", e2);
                return;
            }
        }
        YoT.YFl("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }
}
