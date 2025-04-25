package androidx.compose.foundation.gestures;

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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {247, 253, 972, 1014, 1025}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGestures$9 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function1<PointerInputChange, Unit> $onDragEnd;
    final /* synthetic */ Function3<PointerInputChange, PointerInputChange, Offset, Unit> $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ Ref.LongRef $overSlop;
    final /* synthetic */ Function0<Boolean> $shouldAwaitTouchSlop;
    float F$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGestures$9(Function0<Boolean> function0, Ref.LongRef longRef, Orientation orientation, Function3<? super PointerInputChange, ? super PointerInputChange, ? super Offset, Unit> function3, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function02, Function1<? super PointerInputChange, Unit> function1, Continuation<? super DragGestureDetectorKt$detectDragGestures$9> continuation) {
        super(2, continuation);
        this.$shouldAwaitTouchSlop = function0;
        this.$overSlop = longRef;
        this.$orientationLock = orientation;
        this.$onDragStart = function3;
        this.$onDrag = function2;
        this.$onDragCancel = function02;
        this.$onDragEnd = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$9.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$9) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x025d, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m728isPointerUpDmW0f2w(r11.getCurrentEvent(), r2) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0101, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x030d, code lost:
    
        if ((!((r5 != null ? r5 == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.geometry.Offset.m4275getYimpl(r7) : androidx.compose.ui.geometry.Offset.m4274getXimpl(r7) : androidx.compose.ui.geometry.Offset.m4272getDistanceimpl(r7)) == 0.0f)) != false) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.input.pointer.PointerEventPass, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x01d4 -> B:68:0x0216). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0207 -> B:64:0x020d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0287 -> B:9:0x028a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0119 -> B:68:0x0216). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0184 -> B:67:0x0215). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
