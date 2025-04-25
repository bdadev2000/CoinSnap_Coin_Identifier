package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CarouselSwipeable.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0011\u0018\u0000 r*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001rBB\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\u0010\rJ$\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00062\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0002\u0010_J&\u0010`\u001a\u00020\\2\u0006\u0010M\u001a\u00028\u00002\u000e\b\u0002\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@¢\u0006\u0002\u0010bJ!\u0010c\u001a\u00020\\2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0002\beJ\u000e\u0010f\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\u0006J\u0016\u0010h\u001a\u00020\\2\u0006\u0010i\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010jJ8\u0010k\u001a\u00020\\2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0011H\u0080@¢\u0006\u0004\bm\u0010nJ\u0016\u0010o\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010jJ\u0016\u0010p\u001a\u00020\\2\u0006\u0010M\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010qR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000RC\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR+\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R+\u0010,\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0018\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u001102X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010'\"\u0004\b9\u00106R\u0011\u0010:\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010?\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b@\u0010=R\u000e\u0010A\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER/\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\u0010\u001a\u0004\u0018\u00010F8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u0018\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bN\u0010!RO\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060O2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060O8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0018\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR+\u0010V\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\bW\u0010'\"\u0004\bX\u00106¨\u0006s"}, d2 = {"Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "absoluteOffset", "Landroidx/compose/runtime/MutableFloatState;", "<set-?>", "", "anchors", "getAnchors$constraintlayout_compose_release", "()Ljava/util/Map;", "setAnchors$constraintlayout_compose_release", "(Ljava/util/Map;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec$constraintlayout_compose_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationTarget", "Landroidx/compose/runtime/MutableState;", "getConfirmStateChange$constraintlayout_compose_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "direction", "getDirection", "()F", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$constraintlayout_compose_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "isAnimationRunning$delegate", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/Flow;", "maxBound", "getMaxBound$constraintlayout_compose_release", "setMaxBound$constraintlayout_compose_release", "(F)V", "minBound", "getMinBound$constraintlayout_compose_release", "setMinBound$constraintlayout_compose_release", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/FloatState;", "getOffset", "()Landroidx/compose/runtime/FloatState;", "offsetState", "overflow", "getOverflow", "overflowState", "progress", "Landroidx/constraintlayout/compose/carousel/SwipeProgress;", "getProgress", "()Landroidx/constraintlayout/compose/carousel/SwipeProgress;", "Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "resistance", "getResistance$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "setResistance$constraintlayout_compose_release", "(Landroidx/constraintlayout/compose/carousel/ResistanceConfig;)V", "resistance$delegate", "targetValue", "getTargetValue", "Lkotlin/Function2;", "thresholds", "getThresholds$constraintlayout_compose_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$constraintlayout_compose_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds$delegate", "velocityThreshold", "getVelocityThreshold$constraintlayout_compose_release", "setVelocityThreshold$constraintlayout_compose_release", "velocityThreshold$delegate", "Landroidx/compose/runtime/MutableFloatState;", "animateInternalToOffset", "", "target", "spec", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "anim", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureInit", "newAnchors", "ensureInit$constraintlayout_compose_release", "performDrag", "delta", "performFling", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "oldAnchors", "processNewAnchors$constraintlayout_compose_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapInternalToOffset", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public class CarouselSwipeableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MutableFloatState absoluteOffset;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final MutableState anchors;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState<Float> animationTarget;
    private final Function1<T, Boolean> confirmStateChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final MutableState currentValue;
    private final DraggableState draggableState;

    /* renamed from: isAnimationRunning$delegate, reason: from kotlin metadata */
    private final MutableState isAnimationRunning;
    private final Flow<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableFloatState offsetState;
    private final MutableFloatState overflowState;

    /* renamed from: resistance$delegate, reason: from kotlin metadata */
    private final MutableState resistance;

    /* renamed from: thresholds$delegate, reason: from kotlin metadata */
    private final MutableState thresholds;

    /* renamed from: velocityThreshold$delegate, reason: from kotlin metadata */
    private final MutableFloatState velocityThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselSwipeableState(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<Float> mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        this.animationSpec = animationSpec;
        this.confirmStateChange = function1;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.currentValue = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isAnimationRunning = mutableStateOf$default2;
        this.offsetState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.overflowState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.absoluteOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        this.anchors = mutableStateOf$default4;
        final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Map<Float, ? extends T>>(this) { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$latestNonEmptyAnchorsFlow$1
            final /* synthetic */ CarouselSwipeableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Float, T> invoke() {
                return this.this$0.getAnchors$constraintlayout_compose_release();
            }
        });
        this.latestNonEmptyAnchorsFlow = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes8.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2", f = "CarouselSwipeable.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes8.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r6
                        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.label
                        int r6 = r6 - r2
                        r0.label = r6
                        goto L19
                    L14:
                        androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L4d
                    L2a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L4d
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4d
                        return r1
                    L4d:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Function2<Float, Float, Float>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$thresholds$2
            public final Float invoke(float f, float f2) {
                return Float.valueOf(0.0f);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Float f, Float f2) {
                return invoke(f.floatValue(), f2.floatValue());
            }
        }, null, 2, null);
        this.thresholds = mutableStateOf$default5;
        this.velocityThreshold = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.resistance = mutableStateOf$default6;
        this.draggableState = DraggableKt.DraggableState(new Function1<Float, Unit>(this) { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$draggableState$1
            final /* synthetic */ CarouselSwipeableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                MutableFloatState mutableFloatState;
                MutableFloatState mutableFloatState2;
                MutableFloatState mutableFloatState3;
                MutableFloatState mutableFloatState4;
                mutableFloatState = ((CarouselSwipeableState) this.this$0).absoluteOffset;
                float floatValue = mutableFloatState.getFloatValue() + f;
                float coerceIn = RangesKt.coerceIn(floatValue, this.this$0.getMinBound(), this.this$0.getMaxBound());
                float f2 = floatValue - coerceIn;
                ResistanceConfig resistance$constraintlayout_compose_release = this.this$0.getResistance$constraintlayout_compose_release();
                float computeResistance = resistance$constraintlayout_compose_release != null ? resistance$constraintlayout_compose_release.computeResistance(f2) : 0.0f;
                mutableFloatState2 = ((CarouselSwipeableState) this.this$0).offsetState;
                mutableFloatState2.setFloatValue(coerceIn + computeResistance);
                mutableFloatState3 = ((CarouselSwipeableState) this.this$0).overflowState;
                mutableFloatState3.setFloatValue(f2);
                mutableFloatState4 = ((CarouselSwipeableState) this.this$0).absoluteOffset;
                mutableFloatState4.setFloatValue(floatValue);
            }
        });
    }

    public /* synthetic */ CarouselSwipeableState(Object obj, SpringSpec<Float> springSpec, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? new Function1<T, Boolean>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(T t) {
                return true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return invoke((AnonymousClass1) obj2);
            }
        } : anonymousClass1);
    }

    public final AnimationSpec<Float> getAnimationSpec$constraintlayout_compose_release() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmStateChange$constraintlayout_compose_release() {
        return this.confirmStateChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z));
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final FloatState getOffset() {
        return this.offsetState;
    }

    public final FloatState getOverflow() {
        return this.overflowState;
    }

    public final Map<Float, T> getAnchors$constraintlayout_compose_release() {
        return (Map) this.anchors.getValue();
    }

    public final void setAnchors$constraintlayout_compose_release(Map<Float, ? extends T> map) {
        this.anchors.setValue(map);
    }

    /* renamed from: getMinBound$constraintlayout_compose_release, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    public final void setMinBound$constraintlayout_compose_release(float f) {
        this.minBound = f;
    }

    /* renamed from: getMaxBound$constraintlayout_compose_release, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    public final void setMaxBound$constraintlayout_compose_release(float f) {
        this.maxBound = f;
    }

    public final void ensureInit$constraintlayout_compose_release(Map<Float, ? extends T> newAnchors) {
        Float offset;
        if (getAnchors$constraintlayout_compose_release().isEmpty()) {
            offset = CarouselSwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.offsetState.setFloatValue(offset.floatValue());
            this.absoluteOffset.setFloatValue(offset.floatValue());
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.lang.Object processNewAnchors$constraintlayout_compose_release(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableState.processNewAnchors$constraintlayout_compose_release(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Function2<Float, Float, Float> getThresholds$constraintlayout_compose_release() {
        return (Function2) this.thresholds.getValue();
    }

    public final void setThresholds$constraintlayout_compose_release(Function2<? super Float, ? super Float, Float> function2) {
        this.thresholds.setValue(function2);
    }

    public final float getVelocityThreshold$constraintlayout_compose_release() {
        return this.velocityThreshold.getFloatValue();
    }

    public final void setVelocityThreshold$constraintlayout_compose_release(float f) {
        this.velocityThreshold.setFloatValue(f);
    }

    public final ResistanceConfig getResistance$constraintlayout_compose_release() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final void setResistance$constraintlayout_compose_release(ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    /* renamed from: getDraggableState$constraintlayout_compose_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new CarouselSwipeableState$snapInternalToOffset$2(f, this, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.drag$default(this.draggableState, null, new CarouselSwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    public final T getTargetValue() {
        Float offset;
        float computeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            computeTarget = value.floatValue();
        } else {
            float floatValue = getOffset().getFloatValue();
            offset = CarouselSwipeableKt.getOffset(getAnchors$constraintlayout_compose_release(), getCurrentValue());
            computeTarget = CarouselSwipeableKt.computeTarget(floatValue, offset != null ? offset.floatValue() : getOffset().getFloatValue(), getAnchors$constraintlayout_compose_release().keySet(), getThresholds$constraintlayout_compose_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$constraintlayout_compose_release().get(Float.valueOf(computeTarget));
        return t == null ? getCurrentValue() : t;
    }

    public final SwipeProgress<T> getProgress() {
        List findBounds;
        Object currentValue;
        Object obj;
        float f;
        Pair pair;
        findBounds = CarouselSwipeableKt.findBounds(getOffset().getFloatValue(), getAnchors$constraintlayout_compose_release().keySet());
        int size = findBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
            f = 1.0f;
        } else if (size == 1) {
            Object value = MapsKt.getValue(getAnchors$constraintlayout_compose_release(), findBounds.get(0));
            currentValue = MapsKt.getValue(getAnchors$constraintlayout_compose_release(), findBounds.get(0));
            f = 1.0f;
            obj = value;
        } else {
            if (getDirection() > 0.0f) {
                pair = TuplesKt.to(findBounds.get(0), findBounds.get(1));
            } else {
                pair = TuplesKt.to(findBounds.get(1), findBounds.get(0));
            }
            float floatValue = ((Number) pair.component1()).floatValue();
            float floatValue2 = ((Number) pair.component2()).floatValue();
            obj = MapsKt.getValue(getAnchors$constraintlayout_compose_release(), Float.valueOf(floatValue));
            currentValue = MapsKt.getValue(getAnchors$constraintlayout_compose_release(), Float.valueOf(floatValue2));
            f = (getOffset().getFloatValue() - floatValue) / (floatValue2 - floatValue);
        }
        return new SwipeProgress<>(obj, currentValue, f);
    }

    public final float getDirection() {
        Float offset;
        offset = CarouselSwipeableKt.getOffset(getAnchors$constraintlayout_compose_release(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getFloatValue() - offset.floatValue());
    }

    public final Object snapTo(T t, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new CarouselSwipeableState$snapTo$2(t, this), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(CarouselSwipeableState carouselSwipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i & 2) != 0) {
            animationSpec = carouselSwipeableState.animationSpec;
        }
        return carouselSwipeableState.animateTo(obj, animationSpec, continuation);
    }

    public final Object animateTo(T t, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new CarouselSwipeableState$animateTo$2(t, this, animationSpec), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final Object performFling(final float f, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new FlowCollector(this) { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$performFling$2
            final /* synthetic */ CarouselSwipeableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Map) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                offset = CarouselSwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                Intrinsics.checkNotNull(offset);
                float floatValue = offset.floatValue();
                computeTarget = CarouselSwipeableKt.computeTarget(this.this$0.getOffset().getFloatValue(), floatValue, map.keySet(), this.this$0.getThresholds$constraintlayout_compose_release(), f, this.this$0.getVelocityThreshold$constraintlayout_compose_release());
                T t = map.get(Boxing.boxFloat(computeTarget));
                if (t != null && this.this$0.getConfirmStateChange$constraintlayout_compose_release().invoke(t).booleanValue()) {
                    Object animateTo$default = CarouselSwipeableState.animateTo$default(this.this$0, t, null, continuation2, 2, null);
                    return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
                }
                CarouselSwipeableState<T> carouselSwipeableState = this.this$0;
                animateInternalToOffset = carouselSwipeableState.animateInternalToOffset(floatValue, carouselSwipeableState.getAnimationSpec$constraintlayout_compose_release(), continuation2);
                return animateInternalToOffset == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateInternalToOffset : Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final float performDrag(float delta) {
        float coerceIn = RangesKt.coerceIn(this.absoluteOffset.getFloatValue() + delta, this.minBound, this.maxBound) - this.absoluteOffset.getFloatValue();
        if (Math.abs(coerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }

    /* compiled from: CarouselSwipeable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<CarouselSwipeableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> confirmStateChange) {
            return SaverKt.Saver(new Function2<SaverScope, CarouselSwipeableState<T>, T>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final T invoke(SaverScope saverScope, CarouselSwipeableState<T> carouselSwipeableState) {
                    return carouselSwipeableState.getCurrentValue();
                }
            }, new Function1<T, CarouselSwipeableState<T>>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$Companion$Saver$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((CarouselSwipeableState$Companion$Saver$2<T>) obj);
                }

                @Override // kotlin.jvm.functions.Function1
                public final CarouselSwipeableState<T> invoke(T t) {
                    return new CarouselSwipeableState<>(t, animationSpec, confirmStateChange);
                }
            });
        }
    }
}
