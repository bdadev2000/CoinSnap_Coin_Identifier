package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$waitForUpOrCancellation$2 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AwaitPointerEventScope f3579a;

    /* renamed from: b, reason: collision with root package name */
    public PointerEventPass f3580b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3581c;
    public int d;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3581c = obj;
        this.d |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.g(null, null, this);
    }
}
