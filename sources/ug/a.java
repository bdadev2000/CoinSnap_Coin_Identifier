package ug;

import com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyFullScreenActivity;
import kf.y;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotifyFullScreenActivity f25807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NotifyFullScreenActivity notifyFullScreenActivity, Continuation continuation) {
        super(2, continuation);
        this.f25807c = notifyFullScreenActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(this.f25807c, continuation);
        aVar.f25806b = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((y) this.f25807c.n()).f20930v.setText((String) this.f25806b);
        return Unit.INSTANCE;
    }
}
