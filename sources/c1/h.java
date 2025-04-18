package c1;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f2526b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f2528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2528d = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f2528d, continuation);
        hVar.f2527c = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f2526b;
        if (i10 != 0) {
            if (i10 == 1) {
                a aVar = (a) this.f2527c;
                ResultKt.throwOnFailure(obj);
                return aVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        a aVar2 = new a(MapsKt.toMutableMap(((g) this.f2527c).a()), false);
        this.f2527c = aVar2;
        this.f2526b = 1;
        if (this.f2528d.invoke(aVar2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return aVar2;
    }
}
