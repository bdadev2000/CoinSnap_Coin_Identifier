package com.bytedance.sdk.component.NjR;

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
import bh.z;
import com.bytedance.sdk.component.NjR.YFl;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.aIu;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY extends FrameLayout {
    private static tN dXO;
    private boolean AlY;
    private long Cfr;
    private long DSW;
    private List<String> EH;
    private YFl.InterfaceC0077YFl GA;
    private InterfaceC0076AlY Ga;
    private AttributeSet Ne;
    private long NjR;
    private String Sg;
    private AtomicBoolean UZM;
    private Context VOe;
    private float Wwa;
    private com.bytedance.sdk.component.NjR.Sg.YFl YFl;
    private AtomicBoolean YI;
    private View YoT;
    private Sg aIu;
    private AtomicBoolean bZ;
    private volatile WebView eT;
    private long hQ;
    private float lG;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10320nc;
    private com.bytedance.sdk.component.NjR.YFl pDU;
    private int qO;
    private long qsH;
    private float rkt;
    private JSONObject tN;

    /* renamed from: vc, reason: collision with root package name */
    private float f10321vc;
    private float wN;
    private aIu wXo;

    /* renamed from: com.bytedance.sdk.component.NjR.AlY$AlY, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0076AlY {
    }

    /* loaded from: classes.dex */
    public interface Sg {
    }

    /* loaded from: classes.dex */
    public static class YFl extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView != null) {
                webView.post(new Runnable() { // from class: com.bytedance.sdk.component.NjR.AlY.YFl.1
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

    /* loaded from: classes.dex */
    public interface tN {
        WebView createWebView(Context context, AttributeSet attributeSet, int i10);
    }

    public AlY(Context context) {
        this(YFl(context), false);
    }

    private void EH() {
        if (this.eT == null) {
            return;
        }
        try {
            this.eT.removeJavascriptInterface("searchBoxJavaBridge_");
            this.eT.removeJavascriptInterface("accessibility");
            this.eT.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    private static Context YFl(Context context) {
        return context;
    }

    private void lG() {
        if (this.wXo == null) {
            this.YI.set(false);
            this.wXo = new aIu(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.NjR.AlY.1
        };
        this.YI.set(true);
    }

    private void rkt() {
        try {
            WebSettings settings = this.eT.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(tN tNVar) {
        dXO = tNVar;
    }

    private static void tN(Context context) {
    }

    public void AlY() {
        try {
            this.eT.reload();
        } catch (Throwable unused) {
        }
    }

    public boolean DSW() {
        if (this.eT == null) {
            return false;
        }
        try {
            return this.eT.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void GA() {
        try {
            this.eT.clearView();
        } catch (Throwable unused) {
        }
    }

    public void NjR() {
        if (this.eT != null) {
            this.eT.onResume();
        }
    }

    public void Sg() {
        if (this.eT != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.eT.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.eT, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void YoT() {
        if (this.eT == null) {
            return;
        }
        try {
            this.eT.destroy();
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.eT.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.eT.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.eT == null) {
            return;
        }
        try {
            this.eT.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void eT() {
        if (this.eT == null) {
            return;
        }
        try {
            this.eT.onPause();
        } catch (Throwable unused) {
        }
    }

    public void f_() {
        try {
            this.eT = YFl(this.Ne, 0);
            Sg();
            Sg(YFl(this.VOe));
        } catch (Throwable th2) {
            YoT.YFl("SSWebView.TAG", "initWebview: " + th2.getMessage());
        }
    }

    public View getArbitrageLoadingView() {
        return this.YoT;
    }

    public int getContentHeight() {
        if (this.eT == null) {
            return 0;
        }
        try {
            return this.eT.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.Cfr;
    }

    public long getLandingPageClickEnd() {
        return this.hQ;
    }

    public com.bytedance.sdk.component.NjR.Sg.YFl getMaterialMeta() {
        return this.YFl;
    }

    public String getOriginalUrl() {
        String url;
        if (this.eT == null) {
            return null;
        }
        try {
            String originalUrl = this.eT.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.eT.getUrl()) != null) {
                if (url.startsWith(z.FILE_SCHEME)) {
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
        if (this.eT == null) {
            return 0;
        }
        try {
            return this.eT.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (this.eT == null) {
            return null;
        }
        try {
            return this.eT.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.eT == null) {
            return "";
        }
        try {
            return this.eT.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.eT;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void nc() {
        try {
            this.eT.clearHistory();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bZ.set(true);
        if (this.UZM.get() && !this.YI.get()) {
            lG();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bZ.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent YFl2;
        try {
            YFl(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f10320nc && (YFl2 = YFl(this)) != null) {
                YFl2.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void pDU() {
        try {
            this.eT.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public void qsH() {
        try {
            this.eT.goForward();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.eT.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.eT.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.eT.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z10) {
        try {
            this.eT.getSettings().setAppCacheEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.eT.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.eT.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.eT.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.qO = i10;
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.eT.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.lG = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.eT.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.eT.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.eT.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.eT.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.eT.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.f10320nc = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.eT.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.eT.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.AlY = z10;
    }

    public void setLandingPageClickBegin(long j3) {
        this.Cfr = j3;
    }

    public void setLandingPageClickEnd(long j3) {
        this.hQ = j3;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.eT.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.eT.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.eT.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(com.bytedance.sdk.component.NjR.Sg.YFl yFl) {
        this.YFl = yFl;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.eT.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.eT.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(Sg sg2) {
        this.aIu = sg2;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.eT.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setRecycler(boolean z10) {
        if (this.eT != null && (this.eT instanceof com.bytedance.sdk.component.NjR.tN)) {
            ((com.bytedance.sdk.component.NjR.tN) this.eT).setRecycler(z10);
        }
    }

    public void setShakeValue(float f10) {
        this.rkt = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.eT.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.Sg = str;
        com.bytedance.sdk.component.NjR.YFl yFl = this.pDU;
        if (yFl != null) {
            yFl.YFl(str);
        }
    }

    public void setTouchStateListener(InterfaceC0076AlY interfaceC0076AlY) {
        this.Ga = interfaceC0076AlY;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.eT.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.eT.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.eT.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.eT.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof InterfaceC0076AlY) {
                setTouchStateListener((InterfaceC0076AlY) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new YFl();
            }
            this.eT.setWebViewClient(new wN(this.GA, webViewClient, this.EH));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.Wwa = f10;
    }

    public void vc() {
        try {
            this.eT.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean wN() {
        if (this.eT == null) {
            return false;
        }
        try {
            return this.eT.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public AlY(Context context, boolean z10) {
        super(YFl(context));
        this.wN = 0.0f;
        this.f10321vc = 0.0f;
        this.DSW = 0L;
        this.qsH = 0L;
        this.NjR = 0L;
        this.f10320nc = false;
        this.rkt = 20.0f;
        this.Wwa = 50.0f;
        this.bZ = new AtomicBoolean();
        this.UZM = new AtomicBoolean();
        this.YI = new AtomicBoolean();
        this.VOe = context;
        if (z10) {
            return;
        }
        try {
            this.eT = YFl((AttributeSet) null, 0);
            Sg();
        } catch (Throwable unused) {
        }
        Sg(YFl(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.eT.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void YFl(boolean z10, int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (z10 && this.eT != null && (this.eT instanceof com.bytedance.sdk.component.NjR.tN)) {
            this.pDU = new com.bytedance.sdk.component.NjR.YFl(this.VOe, i10, i11, list, i12);
            this.EH = list2;
            if (!TextUtils.isEmpty(this.Sg)) {
                this.pDU.YFl(this.Sg);
            }
            ((com.bytedance.sdk.component.NjR.tN) this.eT).setArbitrageTouchListener(this.pDU);
            this.GA = this.pDU.YFl();
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.Sg;
    }

    public void tN() {
        try {
            this.eT.stopLoading();
        } catch (Throwable unused) {
        }
    }

    private static boolean tN(View view) {
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

    private void Sg(Context context) {
        tN(context);
        rkt();
        EH();
    }

    private static boolean Sg(View view) {
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

    public void YFl(boolean z10, View view) {
        if (z10) {
            this.YoT = view;
            if (view == null || view.getParent() != null) {
                return;
            }
            addView(this.YoT, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView YFl(AttributeSet attributeSet, int i10) {
        tN tNVar = dXO;
        if (tNVar != null) {
            return tNVar.createWebView(getContext(), attributeSet, i10);
        }
        if (attributeSet == null) {
            return new WebView(YFl(this.VOe));
        }
        return new WebView(YFl(this.VOe), attributeSet);
    }

    @TargetApi(19)
    public void YFl(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.eT.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void YFl(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.eT.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void YFl(boolean z10) {
        try {
            this.eT.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent YFl(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (Sg(view2) || tN(view2)) ? parent : YFl(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void YFl(Object obj, String str) {
        try {
            this.eT.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void YFl(MotionEvent motionEvent) {
        if (!this.AlY || this.YFl == null) {
            return;
        }
        if ((this.Sg != null || this.tN != null) && motionEvent != null) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        this.tN.put("start_x", String.valueOf(this.wN));
                        this.tN.put("start_y", String.valueOf(this.f10321vc));
                        this.tN.put("offset_x", String.valueOf(motionEvent.getRawX() - this.wN));
                        this.tN.put("offset_y", String.valueOf(motionEvent.getRawY() - this.f10321vc));
                        this.tN.put("url", String.valueOf(getUrl()));
                        this.tN.put("tag", "");
                        this.qsH = System.currentTimeMillis();
                        if (this.eT != null) {
                            this.hQ = this.qsH;
                        }
                        this.tN.put("down_time", this.DSW);
                        this.tN.put("up_time", this.qsH);
                        if (com.bytedance.sdk.component.NjR.YFl.YFl.YFl().Sg() != null) {
                            long j3 = this.NjR;
                            long j10 = this.DSW;
                            if (j3 != j10) {
                                this.NjR = j10;
                                com.bytedance.sdk.component.NjR.YFl.YFl.YFl().Sg().YFl(this.YFl, this.Sg, "in_web_click", this.tN, this.qsH - this.DSW);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.wN = motionEvent.getRawX();
                this.f10321vc = motionEvent.getRawY();
                this.DSW = System.currentTimeMillis();
                this.tN = new JSONObject();
                if (this.eT == null) {
                } else {
                    this.Cfr = this.DSW;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
