package y0;

import java.io.Serializable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class j0 extends SuspendLambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public Serializable f27769b;

    /* renamed from: c, reason: collision with root package name */
    public int f27770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f27771d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f27772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f27773g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Ref.ObjectRef objectRef, u0 u0Var, Ref.IntRef intRef, Continuation continuation) {
        super(1, continuation);
        this.f27771d = objectRef;
        this.f27772f = u0Var;
        this.f27773g = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new j0(this.f27771d, this.f27772f, this.f27773g, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((j0) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ref.ObjectRef objectRef;
        T t5;
        Ref.IntRef intRef;
        Object obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27770c;
        Ref.IntRef intRef2 = this.f27773g;
        Ref.ObjectRef objectRef2 = this.f27771d;
        u0 u0Var = this.f27772f;
        try {
        } catch (b unused) {
            Object obj4 = objectRef2.element;
            this.f27769b = intRef2;
            this.f27770c = 3;
            Object h10 = u0Var.h(obj4, true, this);
            obj2 = h10;
            if (h10 == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        intRef2 = (Ref.IntRef) this.f27769b;
                        ResultKt.throwOnFailure(obj);
                        obj2 = obj;
                        intRef2.element = ((Number) obj2).intValue();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef = (Ref.IntRef) this.f27769b;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                intRef.element = ((Number) obj3).intValue();
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) this.f27769b;
            ResultKt.throwOnFailure(obj);
            t5 = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            this.f27769b = objectRef2;
            this.f27770c = 1;
            Object g10 = u0Var.g(this);
            if (g10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t5 = g10;
        }
        objectRef.element = t5;
        i1 e2 = u0Var.e();
        this.f27769b = intRef2;
        this.f27770c = 2;
        Integer a = e2.a();
        if (a == coroutine_suspended) {
            return coroutine_suspended;
        }
        intRef = intRef2;
        obj3 = a;
        intRef.element = ((Number) obj3).intValue();
        return Unit.INSTANCE;
    }
}
