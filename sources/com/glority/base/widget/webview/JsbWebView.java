package com.glority.base.widget.webview;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.ui.base.LocaleManager;
import com.glority.base.R;
import com.glority.base.utils.StatusBarUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.webview.entity.MethodInvoke;
import com.glority.base.widget.webview.entity.MethodResponse;
import com.glority.utils.stability.LogUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: JsbWebView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0016\u001a\u00020\u00172\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001c\u0010\"\u001a\u00020\u00172\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010J\u0016\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0002J\u0006\u0010$\u001a\u00020\u0017J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020!H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/glority/base/widget/webview/JsbWebView;", "Lcom/glority/base/widget/webview/FixedWebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "allowRules", "", "", "methodListener", "Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "webViewClientProxy", "Lcom/glority/base/widget/webview/WebViewClientProxy;", "injectStartupParams", "", "", "getInjectStartupParams$base_release", "()Ljava/util/Map;", "setInjectStartupParams$base_release", "(Ljava/util/Map;)V", "initJsb", "", "parseJsData", "data", "setWebViewClient", "client", "Landroid/webkit/WebViewClient;", "callback", "methodResponse", "Lcom/glority/base/widget/webview/entity/MethodResponse;", "invokeId", "", "setInjectStartupParams", "baseInjectData", "rejectStartupParams", "setOverScrollMode", "mode", "MethodListener", "MethodCallback", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class JsbWebView extends FixedWebView {
    public static final int $stable = 8;
    private Set<String> allowRules;
    private Map<String, ? extends Object> injectStartupParams;
    private MethodListener methodListener;
    private WebViewClientProxy webViewClientProxy;

    /* compiled from: JsbWebView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "", "callback", "", "methodResponse", "Lcom/glority/base/widget/webview/entity/MethodResponse;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface MethodCallback {
        void callback(MethodResponse methodResponse);
    }

    /* compiled from: JsbWebView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "", "jsInvoke", "", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface MethodListener {
        void jsInvoke(MethodInvoke methodInvoke, MethodCallback methodCallback);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsbWebView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ JsbWebView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsbWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.allowRules = new LinkedHashSet();
        this.webViewClientProxy = new WebViewClientProxy(this);
        this.injectStartupParams = baseInjectData();
        if (AppViewModel.INSTANCE.isDebugMode()) {
            FixedWebView.setWebContentsDebuggingEnabled(true);
        }
        getSettings().setJavaScriptEnabled(true);
        setWebViewClient(this.webViewClientProxy);
    }

    public final Map<String, Object> getInjectStartupParams$base_release() {
        return this.injectStartupParams;
    }

    public final void setInjectStartupParams$base_release(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.injectStartupParams = map;
    }

    public final void initJsb(Set<String> allowRules, final MethodListener methodListener) {
        Intrinsics.checkNotNullParameter(allowRules, "allowRules");
        this.methodListener = methodListener;
        this.allowRules = allowRules;
        if (WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            new LogEventRequest("webmessagelistener_supported", null, 2, null).post();
            WebViewCompat.addWebMessageListener(this, "messageHandlers", allowRules, new WebViewCompat.WebMessageListener() { // from class: com.glority.base.widget.webview.JsbWebView$initJsb$1
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public void onPostMessage(WebView view, WebMessageCompat message, Uri sourceOrigin, boolean isMainFrame, JavaScriptReplyProxy replyProxy) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(sourceOrigin, "sourceOrigin");
                    Intrinsics.checkNotNullParameter(replyProxy, "replyProxy");
                    JsbWebView.this.parseJsData(message.getData(), methodListener);
                }
            });
        } else {
            new LogEventRequest("webmessagelistener_unsupported", null, 2, null).post();
            addJavascriptInterface(new WebMessageLowVersionListener(this, methodListener), "messageHandlers");
        }
        if (WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
            WebViewCompat.addDocumentStartJavaScript(this, JsbKt.jsb, allowRules);
        }
    }

    public final void parseJsData(String data, MethodListener methodListener) {
        try {
            final MethodInvoke methodInvoke = (MethodInvoke) new Gson().fromJson(data, MethodInvoke.class);
            if (methodInvoke.getInvokeId() == null) {
                if (methodListener != null) {
                    Intrinsics.checkNotNull(methodInvoke);
                    methodListener.jsInvoke(methodInvoke, null);
                    Unit unit = Unit.INSTANCE;
                }
            } else if (methodListener != null) {
                Intrinsics.checkNotNull(methodInvoke);
                methodListener.jsInvoke(methodInvoke, new MethodCallback() { // from class: com.glority.base.widget.webview.JsbWebView$parseJsData$1$1
                    @Override // com.glority.base.widget.webview.JsbWebView.MethodCallback
                    public void callback(MethodResponse methodResponse) {
                        Intrinsics.checkNotNullParameter(methodResponse, "methodResponse");
                        JsbWebView.this.callback(methodResponse, methodInvoke.getInvokeId().intValue());
                    }
                });
                Unit unit2 = Unit.INSTANCE;
            }
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (Intrinsics.areEqual(client, this.webViewClientProxy)) {
            super.setWebViewClient(client);
        } else {
            this.webViewClientProxy.setWebViewClient$base_release(client);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callback(MethodResponse methodResponse, int invokeId) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new JsbWebView$callback$1(methodResponse, this, invokeId, null), 3, null);
    }

    public final void setInjectStartupParams(Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(baseInjectData());
        mutableMap.putAll(data);
        this.injectStartupParams = mutableMap;
        rejectStartupParams();
    }

    private final Map<String, Object> baseInjectData() {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i = typedValue.data;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return MapsKt.mapOf(TuplesKt.to("os", "android"), TuplesKt.to(RemoteConfigConstants.RequestFieldKey.APP_VERSION, AppContext.INSTANCE.getConfig("VERSION_NAME")), TuplesKt.to(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, Integer.valueOf(AppViewModel.INSTANCE.getInstance().getLanguageCode().getValue())), TuplesKt.to("language", LocaleManager.getInstance().getLanguage()), TuplesKt.to(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, AppViewModel.INSTANCE.getInstance().getCountryCode()), TuplesKt.to("screenWidth", Integer.valueOf(displayMetrics.widthPixels)), TuplesKt.to("screenHeight", Integer.valueOf(displayMetrics.heightPixels)), TuplesKt.to("pixelRatio", Integer.valueOf(displayMetrics.densityDpi)), TuplesKt.to("vip", Boolean.valueOf(AppViewModel.INSTANCE.isVip())), TuplesKt.to("isTrial", Boolean.valueOf(AppViewModel.INSTANCE.isTrial())), TuplesKt.to("statusBarHeight", Integer.valueOf((int) (StatusBarUtil.INSTANCE.getStatusBarHeight() / displayMetrics.density))), TuplesKt.to("themeColor", format));
    }

    public final void rejectStartupParams() {
        try {
            String json = new Gson().toJson(this.injectStartupParams);
            evaluateJavascript("window.startupParams=(" + json + ")", null);
            if (WebViewFeature.isFeatureSupported(WebViewFeature.DOCUMENT_START_SCRIPT)) {
                new LogEventRequest("webstartjs_supported", null, 2, null).post();
                WebViewCompat.addDocumentStartJavaScript(this, "window.startupParams=(" + json + ")", this.allowRules);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int mode) {
        try {
            super.setOverScrollMode(mode);
        } catch (Exception e) {
            LogUtils.e(e.getMessage());
        }
    }
}
