package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.VelocityKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1", f = "Draggable.kt", i = {}, l = {524}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DragGestureNode$initializePointerInputNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DragGestureNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1(DragGestureNode dragGestureNode, Continuation<? super DragGestureNode$initializePointerInputNode$1> continuation) {
        super(2, continuation);
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureNode$initializePointerInputNode$1 dragGestureNode$initializePointerInputNode$1 = new DragGestureNode$initializePointerInputNode$1(this.this$0, continuation);
        dragGestureNode$initializePointerInputNode$1.L$0 = obj;
        return dragGestureNode$initializePointerInputNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((DragGestureNode$initializePointerInputNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final VelocityTracker velocityTracker = new VelocityTracker();
            final DragGestureNode dragGestureNode = this.this$0;
            Function3<PointerInputChange, PointerInputChange, Offset, Unit> function3 = new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                    m737invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-0AR0LA0, reason: not valid java name */
                public final void m737invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j) {
                    boolean z;
                    Channel channel;
                    Channel channel2;
                    if (DragGestureNode.this.getCanDrag().invoke(pointerInputChange).booleanValue()) {
                        z = DragGestureNode.this.isListeningForEvents;
                        if (!z) {
                            channel2 = DragGestureNode.this.channel;
                            if (channel2 == null) {
                                DragGestureNode.this.channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                            }
                            DragGestureNode.this.startListeningForEvents();
                        }
                        VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange);
                        long m4278minusMKHz9U = Offset.m4278minusMKHz9U(pointerInputChange2.getPosition(), j);
                        channel = DragGestureNode.this.channel;
                        if (channel != null) {
                            ChannelResult.m9801boximpl(channel.mo9791trySendJP2dKIU(new DragEvent.DragStarted(m4278minusMKHz9U, null)));
                        }
                    }
                }
            };
            final DragGestureNode dragGestureNode2 = this.this$0;
            Function1<PointerInputChange, Unit> function1 = new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
                    invoke2(pointerInputChange);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PointerInputChange pointerInputChange) {
                    Channel channel;
                    long m752toValidVelocityTH1AsA0;
                    VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange);
                    float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(dragGestureNode2, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                    long m5822calculateVelocityAH228Gc = VelocityTracker.this.m5822calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                    VelocityTracker.this.resetTracking();
                    channel = dragGestureNode2.channel;
                    if (channel != null) {
                        m752toValidVelocityTH1AsA0 = DraggableKt.m752toValidVelocityTH1AsA0(m5822calculateVelocityAH228Gc);
                        ChannelResult.m9801boximpl(channel.mo9791trySendJP2dKIU(new DragEvent.DragStopped(m752toValidVelocityTH1AsA0, null)));
                    }
                }
            };
            final DragGestureNode dragGestureNode3 = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Channel channel;
                    channel = DragGestureNode.this.channel;
                    if (channel != null) {
                        ChannelResult.m9801boximpl(channel.mo9791trySendJP2dKIU(DragEvent.DragCancelled.INSTANCE));
                    }
                }
            };
            final DragGestureNode dragGestureNode4 = this.this$0;
            Function0<Boolean> function02 = new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(!DragGestureNode.this.getStartDragImmediately());
                }
            };
            final DragGestureNode dragGestureNode5 = this.this$0;
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m736invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m736invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
                    Channel channel;
                    VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange);
                    channel = dragGestureNode5.channel;
                    if (channel != null) {
                        ChannelResult.m9801boximpl(channel.mo9791trySendJP2dKIU(new DragEvent.DragDelta(j, null)));
                    }
                }
            };
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(this.this$0, pointerInputScope, function3, function1, function0, function02, function2, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {526}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
        final /* synthetic */ Function3<PointerInputChange, PointerInputChange, Offset, Unit> $onDragStart;
        final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dragGestureNode;
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.$onDragStart = function3;
            this.$onDragEnd = function1;
            this.$onDragCancel = function0;
            this.$shouldAwaitTouchSlop = function02;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$SuspendingPointerInputModifierNode, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L15
                java.lang.Object r0 = r12.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.util.concurrent.CancellationException -> L13
                goto L60
            L13:
                r13 = move-exception
                goto L49
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
                androidx.compose.foundation.gestures.DragGestureNode r1 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L45
                androidx.compose.foundation.gestures.Orientation r8 = androidx.compose.foundation.gestures.DragGestureNode.access$getOrientationLock$p(r1)     // Catch: java.util.concurrent.CancellationException -> L45
                androidx.compose.ui.input.pointer.PointerInputScope r3 = r12.$$this$SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L45
                kotlin.jvm.functions.Function3<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> r4 = r12.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L45
                kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r5 = r12.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L45
                kotlin.jvm.functions.Function0<kotlin.Unit> r6 = r12.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L45
                kotlin.jvm.functions.Function0<java.lang.Boolean> r7 = r12.$shouldAwaitTouchSlop     // Catch: java.util.concurrent.CancellationException -> L45
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> r9 = r12.$onDrag     // Catch: java.util.concurrent.CancellationException -> L45
                r10 = r12
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10     // Catch: java.util.concurrent.CancellationException -> L45
                r12.L$0 = r13     // Catch: java.util.concurrent.CancellationException -> L45
                r12.label = r2     // Catch: java.util.concurrent.CancellationException -> L45
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L45
                if (r13 != r0) goto L60
                return r0
            L45:
                r0 = move-exception
                r11 = r0
                r0 = r13
                r13 = r11
            L49:
                androidx.compose.foundation.gestures.DragGestureNode r1 = r12.this$0
                kotlinx.coroutines.channels.Channel r1 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r1)
                if (r1 == 0) goto L5a
                androidx.compose.foundation.gestures.DragEvent$DragCancelled r2 = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE
                java.lang.Object r1 = r1.mo9791trySendJP2dKIU(r2)
                kotlinx.coroutines.channels.ChannelResult.m9801boximpl(r1)
            L5a:
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                if (r0 == 0) goto L63
            L60:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            L63:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
