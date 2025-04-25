package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatableSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.StartOffsetType;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

/* compiled from: Utils.android.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a5\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000b\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u0002H\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013R\u0006\u0012\u0002\b\u00030\u00140\u0001*\u0006\u0012\u0002\b\u00030\u0014H\u0000\u001aH\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u00192\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\f0\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0000\u001a>\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018*\u0012\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u001eR\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0000\u001aB\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018\"\u0004\b\u0002\u0010!*\u0018\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00170\u0013R\b\u0012\u0004\u0012\u0002H!0\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u0006H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\"²\u0006\u001a\u0010#\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002²\u0006&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0%\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002²\u0006&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\f0%\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u0017*\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"IGNORE_TRANSITIONS", "", "", "getIGNORE_TRANSITIONS", "()Ljava/util/List;", "millisToNanos", "", "timeMs", "nanosToMillis", "timeNs", "parseParametersToValue", "Landroidx/compose/ui/tooling/animation/states/TargetState;", ExifInterface.GPS_DIRECTION_TRUE, "currentValue", "par1", "", "par2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "allAnimations", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "createTransitionInfo", "Landroidx/compose/animation/tooling/TransitionInfo;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", Constants.ScionAnalytics.PARAM_LABEL, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "stepMs", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", "endTimeMs", ExifInterface.LATITUDE_SOUTH, "ui-tooling_release", "startTimeMs", "values", ""}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class Utils_androidKt {
    private static final List<String> IGNORE_TRANSITIONS = CollectionsKt.listOf("TransformOriginInterruptionHandling");

    public static final long millisToNanos(long j) {
        return j * 1000000;
    }

    public static final List<String> getIGNORE_TRANSITIONS() {
        return IGNORE_TRANSITIONS;
    }

    public static final long nanosToMillis(long j) {
        return (j + 999999) / DurationKt.NANOS_IN_MILLIS;
    }

    public static final List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations(Transition<?> transition) {
        List<Transition<?>> transitions = transition.getTransitions();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = transitions.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, allAnimations((Transition) it.next()));
        }
        return CollectionsKt.plus((Collection) transition.getAnimations(), (Iterable) arrayList);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Transition.TransitionAnimationState transitionAnimationState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(transitionAnimationState, j);
    }

    public static final <T, V extends AnimationVector, S> TransitionInfo createTransitionInfo(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, long j) {
        return createTransitionInfo(transitionAnimationState.getAnimation(), transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec(), j);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(Animation animation, String str, AnimationSpec animationSpec, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 1;
        }
        return createTransitionInfo(animation, str, animationSpec, j);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(final Animation<T, V> animation, String str, final AnimationSpec<T> animationSpec, final long j) {
        final long nanosToMillis = nanosToMillis(animation.getDurationNanos());
        final Lazy lazy = LazyKt.lazy(new Function0<Long>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$startTimeMs$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                Number valueOf;
                Object obj = animationSpec;
                if (obj instanceof TweenSpec) {
                    valueOf = Integer.valueOf(((TweenSpec) obj).getDelay());
                } else if (obj instanceof SnapSpec) {
                    valueOf = Integer.valueOf(((SnapSpec) obj).getDelay());
                } else if (obj instanceof KeyframesSpec) {
                    valueOf = Integer.valueOf(((KeyframesSpec) obj).getConfig().getDelayMillis());
                } else if (obj instanceof RepeatableSpec) {
                    if (StartOffsetType.m489equalsimpl0(StartOffset.m482getOffsetTypeEo1U57Q(((RepeatableSpec) obj).getInitialStartOffset()), StartOffsetType.INSTANCE.m493getDelayEo1U57Q())) {
                        valueOf = Integer.valueOf(StartOffset.m481getOffsetMillisimpl(((RepeatableSpec) animationSpec).getInitialStartOffset()));
                    } else {
                        valueOf = 0L;
                    }
                } else if (obj instanceof InfiniteRepeatableSpec) {
                    if (StartOffsetType.m489equalsimpl0(StartOffset.m482getOffsetTypeEo1U57Q(((InfiniteRepeatableSpec) obj).getInitialStartOffset()), StartOffsetType.INSTANCE.m493getDelayEo1U57Q())) {
                        valueOf = Integer.valueOf(StartOffset.m481getOffsetMillisimpl(((InfiniteRepeatableSpec) animationSpec).getInitialStartOffset()));
                    } else {
                        valueOf = 0L;
                    }
                } else {
                    valueOf = obj instanceof VectorizedDurationBasedAnimationSpec ? Integer.valueOf(((VectorizedDurationBasedAnimationSpec) obj).getDelayMillis()) : 0L;
                }
                return Long.valueOf(valueOf.longValue());
            }
        });
        return new TransitionInfo(str, animationSpec.getClass().getName(), createTransitionInfo$lambda$1(lazy), nanosToMillis, createTransitionInfo$lambda$2(LazyKt.lazy(new Function0<Map<Long, T>>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$values$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Long, T> invoke() {
                long createTransitionInfo$lambda$1;
                long createTransitionInfo$lambda$12;
                long createTransitionInfo$lambda$13;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                createTransitionInfo$lambda$1 = Utils_androidKt.createTransitionInfo$lambda$1(lazy);
                Long valueOf = Long.valueOf(createTransitionInfo$lambda$1);
                Animation<T, V> animation2 = animation;
                createTransitionInfo$lambda$12 = Utils_androidKt.createTransitionInfo$lambda$1(lazy);
                linkedHashMap.put(valueOf, animation2.getValueFromNanos(Utils_androidKt.millisToNanos(createTransitionInfo$lambda$12)));
                linkedHashMap.put(Long.valueOf(nanosToMillis), animation.getValueFromNanos(Utils_androidKt.millisToNanos(nanosToMillis)));
                createTransitionInfo$lambda$13 = Utils_androidKt.createTransitionInfo$lambda$1(lazy);
                while (createTransitionInfo$lambda$13 <= nanosToMillis) {
                    linkedHashMap.put(Long.valueOf(createTransitionInfo$lambda$13), animation.getValueFromNanos(Utils_androidKt.millisToNanos(createTransitionInfo$lambda$13)));
                    createTransitionInfo$lambda$13 += j;
                }
                return linkedHashMap;
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createTransitionInfo$lambda$1(Lazy<Long> lazy) {
        return lazy.getValue().longValue();
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$2(Lazy<? extends Map<Long, T>> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(InfiniteTransition.TransitionAnimationState transitionAnimationState, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(transitionAnimationState, j, j2);
    }

    public static final <T, V extends AnimationVector> TransitionInfo createTransitionInfo(final InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, final long j, final long j2) {
        final long j3 = 0;
        return new TransitionInfo(transitionAnimationState.getLabel(), transitionAnimationState.getAnimationSpec().getClass().getName(), 0L, j2, createTransitionInfo$lambda$3(LazyKt.lazy(new Function0<Map<Long, T>>() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$createTransitionInfo$values$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Long, T> invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Long.valueOf(j3), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(j3)));
                linkedHashMap.put(Long.valueOf(j2), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(j2)));
                long j4 = j3;
                while (j4 <= j2) {
                    linkedHashMap.put(Long.valueOf(j4), transitionAnimationState.getAnimation().getValueFromNanos(Utils_androidKt.millisToNanos(j4)));
                    j4 += j;
                }
                return linkedHashMap;
            }
        })));
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$3(Lazy<? extends Map<Long, T>> lazy) {
        return lazy.getValue();
    }

    private static final boolean parseParametersToValue$parametersAreValid(Object obj, Object obj2) {
        return (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) ? false : true;
    }

    private static final boolean parseParametersToValue$parametersHasTheSameType(Object obj, Object obj2, Object obj3) {
        return obj.getClass() == obj2.getClass() && obj.getClass() == obj3.getClass();
    }

    private static final Dp parseParametersToValue$getDp(Object obj) {
        Dp dp = obj instanceof Dp ? (Dp) obj : null;
        if (dp == null) {
            Float f = obj instanceof Float ? (Float) obj : null;
            dp = f != null ? Dp.m6995boximpl(Dp.m6997constructorimpl(f.floatValue())) : null;
            if (dp == null) {
                Double d = obj instanceof Double ? (Double) obj : null;
                dp = d != null ? Dp.m6995boximpl(Dp.m6997constructorimpl((float) d.doubleValue())) : null;
                if (dp == null) {
                    if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                        return Dp.m6995boximpl(Dp.m6997constructorimpl(r4.intValue()));
                    }
                    return null;
                }
            }
        }
        return dp;
    }

    private static final <T> TargetState<Dp> parseParametersToValue$parseDp(T t, Object obj, Object obj2) {
        if (!(t instanceof Dp) || obj2 == null) {
            return null;
        }
        if ((obj instanceof Dp) && (obj2 instanceof Dp)) {
            return new TargetState<>(obj, obj2);
        }
        Dp parseParametersToValue$getDp = parseParametersToValue$getDp(obj);
        Dp parseParametersToValue$getDp2 = parseParametersToValue$getDp(obj2);
        if (parseParametersToValue$getDp == null || parseParametersToValue$getDp2 == null) {
            return null;
        }
        return new TargetState<>(parseParametersToValue$getDp, parseParametersToValue$getDp2);
    }

    public static final <T> TargetState<T> parseParametersToValue(T t, Object obj, Object obj2) {
        TargetState<T> targetState;
        if (t == null) {
            return null;
        }
        TargetState<T> targetState2 = (TargetState<T>) parseParametersToValue$parseDp(t, obj, obj2);
        if (targetState2 != null) {
            return targetState2;
        }
        if (!parseParametersToValue$parametersAreValid(obj, obj2)) {
            return null;
        }
        Intrinsics.checkNotNull(obj2);
        if (parseParametersToValue$parametersHasTheSameType(t, obj, obj2)) {
            return new TargetState<>(obj, obj2);
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            try {
                if (t instanceof IntSize) {
                    Object obj3 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) obj3).intValue();
                    Object obj4 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    IntSize m7159boximpl = IntSize.m7159boximpl(IntSizeKt.IntSize(intValue, ((Integer) obj4).intValue()));
                    Object obj5 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                    int intValue2 = ((Integer) obj5).intValue();
                    Object obj6 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                    targetState = new TargetState<>(m7159boximpl, IntSize.m7159boximpl(IntSizeKt.IntSize(intValue2, ((Integer) obj6).intValue())));
                } else if (t instanceof IntOffset) {
                    Object obj7 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                    int intValue3 = ((Integer) obj7).intValue();
                    Object obj8 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
                    IntOffset m7116boximpl = IntOffset.m7116boximpl(IntOffsetKt.IntOffset(intValue3, ((Integer) obj8).intValue()));
                    Object obj9 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Int");
                    int intValue4 = ((Integer) obj9).intValue();
                    Object obj10 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Int");
                    targetState = new TargetState<>(m7116boximpl, IntOffset.m7116boximpl(IntOffsetKt.IntOffset(intValue4, ((Integer) obj10).intValue())));
                } else if (t instanceof Size) {
                    Object obj11 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Float) obj11).floatValue();
                    Object obj12 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Float");
                    Size m4331boximpl = Size.m4331boximpl(SizeKt.Size(floatValue, ((Float) obj12).floatValue()));
                    Object obj13 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue2 = ((Float) obj13).floatValue();
                    Object obj14 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(m4331boximpl, Size.m4331boximpl(SizeKt.Size(floatValue2, ((Float) obj14).floatValue())));
                } else if (t instanceof Offset) {
                    Object obj15 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue3 = ((Float) obj15).floatValue();
                    Object obj16 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Float");
                    Offset m4263boximpl = Offset.m4263boximpl(OffsetKt.Offset(floatValue3, ((Float) obj16).floatValue()));
                    Object obj17 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue4 = ((Float) obj17).floatValue();
                    Object obj18 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(m4263boximpl, Offset.m4263boximpl(OffsetKt.Offset(floatValue4, ((Float) obj18).floatValue())));
                } else if (t instanceof Rect) {
                    Object obj19 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue5 = ((Float) obj19).floatValue();
                    Object obj20 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue6 = ((Float) obj20).floatValue();
                    Object obj21 = ((List) obj).get(2);
                    Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue7 = ((Float) obj21).floatValue();
                    Object obj22 = ((List) obj).get(3);
                    Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.Float");
                    Rect rect = new Rect(floatValue5, floatValue6, floatValue7, ((Float) obj22).floatValue());
                    Object obj23 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj23, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue8 = ((Float) obj23).floatValue();
                    Object obj24 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj24, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue9 = ((Float) obj24).floatValue();
                    Object obj25 = ((List) obj2).get(2);
                    Intrinsics.checkNotNull(obj25, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue10 = ((Float) obj25).floatValue();
                    Object obj26 = ((List) obj2).get(3);
                    Intrinsics.checkNotNull(obj26, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(rect, new Rect(floatValue8, floatValue9, floatValue10, ((Float) obj26).floatValue()));
                } else if (t instanceof Color) {
                    Object obj27 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj27, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue11 = ((Float) obj27).floatValue();
                    Object obj28 = ((List) obj).get(1);
                    Intrinsics.checkNotNull(obj28, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue12 = ((Float) obj28).floatValue();
                    Object obj29 = ((List) obj).get(2);
                    Intrinsics.checkNotNull(obj29, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue13 = ((Float) obj29).floatValue();
                    Object obj30 = ((List) obj).get(3);
                    Intrinsics.checkNotNull(obj30, "null cannot be cast to non-null type kotlin.Float");
                    Color m4505boximpl = Color.m4505boximpl(ColorKt.Color$default(floatValue11, floatValue12, floatValue13, ((Float) obj30).floatValue(), null, 16, null));
                    Object obj31 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj31, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue14 = ((Float) obj31).floatValue();
                    Object obj32 = ((List) obj2).get(1);
                    Intrinsics.checkNotNull(obj32, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue15 = ((Float) obj32).floatValue();
                    Object obj33 = ((List) obj2).get(2);
                    Intrinsics.checkNotNull(obj33, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue16 = ((Float) obj33).floatValue();
                    Object obj34 = ((List) obj2).get(3);
                    Intrinsics.checkNotNull(obj34, "null cannot be cast to non-null type kotlin.Float");
                    targetState = new TargetState<>(m4505boximpl, Color.m4505boximpl(ColorKt.Color$default(floatValue14, floatValue15, floatValue16, ((Float) obj34).floatValue(), null, 16, null)));
                } else if (t instanceof Dp) {
                    Object obj35 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj35);
                    Object obj36 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj36);
                    targetState = (TargetState<T>) parseParametersToValue$parseDp(t, obj35, obj36);
                } else if (parseParametersToValue$parametersAreValid(((List) obj).get(0), ((List) obj2).get(0))) {
                    Object obj37 = ((List) obj).get(0);
                    Intrinsics.checkNotNull(obj37);
                    Object obj38 = ((List) obj2).get(0);
                    Intrinsics.checkNotNull(obj38);
                    if (parseParametersToValue$parametersHasTheSameType(t, obj37, obj38)) {
                        targetState = new TargetState<>(((List) obj).get(0), ((List) obj2).get(0));
                    }
                }
                Intrinsics.checkNotNull(targetState, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.TargetState<T of androidx.compose.ui.tooling.animation.clock.Utils_androidKt.parseParametersToValue>");
                return targetState;
            } catch (ClassCastException | IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
            }
        }
        return null;
    }
}
