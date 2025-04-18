package q1;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f23668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f23669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f23668c = gVar;
        this.f23669d = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f23668c, this.f23669d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23667b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            com.bumptech.glide.e eVar = this.f23668c.a;
            this.f23667b = 1;
            if (eVar.N(this.f23669d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
