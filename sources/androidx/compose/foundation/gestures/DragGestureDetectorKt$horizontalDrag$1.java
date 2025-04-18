package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {973}, m = "horizontalDrag-jO51t88")
/* loaded from: classes4.dex */
public final class DragGestureDetectorKt$horizontalDrag$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public l f3280a;

    /* renamed from: b, reason: collision with root package name */
    public AwaitPointerEventScope f3281b;

    /* renamed from: c, reason: collision with root package name */
    public Orientation f3282c;
    public AwaitPointerEventScope d;

    /* renamed from: f, reason: collision with root package name */
    public e0 f3283f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3284g;

    /* renamed from: h, reason: collision with root package name */
    public int f3285h;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3284g = obj;
        this.f3285h |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.i(null, 0L, null, this);
    }
}
