package y0;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class r extends SuspendLambda implements Function3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Job f27831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Job job, Continuation continuation) {
        super(3, continuation);
        this.f27831b = job;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new r(this.f27831b, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Job.DefaultImpls.cancel$default(this.f27831b, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
