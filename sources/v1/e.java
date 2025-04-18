package v1;

import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25864b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25866d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f25867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f25868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String[] f25869h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Callable f25870i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, f0 f0Var, FlowCollector flowCollector, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f25866d = z10;
        this.f25867f = f0Var;
        this.f25868g = flowCollector;
        this.f25869h = strArr;
        this.f25870i = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f25866d, this.f25867f, this.f25868g, this.f25869h, this.f25870i, continuation);
        eVar.f25865c = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineDispatcher w10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25864b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f25865c;
            Channel Channel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            d dVar = new d(this.f25869h, Channel$default, 0);
            Channel$default.mo1659trySendJP2dKIU(Unit.INSTANCE);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.w(coroutineScope.getCoroutineContext().get(p0.f25930b));
            boolean z10 = this.f25866d;
            f0 f0Var = this.f25867f;
            if (z10) {
                w10 = com.facebook.internal.i.x(f0Var);
            } else {
                w10 = com.facebook.internal.i.w(f0Var);
            }
            Channel Channel$default2 = ChannelKt.Channel$default(0, null, null, 7, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, w10, null, new c(this.f25867f, dVar, Channel$default, this.f25870i, Channel$default2, null), 2, null);
            this.f25864b = 1;
            if (FlowKt.emitAll(this.f25868g, Channel$default2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
