package com.glority.android.picturexx.js.method;

import com.glority.android.picturexx.js.BusinessJsWebviewFragment;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodInvoke;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusinessWebviewJsMethod.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/js/method/BusinessWebviewJsMethod;", "Lcom/glority/base/widget/webview/AbsJsMethod;", "businessJsWebviewFragment", "Lcom/glority/android/picturexx/js/BusinessJsWebviewFragment;", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", Args.pageName, "", "<init>", "(Lcom/glority/android/picturexx/js/BusinessJsWebviewFragment;Lcom/glority/android/ui/base/RuntimePermissionActivity;Ljava/lang/String;)V", "getBusinessJsWebviewFragment", "()Lcom/glority/android/picturexx/js/BusinessJsWebviewFragment;", "availableApi", "", "invoke", "", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BusinessWebviewJsMethod extends AbsJsMethod {
    public static final int $stable = 8;
    private final BusinessJsWebviewFragment businessJsWebviewFragment;

    public final BusinessJsWebviewFragment getBusinessJsWebviewFragment() {
        return this.businessJsWebviewFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessWebviewJsMethod(BusinessJsWebviewFragment businessJsWebviewFragment, RuntimePermissionActivity activity, String pageName) {
        super(activity, pageName);
        Intrinsics.checkNotNullParameter(businessJsWebviewFragment, "businessJsWebviewFragment");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.businessJsWebviewFragment = businessJsWebviewFragment;
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public Set<String> availableApi() {
        return SetsKt.mutableSetOf("setPageData");
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public void invoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        super.invoke(methodInvoke, methodCallback);
        if (Intrinsics.areEqual(methodInvoke.getMethod(), "setPageData")) {
            String stringParams = methodInvoke.getStringParams(Args.pageName);
            if (stringParams != null) {
                this.businessJsWebviewFragment.setPageName(stringParams);
            }
            String stringParams2 = methodInvoke.getStringParams("id");
            if (stringParams2 != null) {
                this.businessJsWebviewFragment.getExtraParams().putString("id", stringParams2);
            }
            String stringParams3 = methodInvoke.getStringParams("from");
            if (stringParams3 != null) {
                this.businessJsWebviewFragment.getExtraParams().putString("from", stringParams3);
            }
        }
    }
}
