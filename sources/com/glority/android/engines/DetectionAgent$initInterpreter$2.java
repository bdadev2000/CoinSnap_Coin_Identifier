package com.glority.android.engines;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;

/* compiled from: DetectionAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.engines.DetectionAgent$initInterpreter$2", f = "DetectionAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class DetectionAgent$initInterpreter$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final /* synthetic */ Context $applicationContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DetectionAgent this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectionAgent$initInterpreter$2(DetectionAgent detectionAgent, Context context, Continuation<? super DetectionAgent$initInterpreter$2> continuation) {
        super(2, continuation);
        this.this$0 = detectionAgent;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetectionAgent$initInterpreter$2 detectionAgent$initInterpreter$2 = new DetectionAgent$initInterpreter$2(this.this$0, this.$applicationContext, continuation);
        detectionAgent$initInterpreter$2.L$0 = obj;
        return detectionAgent$initInterpreter$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((DetectionAgent$initInterpreter$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DetectionAgent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.engines.DetectionAgent$initInterpreter$2$1", f = "DetectionAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.engines.DetectionAgent$initInterpreter$2$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $applicationContext;
        int label;
        final /* synthetic */ DetectionAgent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DetectionAgent detectionAgent, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detectionAgent;
            this.$applicationContext = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$applicationContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DetectionAgent detectionAgent = this.this$0;
            Context applicationContext = this.$applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "$applicationContext");
            detectionAgent.initSync(applicationContext);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ExecutorCoroutineDispatcher executorCoroutineDispatcher;
        Job launch$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            executorCoroutineDispatcher = this.this$0.workingThread;
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, executorCoroutineDispatcher, null, new AnonymousClass1(this.this$0, this.$applicationContext, null), 2, null);
            return launch$default;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
