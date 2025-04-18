package v1;

import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25875b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25877d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f25878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String[] f25879g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Callable f25880h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, f0 f0Var, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f25877d = z10;
        this.f25878f = f0Var;
        this.f25879g = strArr;
        this.f25880h = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f25877d, this.f25878f, this.f25879g, this.f25880h, continuation);
        fVar.f25876c = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25875b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            e eVar = new e(this.f25877d, this.f25878f, (FlowCollector) this.f25876c, this.f25879g, this.f25880h, null);
            this.f25875b = 1;
            if (CoroutineScopeKt.coroutineScope(eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
