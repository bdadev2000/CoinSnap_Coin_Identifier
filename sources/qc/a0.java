package qc;

import android.util.Log;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final class a0 extends SuspendLambda implements Function3 {

    /* renamed from: b, reason: collision with root package name */
    public int f23758b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ FlowCollector f23759c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Throwable f23760d;

    public a0(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a0 a0Var = new a0((Continuation) obj3);
        a0Var.f23759c = (FlowCollector) obj;
        a0Var.f23760d = (Throwable) obj2;
        return a0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23758b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = this.f23759c;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f23760d);
            c1.a aVar = new c1.a(true);
            this.f23759c = null;
            this.f23758b = 1;
            if (flowCollector.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
