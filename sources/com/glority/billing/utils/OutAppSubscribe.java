package com.glority.billing.utils;

import android.content.Context;
import androidx.work.WorkRequest;
import com.android.billingclient.api.Purchase;
import com.glority.billing.play.BillingSync;
import com.glority.network.util.HttpState;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OutAppSubscribe.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007J\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/glority/billing/utils/OutAppSubscribe;", "", "context", "Landroid/content/Context;", HttpState.TIMEOUT, "", "<init>", "(Landroid/content/Context;J)V", "billingClient", "Lcom/glority/billing/play/BillingSync;", "getBillingClient", "()Lcom/glority/billing/play/BillingSync;", "billingClient$delegate", "Lkotlin/Lazy;", "queryPurchaseDeferred", "Lkotlinx/coroutines/Deferred;", "", "Lcom/android/billingclient/api/Purchase;", "preQueryUnAcknowledgedPurchase", "", "verifyPurchase", "", "purchases", "getUnAcknowledgedPurchaseDeferred", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class OutAppSubscribe {

    /* renamed from: billingClient$delegate, reason: from kotlin metadata */
    private final Lazy billingClient;
    private Deferred<? extends List<? extends Purchase>> queryPurchaseDeferred;
    private final long timeout;

    public OutAppSubscribe(final Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeout = j;
        this.billingClient = LazyKt.lazy(new Function0<BillingSync>() { // from class: com.glority.billing.utils.OutAppSubscribe$billingClient$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BillingSync invoke() {
                return new BillingSync(context);
            }
        });
    }

    public /* synthetic */ OutAppSubscribe(Context context, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? WorkRequest.MIN_BACKOFF_MILLIS : j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingSync getBillingClient() {
        return (BillingSync) this.billingClient.getValue();
    }

    public final void preQueryUnAcknowledgedPurchase() {
        Deferred<? extends List<? extends Purchase>> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new OutAppSubscribe$preQueryUnAcknowledgedPurchase$1(this, null), 3, null);
        this.queryPurchaseDeferred = async$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String verifyPurchase(List<? extends Purchase> purchases) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        BuildersKt__BuildersKt.runBlocking$default(null, new OutAppSubscribe$verifyPurchase$1(purchases, objectRef, this, null), 1, null);
        return (String) objectRef.element;
    }

    public final Deferred<List<Purchase>> getUnAcknowledgedPurchaseDeferred() {
        if (this.queryPurchaseDeferred == null) {
            preQueryUnAcknowledgedPurchase();
        }
        Deferred deferred = this.queryPurchaseDeferred;
        Intrinsics.checkNotNull(deferred);
        return deferred;
    }
}
