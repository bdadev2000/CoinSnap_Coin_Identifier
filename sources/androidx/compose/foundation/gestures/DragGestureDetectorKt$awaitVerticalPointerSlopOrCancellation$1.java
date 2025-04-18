package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {972, 1014}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE")
/* loaded from: classes2.dex */
public final class DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public p f3213a;

    /* renamed from: b, reason: collision with root package name */
    public AwaitPointerEventScope f3214b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f3215c;
    public Object d;

    /* renamed from: f, reason: collision with root package name */
    public PointerInputChange f3216f;

    /* renamed from: g, reason: collision with root package name */
    public float f3217g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3218h;

    /* renamed from: i, reason: collision with root package name */
    public int f3219i;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3218h = obj;
        this.f3219i |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.e(null, 0L, 0, null, this);
    }
}
