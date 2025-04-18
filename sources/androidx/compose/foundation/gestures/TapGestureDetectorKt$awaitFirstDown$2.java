package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
/* loaded from: classes4.dex */
public final class TapGestureDetectorKt$awaitFirstDown$2 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f3511a;

    /* renamed from: b, reason: collision with root package name */
    public PointerEventPass f3512b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3513c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public int f3514f;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f3514f |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.b(null, false, null, this);
    }
}
