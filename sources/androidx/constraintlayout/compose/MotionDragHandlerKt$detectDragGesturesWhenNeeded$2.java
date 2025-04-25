package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: MotionDragHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2", f = "MotionDragHandler.kt", i = {0, 1, 1, 1}, l = {166, 174, 183}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop"}, s = {"L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Offset, Boolean> $onAcceptFirstDown;
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function0<Unit> $onDragEnd;
    final /* synthetic */ Function1<Offset, Unit> $onDragStart;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(Function1<? super Offset, Boolean> function1, Function1<? super Offset, Unit> function12, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super MotionDragHandlerKt$detectDragGesturesWhenNeeded$2> continuation) {
        super(2, continuation);
        this.$onAcceptFirstDown = function1;
        this.$onDragStart = function12;
        this.$onDrag = function2;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MotionDragHandlerKt$detectDragGesturesWhenNeeded$2 motionDragHandlerKt$detectDragGesturesWhenNeeded$2 = new MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(this.$onAcceptFirstDown, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        motionDragHandlerKt$detectDragGesturesWhenNeeded$2.L$0 = obj;
        return motionDragHandlerKt$detectDragGesturesWhenNeeded$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((MotionDragHandlerKt$detectDragGesturesWhenNeeded$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0096 -> B:17:0x0099). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
