package com.glority.android.cmsui.entity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.model.JsBaseParam;
import com.glority.android.cmsui.model.JsData;
import com.glority.android.cmsui.model.JsFeedbackParam;
import com.glority.android.cmsui.model.JsFeedsParam;
import com.glority.android.cmsui.model.JsLogEventParam;
import com.glority.android.cmsui.model.JsPageParam;
import com.glority.android.cmsui.widget.FixedWebView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.guide.IsJapaneseRequest;
import com.glority.android.xx.constants.Args;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: WebViewItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 72\u00020\u0001:\u000278B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010/\u001a\u000200H\u0016J \u00101\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R$\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00069"}, d2 = {"Lcom/glority/android/cmsui/entity/WebViewItem;", "Lcom/glority/android/cms/base/BaseItem;", "context", "Landroid/content/Context;", "url", "", "feedBackEnable", "", "downloadEnable", Args.pageName, "showSeparator", "(Landroid/content/Context;Ljava/lang/String;ZZLjava/lang/String;Z)V", "getContext", "()Landroid/content/Context;", "getDownloadEnable", "()Z", "getFeedBackEnable", "itemClick", "Lcom/glority/android/cms/listener/ClickListener;", "Lcom/glority/android/cmsui/model/JsData;", "getItemClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setItemClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "loadFailedListener", "", "getLoadFailedListener", "setLoadFailedListener", "loadFinisListener", "getLoadFinisListener", "setLoadFinisListener", "getPageName", "()Ljava/lang/String;", "getShowSeparator", "startLoadTime", "", "getStartLoadTime", "()J", "setStartLoadTime", "(J)V", "getUrl", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "getLayoutId", "", "render", "", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "Companion", "JSInterface", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class WebViewItem extends BaseItem {
    private static final String TAG = "WebViewItem";
    private final Context context;
    private final boolean downloadEnable;
    private final boolean feedBackEnable;
    private ClickListener<JsData> itemClick;
    private ClickListener<Object> loadFailedListener;
    private ClickListener<Object> loadFinisListener;
    private final String pageName;
    private final boolean showSeparator;
    private long startLoadTime;
    private final String url;
    private WebView webView;

    public final Context getContext() {
        return this.context;
    }

    public final boolean getFeedBackEnable() {
        return this.feedBackEnable;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewItem(Context context, String url, boolean z, boolean z2, String str, boolean z3) {
        super(str);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.context = context;
        this.url = url;
        this.feedBackEnable = z;
        this.downloadEnable = z2;
        this.pageName = str;
        this.showSeparator = z3;
        FixedWebView fixedWebView = new FixedWebView(context);
        fixedWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Unit unit = Unit.INSTANCE;
        FixedWebView fixedWebView2 = fixedWebView;
        this.webView = fixedWebView2;
        fixedWebView2.setLayerType(0, null);
        WebSettings settings = this.webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setAllowFileAccess(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setAppCacheEnabled(false);
        settings.setTextZoom(100);
        settings.setCacheMode(1);
        settings.setMixedContentMode(0);
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.glority.android.cmsui.entity.WebViewItem.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url2) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url2, "url");
                Log.i(WebViewItem.TAG, "url = " + url2);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url2) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url2, "url");
                super.onPageFinished(view, url2);
                Log.i(WebViewItem.TAG, "onPageFinished");
                WebViewItem.this.logEvent("cms_load_time", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("target", url2), TuplesKt.to("time", Long.valueOf(System.currentTimeMillis() - WebViewItem.this.getStartLoadTime()))));
                setJsConfig();
                ClickListener<Object> loadFinisListener = WebViewItem.this.getLoadFinisListener();
                if (loadFinisListener != null) {
                    loadFinisListener.onClick(view, null);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onScaleChanged(WebView view, float oldScale, float newScale) {
                Log.i(WebViewItem.TAG, "onScaleChanged. oldScale: " + oldScale + ", newScale: " + newScale);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                super.onReceivedHttpError(view, request, errorResponse);
                if (request == null || !request.isForMainFrame()) {
                    return;
                }
                ClickListener<Object> loadFailedListener = WebViewItem.this.getLoadFailedListener();
                if (loadFailedListener != null) {
                    loadFailedListener.onClick(WebViewItem.this.getWebView(), null);
                }
                Bundle logEventBundleOf = LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("target", WebViewItem.this.getUrl()));
                if ((errorResponse != null ? Integer.valueOf(errorResponse.getStatusCode()) : null) != null) {
                    logEventBundleOf = LogEventArgumentsKt.logEventBundleAdd(logEventBundleOf, TuplesKt.to("code", Integer.valueOf(errorResponse.getStatusCode())));
                }
                WebViewItem.this.logEvent("cms_load_failed", logEventBundleOf);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                if (request == null || !request.isForMainFrame()) {
                    return;
                }
                Bundle logEventBundleOf = LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("target", WebViewItem.this.getUrl()));
                if ((error != null ? Integer.valueOf(error.getErrorCode()) : null) != null) {
                    logEventBundleOf = LogEventArgumentsKt.logEventBundleAdd(logEventBundleOf, TuplesKt.to("code", Integer.valueOf(error.getErrorCode())));
                }
                new LogEventRequest("cms_load_failed", logEventBundleOf).post();
            }

            private final void setJsConfig() {
                WebViewItem.this.getWebView().loadUrl("javascript:toggleElement('feedback'," + WebViewItem.this.getFeedBackEnable() + ')');
                WebViewItem.this.getWebView().loadUrl("javascript:toggleElement('downloadPoem'," + WebViewItem.this.getDownloadEnable() + ')');
                WebViewItem.this.getWebView().loadUrl("javascript:toggleElement('jumpImages',true)");
            }
        });
        this.webView.addJavascriptInterface(new JSInterface(), "App");
        this.webView.setWebChromeClient(new WebChromeClient() { // from class: com.glority.android.cmsui.entity.WebViewItem.2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                Intrinsics.checkNotNullParameter(view, "view");
                Log.i(WebViewItem.TAG, "onProgressChanged newProgress=" + newProgress);
                super.onProgressChanged(view, newProgress);
            }
        });
        this.startLoadTime = System.currentTimeMillis();
        this.webView.loadUrl(url);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ WebViewItem(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13, java.lang.String r14, boolean r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 4
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r12
        L8:
            r0 = r16 & 8
            if (r0 == 0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r13
        Lf:
            r0 = r16 & 16
            if (r0 == 0) goto L19
            r0 = 0
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r7 = r0
            goto L1a
        L19:
            r7 = r14
        L1a:
            r0 = r16 & 32
            if (r0 == 0) goto L21
            r0 = 1
            r8 = r0
            goto L22
        L21:
            r8 = r15
        L22:
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.WebViewItem.<init>(android.content.Context, java.lang.String, boolean, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getDownloadEnable() {
        return this.downloadEnable;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final void setWebView(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<set-?>");
        this.webView = webView;
    }

    public final long getStartLoadTime() {
        return this.startLoadTime;
    }

    public final void setStartLoadTime(long j) {
        this.startLoadTime = j;
    }

    public final ClickListener<JsData> getItemClick() {
        return this.itemClick;
    }

    public final void setItemClick(ClickListener<JsData> clickListener) {
        this.itemClick = clickListener;
    }

    public final ClickListener<Object> getLoadFinisListener() {
        return this.loadFinisListener;
    }

    public final void setLoadFinisListener(ClickListener<Object> clickListener) {
        this.loadFinisListener = clickListener;
    }

    public final ClickListener<Object> getLoadFailedListener() {
        return this.loadFailedListener;
    }

    public final void setLoadFailedListener(ClickListener<Object> clickListener) {
        this.loadFailedListener = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_webview;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        helper.setGone(R.id.v_wv_separator, this.showSeparator);
        FrameLayout frameLayout = (FrameLayout) helper.getView(R.id.fl_root);
        frameLayout.removeAllViews();
        try {
            frameLayout.addView(this.webView);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* compiled from: WebViewItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/glority/android/cmsui/entity/WebViewItem$JSInterface;", "", "(Lcom/glority/android/cmsui/entity/WebViewItem;)V", "sendMessage", "", "data", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    private final class JSInterface {
        public JSInterface() {
        }

        @JavascriptInterface
        public final void sendMessage(final String data) {
            if (data != null) {
                WebViewItem.this.getWebView().post(new Runnable() { // from class: com.glority.android.cmsui.entity.WebViewItem$JSInterface$sendMessage$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        JsData jsData;
                        String eventName;
                        try {
                            jsData = new JsData().update(new JSONObject(data));
                        } catch (Exception e) {
                            if (AppContext.INSTANCE.isDebugMode()) {
                                LogUtils.e(Log.getStackTraceString(e));
                            }
                            jsData = null;
                        }
                        if (jsData != null) {
                            if (jsData.isLogEvent()) {
                                JsBaseParam parameter = jsData.getParameter();
                                if (!(parameter instanceof JsLogEventParam)) {
                                    parameter = null;
                                }
                                JsLogEventParam jsLogEventParam = (JsLogEventParam) parameter;
                                if (jsLogEventParam == null || (eventName = jsLogEventParam.getEventName()) == null) {
                                    return;
                                }
                                Bundle parameters = jsLogEventParam.getParameters();
                                Pair[] pairArr = new Pair[1];
                                String pageName = WebViewItem.this.getPageName();
                                if (pageName == null) {
                                    pageName = "";
                                }
                                pairArr[0] = TuplesKt.to("from", pageName);
                                new LogEventRequest(eventName, LogEventArgumentsKt.logEventBundleAdd(parameters, pairArr)).post();
                                if (Intrinsics.areEqual(eventName, "cms_h5_learn_more")) {
                                    new LogEventRequest(WebViewItem.this.getPageName() + "_learnmoreitemcontent_click", null, 2, null).post();
                                    return;
                                }
                                return;
                            }
                            if (jsData.isImage() || jsData.isImages()) {
                                BaseItem.logEvent$default(WebViewItem.this, CmsUILogEvents.CMS_IMAGE_CLICK, null, 2, null);
                            } else if (jsData.isPage()) {
                                WebViewItem webViewItem = WebViewItem.this;
                                Pair[] pairArr2 = new Pair[1];
                                JsBaseParam parameter2 = jsData.getParameter();
                                if (!(parameter2 instanceof JsPageParam)) {
                                    parameter2 = null;
                                }
                                JsPageParam jsPageParam = (JsPageParam) parameter2;
                                pairArr2[0] = TuplesKt.to("type", jsPageParam != null ? jsPageParam.getType() : null);
                                webViewItem.logEvent(CmsUILogEvents.CMS_SUB_PAGE, LogEventArgumentsKt.logEventBundleOf(pairArr2));
                            } else if (jsData.isPoem()) {
                                WebViewItem.this.logEvent(CmsUILogEvents.CMS_POEM_DOWNLOAD, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", "is_jap_" + new IsJapaneseRequest(WebViewItem.this.getContext()).toResult().booleanValue())));
                            } else if (jsData.isLearnMore()) {
                                WebViewItem webViewItem2 = WebViewItem.this;
                                Pair[] pairArr3 = new Pair[1];
                                JsBaseParam parameter3 = jsData.getParameter();
                                if (!(parameter3 instanceof JsFeedbackParam)) {
                                    parameter3 = null;
                                }
                                JsFeedbackParam jsFeedbackParam = (JsFeedbackParam) parameter3;
                                pairArr3[0] = TuplesKt.to("name", jsFeedbackParam != null ? jsFeedbackParam.getLayoutName() : null);
                                webViewItem2.logEvent(CmsUILogEvents.CMS_LEARN_MORE, LogEventArgumentsKt.logEventBundleOf(pairArr3));
                            } else if (jsData.isFeedback()) {
                                WebViewItem webViewItem3 = WebViewItem.this;
                                Pair[] pairArr4 = new Pair[1];
                                JsBaseParam parameter4 = jsData.getParameter();
                                if (!(parameter4 instanceof JsFeedbackParam)) {
                                    parameter4 = null;
                                }
                                JsFeedbackParam jsFeedbackParam2 = (JsFeedbackParam) parameter4;
                                pairArr4[0] = TuplesKt.to("name", jsFeedbackParam2 != null ? jsFeedbackParam2.getLayoutName() : null);
                                webViewItem3.logEvent(CmsUILogEvents.CMS_FEED_BACK, LogEventArgumentsKt.logEventBundleOf(pairArr4));
                            } else if (jsData.isFeeds()) {
                                WebViewItem webViewItem4 = WebViewItem.this;
                                Pair[] pairArr5 = new Pair[1];
                                JsBaseParam parameter5 = jsData.getParameter();
                                if (!(parameter5 instanceof JsFeedsParam)) {
                                    parameter5 = null;
                                }
                                JsFeedsParam jsFeedsParam = (JsFeedsParam) parameter5;
                                pairArr5[0] = TuplesKt.to("id", jsFeedsParam != null ? jsFeedsParam.getFeedsId() : null);
                                webViewItem4.logEvent(CmsUILogEvents.CMS_FEEDS, LogEventArgumentsKt.logEventBundleOf(pairArr5));
                            }
                            ClickListener<JsData> itemClick = WebViewItem.this.getItemClick();
                            if (itemClick != null) {
                                itemClick.onClick(WebViewItem.this.getWebView(), jsData);
                            }
                        }
                    }
                });
            }
        }
    }
}
