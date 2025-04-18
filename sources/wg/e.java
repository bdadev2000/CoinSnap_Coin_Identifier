package wg;

import android.content.Context;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f26997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SplashViewModel f26998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f26999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SplashViewModel splashViewModel, Context context, Continuation continuation) {
        super(2, continuation);
        this.f26998c = splashViewModel;
        this.f26999d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f26998c, this.f26999d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26997b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f26997b = 1;
            if (SplashViewModel.a(this.f26998c, this.f26999d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
