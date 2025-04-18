package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public final class q extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f1812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Continuation continuation) {
        super(2, continuation);
        this.f1812c = lifecycleCoroutineScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(this.f1812c, continuation);
        qVar.f1811b = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f1811b;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f1812c;
        if (((x) lifecycleCoroutineScopeImpl.f1773b).f1835d.compareTo(o.INITIALIZED) < 0) {
            JobKt__JobKt.cancel$default(coroutineScope.getF1774c(), (CancellationException) null, 1, (Object) null);
        } else {
            lifecycleCoroutineScopeImpl.f1773b.a(lifecycleCoroutineScopeImpl);
        }
        return Unit.INSTANCE;
    }
}
