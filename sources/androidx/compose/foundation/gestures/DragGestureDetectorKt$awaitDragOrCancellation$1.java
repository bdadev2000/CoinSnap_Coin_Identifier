package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {967}, m = "awaitDragOrCancellation-rnUCldI")
/* loaded from: classes4.dex */
public final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f3175a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f3176b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3177c;
    public int d;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3177c = obj;
        this.d |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.a(null, 0L, this);
    }
}
