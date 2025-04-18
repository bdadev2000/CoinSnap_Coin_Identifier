package ng;

import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import kf.e0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlantIdentifierActivity f22771b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PlantIdentifierActivity plantIdentifierActivity, Continuation continuation) {
        super(2, continuation);
        this.f22771b = plantIdentifierActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f22771b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((e0) this.f22771b.n()).f20743y.destroy();
        return Unit.INSTANCE;
    }
}
