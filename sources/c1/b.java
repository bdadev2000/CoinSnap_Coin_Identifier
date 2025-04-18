package c1;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f2521b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f2523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2523d = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f2523d, continuation);
        bVar.f2522c = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((g) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f2521b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            g gVar = (g) this.f2522c;
            this.f2521b = 1;
            obj = this.f2523d.invoke(gVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        g gVar2 = (g) obj;
        Intrinsics.checkNotNull(gVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) ((a) gVar2).f2520b.f26021c).set(true);
        return gVar2;
    }
}
