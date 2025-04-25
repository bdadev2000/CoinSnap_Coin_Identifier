package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: SelectionGestures.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u0012\u0010\f\u001a\u00020\u0004*\u00020\rH\u0082@¢\u0006\u0002\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\"\u0010\u001d\u001a\u00020\u0010*\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0080@¢\u0006\u0002\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a\"\u0010\"\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a\"\u0010$\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010!\u001a \u0010%\u001a\u00020\u0019*\u00020\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100'H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006("}, d2 = {"STATIC_KEY", "", "isPrecisePointer", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "distanceIsTolerable", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "change1", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "change2", "awaitDown", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelection", "", "observer", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "clicksCounter", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "down", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseSelectionBtf2", "selectionGestureInput", "Landroidx/compose/ui/Modifier;", "mouseSelectionObserver", "textDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "selectionGesturePointerInputBtf2", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "touchSelectionFirstPress", "downEvent", "touchSelectionSubsequentPress", "updateSelectionTouchMode", "updateTouchMode", "Lkotlin/Function1;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    public static final Modifier updateSelectionTouchMode(Modifier modifier, Function1<? super Boolean, Unit> function1) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new SelectionGesturesKt$updateSelectionTouchMode$1(function1, null));
    }

    public static final Modifier selectionGestureInput(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new SelectionGesturesKt$selectionGestureInput$1(mouseSelectionObserver, textDragObserver, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0032, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0080, B:42:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[Catch: CancellationException -> 0x00d5, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0032, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0080, B:42:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$1
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            goto La2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            r7 = r10
            r10 = r8
            r8 = r7
            goto L72
        L52:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r10 = kotlin.collections.CollectionsKt.first(r10)     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r5 = r10.getId()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m718awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 != r1) goto L72
            return r1
        L72:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 == 0) goto Ld2
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r10 == 0) goto Ld2
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r9.mo1364onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r10 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> Ld5
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> Ld5
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> Ld5
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m726dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 != r1) goto La2
            return r1
        La2:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r10 == 0) goto Lcf
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> Ld5
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r11 = 0
        Lb7:
            if (r11 >= r10) goto Lcb
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r1 == 0) goto Lc8
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> Ld5
        Lc8:
            int r11 = r11 + 1
            goto Lb7
        Lcb:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> Ld5
            goto Ld2
        Lcf:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> Ld5
        Ld2:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        Ld5:
            r8 = move-exception
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, final androidx.compose.foundation.text.selection.MouseSelectionObserver r8, androidx.compose.foundation.text.selection.ClicksCounter r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object selectionGesturePointerInputBtf2(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0032, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0080, B:42:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[Catch: CancellationException -> 0x00d5, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0032, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0080, B:42:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$1
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            goto La2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            r7 = r10
            r10 = r8
            r8 = r7
            goto L72
        L52:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r10 = kotlin.collections.CollectionsKt.first(r10)     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r5 = r10.getId()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m718awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 != r1) goto L72
            return r1
        L72:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 == 0) goto Ld2
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r10 == 0) goto Ld2
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r9.mo1364onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r10 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1     // Catch: java.util.concurrent.CancellationException -> Ld5
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> Ld5
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> Ld5
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m726dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 != r1) goto La2
            return r1
        La2:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r10 == 0) goto Lcf
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> Ld5
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r11 = 0
        Lb7:
            if (r11 >= r10) goto Lcb
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r1 == 0) goto Lc8
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> Ld5
        Lc8:
            int r11 = r11 + 1
            goto Lb7
        Lcb:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> Ld5
            goto Ld2
        Lcf:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> Ld5
        Ld2:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        Ld5:
            r8 = move-exception
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea A[Catch: CancellationException -> 0x0115, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f A[Catch: CancellationException -> 0x0115, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: CancellationException -> 0x0115, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[Catch: CancellationException -> 0x0115, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0 A[Catch: CancellationException -> 0x0115, TryCatch #1 {CancellationException -> 0x0115, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a3, B:37:0x00a7, B:38:0x00a9, B:40:0x00ad, B:42:0x00b0, B:44:0x00bb, B:46:0x00c1, B:48:0x00c5, B:49:0x00ca, B:58:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, final androidx.compose.foundation.text.TextDragObserver r13, androidx.compose.ui.input.pointer.PointerEvent r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0105 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0033, B:13:0x00fd, B:15:0x0105, B:17:0x0113, B:19:0x011f, B:59:0x00e2), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:32:0x004d, B:33:0x008b, B:35:0x0093, B:37:0x00a1, B:39:0x00ad, B:50:0x0070), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, final androidx.compose.foundation.text.selection.MouseSelectionObserver r8, androidx.compose.foundation.text.selection.ClicksCounter r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0044 -> B:10:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerEvent> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L14
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L47
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
        L3a:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.getChanges()
            int r4 = r2.size()
            r5 = 0
        L52:
            if (r5 >= r4) goto L64
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r6)
            if (r6 != 0) goto L61
            goto L3a
        L61:
            int r5 = r5 + 1
            goto L52
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m4272getDistanceimpl(Offset.m4278minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < DragGestureDetectorKt.m729pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.getType());
    }

    public static final boolean isPrecisePointer(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!PointerType.m5794equalsimpl0(changes.get(i).getType(), PointerType.INSTANCE.m5799getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }
}
