package com.glority.android.picturexx.view.grading;

import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradingDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.grading.GradingDetailFragment$requestGPTStreamingData$1", f = "GradingDetailFragment.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {211, 217, 221, 255, 308}, m = "invokeSuspend", n = {"startTime", "itemId", "userImageUrl", "startTime", "t1", "itemId", "userImageUrl", Args.sessionType, "startTime", "t1", "t2", Args.sessionType, "t4", "timeOfValidContent", "hasCollectedFirstElement", "startTime", "t1", "t2", "t3"}, s = {"J$0", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "J$2", "J$3"})
/* loaded from: classes5.dex */
public final class GradingDetailFragment$requestGPTStreamingData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ GradingDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradingDetailFragment$requestGPTStreamingData$1(GradingDetailFragment gradingDetailFragment, Continuation<? super GradingDetailFragment$requestGPTStreamingData$1> continuation) {
        super(2, continuation);
        this.this$0 = gradingDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GradingDetailFragment$requestGPTStreamingData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GradingDetailFragment$requestGPTStreamingData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.grading.GradingDetailFragment$requestGPTStreamingData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradingDetailFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.grading.GradingDetailFragment$requestGPTStreamingData$1$1", f = "GradingDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.grading.GradingDetailFragment$requestGPTStreamingData$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $t4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.LongRef longRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$t4 = longRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$t4, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$t4.element = System.currentTimeMillis();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradingDetailFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\u0004\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.grading.GradingDetailFragment$requestGPTStreamingData$1$2", f = "GradingDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.grading.GradingDetailFragment$requestGPTStreamingData$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super String>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sessionType;
        final /* synthetic */ long $startTime;
        final /* synthetic */ long $t1;
        final /* synthetic */ long $t2;
        final /* synthetic */ long $t3;
        final /* synthetic */ Ref.LongRef $t4;
        final /* synthetic */ Ref.LongRef $timeOfValidContent;
        int label;
        final /* synthetic */ GradingDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(GradingDetailFragment gradingDetailFragment, long j, long j2, long j3, long j4, Ref.LongRef longRef, String str, Ref.LongRef longRef2, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.this$0 = gradingDetailFragment;
            this.$startTime = j;
            this.$t1 = j2;
            this.$t2 = j3;
            this.$t3 = j4;
            this.$t4 = longRef;
            this.$sessionType = str;
            this.$timeOfValidContent = longRef2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super String> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new AnonymousClass2(this.this$0, this.$startTime, this.$t1, this.$t2, this.$t3, this.$t4, this.$sessionType, this.$timeOfValidContent, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.grading.GradingDetailFragment$requestGPTStreamingData$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
