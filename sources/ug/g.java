package ug;

import com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyViewModel;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes4.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotifyViewModel f25815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(NotifyViewModel notifyViewModel, Continuation continuation) {
        super(2, continuation);
        this.f25815c = notifyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f25815c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25814b;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            Date date = new Date();
            NotifyViewModel notifyViewModel = this.f25815c;
            notifyViewModel.f16720f.setValue(notifyViewModel.f16719e.format(date));
            notifyViewModel.f16722h.setValue(notifyViewModel.f16718d.format(date));
            this.f25814b = 1;
        } while (DelayKt.delay(1000L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
