package ag;

import com.android.billingclient.api.Purchase;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IapActivity f485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, IapActivity iapActivity, Continuation continuation) {
        super(2, continuation);
        this.f484b = list;
        this.f485c = iapActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f484b, this.f485c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Thread.sleep(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        List<Purchase> purchases = this.f484b;
        Intrinsics.checkNotNullExpressionValue(purchases, "$purchases");
        for (Purchase purchase : purchases) {
            IapActivity.t(this.f485c);
        }
        return Unit.INSTANCE;
    }
}
