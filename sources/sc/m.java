package sc;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes3.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public p f24975b;

    /* renamed from: c, reason: collision with root package name */
    public int f24976c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f24977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Continuation continuation) {
        super(2, continuation);
        this.f24977d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f24977d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p pVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f24976c;
        if (i10 != 0) {
            if (i10 == 1) {
                pVar = this.f24975b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            p pVar2 = this.f24977d;
            Flow data = pVar2.a.getData();
            this.f24975b = pVar2;
            this.f24976c = 1;
            Object first = FlowKt.first(data, this);
            if (first == coroutine_suspended) {
                return coroutine_suspended;
            }
            pVar = pVar2;
            obj = first;
        }
        p.a(pVar, new c1.a(MapsKt.toMutableMap(((c1.g) obj).a()), true));
        return Unit.INSTANCE;
    }
}
