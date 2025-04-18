package v1;

import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f25885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f25886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Callable callable, CancellableContinuation cancellableContinuation, Continuation continuation) {
        super(2, continuation);
        this.f25885b = callable;
        this.f25886c = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f25885b, this.f25886c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CancellableContinuation cancellableContinuation = this.f25886c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            cancellableContinuation.resumeWith(Result.m145constructorimpl(this.f25885b.call()));
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(th2)));
        }
        return Unit.INSTANCE;
    }
}
