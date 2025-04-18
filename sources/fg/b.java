package fg;

import com.android.billingclient.api.Purchase;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
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
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f17861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f17862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.f17861b = list;
        this.f17862c = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f17861b, this.f17862c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Thread.sleep(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        List<Purchase> purchases = this.f17861b;
        Intrinsics.checkNotNullExpressionValue(purchases, "$purchases");
        for (Purchase purchase : purchases) {
            MainActivity.J(this.f17862c);
        }
        return Unit.INSTANCE;
    }
}
