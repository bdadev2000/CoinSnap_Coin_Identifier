package com.glority.android.cmsui2.view.child;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.glority.android.cmsui2.R;
import com.glority.android.cmsui2.entity.ExtraData;
import com.glority.android.cmsui2.model.JsReportLayoutSubpageRectParam;
import com.glority.android.cmsui2.view.BaseCmsItemView;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.xx.constants.Args;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.utils.ui.ViewUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: WebViewItemView.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 H2\u00020\u0001:\u0003HIJBc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u00105\u001a\u00020/H\u0016J \u00106\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u000e\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u000202J\u000e\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u000202J\u000e\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u000204J\u000e\u0010@\u001a\u00020\u00102\u0006\u0010?\u001a\u000204J\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0010J\u0006\u0010C\u001a\u00020\u0010J\b\u0010D\u001a\u00020\u0010H\u0002J\b\u0010E\u001a\u00020\u0010H\u0002J\u0010\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u0005H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020401X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/glority/android/cmsui2/view/child/WebViewItemView;", "Lcom/glority/android/cmsui2/view/BaseCmsItemView;", "context", "Landroid/content/Context;", "url", "", "allowRules", "", "methodListener", "Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "startupParams", "", "", Args.pageName, "onLoadingFinish", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lcom/glority/base/widget/webview/JsbWebView$MethodListener;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getContext", "()Landroid/content/Context;", "getUrl", "()Ljava/lang/String;", "getAllowRules", "()Ljava/util/Set;", "getMethodListener", "()Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "getStartupParams", "()Ljava/util/Map;", "getPageName", "getOnLoadingFinish", "()Lkotlin/jvm/functions/Function0;", "isLoadingFinish", "", "startLoadTime", "", "getStartLoadTime", "()J", "setStartLoadTime", "(J)V", "webView", "Lcom/glority/base/widget/webview/JsbWebView;", "getWebView", "()Lcom/glority/base/widget/webview/JsbWebView;", "setWebView", "(Lcom/glority/base/widget/webview/JsbWebView;)V", "scrollHeight", "", "onScrollHeightChangedListeners", "", "Lcom/glority/android/cmsui2/view/child/WebViewItemView$OnScrollHeightChangedListener;", "childItemLayoutChangedListeners", "Lcom/glority/android/cmsui2/view/child/WebViewItemView$ChildItemLayoutChangedListener;", "getLayoutId", "render", "rootView", "Landroid/view/View;", "data", "Lcom/glority/android/cmsui2/entity/ExtraData;", "addScrollHeightChangedListener", "onScrollHeightChangedListener", "removeScrollHeightChangedListener", "addChildItemLayoutChangedListener", "childItemLayoutChangedListener", "removeChildItemLayoutChangedListener", "setWebViewInvisible", "setWebViewVisible", "setWebViewGone", "initWebView", "invokeLoadingFinish", "updateWebviewRealHeight", "it", "Companion", "OnScrollHeightChangedListener", "ChildItemLayoutChangedListener", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class WebViewItemView extends BaseCmsItemView {
    private static final String TAG = "WebViewItem";
    private final Set<String> allowRules;
    private List<ChildItemLayoutChangedListener> childItemLayoutChangedListeners;
    private final Context context;
    private boolean isLoadingFinish;
    private final JsbWebView.MethodListener methodListener;
    private final Function0<Unit> onLoadingFinish;
    private List<OnScrollHeightChangedListener> onScrollHeightChangedListeners;
    private final String pageName;
    private int scrollHeight;
    private long startLoadTime;
    private final Map<String, Object> startupParams;
    private final String url;
    private JsbWebView webView;

    /* compiled from: WebViewItemView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/cmsui2/view/child/WebViewItemView$OnScrollHeightChangedListener;", "", "onScrollHeightChange", "", "oldScrollHeight", "", "newScrollHeight", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes14.dex */
    public interface OnScrollHeightChangedListener {
        void onScrollHeightChange(int oldScrollHeight, int newScrollHeight);
    }

    public /* synthetic */ WebViewItemView(Context context, String str, Set set, JsbWebView.MethodListener methodListener, Map map, String str2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, set, methodListener, map, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : function0);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Set<String> getAllowRules() {
        return this.allowRules;
    }

    public final JsbWebView.MethodListener getMethodListener() {
        return this.methodListener;
    }

    public final Map<String, Object> getStartupParams() {
        return this.startupParams;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final Function0<Unit> getOnLoadingFinish() {
        return this.onLoadingFinish;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewItemView(Context context, String url, Set<String> allowRules, JsbWebView.MethodListener methodListener, Map<String, ? extends Object> startupParams, String str, Function0<Unit> function0) {
        super(str);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(allowRules, "allowRules");
        Intrinsics.checkNotNullParameter(startupParams, "startupParams");
        this.context = context;
        this.url = url;
        this.allowRules = allowRules;
        this.methodListener = methodListener;
        this.startupParams = startupParams;
        this.pageName = str;
        this.onLoadingFinish = function0;
        this.onScrollHeightChangedListeners = new ArrayList();
        this.childItemLayoutChangedListeners = new ArrayList();
    }

    public final long getStartLoadTime() {
        return this.startLoadTime;
    }

    public final void setStartLoadTime(long j) {
        this.startLoadTime = j;
    }

    public final JsbWebView getWebView() {
        return this.webView;
    }

    public final void setWebView(JsbWebView jsbWebView) {
        this.webView = jsbWebView;
    }

    @Override // com.glority.android.cmsui2.view.BaseCmsItemView
    public int getLayoutId() {
        return R.layout.item_cms_webview2;
    }

    @Override // com.glority.android.cmsui2.view.BaseCmsItemView
    public void render(Context context, View rootView, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(data, "data");
        JsbWebView jsbWebView = (JsbWebView) rootView.findViewById(R.id.wv);
        this.webView = jsbWebView;
        if (jsbWebView != null) {
            jsbWebView.initJsb(this.allowRules, this.methodListener);
        }
        JsbWebView jsbWebView2 = this.webView;
        if (jsbWebView2 != null) {
            jsbWebView2.setInjectStartupParams(this.startupParams);
        }
        initWebView();
    }

    public final void addScrollHeightChangedListener(OnScrollHeightChangedListener onScrollHeightChangedListener) {
        Intrinsics.checkNotNullParameter(onScrollHeightChangedListener, "onScrollHeightChangedListener");
        this.onScrollHeightChangedListeners.add(onScrollHeightChangedListener);
    }

    public final void removeScrollHeightChangedListener(OnScrollHeightChangedListener onScrollHeightChangedListener) {
        Intrinsics.checkNotNullParameter(onScrollHeightChangedListener, "onScrollHeightChangedListener");
        this.onScrollHeightChangedListeners.remove(onScrollHeightChangedListener);
    }

    public final void addChildItemLayoutChangedListener(ChildItemLayoutChangedListener childItemLayoutChangedListener) {
        Intrinsics.checkNotNullParameter(childItemLayoutChangedListener, "childItemLayoutChangedListener");
        this.childItemLayoutChangedListeners.add(childItemLayoutChangedListener);
    }

    public final void removeChildItemLayoutChangedListener(ChildItemLayoutChangedListener childItemLayoutChangedListener) {
        Intrinsics.checkNotNullParameter(childItemLayoutChangedListener, "childItemLayoutChangedListener");
        this.childItemLayoutChangedListeners.remove(childItemLayoutChangedListener);
    }

    public final void setWebViewInvisible() {
        JsbWebView jsbWebView = this.webView;
        if (jsbWebView != null) {
            jsbWebView.setVisibility(4);
        }
    }

    public final void setWebViewVisible() {
        JsbWebView jsbWebView = this.webView;
        if (jsbWebView != null) {
            jsbWebView.setVisibility(0);
        }
    }

    public final void setWebViewGone() {
        JsbWebView jsbWebView = this.webView;
        if (jsbWebView != null) {
            jsbWebView.setVisibility(8);
        }
    }

    private final void initWebView() {
        WebSettings settings;
        if (AppViewModel.INSTANCE.isDebugMode()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        JsbWebView jsbWebView = this.webView;
        if (jsbWebView != null) {
            jsbWebView.setLayerType(0, null);
        }
        JsbWebView jsbWebView2 = this.webView;
        if (jsbWebView2 != null) {
            jsbWebView2.setBackgroundColor(this.context.getColor(R.color.transparent));
        }
        JsbWebView jsbWebView3 = this.webView;
        if (jsbWebView3 == null || (settings = jsbWebView3.getSettings()) == null) {
            return;
        }
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setTextZoom(100);
        settings.setCacheMode(1);
        settings.setMixedContentMode(0);
        JsbWebView jsbWebView4 = this.webView;
        if (jsbWebView4 != null) {
            jsbWebView4.setWebViewClient(new WebViewClient() { // from class: com.glority.android.cmsui2.view.child.WebViewItemView$initWebView$1
                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    WebViewItemView.this.isLoadingFinish = false;
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView view, String url) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(url, "url");
                    super.onPageFinished(view, url);
                    WebViewItemView.this.invokeLoadingFinish();
                    Log.i("WebViewItem", "onPageFinished");
                    WebViewItemView.this.logEvent("cms_load_time", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("target", url), TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - WebViewItemView.this.getStartLoadTime()))));
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                    super.onReceivedHttpError(view, request, errorResponse);
                    if (request == null || !request.isForMainFrame()) {
                        return;
                    }
                    Bundle logEventBundleOf = LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("target", WebViewItemView.this.getUrl()));
                    if ((errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null) != null) {
                        logEventBundleOf = LogEventArgumentsKt.logEventBundleAdd(logEventBundleOf, TuplesKt.to("code", Integer.valueOf(errorResponse.getStatusCode())));
                    }
                    WebViewItemView.this.logEvent("cms_load_failed", logEventBundleOf);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                    super.onReceivedError(view, request, error);
                    if (request == null || !request.isForMainFrame()) {
                        return;
                    }
                    Bundle logEventBundleOf = LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("target", WebViewItemView.this.getUrl()));
                    if ((error != null ? Integer.valueOf(error.getErrorCode()) : null) != null) {
                        logEventBundleOf = LogEventArgumentsKt.logEventBundleAdd(logEventBundleOf, TuplesKt.to("code", Integer.valueOf(error.getErrorCode())));
                    }
                    new LogEventRequest("cms_load_failed", logEventBundleOf).post();
                }
            });
        }
        JsbWebView jsbWebView5 = this.webView;
        if (jsbWebView5 != null) {
            jsbWebView5.setWebChromeClient(new WebChromeClient() { // from class: com.glority.android.cmsui2.view.child.WebViewItemView$initWebView$2
                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView view, int newProgress) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    super.onProgressChanged(view, newProgress);
                    if (newProgress >= 80) {
                        WebViewItemView.this.invokeLoadingFinish();
                    }
                    JsbWebView webView = WebViewItemView.this.getWebView();
                    ViewParent parent = webView != null ? webView.getParent() : null;
                    CmsView cmsView = parent instanceof CmsView ? (CmsView) parent : null;
                    if (cmsView != null) {
                        cmsView.checkLayoutChange();
                    }
                }
            });
        }
        this.startLoadTime = System.currentTimeMillis();
        JsbWebView jsbWebView6 = this.webView;
        if (jsbWebView6 != null) {
            jsbWebView6.loadUrl(this.url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeLoadingFinish() {
        Function0<Unit> function0;
        if (!this.isLoadingFinish && (function0 = this.onLoadingFinish) != null) {
            function0.invoke();
        }
        this.isLoadingFinish = true;
    }

    private final void updateWebviewRealHeight(String it) {
        Float floatOrNull = StringsKt.toFloatOrNull(it);
        int dp2px = ViewUtils.dp2px(floatOrNull != null ? floatOrNull.floatValue() : 0.0f);
        if (this.scrollHeight != dp2px) {
            JsbWebView jsbWebView = this.webView;
            ViewParent parent = jsbWebView != null ? jsbWebView.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                ViewGroup viewGroup2 = viewGroup;
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                if (dp2px > 0) {
                    layoutParams.height = dp2px;
                }
                viewGroup2.setLayoutParams(layoutParams);
            }
            Iterator<OnScrollHeightChangedListener> it2 = this.onScrollHeightChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onScrollHeightChange(this.scrollHeight, dp2px);
            }
            this.scrollHeight = dp2px;
        }
    }

    /* compiled from: WebViewItemView.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/glority/android/cmsui2/view/child/WebViewItemView$ChildItemLayoutChangedListener;", "", "onChildLayoutChanged", "", "id", "", "offsetTop", "", "offsetHeight", "hasLearnMore", "", "onChildSubpageLayoutChanged", "parentOffsetTop", "subpages", "", "Lcom/glority/android/cmsui2/model/JsReportLayoutSubpageRectParam$SubpageRectParam;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes14.dex */
    public interface ChildItemLayoutChangedListener {
        void onChildLayoutChanged(String id, int offsetTop, int offsetHeight, boolean hasLearnMore);

        void onChildSubpageLayoutChanged(String id, int parentOffsetTop, List<JsReportLayoutSubpageRectParam.SubpageRectParam> subpages);

        /* compiled from: WebViewItemView.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
        /* loaded from: classes14.dex */
        public static final class DefaultImpls {
            public static void onChildSubpageLayoutChanged(ChildItemLayoutChangedListener childItemLayoutChangedListener, String id, int i, List<JsReportLayoutSubpageRectParam.SubpageRectParam> subpages) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(subpages, "subpages");
            }

            public static /* synthetic */ void onChildLayoutChanged$default(ChildItemLayoutChangedListener childItemLayoutChangedListener, String str, int i, int i2, boolean z, int i3, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onChildLayoutChanged");
                }
                if ((i3 & 8) != 0) {
                    z = false;
                }
                childItemLayoutChangedListener.onChildLayoutChanged(str, i, i2, z);
            }
        }
    }
}
