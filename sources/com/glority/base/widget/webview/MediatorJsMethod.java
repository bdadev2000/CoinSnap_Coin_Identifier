package com.glority.base.widget.webview;

import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodInvoke;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediatorJsMethod.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\"\u00020\u0001¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/glority/base/widget/webview/MediatorJsMethod;", "Lcom/glority/base/widget/webview/AbsJsMethod;", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", Args.pageName, "", "<init>", "(Lcom/glority/android/ui/base/RuntimePermissionActivity;Ljava/lang/String;)V", "jsMethods", "", "mergeJsMethod", "", "jsMethod", "", "([Lcom/glority/base/widget/webview/AbsJsMethod;)V", "availableApi", "", "invoke", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "methodName", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class MediatorJsMethod extends AbsJsMethod {
    public static final int $stable = 8;
    private final List<AbsJsMethod> jsMethods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediatorJsMethod(RuntimePermissionActivity activity, String pageName) {
        super(activity, pageName);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.jsMethods = new ArrayList();
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public Set<String> availableApi() {
        return SetsKt.mutableSetOf("apiAvailable");
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public void invoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        super.invoke(methodInvoke, methodCallback);
        Iterator<T> it = this.jsMethods.iterator();
        while (it.hasNext()) {
            ((AbsJsMethod) it.next()).invoke(methodInvoke, methodCallback);
        }
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public void availableApi(String methodName) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = this.jsMethods.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((AbsJsMethod) it.next()).availableApi());
        }
        callbackSuccess(MapsKt.mapOf(TuplesKt.to(LogEvents.available, Boolean.valueOf(CollectionsKt.contains(linkedHashSet, methodName)))));
    }

    public final void mergeJsMethod(AbsJsMethod... jsMethod) {
        Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        for (AbsJsMethod absJsMethod : jsMethod) {
            this.jsMethods.add(absJsMethod);
        }
    }
}
