package gg;

import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.viewmodel.MyPlantViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qc.c0;

/* loaded from: classes4.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f18478b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f18480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(2, continuation);
        this.f18480d = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f18480d, continuation);
        hVar.f18479c = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f18478b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f18479c;
            i iVar = this.f18480d;
            Flow flow = ((MyPlantViewModel) iVar.f18483j.getValue()).f16663e;
            c0 c0Var = new c0(1, coroutineScope, iVar);
            this.f18478b = 1;
            if (flow.collect(c0Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
