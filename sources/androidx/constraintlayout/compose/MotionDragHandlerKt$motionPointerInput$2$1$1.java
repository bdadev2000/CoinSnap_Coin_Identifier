package androidx.constraintlayout.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* compiled from: MotionDragHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1", f = "MotionDragHandler.kt", i = {0, 0, 0, 1, 2, 2}, l = {77, 80, 85}, m = "invokeSuspend", n = {"$this$effectScope", "dragState", "isTouchUp", "$this$effectScope", "$this$effectScope", "isTouchUp"}, s = {"L$0", "L$1", "I$0", "L$0", "L$0", "I$0"})
/* loaded from: classes8.dex */
final class MotionDragHandlerKt$motionPointerInput$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel<MotionDragState> $dragChannel;
    final /* synthetic */ TransitionHandler $swipeHandler;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDragHandlerKt$motionPointerInput$2$1$1(TransitionHandler transitionHandler, Channel<MotionDragState> channel, Continuation<? super MotionDragHandlerKt$motionPointerInput$2$1$1> continuation) {
        super(2, continuation);
        this.$swipeHandler = transitionHandler;
        this.$dragChannel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MotionDragHandlerKt$motionPointerInput$2$1$1 motionDragHandlerKt$motionPointerInput$2$1$1 = new MotionDragHandlerKt$motionPointerInput$2$1$1(this.$swipeHandler, this.$dragChannel, continuation);
        motionDragHandlerKt$motionPointerInput$2$1$1.L$0 = obj;
        return motionDragHandlerKt$motionPointerInput$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MotionDragHandlerKt$motionPointerInput$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00af -> B:7:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b2 -> B:7:0x00bb). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
