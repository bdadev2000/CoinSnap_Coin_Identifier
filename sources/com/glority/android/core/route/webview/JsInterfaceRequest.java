package com.glority.android.core.route.webview;

import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsInterfaceRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/webview/JsInterfaceRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "url", "parameter", "webView", "Landroid/webkit/WebView;", "(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/WebView;)V", "getParameter", "()Ljava/lang/String;", "getWebView", "()Landroid/webkit/WebView;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class JsInterfaceRequest extends RouteRequest<String> {
    private final String parameter;
    private final WebView webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsInterfaceRequest(String url, String str, WebView webView) {
        super(url, null, null, 6, null);
        Intrinsics.checkNotNullParameter(url, "url");
        this.parameter = str;
        this.webView = webView;
    }

    public /* synthetic */ JsInterfaceRequest(String str, String str2, WebView webView, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : webView);
    }

    public final String getParameter() {
        return this.parameter;
    }

    public final WebView getWebView() {
        return this.webView;
    }
}
