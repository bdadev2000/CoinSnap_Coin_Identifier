package q1;

import android.net.Uri;
import android.view.InputEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f23664c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f23665d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InputEvent f23666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Uri uri, InputEvent inputEvent, Continuation continuation) {
        super(2, continuation);
        this.f23664c = gVar;
        this.f23665d = uri;
        this.f23666f = inputEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f23664c, this.f23665d, this.f23666f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23663b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            com.bumptech.glide.e eVar = this.f23664c.a;
            this.f23663b = 1;
            if (eVar.M(this.f23665d, this.f23666f, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
