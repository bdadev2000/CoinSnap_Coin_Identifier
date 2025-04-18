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
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import d0.b0;
import h0.g;
import java.util.List;
import q0.l;

/* loaded from: classes3.dex */
public final class SelectionGesturesKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, h0.g r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.f7130c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7130c = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f7129b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f7130c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = r0.f7128a
            kotlin.jvm.internal.q.m(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.jvm.internal.q.m(r8)
        L34:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.f15573b
            r0.f7128a = r7
            r0.f7130c = r3
            java.lang.Object r8 = r7.L1(r8, r0)
            if (r8 != r1) goto L41
            goto L5d
        L41:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.f15569a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.a(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            r1 = r8
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, androidx.compose.foundation.text.selection.MouseSelectionObserver r7, androidx.compose.foundation.text.selection.ClicksCounter r8, androidx.compose.ui.input.pointer.PointerEvent r9, h0.g r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f7133c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L69
            if (r2 == r3) goto L38
            if (r2 != r5) goto L30
            androidx.compose.foundation.text.selection.MouseSelectionObserver r7 = r0.f7132b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = r0.f7131a
            kotlin.jvm.internal.q.m(r10)
            goto La1
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            androidx.compose.foundation.text.selection.MouseSelectionObserver r6 = r0.f7132b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = r0.f7131a
            kotlin.jvm.internal.q.m(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r8 = r10.booleanValue()
            if (r8 == 0) goto L65
            androidx.compose.ui.input.pointer.PointerEvent r7 = r7.S0()
            java.util.List r7 = r7.f15569a
            int r8 = r7.size()
        L51:
            if (r4 >= r8) goto L65
            java.lang.Object r9 = r7.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r10 = androidx.compose.ui.input.pointer.PointerEventKt.b(r9)
            if (r10 == 0) goto L62
            r9.a()
        L62:
            int r4 = r4 + 1
            goto L51
        L65:
            r6.b()
            goto Lca
        L69:
            kotlin.jvm.internal.q.m(r10)
            r8.a(r9)
            java.util.List r9 = r9.f15569a
            java.lang.Object r9 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            int r8 = r8.f7051b
            if (r8 == r3) goto L83
            if (r8 == r5) goto L80
            androidx.compose.foundation.text.selection.a r8 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.d
            goto L85
        L80:
            androidx.compose.foundation.text.selection.a r8 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.f7091c
            goto L85
        L83:
            androidx.compose.foundation.text.selection.a r8 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.f7089a
        L85:
            long r2 = r9.f15591c
            boolean r10 = r7.a(r2, r8)
            if (r10 == 0) goto Lca
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2 r10 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2
            r10.<init>(r7, r8)
            r0.f7131a = r6
            r0.f7132b = r7
            r0.d = r5
            long r8 = r9.f15589a
            java.lang.Object r10 = androidx.compose.foundation.gestures.DragGestureDetectorKt.h(r6, r8, r10, r0)
            if (r10 != r1) goto La1
            goto Lcc
        La1:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r8 = r10.booleanValue()
            if (r8 == 0) goto Lc7
            androidx.compose.ui.input.pointer.PointerEvent r6 = r6.S0()
            java.util.List r6 = r6.f15569a
            int r8 = r6.size()
        Lb3:
            if (r4 >= r8) goto Lc7
            java.lang.Object r9 = r6.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r10 = androidx.compose.ui.input.pointer.PointerEventKt.b(r9)
            if (r10 == 0) goto Lc4
            r9.a()
        Lc4:
            int r4 = r4 + 1
            goto Lb3
        Lc7:
            r7.b()
        Lca:
            d0.b0 r1 = d0.b0.f30125a
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.b(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, h0.g):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(7:11|12|13|(3:15|(3:17|(2:19|20)(1:22)|21)|24)|25|26|27)(2:29|30))(7:31|32|33|(3:35|(3:37|(2:39|40)(1:42)|41)|44)|45|26|27))(6:49|(1:(1:52)(1:59))(1:60)|53|(5:55|(2:57|58)|13|(0)|25)|26|27)|61|62|63))|64|6|7|(0)(0)|61|62|63|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:13:0x00ab, B:15:0x00b3, B:17:0x00bf, B:19:0x00cb, B:55:0x0094), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, androidx.compose.foundation.text.selection.MouseSelectionObserver r7, androidx.compose.foundation.text.selection.ClicksCounter r8, androidx.compose.ui.input.pointer.PointerEvent r9, h0.g r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:12:0x002a, B:13:0x008c, B:15:0x0094, B:17:0x00a1, B:19:0x00ad, B:21:0x00b0, B:24:0x00b3, B:28:0x00b7, B:32:0x003f, B:34:0x0062, B:36:0x0066, B:38:0x0070, B:43:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7 A[Catch: CancellationException -> 0x002e, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:12:0x002a, B:13:0x008c, B:15:0x0094, B:17:0x00a1, B:19:0x00ad, B:21:0x00b0, B:24:0x00b3, B:28:0x00b7, B:32:0x003f, B:34:0x0062, B:36:0x0066, B:38:0x0070, B:43:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, h0.g r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) r0
            int r1 = r0.f7155f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7155f = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f7155f
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L46
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            androidx.compose.foundation.text.TextDragObserver r9 = r0.f7153b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.f7152a
            kotlin.jvm.internal.q.m(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L8c
        L2e:
            r8 = move-exception
            goto Lbd
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = r0.f7154c
            androidx.compose.foundation.text.TextDragObserver r9 = r0.f7153b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = r0.f7152a
            kotlin.jvm.internal.q.m(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L46:
            kotlin.jvm.internal.q.m(r11)
            java.util.List r10 = r10.f15569a     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r10 = e0.u.E0(r10)     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L2e
            long r5 = r10.f15589a     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7152a = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7153b = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7154c = r10     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7155f = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.c(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L62
            goto Lbc
        L62:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 == 0) goto Lba
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = g(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lba
            long r2 = r11.f15591c     // Catch: java.util.concurrent.CancellationException -> L2e
            r9.b(r2)     // Catch: java.util.concurrent.CancellationException -> L2e
            long r10 = r11.f15589a     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> L2e
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7152a = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7153b = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r3 = 0
            r0.f7154c = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7155f = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.h(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L8c
            goto Lbc
        L8c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lb7
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.S0()     // Catch: java.util.concurrent.CancellationException -> L2e
            java.util.List r8 = r8.f15569a     // Catch: java.util.concurrent.CancellationException -> L2e
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L2e
            r11 = 0
        L9f:
            if (r11 >= r10) goto Lb3
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.b(r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r1 == 0) goto Lb0
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lb0:
            int r11 = r11 + 1
            goto L9f
        Lb3:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lba
        Lb7:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lba:
            d0.b0 r1 = d0.b0.f30125a
        Lbc:
            return r1
        Lbd:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.d(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:12:0x002a, B:13:0x008c, B:15:0x0094, B:17:0x00a1, B:19:0x00ad, B:21:0x00b0, B:24:0x00b3, B:28:0x00b7, B:32:0x003f, B:34:0x0062, B:36:0x0066, B:38:0x0070, B:43:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7 A[Catch: CancellationException -> 0x002e, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:12:0x002a, B:13:0x008c, B:15:0x0094, B:17:0x00a1, B:19:0x00ad, B:21:0x00b0, B:24:0x00b3, B:28:0x00b7, B:32:0x003f, B:34:0x0062, B:36:0x0066, B:38:0x0070, B:43:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, h0.g r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1) r0
            int r1 = r0.f7160f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7160f = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f7160f
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L46
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            androidx.compose.foundation.text.TextDragObserver r9 = r0.f7158b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.f7157a
            kotlin.jvm.internal.q.m(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L8c
        L2e:
            r8 = move-exception
            goto Lbd
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = r0.f7159c
            androidx.compose.foundation.text.TextDragObserver r9 = r0.f7158b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = r0.f7157a
            kotlin.jvm.internal.q.m(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L46:
            kotlin.jvm.internal.q.m(r11)
            java.util.List r10 = r10.f15569a     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r10 = e0.u.E0(r10)     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L2e
            long r5 = r10.f15589a     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7157a = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7158b = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7159c = r10     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7160f = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.c(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L62
            goto Lbc
        L62:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 == 0) goto Lba
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = g(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lba
            long r2 = r11.f15591c     // Catch: java.util.concurrent.CancellationException -> L2e
            r9.b(r2)     // Catch: java.util.concurrent.CancellationException -> L2e
            long r10 = r11.f15589a     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1     // Catch: java.util.concurrent.CancellationException -> L2e
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7157a = r8     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7158b = r9     // Catch: java.util.concurrent.CancellationException -> L2e
            r3 = 0
            r0.f7159c = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f7160f = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.h(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r11 != r1) goto L8c
            goto Lbc
        L8c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r10 == 0) goto Lb7
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.S0()     // Catch: java.util.concurrent.CancellationException -> L2e
            java.util.List r8 = r8.f15569a     // Catch: java.util.concurrent.CancellationException -> L2e
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L2e
            r11 = 0
        L9f:
            if (r11 >= r10) goto Lb3
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L2e
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.b(r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r1 == 0) goto Lb0
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lb0:
            int r11 = r11 + 1
            goto L9f
        Lb3:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lba
        Lb7:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lba:
            d0.b0 r1 = d0.b0.f30125a
        Lbc:
            return r1
        Lbd:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.e(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, h0.g):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da A[Catch: CancellationException -> 0x009e, TryCatch #1 {CancellationException -> 0x009e, blocks: (B:14:0x00d2, B:16:0x00da, B:18:0x00e7, B:20:0x00f3, B:22:0x00f6, B:25:0x00f9, B:29:0x00fd, B:41:0x0097, B:43:0x009b, B:44:0x00a0, B:46:0x00a6, B:48:0x00af, B:49:0x00b3, B:51:0x00b7, B:52:0x00bc, B:64:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd A[Catch: CancellationException -> 0x009e, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x009e, blocks: (B:14:0x00d2, B:16:0x00da, B:18:0x00e7, B:20:0x00f3, B:22:0x00f6, B:25:0x00f9, B:29:0x00fd, B:41:0x0097, B:43:0x009b, B:44:0x00a0, B:46:0x00a6, B:48:0x00af, B:49:0x00b3, B:51:0x00b7, B:52:0x00bc, B:64:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b A[Catch: CancellationException -> 0x009e, TryCatch #1 {CancellationException -> 0x009e, blocks: (B:14:0x00d2, B:16:0x00da, B:18:0x00e7, B:20:0x00f3, B:22:0x00f6, B:25:0x00f9, B:29:0x00fd, B:41:0x0097, B:43:0x009b, B:44:0x00a0, B:46:0x00a6, B:48:0x00af, B:49:0x00b3, B:51:0x00b7, B:52:0x00bc, B:64:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6 A[Catch: CancellationException -> 0x009e, TryCatch #1 {CancellationException -> 0x009e, blocks: (B:14:0x00d2, B:16:0x00da, B:18:0x00e7, B:20:0x00f3, B:22:0x00f6, B:25:0x00f9, B:29:0x00fd, B:41:0x0097, B:43:0x009b, B:44:0x00a0, B:46:0x00a6, B:48:0x00af, B:49:0x00b3, B:51:0x00b7, B:52:0x00bc, B:64:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.AwaitPointerEventScope r15, androidx.compose.foundation.text.TextDragObserver r16, androidx.compose.ui.input.pointer.PointerEvent r17, h0.g r18) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.f(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, h0.g):java.lang.Object");
    }

    public static final boolean g(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.e(Offset.j(pointerInputChange.f15591c, pointerInputChange2.f15591c)) < DragGestureDetectorKt.k(viewConfiguration, pointerInputChange.f15595i);
    }

    public static final boolean h(PointerEvent pointerEvent) {
        List list = pointerEvent.f15569a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!PointerType.a(((PointerInputChange) list.get(i2)).f15595i, 2)) {
                return false;
            }
        }
        return true;
    }

    public static final Modifier i(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver) {
        SelectionGesturesKt$selectionGestureInput$1 selectionGesturesKt$selectionGestureInput$1 = new SelectionGesturesKt$selectionGestureInput$1(mouseSelectionObserver, textDragObserver, null);
        PointerEvent pointerEvent = SuspendingPointerInputFilterKt.f15643a;
        return modifier.T0(new SuspendPointerInputElement(mouseSelectionObserver, textDragObserver, null, selectionGesturesKt$selectionGestureInput$1, 4));
    }

    public static final Object j(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, g gVar) {
        Object b2 = ForEachGestureKt.b(pointerInputScope, new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(textDragObserver, new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, null), gVar);
        return b2 == i0.a.f30806a ? b2 : b0.f30125a;
    }

    public static final Modifier k(Modifier modifier, l lVar) {
        return SuspendingPointerInputFilterKt.b(modifier, 8675309, new SelectionGesturesKt$updateSelectionTouchMode$1(lVar, null));
    }
}
