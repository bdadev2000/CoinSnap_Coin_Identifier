package n0;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* loaded from: classes.dex */
public final class n1 extends RestrictedSuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f22328b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f22330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(View view, Continuation continuation) {
        super(2, continuation);
        this.f22330d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n1 n1Var = new n1(this.f22330d, continuation);
        n1Var.f22329c = obj;
        return n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f22328b;
        View view = this.f22330d;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sequenceScope = (SequenceScope) this.f22329c;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.f22329c;
            this.f22329c = sequenceScope;
            this.f22328b = 1;
            if (sequenceScope.yield(view, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (view instanceof ViewGroup) {
            k1 k1Var = new k1((ViewGroup) view, i11);
            this.f22329c = null;
            this.f22328b = 2;
            if (sequenceScope.yieldAll(k1Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
