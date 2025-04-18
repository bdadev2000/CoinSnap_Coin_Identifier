package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {108}, m = "drag-jO51t88")
/* loaded from: classes2.dex */
public final class DragGestureDetectorKt$drag$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f3270a;

    /* renamed from: b, reason: collision with root package name */
    public l f3271b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3272c;
    public int d;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3272c = obj;
        this.d |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.h(null, 0L, null, this);
    }
}
