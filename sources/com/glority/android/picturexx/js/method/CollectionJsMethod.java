package com.glority.android.picturexx.js.method;

import com.glority.android.picturexx.view.me.CollectDetailFragment;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.entity.MethodInvoke;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CollectionJsMethod.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/js/method/CollectionJsMethod;", "Lcom/glority/base/widget/webview/AbsJsMethod;", "collectionFragment", "Lcom/glority/android/picturexx/view/me/CollectDetailFragment;", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", Args.pageName, "", "<init>", "(Lcom/glority/android/picturexx/view/me/CollectDetailFragment;Lcom/glority/android/ui/base/RuntimePermissionActivity;Ljava/lang/String;)V", "availableApi", "", "invoke", "", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CollectionJsMethod extends AbsJsMethod {
    public static final int $stable = 8;
    private final CollectDetailFragment collectionFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionJsMethod(CollectDetailFragment collectionFragment, RuntimePermissionActivity activity, String pageName) {
        super(activity, pageName);
        Intrinsics.checkNotNullParameter(collectionFragment, "collectionFragment");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.collectionFragment = collectionFragment;
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public Set<String> availableApi() {
        return SetsKt.mutableSetOf("saveCollectionImage", "shareCollectionImage", "editCollection");
    }

    @Override // com.glority.base.widget.webview.AbsJsMethod
    public void invoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        String stringParams;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        super.invoke(methodInvoke, methodCallback);
        String method = methodInvoke.getMethod();
        int hashCode = method.hashCode();
        if (hashCode == -164334520) {
            if (!method.equals("editCollection") || (stringParams = methodInvoke.getStringParams("collectionId")) == null || (intOrNull = StringsKt.toIntOrNull(stringParams)) == null) {
                return;
            }
            this.collectionFragment.editCollection(intOrNull.intValue(), methodCallback);
            return;
        }
        if (hashCode == 49433470) {
            if (method.equals("shareCollectionImage")) {
                this.collectionFragment.share();
            }
        } else if (hashCode == 238594592 && method.equals("saveCollectionImage")) {
            this.collectionFragment.download();
        }
    }
}
