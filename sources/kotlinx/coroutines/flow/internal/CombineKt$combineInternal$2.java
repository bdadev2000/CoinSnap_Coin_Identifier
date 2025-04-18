package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.internal.protos.n;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, Base64.mimeLineLength, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes3.dex */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<T[]> $arrayFactory;
    final /* synthetic */ Flow<T>[] $flows;
    final /* synthetic */ FlowCollector<R> $this_combineInternal;
    final /* synthetic */ Function3<FlowCollector<? super R>, T[], Continuation<? super Unit>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {n.TEMPLATE_HTML_SIZE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ Channel<IndexedValue<Object>> $resultChannel;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, AppMeasurementSdk.ConditionalUserProperty.VALUE, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C02181<T> implements FlowCollector {
            final /* synthetic */ int $i;
            final /* synthetic */ Channel<IndexedValue<Object>> $resultChannel;

            public C02181(Channel<IndexedValue<Object>> channel, int i10) {
                this.$resultChannel = channel;
                this.$i = i10;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L56
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L4d
                L38:
                    kotlin.ResultKt.throwOnFailure(r8)
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.$resultChannel
                    kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                    int r5 = r6.$i
                    r2.<init>(r5, r7)
                    r0.label = r4
                    java.lang.Object r7 = r8.send(r2, r0)
                    if (r7 != r1) goto L4d
                    return r1
                L4d:
                    r0.label = r3
                    java.lang.Object r7 = kotlinx.coroutines.YieldKt.yield(r0)
                    if (r7 != r1) goto L56
                    return r1
                L56:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C02181.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T>[] flowArr, int i10, AtomicInteger atomicInteger, Channel<IndexedValue<Object>> channel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$flows = flowArr;
            this.$i = i10;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Flow[] flowArr = this.$flows;
                    int i11 = this.$i;
                    Flow flow = flowArr[i11];
                    C02181 c02181 = new C02181(this.$resultChannel, i11);
                    this.label = 1;
                    if (flow.collect(c02181, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                }
                return Unit.INSTANCE;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(Flow<? extends T>[] flowArr, Function0<T[]> function0, Function3<? super FlowCollector<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, FlowCollector<? super R> flowCollector, Continuation<? super CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.$flows = flowArr;
        this.$arrayFactory = function0;
        this.$transform = function3;
        this.$this_combineInternal = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, continuation);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9 A[EDGE_INSN: B:37:0x00e9->B:26:0x00e9 BREAK  A[LOOP:0: B:18:0x00c4->B:36:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010c -> B:10:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CombineKt$combineInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
