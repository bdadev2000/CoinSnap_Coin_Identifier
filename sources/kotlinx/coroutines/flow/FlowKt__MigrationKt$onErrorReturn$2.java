package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "", "e", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class FlowKt__MigrationKt$onErrorReturn$2<T> extends SuspendLambda implements Function3<FlowCollector<? super T>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $fallback;
    final /* synthetic */ Function1<Throwable, Boolean> $predicate;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MigrationKt$onErrorReturn$2(Function1<? super Throwable, Boolean> function1, T t5, Continuation<? super FlowKt__MigrationKt$onErrorReturn$2> continuation) {
        super(3, continuation);
        this.$predicate = function1;
        this.$fallback = t5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th2 = (Throwable) this.L$1;
            if (this.$predicate.invoke(th2).booleanValue()) {
                T t5 = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(t5, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th2, Continuation<? super Unit> continuation) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.$predicate, this.$fallback, continuation);
        flowKt__MigrationKt$onErrorReturn$2.L$0 = flowCollector;
        flowKt__MigrationKt$onErrorReturn$2.L$1 = th2;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(Unit.INSTANCE);
    }
}
