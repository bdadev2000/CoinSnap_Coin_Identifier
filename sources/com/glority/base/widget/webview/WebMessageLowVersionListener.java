package com.glority.base.widget.webview;

import android.webkit.JavascriptInterface;
import com.glority.base.widget.webview.JsbWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: WebMessageLowVersionListener.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/glority/base/widget/webview/WebMessageLowVersionListener;", "", "jsbWebView", "Lcom/glority/base/widget/webview/JsbWebView;", "methodListener", "Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "<init>", "(Lcom/glority/base/widget/webview/JsbWebView;Lcom/glority/base/widget/webview/JsbWebView$MethodListener;)V", "getJsbWebView", "()Lcom/glority/base/widget/webview/JsbWebView;", "getMethodListener", "()Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "postMessage", "", "data", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class WebMessageLowVersionListener {
    public static final int $stable = 8;
    private final JsbWebView jsbWebView;
    private final JsbWebView.MethodListener methodListener;

    public WebMessageLowVersionListener(JsbWebView jsbWebView, JsbWebView.MethodListener methodListener) {
        Intrinsics.checkNotNullParameter(jsbWebView, "jsbWebView");
        this.jsbWebView = jsbWebView;
        this.methodListener = methodListener;
    }

    public final JsbWebView getJsbWebView() {
        return this.jsbWebView;
    }

    public final JsbWebView.MethodListener getMethodListener() {
        return this.methodListener;
    }

    @JavascriptInterface
    public final void postMessage(String data) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new WebMessageLowVersionListener$postMessage$1(this, data, null), 3, null);
    }
}
