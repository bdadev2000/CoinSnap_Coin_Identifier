package r1;

import jb.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f23962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.a f23963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t1.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f23962c = bVar;
        this.f23963d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f23962c, this.f23963d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23961b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            g gVar = this.f23962c.a;
            this.f23961b = 1;
            obj = gVar.j(this.f23963d, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
