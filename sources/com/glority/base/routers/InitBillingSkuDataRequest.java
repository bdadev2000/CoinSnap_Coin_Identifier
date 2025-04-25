package com.glority.base.routers;

import androidx.fragment.app.FragmentActivity;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitBillingSkuDataRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/base/routers/InitBillingSkuDataRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class InitBillingSkuDataRequest extends RouteRequest<Boolean> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitBillingSkuDataRequest(FragmentActivity activity) {
        super(UrlRouter.INSTANCE.getINIT_BILLING_SKUS_DATA(), activity, null, 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
