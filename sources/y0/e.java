package y0;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f27711b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f27713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, Continuation continuation) {
        super(2, continuation);
        this.f27713d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f27713d, continuation);
        eVar.f27712c = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((w0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27711b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            w0 w0Var = (w0) this.f27712c;
            i iVar = c6.c.f2630e;
            this.f27711b = 1;
            if (i.a(iVar, this.f27713d, w0Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
