package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import j0.c;
import j0.e;
import kotlin.jvm.internal.e0;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {972, 1014}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
/* loaded from: classes2.dex */
public final class DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public p f3181a;

    /* renamed from: b, reason: collision with root package name */
    public AwaitPointerEventScope f3182b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f3183c;
    public Object d;

    /* renamed from: f, reason: collision with root package name */
    public PointerInputChange f3184f;

    /* renamed from: g, reason: collision with root package name */
    public float f3185g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3186h;

    /* renamed from: i, reason: collision with root package name */
    public int f3187i;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3186h = obj;
        this.f3187i |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.b(null, 0L, 0, null, this);
    }
}
