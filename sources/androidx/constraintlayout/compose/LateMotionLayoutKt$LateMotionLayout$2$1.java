package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LateMotionLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1", f = "LateMotionLayout.kt", i = {}, l = {85, 98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class LateMotionLayoutKt$LateMotionLayout$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatableProgress;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Channel<ConstraintSet> $channel;
    final /* synthetic */ Ref<CompositionSource> $compositionSource;
    final /* synthetic */ MutableIntState $direction;
    final /* synthetic */ MutableState<ConstraintSet> $end;
    final /* synthetic */ Function0<Unit> $finishedAnimationListener;
    final /* synthetic */ MutableState<ConstraintSet> $start;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LateMotionLayoutKt$LateMotionLayout$2$1(Channel<ConstraintSet> channel, MutableIntState mutableIntState, MutableState<ConstraintSet> mutableState, MutableState<ConstraintSet> mutableState2, Ref<CompositionSource> ref, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Continuation<? super LateMotionLayoutKt$LateMotionLayout$2$1> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$direction = mutableIntState;
        this.$start = mutableState;
        this.$end = mutableState2;
        this.$compositionSource = ref;
        this.$animatableProgress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LateMotionLayoutKt$LateMotionLayout$2$1(this.$channel, this.$direction, this.$start, this.$end, this.$compositionSource, this.$animatableProgress, this.$animationSpec, this.$finishedAnimationListener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LateMotionLayoutKt$LateMotionLayout$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b2 -> B:6:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cc -> B:12:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            kotlin.ResultKt.throwOnFailure(r15)
        L15:
            r15 = r1
            goto Lb5
        L18:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L20:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L42
        L28:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> r15 = r14.$channel
            kotlinx.coroutines.channels.ChannelIterator r15 = r15.iterator()
        L31:
            r1 = r14
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r14.L$0 = r15
            r14.label = r3
            java.lang.Object r1 = r15.hasNext(r1)
            if (r1 != r0) goto L3f
            return r0
        L3f:
            r13 = r1
            r1 = r15
            r15 = r13
        L42:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lcf
            java.lang.Object r15 = r1.next()
            androidx.constraintlayout.compose.ConstraintSet r15 = (androidx.constraintlayout.compose.ConstraintSet) r15
            kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$channel
            java.lang.Object r4 = r4.mo9796tryReceivePtdJZtk()
            java.lang.Object r4 = kotlinx.coroutines.channels.ChannelResult.m9806getOrNullimpl(r4)
            androidx.constraintlayout.compose.ConstraintSet r4 = (androidx.constraintlayout.compose.ConstraintSet) r4
            if (r4 != 0) goto L5f
            goto L60
        L5f:
            r15 = r4
        L60:
            androidx.compose.runtime.MutableIntState r4 = r14.$direction
            int r4 = r4.getIntValue()
            if (r4 != r3) goto L6b
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$start
            goto L6d
        L6b:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$end
        L6d:
            java.lang.Object r4 = r4.getValue()
            androidx.constraintlayout.compose.ConstraintSet r4 = (androidx.constraintlayout.compose.ConstraintSet) r4
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r4)
            if (r4 != 0) goto Lcc
            androidx.compose.runtime.MutableIntState r4 = r14.$direction
            int r4 = r4.getIntValue()
            if (r4 != r3) goto L87
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$end
            r4.setValue(r15)
            goto L8c
        L87:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$start
            r4.setValue(r15)
        L8c:
            androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r15 = r14.$compositionSource
            androidx.constraintlayout.compose.CompositionSource r4 = androidx.constraintlayout.compose.CompositionSource.Content
            r15.setValue(r4)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r5 = r14.$animatableProgress
            androidx.compose.runtime.MutableIntState r15 = r14.$direction
            int r15 = r15.getIntValue()
            float r15 = (float) r15
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r15)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r7 = r14.$animationSpec
            r10 = r14
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
            r14.L$0 = r1
            r14.label = r2
            r8 = 0
            r9 = 0
            r11 = 12
            r12 = 0
            java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r15 != r0) goto L15
            return r0
        Lb5:
            androidx.compose.runtime.MutableIntState r1 = r14.$direction
            int r4 = r1.getIntValue()
            if (r4 != r3) goto Lbf
            r4 = 0
            goto Lc0
        Lbf:
            r4 = r3
        Lc0:
            r1.setIntValue(r4)
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r14.$finishedAnimationListener
            if (r1 == 0) goto L31
            r1.invoke()
            goto L31
        Lcc:
            r15 = r1
            goto L31
        Lcf:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
