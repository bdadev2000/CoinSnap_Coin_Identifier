package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DragGestureNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, Continuation<? super DragGestureNode$startListeningForEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.this$0, continuation);
        dragGestureNode$startListeningForEvents$1.L$0 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DragGestureNode$startListeningForEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(1:42)|25|26|27|(2:32|(2:34|(1:36)))(2:29|(1:31))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[Catch: CancellationException -> 0x0106, TryCatch #2 {CancellationException -> 0x0106, blocks: (B:27:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f3), top: B:26:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[Catch: CancellationException -> 0x0106, TryCatch #2 {CancellationException -> 0x0106, blocks: (B:27:0x00ca, B:29:0x00d0, B:32:0x00ed, B:34:0x00f3), top: B:26:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ea -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f1 -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0103 -> B:8:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0117 -> B:7:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "processDelta", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Function1<? super DragEvent.DragDelta, ? extends Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<DragEvent> objectRef, DragGestureNode dragGestureNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = objectRef;
            this.this$0 = dragGestureNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Function1<? super DragEvent.DragDelta, ? extends Unit> function1, Continuation<? super Unit> continuation) {
            return invoke2((Function1<? super DragEvent.DragDelta, Unit>) function1, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Function1<? super DragEvent.DragDelta, Unit> function1, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(function1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:6:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:5:0x0064). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r5.L$0
                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                kotlin.ResultKt.throwOnFailure(r6)
                goto L64
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
                r3 = r6
            L28:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r6 = r5.$event
                T r6 = r6.element
                boolean r6 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                if (r6 != 0) goto L6a
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r6 = r5.$event
                T r6 = r6.element
                boolean r6 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                if (r6 != 0) goto L6a
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r6 = r5.$event
                T r6 = r6.element
                boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                r4 = 0
                if (r1 == 0) goto L44
                androidx.compose.foundation.gestures.DragEvent$DragDelta r6 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r6
                goto L45
            L44:
                r6 = r4
            L45:
                if (r6 == 0) goto L4a
                r3.invoke(r6)
            L4a:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r5.$event
                androidx.compose.foundation.gestures.DragGestureNode r6 = r5.this$0
                kotlinx.coroutines.channels.Channel r6 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r6)
                if (r6 == 0) goto L67
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5.L$0 = r3
                r5.L$1 = r1
                r5.label = r2
                java.lang.Object r6 = r6.receive(r4)
                if (r6 != r0) goto L64
                return r0
            L64:
                r4 = r6
                androidx.compose.foundation.gestures.DragEvent r4 = (androidx.compose.foundation.gestures.DragEvent) r4
            L67:
                r1.element = r4
                goto L28
            L6a:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
