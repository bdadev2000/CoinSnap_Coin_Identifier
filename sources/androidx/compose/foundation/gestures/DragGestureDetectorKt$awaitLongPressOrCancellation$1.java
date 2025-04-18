package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import j0.c;
import j0.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {898}, m = "awaitLongPressOrCancellation-rnUCldI")
/* loaded from: classes2.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public PointerInputChange f3195a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f3196b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3197c;
    public int d;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3197c = obj;
        this.d |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.c(null, 0L, this);
    }
}
