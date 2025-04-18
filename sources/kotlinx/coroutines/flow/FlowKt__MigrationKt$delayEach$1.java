package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class FlowKt__MigrationKt$delayEach$1<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $timeMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$delayEach$1(long j3, Continuation<? super FlowKt__MigrationKt$delayEach$1> continuation) {
        super(2, continuation);
        this.$timeMillis = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowKt__MigrationKt$delayEach$1(this.$timeMillis, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke2((FlowKt__MigrationKt$delayEach$1<T>) obj, continuation);
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
            long j3 = this.$timeMillis;
            this.label = 1;
            if (DelayKt.delay(j3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(T t5, Continuation<? super Unit> continuation) {
        return ((FlowKt__MigrationKt$delayEach$1) create(t5, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
