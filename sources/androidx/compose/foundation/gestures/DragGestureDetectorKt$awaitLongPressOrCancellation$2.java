package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import kotlin.jvm.internal.f0;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {901, 918}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public PointerEvent f3198a;

    /* renamed from: b, reason: collision with root package name */
    public int f3199b;

    /* renamed from: c, reason: collision with root package name */
    public int f3200c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f3201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f3202g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(f0 f0Var, f0 f0Var2, g gVar) {
        super(gVar);
        this.f3201f = f0Var;
        this.f3202g = f0Var2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.f3201f, this.f3202g, gVar);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.d = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb A[EDGE_INSN: B:69:0x00cb->B:13:0x00cb BREAK  A[LOOP:0: B:7:0x00b8->B:10:0x00c8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ba  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ad -> B:6:0x00af). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
