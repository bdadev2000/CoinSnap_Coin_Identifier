package y0;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* loaded from: classes.dex */
public final class o0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f27816b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f27818d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f27819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u0 u0Var, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f27818d = u0Var;
        this.f27819f = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        o0 o0Var = new o0(this.f27818d, this.f27819f, continuation);
        o0Var.f27817c = obj;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27816b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f27817c;
            CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            u0 u0Var = this.f27818d;
            x0 x0Var = new x0(this.f27819f, CompletableDeferred$default, u0Var.f27856g.q(), coroutineScope.getCoroutineContext());
            e1 e1Var = u0Var.f27860k;
            Object mo1659trySendJP2dKIU = e1Var.f27721c.mo1659trySendJP2dKIU(x0Var);
            if (mo1659trySendJP2dKIU instanceof ChannelResult.Closed) {
                Throwable m1673exceptionOrNullimpl = ChannelResult.m1673exceptionOrNullimpl(mo1659trySendJP2dKIU);
                if (m1673exceptionOrNullimpl == null) {
                    throw new ClosedSendChannelException("Channel was closed normally");
                }
                throw m1673exceptionOrNullimpl;
            }
            if (ChannelResult.m1679isSuccessimpl(mo1659trySendJP2dKIU)) {
                if (((AtomicInteger) e1Var.f27722d.f17773c).getAndIncrement() == 0) {
                    BuildersKt__Builders_commonKt.launch$default(e1Var.a, null, null, new d1(e1Var, null), 3, null);
                }
                this.f27816b = 1;
                obj = CompletableDeferred$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return obj;
    }
}
