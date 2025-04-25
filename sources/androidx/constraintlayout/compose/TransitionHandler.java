package androidx.constraintlayout.compose;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: TransitionHandler.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\fJ\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/constraintlayout/compose/TransitionHandler;", "", "motionMeasurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", Key.MOTIONPROGRESS, "Landroidx/compose/runtime/MutableFloatState;", "(Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/MutableFloatState;)V", "transition", "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "onAcceptFirstDownForOnSwipe", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "onAcceptFirstDownForOnSwipe-k-4lQ0M", "(J)Z", "onTouchUp", "", "velocity", "Landroidx/compose/ui/unit/Velocity;", "onTouchUp-sF-c-tU", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pendingProgressWhileTouchUp", "updateProgressOnDrag", "dragAmount", "updateProgressOnDrag-k-4lQ0M", "(J)V", "updateProgressWhileTouchUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class TransitionHandler {
    public static final int $stable = 8;
    private final MotionMeasurer motionMeasurer;
    private final MutableFloatState motionProgress;

    public TransitionHandler(MotionMeasurer motionMeasurer, MutableFloatState mutableFloatState) {
        this.motionMeasurer = motionMeasurer;
        this.motionProgress = mutableFloatState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.motionMeasurer.getTransition();
    }

    /* renamed from: onAcceptFirstDownForOnSwipe-k-4lQ0M, reason: not valid java name */
    public final boolean m7467onAcceptFirstDownForOnSwipek4lQ0M(long offset) {
        return getTransition().isFirstDownAccepted(Offset.m4274getXimpl(offset), Offset.m4275getYimpl(offset));
    }

    /* renamed from: updateProgressOnDrag-k-4lQ0M, reason: not valid java name */
    public final void m7469updateProgressOnDragk4lQ0M(long dragAmount) {
        this.motionProgress.setFloatValue(RangesKt.coerceIn(this.motionProgress.getFloatValue() + getTransition().dragToProgress(this.motionProgress.getFloatValue(), this.motionMeasurer.getLayoutCurrentWidth(), this.motionMeasurer.getLayoutCurrentHeight(), Offset.m4274getXimpl(dragAmount), Offset.m4275getYimpl(dragAmount)), 0.0f, 1.0f));
    }

    /* renamed from: onTouchUp-sF-c-tU, reason: not valid java name */
    public final Object m7468onTouchUpsFctU(final long j, Continuation<? super Unit> continuation) {
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(new Function1<Long, Unit>() { // from class: androidx.constraintlayout.compose.TransitionHandler$onTouchUp$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                androidx.constraintlayout.core.state.Transition transition;
                MutableFloatState mutableFloatState;
                transition = TransitionHandler.this.getTransition();
                mutableFloatState = TransitionHandler.this.motionProgress;
                transition.setTouchUp(mutableFloatState.getFloatValue(), j2, Velocity.m7234getXimpl(j), Velocity.m7235getYimpl(j));
            }
        }, continuation);
        return withFrameNanos == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withFrameNanos : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateProgressWhileTouchUp(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1
            if (r0 == 0) goto L14
            r0 = r5
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 r0 = (androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 r0 = new androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.constraintlayout.compose.TransitionHandler r0 = (androidx.constraintlayout.compose.TransitionHandler) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L4c
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1 r5 = new androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1
            r5.<init>()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.runtime.MutableFloatState r0 = r0.motionProgress
            r0.setFloatValue(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.TransitionHandler.updateProgressWhileTouchUp(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean pendingProgressWhileTouchUp() {
        return getTransition().isTouchNotDone(this.motionProgress.getFloatValue());
    }
}
