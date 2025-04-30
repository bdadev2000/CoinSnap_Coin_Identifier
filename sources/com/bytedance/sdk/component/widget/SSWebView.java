package com.bytedance.sdk.component.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import c7.C0665z;
import com.bytedance.sdk.component.utils.FP;
import com.bytedance.sdk.component.utils.tG;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SSWebView extends FrameLayout {
    private static KS ox;
    private volatile WebView Bj;
    private float COT;
    private AtomicBoolean FP;
    private float HWF;
    private JSONObject KS;
    private lMd KVG;
    private long Lij;
    private long QR;
    private long RCv;
    private long YW;
    private AtomicBoolean cz;
    private int dQp;
    private boolean dT;
    private boolean jU;
    private long ku;
    private String lMd;
    private AtomicBoolean ot;
    private Context pvr;
    private float rV;
    private float tG;
    private float vDp;
    private AttributeSet vwr;
    private FP woN;
    private jU yRU;
    private com.bytedance.sdk.component.widget.lMd.zp zp;

    /* loaded from: classes.dex */
    public interface KS {
        WebView createWebView(Context context, AttributeSet attributeSet, int i9);
    }

    /* loaded from: classes.dex */
    public interface jU {
    }

    /* loaded from: classes.dex */
    public interface lMd {
    }

    /* loaded from: classes.dex */
    public static class zp extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView != null) {
                webView.post(new Runnable() { // from class: com.bytedance.sdk.component.widget.SSWebView.zp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ViewGroup viewGroup = (ViewGroup) webView.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(webView);
                            }
                            webView.destroy();
                        } catch (Exception unused) {
                        }
                    }
                });
                return true;
            }
            return true;
        }
    }

    public SSWebView(Context context) {
        this(zp(context), false);
    }

    private static void KS(Context context) {
    }

    private void KVG() {
        try {
            WebSettings settings = this.Bj.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void dQp() {
        if (this.Bj == null) {
            return;
        }
        try {
            this.Bj.removeJavascriptInterface("searchBoxJavaBridge_");
            this.Bj.removeJavascriptInterface("accessibility");
            this.Bj.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(KS ks) {
        ox = ks;
    }

    private void woN() {
        if (this.woN == null) {
            this.ot.set(false);
            this.woN = new FP(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.widget.SSWebView.1
        };
        this.ot.set(true);
    }

    private static Context zp(Context context) {
        return context;
    }

    public void Bj() {
        if (this.Bj == null) {
            return;
        }
        try {
            this.Bj.onPause();
        } catch (Throwable unused) {
        }
    }

    public boolean COT() {
        if (this.Bj == null) {
            return false;
        }
        try {
            return this.Bj.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void HWF() {
        try {
            this.Bj.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean QR() {
        if (this.Bj == null) {
            return false;
        }
        try {
            return this.Bj.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void YW() {
        if (this.Bj != null) {
            this.Bj.onResume();
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.Bj.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.Bj.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.Bj == null) {
            return;
        }
        try {
            this.Bj.computeScroll();
        } catch (Throwable unused) {
        }
    }

    public void dT() {
        try {
            this.Bj.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void d_() {
        try {
            this.Bj = zp(this.vwr, 0);
            lMd();
            lMd(zp(this.pvr));
        } catch (Throwable th) {
            tG.zp("SSWebView.TAG", "initWebview: " + th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getContentHeight() {
        if (this.Bj == null) {
            return 0;
        }
        try {
            return this.Bj.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.RCv;
    }

    public long getLandingPageClickEnd() {
        return this.Lij;
    }

    public com.bytedance.sdk.component.widget.lMd.zp getMaterialMeta() {
        return this.zp;
    }

    public String getOriginalUrl() {
        String url;
        if (this.Bj == null) {
            return null;
        }
        try {
            String originalUrl = this.Bj.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.Bj.getUrl()) != null) {
                if (url.startsWith(C0665z.FILE_SCHEME)) {
                    return url;
                }
                return originalUrl;
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.Bj == null) {
            return 0;
        }
        try {
            return this.Bj.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (this.Bj == null) {
            return null;
        }
        try {
            return this.Bj.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.Bj == null) {
            return "";
        }
        try {
            return this.Bj.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.Bj;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void jU() {
        try {
            this.Bj.reload();
        } catch (Throwable unused) {
        }
    }

    public void ku() {
        try {
            this.Bj.goForward();
        } catch (Throwable unused) {
        }
    }

    public void lMd() {
        if (this.Bj != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.Bj.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.Bj, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cz.set(true);
        if (this.FP.get() && !this.ot.get()) {
            woN();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cz.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent zp2;
        try {
            zp(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.dT && (zp2 = zp(this)) != null) {
                zp2.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
    }

    public void rV() {
        try {
            this.Bj.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.Bj.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z8) {
        try {
            this.Bj.getSettings().setAllowFileAccess(z8);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        try {
            super.setAlpha(f9);
            this.Bj.setAlpha(f9);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z8) {
        try {
            this.Bj.getSettings().setAppCacheEnabled(z8);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        try {
            this.Bj.setBackgroundColor(i9);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z8) {
        try {
            this.Bj.getSettings().setBuiltInZoomControls(z8);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i9) {
        try {
            this.Bj.getSettings().setCacheMode(i9);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i9) {
        this.dQp = i9;
    }

    public void setDatabaseEnabled(boolean z8) {
        try {
            this.Bj.getSettings().setDatabaseEnabled(z8);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f9) {
        this.tG = f9;
    }

    public void setDefaultFontSize(int i9) {
        try {
            this.Bj.getSettings().setDefaultFontSize(i9);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.Bj.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z8) {
        try {
            this.Bj.getSettings().setDisplayZoomControls(z8);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z8) {
        try {
            this.Bj.getSettings().setDomStorageEnabled(z8);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.Bj.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z8) {
        this.dT = z8;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z8) {
        try {
            this.Bj.getSettings().setJavaScriptCanOpenWindowsAutomatically(z8);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z8) {
        try {
            this.Bj.getSettings().setJavaScriptEnabled(z8);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z8) {
        this.jU = z8;
    }

    public void setLandingPageClickBegin(long j7) {
        this.RCv = j7;
    }

    public void setLandingPageClickEnd(long j7) {
        this.Lij = j7;
    }

    @Override // android.view.View
    public void setLayerType(int i9, Paint paint) {
        try {
            this.Bj.setLayerType(i9, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.Bj.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z8) {
        try {
            this.Bj.getSettings().setLoadWithOverviewMode(z8);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(com.bytedance.sdk.component.widget.lMd.zp zpVar) {
        this.zp = zpVar;
    }

    public void setMixedContentMode(int i9) {
        try {
            this.Bj.getSettings().setMixedContentMode(i9);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z8) {
        try {
            this.Bj.setNetworkAvailable(z8);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(lMd lmd) {
        this.KVG = lmd;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i9) {
        try {
            this.Bj.setOverScrollMode(i9);
            super.setOverScrollMode(i9);
        } catch (Throwable unused) {
        }
    }

    public void setRecycler(boolean z8) {
        if (this.Bj != null && (this.Bj instanceof PangleWebView)) {
            ((PangleWebView) this.Bj).setRecycler(z8);
        }
    }

    public void setShakeValue(float f9) {
        this.vDp = f9;
    }

    public void setSupportZoom(boolean z8) {
        try {
            this.Bj.getSettings().setSupportZoom(z8);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.lMd = str;
    }

    public void setTouchStateListener(jU jUVar) {
        this.yRU = jUVar;
    }

    public void setUseWideViewPort(boolean z8) {
        try {
            this.Bj.getSettings().setUseWideViewPort(z8);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.Bj.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        try {
            super.setVisibility(i9);
            this.Bj.setVisibility(i9);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.Bj.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof jU) {
                setTouchStateListener((jU) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new zp();
            }
            this.Bj.setWebViewClient(webViewClient);
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f9) {
        this.rV = f9;
    }

    public void tG() {
        try {
            this.Bj.clearView();
        } catch (Throwable unused) {
        }
    }

    public void vDp() {
        if (this.Bj == null) {
            return;
        }
        try {
            this.Bj.destroy();
        } catch (Throwable unused) {
        }
    }

    public SSWebView(Context context, boolean z8) {
        super(zp(context));
        this.COT = 0.0f;
        this.HWF = 0.0f;
        this.QR = 0L;
        this.ku = 0L;
        this.YW = 0L;
        this.dT = false;
        this.vDp = 20.0f;
        this.rV = 50.0f;
        this.cz = new AtomicBoolean();
        this.FP = new AtomicBoolean();
        this.ot = new AtomicBoolean();
        this.pvr = context;
        if (z8) {
            return;
        }
        try {
            this.Bj = zp((AttributeSet) null, 0);
            lMd();
        } catch (Throwable unused) {
        }
        lMd(zp(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.Bj.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equals("file")) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    private WebView zp(AttributeSet attributeSet, int i9) {
        KS ks = ox;
        if (ks != null) {
            return ks.createWebView(getContext(), attributeSet, i9);
        }
        if (attributeSet == null) {
            return new WebView(zp(this.pvr));
        }
        return new WebView(zp(this.pvr), attributeSet);
    }

    public void KS() {
        try {
            this.Bj.stopLoading();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.lMd;
    }

    private static boolean KS(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private void lMd(Context context) {
        KS(context);
        KVG();
        dQp();
    }

    @TargetApi(19)
    public void zp(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.Bj.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    private static boolean lMd(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void zp(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.Bj.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void zp(boolean z8) {
        try {
            this.Bj.clearCache(z8);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent zp(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (lMd(view2) || KS(view2)) ? parent : zp(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void zp(Object obj, String str) {
        try {
            this.Bj.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void zp(MotionEvent motionEvent) {
        if (!this.jU || this.zp == null) {
            return;
        }
        if ((this.lMd != null || this.KS != null) && motionEvent != null) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        this.KS.put("start_x", String.valueOf(this.COT));
                        this.KS.put("start_y", String.valueOf(this.HWF));
                        this.KS.put("offset_x", String.valueOf(motionEvent.getRawX() - this.COT));
                        this.KS.put("offset_y", String.valueOf(motionEvent.getRawY() - this.HWF));
                        this.KS.put("url", String.valueOf(getUrl()));
                        this.KS.put("tag", "");
                        this.ku = System.currentTimeMillis();
                        if (this.Bj != null) {
                            this.Lij = this.ku;
                        }
                        this.KS.put("down_time", this.QR);
                        this.KS.put("up_time", this.ku);
                        if (com.bytedance.sdk.component.widget.zp.zp.zp().lMd() != null) {
                            long j7 = this.YW;
                            long j9 = this.QR;
                            if (j7 != j9) {
                                this.YW = j9;
                                com.bytedance.sdk.component.widget.zp.zp.zp().lMd().zp(this.zp, this.lMd, "in_web_click", this.KS, this.ku - this.QR);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.COT = motionEvent.getRawX();
                this.HWF = motionEvent.getRawY();
                this.QR = System.currentTimeMillis();
                this.KS = new JSONObject();
                if (this.Bj == null) {
                } else {
                    this.RCv = this.QR;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
