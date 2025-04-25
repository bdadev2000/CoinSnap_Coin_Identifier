package com.glority.base.widget.webview;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodInvoke;
import com.glority.base.widget.webview.entity.MethodResponse;
import com.glority.network.util.HttpState;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbsJsMethod.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH&J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001e\u0010\u0014\u001a\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u000e\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/glority/base/widget/webview/AbsJsMethod;", "", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", Args.pageName, "", "<init>", "(Lcom/glority/android/ui/base/RuntimePermissionActivity;Ljava/lang/String;)V", "getActivity", "()Lcom/glority/android/ui/base/RuntimePermissionActivity;", "getPageName", "()Ljava/lang/String;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "availableApi", "", "invoke", "", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "callbackSuccess", "data", "", "callbackFailed", LogEventArguments.ARG_MESSAGE, "methodName", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public abstract class AbsJsMethod {
    public static final int $stable = 8;
    private final RuntimePermissionActivity activity;
    private JsbWebView.MethodCallback methodCallback;
    private final String pageName;

    public abstract Set<String> availableApi();

    public AbsJsMethod(RuntimePermissionActivity activity, String pageName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.activity = activity;
        this.pageName = pageName;
    }

    public final RuntimePermissionActivity getActivity() {
        return this.activity;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public void invoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        this.methodCallback = methodCallback;
        if (Intrinsics.areEqual(methodInvoke.getMethod(), "apiAvailable")) {
            availableApi(methodInvoke.getStringParams("methodName"));
        }
    }

    public final void callbackSuccess(Map<String, ? extends Object> data) {
        JsbWebView.MethodCallback methodCallback = this.methodCallback;
        if (methodCallback != null) {
            methodCallback.callback(new MethodResponse("success", data, null, null, 12, null));
        }
    }

    public final void callbackFailed(String message) {
        JsbWebView.MethodCallback methodCallback = this.methodCallback;
        if (methodCallback != null) {
            methodCallback.callback(new MethodResponse(HttpState.FAIL, null, null, message, 4, null));
        }
    }

    public void availableApi(String methodName) {
        Set<String> availableApi = availableApi();
        availableApi.add("apiAvailable");
        callbackSuccess(MapsKt.mapOf(TuplesKt.to(LogEvents.available, Boolean.valueOf(CollectionsKt.contains(availableApi, methodName)))));
    }
}
