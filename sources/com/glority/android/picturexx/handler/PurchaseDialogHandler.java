package com.glority.android.picturexx.handler;

import androidx.fragment.app.DialogFragment;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.picturexx.payment.routers.PurchaseDialogRequest;
import com.glority.android.picturexx.payment.routers.PurchaseUrlRouter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseDialogHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/handler/PurchaseDialogHandler;", "Lcom/glority/android/core/route/RouteHandler;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class PurchaseDialogHandler implements RouteHandler<DialogFragment> {
    public static final int $stable = 0;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<DialogFragment> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return PurchaseUrlRouter.INSTANCE.getURL_PURCHASE_DIALOG();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public DialogFragment execute(RouteRequest<DialogFragment> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof PurchaseDialogRequest) {
            return null;
        }
        return (DialogFragment) RouteHandler.DefaultImpls.execute(this, request);
    }
}
