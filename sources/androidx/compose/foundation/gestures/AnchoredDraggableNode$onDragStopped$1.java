package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", i = {}, l = {275, 277}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $velocity;
    Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, long j, Continuation<? super AnchoredDraggableNode$onDragStopped$1> continuation) {
        super(2, continuation);
        this.this$0 = anchoredDraggableNode;
        this.$velocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OverscrollEffect overscrollEffect;
        OverscrollEffect overscrollEffect2;
        long m688reverseIfNeededAH228Gc;
        AnchoredDraggableState anchoredDraggableState;
        long m688reverseIfNeededAH228Gc2;
        float m690toFloatTH1AsA0;
        AnchoredDraggableNode anchoredDraggableNode;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            overscrollEffect = ((AnchoredDraggableNode) this.this$0).overscrollEffect;
            if (overscrollEffect != null) {
                overscrollEffect2 = ((AnchoredDraggableNode) this.this$0).overscrollEffect;
                Intrinsics.checkNotNull(overscrollEffect2);
                m688reverseIfNeededAH228Gc = this.this$0.m688reverseIfNeededAH228Gc(this.$velocity);
                this.label = 2;
                if (overscrollEffect2.mo521applyToFlingBMRW4eQ(m688reverseIfNeededAH228Gc, new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                AnchoredDraggableNode anchoredDraggableNode2 = this.this$0;
                anchoredDraggableState = anchoredDraggableNode2.state;
                AnchoredDraggableNode<T> anchoredDraggableNode3 = this.this$0;
                m688reverseIfNeededAH228Gc2 = anchoredDraggableNode3.m688reverseIfNeededAH228Gc(this.$velocity);
                m690toFloatTH1AsA0 = anchoredDraggableNode3.m690toFloatTH1AsA0(m688reverseIfNeededAH228Gc2);
                this.L$0 = anchoredDraggableNode2;
                this.label = 1;
                Object obj2 = anchoredDraggableState.settle(m690toFloatTH1AsA0, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anchoredDraggableNode = anchoredDraggableNode2;
                obj = obj2;
                anchoredDraggableNode.m693toVelocityadjELrA(((Number) obj).floatValue());
            }
        } else if (i == 1) {
            anchoredDraggableNode = (AnchoredDraggableNode) this.L$0;
            ResultKt.throwOnFailure(obj);
            anchoredDraggableNode.m693toVelocityadjELrA(((Number) obj).floatValue());
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", ExifInterface.GPS_DIRECTION_TRUE, "availableVelocity"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", i = {0}, l = {280}, m = "invokeSuspend", n = {"availableVelocity"}, s = {"J$0"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
        /* synthetic */ long J$0;
        Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableNode<T> anchoredDraggableNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.J$0 = ((Velocity) obj).getPackedValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
            return m697invokesFctU(velocity.getPackedValue(), continuation);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m697invokesFctU(long j, Continuation<? super Velocity> continuation) {
            return ((AnonymousClass1) create(Velocity.m7225boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnchoredDraggableState anchoredDraggableState;
            float m690toFloatTH1AsA0;
            AnchoredDraggableNode anchoredDraggableNode;
            long j;
            long m693toVelocityadjELrA;
            AnchoredDraggableState anchoredDraggableState2;
            AnchoredDraggableState anchoredDraggableState3;
            AnchoredDraggableState anchoredDraggableState4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j2 = this.J$0;
                AnchoredDraggableNode anchoredDraggableNode2 = this.this$0;
                anchoredDraggableState = anchoredDraggableNode2.state;
                m690toFloatTH1AsA0 = this.this$0.m690toFloatTH1AsA0(j2);
                this.L$0 = anchoredDraggableNode2;
                this.J$0 = j2;
                this.label = 1;
                Object obj2 = anchoredDraggableState.settle(m690toFloatTH1AsA0, this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anchoredDraggableNode = anchoredDraggableNode2;
                obj = obj2;
                j = j2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                anchoredDraggableNode = (AnchoredDraggableNode) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            m693toVelocityadjELrA = anchoredDraggableNode.m693toVelocityadjELrA(((Number) obj).floatValue());
            anchoredDraggableState2 = ((AnchoredDraggableNode) this.this$0).state;
            float requireOffset = anchoredDraggableState2.requireOffset();
            anchoredDraggableState3 = ((AnchoredDraggableNode) this.this$0).state;
            float minAnchor = anchoredDraggableState3.getAnchors().minAnchor();
            anchoredDraggableState4 = ((AnchoredDraggableNode) this.this$0).state;
            if (requireOffset >= anchoredDraggableState4.getAnchors().maxAnchor() || requireOffset <= minAnchor) {
                j = m693toVelocityadjELrA;
            }
            return Velocity.m7225boximpl(j);
        }
    }
}
