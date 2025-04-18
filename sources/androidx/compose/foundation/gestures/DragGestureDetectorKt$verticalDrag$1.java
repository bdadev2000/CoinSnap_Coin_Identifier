package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {973}, m = "verticalDrag-jO51t88")
/* loaded from: classes3.dex */
public final class DragGestureDetectorKt$verticalDrag$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public l f3286a;

    /* renamed from: b, reason: collision with root package name */
    public AwaitPointerEventScope f3287b;

    /* renamed from: c, reason: collision with root package name */
    public Orientation f3288c;
    public AwaitPointerEventScope d;

    /* renamed from: f, reason: collision with root package name */
    public e0 f3289f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3290g;

    /* renamed from: h, reason: collision with root package name */
    public int f3291h;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3290g = obj;
        this.f3291h |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.l(null, 0L, null, this);
    }
}
