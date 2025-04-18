package androidx.compose.foundation.gestures;

import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1111}, m = "restartable")
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt$restartable$1<I> extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3028a;

    /* renamed from: b, reason: collision with root package name */
    public int f3029b;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3028a = obj;
        this.f3029b |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.b(null, null, this);
    }
}
